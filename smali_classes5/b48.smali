.class public final Lb48;
.super Lp48;
.source "SourceFile"


# instance fields
.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Z

.field public final synthetic j:Ly88;


# direct methods
.method public constructor <init>(Ly88;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 0

    iput-object p1, p0, Lb48;->j:Ly88;

    iput-object p2, p0, Lb48;->f:Ljava/lang/String;

    iput-object p3, p0, Lb48;->g:Ljava/lang/String;

    iput-object p4, p0, Lb48;->h:Ljava/lang/Object;

    iput-boolean p5, p0, Lb48;->i:Z

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lp48;-><init>(Ly88;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lb48;->j:Ly88;

    invoke-static {v0}, Ly88;->r(Ly88;)LnR7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LnR7;

    iget-object v2, p0, Lb48;->f:Ljava/lang/String;

    iget-object v3, p0, Lb48;->g:Ljava/lang/String;

    iget-object v0, p0, Lb48;->h:Ljava/lang/Object;

    invoke-static {v0}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object v4

    iget-boolean v5, p0, Lb48;->i:Z

    iget-wide v6, p0, Lp48;->b:J

    invoke-interface/range {v1 .. v7}, LnR7;->setUserProperty(Ljava/lang/String;Ljava/lang/String;LWO1;ZJ)V

    return-void
.end method
