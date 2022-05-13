/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarandomgraph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saafp
 */
public class ListValue {
    int intValue;
    List<Integer> listEdgeValue = new ArrayList<>(0);
            
    ListValue(int v, List<Integer> ev){
            this.intValue = v;
            listEdgeValue.addAll(ev);
            
    }
}