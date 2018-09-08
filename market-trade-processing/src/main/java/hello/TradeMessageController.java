package hello;

import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeMessageController {

	private int counter = 1;

    @PostMapping("/tradeMessage")
    public ResponseEntity<TradeMessage> tradeMessage(@RequestBody TradeMessage tradeMessage) {
    	
    	tradeMessage.setSuccessMessage("Market Trade Message Successfully Received...!");
    	
		return new ResponseEntity<TradeMessage>(tradeMessage, HttpStatus.OK);
    }
   
    @PostMapping("/tradeMessages")
    public ResponseEntity<List<TradeMessage>> tradeMessage(@RequestBody List<TradeMessage> tradeMessages) {
    	
    	Iterator<TradeMessage> it = tradeMessages.iterator();
    	
    	while(it.hasNext()){
    		
    		if(3 > counter){
    			it.next().setSuccessMessage("Market Trade Messages "+counter+" Successfully Received...!");
    		}else{
    			it.next().setSuccessMessage("Market Trade Messages "+counter+" Not Accepted...!");
    		}
    		counter++;
    	}
    	
    	
		return new ResponseEntity<List<TradeMessage>>(tradeMessages, HttpStatus.OK);
    }    
    

}
