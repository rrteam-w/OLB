import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
    document.getElementById('body').classList.add("bg");
  }

  authenticate() {
    console.log("authenticate called");
    localStorage.setItem('isLoggedin', "true");
    this.router.navigate(['dashboard']);
  }

}
