import { Injectable } from '@angular/core';
import { Http,Headers } from '@angular/http';
import { Book } from '../models/book';
import {configuration} from '../configuration';
@Injectable()
export class AddBookService {
  private  url_service = configuration.serviceUrl
  constructor(private http:Http) { }

  addBook(book:Book){
    let url = this.url_service +'book/add';

    let headers = new Headers({
      'Content-Type': 'application/json',
     'x-auth-token': localStorage.getItem('xAuthToken')
    });

    return this.http.post(url, JSON.stringify(book),{headers:headers});
  }
}
