function reverse(s) {
  const words = s.split(' '); //split the sentence
  // Reverse each word and store them in an array
  const revword = words.map(word => {
    return word.split('').reverse().join('');
  });
  // Join the reversed words back into a sentence
  const res = revword.join(' ');

  return res;
}

// Example usage
const s = 'This is a sunny day';
const rev = reverse(s);
console.log('Reversed sentence:', rev);
