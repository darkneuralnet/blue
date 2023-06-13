.class public final Lio/reactivex/internal/operators/completable/f;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/f$a;
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/h;

.field public final c:J

.field public final d:Ljava/util/concurrent/TimeUnit;

.field public final e:Lio/reactivex/E;

.field public final f:Z


# direct methods
.method public constructor <init>(Lio/reactivex/h;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/f;->b:Lio/reactivex/h;

    iput-wide p2, p0, Lio/reactivex/internal/operators/completable/f;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/completable/f;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/completable/f;->e:Lio/reactivex/E;

    iput-boolean p6, p0, Lio/reactivex/internal/operators/completable/f;->f:Z

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 9

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/f;->b:Lio/reactivex/h;

    new-instance v8, Lio/reactivex/internal/operators/completable/f$a;

    iget-wide v3, p0, Lio/reactivex/internal/operators/completable/f;->c:J

    iget-object v5, p0, Lio/reactivex/internal/operators/completable/f;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v6, p0, Lio/reactivex/internal/operators/completable/f;->e:Lio/reactivex/E;

    iget-boolean v7, p0, Lio/reactivex/internal/operators/completable/f;->f:Z

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lio/reactivex/internal/operators/completable/f$a;-><init>(Lio/reactivex/f;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Z)V

    invoke-interface {v0, v8}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method
