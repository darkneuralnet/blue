.class public final Lio/reactivex/internal/operators/single/d;
.super Lio/reactivex/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/single/d$a;
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
            "+TT;>;"
        }
    .end annotation
.end field

.field public final c:J

.field public final d:Ljava/util/concurrent/TimeUnit;

.field public final e:Lio/reactivex/E;

.field public final f:Z


# direct methods
.method public constructor <init>(Lio/reactivex/K;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/K<",
            "+TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/single/d;->b:Lio/reactivex/K;

    iput-wide p2, p0, Lio/reactivex/internal/operators/single/d;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/single/d;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/single/d;->e:Lio/reactivex/E;

    iput-boolean p6, p0, Lio/reactivex/internal/operators/single/d;->f:Z

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/disposables/h;

    invoke-direct {v0}, Lio/reactivex/internal/disposables/h;-><init>()V

    invoke-interface {p1, v0}, Lio/reactivex/I;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object v1, p0, Lio/reactivex/internal/operators/single/d;->b:Lio/reactivex/K;

    new-instance v2, Lio/reactivex/internal/operators/single/d$a;

    invoke-direct {v2, p0, v0, p1}, Lio/reactivex/internal/operators/single/d$a;-><init>(Lio/reactivex/internal/operators/single/d;Lio/reactivex/internal/disposables/h;Lio/reactivex/I;)V

    invoke-interface {v1, v2}, Lio/reactivex/K;->a(Lio/reactivex/I;)V

    return-void
.end method
