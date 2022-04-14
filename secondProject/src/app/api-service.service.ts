import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService<K> {

  constructor(private http:HttpClient) { }

  //implementare metodi generici importanti
  get(path:string): Observable<K>{
    return this.http.get<K>(path);
  }

  //VA INSERITO A DIFFERENZA DEL GET ANCHE UN BODY CON ILX QUALE PASSRGLI I DATI
  post(path:string, body: K): Observable<K>{
   return this.http.post<K>(path,body);
    //post con 2 argomenti perche vado a creare un nuovo oggetto
  }

  

  //la patch di solito sono put
  put(path:string, body:K) : Observable<K>{
    //bisogna passare sicuramente il path e poi
    return this.http.put<K>(path,body);
  }

  delete(path:string) : Observable<K> {
    return this.http.delete<K>(path);
  }



}

/*
  //implementare metodi generici importanti
  get(path:string, fn: Function){
    this.http.get<K>
    //subscribe --> sottoscrive i suoi dati dati
    (path).subscribe(r => fn() );
  }

  //VA INSERITO A DIFFERENZA DEL GET ANCHE UN BODY CON ILX QUALE PASSRGLI I DATI
  post(path:string, body: K, fn:Function){
    this.http.post<K>
    //post con 2 argomenti perche vado a creare un nuovo oggetto
    (path,body).subscribe(r => fn() );
  }

*/