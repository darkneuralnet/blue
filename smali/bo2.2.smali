.class public final Lbo2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPv4;
.implements Lao2$b;
.implements Ljava/lang/Runnable;
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo2$a;,
        Lbo2$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000f\u001dB\'\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020\'\u00a2\u0006\u0004\u0008>\u0010?J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0008\u0010\u0011\u001a\u00020\u0005H\u0016J\u0008\u0010\u0012\u001a\u00020\u0005H\u0016J\u0008\u0010\u0013\u001a\u00020\u0005H\u0016J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010%R\u0014\u0010)\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010(R\u001a\u0010.\u001a\u0008\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00100R\u0016\u00106\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u001c\u0010;\u001a\n 8*\u0004\u0018\u000107078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0016\u0010=\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u00105\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006A"
    }
    d2 = {
        "Lbo2;",
        "LPv4;",
        "Lao2$b;",
        "Ljava/lang/Runnable;",
        "Landroid/view/Choreographer$FrameCallback;",
        "",
        "run",
        "",
        "frameTimeNanos",
        "doFrame",
        "",
        "index",
        "Lkz0;",
        "constraints",
        "Lao2$a;",
        "a",
        "(IJ)Lao2$a;",
        "onRemembered",
        "onForgotten",
        "onAbandoned",
        "now",
        "nextFrame",
        "average",
        "",
        "e",
        "new",
        "current",
        "d",
        "Lao2;",
        "b",
        "Lao2;",
        "prefetchState",
        "LZS5;",
        "c",
        "LZS5;",
        "subcomposeLayoutState",
        "LQn2;",
        "LQn2;",
        "itemContentFactory",
        "Landroid/view/View;",
        "Landroid/view/View;",
        "view",
        "LLX2;",
        "Lbo2$b;",
        "f",
        "LLX2;",
        "prefetchRequests",
        "g",
        "J",
        "averagePrecomposeTimeNs",
        "h",
        "averagePremeasureTimeNs",
        "i",
        "Z",
        "prefetchScheduled",
        "Landroid/view/Choreographer;",
        "kotlin.jvm.PlatformType",
        "j",
        "Landroid/view/Choreographer;",
        "choreographer",
        "k",
        "isActive",
        "<init>",
        "(Lao2;LZS5;LQn2;Landroid/view/View;)V",
        "l",
        "foundation_release"
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
        "SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,311:1\n1182#2:312\n1161#2,2:313\n523#3:315\n26#4,5:316\n26#4,5:321\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:312\n122#1:313,2\n159#1:315\n164#1:316,5\n182#1:321,5\n*E\n"
    }
.end annotation


# static fields
.field public static final l:Lbo2$a;

.field public static m:J


# instance fields
.field public final b:Lao2;

.field public final c:LZS5;

.field public final d:LQn2;

.field public final e:Landroid/view/View;

.field public final f:LLX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLX2<",
            "Lbo2$b;",
            ">;"
        }
    .end annotation
.end field

.field public g:J

.field public h:J

.field public i:Z

.field public final j:Landroid/view/Choreographer;

.field public k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo2;->l:Lbo2$a;

    return-void
.end method

