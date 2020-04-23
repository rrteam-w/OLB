import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router} from '@angular/router';

@Component({
  selector: 'app-beneficiary',
  templateUrl: './beneficiary.component.html',
  styleUrls: ['./beneficiary.component.css']
})
export class BeneficiaryComponent implements OnInit {

  beneficiaryForm:FormGroup;
  submitted = false;

  constructor(private formBuilder:FormBuilder, private router: Router) { }

  ngOnInit():void{
    this.beneficiaryForm = this.formBuilder.group({
      btype: ['', Validators.required],
      accountNumber: ['', Validators.required],
      ifcs: ['', [Validators.required]],
      bankName: ['', [Validators.required]],
      nickName: ['', [Validators.required]],
    });
  }

  onSubmit():void{
    this.submitted = true; 
    // stop here if form is invalid
     if (this.beneficiaryForm.invalid) {
      return;
    }
    console.log(this.beneficiaryForm);
  }

  onCancel():void{
    this.submitted = false;
  }

  showFunds(){
    this.router.navigateByUrl('/transferfunds');
  }

}
