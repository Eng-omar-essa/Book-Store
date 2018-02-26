import { Component, OnInit } from '@angular/core';
import {LoginService} from '../../services/login.service';
import { error } from 'util';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
private credential = {'user':'' , 'password':''};
private loggedIn = false;

  constructor(private loginService : LoginService) { }

  ngOnInit() {
    this.loginService.checkSession().subscribe(
        res=>{
          this.loggedIn = true;
        },
        error=>{
          this.loggedIn = false;
        }
    );
  }

  onSubmit(){
    this.loginService.sendCredential(this.credential.user,this.credential.password)
    .subscribe(
      res=>{
        console.log(res);
        localStorage.setItem("xAuthToken",res.json().token);
        this.loggedIn = true; 
        location.reload();
      },
      error=>{
        console.log(error);

      }
    );

  }




}
