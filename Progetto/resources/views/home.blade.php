<!DOCTYPE html>
<?php
$servername = "localhost";
$username = "romae";
$password = "1234";
$dbname = "myDB";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("connessione non effettuata: " . $conn->connect_error);
}
if ($_SERVER['REQUEST_METHOD'] === 'GET') {
    $sql = "SELECT * FROM flist";
    $result = $conn->query($sql);
    if ($result->num_rows > 0) {
        $result->data_seek(rand(0, $result->num_rows - 1));
        $row = $result->fetch_assoc();
        $titolo_preso_casualmente = $row['titolo'];
        $regista_preso_casualmente = $row['regista'];
        print "<h1>film consigliato:</h1><br>$titolo_preso_casualmente";
        if ($regista_preso_casualmente != "") {
            print "($regista_preso_casualmente)";
            print "<br>";
        }
    }
    ?><br><br>
    <form action="/home" method="POST">
    @csrf
    <input type ="text" name="titolo">
    <input type ="text" name="regista">
    <input type ="submit" name="trova" value="trova">
</form>
<?php
}
else{
    if(isset($_POST['trova']))
    {
        $titolo = $_POST['titolo'];
        $regista = $_POST['regista'];
        if($titolo == "" && $regista==""){
            print "<br><br><h1>Inserire almeno un criterio di ricerca</h1><br>";
            print '<br><a href="home">torna indietro</a>';
        }else{
            $sql = "SELECT * FROM flist WHERE ";
            if($titolo != ""){
                $sql .= $titolo;
            }else{
                $sql .= $regista;
            }
        }
    }
}
?>

<?php 

?>
</html>