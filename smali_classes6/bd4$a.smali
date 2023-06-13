.class public Lbd4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbd4;->y0(Ldd4;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/z<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ldd4;

.field public final synthetic c:Lbd4;


# direct methods
.method public constructor <init>(Lbd4;Ldd4;)V
    .locals 0

    iput-object p1, p0, Lbd4$a;->c:Lbd4;

    iput-object p2, p0, Lbd4$a;->b:Ldd4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/y;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lbd4$a;->c:Lbd4;

    iget-object v2, p0, Lbd4$a;->b:Ldd4;

    invoke-virtual {v1, p1, v2}, Lbd4;->b(Lio/reactivex/y;Ldd4;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-interface {p1, v1}, Lio/reactivex/y;->c(Ljava/lang/Throwable;)Z

    const-string p1, "QueueOperation terminated with an unexpected exception"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lye5;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lbd4$a;->c:Lbd4;

    invoke-virtual {v2, v1}, Lbd4;->c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble2/exceptions/BleException;

    move-result-object v2

    invoke-interface {p1, v2}, Lio/reactivex/y;->c(Ljava/lang/Throwable;)Z

    const-string p1, "QueueOperation terminated with a DeadObjectException"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lye5;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
