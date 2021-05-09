// @ts-ignore
import { Component, OnInit, Injectable } from '@angular/core';
// @ts-ignore
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'recent-tacos',
  templateUrl: 'recents.component.html',
  styleUrls: ['./recents.component.css']
})

/**
 * 这个方法通过注入一个http模块来向http://localhost:8080/design/recent
 * 发送一个http的get请求，并期望得到一个包含taco设计的列表他将被放到一个recentTacos模型属性中
 */
@Injectable()
export class RecentTacosComponent implements OnInit {
  recentTacos: any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get('http://localhost:8080/design/recent') // <1>
        .subscribe(data => this.recentTacos = data);
  }
}
