import java.time.LocalDate
import java.util.Arrays
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {

//Respostas
    q100()

}
//Questões
//----------------------------
//Q2
//) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
//Ex:
//Qual é o seu nome? João da Silva
//Olá João da Silva, é um prazer te conhecer
fun q2() {
    println("Qual o seu nome?")
    var nomeUsuario = readln()
    println("Olá $nomeUsuario, é um prazer te conhecer")
}
//----------------------------
//Q3
//3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
//final uma mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo
//Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho
fun q3() {
    println("Nome:")
    var nomeFuncionario = readln()
    println("Salario")
    var salarioFuncionario = readln().toDouble()
    println("O funcionário $nomeFuncionario tem um salário de $salarioFuncionario")
}
//----------------------------
//Q4
//4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.
fun q4() {
    println("Digite um valor:")
    var valor1 = readln().toDouble()
    println("Digite outro valor:")
    var valor2 = readln().toDouble()

    println("A soma entre $valor1 e $valor2 é igual a ${valor1 + valor2}")
}
//----------------------------
//Q5
//5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
//na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5
fun q5() {
    println("nota 1:")
    var nota1 = readln().toDouble()
    println("nota 2:")
    var nota2 = readln().toDouble()

    println("A média entre $nota1 e $nota2 é igual a ${(nota1 + nota2)/2}")
}
//----------------------------
//Q6
//6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10
fun q6() {
    println("Digite um número inteiro:")
    var numero1 = readln().toInt()

    println("O antecessor de $numero1 é ${numero1 - 1}")
    println("O sucessor de $numero1 é ${numero1 + 1}")
}
//----------------------------
//Q7
//7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666
fun q7() {
    println("Digite um número:")
    var numero = readln().toDouble()

    var formataCasasDecimais = "%.5f"

    println("O dobro de $numero é ${numero * 2}")
    println("A terça parte de $numero é ${formataCasasDecimais.format(numero/3)}")
}
//----------------------------
//Q8
//8) Desenvolva um programa que leia uma distância em metros e mostre os valores
//relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 185.72
//A distância de 85.7m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//1857.2dm
//18572.0cm
//185720.0mm
fun q8() {
    println("Digite uma distânica em metros:")
    var distanciaEmMetros = readln().toDouble()
    println("A distância de ${distanciaEmMetros}m corresponde a:")

    var distanciaEmKilometros = distanciaEmMetros / 10000

    for (i in 1..7) {
        distanciaEmKilometros = distanciaEmKilometros * 10
        println(distanciaEmKilometros)
    }
}
//----------------------------
//Q9
//9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
//e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
fun q9() {
    println("Dinheiro em real:")
    var real = readln().toDouble()

    println("Se você tem R$ ${real} reais, então tem US$ ${"%.2f".format(real/4.85)} Dolares")
}
//Q10
//10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
fun q10() {
    print("Digite altura:")
    var altura: Double = readln().toDouble()
    print("Digite largura:")
    var largura:Double = readln().toDouble()

    var areaTotal:Double = altura * largura

    println("A area total corresponde a $areaTotal e será necessário ${areaTotal / 2}L de tinta, sabendo que " +
            "cada litro de tinta pinta uma área de 2metros quadrados")

}
//Q11
//11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
//segundo grau e mostre o valor de Delta.
fun q11() {
    println("Quação do segundo grau")
    println("valor de A:")
    var valorDeA = readln().toDouble()
    println("valor de B:")
    var valorDeB = readln().toDouble()
    println("valor de C:")
    var valorDeC = readln().toDouble()

    var delta = (Math.pow(valorDeB, 2.0) - (4*valorDeA*valorDeC))

    if (delta < 0.0){
        println("A equação não possui solução real.")
    } else if (delta > 0.0) {
        println("A equação possui duas soluções reais.")
        var x1 = (-(valorDeB) + Math.sqrt(delta)) / 2 * valorDeA
        var x2 = (-(valorDeB) - Math.sqrt(delta)) / 2 * valorDeA

        println("x1 = $x1, x2 = $x2")

    } else if (delta == 0.0){
        println("A equação possui uma solução real.")
        var x1 = (-(valorDeB) / 2 * valorDeA)

        println("x = $x1")

    }
}
//Q12
//12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
//PREÇO PROMOCIONAL, com 5% de desconto
fun q12() {
    print("Escreva o valor do produto:")
    var valorInicial = readln().toDouble()
    var valorComDesconto = valorInicial * (1 - 0.05)

    println("$valorInicial com 5% de desconto: $valorComDesconto")
}
//Q13
//13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.
fun q13() {
    print("Salario:")
    var salarioInicial = readln().toDouble()
    var salarioComAlmento = salarioInicial * (1 + 0.15)

    print("$salarioInicial com almento de 15%: $salarioComAlmento")
}
//Q14
//14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
//um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
//quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado
fun q14() {
    println("Quantos km foram percorridos com o carro?")
    var kmPercorridos = readln().toDouble()
    println("Quantos dias passou com o carro?")
    var qtdDiasAlugados = readln().toDouble()

    var totalPagamento = (qtdDiasAlugados * 90) + (kmPercorridos * 0.20)

    println("O aluguel custou o tatal de: R$$totalPagamento")
}
//Q15
//15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
//por hora trabalhada.
fun q15() {
    print("Dias trabalhados durante esse mês:")
    var diasTrabalhados = readln().toInt()
    var salarioFinal = diasTrabalhados * (25*8)

    print("Seu salario do mes é igual a: R$$salarioFinal")
}
//Q16 [DESAFIO]
//16) Escreva um programa para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.
fun q16() {
    println("Em média, quantos cigarros são fumados por dia?")
    var cigarrosPorDia = readln().toInt()
    println("A quantos anos você fuma?")
    var anosFumados = readln().toInt()
    var minutosReduzidos:Int = (cigarrosPorDia * 10) * (anosFumados * 360)

    var diasPerdidos = minutosReduzidos / (24 * 60)

    println("Um fumante que fuma $cigarrosPorDia cigarros por dia, perderá em " +
            "média $diasPerdidos dias de vida")

}
//PASSO 02 - CONDIÇÕES BÁSICAS
//Q17
//17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
fun q17() {
    println("Km por hora:")
    var kmPorHora = readln().toInt()

    if (kmPorHora > 80) {
        println("Multado, valor da multa: R$${(kmPorHora - 80) * 5}")
    } else {
        println("Velocidade permitida.")
    }
}
//Q18
//18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar
fun q18() {
    print("Ano de nascimento:")
    var anoDeNascimento = readln().toInt()
    var idade = LocalDate.now().year  - anoDeNascimento

    if (idade < 18) {
        println("Você tem $idade anos de idade e não pode votar")
    } else {
        println("Você tem $idade anos de idade e pode votar")
    }
}
//Q19
//19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).
fun q19() {
    print("Nota 1:")
    var nota1 = readln().toDouble()
    print("Nota 2:")
    var nota2 = readln().toDouble()

    var media = (nota1 + nota2)/2

    if (media < 7.0) {
        print("Media $media, não teve um bom aproveitamento")
    } else {
        print("Média $media bom aproveitamento")
    }
}
//Q20
//20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
//ÍMPAR.
fun q20() {
    print("Numero inteiro:")
    var numero = readln().toInt()

    if ((numero % 2)==0){
        print("Numero par")
    } else {
        print("Numero impar")
    }
}
//Q21
//21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//BISSEXTO
fun q21() {
    print("Ano:")
    var ano = readln().toInt()

    if (ano % 4 == 0) {
        print("Ano bissexto")
    } else {
        print("Ano não bissexto")
    }
}
//Q22
//22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar.
//- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento.
//- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//alistamento.
fun q22() {
    print("Ano de nascimento:")
    var anoDeNascimento = readln().toInt()
    var anoAtual = LocalDate.now().year

    if (anoAtual - anoDeNascimento < 18) {
        print("Você tem ${anoAtual - anoDeNascimento} anos, faltam ${18 - (anoAtual - anoDeNascimento)} para você pode se alistar")
    } else if (anoAtual - anoDeNascimento == 18) {
        print("Você tem ${anoAtual - anoDeNascimento} anos, está na idade do alistamento")
    } else {
        print("Você tem ${anoAtual - anoDeNascimento} anos, Se passaram ${(anoAtual - anoDeNascimento) - 18} anos desde o ano de alistamento")
    }
}
//Q23
//23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//que:
//- Homens ganham 5% de desconto
//- Mulheres ganham 13% de desconto
fun q23() {
    print("Nome:")
    var nome = readln()
    print("Sexo:")
    var sexo = readln()[0].lowercase()
//    var primeiroCaracter = sexo[0]
    print("Valor das compras:")
    var valorDasCompras = readln().toDouble()

    if (sexo == "f") {
        print("13% de desconto, valor a ser pago pela compra:${valorDasCompras * (1 - 0.13)}")
    } else if(sexo == "m") {
        print("5% de desconto, valor a ser pago pela compra:${"%.2f".format(valorDasCompras * (1 - 0.05))}")
    } else {
        print("sexo invalido")
    }
}
//Q24
//24) Faça um algoritmo que pergunte a distância que um passageiro deseja
//percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
//viagens até 200Km e R$0.45 para viagens mais longas
fun q24() {
    print("Distância em km:")
    var distanciaEmKm = readln().toDouble()

    if (distanciaEmKm <= 200) {
        print("Sua viagem irá custar R$${distanciaEmKm * 0.50} reais")
    } else {
        print("Sua viagem irá custar R$${distanciaEmKm * 0.45} reais")
    }
}
//Q25 [DESAFIO]
//25) Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas
//retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
//de cada lado deve ser menor que a soma dos outros dois
fun q25() {
    print("Lado A:")
    var ladoA = readln().toDouble()
    print("Lado B:")
    var ladoB = readln().toDouble()
    print("Lado C:")
    var ladoC = readln().toDouble()

    if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
        print("Os seguimentos de reta podem formar um triangulo")
    } else {
        print("Os seguimentos de reta não podem formar um triangulo")
    }
}
//PASSO 03 - CONDIÇÕES COMPOSTAS
//Q26
//26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
//- O primeiro valor é o maior
//- O segundo valor é o maior
//- Não existe valor maior, os dois são iguais
fun q26() {
    print("valor 1:")
    var valor1 = readln().toDouble()
    print("valor 2:")
    var valor2 = readln().toDouble()

    if (valor1 > valor2) {
        print("valor 1 maior ")
    } else if (valor2 > valor1) {
        print("valor 2 maior")
    } else if (valor1 == valor2) {
        print("valores iguais")
    }
}
//Q27
//27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
//mostrando uma mensagem no final, de acordo com a média atingida:
//- Média até 4.9: REPROVADO
//- Média entre 5.0 e 6.9: RECUPERAÇÃO
//- Média 7.0 ou superior: APROVADO
fun q27() {
    print("Nota 1:")
    var nota1 = readln().toDouble()
    print("Nota 2:")
    var nota2 = readln().toDouble()

    var media = (nota1 + nota2)/2

    if (media < 5) {
        print("REPROVADO")
    } else if (media > 4.9 && media < 7) {
        print("RECUPERAÇÃO")
    } else {
        print("APROVADO")
    }
}
//Q28
//28) Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m². O programa também
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
//- Abaixo de 100m² = TERRENO POPULAR
//- Entre 100m² e 500m² = TERRENO MASTER
//- Acima de 500m² = TERRENO VIP
fun q28() {
    print("Largura do terreno:")
    var largura = readln().toDouble()
    print("Comprimento do terreno:")
    var comprimento = readln().toDouble()

    var areaTerreno = largura * comprimento

    println("Seu terreno possui ${"%.2f".format(areaTerreno)}m²")

    if (areaTerreno < 100) {
        print("Terreno popular")
    } else if (areaTerreno > 99 && areaTerreno < 501){
        print("Terreno master")
    } else {
        print("Terreno VIP")
    }
}
//Q29
//29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
// - Até 3 anos de empresa: aumento de 3%
// - entre 3 e 10 anos: aumento de 12.5%
// - 10 anos ou mais: aumento de 20%
fun q29(){
    print("Nome:")
    var nome = readln()
    print("salario atual:")
    var salario = readln().toDouble()
    print("Anos de empresa:")
    var anosDeEmpresa = readln().toInt()

    if (anosDeEmpresa < 3) {
        print("$nome, com ajuste de 3% seu salario passa a ser: ${salario * (1 + 0.03)}")
    } else if (anosDeEmpresa >= 3 && anosDeEmpresa < 9 ){
        print("$nome,com ajuste de 12.5% seu salario passa a ser: ${salario * (1 + 0.125)}")
    } else if (anosDeEmpresa >= 10) {
        print("$nome,com ajuste de 20% seu salario passa a ser: ${salario * (1 + 0.2)}")
    }
}
//Q30 [DESAFIO]
//30) Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
//de triângulo será formado:
// - EQUILÁTERO: todos os lados iguais
// - ISÓSCELES: dois lados iguais
// - ESCALENO: todos os lados diferentes
fun q30() {
    print("Lado A:")
    var ladoA = readln().toDouble()
    print("Lado B:")
    var ladoB = readln().toDouble()
    print("Lado C:")
    var ladoC = readln().toDouble()

    if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
        print("Os seguimentos de reta podem formar um triangulo, ")

        if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
            print("EQUILÁTERO: todos os lados iguais")
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            print("ISÓSCELES: dois lados iguais")
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            print("ESCALENO: todos os lados diferentes")
        }
    } else {
        print("Os seguimentos de reta não podem formar um triangulo")
    }
}
//Q31 [DESAFIO]
//31) Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
fun q31() {
    println("*--------JOKENPO--------*")
    println("ESCOLHA ENTRE AS OPÇÕES DE 1 a 3:")

    println("[1] - PEDRA")
    println("[2] - PAPEL")
    println("[3] - TESOURA")
    var opcaoJogador = readln().toInt()

    fun sorteadorDeopcoes(): String {
        var intervalo = 0..2
        var numeroAleatorio = intervalo.random()
        var joKenPo = arrayOf("PEDRA","PAPEL","TESOURA")
        return joKenPo[numeroAleatorio]
    }

    var opcaoOponente = sorteadorDeopcoes()

    if (opcaoJogador == 1) {
        if (opcaoOponente == "PEDRA"){
            println("Seu oponente também escolheu: PEDRA")
            println("EMPATOU")
        } else if (opcaoOponente == "PAPEL"){
            println("Seu oponente escolheu: PAPEL")
            println("VOCÊ PERDEU")
        } else if (opcaoOponente == "TESOURA") {
            println("Seu oponente escolheu: TESOURA")
            println("VOCÊ VENCEU")
        }
    } else if (opcaoJogador == 2) {
        if (opcaoOponente == "PEDRA"){
            println("Seu oponente escolheu: PEDRA")
            println("VOCÊ VENCEU")
        } else if (opcaoOponente == "PAPEL"){
            println("Seu oponente também escolheu: PAPEL")
            println("EMPATOU")
        } else if (opcaoOponente == "TESOURA") {
            println("Seu oponente escolheu: TESOURA")
            println("VOCÊ PERDEU")
        }
    } else if (opcaoJogador == 3){
        if (opcaoOponente == "PEDRA"){
            println("Seu oponente escolheu: PEDRA")
            println("VOCÊ PERDEU")
        } else if (opcaoOponente == "PAPEL"){
            println("Seu oponente escolheu: PAPEL")
            println("VOCÊ VENCEU")
        } else if (opcaoOponente == "TESOURA") {
            println("Seu oponente também escolheu: TESOURA")
            println("EMPATOU")
        }
    }
}
//Q32
//32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
//jogador vai tentar descobrir qual foi o valor sorteado
fun q32() {
    fun sorteadora(): Int {
        var intervalo = 1..5
        var numeroSorteado = intervalo.random()
        return numeroSorteado
    }

    var numeroSorteado = sorteadora()

    println("Numero de 1 a 5:")
    var palpite = readln().toInt()

    println("O Número sorteado foi $numeroSorteado")

    if (palpite == numeroSorteado){
        print("ACERTOU!")
    } else {
        print("ERROU")
    }
}
//Q33
//33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
//de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
//em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
//ela não pode exceder 30% do salário ou então o empréstimo será negado.
fun q33() {
    print("VALOR DA CASA:")
    var valorDaCasa = readln().toDouble()
    print("SALARIO:")
    var salario = readln().toDouble()
    print("Nº DE PRESTAÇÕES:")
    var prestações = readln().toInt()

    if ((valorDaCasa / prestações) > (salario * 0.3)){
        println("NÃO APROVADO")
    } else {
        println("APROVADO")
    }
}
//Q34
//34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
//peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
//indivíduo dentro de certas faixas.
// - abaixo de 18.5: Abaixo do peso
// - entre 18.5 e 25: Peso ideal
// - entre 25 e 30: Sobrepeso
// - entre 30 e 40: Obesidade
// - acima de 40: Obseidade mórbida
//Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
//da altura)
fun q34(){
    println("PESO(Kg):")
    var peso = readln().toDouble()
    println("ALTURA(m):")
    var altura = readln().toDouble()

    var imc = peso / (altura * altura)
    println("Seu IMC: ${"%.2f".format(imc)}")

    if (imc < 18.5){
        println("Abaixo do peso")
    } else if (imc >= 18.5 && imc < 25) {
        println("Peso ideal")
    } else if (imc >= 25 && imc < 30) {
        println("Sobrepeso")
    } else if (imc >= 30 && imc < 40) {
        println("Obesidade")
    } else if (imc >= 40 ) {
        print("Obseidade mórbida")
    }
}
//Q35
//35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
//aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
//carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
//que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
//quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
//tabela a seguir:
// - Carros populares (aluguel de R$90 por dia)
// - Até 100Km percorridos: R$0,20 por Km
// - Acima de 100Km percorridos: R$0,10 por Km
// - Carros de luxo (aluguel de R$150 por dia)
// - Até 200Km percorridos: R$0,30 por Km
// - Acima de 200Km percorridos: R$0,25 por Km
fun q35() {
    println("Tipo de carro:")
    println("[1] popular")
    println("[2] luxo")
    var tipoCarro = readln().toInt()

    println("Dias alugados:")
    var diasAlugados = readln().toInt()

    println("Km percorridos:")
    var kmPercorridos = readln().toInt()

    println("Valor a ser pago pelo aluguel:")

    if (tipoCarro == 1) {
        if (kmPercorridos < 100) {
            println("R$${(diasAlugados * 90) + (kmPercorridos * 0.20)} reais")
        } else if (kmPercorridos >= 100) {
            println("R$${(diasAlugados * 90) + (kmPercorridos * 0.20)} reais")
        }
    } else if(tipoCarro == 2) {
        if (kmPercorridos < 200) {
            println("R$${(diasAlugados * 150) + (kmPercorridos * 0.30)} reais")
        } else if (kmPercorridos >= 200) {
            println("R$${(diasAlugados * 150) + (kmPercorridos * 0.25)} reais")
        }
    }
}
//Q36
//36) Um programa de vida saudável quer dar pontos atividades físicas que podem
//ser trocados por dinheiro. O sistema funciona assim:
// - Cada hora de atividade física no mês vale pontos
// - até 10h de atividade no mês: ganha 2 pontos por hora
// - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
// - acima de 20h de atividade no mês: ganha 10 pontos por hora
// - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
//Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
//calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
fun q36() {
    print("Horas/Mês atividade física:")
    var horasContabilizadas = readln().toInt()

    if (horasContabilizadas < 10) {
        println("Você acumulou ${horasContabilizadas * 2} pontos")
        println("Ganhou R$${(horasContabilizadas * 2) * 0.05 } reais")
    } else if (horasContabilizadas >= 10 && horasContabilizadas <= 20) {
        println("Você acumulou ${horasContabilizadas * 5} pontos")
        println("Ganhou R$${(horasContabilizadas * 5) * 0.05 } reais")
    } else if (horasContabilizadas > 20) {
        println("Você acumulou ${horasContabilizadas * 10} pontos")
        println("Ganhou R$${(horasContabilizadas * 10) * 0.05 } reais")
    }
}
//Q37
//37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
//aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
//o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
//No final, mostre o seu novo salário, baseado na tabela a seguir:
//- Mulheres
// - menos de 15 anos de empresa: +5%
// - de 15 até 20 anos de empresa: +12%
// - mais de 20 anos de empresa: +23%
//- Homens
// - menos de 20 anos de empresa: +3%
// - de 20 até 30 anos de empresa: +13%
// - mais de 30 anos de empresa: +25%
fun q37() {
    println("Salario atual:")
    var salario = readln().toDouble()

    println("Anos de empresa")
    var anosDeEmpresa = readln().toInt()

    println("Genero")
    var genero = readln()[0].lowercase()

    if (genero == "m") {
        if (anosDeEmpresa < 20) {
            println("Novo salario: R$${salario * (1 + 0.03)} reais")
        } else if (anosDeEmpresa >= 20 && anosDeEmpresa < 30) {
            println("Novo salario: R$${salario * (1 + 0.13)} reais")
        } else if (anosDeEmpresa >= 30){
            println("Novo salario: R$${salario * (1 + 0.25)} reais")
        }
    } else if (genero == "f") {
        if (anosDeEmpresa < 15) {
            println("Novo salario: R$${salario * (1 + 0.05)} reais")
        } else if (anosDeEmpresa >= 15 && anosDeEmpresa < 20) {
            println("Novo salario: R$${salario * (1 + 0.12)} reais")
        } else if (anosDeEmpresa >= 20){
            println("Novo salario: R$${salario * (1 + 0.23)} reais")
        }
    }
}
//PASSO 04 – REPETIÇÕES ENQUANTO
//Q38
//38) Escreva um programa que mostre na tela a seguinte contagem:
//6 7 8 9 10 11 Acabou!
fun q38() {
    var array = arrayOf(6,7,8,9,10,11)

    for (i in array) {
        println(i)
    }
}
//Q39
//39) Faça um algoritmo que mostre na tela a seguinte contagem:
//10 9 8 7 6 5 4 3 Acabou!
fun q39() {
    var i = 10
    while (i >= 3) {
        println(i)
        i--
    }
}
//Q40
//40) Crie um aplicativo que mostre na tela a seguinte contagem:
//0 3 6 9 12 15 18 Acabou!
fun q40() {
    var i = 0
    while (i <= 18) {
        println(i)
        i = i + 3
    }
}
//Q41
//41) Desenvolva um programa que mostre na tela a seguinte contagem:
//100 95 90 85 80 ... 0 Acabou!
fun q41() {
    for (i in 100 downTo 0 step 5) println(i)
}
//Q42
//42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
//qualquer e mostre uma contagem até esse valor:
//Ex: Digite um valor: 35
//Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
fun q42() {
    print("Inteiro positivo:")
    var numero = readln().toInt()

    for (i in 1..numero) println(i)
}
//Q43
//43) Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
//marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
//30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
fun q43() {
    for (i in 30 downTo 1) {
        if (i % 4 == 0) println("[$i]")
        else println(i)
    }
}
//Q44
//44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
//incremento, mostrando em seguida todos os valores no intervalo:
//Ex: Digite o primeiro Valor: 3
//Digite o último Valor: 10
//Digite o incremento: 2
//Contagem: 3 5 7 9 Acabou!
fun q44() {
    print("valor inicial:")
    var inicial = readln().toInt()
    print("valor final:")
    var final = readln().toInt()
    print("valor incremento:")
    var incremento = readln().toInt()

    for (i in inicial..final step incremento) println(i)
}
//Q45
//45) O programa acima vai ter um problema quando digitarmos o primeiro valor
//maior que o último. Resolva esse problema com um código que funcione em qualquer
//situação.
fun q45() {
    print("valor inicial:")
    var inicial = readln().toInt()
    print("valor final:")
    var final = readln().toInt()
    print("valor incremento:")
    var incremento = readln().toInt()

    if (inicial < final) for (i in inicial..final step incremento) println(i)
    else for (i in inicial downTo  final step incremento) println(i)
}
//Q46
//46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
//8 + 10 + 12 + 14 + ... + 98 + 100.
fun q46() {
//    interpretação 1:
//    for (i in 6..100 step 2) {
//        var numero = 6 + i
//        print("$numero = ")
//        println("6 + $i")
//    }

//    interpretação 2:
    var numero = 6

    for (i in 8..100 step 2) numero = numero + i

    println(numero)
}
//Q47
//47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
//450 + 400 + 350 + 300 + ... + 50 + 0
fun q47() {
    var numero = 500

    for (i in 450 downTo 0 step 5) numero = numero + i

    println(numero)
}
//Q48
//48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
//entre eles.
fun q48() {
    var numeros = mutableListOf<Int>()

    for (i in 1..7){
        print("Digite o ${i}º numero:")
        var numero = readln().toInt()
        numeros.add(numero)
    }

    println(numeros)
    var somatorio = numeros[0]

    for (i in 1..6){
        somatorio = somatorio + numeros[i]
    }

    println(somatorio)
}
//Q49
//49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
//são pares e quantos são ímpares.
fun q49(){
    var numeros = mutableListOf<Int>()

    for (i in 1..6){
        print("${i}º numero:")
        var numero = readln().toInt()

        numeros.add(numero)
    }

    println(numeros)
    var impares = 0
    var pares = 0

    for (i in 0..5){
        if (numeros[i] % 2 == 0){
            println("${numeros[i]}: PAR")
            pares++

        } else {
            println("${numeros[i]}: IMPAR")
            impares++
        }
    }

    println("$pares numeros são PAR e $impares numeros são IMPAR")
}
//Q50
//50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
//mostre na tela:
//a) Quais foram os números sorteados
//b) Quantos números estão acima de 5
//c) Quantos números são divisíveis por 3
fun q50() {
    fun sorteiaNumero(): Int {
        var intervalo = 0..10
        var numeroAleatorio = intervalo.random()
        return numeroAleatorio
    }

    var listaDeNumeros = mutableListOf<Int>()
    var maioresQue5 = mutableListOf<Int>()
    var divisiveisPor3 = mutableListOf<Int>()

    for (i in 0..19){
        listaDeNumeros.add(sorteiaNumero())
        if (listaDeNumeros[i] > 5) {
            maioresQue5.add(listaDeNumeros[i])
        }
        if (listaDeNumeros[i] % 3 ==0){
            divisiveisPor3.add(listaDeNumeros[i])
        }
    }

    println("Numeros sorteados: ${listaDeNumeros}")
    println("Maiores que 5: $maioresQue5")
    println("Divisiveis por 3: $divisiveisPor3")
}
//Q51
//51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
//qual foi o maior e qual foi o menor preço digitados.
fun q51() {
    var valorProdutos = mutableListOf<Double>()

    for (i in 0..7) {
        print("Produto ${i+1}: ")
        var valor = readln().toDouble()
        valorProdutos.add(valor)
    }

    println("Preços dos produtos: $valorProdutos")

    var maiorPreco:Double = valorProdutos.max()
    var menorPreco:Double = valorProdutos.min()

//    var maiorPreco:Double = valorProdutos[0]
//    var menorPreco:Double = valorProdutos[0]
//
//    for (i in 0..7){
//        if (maiorPreco > valorProdutos[i]) maiorPreco = valorProdutos[i]
//        if (menorPreco < valorProdutos[i]) menorPreco = valorProdutos[i]
//    }

    println("Maior valor: $maiorPreco")
    println("Menor valor: $menorPreco")
}
//Q52
//52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
//a) Qual é a média de idade do grupo
//b) Quantas pessoas tem mais de 18 anos
//c) Quantas pessoas tem menos de 5 anos
//d) Qual foi a maior idade lida
fun q52(){
    var idades = mutableListOf<Int>()
    var maior18 = 0
    var menor5 = 0

    for (i in 0..4){
        print("Idade ${i+1}º pessoa: ")
        var idade = readln().toInt()
        idades.add(idade)

        if (idade >= 18) maior18++
        if (idade < 5) menor5++
    }

    println("Idades: $idades")

    var somaDosValores = idades.sum()
    var tamanho = idades.size
    var media = somaDosValores / tamanho

    println("Média de idades: $media")
    println("Maiores de idade: $maior18")
    println("Menores de 5 anos: $menor5")
    println("Maior idade capturada: ${idades.max()}")
}
//Q53
//53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
//a) Quantos homens foram cadastrados
//b) Quantas mulheres foram cadastradas
//c) A média de idade do grupo
//d) A média de idade dos homens
//e) Quantas mulheres tem mais de 20 anos
fun q53(){
    var idades = mutableListOf<Int>()
//    var somaIdades = idades.sum()
//    var quantidade = idades.size
    var sexoMasculino = mutableListOf<Int>()
    var sexoFeminino = mutableListOf<Int>()
    var feminino20 = 0

    for (i in 1..5) {
        print("Idade ${i}: ")
        var idade = readln().toInt()
        idades.add(idade)

        print("Sexo:")
        var sexo = readln()

        if (sexo[0].lowercase() == "m") sexoMasculino.add(idade)
        if (sexo[0].lowercase() == "f") sexoFeminino.add(idade)
    }

    for (i in sexoFeminino){
        if (i > 20) feminino20++
    }

    println("Homes cadastrados ${sexoMasculino.size}")
    println("Mulheres cadastradas ${sexoFeminino.size}")
    println("Média de idade do grupo ${idades.sum()/idades.size}")
    println("Média de idades dos homens ${sexoMasculino.sum()/sexoMasculino.size}")
    println("Mulheres com mais de 20 anos: $feminino20")
}
//Q54
//54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
//no final:
//a) Qual foi a média de altura do grupo
//b) Quantas pessoas pesam mais de 90Kg
//c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
fun q54() {
    var allPesos = mutableListOf<Double>()
    var allAlturas = mutableListOf<Int>()
    var maisDe90 = 0
    var menorDe50 = 0
    var pesoPesado = 0

    for (i in 1..7){
        print("Peso ${i}º pessoa : ")
        var peso = readln().toDouble()
        allPesos.add(peso)

        print("Altura ${i}º pessoa :")
        var altura = readln().toInt()
        allAlturas.add(altura)

        if (peso > 90) maisDe90++

        if (peso < 50 && altura < 160) menorDe50++

        if (altura > 190 && peso > 100) pesoPesado++
    }

    println("Qual foi a média de altura do grupo: ${allAlturas.sum()/allAlturas.size}")
    println("Quantas pessoas pesam mais de 90Kg: $maisDe90")
    println("Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m: $menorDe50")
    println("Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg: $pesoPesado")
}
//Q55 [DESAFIO]
//55) Vamos melhorar o jogo que fizemos no exercício 32. A partir de
//agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
//tentativas para tentar acertar.
fun q55() {
    fun sorteiaNumero():Int {
        var intervalo = 1..10
        var numeroSorteado = intervalo.random()

        return numeroSorteado
    }

    var numeroSecreto = sorteiaNumero()

    for (i in 1..4){
        print("${i}º palpite: ")
        var palpite = readln().toInt()

        if (palpite == numeroSecreto) {
            println("ACERTOU!")
            break
        }
        else println("ERROU, restam ${4-i} tentativas")
    }
    println("Numero sorteado $numeroSecreto")
}
//PASSO 05 – ENQUANTO COM FLAG
//Q56
//56) Crie um programa que leia vários números pelo teclado e mostre no final o
//somatório entre eles.
//Obs: O programa será interrompido quando o número 1111 for digitado
fun q56() {
    var controle = 0
    var numeros = mutableListOf<Int>()
    do {
        print("Digite um numero:")
        var numero = readln().toInt()
        numeros.add(numero)

        if (numero == 1111) {
            controle = 1
        }
    }while (controle == 0)
    println("Soma dos numeros digitados: ${numeros.sum() - 1111}")
}
//Q57
//57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
//No final, mostre o total de salários pagos aos homens e o total pago às
//mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
//sempre que ler os dados de um funcionário.
fun q57() {
    var controle = true
    var contador = 1

    class Funcionario(var salario:Double, var sexo: String)

    var funcionarios = mutableListOf<Funcionario>()
    var salarioHomens = mutableListOf<Double>()
    var salarioMulheres = mutableListOf<Double>()

    do {
        print("Salario ${contador}º Funcionario:")
        var salario = readln().toDouble()
        print("Sexo do ${contador}º funcionario")
        var sexo = readln()[0].lowercase()

        funcionarios.add(Funcionario(salario, sexo))

        if (sexo == "m") salarioHomens.add(salario)
        if (sexo == "f") salarioMulheres.add(salario)

        print("continuar adicionando funcionario?")
        var simOuNao = readln()[0].lowercase()
        if (simOuNao == "n"){
            controle = false
        }

        contador++
    }while (controle)

//    println("lista completa:")
//    println(funcionarios)

    println("Total de salários pagos aos homens: ${salarioHomens.sum()}")
    println("Total de salários pagos as mulheres: ${salarioMulheres.sum()}")
}
//Q58
//58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
//vai parar quando for digitada a idade 999. No final, mostre quantos alunos
//existem na turma e qual é a média de idade do grupo.
fun q58() {
    var controle = true
    var contador = 1

    var idadeTurma = mutableListOf<Int>()

    do {
        println("Idade aluno ${contador}")
        var idadeAluno = readln().toInt()
        idadeTurma.add(idadeAluno)

        if (idadeAluno == 999)controle = false

        contador++
    } while (controle)

    println("Total de alunos na turma ${(idadeTurma.size)-1}")
    println("Media de idade da turma: ${(idadeTurma.sum()-999)/(idadeTurma.size-1)}")
}
//Q59
//59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
//perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
//a) qual é a maior idade lida
//b) quantos homens foram cadastrados
//c) qual é a idade da mulher mais jovem
//d) qual é a média de idade entre os homens
fun q59() {
    var controle = true
    var homensCadastrados = mutableListOf<String>()
    var mulheresCadastradas = mutableListOf<String>()
    var idadeHomens = mutableListOf<Int>()
    var idadeMulheres = mutableListOf<Int>()
    var todasAsIdade = mutableListOf<Int>()

    do {
        print("Idade: ")
        var idade = readln().toInt()
        todasAsIdade.add(idade)
        print("Sexo:")
        var sexo = readln()[0].lowercase()

        if (sexo == "m") {
            homensCadastrados.add(sexo)
            idadeHomens.add(idade)
        }
        else if (sexo == "f") {
            mulheresCadastradas.add(sexo)
            idadeMulheres.add(idade)
        }

        println("Deseja continuar?")
        println("[S] sim, [N] não: ")
        var simOuNao = readln()[0].lowercase()

        if (simOuNao == "n") {
            controle = false
        }
    }while (controle)

    println("Maior idade lida: ${todasAsIdade.max()}")
    println("Homens cadastrados: ${homensCadastrados.size}")
    println("Mulheres cadastradas ${mulheresCadastradas.size}")
    println("Idade homem mais jovem: ${idadeHomens.min()}")
    println("Idade mulher mais jovem: ${idadeMulheres.min()}")
    println("Idade homem mais velho: ${idadeHomens.max()}")
    println("Idade mulher mais velha: ${idadeMulheres.max()}")
    println("Meida idade entre os homens: ${idadeHomens.sum()/idadeHomens.size}")
    println("Media idade entre as mulheres: ${idadeMulheres.sum()/idadeMulheres.size}")
}
//Q60
//60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
//O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
//a) O nome da pessoa mais velha
//b) O nome da mulher mais jovem
//c) A média de idade do grupo
//d) Quantos homens tem mais de 30 anos
//e) Quantas mulheres tem menos de 18 anos
fun q60() {
    var controle = true

    var nomes = mutableListOf<String>()
    var idades = mutableListOf<Int>()
    var sexos = mutableListOf<String>()

    var idadeHomens = mutableListOf<Int>()
    var idadeMulheres = mutableListOf<Int>()
    var pessoaMaisVelha = ""
    var mulherMaisJovem = ""
    var controleDeIdades = 0
    var controleDeIdadeMulheres = 100000000

    do {
        println("Nome:")
        var nome = readln()
        nomes.add(nome)

        println("Idadade:")
        var idade = readln().toInt()
        idades.add(idade)

        println("Sexo:")
        var sexo = readln()
        sexos.add(sexo)

        if (idade > controleDeIdades) {
            controleDeIdades = idade
            pessoaMaisVelha = nome
        }

        if (idade < controleDeIdadeMulheres && sexo == "f") {
            controleDeIdadeMulheres = idade
            mulherMaisJovem = nome
        }

        if (sexo == "m") {
            idadeHomens.add(idade)
        } else if (sexo == "f") {
            idadeMulheres.add(idade)
        }

        println("Deseja continuar?")
        println("[S] sim, [N] não: ")
        var simOuNao = readln()[0].lowercase()


        if (simOuNao == "n") {
            controle = false
        }
    } while (controle)

    println("O nome da pessoa mais velha: ${pessoaMaisVelha}")
    println("O nome da mulher mais jovem: ${mulherMaisJovem}")
    println("A média de idade do grupo: ${idades.sum()/idades.size}")

    var hMaisDe30 = idadeHomens.filter { i -> i > 30 }
    var mMenos18 = idadeMulheres.filter { i -> i < 18 }

    println("Quantos homens tem mais de 30 anos: ${hMaisDe30.size}")
    println("Quantas mulheres tem menos de 18 anos: ${mMenos18.size}")
}
//Q61
//PASSO 06 – REPETIÇÃO COM FAÇA ENQUANTO
//61) Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
//“faça enquanto”
//0 3 6 9 12 15 18 21 24 27 30 Acabou!
fun q61(){
//    var contador = 0
//    while (contador <= 30) {
//        println(contador)
//        contador = contador + 3
//    }

    for (i in 0..30 step 3) println(i)
}
//q62
//62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de
//várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
//não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
//na tela:
//a) Quantas idades foram digitadas
//b) Qual é a média entre as idades digitadas
//c) Quantas pessoas tem 21 anos ou mais.
fun q62() {
    var controle = true
    var idades = mutableListOf<Int>()
    var maisDe21 = 0

    do {
        println("Idade: ")
        var idade = readln().toInt()
        idades.add(idade)

        println("Deseja continuar? ")
        var resposta = readln()[0].lowercase()

        if (resposta == "s"){
            println("Ok")
        } else if (resposta == "n"){
            controle = false
        }
    }while (controle)

    println("Quantas idades foram digitadas? ${idades.size}")
    println("Qual é a média entre as idades digitadas? ${idades.sum()/idades.size}")
    print("Quantas pessoas tem 21 anos ou mais? ")
    for (i in idades){
        if (i >= 21){
            maisDe21++
        }
    }
    print(maisDe21)
}
//q63
//63) Crie um programa usando a estrutura “faça enquanto” que leia vários números.
//A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
//tela:
//a) O somatório entre todos os valores
//b) Qual foi o menor valor digitado
//c) A média entre todos os valores
//d) Quantos valores são pares
fun q63() {
    var controle = true
    var numeros = mutableListOf<Int>()

    do {
        println("Numero: ")
        var numero = readln().toInt()
        numeros.add(numero)

        println("Deseja continuar? ")
        var resposta = readln()[0].lowercase()

        if (resposta == "s"){
            println("Ok")
        } else if (resposta == "n"){
            controle = false
        }
    }while (controle)

    println("O somatório entre todos os valores: ${numeros.sum()}")
    print("Qual foi o menor valor digitado:")
    var menorValor = numeros[0]
    for (i in numeros){
        if (i < menorValor) menorValor = i
    }
    println(menorValor)
    println("A média entre todos os valores: ${numeros.sum()/numeros.size}")
    print("Quantos valores são pares:")
    var numerosPares = 0
    for (i in numeros){
        if (i % 2 == 0) {
            numerosPares++
        }
    }
    println(numerosPares)
}
//PASSO 07 – REPETIÇÃO COM PARA
//Q64
//64) Desenvolva um programa usando a estrutura “para” que mostre na tela a
//seguinte contagem:
//0 5 10 15 20 25 30 35 40 Acabou!
fun q64(){
    for (i in 0..40 step 5){
        print("$i ")
    }
    println("Acabou!")
}
//Q65
//65) Desenvolva um programa usando a estrutura “para” que mostre na tela a
//seguinte contagem:
//100 90 80 70 60 50 40 30 20 10 0 Acabou!
fun q65(){
    for (i in 100 downTo 0 step 10) {
        print("$i ")
    }
    println("Acabou!")
}
//Q66
//66) Escreva um programa que leia um número qualquer e mostre a tabuada desse
//número, usando a estrutura “para”.
//Ex: Digite um valor: 5
//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15 ...
fun q66(){
    print("Numero: ")
    var numero = readln().toInt()
    for (i in 1..10){
        println("$numero x $i = ${numero * i} ")
    }
}
//Q67
//67) Faça um programa usando a estrutura “para” que leia um número inteiro
//positivo e mostre na tela uma contagem de 0 até o valor digitado:
//Ex: Digite um valor: 9
//Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
fun q67(){
    print("Numero: ")
    var numero = readln().toInt()

    for (i in 0..numero) print("$i, ")
    print("FIM!")
}
//Q68
//68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
//“para”. No final, mostre na tela:
//a) Quantas mulheres foram cadastradas
//b) Quantos homens pesam mais de 100Kg
//c) A média de peso entre as mulheres
//d) O maior peso entre os homens
fun q68(){
    var pesoDasMulheres = mutableListOf<Double>()
    var pesoDosHomens = mutableListOf<Double>()

    for (i in 1..8){
        print("Peso $i: ")
        var peso = readln().toDouble()
        print("Sexo: ")
        var sexo = readln()[0].lowercase()

        if (sexo == "m") {
            pesoDosHomens.add(peso)
        } else if(sexo == "f") {
            pesoDasMulheres.add(peso)
        }
    }
    println("Quantas mulheres foram cadastradas: ${pesoDasMulheres.size}")
    print("Quantos homens pesam mais de 100Kg: ")
    var homensMaisDe100 = pesoDosHomens.filter { i -> i > 100 }
    println(homensMaisDe100.size)
    println("A média de peso entre as mulheres: ${pesoDasMulheres.sum()/pesoDasMulheres.size}")
    println("O maior peso entre os homens: ${pesoDosHomens.max()}")
}
//Q69 [DESAFIO]
//69) Desenvolva um programa que leia o primeiro termo e a razão de uma
//PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
//a soma entre todos os valores da sequência.
fun q69(){
    print("primeiro termo da PA: ")
    var primeiroTermo = readln().toInt()
    print("Razão da PA: ")
    var razao = readln().toInt()

    var somaTermos = 0

    for (i in 1..10){
        somaTermos = somaTermos + primeiroTermo
        print("$primeiroTermo, ")
        primeiroTermo = primeiroTermo + razao
    }

    println("Soma entre os 10 primeiros termos da PA:$somaTermos ")
}
//Q70 [DESAFIO]
//70) Faça um programa que mostre os 10 primeiros elementos da Sequência
//de Fibonacci:
//1 1 2 3 5 8 13 21...
fun q70(){
    var n1 = -1
    var n2 = 1
    var n3:Int

    for (i in 1..10) {
        n3 = n1 + n2
        print("$n3 ")
        n1 = n2
        n2 = n3
    }
}
//PASSO 08 – VETORES
//71) Faça um programa que preencha automaticamente um vetor numérico com 8
//posições, conforme abaixo:
//999 999 999 999 999 999 999 999
//0   1   2   3   4   5   6   7
fun q71(){
    var array = arrayOfNulls<Int>(8)
    for (i in 0..7){
        array[i] = 999
    }
    println(Arrays.toString(array))
}
//Q72
//72) Crie um programa que preencha automaticamente (usando lógica, não apenas
//atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
//5 10 15 20 25 30 35 40 45 50
//0 1  2  3  4  5  6  7  8  9
fun q72() {
    var matriz = arrayOfNulls<Int>(10)
    var controle = 0
    for (i in 0..9){
        controle = controle + 5
        matriz[i] = controle
    }
    println(Arrays.toString(matriz))
}
//Q73
//73) Crie um programa que preencha automaticamente (usando lógica, não apenas
//atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
//9 8 7 6 5 4 3 2 1 0
//0 1 2 3 4 5 6 7 8 9
fun q73() {
    var matriz= arrayOfNulls<Int>(10)
    var n = 9
    for (i in 0..9){
        matriz[i] = n
        n--
    }
    println(Arrays.toString(matriz))
}
//Q74
//74) Crie um programa que preencha automaticamente (usando lógica, não apenas
//atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
//5 3 5 3 5 3 5 3 5 3
//0 1 2 3 4 5 6 7 8 9
fun q74() {
    var matriz = arrayOfNulls<Int>(10)
    var pares = 5
    var impares = 3
    for (i in 0..9){
        if (i == 0) matriz[i] = pares
        else if(i % 2 == 0) matriz[i] = pares
        else matriz[i] = impares
    }
    println(Arrays.toString(matriz))
}
//Q75
//75) Crie um programa que preencha automaticamente (usando lógica, não apenas
//atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
//elementos da sequência de Fibonacci:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
//0 1 2 3 4 5  6  7  8  9 10  11  12  13  14  15
fun q75() {
    var n1 = -1
    var n2 = 1
    var n3:Int
    var sequenciaFibonacci = mutableListOf<Int>()

    for (i in 0..16){
        n3 = n1 + n2
        n1 = n2
        n2 = n3
        if (n3 == 0) continue
        sequenciaFibonacci.add(n3)
    }
    print(sequenciaFibonacci)
}
//Q76
//76) Crie um programa que preencha automaticamente um vetor numérico com 7
//números gerados aleatoriamente pelo computador e depois mostre os valores
//gerados na tela.
fun q76() {
    var vetor7 = arrayOfNulls<Int>(7)

    fun sorteiaNumero():Int {
        var intervalo = 1..100
        var numeroaleatorio = intervalo.random()
        return numeroaleatorio
    }

    for (i in 0..6)vetor7[i] = sorteiaNumero()

    print(Arrays.toString(vetor7))
}
//Q77
//77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
//final, mostre uma listagem com todos os nomes informados, na ordem inversa
//daquela em que eles foram informados.
fun q77() {
    var nomes = arrayOfNulls<String>(7)
    for (i in 0..6){
        print("${i+1}º nome: ")
        var nome = readln()
        nomes[i] = nome
    }
    println(Arrays.toString(nomes))
//    reverso:
    print(Arrays.toString(nomes.reversedArray()))
}
//78
//78) Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
//mostre o vetor inteiro na tela e em seguida mostre em que posições foram
//digitados valores que são múltiplos de 10.
fun q78(){
    var numeros = arrayOfNulls<Int>(15)
    var multiplosDe10 = mutableListOf<Int>()

    for (i in 0..14){
        print("${i+1}° numero: ")
        var numero = readln().toInt()
        numeros[i] = numero

        if (numero % 10 == 0){
            multiplosDe10.add(i)
        }
    }

    println(Arrays.toString(numeros))
    println("Posições onde forma encontrados multiplos de 10: ${multiplosDe10}")
}
//Q79
//79) Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
//No final, mostre quais são os números pares que foram digitados e em que
//posições eles estão armazenados.
fun q79() {
    var numeros = arrayOfNulls<Int>(10)
    var numerosPares = mutableListOf<Int>()
    var posicaoPares = mutableListOf<Int>()

    for (i in 0..9){
        print("${i+1}° numero: ")
        var numero = readln().toInt()

        numeros[i] = numero
        if (numero % 2 == 0) {
            posicaoPares.add(i)
            numerosPares.add(numero)
        }
    }
    println("Numeros pares da lista: ${numerosPares}")
    println("Posição onde foram encontrados: ${posicaoPares}")
}
//Q80
//80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
//15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
//número (chave) e seu programa deve mostrar em que posições essa chave foi
//encontrada. Mostre também quantas vezes a chave foi sorteada.
fun q80() {
    fun sorteiaNumero():Int {
        var intervalo = 1..15
        var numeroSorteado = intervalo.random()
        return numeroSorteado
    }

    var numeros = arrayOfNulls<Int>(30)
    var posicoesDaChave = mutableListOf<Int>()

    for (i in 0..29){
        numeros[i] = sorteiaNumero()
    }

    print("Digite um numero(chave): ")
    var chave = readln().toInt()

    println(Arrays.toString(numeros))

    if (numeros.indexOf(chave) == -1) print("A chave não foi encontrada")
    else {
        for (i in numeros.indices){
            if (numeros[i] == chave) posicoesDaChave.add(i)
        }
        println("Chave encontrada na(s) posição(ões): ${posicoesDaChave}")
        println("Encontrado ${numeros.count{it == chave}} vezes")
    }
}
//Q81
//81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
//final, mostre:
//a) Qual é a média de idade das pessoas cadastradas
//b) Em quais posições temos pessoas com mais de 25 anos
//c) Qual foi a maior idade digitada (podem haver repetições)
//d) Em que posições digitamos a maior idade
fun q81() {
    var idades = mutableListOf<Int>()
    var posicaoMaiorIdade = mutableListOf<Int>()

    for (i in 1..8){
        print("Idade ${i}º pessoa: ")
        var idade = readln().toInt()
        idades.add(idade)
    }

    println("Idades cadastradas: ${idades}")
    println("Medias de idade: ${idades.sum()/idades.size}")
    println("Marior idade cadastrada: ${idades.max()}")

    for (i in idades.indices){
        if (idades.max() == idades[i]) posicaoMaiorIdade.add(i)
    }

    println("Posição(ões) onde a a maior idade foi encontrada: $posicaoMaiorIdade")
}
//Q82
//82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
//um vetor. No final, mostre:
//a) Qual é a média da turma
//b) Quantos alunos estão acima da média da turma
//c) Qual foi a maior nota digitada
//d) Em que posições a maior nota aparece
fun q82() {
    var notas = mutableListOf<Double>()
    var posicaoMaiorNota = mutableListOf<Int>()

    for (i in 1..10){
        print("Nota${i}º aluno: ")
        var nota = readln().toDouble()
        notas.add(nota)
    }

    println("Notas cadastradas: ${notas}")
    println("Media da turma: ${notas.sum()/notas.size}")

    var acimaDaMedia = notas.filter { i -> i >= 7 }
    println("Alunos acima da Média: ${acimaDaMedia.size} ")

    for (i in notas.indices) {
        if (notas[i] == notas.max()) posicaoMaiorNota.add(i)
    }
    print("Posição onde a maior nota aparece: $posicaoMaiorNota")
}
//Q83 [DESAFIO]
//83) Crie uma lógica que preencha um vetor de 20 posições com números
//aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
//números gerados e depois coloque o vetor em ordem crescente, mostrando no final
//os valores ordenados.
fun q83() {
    fun sorteiaNumero():Int {
        var intervalo = 0..99
        var numeroAleatorio = intervalo.random()
        return numeroAleatorio
    }

    var numeros = Array(20){0}

    for (i in 0..19){
        numeros[i] = sorteiaNumero()
    }

    println("Numeros: ${Arrays.toString(numeros)}")
    println("Em ordem: ${numeros.sorted()}")
}
//Q84
//84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
//valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
//contendo apenas os dados das pessoas menores de idade.
fun q84() {
    var nomes = mutableListOf<String>()
    var idades = mutableListOf<Int>()

    for (i in 0..8){
        print("Nome ${i+1}º pessoa: ")
        var nome = readln()
        nomes.add(nome)

        print("Idade: ")
        var idade = readln().toInt()
        idades.add(idade)
    }

    println("Lista menores de idade:")
    for ( i in idades.indices) {
        if (idades[i] < 18){
            println("${nomes[i]}, ${idades[i]} anos")
        }
    }
}
//Q85
//85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
//guarde esses dados em três vetores. No final, mostre uma listagem contendo
//apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
fun q85() {
    var nomes = mutableListOf<String>()
    var salarios = mutableListOf<Double>()
    var sexos = mutableListOf<String>()

    for (i in 0..4){
        println("${i+1}° funcionario:")

        print("Nome: ")
        var nome = readln()
        nomes.add(nome)

        print("Salario: ")
        var salario = readln().toDouble()
        salarios.add(salario)

        print("Sexo: ")
        var sexo = readln()[0].lowercase()
        sexos.add(sexo)
    }

    println("Funcionárias mulheres que ganham mais de R\$5 mil.")

    for (i in sexos.indices) {
        if (sexos[i] == "f" && salarios[i] > 5_000) println("${nomes[i]}, " +
                "Salario: ${salarios[i]}")
    }
}
//PASSO 09 – PROCEDIMENTOS
//Q86
//86) Crie um programa que tenha um procedimento Gerador() que, quando chamado,
//mostre a mensagem "Olá, Mundo!" com algum componente visual (linhas)
//Ex: Ao chamar Gerador() aparece:
//+-------=======------+
// Olá, Mundo!
//+-------=======------+
fun q86() {
    fun gerador() {
        println("+-------=======------+")
        println("Olá, Mundo!")
        println("+-------=======------+")
    }

    gerador()
}
//Q87
//87) Crie um programa que melhore o procedimento Gerador() da questão anterior
//para que mostre uma mensagem personalizada, passada como parâmetro.
//Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
//+-------=======------+
// Aprendendo Portugol
//+-------=======------+
fun q87() {
    println("Mensagem: ")
    var mensagem = readln()

    fun gerador(parametro:String){
        println("+-------=======------+")
        println("$parametro")
        println("+-------=======------+")
    }

    gerador(mensagem)
}
//q88
//88) Crie um programa que melhore o procedimento Gerador() da questão anterior
//para que mostre uma mensagem vário
//Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
//+-------=======------+
// Aprendendo Portugol
// Aprendendo Portugol
// Aprendendo Portugol
// Aprendendo Portugol
//+-------=======------+
fun q88() {
    print("Mensagem:")
    var mensagem = readln()
    print("Repetição:")
    var repeticao = readln().toInt()

    fun gerador(parametro:String, x:Int){
        println("+-------=======------+")
        for (i in 1..repeticao) println("$mensagem")
        println("+-------=======------+")
    }

    gerador(mensagem, repeticao)
}
//Q89
//89) Crie um programa que melhore o procedimento Gerador() da questão anterior
//para que o programador possa escolher uma entre três bordas:
// +-------=======------+ Borda 1
// ~~~~~~~~:::::::~~~~~~~ Borda 2
// <<<<<<<<------->>>>>>> Borda 3
//Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
//~~~~~~~~:::::::~~~~~~~
// Portugol Studio
// Portugol Studio
// Portugol Studio
//~~~~~~~~:::::::~~~~~~~
fun q89() {
    print("Mensagem: ")
    var mensagem = readln()
    print("Repetições: ")
    var repeticoes = readln().toInt()
    println("Borda:")
    println("+-------=======------+ Borda 1")
    println("~~~~~~~~:::::::~~~~~~~ Borda 2")
    println("<<<<<<<<------->>>>>>> Borda 3")
    var borda = readln().toInt()

    fun  gerador(mensagem:String, repeticoes:Int, tpoBorda:Int) {
        var borda = ""

        if (tpoBorda == 1) borda = "+-------=======------+"
        else if (tpoBorda == 2) borda = "~~~~~~~~:::::::~~~~~~~"
        else if (tpoBorda == 3) borda = "<<<<<<<<------->>>>>>>"

        println(borda)
        for (i in 1..repeticoes) println(mensagem)
        println(borda)
    }

    gerador(mensagem, repeticoes, borda)
}
//Q90
//90) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
//valores para um procedimento Somador() que vai calcular e mostrar a soma entre
//eles.
fun q90() {
    print("Valor 1: ")
    var n1 = readln().toInt()
    print("Valor 2: ")
    var n2 = readln().toInt()

    fun somador(n1:Int, n2:Int):Int {
        var n3:Int
        n3 = n1 + n2
        return n3
    }

    print("Valor da soma: ${somador(n1, n2)}")
}
//91
//91) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
//valores para um procedimento Maior() que vai verificar qual deles é o maior e
//mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
//informando essa característica.
fun q91() {
    fun maior(valor1:Double, valor2:Double) {
        if (valor1 == valor2) println("Valores iguais")
        else if (valor1 > valor2) println("$valor1 maior.")
        else if (valor1 < valor2) println("$valor2 maior.")
    }

    print("Valor 1: ")
    var n1 = readln().toDouble()
    print("Valor 2: ")
    var n2 = readln().toDouble()

    maior(n1,n2)
}
//Q92
//92) Crie uma lógica que leia um número inteiro e passe para um procedimento
//ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
//parâmetro é PAR ou ÍMPAR.
fun q92() {
    fun parOuImpar(inteiro:Int) {
        if (inteiro == 0) println("Nem par nem impar")
        else if (inteiro % 2 == 0) println("Par")
        else println("Impar")
    }

    println("Numero inteiro: ")
    var numero = readln().toInt()

    parOuImpar(numero)
}
//Q93
//93) Faça um programa que tenha um procedimento chamado Contador() que recebe
//três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
//programa principal deve solicitar a digitação desses valores e passá-los ao
//procedimento, que vai mostrar a contagem na tela.
//Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
//Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM
fun q93() {
    fun contador(inicio:Int, fim:Int, incremento:Int) {
        for (i in inicio..fim step incremento) print("$i >> ")
        print("FIM")
    }

    print("Inicio: ")
    var inicio = readln().toInt()
    print("Fim: ")
    var fim = readln().toInt()
    print("Incremento: ")
    var incremento = readln().toInt()

    contador(inicio, fim, incremento)
}
//Q94 [DESAFIO]
//94) Desenvolva um aplicativo que tenha um procedimento chamado
//Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos
//termos da sequência serão mostrados na tela. O seu procedimento deve receber
//esse valor e mostrar a quantidade de elementos solicitados.
//Obs: Use os exercícios 70 e 75 para te ajudar na solução
//Ex:
//Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
//Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM
fun q94() {
    fun fibonacci(termos:Int) {
        var n1 = -1
        var n2 = 1
        var n3:Int

        for (i in 1..(termos+1)){
            n3 = n1 + n2
            n1 = n2
            n2 = n3
            if (n3 == 0) continue
            print("$n3 >>> ")
        }
        print("FIM")
    }

    print("Termos: ")
    var termos = readln().toInt()

    fibonacci(termos)
}
//PASSO 10 – FUNÇÕES
//Q95
//95) Refaça o exercício 90, só que agora em forma de função Somador(), que vai
//receber dois parâmetros e vai retornar o resultado da soma entre eles para o
//programa principal.
fun q95() {
    fun somador(n1:Int, n2:Int):Int {
        var n3:Int
        n3 = n1 + n2
        return n3
    }

    print("Numero 1: ")
    var n1 = readln().toInt()
    print("Numero 2: ")
    var n2 = readln().toInt()

    println("${somador(n1,n2)}")
}
//Q96
//96) Crie um programa que tenha uma função Media(), que vai receber as 2 notas de
//um aluno e retornar a sua média para o programa principal.
fun q96() {
    fun media(n1:Double, n2:Double):Double {
        var media = (n1 + n2)/2
        return media
    }

    print("Nota 1: ")
    var nota1 = readln().toDouble()
    print("Nota 2: ")
    var nota2 = readln().toDouble()

    println("Média: ${"%.2f".format(media(nota1, nota2))}")
}
//Q97
//97) Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
//adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o
//maior entre eles.
fun q97(){
    fun maior(n1:Int, n2:Int, n3:Int) {
        if (n1 == n2 && n2 == n3) print("Valores iguais")
        else if (n1 > n2 && n1 > n3) print("$n1 valor 1 maior")
        else if (n2 > n1 && n2 > n3) print("$n2 valoe 2 maior")
        else if (n3 > n1 && n3 > n2) print("$n3 valor 3 maior")
    }

    print("Valor 1: ")
    var n1 = readln().toInt()
    print("Valor 2: ")
    var n2 = readln().toInt()
    print("Valor 3: ")
    var n3 = readln().toInt()

    maior(n1, n2, n3)
}
//Q98
//98) Crie um programa que tenha uma função SuperSomador(), que vai receber dois
//números como parâmetro e depois vai retornar a soma de todos os valores no
//intervalo entre os valores recebidos.
//Ex:
//SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
//SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85
fun q98() {
    fun superSoma(inicio:Int, fim:Int):Int {
        var soma = 0
        for (i in inicio..fim){
            soma = soma + i
        }

        return soma
    }

    print("Valor 1: ")
    var n1 = readln().toInt()
    print("valor 2: ")
    var n2 = readln().toInt()

    println("${superSoma(n1,n2)}")
}
//Q99
//99) Faça um programa que possua uma função chamada Potencia(), que vai receber
//dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
//exponenciação.
//Ex: Potencia(5,2) vai calcular 5^2 = 25
fun q99() {
    fun potencia(base:Double, expoente:Double):Double {
        var potencia = Math.pow(base, expoente)
        return potencia
    }

    print("Base: ")
    var base = readln().toDouble()
    print("Expoente: ")
    var expoente = readln().toDouble()

    println("${potencia(base, expoente)}")
}
//Q100
//100) Melhore o exercício 96, criando além da função Media() uma outra função
//chamada Situacao(), que vai retornar para o programa principal se o aluno está
//APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
//parâmetro o resultado retornado pela função Media()
fun q100() {
    fun media(n1:Double, n2:Double):Double {
        var media = (n1 + n2)/2
        return media
    }

    fun situacao(media:Double):String {
        if (media >= 7) return "APROVADO"
        else if (media < 7 && media >= 3) return "RECUPERAÇÃO"
        else if (media < 3) return "REPROVADO"
        return TODO()
    }

    print("Nota 1: ")
    var nota1 = readln().toDouble()
    print("Nota 2: ")
    var nota2 = readln().toDouble()

    println("Média ${"%.2f".format(media(nota1, nota2))}")
    println("Situação do aluno: ${situacao(media(nota1,nota2))}")
}
//FIM