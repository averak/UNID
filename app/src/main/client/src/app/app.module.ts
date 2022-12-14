import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";

// components
import { AppComponent } from "@app/app.component";

// modules
import { SharedModule } from "@shared/shared.module";

@NgModule({
    declarations: [AppComponent],
    imports: [SharedModule, BrowserModule, BrowserAnimationsModule],
    providers: [],
    bootstrap: [AppComponent],
})
export class AppModule {}
