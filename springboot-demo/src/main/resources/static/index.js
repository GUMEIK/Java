const btn = document.getElementById("btn");
const dom = document.getElementsByTagName("div")[0];
let num = 0;
let colorStr = "";
btn.onclick = ()=>{
    alert("hello,springweb");
    console.log(dom);
    console.log(dom.style)
    num += num;
    if(num % 2 === 0) colorStr = "red";
    else colorStr = "green";
    dom.style.background = colorStr;

}