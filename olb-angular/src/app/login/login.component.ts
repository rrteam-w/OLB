import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { first } from 'rxjs/operators';

import { LoginService } from '../_service/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  loading = false;
  submitted = false;
  inValid = false;

  constructor(private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private loginService: LoginService) { }

  ngOnInit() {
    document.getElementById('body').classList.add("bg");

    this.loginForm = this.formBuilder.group({
        username: ['', Validators.required],
        password: ['', Validators.required]
    });

    // reset login status
    this.loginService.logout();
  }

  // authenticate() {

  //   console.log("authenticate called");
  //   localStorage.setItem('isLoggedin', "true");
  //   this.router.navigate(['dashboard']);
  // }

  get f() { return this.loginForm.controls; }

  onSubmit() {
      this.submitted = true;

      // stop here if form is invalid
      if (this.loginForm.invalid) {
        return;
      }

      this.loading = true;

      this.loginService.authenticate(this.f.username.value, this.f.password.value)
        .pipe(first())
        .subscribe(data => {
            this.router.navigate(['/account']);
        }, error => {
          this.inValid = true;
          this.loading = false;
        });
  }

}
