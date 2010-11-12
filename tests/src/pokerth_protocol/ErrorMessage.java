
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
    @ASN1BoxedType ( name = "ErrorMessage" )
    public class ErrorMessage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "ErrorMessage" , isSet = false )
       public static class ErrorMessageSequenceType implements IASN1PreparedElement {
                

    @ASN1PreparedElement
    @ASN1Enum (
        name = "ErrorReasonEnumType"
    )
    public static class ErrorReasonEnumType implements IASN1PreparedElement {        
        public enum EnumType {
            
            @ASN1EnumItem ( name = "errorReserved", hasTag = true , tag = 0 )
            errorReserved , 
            @ASN1EnumItem ( name = "errorInitVersionNotSupported", hasTag = true , tag = 1 )
            errorInitVersionNotSupported , 
            @ASN1EnumItem ( name = "errorInitServerFull", hasTag = true , tag = 2 )
            errorInitServerFull , 
            @ASN1EnumItem ( name = "errorInitAuthFailure", hasTag = true , tag = 3 )
            errorInitAuthFailure , 
            @ASN1EnumItem ( name = "errorInitPlayerNameInUse", hasTag = true , tag = 4 )
            errorInitPlayerNameInUse , 
            @ASN1EnumItem ( name = "errorInitInvalidPlayerName", hasTag = true , tag = 5 )
            errorInitInvalidPlayerName , 
            @ASN1EnumItem ( name = "errorInitServerMaintenance", hasTag = true , tag = 6 )
            errorInitServerMaintenance , 
            @ASN1EnumItem ( name = "errorInitBlocked", hasTag = true , tag = 7 )
            errorInitBlocked , 
            @ASN1EnumItem ( name = "errorAvatarTooLarge", hasTag = true , tag = 8 )
            errorAvatarTooLarge , 
            @ASN1EnumItem ( name = "errorInvalidPacket", hasTag = true , tag = 256 )
            errorInvalidPacket , 
            @ASN1EnumItem ( name = "errorInvalidState", hasTag = true , tag = 257 )
            errorInvalidState , 
            @ASN1EnumItem ( name = "errorKickedFromServer", hasTag = true , tag = 258 )
            errorKickedFromServer , 
            @ASN1EnumItem ( name = "errorBannedFromServer", hasTag = true , tag = 259 )
            errorBannedFromServer , 
            @ASN1EnumItem ( name = "errorBlockedByServer", hasTag = true , tag = 260 )
            errorBlockedByServer , 
            @ASN1EnumItem ( name = "errorSessionTimeout", hasTag = true , tag = 261 )
            errorSessionTimeout
        }
        
        private EnumType value;
        private Integer integerForm;
        
        public EnumType getValue() {
            return this.value;
        }
        
        public void setValue(EnumType value) {
            this.value = value;
        }
        
        public Integer getIntegerForm() {
            return integerForm;
        }
        
        public void setIntegerForm(Integer value) {
            integerForm = value;
        }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ErrorReasonEnumType.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

    }
                
        @ASN1Element ( name = "errorReason", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private ErrorReasonEnumType errorReason = null;
                
  
        
        public ErrorReasonEnumType getErrorReason () {
            return this.errorReason;
        }

        

        public void setErrorReason (ErrorReasonEnumType value) {
            this.errorReason = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ErrorMessageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_ErrorMessageSequenceType = CoderFactory.getInstance().newPreparedElementData(ErrorMessageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "ErrorMessage", isOptional =  false , hasTag =  true, tag = 255, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ErrorMessageSequenceType  value;        

        
        
        public ErrorMessage () {
        }
        
        
        
        public void setValue(ErrorMessageSequenceType value) {
            this.value = value;
        }
        
        
        
        public ErrorMessageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ErrorMessage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            