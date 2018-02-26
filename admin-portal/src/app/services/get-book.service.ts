import { Injectable } from '@angular/core';
import { Http,Headers } from '@angular/http';
import {configuration} from '../configuration';
@Injectable()
export class GetBookService {
  private  url_service = configuration.serviceUrl; 
  constructor(private http:Http) { }


  getBookList() {
  	let url = this.url_service+"book/bookList";
    let headers = new Headers ({
      'Content-Type': 'application/json',
      'x-auth-token' : localStorage.getItem('xAuthToken')
    });

    return this.http.get(url, {headers: headers});
  }

  getBook(id:number) {
  	let url = this.url_service+"book/"+id;
    let headers = new Headers ({
      'Content-Type': 'application/json',
      'x-auth-token' : localStorage.getItem('xAuthToken')
    });

    return this.http.get(url, {headers: headers});
  }
}
