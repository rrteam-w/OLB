import { Injectable } from '@angular/core';
import { CanActivate } from '@angular/router';
import { Router } from '@angular/router';

@Injectable()
export class AuthGuard implements CanActivate {
    constructor(private router: Router) {}

    canActivate() {
        console.log("in AuthGuard");
        if (sessionStorage.getItem('isLoggedin')) {
            return true;
        }

        this.router.navigate(['login']);
        return false;
    }
}
