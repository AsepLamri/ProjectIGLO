<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Experience the difference    Solutions_a451dd</name>
   <tag></tag>
   <elementGuidId>8e449532-b313-40f8-b539-535182331655</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>7913d998-49ec-4492-a115-1a0d3a6b4018</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
		
			
				
				
					




  
  
  Experience the difference


  



  Solutions
  About Us
  Services
  Products
  Locations
  Admin Page
  

  



  home
  about
  contact


				
			
			
				
					
						
						
							


Welcome Asep Asep

Account Services




  Open New Account
  Accounts Overview
  Transfer Funds
  Bill Pay
  Find Transactions
  Update Contact Info
  Request Loan
  Log Out

						
					
				
				
					




  
    Account Details

    
      
        Account Number:
        32547
      
      
        Account Type:
        SAVINGS
      
      
        Balance:
        $100.00
      
      
        Available:
        $100.00
      
    

    
  
  
    Account Activity
    
      
        
          Activity Period:
          
            
              
                All
              
                January
              
                February
              
                March
              
                April
              
                May
              
                June
              
                July
              
                August
              
                September
              
                October
              
                November
              
                December
              
            
          
        
        
          Type:
          
            
              
                All
              
                Credit
              
                Debit
              
            
          
        
        
           
          
        
      
    

    

    

    
      
        
          Date
          Transaction
          Debit (-)
          Credit (+)
        
      
      
        
          01-19-2024
          Funds Transfer Received

          
          

          $100.00
          
        
      
    
  
  
  




    var app = angular.module('AccountDetailsApp', []);

    app.controller('AccountDetailsCtrl', function ($scope, $rootScope, $http) {
        $http.get(&quot;services_proxy/bank/accounts/32547&quot;, {timeout:30000})
            .then(function (response) {
                $scope.account = response.data;
                $scope.account.availableBalance = getAvailableBalance($scope.account);
            })
            .catch(function(response) {
                reportError($rootScope, response);
            });

        function getAvailableBalance(account) {
            return account.balance &lt; 0 ? 0 : account.balance;
        }
    });

    app.controller('AccountActivityCtrl', function ($scope, $rootScope, $http) {
        $http.get(&quot;services_proxy/bank/accounts/32547/transactions&quot;, {timeout:30000})
            .then(function (response) {
                $scope.transactions = [];
                $scope.transactions = response.data;
            })
            .catch(function(response) {
                reportError($rootScope, response);
            });

        $scope.submit = function() {
            $http.get(&quot;services_proxy/bank/accounts/32547/transactions/month/&quot; + $scope.activityPeriod + &quot;/type/&quot; + $scope.type, {timeout:30000})
                .then(function (response) {
                    $scope.transactions = response.data;
                })
                .catch(function(response) {
                    reportError($rootScope, response);
                });
        };
    });
    
    app.controller('rootCtrl', function ($rootScope) {
        $rootScope.showDetails = true;
        $rootScope.showActivity = true;
    });
    
    function reportError(scope, error){
        scope.showDetails = false;
        scope.showActivity = false;
        scope.showError = true;
        
        var status = error.status > 0 ? error.status : &quot;timeout&quot;;
        var data = error.data ? error.data : &quot;Server timeout&quot;
        console.error(&quot;Server returned &quot; + status + &quot;: &quot; + data);
    }

	app.filter('commaLess', function() {
		return function(input) {
			return (input) ? input.toString().trim().replace(&quot;,&quot;,&quot;&quot;) : null;
		};
	});

				
			
		
		



  
    
      Home| 
      About Us| 
      Services| 
      Products| 
      Locations| 
      Forum| 
      Site Map| 
      Contact Us
    
    © Parasoft. All rights reserved.
    
      Visit us at:
      www.parasoft.com
    
  

	

/html[1]/body[1]</value>
      <webElementGuid>d42cba59-5c06-4076-b601-97befc06ab71</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
      <webElementGuid>18780c0f-a284-480f-86fe-e5103e86fa9e</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>298b843f-03c0-4705-a463-4f66aeb691e2</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
		
			
				
				
					




  
  
  Experience the difference


  



  Solutions
  About Us
  Services
  Products
  Locations
  Admin Page
  

  



  home
  about
  contact


				
			
			
				
					
						
						
							


