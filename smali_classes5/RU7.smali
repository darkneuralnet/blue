.class public final LRU7;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:LjP7;

.field public final synthetic i:Ly88;


# direct methods
.method public constructor <init>(Ly88;Ljava/lang/String;Ljava/lang/String;LjP7;)V
    .locals 0

    iput-object p1, p0, LRU7;->i:Ly88;

    iput-object p2, p0, LRU7;->f:Ljava/lang/String;

    iput-object p3, p0, LRU7;->g:Ljava/lang/String;

    iput-object p4, p0, LRU7;->h:LjP7;

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

    iget-object v0, p0, LRU7;->i:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnR7;

    iget-object v1, p0, LRU7;->f:Ljava/lang/String;

    iget-object v2, p0, LRU7;->g:Ljava/lang/String;

    iget-object v3, p0, LRU7;->h:LjP7;

    invoke-interface {v0, v1, v2, v3}, LnR7;->getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;LhS7;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LRU7;->h:LjP7;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LjP7;->W0(Landroid/os/Bundle;)V

    return-void
.end method
