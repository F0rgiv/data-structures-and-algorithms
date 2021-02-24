'use strict';

/* ------------------------------------------------------------------------------------------------
CHALLENGE 1 - Review

Write a function named replaceZeros that, given a string, uses Regex to replace all '0' with the word 'zero'. 
------------------------------------------------------------------------------------------------ */

const replaceZeros = (string) => {
  // replace using regex to find the str
  const regex = /0/g;
  return string.replace(regex, 'zero');
}

/* ------------------------------------------------------------------------------------------------
CHALLENGE 2

Write a function named addOne that, given an array of numbers, uses map to return a new array with each value simply incremented by 1. 
------------------------------------------------------------------------------------------------ */

const addOne = (arr) => {
  // return new array that's output from map after adding 1 to each int.
  return arr.map(num => num + 1);
}

/* ------------------------------------------------------------------------------------------------
CHALLENGE 3

Write a function named addQuestion that, given an array of strings, uses map to return a new array containing each string followed by a question mark character.
------------------------------------------------------------------------------------------------ */

const addQuestion = (arr) => {
  // return new array that's output from map after adding ? to each string
  return arr.map(str => `${str}?`);
}

/* ------------------------------------------------------------------------------------------------
CHALLENGE 4

Write a function named forLoopTwoToThe that, given an array of integers as input, iterates over the array and returns a new array. The returned array should contain the result of raising 2 to the power of the original input element.

You may choose to complete this challenge using a for loop, for...in syntax, or for...of syntax.

For example, twoToThe([1,2,3]) returns [2,4,8] because 2 ^ 1 = 2, 2 ^ 2 = 4, and 2 ^ 3 = 8.
------------------------------------------------------------------------------------------------ */

