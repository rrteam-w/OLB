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
                  sessionStorage.setItem('currentUser', JSON.stringify(user));
                  sessionStorage.setItem('isLoggedin', "true");
                  user.status = 200;
              }

              return user;
          }));
  }

  logout() {
      // remove user from local storage to log user out
      sessionStorage.removeItem('currentUser');
      sessionStorage.removeItem('isLoggedin');
  }
}
