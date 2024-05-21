const Base_Url=
"https://v6.exchangerate-api.com/v6/bce1b62b5aeff8530b4e1567/latest/USD";

const dropdownsSelects=document.querySelectorAll(".dropdown select");
const btn=document.querySelector("form button");
const fromCurr = document.querySelector(".from select");
const toCurr = document.querySelector(".to select");
const msg = document.querySelector(".msg");

for(let select of dropdownsSelects){
    for (currCode in countryList){
        // console.log(code,countryList[code])
        let newOption=document.createElement("option");
        newOption.innerText=currCode;
        if(select.name==="from" && currCode === "USD"){
            newOption.selected="selected";
        }
        else if(select.name==="to" && currCode === "INR"){
            newOption.selected="selected";
        }
       select.append(newOption);
    }
    select.addEventListener("change",(evt)=>{
        updateFlag(evt.target);
    })

}

const updateFlag=(element)=>{
    // console.log(element);
    let currCode=element.value;
    let countryCode=countryList[currCode];
    let newSrc=`https://flagsapi.com/${countryCode}/flat/64.png`;
    let img=element.parentElement.querySelector("img");
    img.src=newSrc;
}

const updateExchangeRate = async () => {
    let amount=document.querySelector(".amount input");
    let amtval=amount.value;
    if(amtval===""||amtval<1){
        amtval=1;
        amount.value="1";
        alert("Please fill in valid amount");
    }

    let response=await fetch(Base_Url);
    let data=await response.json();

    let fromrate=data.conversion_rates[fromCurr.value];
    let torate=data.conversion_rates[toCurr.value];
    console.log(fromrate);
    console.log(torate);
    let finalAmount=(amtval/fromrate)*torate;
    msg.innerText = `${amtval} ${fromCurr.value} = ${finalAmount} ${toCurr.value}`;

};

btn.addEventListener("click", (evt) => {
    evt.preventDefault();//preventing default changes when the button is clicked
    updateExchangeRate();
  });

window.addEventListener("load", () => {
    updateExchangeRate();
  });