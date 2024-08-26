## OUTLINE

### Introduction
1. **What is JavaScript?**
    - History and evolution
    - Uses of JavaScript (Web development, server-side, etc.)

2. **Why Learn JavaScript?**
    - Importance in modern web development
    - Comparison with other programming languages

### Basics of JavaScript
1. **JavaScript Syntax**
    - Variables and Data Types (Number, String, Boolean, Object, Array)
    - Operators (Arithmetic, Comparison, Logical, Assignment)

2. **Basic Control Structures**
    - Conditionals (if, else if, else, switch)
    - Loops (for, while, do-while)

3. **Functions**
    - Function declaration and expression
    - Arrow functions
    - Scope and closures

4. **Objects and Arrays**
    - Creating and manipulating objects
    - Arrays and array methods (push, pop, map, filter, reduce)

5. **DOM Manipulation**
    - Selecting and modifying elements
    - Event handling (click, change, submit)
    - Event delegation

6. **JavaScript and HTML Forms**
    - Form validation
    - Handling form submissions

7. **Error Handling**
    - Try, catch, finally
    - Custom error objects

---

## Introduction

### **1. What is JavaScript?**

#### **History and Evolution**
- **Introduction**
    - JavaScript was created by Brendan Eich while working at Netscape Communications.
    - It was first introduced in 1995 as "LiveScript" and renamed to "JavaScript" in 1996.

- **Early Days**
    - Originally designed to add simple interactivity to web pages.
    - Initially limited in capabilities and support across browsers.

- **Modern JavaScript**
    - ECMAScript (ES) standardization began in 1997.
    - Major updates include ES5 (2009), ES6 (2015), and subsequent releases with new features (ES7/ES8/ES9, etc.).
    - Modern JavaScript includes features like arrow functions, async/await, modules, and more.

- **JavaScript Engines**
    - V8 (Chrome), SpiderMonkey (Firefox), JavaScriptCore (Safari).
    - These engines have significantly improved performance and capabilities.

#### **Uses of JavaScript**
- **Web Development**
    - **Client-Side Scripting**: Enhances user experience by dynamically updating web pages without reloading.
    - **Interactivity**: Forms, animations, interactive content.
    - **Frameworks and Libraries**: React, Angular, Vue.js for building complex applications.

- **Server-Side Development**
    - **Node.js**: Allows JavaScript to run on the server, enabling full-stack JavaScript development.
    - **Backend Frameworks**: Express.js, Koa, Hapi.

- **Mobile Development**
    - **Hybrid Apps**: Using frameworks like React Native or Ionic to build cross-platform mobile apps.

- **Desktop Applications**
    - **Electron**: Enables building cross-platform desktop applications using web technologies.

- **IoT and Robotics**
    - JavaScript is increasingly used in Internet of Things (IoT) applications and robotics with frameworks like Johnny-Five.

### **2. Why Learn JavaScript?**

#### **Importance in Modern Web Development**
- **Ubiquity**
    - JavaScript is supported by all modern web browsers, making it essential for web development.
    - Enables the development of dynamic and interactive websites.

- **Versatility**
    - Can be used for both front-end and back-end development.
    - Integrated with HTML and CSS to create comprehensive web applications.

- **Rich Ecosystem**
    - Large number of libraries and frameworks (React, Angular, Vue) streamline development processes.
    - A vibrant community contributing to a vast amount of resources, tools, and tutorials.

- **Career Opportunities**
    - High demand for JavaScript developers in various fields, including web development, mobile app development, and server-side programming.
    - Provides a strong foundation for learning other programming languages and technologies.

#### **Comparison with Other Programming Languages**
- **JavaScript vs. Java**
    - JavaScript: Primarily used for client-side scripting, dynamic web content.
    - Java: General-purpose, strongly typed, used for enterprise applications, Android development.

- **JavaScript vs. Python**
    - JavaScript: Ideal for web development and event-driven programming.
    - Python: Versatile, used in web development (Django, Flask), data science, machine learning.

