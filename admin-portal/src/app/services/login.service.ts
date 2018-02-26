import { Injectable } from '@angular/core';
import { Http,Headers } from '@angular/http';
import {configuration} from '../configuration';
@Injectable()
export class LoginService {
  private  url_service = configuration.serviceUrl; 
  
  constructor(private http:Http) {

   }
  

   sendCredential(username:string, password:string){
    let url = this.url_service+'token';
    console.log(url);
    let encodedCredentials = btoa(username +":"+ password); 
    let basicHeader = "Basic "+encodedCredentials;
    let headers = new Headers ({
      'Content-Type' : 'application/x-www-form-urlencoded',
  		'Authorization' : basicHeader

    });  
    return this.http.get(url, {headers: headers});

   }

   checkSession(){
     let url = this.url_service +'checkSession';

     let headers = new Headers({
      'x-auth-token': localStorage.getItem('xAuthToken')
     });

     return this.http.get(url, {headers:headers});
   }

   logout(){
    let url = this.url_service +'user/logout';

    let headers = new Headers({
     'x-auth-token': localStorage.getItem('xAuthToken')
    });

    return this.http.post(url,'' , {headers:headers});

   }


}
