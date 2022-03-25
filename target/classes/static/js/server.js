

async function sendRecuest(method, url, body = null) {
    if (body != null) {
        body = JSON.stringify(body);
    }

    let quary = await fetch(url, {
        method: method,
        headers: {
            'Content-Type': 'application/json'
        },
        body: body
    });
    return  await quary.json();
}


var test = window.location.pathname;

title = document.getElementById("title");
title.textContent = test;

url = "http://localhost:8080/api"+test;

perm = sendRecuest("GET" , url )
perm.then(data =>{
    let nameServer = document.getElementById("name-server");
    nameServer.textContent = "Сервер : " + data.name;

});