- **JavaScript vs. TypeScript**
    - JavaScript: Dynamic typing, flexible but can lead to runtime errors.
    - TypeScript: Superset of JavaScript, adds static typing for better error checking and enhanced development experience.

- **JavaScript vs. PHP**
    - JavaScript: Client-side scripting, modern full-stack capabilities with Node.js.
    - PHP: Server-side scripting language, traditionally used for web development but less common for client-side interactivity.

---

## Basics of JavaScript

### **1. JavaScript Syntax**

#### **Variables and Data Types**

**Variables**
- Variables are containers for storing data values.
- Declared using `var`, `let`, or `const`.

```javascript
// var (function-scoped, older standard)
var name = 'John';

// let (block-scoped, modern standard)
let age = 30;

// const (block-scoped, constant value)
const pi = 3.14159;
```

**Data Types**
- **Number**: Represents both integer and floating-point numbers.

```javascript
let age = 25;          // Integer
let price = 19.99;     // Floating-point number
```

- **String**: Represents text enclosed in quotes.

```javascript
let greeting = 'Hello, World!';     // Single quotes
let name = "Alice";                 // Double quotes
let message = `Welcome, ${name}!`;  // Template literals (backticks)
```

- **Boolean**: Represents `true` or `false`.

```javascript
let isActive = true;
let isCompleted = false;
```

- **Object**: Represents a collection of key-value pairs.

```javascript
let person = {
  firstName: 'Jane',
  lastName: 'Doe',
  age: 28
};
```

- **Array**: Represents a list of values.

```javascript
let numbers = [1, 2, 3, 4, 5];
let fruits = ['apple', 'banana', 'cherry'];
```

**Sample Program**:
```javascript
// Define variables
let name = 'John';
let age = 30;
let isStudent = true;

// Create an object
let person = {
  name: name,
  age: age,
  isStudent: isStudent
};

// Create an array
let colors = ['red', 'green', 'blue'];

// Output the values
console.log(person);
console.log(colors);
```

#### **Operators**

**Arithmetic Operators**
- Used to perform mathematical operations.

```javascript
let a = 10;
let b = 5;

console.log(a + b); // Addition: 15
console.log(a - b); // Subtraction: 5
console.log(a * b); // Multiplication: 50
console.log(a / b); // Division: 2
console.log(a % b); // Modulus (remainder): 0
console.log(a ** b); // Exponentiation: 100000
```

**Comparison Operators**
- Used to compare two values.

```javascript
let x = 10;
let y = 20;

console.log(x == y);  // Equality: false
console.log(x != y);  // Inequality: true
console.log(x > y);   // Greater than: false
console.log(x < y);   // Less than: true
console.log(x >= y);  // Greater than or equal to: false
console.log(x <= y);  // Less than or equal to: true
```

**Logical Operators**
- Used to perform logical operations.

```javascript
let a = true;
let b = false;

console.log(a && b); // Logical AND: false
console.log(a || b); // Logical OR: true
console.log(!a);     // Logical NOT: false
```

**Assignment Operators**
- Used to assign values to variables.

```javascript
let x = 10;       // Assignment
x += 5;           // Addition assignment: x = x + 5 => 15
x -= 3;           // Subtraction assignment: x = x - 3 => 12
x *= 2;           // Multiplication assignment: x = x * 2 => 24
x /= 4;           // Division assignment: x = x / 4 => 6
x %= 2;           // Modulus assignment: x = x % 2 => 0
```

**Sample Program**:
```javascript
// Arithmetic Operations
let num1 = 8;
let num2 = 4;

console.log('Addition:', num1 + num2);
console.log('Subtraction:', num1 - num2);
console.log('Multiplication:', num1 * num2);
console.log('Division:', num1 / num2);

// Comparison Operations
console.log('Is num1 equal to num2?', num1 == num2);
console.log('Is num1 not equal to num2?', num1 != num2);

// Logical Operations
let isTrue = true;
let isFalse = false;

console.log('Logical AND:', isTrue && isFalse);
console.log('Logical OR:', isTrue || isFalse);

// Assignment Operations
let value = 10;
value += 5; // value = value + 5
console.log('Value after addition assignment:', value);
```

