# MarketTradiingProcess
Test this application in PostMan EndPoint
Only 2 Trade Message is accepted
Request:-
Url : http://localhost:8080/tradeMessages  POST
[{
"userId": "134256", 
"currencyFrom": "EUR", 
"currencyTo": "GBP", 
"amountSell": 1000,
"amountBuy": 747.10, 
"rate": 0.7471, 
"timePlaced" : "24-JAN-15 10:27:44", 
"originatingCountry": "FR"
},
{
"userId": "134257", 
"currencyFrom": "EUR", 
"currencyTo": "GBP", 
"amountSell": 1000,
"amountBuy": 747.10, 
"rate": 0.7471, 
"timePlaced" : "24-JAN-15 10:27:44", 
"originatingCountry": "FR"
},
{
"userId": "134258", 
"currencyFrom": "EUR", 
"currencyTo": "GBP", 
"amountSell": 1000,
"amountBuy": 747.10, 
"rate": 0.7471, 
"timePlaced" : "24-JAN-15 10:27:44", 
"originatingCountry": "FR"
}]

Response:-
[
    {
        "userId": 134256,
        "currencyFrom": "EUR",
        "currencyTo": "GBP",
        "amountSell": 1000,
        "amountBuy": 747.1,
        "rate": 0.7471,
        "timePlaced": "24-JAN-15 10:27:44",
        "originatingCountry": "FR",
        "successMessage": "Market Trade Messages 1 Successfully Received...!"
    },
    {
        "userId": 134257,
        "currencyFrom": "EUR",
        "currencyTo": "GBP",
        "amountSell": 1000,
        "amountBuy": 747.1,
        "rate": 0.7471,
        "timePlaced": "24-JAN-15 10:27:44",
        "originatingCountry": "FR",
        "successMessage": "Market Trade Messages 2 Successfully Received...!"
    },
    {
        "userId": 134257,
        "currencyFrom": "EUR",
        "currencyTo": "GBP",
        "amountSell": 1000,
        "amountBuy": 747.1,
        "rate": 0.7471,
        "timePlaced": "24-JAN-15 10:27:44",
        "originatingCountry": "FR",
        "successMessage": "Market Trade Messages 3 Not Accepted...!"
    }
]
