.class public final Lio/reactivex/internal/operators/flowable/T$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lna4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lna4<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/internal/operators/flowable/T$c<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/internal/operators/flowable/T$c<",
            "TT;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/T$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput p2, p0, Lio/reactivex/internal/operators/flowable/T$a;->c:I

    return-void
.end method


# virtual methods
.method public c(LhT5;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/flowable/T$b;

    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/flowable/T$b;-><init>(LhT5;)V

    invoke-interface {p1, v0}, LhT5;->a(LoT5;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/T$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/internal/operators/flowable/T$c;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/reactivex/internal/operators/flowable/T$c;->e()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_1
    new-instance v1, Lio/reactivex/internal/operators/flowable/T$c;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/T$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget v3, p0, Lio/reactivex/internal/operators/flowable/T$a;->c:I

    invoke-direct {v1, v2, v3}, Lio/reactivex/internal/operators/flowable/T$c;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/T$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, p1, v1}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v1

    :cond_3
    invoke-virtual {p1, v0}, Lio/reactivex/internal/operators/flowable/T$c;->b(Lio/reactivex/internal/operators/flowable/T$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v1, v1, v3

    if-nez v1, :cond_4

    invoke-virtual {p1, v0}, Lio/reactivex/internal/operators/flowable/T$c;->g(Lio/reactivex/internal/operators/flowable/T$b;)V

    goto :goto_1

    :cond_4
    iput-object p1, v0, Lio/reactivex/internal/operators/flowable/T$b;->c:Lio/reactivex/internal/operators/flowable/T$c;

    :goto_1
    invoke-virtual {p1}, Lio/reactivex/internal/operators/flowable/T$c;->d()V

    return-void
.end method
