import {Component, OnInit, OnDestroy} from "@angular/core";
import {Router, NavigationStart} from "@angular/router";
//import 'bootstrap/dist/css/bootstrap.min.css';
//import '!style-loader!css-loader!bootstrap/dist/css/bootstrap.min.css';
@Component({
    selector: 'my-app',
    templateUrl: './app.component.html',
    // styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, OnDestroy {
    private current_uri:string;
    private sub:any;

    constructor(private route:Router) {

    }

    ngOnInit() {
        this.sub = this.route.events.filter(e=>e instanceof NavigationStart).subscribe(param=> {
            this.current_uri = ( param.url == "" || param.url == "/" ) ? "/home" : decodeURI(param.url);
        });
    }

    ngOnDestroy() {
        this.sub.unsubscribe();
    }

}