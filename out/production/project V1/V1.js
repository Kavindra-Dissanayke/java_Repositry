function getInput() {
    console.log("hello");
}

getInput();

//============================

function square(num) {
    return num * num;
}

const v = square(4)

console.log("Answer is : ", v);//+v
//=============================

function square(num) {
    return num * num;
}

console.log("Answer is : ", square(4));
//==============================

const square01 = function (x) {
    return x * x;
}
console.log("Answer is : " + square01(6));
//=============================
//es6
const add = (x) => {
    return x + x;
}
console.log("Answer is : ", add(10));
//=============================
const add01 = (x) => x + x
console.log("Answer is : ", add01(12))
//=============================
const add02 = x => x + x//here contains is one parameter, so we can define like this.
console.log("Answer is : ", add02(14))
//=============================
const array = [1, 2, 3, 4, 5];
array.forEach(function (arr) {
    console.log(arr);
})
console.log()
//=============================
const array01 = [11, 22, 33, 44, 55];
array01.forEach(arr => console.log(arr))
//=============================
array.forEach(arr => console.log(arr))

//=============================
const  array02=["java","C++","python","Ruby","R"]
array02.forEach(ar=>console.log(ar))
//=============================
const b=array.map(x=>x*2)
console.log(b)
//=============================
b.forEach(a=>console.log(a))
//=============================


