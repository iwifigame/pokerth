
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
    @ASN1Sequence ( name = "EndOfHandHideCards", isSet = false )
    public class EndOfHandHideCards implements IASN1PreparedElement {
            
        @ASN1Element ( name = "playerId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonZeroId playerId = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 10000000L 
		
	   )
	   
        @ASN1Element ( name = "moneyWon", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Integer moneyWon = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 10000000L 
		
	   )
	   
        @ASN1Element ( name = "playerMoney", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Integer playerMoney = null;
                
  
        
        public NonZeroId getPlayerId () {
            return this.playerId;
        }

        

        public void setPlayerId (NonZeroId value) {
            this.playerId = value;
        }
        
  
        
        public Integer getMoneyWon () {
            return this.moneyWon;
        }

        

        public void setMoneyWon (Integer value) {
            this.moneyWon = value;
        }
        
  
        
        public Integer getPlayerMoney () {
            return this.playerMoney;
        }

        

        public void setPlayerMoney (Integer value) {
            this.playerMoney = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(EndOfHandHideCards.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            