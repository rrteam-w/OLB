import { Routes } from '@angular/router';

import { HomeComponent } from '../../home/home.component';
import { UserComponent } from '../../user/user.component';
import { TablesComponent } from '../../tables/tables.component';
import { FundsComponent } from 'app/funds/funds.component';

export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard', component: HomeComponent },
    { path: 'account', component: TablesComponent },
    { path: 'transferfunds', component: FundsComponent },
    { path: 'request', component: TablesComponent },
    { path: 'user', component: UserComponent },
];
