.class public final Lu28;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Z

.field public final synthetic g:Ly88;


# direct methods
.method public constructor <init>(Ly88;Z)V
    .locals 0

    iput-object p1, p0, Lu28;->g:Ly88;

    iput-boolean p2, p0, Lu28;->f:Z

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

    iget-object v0, p0, Lu28;->g:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnR7;

    iget-boolean v1, p0, Lu28;->f:Z

    invoke-interface {v0, v1}, LnR7;->setDataCollectionEnabled(Z)V

    return-void
.end method
