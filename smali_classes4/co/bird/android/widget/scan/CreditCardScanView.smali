.class public final Lco/bird/android/widget/scan/CreditCardScanView;
.super Lco/bird/android/widget/scan/ScanView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/scan/CreditCardScanView$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/widget/scan/ScanView<",
        "LHE0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u0000 \u001e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0011\u0008\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u001b\u0008\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0016\u0010\u001aB#\u0008\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u0016\u0010\u001dJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00060\u0005H\u0016J\u001c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0006H\u0002R\u001c\u0010\u000f\u001a\n \u000c*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/android/widget/scan/CreditCardScanView;",
        "Lco/bird/android/widget/scan/ScanView;",
        "LHE0;",
        "Landroidx/camera/core/e;",
        "m",
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "t",
        "Lp06;",
        "result",
        "x",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "h",
        "Ljava/util/concurrent/ExecutorService;",
        "executor",
        "Lzd3;",
        "i",
        "Lzd3;",
        "analyzer",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "j",
        "a",
        "widget_release"
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
        "SMAP\nCreditCardScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreditCardScanView.kt\nco/bird/android/widget/scan/CreditCardScanView\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,67:1\n32#2,2:68\n*S KotlinDebug\n*F\n+ 1 CreditCardScanView.kt\nco/bird/android/widget/scan/CreditCardScanView\n*L\n57#1:68,2\n*E\n"
    }
.end annotation


# static fields
.field public static final j:Lco/bird/android/widget/scan/CreditCardScanView$a;

.field public static final k:Ljava/lang/String;


# instance fields
.field public final h:Ljava/util/concurrent/ExecutorService;

.field public final i:Lzd3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/widget/scan/CreditCardScanView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/widget/scan/CreditCardScanView$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/widget/scan/CreditCardScanView;->j:Lco/bird/android/widget/scan/CreditCardScanView$a;

    const-string v0, "(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|(?<mastercard>5[1-5][0-9]{14})|(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|(?<amex>3[47][0-9]{13})|(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))"

    sput-object v0, Lco/bird/android/widget/scan/CreditCardScanView;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/widget/scan/ScanView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/scan/CreditCardScanView;->h:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Lzd3;

    invoke-direct {p1}, Lzd3;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/scan/CreditCardScanView;->i:Lzd3;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lco/bird/android/widget/scan/ScanView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/scan/CreditCardScanView;->h:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Lzd3;

    invoke-direct {p1}, Lzd3;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/scan/CreditCardScanView;->i:Lzd3;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/widget/scan/ScanView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/scan/CreditCardScanView;->h:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Lzd3;

    invoke-direct {p1}, Lzd3;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/scan/CreditCardScanView;->i:Lzd3;

    return-void
.end method

.method public static final synthetic access$getCC_REGEX$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lco/bird/android/widget/scan/CreditCardScanView;->k:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$mapper(Lco/bird/android/widget/scan/CreditCardScanView;Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/widget/scan/CreditCardScanView;->x(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/scan/CreditCardScanView;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method


# virtual methods
.method public m()Landroidx/camera/core/e;
    .locals 3

    new-instance v0, Landroidx/camera/core/e$c;

    invoke-direct {v0}, Landroidx/camera/core/e$c;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/e$c;->h(I)Landroidx/camera/core/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/e$c;->e()Landroidx/camera/core/e;

    move-result-object v0

    const-string v1, "Builder()\n      .setBack\u2026LY_LATEST)\n      .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/widget/scan/CreditCardScanView;->h:Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Lco/bird/android/widget/scan/CreditCardScanView;->i:Lzd3;

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/e;->i0(Ljava/util/concurrent/Executor;Landroidx/camera/core/e$a;)V

    return-object v0
.end method

.method public t()LZ84;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "LHE0;",
            ">;>;"
        }
    .end annotation

    sget-object v0, LZ84;->d:LZ84$a;

    iget-object v1, p0, Lco/bird/android/widget/scan/CreditCardScanView;->i:Lzd3;

    invoke-virtual {v1}, Lzd3;->m()LZ84;

    move-result-object v1

    new-instance v2, Lco/bird/android/widget/scan/CreditCardScanView$b;

    invoke-direct {v2, p0}, Lco/bird/android/widget/scan/CreditCardScanView$b;-><init>(Ljava/lang/Object;)V

    new-instance v3, LIE0;

    invoke-direct {v3, v2}, LIE0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "analyzer.results.map(::mapper)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LZ84$a;->c(Lio/reactivex/Observable;Ljava/lang/Object;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public final x(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lp06;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "LHE0;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp06;

    if-nez p1, :cond_0

    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lkotlin/text/Regex;

    sget-object v1, Lco/bird/android/widget/scan/CreditCardScanView;->k:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v3, v2, [Lkotlin/text/RegexOption;

    sget-object v4, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    sget-object v6, Lkotlin/text/RegexOption;->COMMENTS:Lkotlin/text/RegexOption;

    aput-object v6, v3, v4

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-virtual {p1}, Lp06;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp06$e;

    invoke-virtual {v1}, Lp06$e;->e()Ljava/lang/String;

    move-result-object v3

    const-string v4, "textBlock.text"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LmS5;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lp06$e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {v0, v1, v5, v2, v3}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v0, LHE0;

    invoke-direct {v0, v1}, LHE0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
