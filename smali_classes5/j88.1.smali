.class public final Lj88;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic b:Ly88;


# direct methods
.method public constructor <init>(Ly88;)V
    .locals 0

    iput-object p1, p0, Lj88;->b:Ly88;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lj88;->b:Ly88;

    new-instance v1, Li58;

    invoke-direct {v1, p0, p2, p1}, Li58;-><init>(Lj88;Landroid/os/Bundle;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Ly88;->D(Ly88;Lp48;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lj88;->b:Ly88;

    new-instance v1, LT78;

    invoke-direct {v1, p0, p1}, LT78;-><init>(Lj88;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Ly88;->D(Ly88;Lp48;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lj88;->b:Ly88;

    new-instance v1, LZ68;

    invoke-direct {v1, p0, p1}, LZ68;-><init>(Lj88;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Ly88;->D(Ly88;Lp48;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lj88;->b:Ly88;

    new-instance v1, LO58;

    invoke-direct {v1, p0, p1}, LO58;-><init>(Lj88;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Ly88;->D(Ly88;Lp48;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    new-instance v0, LjP7;

    invoke-direct {v0}, LjP7;-><init>()V

    iget-object v1, p0, Lj88;->b:Ly88;

    new-instance v2, LD78;

    invoke-direct {v2, p0, p1, v0}, LD78;-><init>(Lj88;Landroid/app/Activity;LjP7;)V

    invoke-static {v1, v2}, Ly88;->D(Ly88;Lp48;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, LjP7;->d5(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lj88;->b:Ly88;

    new-instance v1, Ly58;

    invoke-direct {v1, p0, p1}, Ly58;-><init>(Lj88;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Ly88;->D(Ly88;Lp48;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lj88;->b:Ly88;

    new-instance v1, Lo78;

    invoke-direct {v1, p0, p1}, Lo78;-><init>(Lj88;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Ly88;->D(Ly88;Lp48;)V

    return-void
.end method
