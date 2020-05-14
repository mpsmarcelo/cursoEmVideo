
var agora = new Date()
var horas = agora.getHours();
var teste = Date.now()

console.log('teste' + teste.horas())
if(horas <= 11){
    console.log(`Bom dia, agora são ${agora.toLocaleTimeString()}`)
}else if(agora.get <= 18){
    console.log(`Boa tarde, agora são ${agora.toLocaleTimeString()}`)
}else{
    console.log(`Boa noite, ${agora.toLocaleTimeString()}`)
}




