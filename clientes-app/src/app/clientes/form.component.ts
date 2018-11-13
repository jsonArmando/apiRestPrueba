import { Component, OnInit } from '@angular/core';
import {Cliente} from './cliente';
import {ClienteService} from './cliente.service';
import {Router, ActivatedRoute} from '@angular/router';
import swal from 'sweetalert2';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
//  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  private cliente: Cliente = new Cliente();
  private titulo: string="Crear Activos Fijos Api Rest";
  constructor(private clienteService: ClienteService, private router: Router,
private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.cargarCliente()
  }

  cargarCliente(): void{
      this.activatedRoute.params.subscribe(params => {
        let id = params['id']
        if(id){
          this.clienteService.getCliente(id).subscribe( (cliente) => this.cliente = cliente)
        }
      })
    }


  public create(): void{
    //console.log("Clicked!");
    //console.log(this.cliente);
    this.clienteService.create(this.cliente).subscribe(cliente => {
        this.router.navigate(['/clientes'])
        swal('Api Rest', `${cliente.desNom} Activo Fijo Creado Con Éxito!`, 'success')
      }
    )
  }

  update():void{
    this.clienteService.update(this.cliente)
    .subscribe( cliente => {
      this.router.navigate(['/clientes'])
      swal('Api Rest', ` ${cliente.desNom} actualizado con éxito!`, 'success')
    }

    )
  }

}