---


### **2. Basic Control Structures**

#### **Conditionals**

**1. `if` Statement**
- Executes a block of code if its condition evaluates to `true`.

```javascript
let temperature = 25;

if (temperature > 20) {
  console.log("It's a warm day.");
}
```

**2. `else if` Statement**
- Executes a block of code if its condition evaluates to `true`, and the previous `if` condition was `false`.

```javascript
let temperature = 15;

if (temperature > 20) {
  console.log("It's a warm day.");
} else if (temperature > 10) {
  console.log("It's a cool day.");
}
```

**3. `else` Statement**
- Executes a block of code if none of the preceding conditions are `true`.

```javascript
let temperature = 5;

if (temperature > 20) {
  console.log("It's a warm day.");
} else if (temperature > 10) {
  console.log("It's a cool day.");
} else {
  console.log("It's a cold day.");
}
```

**4. `switch` Statement**
- Executes different blocks of code based on the value of an expression. Useful for multiple discrete values.

```javascript
let day = 3; // 1 for Monday, 2 for Tuesday, etc.

switch (day) {
  case 1:
    console.log("Monday");
    break;
  case 2:
    console.log("Tuesday");
    break;
  case 3:
    console.log("Wednesday");
    break;
  default:
    console.log("Weekend");
}
```

**Sample Program**:
```javascript
let score = 85;

if (score >= 90) {
  console.log("Grade: A");
} else if (score >= 80) {
  console.log("Grade: B");
} else if (score >= 70) {
  console.log("Grade: C");
} else {
  console.log("Grade: D");
}

let month = 4; // April

switch (month) {
  case 1:
    console.log("January");
    break;
  case 2:
    console.log("February");
    break;
  case 3:
    console.log("March");
    break;
  case 4:
    console.log("April");
    break;
  default:
    console.log("Month not recognized");
}
```

#### **Loops**

**1. `for` Loop**
- Repeats a block of code a specified number of times.

```javascript
for (let i = 0; i < 5; i++) {
  console.log(i);
}
```

**2. `while` Loop**
- Repeats a block of code as long as its condition evaluates to `true`.

```javascript
let count = 0;

while (count < 5) {
  console.log(count);
  count++;
}
```

**3. `do...while` Loop**
- Similar to the `while` loop, but guarantees the block of code runs at least once.

```javascript
let count = 0;

do {
  console.log(count);
  count++;
} while (count < 5);
```

**Sample Program**:
```javascript
// Using for loop to iterate over an array
let fruits = ['apple', 'banana', 'cherry'];

for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

// Using while loop to sum numbers from 1 to 5
let sum = 0;
let number = 1;

while (number <= 5) {
  sum += number;
  number++;
}
console.log('Sum:', sum);

// Using do...while loop to find the first number greater than 10
let num = 1;

do {
  num *= 2;
} while (num <= 10);

console.log('First number greater than 10:', num);
```

---

### **3. Functions**

#### **Function Declaration and Expression**

**1. Function Declaration**
- Defines a function with a name and a block of code. Can be called before or after its definition due to hoisting.

```javascript
// Function Declaration
function greet(name) {
  return `Hello, ${name}!`;
}

// Calling the function
console.log(greet('Alice')); // Output: Hello, Alice!
```

**2. Function Expression**
- Defines a function as part of an expression. Cannot be called before its definition because it's not hoisted.

```javascript
// Function Expression
const add = function(x, y) {
  return x + y;
};

// Calling the function
console.log(add(5, 3)); // Output: 8
```

**Sample Program:**

```javascript
// Function Declaration
function multiply(a, b) {
  return a * b;
}

// Function Expression
const divide = function(a, b) {
  if (b !== 0) {
    return a / b;
  } else {
    return 'Cannot divide by zero';
  }
};

// Calling functions
console.log(multiply(4, 5));   // Output: 20
console.log(divide(10, 2));    // Output: 5
console.log(divide(10, 0));    // Output: Cannot divide by zero
```

#### **Arrow Functions**

