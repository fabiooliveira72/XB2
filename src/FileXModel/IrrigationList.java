/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package FileXModel;

/**
 *
 * @author Jazzy
 */
public class IrrigationList extends ManagementList {
    
    @Override
    public ModelXBase AddNew(String name) {
        Irrigation model = new Irrigation(name);
        modelList.add(model);
        return model;
    }
    
    public ModelXBase Clone(int sourceIndex, String newName){
        Irrigation source = (Irrigation) modelList.get(sourceIndex);
        Irrigation newSource = null;
        
        try{
            newSource = new Irrigation();
            newSource.IRNAME = newName;
            newSource.EFIR = source.EFIR;
            
            for(IrrigationApplication ir : source.GetApps()) {
                IrrigationApplication ia = (IrrigationApplication) ir.Clone();                
                newSource.AddApp(ia);
            }
        }
        catch(Exception ex){
            
        }
        
        return newSource;
    }
}
