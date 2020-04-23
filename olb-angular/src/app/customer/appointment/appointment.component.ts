import { Component, OnInit } from '@angular/core';
import { AppointmentService } from './appointment.service';

@Component({
  selector: 'app-appointment',
  templateUrl: './appointment.component.html',
  styleUrls: ['./appointment.component.css']
})
export class AppointmentComponent implements OnInit {
  headerRow = [];
  appointmentDetails:any;

  constructor(private appointmentService: AppointmentService) { }

  ngOnInit(): void {
    this.headerRow = ['Date', 'Description', 'Status'];
    this.appointmentService.getAppointmentDetails().subscribe(resp => {
      this.appointmentDetails = resp;
      console.log(this.appointmentDetails);
    });
  }

}
