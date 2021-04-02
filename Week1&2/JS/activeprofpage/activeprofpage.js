var names = document.querySelector("#nameChange");
var removeToddlist = document.querySelector("#Todd")
var removePhillist = document.querySelector("#Phil")

function nameChanger(){
    names.innerText = "Walker";

}

function removePhil() {
    removePhillist.remove("#Phil");
}


function removeTodd() {
    removeToddlist.remove("#Todd");
}