- A shorter syntax for writing functions. Introduced in ES6.
- Does not have its own `this`, `arguments`, `super`, or `new.target`.

```javascript
// Traditional Function
const square = function(n) {
  return n * n;
};

// Arrow Function
const squareArrow = (n) => n * n;

// Calling the functions
console.log(square(4));       // Output: 16
console.log(squareArrow(4));  // Output: 16
```

- **Single Parameter**: Parentheses can be omitted.

```javascript
const double = x => x * 2;
console.log(double(5)); // Output: 10
```

- **No Parameters**: Use empty parentheses.

```javascript
const greet = () => 'Hello!';
console.log(greet()); // Output: Hello!
```

- **Multi-Line Body**: Use curly braces and `return` keyword.

```javascript
const add = (x, y) => {
  let result = x + y;
  return result;
};

console.log(add(3, 7)); // Output: 10
```

**Sample Program:**

```javascript
// Arrow Function with multiple lines
const calculateTotal = (price, tax) => {
  const total = price + (price * tax);
  return total;
};

console.log(calculateTotal(100, 0.15)); // Output: 115

// Arrow Function with implicit return
const greet = name => `Hi, ${name}!`;

console.log(greet('Bob')); // Output: Hi, Bob!
```

#### **Scope and Closures**

**1. Scope**
- **Global Scope**: Variables declared outside functions are in the global scope.

```javascript
let globalVar = 'I am global';

function showGlobal() {
  console.log(globalVar);
}

showGlobal(); // Output: I am global
```

- **Local Scope**: Variables declared within a function are local to that function.

```javascript
function localScope() {
  let localVar = 'I am local';
  console.log(localVar);
}

localScope(); // Output: I am local
console.log(localVar); // Error: localVar is not defined
```

**2. Closures**
- A closure is a function that retains access to its lexical scope, even when the function is executed outside that scope.

```javascript
function makeCounter() {
  let count = 0;
  return function() {
    count += 1;
    return count;
  };
}

const counter = makeCounter();

console.log(counter()); // Output: 1
console.log(counter()); // Output: 2
console.log(counter()); // Output: 3
```

**Sample Program:**

```javascript
// Closure Example
function createMultiplier(multiplier) {
  return function(number) {
    return number * multiplier;
  };
}

const double = createMultiplier(2);
const triple = createMultiplier(3);

console.log(double(5)); // Output: 10
console.log(triple(5)); // Output: 15

// Nested Function with Scope
function outerFunction() {
  let outerVar = 'I am outside';
  function innerFunction() {
    let innerVar = 'I am inside';
    console.log(outerVar); // Accesses outerVar
    console.log(innerVar); // Accesses innerVar
  }
  innerFunction();
  console.log(outerVar); // Accesses outerVar
  console.log(innerVar); // Error: innerVar is not defined
}

outerFunction();
```

---

### **4. Objects and Arrays**

#### **Creating and Manipulating Objects**

**1. Creating Objects**
- Objects are collections of key-value pairs.

```javascript
// Using object literal syntax
const person = {
  name: 'Alice',
  age: 30,
  isStudent: false
};

// Using the `new Object()` syntax
const car = new Object();
car.make = 'Toyota';
car.model = 'Camry';
car.year = 2021;
```

**2. Accessing Object Properties**
- Use dot notation or bracket notation.

```javascript
console.log(person.name);    // Output: Alice
console.log(person['age']);  // Output: 30
```

**3. Modifying Object Properties**
- Change existing properties or add new ones.

```javascript
person.age = 31;            // Update existing property
person.country = 'USA';    // Add new property

console.log(person.age);    // Output: 31
console.log(person.country); // Output: USA
```

**4. Deleting Object Properties**
- Use the `delete` operator.

```javascript
delete person.isStudent;
console.log(person.isStudent); // Output: undefined
```

**5. Iterating Over Object Properties**
- Use `for...in` loop or `Object.keys()`.

```javascript
for (let key in person) {
  console.log(`${key}: ${person[key]}`);
}

// Using Object.keys()
Object.keys(person).forEach(key => {
  console.log(`${key}: ${person[key]}`);
});
```

