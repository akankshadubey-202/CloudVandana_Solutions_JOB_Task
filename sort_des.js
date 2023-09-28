const numbers = [5, 2, 9, 1, 5, 6];
/*numbers.sort(function(a, b) {
  return a-b; //first sort in ascending order then reverse the array to sort in decending           order
});*/
//directly sort the array in descending order
numbers.sort(function(a, b) {
  return b - a;
});

console.log(numbers);

