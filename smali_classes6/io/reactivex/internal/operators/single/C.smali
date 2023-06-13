.class public final Lio/reactivex/internal/operators/single/C;
.super Lio/reactivex/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/single/C$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/F<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/K<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:J

.field public final d:Ljava/util/concurrent/TimeUnit;

.field public final e:Lio/reactivex/E;

.field public final f:Lio/reactivex/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/K<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/K;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/K<",
            "TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Lio/reactivex/K<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/single/C;->b:Lio/reactivex/K;

    iput-wide p2, p0, Lio/reactivex/internal/operators/single/C;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/single/C;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/single/C;->e:Lio/reactivex/E;

    iput-object p6, p0, Lio/reactivex/internal/operators/single/C;->f:Lio/reactivex/K;

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v6, Lio/reactivex/internal/operators/single/C$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/single/C;->f:Lio/reactivex/K;

    iget-wide v3, p0, Lio/reactivex/internal/operators/single/C;->c:J

    iget-object v5, p0, Lio/reactivex/internal/operators/single/C;->d:Ljava/util/concurrent/TimeUnit;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/single/C$a;-><init>(Lio/reactivex/I;Lio/reactivex/K;JLjava/util/concurrent/TimeUnit;)V

    invoke-interface {p1, v6}, Lio/reactivex/I;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, v6, Lio/reactivex/internal/operators/single/C$a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v0, p0, Lio/reactivex/internal/operators/single/C;->e:Lio/reactivex/E;

    iget-wide v1, p0, Lio/reactivex/internal/operators/single/C;->c:J

    iget-object v3, p0, Lio/reactivex/internal/operators/single/C;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v6, v1, v2, v3}, Lio/reactivex/E;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-static {p1, v0}, Lio/reactivex/internal/disposables/d;->c(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    iget-object p1, p0, Lio/reactivex/internal/operators/single/C;->b:Lio/reactivex/K;

    invoke-interface {p1, v6}, Lio/reactivex/K;->a(Lio/reactivex/I;)V

    return-void
.end method
