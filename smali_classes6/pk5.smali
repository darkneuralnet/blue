.class public abstract Lpk5;
.super Lbd4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SCAN_RESU",
        "LT_TYPE:Ljava/lang/Object;",
        "SCAN_CA",
        "LLBACK_TYPE:Ljava/lang/Object;",
        ">",
        "Lbd4<",
        "TSCAN_RESU",
        "LT_TYPE;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lpd5;


# direct methods
.method public constructor <init>(Lpd5;)V
    .locals 0

    invoke-direct {p0}, Lbd4;-><init>()V

    iput-object p1, p0, Lpk5;->b:Lpd5;

    return-void
.end method


# virtual methods
.method public final b(Lio/reactivex/y;Ldd4;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "TSCAN_RESU",
            "LT_TYPE;",
            ">;",
            "Ldd4;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lpk5;->d(Lio/reactivex/y;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lpk5$a;

    invoke-direct {v2, p0, v0}, Lpk5$a;-><init>(Lpk5;Ljava/lang/Object;)V

    invoke-interface {p1, v2}, Lio/reactivex/y;->a(Lio/reactivex/functions/f;)V

    const-string v2, "Scan operation is requested to start."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lye5;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lpk5;->b:Lpd5;

    invoke-virtual {p0, v2, v0}, Lpk5;->e(Lpd5;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    invoke-direct {v0, v1}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;-><init>(I)V

    invoke-interface {p1, v0}, Lio/reactivex/y;->c(Ljava/lang/Throwable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    const-string v2, "Error while calling the start scan function"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lye5;->s(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v2, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    invoke-direct {v2, v1, v0}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;-><init>(ILjava/lang/Throwable;)V

    invoke-interface {p1, v2}, Lio/reactivex/y;->c(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_0
    :goto_0
    invoke-interface {p2}, Ldd4;->release()V

    return-void

    :catchall_1
    move-exception p1

    invoke-interface {p2}, Ldd4;->release()V

    throw p1
.end method

.method public c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble2/exceptions/BleException;
    .locals 2

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;-><init>(ILjava/lang/Throwable;)V

    return-object v0
.end method

.method public abstract d(Lio/reactivex/y;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "TSCAN_RESU",
            "LT_TYPE;",
            ">;)TSCAN_CA",
            "LLBACK_TYPE;"
        }
    .end annotation
.end method

.method public abstract e(Lpd5;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd5;",
            "TSCAN_CA",
            "LLBACK_TYPE;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract f(Lpd5;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd5;",
            "TSCAN_CA",
            "LLBACK_TYPE;",
            ")V"
        }
    .end annotation
.end method