const forLoopTwoToThe = (arr) => {
  //create result
  const result = [];
  //use for loop
  for (let i = 0; i < arr.length; i++) {
    const num = arr[i];
    // push num ^ 2 to the result array
    result.push(Math.pow(2, num))
  }
  //return the result array
  return result;
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 5

Write a function named forEachTwoToThe that produces the same output as your forLoopTwoToThe function from challenge 1, but uses forEach instead of a for loop.
------------------------------------------------------------------------------------------------ */

const forEachTwoToThe = (arr) => {
  //create result
  const result = [];
  //use for loop
  arr.forEach(num => {
    // push num ^ 2 to the result array
    result.push(Math.pow(2, num))
  });
  //return the result array
  return result;
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 6

Write a function named mapTwoToThe that produces the same output as your forLoopTwoToThe function from challenge 1 and your forEachTwoToThe function from challenge 2, but uses map instead of a for loop or forEach.
------------------------------------------------------------------------------------------------ */

const mapTwoToThe = (arr) => {
  return arr.map(num => Math.pow(2, num))
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 7 - Stretch Goal

Write a function named charCode that, given an array of letters as an input, uses map to return a new array where each element is the result of the `charCodeAt` method on the original array element.

Read the MDN documentation on String.charCodeAt() if necessary.

For example: charCode(['h','i']) returns [104, 105].
------------------------------------------------------------------------------------------------ */

const charCode = (arr) => {
  // return arr of char values using map and charCodeAt()
  return arr.map(str => str.charCodeAt())
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 8 - Stretch Goal

Write a function that, given an array of numbers as input, uses map to return a new array where each element is either the string "even" or the string "odd", based on each value.

If any element in the array is not a number, the resulting array should have the string "N/A" in its place.

For example: evenOdd([1,2,3]) returns ['odd','even','odd'].
------------------------------------------------------------------------------------------------ */

function isEven(num) {
  //number % 2 === 0 is even
  //validate it's a number
  if (typeof num === 'number') {
    //if it's even
    if (num % 2 === 0) {
      return "even"
    }// else it's odd 
    else {
      return "odd"
    }

  } //else it's not a num
  else {
    return "N/A"
  }
}

const evenOdd = (arr) => {
  // use map to return arr of values base on isEven
  return arr.map(isEven)
};


/* ------------------------------------------------------------------------------------------------
CHALLENGE 9 - Stretch Goal

Use the snorlaxAbilities data, below, for this challenge.

Write a function named extractAbilities that, given the array of abilities, uses map to create an array containing only the ability name.

Note: Because this function is expecting the array of abilities, it will be invoked as:
extractAbilities(snorlaxAbilities.abilities)
------------------------------------------------------------------------------------------------ */

const snorlaxAbilities = {
  abilities: [
    {
      slot: 3,
      is_hidden: true,
      ability: {
        url: 'https://pokeapi.co/api/v2/ability/82/',
        name: 'gluttony',
      },
    },
    {
      slot: 2,
      is_hidden: false,
      ability: {
        url: 'https://pokeapi.co/api/v2/ability/56/',
        name: 'cute charm',
      },
    },
    {
      slot: 1,
      is_hidden: false,
      ability: {
        url: 'https://pokeapi.co/api/v2/ability/17/',
        name: 'immunity',
      },
    },
  ],
  name: 'snorlax',
  weight: 4600,
};

const extractAbilities = (arr) => {
  // iterate through each ability and get the ability name
  return arr.map(ability => ability.ability.name)
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 10 - Stretch Goal

Use the snorlaxStats data, below, for this challenge.

Write a function named extractStats that, given an array of stats, uses map to return an array of objects containing the stat name and the total.

The total should be the sum of the effort and the baseStat.

Here is an example of a single array element: { name: 'speed', total: 35 }
------------------------------------------------------------------------------------------------ */

const snorlaxStats = {
  stats: [
    {
      stat: {
        url: 'https://pokeapi.co/api/v2/stat/6/',
        name: 'speed',
      },
      effort: 5,
      baseStat: 30,
    },
    {
      stat: {
        url: 'https://pokeapi.co/api/v2/stat/5/',
        name: 'special-defense',
      },
      effort: 2,
      baseStat: 110,
    },
    {
      stat: {
        url: 'https://pokeapi.co/api/v2/stat/4/',
        name: 'special-attack',
      },
      effort: 9,
      baseStat: 65,
    },
  ],
  name: 'snorlax',
  weight: 4600,
};

const extractStats = (arr) => {
  // use map to grab each needed value
  return arr.map(stat => {
    //return a obj with both name and total.
    return{
      name: stat.stat.name,
      total: (stat.effort + stat.baseStat)
    }
  })
};

/* ------------------------------------------------------------------------------------------------
TESTS

All the code below will verify that your functions are working to solve the challenges.

DO NOT CHANGE any of the below code.

Run your tests from the console: jest challenges-07.test.js

------------------------------------------------------------------------------------------------ */

describe('Testing challenge 1', () => {
  test('It should replace all the 0\'s with the word "zero"', () => {
    expect(replaceZeros('301 is s0 much fun!')).toStrictEqual('3zero1 is szero much fun!');
  });
});

describe('Testing challenge 2', () => {
  test('It should add one to all the numbers in the array', () => {
    expect(addOne([2, 3, 5, 11])).toStrictEqual([3, 4, 6, 12]);
  });
});

describe('Testing challenge 3', () => {
  test('It should add a question mark to the end of each string', () => {
    expect(addQuestion(['hello', '301', 'students'])).toStrictEqual(['hello?', '301?', 'students?']);
  });
});

describe('Testing challenge 4', () => {
  test('It should return two raised to the power of the integer', () => {
    expect(forLoopTwoToThe([0, 4, 5])).toStrictEqual([1, 16, 32]);
    expect(forLoopTwoToThe([0, 4, 5]).length).toStrictEqual(3);
  });

  test('It should return decimals if the integer is negative', () => {
    expect(forLoopTwoToThe([-1, -2, -3])).toStrictEqual([0.5, 0.25, 0.125]);
  });
});

describe('Testing challenge 5', () => {
  test('It should return two raised to the power of the integer', () => {
    expect(forEachTwoToThe([0, 4, 5])).toStrictEqual([1, 16, 32]);
    expect(forEachTwoToThe([0, 4, 5]).length).toStrictEqual(3);
  });

  test('It should return decimals if the integer is negative', () => {
    expect(forEachTwoToThe([-1, -2, -3])).toStrictEqual([0.5, 0.25, 0.125]);
  });
});

describe('Testing challenge 6', () => {
  test('It should return two raised to the power of the integer', () => {
    expect(mapTwoToThe([0, 4, 5])).toStrictEqual([1, 16, 32]);
    expect(mapTwoToThe([0, 4, 5]).length).toStrictEqual(3);
  });

  test('It should return decimals if the integer is negative', () => {
    expect(mapTwoToThe([-1, -2, -3])).toStrictEqual([0.5, 0.25, 0.125]);
  });
});

describe('Testing challenge 7', () => {
  test('It should return an array containing the character code for each letter', () => {
    expect(charCode(['C', 'o', 'd', 'e', '3', '0', '1'])).toStrictEqual([67, 111, 100, 101, 51, 48, 49]);
    expect(charCode(['C', 'o', 'd', 'e', '3', '0', '1']).length).toStrictEqual(7);
  });
});

describe('Testing challenge 8', () => {
  test('It should return an array containing the keys from an object', () => {
    expect(evenOdd([5, 8, 2, 6, 9, 13, 542, 541])).toStrictEqual(['odd', 'even', 'even', 'even', 'odd', 'odd', 'even', 'odd']);
    expect(evenOdd([5, 8, 2, 6, 9, 13, 542, 541]).length).toStrictEqual(8);
  });

  test('It should work with all odd numbers', () => {
    expect(evenOdd([1, 3, 5, 7, 9])).toStrictEqual(['odd', 'odd', 'odd', 'odd', 'odd']);
    expect(evenOdd([1, 3, 5, 7, 9]).length).toStrictEqual(5);
  });

  test('It should work with all even numbers', () => {
    expect(evenOdd([2, 4, 6, 8, 10])).toStrictEqual(['even', 'even', 'even', 'even', 'even']);
    expect(evenOdd([2, 4, 6, 8, 10]).length).toStrictEqual(5);
  });

  test('It should return the string "N/A" if a non-number is included in the array', () => {
    expect(evenOdd([5, 8, 2, 'hi'])).toStrictEqual(['odd', 'even', 'even', 'N/A']);
    expect(evenOdd([5, 8, 2, 'hi']).length).toStrictEqual(4);
  });
});

describe('Testing challenge 9', () => {
  test('It should return an array containing only the ability names', () => {
    expect(extractAbilities(snorlaxAbilities.abilities)).toStrictEqual(['gluttony', 'cute charm', 'immunity']);
    expect(extractAbilities(snorlaxAbilities.abilities).length).toStrictEqual(3);
  });
});

describe('Testing challenge 10', () => {
  test('It should return an array containing objects with name and total values', () => {
    expect(extractStats(snorlaxStats.stats)).toStrictEqual([
      { name: 'speed', total: 35, },
      { name: 'special-defense', total: 112, },
      { name: 'special-attack', total: 74, },
    ]);
    expect(extractStats(snorlaxStats.stats).length).toStrictEqual(3);
  });
});