**Sample Program:**

```javascript
const book = {
  title: 'JavaScript Essentials',
  author: 'John Doe',
  year: 2022,
  getSummary: function() {
    return `${this.title} by ${this.author}`;
  }
};

console.log(book.title);         // Output: JavaScript Essentials
console.log(book['year']);       // Output: 2022
console.log(book.getSummary());  // Output: JavaScript Essentials by John Doe

book.year = 2023;                // Update year
book.publisher = 'Tech Books';   // Add new property

console.log(book.year);          // Output: 2023
console.log(book.publisher);     // Output: Tech Books
```

#### **Arrays and Array Methods**

**1. Creating Arrays**
- Arrays are ordered lists of values.

```javascript
// Using array literal syntax
const numbers = [1, 2, 3, 4, 5];

// Using the `new Array()` syntax
const colors = new Array('red', 'green', 'blue');
```

**2. Accessing Array Elements**
- Use index notation.

```javascript
console.log(numbers[0]);  // Output: 1
console.log(colors[2]);  // Output: blue
```

**3. Modifying Array Elements**
- Update elements by index.

```javascript
numbers[1] = 10;
console.log(numbers[1]); // Output: 10
```

**4. Array Methods**

- **`push()`**: Adds one or more elements to the end of an array.

```javascript
numbers.push(6);
console.log(numbers); // Output: [1, 10, 3, 4, 5, 6]
```

- **`pop()`**: Removes the last element from an array and returns it.

```javascript
let lastNumber = numbers.pop();
console.log(lastNumber); // Output: 6
console.log(numbers);   // Output: [1, 10, 3, 4, 5]
```

- **`map()`**: Creates a new array with the results of calling a provided function on every element in the calling array.

```javascript
const doubled = numbers.map(x => x * 2);
console.log(doubled); // Output: [2, 20, 6, 8, 10]
```

- **`filter()`**: Creates a new array with all elements that pass the test implemented by the provided function.

```javascript
const evenNumbers = numbers.filter(x => x % 2 === 0);
console.log(evenNumbers); // Output: [10, 4]
```

- **`reduce()`**: Executes a reducer function (that you provide) on each element of the array, resulting in a single output value.

```javascript
const sum = numbers.reduce((accumulator, current) => accumulator + current, 0);
console.log(sum); // Output: 23
```

**Sample Program:**

```javascript
// Creating and manipulating arrays
const fruits = ['apple', 'banana', 'cherry'];

// Adding elements
fruits.push('date');
console.log(fruits); // Output: ['apple', 'banana', 'cherry', 'date']

// Removing elements
let removedFruit = fruits.pop();
console.log(removedFruit); // Output: date
console.log(fruits);      // Output: ['apple', 'banana', 'cherry']

// Mapping elements
const upperFruits = fruits.map(fruit => fruit.toUpperCase());
console.log(upperFruits); // Output: ['APPLE', 'BANANA', 'CHERRY']

// Filtering elements
const shortFruits = fruits.filter(fruit => fruit.length < 6);
console.log(shortFruits); // Output: ['apple', 'banana']

// Reducing elements
const totalLength = fruits.reduce((total, fruit) => total + fruit.length, 0);
console.log(totalLength); // Output: 16
```

---

### **5. DOM Manipulation**

#### **Selecting and Modifying Elements**

**1. Selecting Elements**

- **`getElementById()`**: Selects an element by its ID.

```javascript
const element = document.getElementById('myElement');
```

- **`getElementsByClassName()`**: Selects elements by their class name. Returns a live HTMLCollection.

```javascript
const elements = document.getElementsByClassName('myClass');
```

- **`getElementsByTagName()`**: Selects elements by their tag name. Returns a live HTMLCollection.

```javascript
const paragraphs = document.getElementsByTagName('p');
```

- **`querySelector()`**: Selects the first element that matches a CSS selector.

```javascript
const firstButton = document.querySelector('button');
const specificElement = document.querySelector('#myElement');
```

