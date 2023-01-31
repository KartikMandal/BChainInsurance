# BChainInsurance

1>Environment setup

JDK 1.8
-Maven
-Restful API. So we use postman in google chrome
2>Work Step

create a block and add to block chain using http://localhost:8060/BChainInsurance/rest/block/add?insuranceId="2324830"&insuranceTerm="18"&insuranceType="HI"&premiumAmount=1000.0&maturityDate="12/20/2017"&phoneNo="9916355724"&provider="ICICI"

See the details of block chain using http://localhost:8060/BChainInsurance/rest/block/getBlockDetails

Again add the block in block chain
http://localhost:8060/BChainInsurance/rest/block/add?insuranceId="2324830"&insuranceTerm="18"&insuranceType="HelathInsurance"&premiumAmount=10033.0&maturityDate="12/20/2017"&phoneNo="9916355724"&provider="ICICI lombard"

http://localhost:8060/BChainInsurance/rest/block/add?insuranceId="2324830"&insuranceTerm="18"&insuranceType="HI"&premiumAmount=1000.0&maturityDate="12/20/2017"&phoneNo="9916355724"&provider="ICICI"

get the index wise block details http://localhost:8060/BChainInsurance/rest/block/getBlockByIndexWise?index=2

convert txn to btc using http://localhost:8060/BChainInsurance/rest/block/convertToBTC?name=Java&email=java@test.com&amount=10000.0

-add peer in current system using http://localhost:8060/BChainInsurance/rest/peer/addPeer?port=2010

-broadcast txn to perr to peer using http://localhost:8060/BChainInsurance//rest/block/getPeerDetails?port=2010&messageType="claimInsurance"&messageData="good txn data"
