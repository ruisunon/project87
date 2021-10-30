import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Ticket} from "../models/ticket";

@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http: HttpClient) {
  }

  public getTickets(): Observable<Ticket[]> {
    return this.http.get<Ticket[]>('/api/customer');
  }

  public bookTicket(ticket: Ticket): Observable<any> {
    return this.http.post('/api/ticket', ticket);
  }

}
