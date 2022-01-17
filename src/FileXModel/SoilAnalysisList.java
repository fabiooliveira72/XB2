/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package FileXModel;

import java.util.Vector;

/**
 *
 * @author Jazzy
 */
public class SoilAnalysisList {
    protected Vector soilAnalysis = new Vector();

    public void AddAnalysis(SoilAnalysis soil)
    {
        soilAnalysis.add(soil);
    }

    public void RemoveAt(int level)
    {
        soilAnalysis.remove(level);
    }

    public void SetAt(int level, SoilAnalysis env)
    {
        soilAnalysis.set(level, env);
    }

    public SoilAnalysis[] GetAnalysises()
    {
        return (SoilAnalysis[]) soilAnalysis.toArray();
    }

    public SoilAnalysis GetAnalysis(int level)
    {
        return (SoilAnalysis)soilAnalysis.get(level);
    }

    public int GetSize()
    {
        return soilAnalysis.size();
    }
    
    public SoilAnalysis Clone(int level, String newName){
        SoilAnalysis source = GetAnalysis(level);
        SoilAnalysis newSource = null;
        
        try{
            newSource = source.clone();
            newSource.SANAME = newName;
        }
        catch(Exception ex){
            
        }
        
        return newSource;
    }
}