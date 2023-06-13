.class public final Li58;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Landroid/os/Bundle;

.field public final synthetic g:Landroid/app/Activity;

.field public final synthetic h:Lj88;


# direct methods
.method public constructor <init>(Lj88;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Li58;->h:Lj88;

    iput-object p2, p0, Li58;->f:Landroid/os/Bundle;

    iput-object p3, p0, Li58;->g:Landroid/app/Activity;

    iget-object p1, p1, Lj88;->b:Ly88;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lp48;-><init>(Ly88;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Li58;->f:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Li58;->f:Landroid/os/Bundle;

    const-string v2, "com.google.app_measurement.screen_service"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Li58;->f:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroid/os/Bundle;

    if-eqz v3, :cond_1

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    iget-object v1, p0, Li58;->h:Lj88;

    iget-object v1, v1, Lj88;->b:Ly88;

    invoke-static {v1}, Ly88;->r(Ly88;)LnR7;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnR7;

    iget-object v2, p0, Li58;->g:Landroid/app/Activity;

    invoke-static {v2}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v2

    iget-wide v3, p0, Lp48;->c:J

    invoke-interface {v1, v2, v0, v3, v4}, LnR7;->onActivityCreated(LWO1;Landroid/os/Bundle;J)V

    return-void
.end method
