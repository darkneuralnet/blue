.class public final Lio/reactivex/internal/operators/single/D;
.super Lio/reactivex/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/single/D$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/F<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:J

.field public final c:Ljava/util/concurrent/TimeUnit;

.field public final d:Lio/reactivex/E;


# direct methods
.method public constructor <init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-wide p1, p0, Lio/reactivex/internal/operators/single/D;->b:J

    iput-object p3, p0, Lio/reactivex/internal/operators/single/D;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p4, p0, Lio/reactivex/internal/operators/single/D;->d:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/single/D$a;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/single/D$a;-><init>(Lio/reactivex/I;)V

    invoke-interface {p1, v0}, Lio/reactivex/I;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/single/D;->d:Lio/reactivex/E;

    iget-wide v1, p0, Lio/reactivex/internal/operators/single/D;->b:J

    iget-object v3, p0, Lio/reactivex/internal/operators/single/D;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/reactivex/E;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/single/D$a;->a(Lio/reactivex/disposables/c;)V

    return-void
.end method
