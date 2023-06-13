.class public final LrU7;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Landroid/os/Bundle;

.field public final synthetic g:Ly88;


# direct methods
.method public constructor <init>(Ly88;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LrU7;->g:Ly88;

    iput-object p2, p0, LrU7;->f:Landroid/os/Bundle;

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

    iget-object v0, p0, LrU7;->g:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnR7;

    iget-object v1, p0, LrU7;->f:Landroid/os/Bundle;

    iget-wide v2, p0, Lp48;->b:J

    invoke-interface {v0, v1, v2, v3}, LnR7;->setConditionalUserProperty(Landroid/os/Bundle;J)V

    return-void
.end method
