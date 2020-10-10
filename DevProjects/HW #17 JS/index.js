alert("Hello");
document.addEventListener("DOMContentLoaded", function() {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'http://151.80.70.42:3000/api/users', true);
    xhr.send();
    xhr.onreadystatechange = function() { // (3)
        if (xhr.readyState != 4) return;

        if (xhr.status != 200) {
            alert(xhr.status + ': ' + xhr.statusText);
        } else {
            var responseData = JSON.parse(xhr.responseText);            
            for (var i = 0; i < responseData.length; i++) {
                var student = document.createElement("li");
                var id = document.createElement("b");
                var name = document.createElement("h3");
                var phone = document.createElement("h3");
                var role = document.createElement("b");
                id.innerText = responseData[i].id;
                name.innerText = responseData[i].name;
                phone.innerText = responseData[i].phone;
                role.innerText = responseData[i].role;
                student.appendChild(id);
                student.appendChild(name);
                student.appendChild(phone);
                student.appendChild(role);
                document.querySelector("div#user-list").appendChild(student);
            }
        }      
    }
    document.querySelector("button#create-user-button").addEventListener("click", function() {
        var name = document.getElementById("name-field").value;
        var phone = document.getElementById("phone-field").value;
        var xhr = new XMLHttpRequest();
        xhr.open('POST', 'https://jsonplaceholder.typicode.com/todos', true);
        xhr.setRequestHeader("Content-Type", "application/json");
        xhr.send(JSON.stringify({name: name, phone: phone}));
        xhr.onreadystatechange = function() { // (3)
            if (xhr.readyState != 4) return;
    
            if (xhr.status != 200) {
                alert(xhr.status + ': ' + xhr.statusText);
            } else {
                var responseData = JSON.parse(xhr.responseText);     
                console.log(responseData);       

            }      
        }
    })
});
