/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.althome.lightcspsolver.solver.variables;

import com.althome.lightcspsolver.solver.constraints.Constraint;
import com.althome.lightcspsolver.solver.variables.domains.Domain;
import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public interface Variable {
    
    public void instantiateTo(int value);
    
    public void updateLowerBoundTo(int lb);
    
    public void updateUpperBoundTo(int ub);
    
    public void removeValues(int... values);
    
    public void removeValues(int minValue, int maxValue);
    
    public int getLowerBound();
    
    public int getUpperBound();
    
    public int getValue();
    
    public boolean isInstantiated();
    
    public int getCardinality();
    
    public Domain getDomain();
    
    public void addConstraint(Constraint c);
    
    public Variable clone();
    
    public void restoreDomain(Domain d);
    
    public boolean isEmpty();
    
    public boolean contains(int value);
    
    public int nextValue(int value);
    
    public int previousValue(int value);
    
    public ArrayList<Constraint> getConstraints();
    
}
