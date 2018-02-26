import { Injectable } from '@angular/core';
import { Http,Headers } from '@angular/http';
import {configuration} from '../configuration';
@Injectable()
export class RemoveBookService {
  private  url_service = configuration.serviceUrl; 
  constructor(private http:Http) { }

  sendBook(bookId: number) {
  	let url = this.url_service+"/book/remove";
    
    let headers = new Headers ({
      'Content-Type': 'application/json',
      'x-auth-token' : localStorage.getItem('xAuthToken')
    });

    return this.http.post(url, bookId, {headers: headers});
  }
}
