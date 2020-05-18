const getRemaindTime = deadline => {
    let now = new Date(),
        remainTime = (new Date(deadline) - (now + 1000))/1000,             // como se tarda 1s en actualizar aumentamos ese segundo
        remainSeconds = ('0' + Math.floor(remainTime % 60)).slice(-2),     //slice toma los dos ultimos strings
        remainMinutes = ('0' + Math.floor((remainTime/60) % 60)).slice(-2),
        remainHours = ('0' + Math.floor((remainTime/3600) % 24)).slice(-2),
        remainDays = (Math.floor(remainTime/(3600*24)));

        return {
            remainSeconds, 
            remainMinutes,
            remainHours, 
            remainDays, 
            remainTime
        }
}

const countdown = (deadline, elem, finalMessage) => {
    const el = document.getElementById(elem);   // retorna un objeto señalado por el Id elem que es una cadena unica de caracteres sensibles a mayúsculas

    const timerUpdate = setInterval( () => {      // La función timerUpdate recibe 2 parametros una funcion que sera ejecutada cada cierto intervalo de tiempo definido por el segundo parámetro
        let t = getRemaindTime(deadline);
        el.innerHTML = '${t.remainDays}d:${t.remainHours}h:${t.remainMinutes}m:${t.remainSeconds}$';
        
        if(t.remainTime <= 1) {
            clearInterval(timerUpdate);     //limpiar el contador por lo tanto va a dejar de actualizar la función
            el.innerHTML= finalMessage;
        }
    }, 1000 )   // el tiempo esta en milisegundos 1s = 1000 milisegundos
}

countdown('May 20 2020 01:19:20 GMT-0500', 'clock', 'El mundo ha terminado');       // clock es el ID del elemento ubicado en el archivo HTML y el ultimo es el mensaje final
