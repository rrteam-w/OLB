import { Routes } from '@angular/router';

import { HomeComponent } from '../../home/home.component';
import { UserComponent } from '../../user/user.component';
import { AccountsComponent } from '../../customer/accounts/accounts.component';
import { TablesComponent } from '../../tables/tables.component';
import { BeneficiaryComponent } from 'app/customer/beneficiary/beneficiary.component';
import { FundsComponent } from 'app/customer/funds/funds.component';
import { AppointmentComponent } from 'app/customer/appointment/appointment.component';
import { BookAppointmentComponent } from 'app/customer/bookappointment/bookappointment.component';

export const CustomerLayoutRoutes: Routes = [
    { path: 'dashboard', component: HomeComponent },
    { path: 'account', component: AccountsComponent },
    { path: 'transferfunds', component: FundsComponent },
    { path: 'beneficiary', component: BeneficiaryComponent },
    { path: 'appointment', component: AppointmentComponent },
    { path: 'bookappointment', component: BookAppointmentComponent, pathMatch:'full' },
    { path: 'request', component: TablesComponent },
    { path: 'user', component: UserComponent },
];
