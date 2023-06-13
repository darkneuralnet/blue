.class public final Lio/reactivex/internal/operators/completable/B;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/B$a;
    }
.end annotation


# instance fields
.field public final b:J

.field public final c:Ljava/util/concurrent/TimeUnit;

.field public final d:Lio/reactivex/E;


# direct methods
.method public constructor <init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-wide p1, p0, Lio/reactivex/internal/operators/completable/B;->b:J

    iput-object p3, p0, Lio/reactivex/internal/operators/completable/B;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p4, p0, Lio/reactivex/internal/operators/completable/B;->d:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 4

    new-instance v0, Lio/reactivex/internal/operators/completable/B$a;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/completable/B$a;-><init>(Lio/reactivex/f;)V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/completable/B;->d:Lio/reactivex/E;

    iget-wide v1, p0, Lio/reactivex/internal/operators/completable/B;->b:J

    iget-object v3, p0, Lio/reactivex/internal/operators/completable/B;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/reactivex/E;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/completable/B$a;->a(Lio/reactivex/disposables/c;)V

    return-void
.end method
