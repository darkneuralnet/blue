.class public final LS41;
.super Lio/reactivex/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS41$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001:\u0001 J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "LS41;",
        "Lio/reactivex/E;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "block",
        "",
        "delay",
        "Ljava/util/concurrent/TimeUnit;",
        "unit",
        "Lio/reactivex/disposables/c;",
        "e",
        "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;",
        "Lio/reactivex/E$c;",
        "b",
        "()Lio/reactivex/E$c;",
        "",
        "shutdown",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "LSC0;",
        "d",
        "LSC0;",
        "dispatcher",
        "Lms0;",
        "Lms0;",
        "schedulerJob",
        "LZC0;",
        "f",
        "LZC0;",
        "scope",
        "a",
        "kotlinx-coroutines-rx2"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field public final d:LSC0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final e:Lms0;

.field public final f:LZC0;

.field private volatile synthetic workerCounter:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, LS41;

    const-string v1, "workerCounter"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LS41;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-void
.end method

.method public static final synthetic g(LS41;)LZC0;
    .locals 0

    iget-object p0, p0, LS41;->f:LZC0;

    return-object p0
.end method


# virtual methods
.method public b()Lio/reactivex/E$c;
    .locals 5

    new-instance v0, LS41$a;

    sget-object v1, LS41;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    iget-object v3, p0, LS41;->d:LSC0;

    iget-object v4, p0, LS41;->e:Lms0;

    invoke-direct {v0, v1, v2, v3, v4}, LS41$a;-><init>(JLSC0;Lzh2;)V

    return-object v0
.end method

.method public e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;
    .locals 1

    iget-object v0, p0, LS41;->f:LZC0;

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p2

    new-instance p4, LS41$b;

    invoke-direct {p4, p0}, LS41$b;-><init>(LS41;)V

    invoke-static {v0, p1, p2, p3, p4}, Lbf5;->b(LZC0;Ljava/lang/Runnable;JLkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method

.method public shutdown()V
    .locals 3

    iget-object v0, p0, LS41;->e:Lms0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LS41;->d:LSC0;

    invoke-virtual {v0}, LSC0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
