var agora = new Date()
var diaDaSemana = agora.getDay()
console.log(`Dia : ${diaDaSemana}`)

/*diaDaSemana = 10*/

switch(diaDaSemana){

    case  0 : console.log(`Domingo`)
    break
    case  1 : console.log(`Segunda`)
    break
    case  2 : console.log(`Terça`)
    break
    case  3 : console.log(`Quarta`)
    break
    case  4 : console.log(`Quinta`)
    break
    case  5 : console.log(`Sexta`)
    break
    case  6 : console.log(`Sabado`)
    break
    default : console.log(console.error(`Dia invalido`))


}