- **`querySelectorAll()`**: Selects all elements that match a CSS selector. Returns a static NodeList.

```javascript
const allButtons = document.querySelectorAll('button');
const allElements = document.querySelectorAll('.myClass');
```

**2. Modifying Elements**

- **Changing Content**: Use `innerHTML` or `textContent`.

```javascript
const element = document.getElementById('myElement');
element.innerHTML = '<strong>Updated Content</strong>';
element.textContent = 'Just text content';
```

- **Changing Attributes**: Use `setAttribute()` and `getAttribute()`.

```javascript
const link = document.querySelector('a');
link.setAttribute('href', 'https://www.example.com');
console.log(link.getAttribute('href')); // Output: https://www.example.com
```

- **Changing Style**: Use the `style` property.

```javascript
const box = document.querySelector('.box');
box.style.backgroundColor = 'blue';
box.style.width = '200px';
box.style.height = '100px';
```

- **Adding/Removing Elements**: Use `appendChild()`, `insertBefore()`, and `removeChild()`.

```javascript
const newDiv = document.createElement('div');
newDiv.textContent = 'New Div';
document.body.appendChild(newDiv);

const existingDiv = document.querySelector('.box');
document.body.removeChild(existingDiv);
```

**Sample Program:**

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>DOM Manipulation</title>
  <style>
    .box {
      width: 100px;
      height: 100px;
      background-color: red;
    }
  </style>
</head>
<body>
  <div id="myElement">Original Content</div>
  <button id="myButton">Click me</button>
  <div class="box"></div>

  <script>
    // Selecting and modifying elements
    const element = document.getElementById('myElement');
    element.textContent = 'Updated Content';

    const button = document.getElementById('myButton');
    button.style.backgroundColor = 'green';

    const box = document.querySelector('.box');
    box.style.backgroundColor = 'blue';
  </script>
</body>
</html>
```

#### **Event Handling**

**1. Click Event**

```javascript
const button = document.getElementById('myButton');
button.addEventListener('click', () => {
  alert('Button clicked!');
});
```

**2. Change Event**

- Typically used with form elements.

```javascript
const input = document.querySelector('input[type="text"]');
input.addEventListener('change', (event) => {
  console.log('Input changed to:', event.target.value);
});
```

**3. Submit Event**

- Used with forms.

```javascript
const form = document.querySelector('form');
form.addEventListener('submit', (event) => {
  event.preventDefault(); // Prevents form from submitting
  console.log('Form submitted!');
});
```

**Sample Program:**

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Event Handling</title>
</head>
<body>
  <button id="myButton">Click me</button>
  <input type="text" placeholder="Type something...">
  <form id="myForm">
    <input type="text" name="username" placeholder="Enter your username">
    <button type="submit">Submit</button>
  </form>

  <script>
    // Click Event
    const button = document.getElementById('myButton');
    button.addEventListener('click', () => {
      alert('Button clicked!');
    });

    // Change Event
    const input = document.querySelector('input[type="text"]');
    input.addEventListener('change', (event) => {
      console.log('Input changed to:', event.target.value);
    });

    // Submit Event
    const form = document.getElementById('myForm');
    form.addEventListener('submit', (event) => {
      event.preventDefault(); // Prevent form from submitting
      console.log('Form submitted!');
    });
  </script>
</body>
</html>
```

#### **Event Delegation**

- **Concept**: Instead of adding event listeners to multiple child elements, add a single event listener to a parent element. This is useful for dynamically added elements.

```javascript
document.body.addEventListener('click', (event) => {
  if (event.target && event.target.matches('button')) {
    alert('Button inside body clicked!');
  }
});
```

**Sample Program:**

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Event Delegation</title>
</head>
<body>
  <div id="parentDiv">
    <button>Button 1</button>
    <button>Button 2</button>
    <button>Button 3</button>
  </div>

  <script>
    // Event Delegation
    document.getElementById('parentDiv').addEventListener('click', (event) => {
      if (event.target && event.target.matches('button')) {
        alert(`Button ${event.target.textContent} clicked!`);
      }
    });
  </script>
