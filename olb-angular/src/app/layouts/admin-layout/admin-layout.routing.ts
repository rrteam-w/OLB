import { Routes } from '@angular/router';

import { HomeComponent } from '../../home/home.component';
import { UserComponent } from '../../user/user.component';
import { TablesComponent } from '../../tables/tables.component';

export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard', component: HomeComponent },
    { path: 'account', component: TablesComponent },
    { path: 'transferfunds', component: TablesComponent },
    { path: 'request', component: TablesComponent },
    { path: 'user', component: UserComponent },
];
