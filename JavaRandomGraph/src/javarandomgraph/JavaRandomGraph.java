/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarandomgraph;

import java.util.*;
import java.io.*;
/**
 *
 * @author saafp
 */

public class JavaRandomGraph {
	public int vertices;
	public int edges, v,w;
	final int VERTICS_LIMIT = 20;
        final int VALUE_RANGE = 100;

	Random random = new Random();
	public List< ListValue > totalList;
        
        

	// Creating the constructor
	public JavaRandomGraph()
	{
		// Creating a list as per Vertics Limit
                // with values range from 1 to  value Range
		// representation for the random graph
		totalList = new ArrayList<>(VERTICS_LIMIT);
                ArrayList ed_list = new ArrayList<>(1);
		for (int i = 0; i < VERTICS_LIMIT; i++)
                {
                    ListValue lv = new ListValue(random.nextInt(VALUE_RANGE), ed_list);
                    totalList.add(lv);
                }
		
                for (int i = 0; i < VERTICS_LIMIT; i++){                 
                    this.edges = random.nextInt(5) + 1;               
                    for (int j = 0; j < this.edges; j++) {
                        v = random.nextInt(VERTICS_LIMIT);
                        w = random.nextInt(VERTICS_LIMIT);
                        if (totalList.get(v).listEdgeValue.contains(w)) {
                            continue;
                        }
                        if ( totalList.get(v).listEdgeValue.size() < 5 && totalList.get(w).listEdgeValue.size() < 5 )
                            addEdge(v, w);
                    }
                }
                
                
	}
        
        
        void addEdge(int v, int w){
            totalList.get(v).listEdgeValue.add(w);
            if (v != w)
                totalList.get(w).listEdgeValue.add(v);
        }
	

	


public static void main(String[] args)
	{
		// Create a GFGRandomGraph object
		JavaRandomGraph randomGraph = new JavaRandomGraph();

		
		System.out.println("The generated random graph :");
                ListValue lv;
		for (int i = 0; i < randomGraph.totalList.size(); i++) {
                          lv = randomGraph.totalList.get(i);
                          System.out.print(i +" have value " + lv.intValue  +" -> { ");
                          if (lv.listEdgeValue.isEmpty())
				System.out.print(" No adjacent vertices ");
                          else {
				int size = lv.listEdgeValue.size();
				for (int j = 0; j < size; j++) {

					System.out.print(lv.listEdgeValue.get(j));
					if (j < size - 1)
						System.out.print(" , ");
				}
			System.out.println("}");
                            }
                }
        }
}

