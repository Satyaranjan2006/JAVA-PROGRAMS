
// ----------------BASIC---------------------

let s="SATYARANJAN"
// console.log(name);

// ---------------------METHODS ---------------------
    

// ---------------------length ---------------------

console.log(s.length);//11

// ---------------------slice()  ---------------------

console.log(s.slice(0,5));//SATYA
console.log(s.slice(5));//RANJAN
console.log(s.slice(-4));//NJAN
console.log(s.slice(-5,-2));//ANJ
console.log(s.slice(0,-1));//SATYARANJA



//---------------------subString() ---------------------

console.log(s.slice(5,2)); // it will print nothing
// substring used wherewe provide invalid distance parameter and it convert to valid but slice() can not.
console.log(s.substring(5,2));//TYA



//---------------------concat() ---------------------

console.log(s.concat("SETHY","KABITA","SETHY"));//SATYARANJANSETHYKABITASETHY
console.log(s);//SATYARANJAN
// but after concatination it never changes the original string



//---------------------indexOf() ---------------------

console.log(s.indexOf("RANJAN"));//5



//--------------------- includes() ---------------------

console.log(s.includes("raghu"));//false
console.log(s.includes("KABITA"));//false
console.log(s.includes("kabita"));//false
console.log(s.includes("SATYA"));//true
console.log(s.includes("satya"));//false



//---------------------split() ---------------------

let p= "hsheedjjd jjj jwhjw "

console.log(p.split( ));// [ 'hsheedjjd jjj jwhjw ' ]


// ---------------------charAt() ---------------------

console.log(s.charAt(2));// T