Welcome Asep Asep

Account Services




  Open New Account
  Accounts Overview
  Transfer Funds
  Bill Pay
  Find Transactions
  Update Contact Info
  Request Loan
  Log Out

						
					
				
				
					




  
    Account Details

    
      
        Account Number:
        32547
      
      
        Account Type:
        SAVINGS
      
      
        Balance:
        $100.00
      
      
        Available:
        $100.00
      
    

    
  
  
    Account Activity
    
      
        
          Activity Period:
          
            
              
                All
              
                January
              
                February
              
                March
              
                April
              
                May
              
                June
              
                July
              
                August
              
                September
              
                October
              
                November
              
                December
              
            
          
        
        
          Type:
          
            
              
                All
              
                Credit
              
                Debit
              
            
          
        
        
           
          
        
      
    

    

    

    
      
        
          Date
          Transaction
          Debit (-)
          Credit (+)
        
      
      
        
          01-19-2024
          Funds Transfer Received

          
          

          $100.00
          
        
      
    
  
  
  




    var app = angular.module(&quot; , &quot;'&quot; , &quot;AccountDetailsApp&quot; , &quot;'&quot; , &quot;, []);

    app.controller(&quot; , &quot;'&quot; , &quot;AccountDetailsCtrl&quot; , &quot;'&quot; , &quot;, function ($scope, $rootScope, $http) {
        $http.get(&quot;services_proxy/bank/accounts/32547&quot;, {timeout:30000})
            .then(function (response) {
                $scope.account = response.data;
                $scope.account.availableBalance = getAvailableBalance($scope.account);
            })
            .catch(function(response) {
                reportError($rootScope, response);
            });

        function getAvailableBalance(account) {
            return account.balance &lt; 0 ? 0 : account.balance;
        }
    });

    app.controller(&quot; , &quot;'&quot; , &quot;AccountActivityCtrl&quot; , &quot;'&quot; , &quot;, function ($scope, $rootScope, $http) {
        $http.get(&quot;services_proxy/bank/accounts/32547/transactions&quot;, {timeout:30000})
            .then(function (response) {
                $scope.transactions = [];
                $scope.transactions = response.data;
            })
            .catch(function(response) {
                reportError($rootScope, response);
            });

        $scope.submit = function() {
            $http.get(&quot;services_proxy/bank/accounts/32547/transactions/month/&quot; + $scope.activityPeriod + &quot;/type/&quot; + $scope.type, {timeout:30000})
                .then(function (response) {
                    $scope.transactions = response.data;
                })
                .catch(function(response) {
                    reportError($rootScope, response);
                });
        };
    });
    
    app.controller(&quot; , &quot;'&quot; , &quot;rootCtrl&quot; , &quot;'&quot; , &quot;, function ($rootScope) {
        $rootScope.showDetails = true;
        $rootScope.showActivity = true;
    });
    
    function reportError(scope, error){
        scope.showDetails = false;
        scope.showActivity = false;
        scope.showError = true;
        
        var status = error.status > 0 ? error.status : &quot;timeout&quot;;
        var data = error.data ? error.data : &quot;Server timeout&quot;
        console.error(&quot;Server returned &quot; + status + &quot;: &quot; + data);
    }

	app.filter(&quot; , &quot;'&quot; , &quot;commaLess&quot; , &quot;'&quot; , &quot;, function() {
		return function(input) {
			return (input) ? input.toString().trim().replace(&quot;,&quot;,&quot;&quot;) : null;
		};
	});

				
			
		
		



  
    
      Home| 
      About Us| 
      Services| 
      Products| 
      Locations| 
      Forum| 
      Site Map| 
      Contact Us
    
    © Parasoft. All rights reserved.
    
      Visit us at:
      www.parasoft.com
    
  

	

