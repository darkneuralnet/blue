.class public abstract Lp48;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:J

.field public final c:J

.field public final d:Z

.field public final synthetic e:Ly88;


# direct methods
.method public constructor <init>(Ly88;Z)V
    .locals 2

    iput-object p1, p0, Lp48;->e:Ly88;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ly88;->b:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lp48;->b:J

    iget-object p1, p1, Ly88;->b:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lp48;->c:J

    iput-boolean p2, p0, Lp48;->d:Z

    return-void
.end method


# virtual methods
.method public abstract a()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public final run()V
    .locals 4

    iget-object v0, p0, Lp48;->e:Ly88;

    invoke-static {v0}, Ly88;->h(Ly88;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lp48;->b()V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lp48;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lp48;->e:Ly88;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lp48;->d:Z

    invoke-static {v1, v0, v2, v3}, Ly88;->C(Ly88;Ljava/lang/Exception;ZZ)V

    invoke-virtual {p0}, Lp48;->b()V

    return-void
.end method
