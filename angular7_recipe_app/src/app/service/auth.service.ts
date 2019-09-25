import {Injectable} from '@angular/core';
//import {Observable} from 'rxjs/Observable';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  baseUrl: 'http://localhost:8080/email2sms/';

  constructor(private http: HttpClient) {
  }

  // attemptAuth(ussername: string, password: string): Observable {
  //   const credentials = {username: ussername, password: password};
  //   console.log('attempAuth ::');
  //   return this.http.post('http://localhost:8080/token/generate-token', credentials);
  // }

}