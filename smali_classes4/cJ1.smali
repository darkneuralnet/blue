.class public final LcJ1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LcJ1$a;,
        LcJ1$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u001bB\u0007\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\"\u0010\u000c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\t0\u0008\"\u0004\u0008\u0000\u0010\r2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000f0\u000eH\u0002R\'\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00130\u00128FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00130\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0016\u001a\u0004\u0008 \u0010!\u00a8\u0006%"
    }
    d2 = {
        "LcJ1;",
        "Landroidx/camera/core/e$a;",
        "Landroidx/camera/core/i;",
        "imageProxy",
        "",
        "d",
        "Lg32;",
        "image",
        "Lio/reactivex/F;",
        "LcJ1$a;",
        "",
        "LBx;",
        "m",
        "T",
        "Lkotlin/Function0;",
        "Lcom/google/android/gms/tasks/Task;",
        "task",
        "n",
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "LcJ1$b;",
        "a",
        "Lkotlin/Lazy;",
        "l",
        "()LZ84;",
        "results",
        "La94;",
        "b",
        "La94;",
        "mutableScanResults",
        "LUx;",
        "c",
        "k",
        "()LUx;",
        "barcodeScanner",
        "<init>",
        "()V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "LcJ1$b;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LcJ1$i;

    invoke-direct {v0, p0}, LcJ1$i;-><init>(LcJ1;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, LcJ1;->a:Lkotlin/Lazy;

    sget-object v0, La94;->h:La94$a;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v0

    iput-object v0, p0, LcJ1;->b:La94;

    sget-object v0, LcJ1$f;->g:LcJ1$f;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, LcJ1;->c:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getBarcodeScanner(LcJ1;)LUx;
    .locals 0

    invoke-virtual {p0}, LcJ1;->k()LUx;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMutableScanResults$p(LcJ1;)La94;
    .locals 0

    iget-object p0, p0, LcJ1;->b:La94;

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LcJ1;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LcJ1$b;
    .locals 0

    invoke-static {p0, p1}, LcJ1;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LcJ1$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LcJ1;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LcJ1$b;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LcJ1$b;

    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public d(Landroidx/camera/core/i;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeExperimentalUsageError",
            "CheckResult"
        }
    .end annotation

    const-string v0, "imageProxy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/i;->k3()Landroid/media/Image;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {p1}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v1

    invoke-interface {v1}, LwX1;->c()I

    move-result v1

    invoke-static {v0, v1}, Lg32;->c(Landroid/media/Image;I)Lg32;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "try {\n          InputIma\u2026         return\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LcJ1;->m(Lg32;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, LcJ1$c;

    invoke-direct {v2, v0}, LcJ1$c;-><init>(Lg32;)V

    new-instance v0, LZI1;

    invoke-direct {v0, v2}, LZI1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v0}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/F;->a0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LcJ1$b;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v2, v3}, LcJ1$b;-><init>(Landroid/graphics/Rect;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->R(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LcJ1$d;

    invoke-direct {v1, p0, p1}, LcJ1$d;-><init>(LcJ1;Landroidx/camera/core/i;)V

    new-instance v2, LaJ1;

    invoke-direct {v2, v1}, LaJ1;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, LcJ1$e;

    invoke-direct {v1, p0, p1}, LcJ1$e;-><init>(LcJ1;Landroidx/camera/core/i;)V

    new-instance p1, LbJ1;

    invoke-direct {p1, v1}, LbJ1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2, p1}, Lio/reactivex/F;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "error in identification analyzer while decoding media image"

    invoke-static {v0, v1}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    :cond_0
    :goto_0
    return-void
.end method

.method public final k()LUx;
    .locals 1

    iget-object v0, p0, LcJ1;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUx;

    return-object v0
.end method

.method public final l()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "LcJ1$b;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LcJ1;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public final m(Lg32;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg32;",
            ")",
            "Lio/reactivex/F<",
            "LcJ1$a<",
            "Ljava/util/List<",
            "LBx;",
            ">;>;>;"
        }
    .end annotation

    new-instance v0, LcJ1$g;

    invoke-direct {v0, p0, p1}, LcJ1$g;-><init>(LcJ1;Lg32;)V

    invoke-virtual {p0, v0}, LcJ1;->n(Lkotlin/jvm/functions/Function0;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lkotlin/jvm/functions/Function0;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;>;)",
            "Lio/reactivex/F<",
            "LcJ1$a<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, LcJ1$h;

    invoke-direct {v0, p1}, LcJ1$h;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {v0}, Lnh5;->k(Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
