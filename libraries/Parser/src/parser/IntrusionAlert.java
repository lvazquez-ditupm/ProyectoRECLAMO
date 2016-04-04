/**
 * "IntrusionAlert" Java class is free software: you can redistribute
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

package parser;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class represents an intrusion alert generated by one of the sources of 
 * alerts.
 * 
 * @author UPM (member of RECLAMO Development Team)(http://reclamo.inf.um.es)
 * @version 1.0
 */
public class IntrusionAlert {
    private String _intCount;
    private String _intDetectionTime;
    private String _intAlertCreateTime;
    private String _analyzerID;
    private String _intID;
    private String _intType;
    private int _intSeverity;
    private int _intImpact;
    private double _intrusionAlertReliability;
    private String _attackerLocation;
    private String _nextIntID;
    private String _intName;
    private String _intCompletion;
    private ArrayList<IntrusionTarget> _intTarget;
    private ArrayList<IntrusionSource> _intSource;
    private String _protocol;    
    
    public IntrusionAlert(){
        _intCount=null;        
        _intType=null;
        _intAlertCreateTime=null;
        _analyzerID=null;
        _intID=null;
        _intDetectionTime=null;
        _intSeverity=-1;
        _intImpact=-1;
        _intrusionAlertReliability=0.0;
        _attackerLocation=null;
        _nextIntID=null;
        _intName=null;
        _intCompletion=null;
        _intTarget = new ArrayList<IntrusionTarget>();;
        _intSource = new ArrayList<IntrusionSource>();
        _protocol = null;
    }
    
    public IntrusionAlert(String intCount, String intType, String intAlertCreateTime,
            String IDSID, String intID, double confidence){
        _intCount=intCount;        
        _intType=intType;
        _intAlertCreateTime=intAlertCreateTime;
        _analyzerID=IDSID;
        _intID= intID;
        _intrusionAlertReliability=confidence; 
    }
    
    public String getIntCount(){
        return _intCount;
    }     
    
    public String getIntType(){
        return _intType;
    }
    
    public String getIntAlertCreateTime(){
        return _intAlertCreateTime;
    }    
    
    public String getAnalyzerID(){
        return _analyzerID;
    }    
   
    public String getIntID(){
        return _intID;
    } 
    
    public String getIntDetectionTime(){
        return _intDetectionTime;
    }
    
    public ArrayList<IntrusionTarget> getIntrusionTarget(){
        return _intTarget;
    }    
       
    public int getIntSeverity(){
        return _intSeverity;
    }    
    
    public int getIntImpact(){
        return _intImpact;
    }    
    
    public double getIntrusionAlertReliability(){
        return _intrusionAlertReliability;
    }    
    
    public String getAttackerLocation(){
        return _attackerLocation;
    }    
    
    public String getNextIntID(){
        return _nextIntID;
    }
    
    public String getIntName(){
        return _intName;
    } 
    
    public String getIntCompletion(){
        return _intCompletion;
    }
        
    public ArrayList<IntrusionSource> getIntrusionSource(){
        return _intSource;
    }  
    
    public String getProtocol(){
        return _protocol;
    }
    
        
    public void setIntCount(String value){
        _intCount = value;
    } 
    
    public void setIntType(String value){
        _intType = value;
    }   
    
    public void setIntAlertCreateTime(String value){
        _intAlertCreateTime = value;
    }    
    
    public void setAnalyzerID(String value){
        _analyzerID = value;
    }    
    
    public void setIntID(String value){
        _intID = value;
    } 
    
    public void setIntDetectionTime(String value){
        _intDetectionTime = value;
    }
        
    public void setIntrusionTarget(ArrayList<IntrusionTarget> value){
        _intTarget = value;
    }
    
    public void setIntSeverity(int value){
        _intSeverity = value;
    }    
    
    public void setIntImpact(int value){
        _intImpact = value;
    }    
    
    public void setIntrusionAlertReliability(double value){
        _intrusionAlertReliability = value;
    }    
    
    public void setAttackerLocation(String value){
        _attackerLocation = value;
    }    
    
    public void setNextIntID(String value){
        _nextIntID = value;
    }    
    
    public void setIntName(String value){
        _intName = value;
    }
    
    public void setIntCompletion(String value){
        _intCompletion = value;
    }
    
    public void setIntrusionSource(ArrayList<IntrusionSource> value){
        _intSource=value;
    }
    
    public void setProtocol(String value){
        _protocol = value;
    }
    
    public void printAlert(){
        System.out.println("********************ALERTA*************************");
        System.out.println("AttackerLocation: "+getAttackerLocation()+ "; intrusionType: "+getIntType()+ " ; intrusionName: "+ getIntName()+" ; nextIntrusionID: "+getNextIntID()+ " ; intrusionAlertCreateTime: "+getIntAlertCreateTime()+
                " ; intrusionImpact: "+ Integer.toString(getIntImpact())+ " ; intrusionCount: "+ getIntCount()+ " ; IDSconfidence: "+getIntrusionAlertReliability()+ " ; intrusionID: "+
                getIntID() + " ; intrusionDetectionTime: "+ getIntDetectionTime() + " ; intrusionSeverity: "+ Integer.toString(getIntSeverity())+
                " ; protocol: "+getProtocol());
        
        System.out.println("TARGET(s):");
        Iterator it =getIntrusionTarget().iterator();
        while(it.hasNext()){
            IntrusionTarget intru = (IntrusionTarget)it.next();
            String address=intru.getAddressIP();
            int port = intru.getServicePort();
            System.out.println("TargetIP: "+address+" ; targetServicePort: "+port);
        }
        
        System.out.println("SOURCE(s):");
        Iterator itS =getIntrusionSource().iterator();
        while(itS.hasNext()){
            IntrusionSource intru = (IntrusionSource)itS.next();
            String address=intru.getSourceIP();
            int port = intru.getPortSrc();
            System.out.println("SourceIP: "+address+" ; sourcePort: "+port);
        }
               
    }
    
    public boolean isEmpty(){
        if (getIntCount()==null && getIntDetectionTime()==null && getIntAlertCreateTime()==null 
                && getAnalyzerID()==null && getIntID()==null && getIntType()==null && getIntSeverity()==-1
                && getIntImpact()==-1 && getIntrusionAlertReliability()==0.0 && getAttackerLocation()==null
                && getIntrusionTarget() == null && getIntrusionSource() == null && getNextIntID()==null
                && getIntName()==null){
            return true;
        }
        else{
            return false;
        }
    
    }
    
    public boolean validate(){
        if (getIntCount()!=null && getIntAlertCreateTime()!=null && getAnalyzerID()!=null && getIntID()!=null
                && getIntType()!=null && getIntrusionAlertReliability()!=0.0){
            return true;
        }
        else{
            return false;
        }
    }    
    
}