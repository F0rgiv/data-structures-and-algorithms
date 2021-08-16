/**
 * @param {number[]} nums
 * @return {number}
 * 
 * https://leetcode.com/problems/sum-of-unique-elements/submissions/
 */
 var sumOfUnique = function(nums) {
    //create vars
    let result = 0;
    const numsMap = new Map();
    
    //populate hashSet
    nums.forEach(num => {
        if (numsMap.has(num)) numsMap.set(num, false);
        else numsMap.set(num, true);
    })
    
    //shech whitch one to sum
    numsMap.forEach((val, key) => {
        if (val) result += key;
    })
    
    return result;
};

/**
 * @param {number[][]} grid
 * @return {number}
 * https://leetcode.com/problems/number-of-enclaves/submissions/
 */
 var numEnclaves = function(grid) {
    //loop thorugh the outside
    x = 0;
    while (x < grid.length){
        if (grid[x][0] == 1) calculateLand(x, 0, grid);
        if (grid[x][grid[0].length-1] ==1) calculateLand(x, grid[0].length-1, grid);
        x++;
    }
    y = 1;
    while (y < grid[0].length - 1){
        if (grid[0][y] == 1) calculateLand(0, y, grid);
        if (grid[grid.length-1][y] == 1) calculateLand(grid.length-1, y, grid);
        y++;
    }
    
    //loop through the new grid and see what land is still there
    result = 0
    x=1
    y=1
    while (x < grid.length-1){
        while (y < grid[0].length-1){
            result += grid[x][y]
            y++;
        }
        y=1;
        x++;
    }
    return result;
};
    
function calculateLand(x,y, grid){
    //mark as counted
    grid[x][y] = 0;
    
    //check all around
    //up
    if (y < grid[0].length - 1 && grid[x][y+1] == 1) calculateLand(x ,y+1, grid);
    //down
    if (y > 0 && grid[x][y-1] == 1) calculateLand(x ,y-1, grid);
    //right
    if (x < grid.length - 1 && grid[x+1][y] == 1) calculateLand(x+1 ,y, grid);
    //left
    if (x > 0 && grid[x-1][y] == 1) calculateLand(x-1 ,y, grid);
}

/**
 * @param {number[]} values
 * @param {number[]} labels
 * @param {number} numWanted
 * @param {number} useLimit
 * @return {number}
 https://leetcode.com/problems/largest-values-from-labels/submissions/
 */
 var largestValsFromLabels = function(values, labels, numWanted, useLimit) {
    //sort by value
    sortTwoArraysByOnlyOne(values, labels);
    
    //create map of seen lablels
    const seenLabels = new Map();
    
    //sum up the result.
    let result = 0;
    for (let i = 0; i < values.length && numWanted > 0; i++){
        //ensure this label can be used again and add it if not yet used
        if (!seenLabels.has(labels[i])) seenLabels.set(labels[i], 0);
        if (seenLabels.get(labels[i]) == useLimit) continue;
        
        // do the thing.
        result += values[i];
        numWanted--;
        seenLabels.set(labels[i], seenLabels.get(labels[i])+1)
    }
    return result;
};

function sortTwoArraysByOnlyOne(arr1, arr2){    
 for(var i = 0; i < arr1.length; i++){
   for(var j = 0; j < ( arr1.length - i -1 ); j++){
     // Checking if the item at present iteration 
     // is greater than the next iteration
     if(arr1[j] < arr1[j+1]){
         
        // If the condition is true then swap them in both arrays
        var temp = arr1[j]
        arr1[j] = arr1[j + 1]
        arr1[j+1] = temp
        var temp = arr2[j]
        arr2[j] = arr2[j + 1]
        arr2[j+1] = temp
     }
   }
 }
}