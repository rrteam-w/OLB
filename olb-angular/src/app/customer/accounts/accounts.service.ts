import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AccountsService {
  accounts: any;
  constructor(private httpClient: HttpClient) {}

  getAccountDetails() {
    return this.httpClient.get(environment.api.accounts);
  }

  getAccountSummary() {}
}
