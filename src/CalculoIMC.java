import javax.swing.JOptionPane;

public class CalculoIMC {

    public static void main(String[] args) {
        // solicita as informações ao usuário
        String sexo = JOptionPane.showInputDialog("Digite o sexo (M ou F):");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso (em kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (em metros):"));

        // cria uma nova instância da classe CalculoIMC
        CalculoIMC calculo = new CalculoIMC();

        // calcula o IMC
        double imc = calculo.calcularIMC(peso, altura);

        // exibe o resultado do cálculo
        JOptionPane.showMessageDialog(null, "IMC: " + imc + "\nClassificação: " + calculo.classificarIMC(imc, sexo));
    }

    // método para calcular o IMC
    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // método para classificar o IMC
    public String classificarIMC(double imc, String sexo) {
        String classificacao = "";
        if (sexo.equalsIgnoreCase("M")) {
            if (imc < 20.7) {
                classificacao = "Abaixo do peso";
            } else if (imc >= 20.7 && imc <= 26.4) {
                classificacao = "Peso normal";
            } else if (imc > 26.4 && imc <= 27.8) {
                classificacao = "Marginalmente acima do peso";
            } else if (imc > 27.8 && imc <= 31.1) {
                classificacao = "Acima do peso ideal";
            } else {
                classificacao = "Obeso";
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (imc < 19.1) {
                classificacao = "Abaixo do peso";
            } else if (imc >= 19.1 && imc <= 25.8) {
                classificacao = "Peso normal";
            } else if (imc > 25.8 && imc <= 27.3) {
                classificacao = "Marginalmente acima do peso";
            } else if (imc > 27.3 && imc <= 32.3) {
                classificacao = "Acima do peso ideal";
            } else {
                classificacao = "Obeso";
            }
        }
        return classificacao;
    }
}
