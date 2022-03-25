url = "http://localhost:8080/api/main";

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

perm = sendRecuest("GET" , url)
perm.then(data =>{
   let balas = document.getElementById("balans");
   balas.textContent = "баланс : "+data.many;
});