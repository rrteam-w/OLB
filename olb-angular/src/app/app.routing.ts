import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule  } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';

import { AuthGuard } from './shared/guard/auth.guard';

import { LoginComponent } from './login/login.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { CustomerLayoutComponent } from './layouts/customer-layout/customer-layout.component';

const routes: Routes =[{
  path: 'login',
  pathMatch: 'full',
  component: LoginComponent
}, {
  path: 'forgotpassword',
  pathMatch: 'full',
  component: ForgotpasswordComponent
}, {
  path: '',
  component: CustomerLayoutComponent,
  children: [{
    path: '',
    loadChildren: './layouts/customer-layout/customer-layout.module#CustomerLayoutModule'
  }],
  canActivate: [AuthGuard]
}];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes, {
       useHash: true
    })
  ],
  exports: [
  ],
})
export class AppRoutingModule { }
