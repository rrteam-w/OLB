import { Component, OnInit } from '@angular/core';
import { AccountsService } from './accounts.service';

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent implements OnInit {
  accountDetails : any;
  accountTransactions: any;
  headerRow = [];
  
  accounts: boolean = true;
  accountSummary: boolean = false;
  savings: boolean = false;
  current:boolean = false;



  constructor(private accService: AccountsService) {}

  ngOnInit(): void {
    this.accService.getAccountDetails().subscribe(resp => {
      this.accountDetails = resp;
      console.log(this.accountDetails);
      this.savings = ((this.accountDetails.accountType) === 'Saving');
      this.current = ((this.accountDetails.accountType) === 'Current');
    })
  }

  getAccountSummary() {
    this.headerRow = [ 'Date', 'Description', 'type', 'Amout'];
    this.accountTransactions = this.accountDetails.transactions;
    this.accounts = false;
    this.accountSummary = true;
  }

  showAccounts() {
    this.accounts = true;
    this.accountSummary = false;
  }

}
