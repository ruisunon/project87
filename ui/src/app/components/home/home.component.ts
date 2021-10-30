import {Component, OnInit} from '@angular/core';
import {Ticket} from '../../models/ticket';
import {RestService} from '../../services/rest.service';
import {Router} from '@angular/router';
import {ClarityIcons, trashIcon} from '@cds/core/icon';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: []
})
export class HomeComponent implements OnInit {

  tickets: Ticket[] = [];
  ticket: Ticket = new Ticket();
  // @ts-ignore
  @ViewChild(AlertComponent, {static: true}) private alert: AlertComponent;

  constructor(private restService: RestService, private router: Router) {
    ClarityIcons.addIcons(trashIcon);
  }

  ngOnInit(): void {
    this.getTickets();
  }

  getTickets(): void {
    this.ticket = new Ticket();
    this.restService.getTickets().subscribe(data => {
      this.tickets = data;
    });
  }

  bookTicket(ticket: Ticket): void {
    this.restService.bookTicket(this.ticket)
      .subscribe(data => {
        this.alert.showSuccess('booked ticket: ' + this.ticket.seatNumber);
        this.getTickets();
      });
  }


}
