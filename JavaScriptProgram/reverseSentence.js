const sentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(sentence);
console.log('Original sentence: ' + sentence);
console.log('Reversed sentence: ' + reversedSentence);

function reverseWordsInSentence(sentence) {
  const words = sentence.split(' ');
  const reversedWords = words.map(reverseWord);
  return reversedWords.join(' ');
}

function reverseWord(word) {
  return word.split('').reverse().join('');
}
