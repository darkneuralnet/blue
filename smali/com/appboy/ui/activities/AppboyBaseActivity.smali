.class public Lcom/appboy/ui/activities/AppboyBaseActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    invoke-virtual {v0, p0}, Li20;->A(Landroid/app/Activity;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    invoke-virtual {v0, p0}, Li20;->x(Landroid/app/Activity;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {p0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/appboy/Appboy;->openSession(Landroid/app/Activity;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    invoke-static {p0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/appboy/Appboy;->closeSession(Landroid/app/Activity;)V

    return-void
.end method
