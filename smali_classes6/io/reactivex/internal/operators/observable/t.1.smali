.class public final Lio/reactivex/internal/operators/observable/t;
.super Lio/reactivex/F;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/t$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/F<",
        "TU;>;",
        "Lio/reactivex/internal/fuseable/d<",
        "TU;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "+TU;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/functions/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/b<",
            "-TU;-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/B;Ljava/util/concurrent/Callable;Lio/reactivex/functions/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Ljava/util/concurrent/Callable<",
            "+TU;>;",
            "Lio/reactivex/functions/b<",
            "-TU;-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/t;->b:Lio/reactivex/B;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/t;->c:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/t;->d:Lio/reactivex/functions/b;

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TU;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/t;->c:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The initialSupplier returned a null value"

    invoke-static {v0, v1}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/t;->b:Lio/reactivex/B;

    new-instance v2, Lio/reactivex/internal/operators/observable/t$a;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/t;->d:Lio/reactivex/functions/b;

    invoke-direct {v2, p1, v0, v3}, Lio/reactivex/internal/operators/observable/t$a;-><init>(Lio/reactivex/I;Ljava/lang/Object;Lio/reactivex/functions/b;)V

    invoke-interface {v1, v2}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/e;->j(Ljava/lang/Throwable;Lio/reactivex/I;)V

    return-void
.end method

.method public c()Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "TU;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/s;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/t;->b:Lio/reactivex/B;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/t;->c:Ljava/util/concurrent/Callable;

    iget-object v3, p0, Lio/reactivex/internal/operators/observable/t;->d:Lio/reactivex/functions/b;

    invoke-direct {v0, v1, v2, v3}, Lio/reactivex/internal/operators/observable/s;-><init>(Lio/reactivex/B;Ljava/util/concurrent/Callable;Lio/reactivex/functions/b;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
