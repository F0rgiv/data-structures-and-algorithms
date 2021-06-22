# Graph
Implement your own Graph.

## Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

* AddNode()
Adds a new node to the graph
Takes in the value of that node
Returns the added node
* AddEdge()
Adds a new edge between two nodes in the graph
Include the ability to have a “weight”
Takes in the two nodes to be connected by the edge
Both nodes should already be in the Graph
* GetNodes()
Returns all of the nodes in the graph as a collection (set, list, or similar)
* GetNeighbors()
Returns a collection of edges connected to the given node
Takes in a given node
Include the weight of the connection in the returned collection
* getEdge()
Takes in a list of vertexes and attempts to traverse them in that order. In the event that they are successfully traversed it retrun true and the cost or this. else it returns false and 0.      
* Size()
Returns the total number of nodes in the graph
  
* BreadthFist()
Takes in a vertex as it's argument and returns A list of vertexes in the prder they were visited.
  Vertexes are visited using a breadth first traversal.

* DepthFirst()
  Takes in a vertex as it's argument and returns A list of vertexes in the prder they were visited.
  Vertexes are visited using a depth first traversal.


sed to store something otherwise it return false.