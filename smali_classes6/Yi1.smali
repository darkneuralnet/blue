.class public LYi1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "LYi1;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public final b:J

.field public final c:LYh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYh3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/y<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, LYi1;->e:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(LYh3;Lio/reactivex/y;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYh3<",
            "TT;>;",
            "Lio/reactivex/y<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LYi1;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, LYi1;->b:J

    iput-object p1, p0, LYi1;->c:LYh3;

    iput-object p2, p0, LYi1;->d:Lio/reactivex/y;

    return-void
.end method


# virtual methods
.method public a(LYi1;)I
    .locals 4

    iget-object v0, p0, LYi1;->c:LYh3;

    iget-object v1, p1, LYi1;->c:LYh3;

    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p1, LYi1;->c:LYh3;

    iget-object v2, p0, LYi1;->c:LYh3;

    if-eq v1, v2, :cond_1

    iget-wide v0, p0, LYi1;->b:J

    iget-wide v2, p1, LYi1;->b:J

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    move v0, p1

    :cond_1
    return v0
.end method

.method public b(Lfd4;Lio/reactivex/E;)V
    .locals 1

    iget-object v0, p0, LYi1;->d:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/y;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, LYi1;->c:LYh3;

    invoke-static {p2}, LOx2;->r(LYh3;)V

    invoke-virtual {p1}, Lfd4;->release()V

    return-void

    :cond_0
    new-instance v0, LYi1$a;

    invoke-direct {v0, p0, p1, p2}, LYi1$a;-><init>(LYi1;Lfd4;Lio/reactivex/E;)V

    invoke-virtual {p2, v0}, Lio/reactivex/E;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LYi1;

    invoke-virtual {p0, p1}, LYi1;->a(LYi1;)I

    move-result p1

    return p1
.end method
