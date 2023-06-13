.class public final Ly08;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ly88;


# direct methods
.method public constructor <init>(Ly88;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Ly08;->h:Ly88;

    iput-object p4, p0, Ly08;->f:Ljava/lang/String;

    iput-object p5, p0, Ly08;->g:Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lp48;-><init>(Ly88;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Ly08;->h:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LnR7;

    const/4 v2, 0x5

    iget-object v3, p0, Ly08;->f:Ljava/lang/String;

    iget-object v0, p0, Ly08;->g:Ljava/lang/Object;

    invoke-static {v0}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v4

    const/4 v0, 0x0

    invoke-static {v0}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v5

    invoke-static {v0}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, LnR7;->logHealthData(ILjava/lang/String;LWO1;LWO1;LWO1;)V

    return-void
.end method
