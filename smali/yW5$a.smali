.class public final LyW5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWu;
.implements Lg01;
.implements Lkotlin/coroutines/Continuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LyW5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LWu;",
        "Lg01;",
        "Lkotlin/coroutines/Continuation<",
        "TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0082\u0004\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u0008\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\u0008U\u0010VJ\u001a\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0097\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\n\u001a\u00020\u0006*\u00020\tH\u0097\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u0005*\u00020\u000cH\u0097\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u0005*\u00020\u0006H\u0097\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0097\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u000c*\u00020\u0005H\u0097\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u000c*\u00020\tH\u0097\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u0011*\u00020\u0012H\u0097\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\t*\u00020\u0005H\u0097\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010#\u001a\u00020\u001f2\u0008\u0010\"\u001a\u0004\u0018\u00010!J \u0010&\u001a\u00020\u001f2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00028\u00000$H\u0016\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001b\u0010(\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008(\u0010)JL\u00101\u001a\u0004\u0018\u00018\u0001\"\u0004\u0008\u0001\u0010*2\u0006\u0010,\u001a\u00020+2\'\u00100\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010.0-\u00a2\u0006\u0002\u0008/H\u0096@\u00f8\u0001\u0001\u00a2\u0006\u0004\u00081\u00102JJ\u00103\u001a\u00028\u0001\"\u0004\u0008\u0001\u0010*2\u0006\u0010,\u001a\u00020+2\'\u00100\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010.0-\u00a2\u0006\u0002\u0008/H\u0096@\u00f8\u0001\u0001\u00a2\u0006\u0004\u00083\u00102R\u001a\u00106\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010=\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u001a\u0010C\u001a\u00020>8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010BR\u0014\u0010E\u001a\u00020\u000c8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u00084\u0010DR\u0014\u0010G\u001a\u00020\u000c8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010DR\u0014\u0010J\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010IR\u001d\u0010N\u001a\u00020K8VX\u0096\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010MR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010QR\u001d\u0010T\u001a\u00020\u00118VX\u0096\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010M\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006W"
    }
    d2 = {
        "LyW5$a;",
        "R",
        "LWu;",
        "Lg01;",
        "Lkotlin/coroutines/Continuation;",
        "Lk61;",
        "",
        "F0",
        "(F)I",
        "LM26;",
        "V0",
        "(J)I",
        "",
        "x",
        "(F)F",
        "w",
        "(I)F",
        "LxB5;",
        "Lo61;",
        "j",
        "(J)J",
        "T0",
        "I0",
        "(J)F",
        "z",
        "s0",
        "(F)J",
        "LYW3;",
        "event",
        "LaX3;",
        "pass",
        "",
        "n",
        "",
        "cause",
        "i",
        "Lkotlin/Result;",
        "result",
        "resumeWith",
        "(Ljava/lang/Object;)V",
        "r0",
        "(LaX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "T",
        "",
        "timeMillis",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "block",
        "x0",
        "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Q",
        "b",
        "Lkotlin/coroutines/Continuation;",
        "completion",
        "LWc0;",
        "d",
        "LWc0;",
        "pointerAwaiter",
        "e",
        "LaX3;",
        "awaitPass",
        "Lkotlin/coroutines/CoroutineContext;",
        "f",
        "Lkotlin/coroutines/CoroutineContext;",
        "getContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "context",
        "()F",
        "density",
        "R0",
        "fontScale",
        "M0",
        "()LYW3;",
        "currentEvent",
        "LG52;",
        "a",
        "()J",
        "size",
        "LJq6;",
        "s",
        "()LJq6;",
        "viewConfiguration",
        "C0",
        "extendedTouchPadding",
        "<init>",
        "(LyW5;Lkotlin/coroutines/Continuation;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,643:1\n34#2:644\n735#3,2:645\n314#4,11:647\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n*L\n582#1:644\n583#1:645,2\n590#1:647,11\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final synthetic c:LyW5;

.field public d:LWc0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWc0<",
            "-",
            "LYW3;",
            ">;"
        }
    .end annotation
.end field

.field public e:LaX3;

.field public final f:Lkotlin/coroutines/CoroutineContext;

.field public final synthetic g:LyW5;


# direct methods
.method public constructor <init>(LyW5;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;)V"
        }
    .end annotation

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LyW5$a;->g:LyW5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LyW5$a;->b:Lkotlin/coroutines/Continuation;

    iput-object p1, p0, LyW5$a;->c:LyW5;

    sget-object p1, LaX3;->c:LaX3;

    iput-object p1, p0, LyW5$a;->e:LaX3;

    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    iput-object p1, p0, LyW5$a;->f:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public static final synthetic d(LyW5$a;)LWc0;
    .locals 0

    iget-object p0, p0, LyW5$a;->d:LWc0;

    return-object p0
.end method

.method public static final synthetic e(LyW5$a;LaX3;)V
    .locals 0

    iput-object p1, p0, LyW5$a;->e:LaX3;

    return-void
.end method

.method public static final synthetic f(LyW5$a;LWc0;)V
    .locals 0

    iput-object p1, p0, LyW5$a;->d:LWc0;

    return-void
.end method


