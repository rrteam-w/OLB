import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private httpClient: HttpClient) { }

  authenticate(email: string, password: string) {
      return this.httpClient.get<any>(environment.api.customer)
          .pipe(map(user => {
              // login successful if there's a jwt token in the response
              if (user && (user.email == email && user.password == password)) { // && user.token
                  // store user details and jwt token in local storage to keep user logged in between page refreshes
                  localStorage.setItem('isLoggedin', "true");
              }

              return user;
          }));
    // let authFlag = false;
    // this.httpClient.get<any>(environment.api.customer).subscribe(cust => {
    //   if(cust && cust.email === email && cust.password === password) {
    //     console.log("inside if loop");
    //     authFlag = true;
    //     localStorage.setItem('isLoggedin', "true");
    //   }
    // });

    // return authFlag;
  }

  logout() {
      // remove user from local storage to log user out
      localStorage.removeItem('isLoggedin');
  }
}
