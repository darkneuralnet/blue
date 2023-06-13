.class public final LO58;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Landroid/app/Activity;

.field public final synthetic g:Lj88;


# direct methods
.method public constructor <init>(Lj88;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, LO58;->g:Lj88;

    iput-object p2, p0, LO58;->f:Landroid/app/Activity;

    iget-object p1, p1, Lj88;->b:Ly88;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lp48;-><init>(Ly88;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LO58;->g:Lj88;

    iget-object v0, v0, Lj88;->b:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnR7;

    iget-object v1, p0, LO58;->f:Landroid/app/Activity;

    invoke-static {v1}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v1

    iget-wide v2, p0, Lp48;->c:J

    invoke-interface {v0, v1, v2, v3}, LnR7;->onActivityResumed(LWO1;J)V

    return-void
.end method
