const inputBox=document.getElementById("inputbox");
const listContainer=document.getElementById("listcontanier");

function addTask(){
    if(inputBox.value===''){
        alert("You must write something!");
    }
    else{
        let li=document.createElement("li");
        li.innerHTML=inputBox.value;
        listContainer.appendChild(li);
        let span=document.createElement("span");
        span.innerHTML="\u00d7";
        li.appendChild(span);
    }
    inputBox.value="";
    savedata();
}

listContainer.addEventListener("click",function(e){
    if(e.target.tagName==="LI"){
        e.target.classList.toggle("checked");
        savedata();
    }
    else if(e.target.tagName==="SPAN"){
        e.target.parentElement.remove();
        savedata();
    }
},false)

function savedata(){
    localStorage.setItem("data",listContainer.innerHTML);
    //to store data to save updated content 
}
function displaylist(){
    listContainer.innerHTML=localStorage.getItem("data");
    //to display data whenever we open website again
}
displaylist();