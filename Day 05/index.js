console.log(x); // Output: undefined
var x = 5;

var x;
console.log(x); // Output: undefined
x = 5;

const add = (a, b) => a + b;
console.log(add(2, 3)); // Output: 5

const multiply = function(a, b) {
    return a * b;
  };
  console.log(multiply(2, 3)); // Output: 6

// console.log(x); // ReferenceError: Cannot access 'x' before initialization
//   let x = 5;

// Empty file
console.log(this); // Output: Window object (in browsers)

console.log(this === window); // Output: true (in browsers)

let a;
console.log(a); // Output: undefined
console.log(b); // ReferenceError: b is not defined