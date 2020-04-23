import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CustomerLayoutRoutes } from './customer-layout.routing';

import { HomeComponent } from '../../home/home.component';
import { TablesComponent } from '../../tables/tables.component';
import { BeneficiaryComponent } from 'app/customer/beneficiary/beneficiary.component';
import { FundsComponent } from 'app/customer/funds/funds.component';
import { AppointmentService } from 'app/customer/appointment/appointment.service';
import { AppointmentComponent } from 'app/customer/appointment/appointment.component';
import { BookAppointmentComponent } from 'app/customer/bookappointment/bookappointment.component';

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
    BeneficiaryComponent,
    AppointmentComponent,
    BookAppointmentComponent
  ],
  providers:[AppointmentService]
})

export class CustomerLayoutModule { }
