.class public final Lj08;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Z

.field public final synthetic i:LjP7;

.field public final synthetic j:Ly88;


# direct methods
.method public constructor <init>(Ly88;Ljava/lang/String;Ljava/lang/String;ZLjP7;)V
    .locals 0

    iput-object p1, p0, Lj08;->j:Ly88;

    iput-object p2, p0, Lj08;->f:Ljava/lang/String;

    iput-object p3, p0, Lj08;->g:Ljava/lang/String;

    iput-boolean p4, p0, Lj08;->h:Z

    iput-object p5, p0, Lj08;->i:LjP7;

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

    iget-object v0, p0, Lj08;->j:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnR7;

    iget-object v1, p0, Lj08;->f:Ljava/lang/String;

    iget-object v2, p0, Lj08;->g:Ljava/lang/String;

    iget-boolean v3, p0, Lj08;->h:Z

    iget-object v4, p0, Lj08;->i:LjP7;

    invoke-interface {v0, v1, v2, v3, v4}, LnR7;->getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLhS7;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lj08;->i:LjP7;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LjP7;->W0(Landroid/os/Bundle;)V

    return-void
.end method
