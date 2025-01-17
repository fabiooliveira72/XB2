/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package FileXModel;

/**
 *
 * @author Jazzy
 */
public class InitialConditionList extends ManagementList {
    
    @Override
    public ModelXBase AddNew(String name) {
        InitialCondition model = new InitialCondition(name);
        modelList.add(model);
        return model;
    }
    
    @Override
    public ModelXBase Clone(int sourceIndex, String newName){
        InitialCondition source = (InitialCondition) modelList.get(sourceIndex);
        InitialCondition newSource = null;
        
        try{
            newSource = new InitialCondition();
            newSource.ICNAME = newName;
            newSource.PCR = source.PCR;
            newSource.ICDAT = source.ICDAT;
            newSource.ICRT = source.ICRT;
            newSource.ICND = source.ICND;
            newSource.ICRN = source.ICRN;
            newSource.ICRE = source.ICRE;
            newSource.ICWD = source.ICWD;
            newSource.ICRES = source.ICRES;
            newSource.ICREN = source.ICREN;
            newSource.ICREP = source.ICREP;
            newSource.ICRIP = source.ICRIP;
            newSource.ICRID = source.ICRID;
            
            for(InitialConditionApplication c : source.GetApps()) {
                InitialConditionApplication ca = (InitialConditionApplication) c.Clone();           
                newSource.AddApp(ca);
            }
        }
        catch(Exception ex){
            
        }
        
        return newSource;
    }
}
