.class public final LGZ7;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:LjP7;

.field public final synthetic g:Ly88;


# direct methods
.method public constructor <init>(Ly88;LjP7;)V
    .locals 0

    iput-object p1, p0, LGZ7;->g:Ly88;

    iput-object p2, p0, LGZ7;->f:LjP7;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lp48;-><init>(Ly88;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LGZ7;->g:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnR7;

    iget-object v1, p0, LGZ7;->f:LjP7;

    invoke-interface {v0, v1}, LnR7;->getCurrentScreenName(LhS7;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LGZ7;->f:LjP7;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LjP7;->W0(Landroid/os/Bundle;)V

    return-void
.end method
