import { Component } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { PostService } from '../../service/post.service';

@Component({
  selector: 'app-view-all',
  templateUrl: './view-all.component.html',
  styleUrl: './view-all.component.scss'
})
export class ViewAllComponent {
   allPosts:any                                    //to store response of api in a variable

  constructor(private postService: PostService, //for calling apis
    private snackBar: MatSnackBar){}

    ngOnInit(){
      this.getAllPosts();
    }

    getAllPosts(){
      this.postService.getAllPosts().subscribe(res =>{
        console.log(res);
        this.allPosts = res;

      },error=>{
        this.snackBar.open("Something went wrong!!","Ok")
      })
    }
}
