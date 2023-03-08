function calcular() {
    var altura = document.getElementById("altura").value;
    var peso = document.getElementById("peso").value;
    var resultado;
    if (validarCampos()) {
        resultado = peso / (altura ** 2);

    }

}

function validarCampos() {
    var altura = document.getElementById("altura");
    var peso = document.getElementById("peso");

}