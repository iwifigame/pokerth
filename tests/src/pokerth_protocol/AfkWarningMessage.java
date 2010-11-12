
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
    @ASN1BoxedType ( name = "AfkWarningMessage" )
    public class AfkWarningMessage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "AfkWarningMessage" , isSet = false )
       public static class AfkWarningMessageSequenceType implements IASN1PreparedElement {
                @ASN1Integer( name = "" )
    
        @ASN1Element ( name = "remainingTimeouts", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Long remainingTimeouts = null;
                
  
        
        public Long getRemainingTimeouts () {
            return this.remainingTimeouts;
        }

        

        public void setRemainingTimeouts (Long value) {
            this.remainingTimeouts = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_AfkWarningMessageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_AfkWarningMessageSequenceType = CoderFactory.getInstance().newPreparedElementData(AfkWarningMessageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "AfkWarningMessage", isOptional =  false , hasTag =  true, tag = 134, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private AfkWarningMessageSequenceType  value;        

        
        
        public AfkWarningMessage () {
        }
        
        
        
        public void setValue(AfkWarningMessageSequenceType value) {
            this.value = value;
        }
        
        
        
        public AfkWarningMessageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(AfkWarningMessage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            