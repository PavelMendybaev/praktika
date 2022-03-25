url = "http://localhost:8080/api/servers";

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

perm = sendRecuest("GET" , url )
perm.then(data =>{
    for(let i  in data){

        let servers = document.getElementById("servers")
        let a = document.createElement("a");
        let h = document.createElement("h3");
        let div = document.createElement("div");
        let j = parseInt(i) + 1;
        h.textContent = "Сервер "+j;
        a.href = "http://localhost:8080/servers/"+j;
        a.textContent = data[i].name ;
        div.appendChild(h);
        div.appendChild(a);
        servers.appendChild(div);

    }

})
