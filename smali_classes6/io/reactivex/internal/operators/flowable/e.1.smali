.class public final Lio/reactivex/internal/operators/flowable/e;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/e$f;,
        Lio/reactivex/internal/operators/flowable/e$c;,
        Lio/reactivex/internal/operators/flowable/e$e;,
        Lio/reactivex/internal/operators/flowable/e$d;,
        Lio/reactivex/internal/operators/flowable/e$h;,
        Lio/reactivex/internal/operators/flowable/e$g;,
        Lio/reactivex/internal/operators/flowable/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/n<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/b;


# direct methods
.method public constructor <init>(Lio/reactivex/n;Lio/reactivex/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/n<",
            "TT;>;",
            "Lio/reactivex/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/e;->c:Lio/reactivex/n;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/e;->d:Lio/reactivex/b;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/operators/flowable/e$a;->a:[I

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/e;->d:Lio/reactivex/b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Lio/reactivex/internal/operators/flowable/e$c;

    invoke-static {}, Lio/reactivex/k;->j()I

    move-result v1

    invoke-direct {v0, p1, v1}, Lio/reactivex/internal/operators/flowable/e$c;-><init>(LhT5;I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lio/reactivex/internal/operators/flowable/e$f;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/flowable/e$f;-><init>(LhT5;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lio/reactivex/internal/operators/flowable/e$d;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/flowable/e$d;-><init>(LhT5;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lio/reactivex/internal/operators/flowable/e$e;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/flowable/e$e;-><init>(LhT5;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lio/reactivex/internal/operators/flowable/e$g;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/flowable/e$g;-><init>(LhT5;)V

    :goto_0
    invoke-interface {p1, v0}, LhT5;->a(LoT5;)V

    :try_start_0
    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/e;->c:Lio/reactivex/n;

    invoke-interface {p1, v0}, Lio/reactivex/n;->a(Lio/reactivex/m;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/flowable/e$b;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
