
package pokerth_protocol;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "LeaveGameRequestMessage" )
    public class LeaveGameRequestMessage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "LeaveGameRequestMessage" , isSet = false )
       public static class LeaveGameRequestMessageSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "gameId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonZeroId gameId = null;
                
  
        
        public NonZeroId getGameId () {
            return this.gameId;
        }

        

        public void setGameId (NonZeroId value) {
            this.gameId = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_LeaveGameRequestMessageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_LeaveGameRequestMessageSequenceType = CoderFactory.getInstance().newPreparedElementData(LeaveGameRequestMessageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "LeaveGameRequestMessage", isOptional =  false , hasTag =  true, tag = 15, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private LeaveGameRequestMessageSequenceType  value;        

        
        
        public LeaveGameRequestMessage () {
        }
        
        
        
        public void setValue(LeaveGameRequestMessageSequenceType value) {
            this.value = value;
        }
        
        
        
        public LeaveGameRequestMessageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(LeaveGameRequestMessage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            