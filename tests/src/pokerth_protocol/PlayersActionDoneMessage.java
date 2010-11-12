
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
    @ASN1BoxedType ( name = "PlayersActionDoneMessage" )
    public class PlayersActionDoneMessage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "PlayersActionDoneMessage" , isSet = false )
       public static class PlayersActionDoneMessageSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "gameId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonZeroId gameId = null;
                
  
        @ASN1Element ( name = "playerId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonZeroId playerId = null;
                
  
        @ASN1Element ( name = "gameState", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NetGameState gameState = null;
                
  
        @ASN1Element ( name = "playerAction", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NetPlayerAction playerAction = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 10000000L 
		
	   )
	   
        @ASN1Element ( name = "totalPlayerBet", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Integer totalPlayerBet = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 10000000L 
		
	   )
	   
        @ASN1Element ( name = "playerMoney", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Integer playerMoney = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 10000000L 
		
	   )
	   
        @ASN1Element ( name = "highestSet", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Integer highestSet = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 10000000L 
		
	   )
	   
        @ASN1Element ( name = "minimumRaise", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Integer minimumRaise = null;
                
  
        
        public NonZeroId getGameId () {
            return this.gameId;
        }

        

        public void setGameId (NonZeroId value) {
            this.gameId = value;
        }
        
  
        
        public NonZeroId getPlayerId () {
            return this.playerId;
        }

        

        public void setPlayerId (NonZeroId value) {
            this.playerId = value;
        }
        
  
        
        public NetGameState getGameState () {
            return this.gameState;
        }

        

        public void setGameState (NetGameState value) {
            this.gameState = value;
        }
        
  
        
        public NetPlayerAction getPlayerAction () {
            return this.playerAction;
        }

        

        public void setPlayerAction (NetPlayerAction value) {
            this.playerAction = value;
        }
        
  
        
        public Integer getTotalPlayerBet () {
            return this.totalPlayerBet;
        }

        

        public void setTotalPlayerBet (Integer value) {
            this.totalPlayerBet = value;
        }
        
  
        
        public Integer getPlayerMoney () {
            return this.playerMoney;
        }

        

        public void setPlayerMoney (Integer value) {
            this.playerMoney = value;
        }
        
  
        
        public Integer getHighestSet () {
            return this.highestSet;
        }

        

        public void setHighestSet (Integer value) {
            this.highestSet = value;
        }
        
  
        
        public Integer getMinimumRaise () {
            return this.minimumRaise;
        }

        

        public void setMinimumRaise (Integer value) {
            this.minimumRaise = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_PlayersActionDoneMessageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_PlayersActionDoneMessageSequenceType = CoderFactory.getInstance().newPreparedElementData(PlayersActionDoneMessageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "PlayersActionDoneMessage", isOptional =  false , hasTag =  true, tag = 27, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private PlayersActionDoneMessageSequenceType  value;        

        
        
        public PlayersActionDoneMessage () {
        }
        
        
        
        public void setValue(PlayersActionDoneMessageSequenceType value) {
            this.value = value;
        }
        
        
        
        public PlayersActionDoneMessageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(PlayersActionDoneMessage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            