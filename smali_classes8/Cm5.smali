.class public final LCm5;
.super LSC0;
.source "SourceFile"

# interfaces
.implements LqZ0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001c\u0010\t\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000cH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0012\u001a\u00020\u0011H\u0016J\u0013\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\u0008\u0010\u0018\u001a\u00020\u0017H\u0016R\u0017\u0010\u001e\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "LCm5;",
        "LSC0;",
        "LqZ0;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "block",
        "",
        "y",
        "",
        "timeMillis",
        "LWc0;",
        "continuation",
        "l",
        "Lo51;",
        "t",
        "",
        "toString",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Lio/reactivex/E;",
        "c",
        "Lio/reactivex/E;",
        "getScheduler",
        "()Lio/reactivex/E;",
        "scheduler",
        "<init>",
        "(Lio/reactivex/E;)V",
        "kotlinx-coroutines-rx2"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, LSC0;-><init>()V

    iput-object p1, p0, LCm5;->c:Lio/reactivex/E;

    return-void
.end method

.method public static synthetic G(LWc0;LCm5;)V
    .locals 0

    invoke-static {p0, p1}, LCm5;->T(LWc0;LCm5;)V

    return-void
.end method

.method public static synthetic L(Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-static {p0}, LCm5;->S(Lio/reactivex/disposables/c;)V

    return-void
.end method

.method public static final S(Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-interface {p0}, Lio/reactivex/disposables/c;->dispose()V

    return-void
.end method

.method public static final T(LWc0;LCm5;)V
    .locals 1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {p0, p1, v0}, LWc0;->S(LSC0;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LCm5;

    if-eqz v0, :cond_0

    check-cast p1, LCm5;

    iget-object p1, p1, LCm5;->c:Lio/reactivex/E;

    iget-object v0, p0, LCm5;->c:Lio/reactivex/E;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LCm5;->c:Lio/reactivex/E;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public l(JLWc0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LWc0<",
            "-",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LCm5;->c:Lio/reactivex/E;

    new-instance v1, LAm5;

    invoke-direct {v1, p3, p0}, LAm5;-><init>(LWc0;LCm5;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, p1, p2, v2}, Lio/reactivex/E;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-static {p3, p1}, Lmd5;->b(LWc0;Lio/reactivex/disposables/c;)V

    return-void
.end method

.method public t(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;
    .locals 1

    iget-object p4, p0, LCm5;->c:Lio/reactivex/E;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p4, p3, p1, p2, v0}, Lio/reactivex/E;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    move-result-object p1

    new-instance p2, Lzm5;

    invoke-direct {p2, p1}, Lzm5;-><init>(Lio/reactivex/disposables/c;)V

    return-object p2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCm5;->c:Lio/reactivex/E;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public y(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, LCm5;->c:Lio/reactivex/E;

    invoke-virtual {p1, p2}, Lio/reactivex/E;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    return-void
.end method
