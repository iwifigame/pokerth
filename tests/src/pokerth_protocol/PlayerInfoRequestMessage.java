
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
    @ASN1BoxedType ( name = "PlayerInfoRequestMessage" )
    public class PlayerInfoRequestMessage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "PlayerInfoRequestMessage" , isSet = false )
       public static class PlayerInfoRequestMessageSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "playerId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonZeroId playerId = null;
                
  
        
        public NonZeroId getPlayerId () {
            return this.playerId;
        }

        

        public void setPlayerId (NonZeroId value) {
            this.playerId = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_PlayerInfoRequestMessageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_PlayerInfoRequestMessageSequenceType = CoderFactory.getInstance().newPreparedElementData(PlayerInfoRequestMessageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "PlayerInfoRequestMessage", isOptional =  false , hasTag =  true, tag = 8, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private PlayerInfoRequestMessageSequenceType  value;        

        
        
        public PlayerInfoRequestMessage () {
        }
        
        
        
        public void setValue(PlayerInfoRequestMessageSequenceType value) {
            this.value = value;
        }
        
        
        
        public PlayerInfoRequestMessageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(PlayerInfoRequestMessage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            