</body>
</html>
```

---

### **6. JavaScript and HTML Forms**

#### **Form Validation**

**1. Basic Validation with HTML5**

HTML5 provides built-in validation features such as `required`, `minlength`, `maxlength`, `pattern`, and `type`.

```html
<form id="myForm">
  <label for="name">Name:</label>
  <input type="text" id="name" name="name" required minlength="3" placeholder="Enter your name">

  <label for="email">Email:</label>
  <input type="email" id="email" name="email" required placeholder="Enter your email">

  <button type="submit">Submit</button>
</form>
```

**2. Custom Validation with JavaScript**

JavaScript allows you to create more complex validation rules and display custom error messages.

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Form Validation</title>
  <style>
    .error {
      color: red;
    }
  </style>
</head>
<body>
  <form id="myForm">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" placeholder="Enter your name">
    <span id="nameError" class="error"></span><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" placeholder="Enter your email">
    <span id="emailError" class="error"></span><br>

    <button type="submit">Submit</button>
  </form>

  <script>
    document.getElementById('myForm').addEventListener('submit', function(event) {
      event.preventDefault(); // Prevent form submission

      // Clear previous error messages
      document.getElementById('nameError').textContent = '';
      document.getElementById('emailError').textContent = '';

      // Get form values
      const name = document.getElementById('name').value;
      const email = document.getElementById('email').value;
      let isValid = true;

      // Validate name
      if (name.length < 3) {
        document.getElementById('nameError').textContent = 'Name must be at least 3 characters long.';
        isValid = false;
      }

      // Validate email
      if (!email.includes('@')) {
        document.getElementById('emailError').textContent = 'Email must contain "@" symbol.';
        isValid = false;
      }

      // Submit form if valid
      if (isValid) {
        alert('Form submitted successfully!');
        // You can submit the form data using AJAX or other methods here
      }
    });
  </script>
</body>
</html>
```

#### **Handling Form Submissions**

**1. Basic Form Submission**

Forms can be submitted using the default form submission method, which sends data to the server.

```html
<form action="/submit" method="POST">
  <label for="name">Name:</label>
  <input type="text" id="name" name="name" required><br>

  <label for="email">Email:</label>
  <input type="email" id="email" name="email" required><br>

  <button type="submit">Submit</button>
</form>
```

**2. Handling Form Submission with JavaScript**

You can handle form submissions using JavaScript to send data via AJAX or manipulate the form data before submission.

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Form Submission</title>
</head>
<body>
  <form id="myForm">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br>

    <button type="submit">Submit</button>
  </form>

  <script>
    document.getElementById('myForm').addEventListener('submit', function(event) {
      event.preventDefault(); // Prevent default form submission

      // Gather form data
      const formData = new FormData(this);

      // Convert form data to a JSON object
      const data = {};
      formData.forEach((value, key) => {
        data[key] = value;
      });

      // Send data using Fetch API
      fetch('/submit', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
      })
      .then(response => response.json())
      .then(result => {
        console.log('Success:', result);
        alert('Form submitted successfully!');
      })
      .catch(error => {
        console.error('Error:', error);
      });
    });
  </script>
</body>
</html>
```

**3. Using `fetch` for Form Submission**

The `fetch` API is used to make HTTP requests and can be used to send form data asynchronously.

```javascript
// Example of sending form data using Fetch API
const form = document.getElementById('myForm');

form.addEventListener('submit', function(event) {
  event.preventDefault(); // Prevent default form submission

  // Create FormData object
  const formData = new FormData(form);

  // Send form data using Fetch API
  fetch('/submit', {
    method: 'POST',
    body: formData
  })
  .then(response => response.json())
  .then(result => {
    console.log('Success:', result);
    alert('Form submitted successfully!');
  })
  .catch(error => {
    console.error('Error:', error);
  });
});
```

**4. Using `XMLHttpRequest` for Form Submission**

An older way to handle form submissions before the `fetch` API.

```javascript
const form = document.getElementById('myForm');

