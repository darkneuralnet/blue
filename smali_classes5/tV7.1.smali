.class public final LtV7;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Landroid/app/Activity;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ly88;


# direct methods
.method public constructor <init>(Ly88;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LtV7;->i:Ly88;

    iput-object p2, p0, LtV7;->f:Landroid/app/Activity;

    iput-object p3, p0, LtV7;->g:Ljava/lang/String;

    iput-object p4, p0, LtV7;->h:Ljava/lang/String;

    const/4 p2, 0x1

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

    iget-object v0, p0, LtV7;->i:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LnR7;

    iget-object v0, p0, LtV7;->f:Landroid/app/Activity;

    invoke-static {v0}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v2

    iget-object v3, p0, LtV7;->g:Ljava/lang/String;

    iget-object v4, p0, LtV7;->h:Ljava/lang/String;

    iget-wide v5, p0, Lp48;->b:J

    invoke-interface/range {v1 .. v6}, LnR7;->setCurrentScreen(LWO1;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method
