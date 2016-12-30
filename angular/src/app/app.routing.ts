import {Routes, RouterModule} from "@angular/router";
import {ModuleWithProviders} from "@angular/core";
import {HomeComponent} from "./home.component";
import {BlogComponent} from "./blog.component";
import {DiscuzComponent} from "./discuz.component";
import {AboutComponent} from "./about.component";

const appRoutes:Routes = [
    {
        path: 'home',
        component: HomeComponent
    },

    {
        path: 'about',
        component: AboutComponent
    },
    {
        path: 'blog',
        component: BlogComponent
    },
    {
        path: 'discuz',
        component: DiscuzComponent
    },
    {
        path: '',
        redirectTo: '/home',
        pathMatch: 'full'
    },
    // {
    //     path: 'article',
    //     children: [
    //         {
    //             path: '',
    //             component: ArticleListComponent,
    //         }, {
    //             path: ':id',
    //             component: ArticleDetailComponent
    //         }
    //     ]
    // },

    {
        path: '**',
        redirectTo: '/home'
    }
];
export const routing:ModuleWithProviders = RouterModule.forRoot(appRoutes);