/html[1]/body[1]&quot;) or . = concat(&quot;
		
			
				
				
					




  
  
  Experience the difference


  



  Solutions
  About Us
  Services
  Products
  Locations
  Admin Page
  

  



  home
  about
  contact


				
			
			
				
					
						
						
							


Welcome Asep Asep

Account Services




  Open New Account
  Accounts Overview
  Transfer Funds
  Bill Pay
  Find Transactions
  Update Contact Info
  Request Loan
  Log Out

						
					
				
				
					




  
    Account Details

    
      
        Account Number:
        32547
      
      
        Account Type:
        SAVINGS
      
      
        Balance:
        $100.00
      
      
        Available:
        $100.00
      
    

    
  
  
    Account Activity
    
      
        
          Activity Period:
          
            
              
                All
              
                January
              
                February
              
                March
              
                April
              
                May
              
                June
              
                July
              
                August
              
                September
              
                October
              
                November
              
                December
              
            
          
        
        
          Type:
          
            
              
                All
              
                Credit
              
                Debit
              
            
          
        
        
           
          
        
      
    

    

    

    
      
        
          Date
          Transaction
          Debit (-)
          Credit (+)
        
      
      
        
          01-19-2024
          Funds Transfer Received

          
          

          $100.00
          
        
      
    
  
  
  




    var app = angular.module(&quot; , &quot;'&quot; , &quot;AccountDetailsApp&quot; , &quot;'&quot; , &quot;, []);

    app.controller(&quot; , &quot;'&quot; , &quot;AccountDetailsCtrl&quot; , &quot;'&quot; , &quot;, function ($scope, $rootScope, $http) {
        $http.get(&quot;services_proxy/bank/accounts/32547&quot;, {timeout:30000})
            .then(function (response) {
                $scope.account = response.data;
                $scope.account.availableBalance = getAvailableBalance($scope.account);
            })
            .catch(function(response) {
                reportError($rootScope, response);
            });

        function getAvailableBalance(account) {
            return account.balance &lt; 0 ? 0 : account.balance;
        }
    });

    app.controller(&quot; , &quot;'&quot; , &quot;AccountActivityCtrl&quot; , &quot;'&quot; , &quot;, function ($scope, $rootScope, $http) {
        $http.get(&quot;services_proxy/bank/accounts/32547/transactions&quot;, {timeout:30000})
            .then(function (response) {
                $scope.transactions = [];
                $scope.transactions = response.data;
            })
            .catch(function(response) {
                reportError($rootScope, response);
            });

        $scope.submit = function() {
            $http.get(&quot;services_proxy/bank/accounts/32547/transactions/month/&quot; + $scope.activityPeriod + &quot;/type/&quot; + $scope.type, {timeout:30000})
                .then(function (response) {
                    $scope.transactions = response.data;
                })
                .catch(function(response) {
                    reportError($rootScope, response);
                });
        };
    });
    
    app.controller(&quot; , &quot;'&quot; , &quot;rootCtrl&quot; , &quot;'&quot; , &quot;, function ($rootScope) {
        $rootScope.showDetails = true;
        $rootScope.showActivity = true;
    });
    
    function reportError(scope, error){
        scope.showDetails = false;
        scope.showActivity = false;
        scope.showError = true;
        
        var status = error.status > 0 ? error.status : &quot;timeout&quot;;
        var data = error.data ? error.data : &quot;Server timeout&quot;
        console.error(&quot;Server returned &quot; + status + &quot;: &quot; + data);
    }

	app.filter(&quot; , &quot;'&quot; , &quot;commaLess&quot; , &quot;'&quot; , &quot;, function() {
		return function(input) {
			return (input) ? input.toString().trim().replace(&quot;,&quot;,&quot;&quot;) : null;
		};
	});

				
			
		
		



  
    
      Home| 
      About Us| 
      Services| 
      Products| 
      Locations| 
      Forum| 
      Site Map| 
      Contact Us
    
    © Parasoft. All rights reserved.
    
      Visit us at:
      www.parasoft.com
    
  

	

/html[1]/body[1]&quot;))]</value>
      <webElementGuid>7f469a5b-7f82-4049-938c-e33acd4e249f</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
