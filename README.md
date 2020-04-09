# ******Online Banking System***** #

The Banking system consists of two parts: Customer-Interface and Admin-Portal. 

Customer-Interface is a user-facing system and it includes such modules as User Login, Account, Transfer, 
Appointment, Transaction and User Profile. 

Admin-Portal is mainly used by Admin and it involves User Sign up Account and Appointment modules.

## DB Credential on AWS ##

URL : rrteam-w-pnc.cz1vfvtqy1ob.us-east-2.rds.amazonaws.com
Port : 3306

Two type of schema created
1. online_banking
2. directly use your name line ajit/rakesh/ramesh/nagaraju/mahir/vamsi

### Way to access ###

Download my sql workbench from
  1. https://dev.mysql.com/downloads/file/?id=492434
  
  #### after connect to remote DB first time #######
  create database rakesh;
  use rakesh;
  use your name in place of rakesh



### Designing ###
For reference check link
https://www.youtube.com/watch?v=1LWXd25nAoo

@Rakesh : Create expected JSON for input/output column and insert in excel sheet where JSON is written
@Ramesh : Please create DB model based on RestServices plan mentioned in RestServices.xml