# virtual methods
.method public C0()J
    .locals 2

    iget-object v0, p0, LyW5$a;->g:LyW5;

    invoke-virtual {v0}, LyW5;->C0()J

    move-result-wide v0

    return-wide v0
.end method

.method public F0(F)I
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0, p1}, LyW5;->F0(F)I

    move-result p1

    return p1
.end method

.method public I0(J)F
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0, p1, p2}, LyW5;->I0(J)F

    move-result p1

    return p1
.end method

.method public M0()LYW3;
    .locals 1

    iget-object v0, p0, LyW5$a;->g:LyW5;

    invoke-static {v0}, LyW5;->h1(LyW5;)LYW3;

    move-result-object v0

    return-object v0
.end method

.method public Q(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LWu;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, LyW5$a$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LyW5$a$a;

    iget v1, v0, LyW5$a$a;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LyW5$a$a;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, LyW5$a$a;

    invoke-direct {v0, p0, p4}, LyW5$a$a;-><init>(LyW5$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, LyW5$a$a;->i:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LyW5$a$a;->k:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LyW5$a$a;->h:Ljava/lang/Object;

    check-cast p1, Lzh2;

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    cmp-long p4, p1, v5

    if-gtz p4, :cond_3

    iget-object p4, p0, LyW5$a;->d:LWc0;

    if-eqz p4, :cond_3

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v2, Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;

    invoke-direct {v2, p1, p2}, Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;-><init>(J)V

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p4, v2}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    iget-object p4, p0, LyW5$a;->g:LyW5;

    invoke-virtual {p4}, LyW5;->k1()LZC0;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, LyW5$a$b;

    invoke-direct {v8, p1, p2, p0, v4}, LyW5$a$b;-><init>(JLyW5$a;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p1

    :try_start_1
    iput-object p1, v0, LyW5$a$a;->h:Ljava/lang/Object;

    iput v3, v0, LyW5$a$a;->k:I

    invoke-interface {p3, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-static {p1, v4, v3, v4}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-object p4

    :goto_2
    invoke-static {p1, v4, v3, v4}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    throw p2
.end method

.method public R0()F
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0}, LyW5;->R0()F

    move-result v0

    return v0
.end method

.method public T0(F)F
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0, p1}, LyW5;->T0(F)F

    move-result p1

    return p1
.end method

.method public V0(J)I
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0, p1, p2}, LyW5;->V0(J)I

    move-result p1

    return p1
.end method

.method public a()J
    .locals 2

    iget-object v0, p0, LyW5$a;->g:LyW5;

    invoke-static {v0}, LyW5;->g1(LyW5;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0}, LyW5;->b()F

    move-result v0

    return v0
.end method

.method public getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    iget-object v0, p0, LyW5$a;->f:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final i(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LyW5$a;->d:LWc0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LWc0;->v(Ljava/lang/Throwable;)Z

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, LyW5$a;->d:LWc0;

    return-void
.end method

.method public j(J)J
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0, p1, p2}, LyW5;->j(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final n(LYW3;LaX3;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LyW5$a;->e:LaX3;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, LyW5$a;->d:LWc0;

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LyW5$a;->d:LWc0;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public r0(LaX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LaX3;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LYW3;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LXc0;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LXc0;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, LXc0;->u()V

    invoke-static {p0, p1}, LyW5$a;->e(LyW5$a;LaX3;)V

    invoke-static {p0, v0}, LyW5$a;->f(LyW5$a;LWc0;)V

    invoke-virtual {v0}, LXc0;->q()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LyW5$a;->g:LyW5;

    invoke-static {v0}, LyW5;->i1(LyW5;)LLX2;

    move-result-object v0

    iget-object v1, p0, LyW5$a;->g:LyW5;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, LyW5;->i1(LyW5;)LLX2;

    move-result-object v1

    invoke-virtual {v1, p0}, LLX2;->A(Ljava/lang/Object;)Z

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LyW5$a;->b:Lkotlin/coroutines/Continuation;

    invoke-interface {v0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public s()LJq6;
    .locals 1

    iget-object v0, p0, LyW5$a;->g:LyW5;

    invoke-virtual {v0}, LyW5;->s()LJq6;

    move-result-object v0

    return-object v0
.end method

.method public s0(F)J
    .locals 2

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0, p1}, LyW5;->s0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public w(I)F
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0, p1}, LyW5;->w(I)F

    move-result p1

    return p1
.end method

.method public x(F)F
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0, p1}, LyW5;->x(F)F

    move-result p1

    return p1
.end method

.method public x0(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LWu;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, LyW5$a$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LyW5$a$c;

    iget v1, v0, LyW5$a$c;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LyW5$a$c;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, LyW5$a$c;

    invoke-direct {v0, p0, p4}, LyW5$a$c;-><init>(LyW5$a;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, LyW5$a$c;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LyW5$a$c;->j:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, LyW5$a$c;->j:I

    invoke-virtual {p0, p1, p2, p3, v0}, LyW5$a;->Q(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p4, v1, :cond_3

    return-object v1

    :catch_0
    const/4 p4, 0x0

    :cond_3
    :goto_1
    return-object p4
.end method

.method public z(J)J
    .locals 1

    iget-object v0, p0, LyW5$a;->c:LyW5;

    invoke-virtual {v0, p1, p2}, LyW5;->z(J)J

    move-result-wide p1

    return-wide p1
.end method
