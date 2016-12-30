import {NgModule} from "@angular/core";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule} from "@angular/forms";
import {AppComponent} from "./app.component";
import {routing} from "./app.routing";
import {HttpModule} from "@angular/http";
import "./rxjs-extensions";
import {HomeComponent} from "./home.component";
import {AboutComponent} from "./about.component";
import {DiscuzComponent} from "./discuz.component";
import {BlogComponent} from "./blog.component";
@NgModule({
    imports: [
        BrowserModule,
        FormsModule,
        routing,
        HttpModule,
    ],
    declarations: [
        AppComponent,
        AboutComponent,
        DiscuzComponent,
        BlogComponent,
        HomeComponent
    ],
    // providers: [{provide: LocationStrategy, useClass: HashLocationStrategy}],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}