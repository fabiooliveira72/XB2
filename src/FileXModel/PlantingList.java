/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package FileXModel;

/**
 *
 * @author Jazzy
 */
public class PlantingList extends ManagementList {
   
    public ModelXBase Clone(int sourceIndex, String newName){
        Planting source = (Planting) modelList.get(sourceIndex);
        Planting newSource = null;
        
        try{
            newSource = source.clone();
            newSource.PLNAME = newName;
        }
        catch(Exception ex){
            
        }
        
        return newSource;
    }

    @Override
    public ModelXBase AddNew(String name) {
        Planting model = new Planting(name);
        modelList.add(model);
        return model;
    }
}
