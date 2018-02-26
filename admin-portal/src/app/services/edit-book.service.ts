import { Injectable } from '@angular/core';
import { configuration } from '../configuration';
import { Http,Headers } from '@angular/http';
import { Book } from '../models/book';

@Injectable()
export class EditBookService {
  private  url_service = configuration.serviceUrl; 
  constructor(private http:Http) { }

  sendBook(book:Book) {
  	let url = this.url_service+"book/update";
    
    let headers = new Headers ({
      'Content-Type': 'application/json',
      'x-auth-token' : localStorage.getItem('xAuthToken')
    });

    return this.http.post(url, JSON.stringify(book), {headers: headers});
  }
}
