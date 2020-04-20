import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { CustomerLayoutRoutes } from './customer-layout.routing';

import { HomeComponent } from '../../home/home.component';
import { TablesComponent } from '../../tables/tables.component';
import { FundsComponent } from 'app/funds/funds.component';
import { BeneficiaryComponent } from 'app/beneficiary/beneficiary.component';

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(CustomerLayoutRoutes),
    FormsModule,
    ReactiveFormsModule
  ],
  declarations: [
    HomeComponent,
    TablesComponent,
    FundsComponent,
    BeneficiaryComponent
  ]
})

export class CustomerLayoutModule { }
