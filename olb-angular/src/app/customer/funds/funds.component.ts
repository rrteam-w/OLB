import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-funds',
  templateUrl: './funds.component.html',
  styleUrls: ['./funds.component.css']
})
export class FundsComponent implements OnInit {

  fundsTransferForm:FormGroup;
  submitted = false;

  constructor(private formBuilder:FormBuilder) { }

  ngOnInit():void{
    this.fundsTransferForm = this.formBuilder.group({
      fromAccount: ['', Validators.required],
      toAccount: ['', Validators.required],
      amount: ['', [Validators.required]]
    });
  }

  onSubmit():void{
    this.submitted = true; 
    // stop here if form is invalid
     if (this.fundsTransferForm.invalid) {
      return;
    }
    console.log(this.fundsTransferForm);
  }

  onCancel():void{
    this.submitted = false;
  }

}