.method public constructor <init>(Lao2;LZS5;LQn2;Landroid/view/View;)V
    .locals 1

    const-string v0, "prefetchState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subcomposeLayoutState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemContentFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo2;->b:Lao2;

    iput-object p2, p0, Lbo2;->c:LZS5;

    iput-object p3, p0, Lbo2;->d:LQn2;

    iput-object p4, p0, Lbo2;->e:Landroid/view/View;

    new-instance p1, LLX2;

    const/16 p2, 0x10

    new-array p2, p2, [Lbo2$b;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, LLX2;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Lbo2;->f:LLX2;

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, Lbo2;->j:Landroid/view/Choreographer;

    sget-object p1, Lbo2;->l:Lbo2$a;

    invoke-static {p1, p4}, Lbo2$a;->a(Lbo2$a;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic b()J
    .locals 2

    sget-wide v0, Lbo2;->m:J

    return-wide v0
.end method

.method public static final synthetic c(J)V
    .locals 0

    sput-wide p0, Lbo2;->m:J

    return-void
.end method


# virtual methods
.method public a(IJ)Lao2$a;
    .locals 2

    new-instance v0, Lbo2$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lbo2$b;-><init>(IJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lbo2;->f:LLX2;

    invoke-virtual {p1, v0}, LLX2;->b(Ljava/lang/Object;)Z

    iget-boolean p1, p0, Lbo2;->i:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lbo2;->i:Z

    iget-object p1, p0, Lbo2;->e:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-object v0
.end method

.method public final d(JJ)J
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    int-to-long v0, v0

    div-long/2addr p3, v0

    const/4 v2, 0x3

    int-to-long v2, v2

    mul-long/2addr p3, v2

    div-long/2addr p1, v0

    add-long/2addr p1, p3

    :goto_0
    return-wide p1
.end method

.method public doFrame(J)V
    .locals 0

    iget-boolean p1, p0, Lbo2;->k:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbo2;->e:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final e(JJJ)Z
    .locals 1

    cmp-long v0, p1, p3

    if-gtz v0, :cond_1

    add-long/2addr p1, p5

    cmp-long p1, p1, p3

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onAbandoned()V
    .locals 0

    return-void
.end method

.method public onForgotten()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbo2;->k:Z

    iget-object v0, p0, Lbo2;->b:Lao2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lao2;->c(Lao2$b;)V

    iget-object v0, p0, Lbo2;->e:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lbo2;->j:Landroid/view/Choreographer;

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public onRemembered()V
    .locals 1

    iget-object v0, p0, Lbo2;->b:Lao2;

    invoke-virtual {v0, p0}, Lao2;->c(Lao2$b;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbo2;->k:Z

    return-void
.end method

.method public run()V
    .locals 17

    move-object/from16 v8, p0

    iget-object v0, v8, Lbo2;->f:LLX2;

    invoke-virtual {v0}, LLX2;->w()Z

    move-result v0

    const/4 v9, 0x0

    if-nez v0, :cond_b

    iget-boolean v0, v8, Lbo2;->i:Z

    if-eqz v0, :cond_b

    iget-boolean v0, v8, Lbo2;->k:Z

    if-eqz v0, :cond_b

    iget-object v0, v8, Lbo2;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, v8, Lbo2;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sget-wide v2, Lbo2;->m:J

    add-long v10, v0, v2

    move v0, v9

    :goto_0
    iget-object v1, v8, Lbo2;->f:LLX2;

    invoke-virtual {v1}, LLX2;->x()Z

    move-result v1

    if-eqz v1, :cond_9

    if-nez v0, :cond_9

    iget-object v1, v8, Lbo2;->f:LLX2;

    invoke-virtual {v1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v1

    aget-object v1, v1, v9

    move-object v12, v1

    check-cast v12, Lbo2$b;

    iget-object v1, v8, Lbo2;->d:LQn2;

    invoke-virtual {v1}, LQn2;->d()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, LRn2;

    invoke-virtual {v12}, Lbo2$b;->a()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-interface {v13}, LRn2;->getItemCount()I

    move-result v1

    invoke-virtual {v12}, Lbo2$b;->c()I

    move-result v2

    const/4 v14, 0x1

    if-ltz v2, :cond_1

    if-ge v2, v1, :cond_1

    move v1, v14

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    if-nez v1, :cond_2

    goto/16 :goto_5

    :cond_2
    invoke-virtual {v12}, Lbo2$b;->e()LZS5$a;

    move-result-object v1

    if-nez v1, :cond_4

    const-string v1, "compose:lazylist:prefetch:compose"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v15

    iget-wide v6, v8, Lbo2;->g:J

    move-object/from16 v1, p0

    move-wide v2, v15

    move-wide v4, v10

    invoke-virtual/range {v1 .. v7}, Lbo2;->e(JJJ)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v12}, Lbo2$b;->c()I

    move-result v1

    invoke-interface {v13, v1}, LRn2;->c(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v8, Lbo2;->d:LQn2;

    invoke-virtual {v12}, Lbo2$b;->c()I

    move-result v3

    invoke-virtual {v2, v3, v1}, LQn2;->b(ILjava/lang/Object;)Lkotlin/jvm/functions/Function2;

    move-result-object v2

    iget-object v3, v8, Lbo2;->c:LZS5;

    invoke-virtual {v3, v1, v2}, LZS5;->j(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LZS5$a;

    move-result-object v1

    invoke-virtual {v12, v1}, Lbo2$b;->f(LZS5$a;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sub-long/2addr v1, v15

    iget-wide v3, v8, Lbo2;->g:J

    invoke-virtual {v8, v1, v2, v3, v4}, Lbo2;->d(JJ)J

    move-result-wide v1

    iput-wide v1, v8, Lbo2;->g:J

    goto :goto_2

    :cond_3
    move v0, v14

    :goto_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_4
    invoke-virtual {v12}, Lbo2$b;->d()Z

    move-result v1

    xor-int/2addr v1, v14

    if-eqz v1, :cond_7

    const-string v1, "compose:lazylist:prefetch:measure"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v15

    iget-wide v6, v8, Lbo2;->h:J

    move-object/from16 v1, p0

    move-wide v2, v15

    move-wide v4, v10

    invoke-virtual/range {v1 .. v7}, Lbo2;->e(JJJ)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v12}, Lbo2$b;->e()LZS5$a;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1}, LZS5$a;->a()I

    move-result v2

    move v3, v9

    :goto_3
    if-ge v3, v2, :cond_5

    invoke-virtual {v12}, Lbo2$b;->b()J

    move-result-wide v4

    invoke-interface {v1, v3, v4, v5}, LZS5$a;->b(IJ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sub-long/2addr v1, v15

    iget-wide v3, v8, Lbo2;->h:J

    invoke-virtual {v8, v1, v2, v3, v4}, Lbo2;->d(JJ)J

    move-result-wide v1

    iput-wide v1, v8, Lbo2;->h:J

    iget-object v1, v8, Lbo2;->f:LLX2;

    invoke-virtual {v1, v9}, LLX2;->C(I)Ljava/lang/Object;

    goto :goto_4

    :cond_6
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v0, v14

    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_5
    iget-object v1, v8, Lbo2;->f:LLX2;

    invoke-virtual {v1, v9}, LLX2;->C(I)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_9
    if-eqz v0, :cond_a

    iget-object v0, v8, Lbo2;->j:Landroid/view/Choreographer;

    invoke-virtual {v0, v8}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_6

    :cond_a
    iput-boolean v9, v8, Lbo2;->i:Z

    :goto_6
    return-void

    :cond_b
    :goto_7
    iput-boolean v9, v8, Lbo2;->i:Z

    return-void
.end method
