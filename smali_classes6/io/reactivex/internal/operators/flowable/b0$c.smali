.class public final Lio/reactivex/internal/operators/flowable/b0$c;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements LoT5;
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "LoT5;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3dcf6c3b2e70d8baL


# instance fields
.field public final b:Lio/reactivex/internal/operators/flowable/b0$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/flowable/b0$h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Object;

.field public final e:Ljava/util/concurrent/atomic/AtomicLong;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/flowable/b0$h;LhT5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/flowable/b0$h<",
            "TT;>;",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/b0$c;->b:Lio/reactivex/internal/operators/flowable/b0$h;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/b0$c;->c:LhT5;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/b0$c;->e:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">()TU;"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/b0$c;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public b(J)J
    .locals 0

    invoke-static {p0, p1, p2}, Lio/reactivex/internal/util/d;->e(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public cancel()V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/internal/operators/flowable/b0$c;->dispose()V

    return-void
.end method

.method public dispose()V
    .locals 4

    const-wide/high16 v0, -0x8000000000000000L

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/b0$c;->b:Lio/reactivex/internal/operators/flowable/b0$h;

    invoke-virtual {v0, p0}, Lio/reactivex/internal/operators/flowable/b0$h;->d(Lio/reactivex/internal/operators/flowable/b0$c;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/b0$c;->b:Lio/reactivex/internal/operators/flowable/b0$h;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/flowable/b0$h;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/b0$c;->d:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public e()Z
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o(J)V
    .locals 4

    invoke-static {p1, p2}, Lio/reactivex/internal/subscriptions/g;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lio/reactivex/internal/util/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/b0$c;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lio/reactivex/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/b0$c;->b:Lio/reactivex/internal/operators/flowable/b0$h;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/flowable/b0$h;->c()V

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/b0$c;->b:Lio/reactivex/internal/operators/flowable/b0$h;

    iget-object p1, p1, Lio/reactivex/internal/operators/flowable/b0$h;->b:Lio/reactivex/internal/operators/flowable/b0$e;

    invoke-interface {p1, p0}, Lio/reactivex/internal/operators/flowable/b0$e;->h(Lio/reactivex/internal/operators/flowable/b0$c;)V

    :cond_0
    return-void
.end method
