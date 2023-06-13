.class public final LmX7;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ly88;


# direct methods
.method public constructor <init>(Ly88;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LmX7;->g:Ly88;

    iput-object p2, p0, LmX7;->f:Ljava/lang/String;

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

    iget-object v0, p0, LmX7;->g:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnR7;

    iget-object v1, p0, LmX7;->f:Ljava/lang/String;

    iget-wide v2, p0, Lp48;->c:J

    invoke-interface {v0, v1, v2, v3}, LnR7;->beginAdUnitExposure(Ljava/lang/String;J)V

    return-void
.end method
