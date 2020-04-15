import { Component, OnInit, Input } from '@angular/core';
import { Router } from '@angular/router';

declare const $: any;
// declare interface RouteInfo {
//     path: string;
//     title: string;
//     icon: string;
//     class: string;
// }
// export const ROUTES: RouteInfo[] = [
//     { path: '/dashboard', title: 'Dashboard',  icon: 'pe-7s-graph', class: '' },
//     { path: '/account', title: 'Account',  icon:'pe-7s-note2', class: '' },
//     { path: '/transferfunds', title: 'Transfer Funds',  icon:'pe-7s-news-paper', class: '' },
//     { path: '/request', title: 'Request ATM/Cheque',  icon:'pe-7s-user', class: '' },
//     { path: '/user', title: 'User Profile',  icon:'pe-7s-user', class: '' }
// ];

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html'
})
export class SidebarComponent implements OnInit {
    @Input() routes: any[];
    @Input() menuItems: any[];

    constructor(private router: Router) { }

    ngOnInit() {
        this.menuItems = this.routes.filter(menuItem => {
            return menuItem;
        });
    }
    
    isMobileMenu() {
        if ($(window).width() > 991) {
            return false;
        }
        return true;
    }
    
    logout() {
        localStorage.removeItem("isLoggedin");
        this.router.navigate(['login']);
    }
}
