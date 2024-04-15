import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const BASIC_URL = 'http://localhost:8080/';
@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private http : HttpClient) {}

    createNewPost(data:any): Observable<any>{
    return this.http.post(BASIC_URL+ `api/posts`,data); //for calling api(post)
  }

  getAllPosts(): Observable<any>{
    return this.http.get(BASIC_URL + `api/posts`); //for calling api(get)
  }

  getPostById(postId : number): Observable<any>{
    return this.http.get(BASIC_URL + `api/posts/${postId}` ); //for calling api(get)
  }

  likePost(postId : number): Observable<any>{
    return this.http.put(BASIC_URL + `api/posts/${postId}/like`, {} ); //for calling api(get)
  }

  searchByName(name : string): Observable<any>{
    return this.http.get(BASIC_URL + `api/posts/search/${name}`)
  }
}