form.addEventListener('submit', function(event) {
  event.preventDefault(); // Prevent default form submission

  const xhr = new XMLHttpRequest();
  xhr.open('POST', '/submit', true);
  xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

  xhr.onload = function() {
    if (xhr.status === 200) {
      console.log('Success:', xhr.responseText);
      alert('Form submitted successfully!');
    } else {
      console.error('Error:', xhr.statusText);
    }
  };

  // Convert FormData to URL-encoded string
  const formData = new FormData(form);
  const urlEncodedData = new URLSearchParams(formData).toString();

  xhr.send(urlEncodedData);
});
```
---

### **7. Error Handling**

#### **1. `try`, `catch`, and `finally`**

**1.1 `try` Block**

- The `try` block is used to write code that may throw an error. This block contains code that you want to execute, and it is monitored for errors.

```javascript
try {
  // Code that may throw an error
  let result = riskyOperation();
} 
```

**1.2 `catch` Block**

- The `catch` block handles errors thrown from the `try` block. It contains code to handle the error, and it is executed if an error occurs.

```javascript
try {
  // Code that may throw an error
  let result = riskyOperation();
} catch (error) {
  // Code to handle the error
  console.error('An error occurred:', error.message);
}
```

**1.3 `finally` Block**

- The `finally` block executes code after the `try` and `catch` blocks, regardless of whether an error was thrown or not. It is useful for cleanup operations.

```javascript
try {
  // Code that may throw an error
  let result = riskyOperation();
} catch (error) {
  // Code to handle the error
  console.error('An error occurred:', error.message);
} finally {
  // Code that always runs
  console.log('Cleanup code runs here.');
}
```

**Sample Program:**

```javascript
function divide(a, b) {
  try {
    if (b === 0) {
      throw new Error('Division by zero is not allowed.');
    }
    return a / b;
  } catch (error) {
    console.error('Error:', error.message);
    return null;
  } finally {
    console.log('Operation complete.');
  }
}

console.log(divide(10, 2)); // Output: 5
console.log(divide(10, 0)); // Output: Error: Division by zero is not allowed. \n Operation complete. \n null
```

#### **2. Custom Error Objects**

**2.1 Creating Custom Error Objects**

- Custom error objects can be created by extending the built-in `Error` class. This allows you to create errors with specific names and additional properties.

```javascript
class CustomError extends Error {
  constructor(message, code) {
    super(message);
    this.name = 'CustomError'; // Custom name for the error
    this.code = code; // Additional property to store error codes
  }
}

function riskyFunction() {
  throw new CustomError('Something went wrong!', 500);
}

try {
  riskyFunction();
} catch (error) {
  if (error instanceof CustomError) {
    console.error(`Custom Error: ${error.message} (Code: ${error.code})`);
  } else {
    console.error('An unexpected error occurred:', error.message);
  }
}
```

**2.2 Using Custom Errors**

- You can use custom errors to handle specific types of errors and provide more detailed error information.

**Sample Program:**

```javascript
class ValidationError extends Error {
  constructor(message, field) {
    super(message);
    this.name = 'ValidationError'; // Custom name for the error
    this.field = field; // Additional property to store the field related to the error
  }
}

function validateUser(user) {
  if (!user.email.includes('@')) {
    throw new ValidationError('Invalid email address.', 'email');
  }
  if (user.password.length < 6) {
    throw new ValidationError('Password must be at least 6 characters long.', 'password');
  }
}

const user = {
  email: 'invalid-email',
  password: 'short'
};

try {
  validateUser(user);
} catch (error) {
  if (error instanceof ValidationError) {
    console.error(`Validation Error: ${error.message} (Field: ${error.field})`);
  } else {
    console.error('An unexpected error occurred:', error.message);
  }
}
```

**2.3 Error Stack Traces**

- Error objects in JavaScript have a `stack` property that provides a stack trace of the error. This can be useful for debugging.

```javascript
function generateError() {
  throw new Error('This is a standard error.');
}

try {
  generateError();
} catch (error) {
  console.error('Error message:', error.message);
  console.error('Stack trace:', error.stack);
}
```

---