import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-book-appointment',
  templateUrl: './bookappointment.component.html',
  styleUrls: ['./bookappointment.component.css']
})
export class BookAppointmentComponent implements OnInit {

  appointmentBookForm:FormGroup;
  submitted = false;

  constructor(private formBuilder:FormBuilder) { }

  ngOnInit(): void {
    this.appointmentBookForm = this.formBuilder.group({
      datepicker: ['', Validators.required],
      name: ['', Validators.required],
      description: [''],
    });
  }

  onSubmit():void{
    this.submitted = true; 
    // stop here if form is invalid
     if (this.appointmentBookForm.invalid) {
      return;
    }
    console.log(this.appointmentBookForm);
  }

  onCancel():void{
    this.submitted = false;
  }

}

