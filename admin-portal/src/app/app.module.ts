import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {MaterialModule} from './material.module';
import {FormsModule} from '@angular/forms';
import {HttpModule } from '@angular/http';
import {routing} from './app.routing';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import 'hammerjs';

import {LoginService } from './services/login.service';
import {AddBookService} from './services/add-book.service';
import { UploadImageService } from './services/upload-image.service';
import { GetBookService } from './services/get-book.service';
import { EditBookService } from './services/edit-book.service';
import { RemoveBookService } from './services/remove-book.service';

import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginComponent } from './components/login/login.component';
import { AddNewBookComponent } from './components/add-new-book/add-new-book.component';
import { BookListComponent ,DialogResultExampleDialog } from './components/book-list/book-list.component';
import { EditBookComponent } from './components/edit-book/edit-book.component';
import { ViewBookComponent } from './components/view-book/view-book.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    AddNewBookComponent,
    BookListComponent,
    EditBookComponent,
    DialogResultExampleDialog,
    ViewBookComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing,
    MaterialModule,
    BrowserAnimationsModule

  ],
  providers: [
    LoginService,
    UploadImageService,
    GetBookService,
    EditBookService,
    RemoveBookService,
    AddBookService
  ],
  bootstrap: [AppComponent,DialogResultExampleDialog]
})
export class AppModule { }
