const arr = [5, 2, 9, 1, 5, 6];
console.log("Original Array: " +arr);

function SortDescending(arr) {
    
  
    for (let i = 0; i < arr.length - 1; i++) {
      let maxIndex = i;
  
      for (let j = i + 1; j < arr.length; j++) {
        if (arr[j] > arr[maxIndex]) {
          maxIndex = j;
        }
      }
  
      if (maxIndex !== i) {
        const temp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = temp;
      }
    }
  }
  
  
  SortDescending(arr);
  
  console.log("Array sorted in descending order: " + arr);
  