/**
 * "ResponseActionList" Java class is free software: you can redistribute
 * it and/or modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version always keeping
 * the additional terms specified in this license.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 *
 * Additional Terms of this License
 * --------------------------------
 *
 * 1. It is Required the preservation of specified reasonable legal notices
 *   and author attributions in that material and in the Appropriate Legal
 *   Notices displayed by works containing it.
 *
 * 2. It is limited the use for publicity purposes of names of licensors or
 *   authors of the material.
 *
 * 3. It is Required indemnification of licensors and authors of that material
 *   by anyone who conveys the material (or modified versions of it) with
 *   contractual assumptions of liability to the recipient, for any liability
 *   that these contractual assumptions directly impose on those licensors
 *   and authors.
 *
 * 4. It is Prohibited misrepresentation of the origin of that material, and it is
 *   required that modified versions of such material be marked in reasonable
 *   ways as different from the original version.
 *
 * 5. It is Declined to grant rights under trademark law for use of some trade
 *   names, trademarks, or service marks.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program (lgpl.txt).  If not, see <http://www.gnu.org/licenses/>
 */

package airs.responses.executor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class represents a list of ResponseAction instances.
 *  
 * @author UPM (member of RECLAMO Development Team)(http://reclamo.inf.um.es)
 * @version 1.0
 */
public class ResponseActionList {
    //Attributes
    private ArrayList<ResponseAction> _list;
    
    //Constructors
    public ResponseActionList(){
        _list = new ArrayList<ResponseAction>();
    }
    
    //Procedures and Functions
    public void AddsResponseAction(ResponseAction newResponseAction){
        if (newResponseAction != null){
            getResponseActionList().add((newResponseAction));
            /*if (Operations.DEBUG_AIRS_EXE){
                System.out.println("Debug: [ResponseActionList] [AddResponseAction] "
                        + "Adding the Response Action: " + newResponseAction.getName());
            }
            return true;*/
        }
        else{
            System.out.println("Error: [ResponseActionList] [AddActionList] "
                + "Unable to add the Response Action:" + newResponseAction.getName());
        }        
    }
    
    public void PrintResponseActionList(){
        Iterator i = getResponseActionList().iterator();
        while(i.hasNext()){   
            ResponseAction response = (ResponseAction)i.next();
            System.out.println(response.toString());
        }
    }
    
    public ResponseAction getExistResponseActions(String valueName){
        ResponseAction response;
        Iterator i = getResponseActionList().iterator();
        while(i.hasNext()){  
            response = (ResponseAction)i.next();
            if (response.getName().equalsIgnoreCase(valueName)){
                return response;
            }
        }
        return null;        
    }
    
    //Properties
    public ArrayList<ResponseAction> getResponseActionList(){
        return _list;
    }
    
    public void setResponseActionList(ArrayList<ResponseAction> value){
        _list = value;
    }
}