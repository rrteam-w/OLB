import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { CustomerLayoutRoutes } from './customer-layout.routing';

import { HomeComponent } from '../../home/home.component';
import { TablesComponent } from '../../tables/tables.component';

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(CustomerLayoutRoutes),
    FormsModule
  ],
  declarations: [
    HomeComponent,
    TablesComponent
  ]
})

export class CustomerLayoutModule { }
