const sum =  Function('a', 'b', 'return a + b');

console.log(sum(2, 6));
// Expected output: 8
//===========================
const materials = [
    'Hydrogen',
    'Helium',
    'Lithium',
    'Beryllium'
];

console.log(materials.map(material => material.length));
// Expected output: Array [8, 6, 7, 9]
