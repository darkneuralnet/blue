.class public final LSM3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAM3;
.implements Lcom/stripe/android/EphemeralKeyProvider;
.implements Lbr4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSM3$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)BY\u0008\u0007\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010G\u001a\u00020E\u0012\u0006\u0010J\u001a\u00020H\u0012\u0006\u0010M\u001a\u00020K\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R\u00a2\u0006\u0004\u0008i\u0010jJ$\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0008\u0010\r\u001a\u00020\u000cH\u0002J\u0008\u0010\u000e\u001a\u00020\u000cH\u0002J\u0012\u0010\u0011\u001a\u00020\u0010*\u0008\u0012\u0004\u0012\u00020\u000f0\tH\u0002J\u0008\u0010\u0012\u001a\u00020\u000cH\u0002J\u0012\u0010\u0015\u001a\u00020\u0010*\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u001e\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0008\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016J2\u0010&\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u0008\u0010\'\u001a\u00020\u000cH\u0016J\u0014\u0010)\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020(0\t0\u0008H\u0016J\u0010\u0010+\u001a\u00020\u000c2\u0006\u0010*\u001a\u00020\u0004H\u0016J\u0010\u0010-\u001a\u00020\u000c2\u0006\u0010,\u001a\u00020\u0014H\u0016J\u0010\u00100\u001a\u00020\u000c2\u0006\u0010/\u001a\u00020.H\u0016J\u0010\u00102\u001a\u00020\u000c2\u0006\u00101\u001a\u00020\u0006H\u0016J\u0010\u00103\u001a\u00020\u000c2\u0006\u00101\u001a\u00020\u0006H\u0016R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR \u0010]\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140Z0Y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R&\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00130Z0Y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010\\R5\u0010e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 a*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010Z0Z0`8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008b\u0010c\u001a\u0004\u0008?\u0010dRA\u0010h\u001a(\u0012$\u0012\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u0013 a*\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010Z0Z0`8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008f\u0010c\u001a\u0004\u0008g\u0010d\u00a8\u0006l"
    }
    d2 = {
        "LSM3;",
        "LAM3;",
        "Lcom/stripe/android/EphemeralKeyProvider;",
        "Lbr4;",
        "Lco/bird/android/model/constant/PaymentProvider;",
        "kind",
        "",
        "userId",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/api/request/SetDefaultProviderBody;",
        "r1",
        "Lio/reactivex/c;",
        "u0",
        "o0",
        "Lokhttp3/ResponseBody;",
        "",
        "n0",
        "k0",
        "",
        "Lco/bird/android/model/BirdPayment;",
        "w1",
        "Lcom/stripe/android/core/StripeError;",
        "",
        "errorCode",
        "errorMessage",
        "m0",
        "k1",
        "paymentMethodId",
        "i",
        "apiVersion",
        "Lcom/stripe/android/EphemeralKeyUpdateListener;",
        "keyUpdateListener",
        "createEphemeralKey",
        "email",
        "nonce",
        "Lco/bird/android/model/PaymentAddSource;",
        "source",
        "c",
        "h",
        "Lco/bird/android/model/CashpayResponse;",
        "d",
        "provider",
        "f",
        "paymentMethod",
        "g",
        "Lcom/stripe/android/model/Token;",
        "token",
        "v",
        "sourceId",
        "j0",
        "w",
        "Landroid/content/Context;",
        "b",
        "Landroid/content/Context;",
        "context",
        "LRh6;",
        "LRh6;",
        "userStream",
        "LuS5;",
        "LuS5;",
        "stripeClient",
        "LLL3;",
        "e",
        "LLL3;",
        "paymentClient",
        "Lw10;",
        "Lw10;",
        "brainTreeManager",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "LfL;",
        "LfL;",
        "birdDeviceCheckManager",
        "Lgl;",
        "Lgl;",
        "preference",
        "LTq4;",
        "j",
        "LTq4;",
        "reactiveConfig",
        "Llh6;",
        "k",
        "Llh6;",
        "userManager",
        "l",
        "Ljava/lang/String;",
        "defaultStripePaymentMethodId",
        "La94;",
        "Lco/bird/android/buava/Optional;",
        "m",
        "La94;",
        "mutableDefaultBirdPayment",
        "n",
        "mutableStripePaymentMethods",
        "LZ84;",
        "kotlin.jvm.PlatformType",
        "o",
        "Lkotlin/Lazy;",
        "()LZ84;",
        "defaultBirdPayment",
        "p",
        "r",
        "stripePaymentMethods",
        "<init>",
        "(Landroid/content/Context;LRh6;LuS5;LLL3;Lw10;LEa;LfL;Lgl;LTq4;Llh6;)V",
        "q",
        "payment_release"
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
        "SMAP\nPaymentManagerV2Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n180#2:374\n237#2:375\n199#2:376\n288#3,2:377\n*S KotlinDebug\n*F\n+ 1 PaymentManagerV2Impl.kt\nco/bird/android/manager/payment/PaymentManagerV2Impl\n*L\n82#1:374\n98#1:375\n122#1:376\n353#1:377,2\n*E\n"
    }
.end annotation


# static fields
.field public static final q:LSM3$d;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:LRh6;

.field public final d:LuS5;

.field public final e:LLL3;

.field public final f:Lw10;

.field public final g:LEa;

.field public final h:LfL;

.field public final i:Lgl;

.field public final j:LTq4;

.field public final k:Llh6;

.field public l:Ljava/lang/String;

.field public final m:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/BirdPayment;",
            ">;>;"
        }
    .end annotation
.end field

.field public final n:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdPayment;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final o:Lkotlin/Lazy;

.field public final p:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LSM3$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSM3$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSM3;->q:LSM3$d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LRh6;LuS5;LLL3;Lw10;LEa;LfL;Lgl;LTq4;Llh6;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentClient"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brainTreeManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdDeviceCheckManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userManager"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSM3;->b:Landroid/content/Context;

    iput-object p2, p0, LSM3;->c:LRh6;

    iput-object p3, p0, LSM3;->d:LuS5;

    iput-object p4, p0, LSM3;->e:LLL3;

    iput-object p5, p0, LSM3;->f:Lw10;

    iput-object p6, p0, LSM3;->g:LEa;

    iput-object p7, p0, LSM3;->h:LfL;

    iput-object p8, p0, LSM3;->i:Lgl;

    iput-object p9, p0, LSM3;->j:LTq4;

    iput-object p10, p0, LSM3;->k:Llh6;

    sget-object p1, La94;->h:La94$a;

    sget-object p3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p3}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p4

    const/4 p5, 0x0

    const/4 p6, 0x2

    invoke-static {p1, p4, p5, p6, p5}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p4

    iput-object p4, p0, LSM3;->m:La94;

    invoke-virtual {p3}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p3

    invoke-static {p1, p3, p5, p6, p5}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, LSM3;->n:La94;

    invoke-interface {p2}, LRh6;->i()Lio/reactivex/Observable;

    move-result-object p1

    sget-object p3, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string p4, "UNBOUND"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p5

    invoke-virtual {p1, p5}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p5, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p5, LSM3$a;

    invoke-direct {p5, p0}, LSM3$a;-><init>(LSM3;)V

    new-instance p6, LLM3;

    invoke-direct {p6, p5}, LLM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p2}, LRh6;->j()LZ84;

    move-result-object p1

    invoke-static {p1}, LYf5;->S(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, LSM3$b;

    invoke-direct {p2, p0}, LSM3$b;-><init>(LSM3;)V

    new-instance p5, LMM3;

    invoke-direct {p5, p2}, LMM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p5}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, LSM3$c;

    invoke-direct {p2, p0}, LSM3$c;-><init>(LSM3;)V

    new-instance p5, LNM3;

    invoke-direct {p5, p2}, LNM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p5}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "userStream\n      .stripe\u2026onErrorComplete()\n      }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    new-instance p1, LSM3$i;

    invoke-direct {p1, p0}, LSM3$i;-><init>(LSM3;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LSM3;->o:Lkotlin/Lazy;

    new-instance p1, LSM3$u;

    invoke-direct {p1, p0}, LSM3$u;-><init>(LSM3;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LSM3;->p:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LSM3;->a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSM3;->h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSM3;->g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSM3;->v0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LSM3;->s1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSM3;->s0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LSM3;->e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSM3;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LSM3;->t1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LSM3;->i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LSM3;->u1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LSM3;->v1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSM3;->g1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsManager$p(LSM3;)LEa;
    .locals 0

    iget-object p0, p0, LSM3;->g:LEa;

    return-object p0
.end method

.method public static final synthetic access$getBirdDeviceCheckManager$p(LSM3;)LfL;
    .locals 0

    iget-object p0, p0, LSM3;->h:LfL;

    return-object p0
.end method

.method public static final synthetic access$getContext$p(LSM3;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LSM3;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getMutableDefaultBirdPayment$p(LSM3;)La94;
    .locals 0

    iget-object p0, p0, LSM3;->m:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableStripePaymentMethods$p(LSM3;)La94;
    .locals 0

    iget-object p0, p0, LSM3;->n:La94;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(LSM3;)Lgl;
    .locals 0

    iget-object p0, p0, LSM3;->i:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(LSM3;)LTq4;
    .locals 0

    iget-object p0, p0, LSM3;->j:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getStripePaymentMethods(LSM3;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0}, LSM3;->k0()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUserManager$p(LSM3;)Llh6;
    .locals 0

    iget-object p0, p0, LSM3;->k:Llh6;

    return-object p0
.end method

.method public static final synthetic access$mapToString(LSM3;Lcom/stripe/android/core/StripeError;ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LSM3;->m0(Lcom/stripe/android/core/StripeError;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$processDefaultPaymentIdResponse(LSM3;LHM4;)V
    .locals 0

    invoke-virtual {p0, p1}, LSM3;->n0(LHM4;)V

    return-void
.end method

.method public static final synthetic access$refreshBrainTreeDefaultPayment(LSM3;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0}, LSM3;->o0()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$refreshStripeDefaultPayment(LSM3;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0}, LSM3;->u0()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$reset(LSM3;)V
    .locals 0

    invoke-virtual {p0}, LSM3;->k1()V

    return-void
.end method

.method public static final synthetic access$setDefaultPaymentProvider(LSM3;Lco/bird/android/model/constant/PaymentProvider;Ljava/lang/String;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1, p2}, LSM3;->r1(Lco/bird/android/model/constant/PaymentProvider;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setDefaultStripePaymentMethodId$p(LSM3;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LSM3;->l:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$updateDefaultBirdPayment(LSM3;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, LSM3;->w1(Ljava/util/List;)V

    return-void
.end method

.method public static final c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LSM3;->h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final s0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final s1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final t0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final t1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final u1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final v0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final v1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSM3;->f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LSM3;->c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LSM3;->t0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PaymentProvider;Lco/bird/android/model/PaymentAddSource;)Lio/reactivex/c;
    .locals 7

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nonce"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LSM3;->f:Lw10;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lw10;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PaymentProvider;Lco/bird/android/model/PaymentAddSource;)Lio/reactivex/F;

    move-result-object p1

    new-instance p2, LSM3$f;

    invoke-direct {p2, p0}, LSM3$f;-><init>(LSM3;)V

    new-instance p3, LCM3;

    invoke-direct {p3, p2}, LCM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun createBrain\u2026beOn(Schedulers.io())\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lio/reactivex/i;
    .locals 1

    invoke-static {p0}, Lbr4$a;->e(Lbr4;)Lio/reactivex/i;

    move-result-object v0

    return-object v0
.end method

.method public createEphemeralKey(Ljava/lang/String;Lcom/stripe/android/EphemeralKeyUpdateListener;)V
    .locals 2

    const-string v0, "apiVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyUpdateListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSM3;->d:LuS5;

    new-instance v1, Lco/bird/api/request/CreateEphemeralKeyBody;

    invoke-direct {v1, p1}, Lco/bird/api/request/CreateEphemeralKeyBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LuS5;->c(Lco/bird/api/request/CreateEphemeralKeyBody;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "stripeClient.createEphem\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v1, "UNBOUND"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v0, LSM3$g;

    invoke-direct {v0, p2}, LSM3$g;-><init>(Lcom/stripe/android/EphemeralKeyUpdateListener;)V

    new-instance v1, LBM3;

    invoke-direct {v1, v0}, LBM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, LSM3$h;

    invoke-direct {v0, p2}, LSM3$h;-><init>(Lcom/stripe/android/EphemeralKeyUpdateListener;)V

    new-instance p2, LJM3;

    invoke-direct {p2, v0}, LJM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1, p2}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public d()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/CashpayResponse;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LSM3;->e:LLL3;

    invoke-interface {v0}, LLL3;->d()Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public e()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/BirdPayment;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LSM3;->o:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public f(Lco/bird/android/model/constant/PaymentProvider;)Lio/reactivex/c;
    .locals 2

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSM3;->e:LLL3;

    invoke-interface {v0, p1}, LLL3;->j(Lco/bird/android/model/constant/PaymentProvider;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LSM3$p;

    invoke-direct {v0, p0}, LSM3$p;-><init>(LSM3;)V

    new-instance v1, LDM3;

    invoke-direct {v1, v0}, LDM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun removePayme\u2026e))\n        }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public g(Lco/bird/android/model/BirdPayment;)Lio/reactivex/c;
    .locals 3

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isStripeCard()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isStripePaymentMethod()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only Stripe cards can be removed using this method."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "{\n      Completable.erro\u2026ing this method.\"))\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v0, p0, LSM3;->e:LLL3;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->vendor()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getStripePaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-nez v2, :cond_5

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getStripeCard()Lcom/stripe/android/model/Card;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/stripe/android/model/Card;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getId()Ljava/lang/String;

    move-result-object v2

    :cond_5
    invoke-interface {v0, v1, v2}, LLL3;->g(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public h()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, LSM3;->e:LLL3;

    invoke-interface {v0}, LLL3;->k()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSM3$l;

    invoke-direct {v1, p0}, LSM3$l;-><init>(LSM3;)V

    new-instance v2, LKM3;

    invoke-direct {v2, v1}, LKM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "override fun refreshDefa\u2026beOn(Schedulers.io())\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public i(Ljava/lang/String;)Lio/reactivex/c;
    .locals 4

    const-string v0, "paymentMethodId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSM3;->e:LLL3;

    new-instance v1, Lco/bird/api/request/SetDefaultProviderBody;

    sget-object v2, Lco/bird/android/model/constant/PaymentProvider;->STRIPE:Lco/bird/android/model/constant/PaymentProvider;

    iget-object v3, p0, LSM3;->c:LRh6;

    invoke-interface {v3}, LRh6;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, v2, v3, p1}, Lco/bird/api/request/SetDefaultProviderBody;-><init>(Lco/bird/android/model/constant/PaymentProvider;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LLL3;->l(Lco/bird/api/request/SetDefaultProviderBody;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LSM3$t;

    invoke-direct {v0, p0}, LSM3$t;-><init>(LSM3;)V

    new-instance v1, LIM3;

    invoke-direct {v1, v0}, LIM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun setDefaultS\u2026aultPayment()\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public j0(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSM3;->d:LuS5;

    new-instance v1, Lco/bird/api/request/SourceBody;

    invoke-direct {v1, p1}, Lco/bird/api/request/SourceBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LuS5;->a(Lco/bird/api/request/SourceBody;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "stripeClient\n      .deta\u2026))\n      .ignoreElement()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LSM3;->q1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "stripeClient\n      .deta\u2026ent()\n      .schedulers()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final k0()Lio/reactivex/c;
    .locals 1

    new-instance v0, LSM3$j;

    invoke-direct {v0, p0}, LSM3$j;-><init>(LSM3;)V

    invoke-static {v0}, Lnh5;->e(Lkotlin/jvm/functions/Function1;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public final k1()V
    .locals 1

    iget-object v0, p0, LSM3;->m:La94;

    invoke-virtual {v0}, La94;->j()V

    iget-object v0, p0, LSM3;->n:La94;

    invoke-virtual {v0}, La94;->j()V

    return-void
.end method

.method public m()Lio/reactivex/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/v<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->g(Lbr4;)Lio/reactivex/v;

    move-result-object v0

    return-object v0
.end method

.method public final m0(Lcom/stripe/android/core/StripeError;ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    const-string p3, "type: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lcom/stripe/android/core/StripeError;->getType()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p3, " message: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p3, " code: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lcom/stripe/android/core/StripeError;->getCode()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p3, " param: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lcom/stripe/android/core/StripeError;->getParam()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p3, " declineCode: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lcom/stripe/android/core/StripeError;->getDeclineCode()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p3, " charge: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lcom/stripe/android/core/StripeError;->getCharge()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "{\n      StringBuffer().a\u2026(charge).toString()\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, "code: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string p2, " errorMessage: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "{\n      StringBuffer().a\u2026Message).toString()\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public final n0(LHM4;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lokhttp3/ResponseBody;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/ResponseBody;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LHM4;->f()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lorg/json/JSONObject;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "default_payment_method"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LSM3;->l:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public o()Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/C<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->i(Lbr4;)Lio/reactivex/C;

    move-result-object v0

    return-object v0
.end method

.method public final o0()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, LSM3;->e:LLL3;

    sget-object v1, Lco/bird/android/model/constant/PaymentProvider;->BRAINTREE:Lco/bird/android/model/constant/PaymentProvider;

    invoke-interface {v0, v1}, LLL3;->f(Lco/bird/android/model/constant/PaymentProvider;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSM3$k;

    invoke-direct {v1, p0}, LSM3$k;-><init>(LSM3;)V

    new-instance v2, LOM3;

    invoke-direct {v2, v1}, LOM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "private fun refreshBrain\u2026     .ignoreElement()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public q1(Lio/reactivex/c;)Lio/reactivex/c;
    .locals 0

    invoke-static {p0, p1}, Lbr4$a;->m(Lbr4;Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public r()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdPayment;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, LSM3;->p:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public final r1(Lco/bird/android/model/constant/PaymentProvider;Ljava/lang/String;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/PaymentProvider;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/request/SetDefaultProviderBody;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LSM3;->e:LLL3;

    new-instance v7, Lco/bird/api/request/SetDefaultProviderBody;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/api/request/SetDefaultProviderBody;-><init>(Lco/bird/android/model/constant/PaymentProvider;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, LLL3;->l(Lco/bird/api/request/SetDefaultProviderBody;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public s()Lio/reactivex/L;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/L<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->k(Lbr4;)Lio/reactivex/L;

    move-result-object v0

    return-object v0
.end method

.method public final u0()Lio/reactivex/c;
    .locals 4

    iget-object v0, p0, LSM3;->d:LuS5;

    new-instance v1, Lco/bird/api/request/CreateEphemeralKeyBody;

    iget-object v2, p0, LSM3;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lrl4;->stripe_api_version:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "context.resources.getStr\u2026tring.stripe_api_version)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lco/bird/api/request/CreateEphemeralKeyBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LuS5;->c(Lco/bird/api/request/CreateEphemeralKeyBody;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSM3$m;

    invoke-direct {v1, p0}, LSM3$m;-><init>(LSM3;)V

    new-instance v2, LPM3;

    invoke-direct {v2, v1}, LPM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, LSM3$n;->g:LSM3$n;

    new-instance v2, LQM3;

    invoke-direct {v2, v1}, LQM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSM3$o;

    invoke-direct {v1, p0}, LSM3$o;-><init>(LSM3;)V

    new-instance v2, LRM3;

    invoke-direct {v2, v1}, LRM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "private fun refreshStrip\u2026mentMethods()\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public v(Lcom/stripe/android/model/Token;)Lio/reactivex/c;
    .locals 3

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSM3;->d:LuS5;

    new-instance v1, Lco/bird/api/request/SourceBody;

    invoke-virtual {p1}, Lcom/stripe/android/model/Token;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lco/bird/api/request/SourceBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LuS5;->e(Lco/bird/api/request/SourceBody;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSM3$e;

    invoke-direct {v1, p1, p0}, LSM3$e;-><init>(Lcom/stripe/android/model/Token;LSM3;)V

    new-instance p1, LHM3;

    invoke-direct {p1, v1}, LHM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun attachSourc\u2026}\n      .schedulers()\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LSM3;->q1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public w(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSM3;->d:LuS5;

    new-instance v1, Lco/bird/api/request/SourceBody;

    invoke-direct {v1, p1}, Lco/bird/api/request/SourceBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LuS5;->d(Lco/bird/api/request/SourceBody;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LSM3$q;

    invoke-direct {v0, p0}, LSM3$q;-><init>(LSM3;)V

    new-instance v1, LEM3;

    invoke-direct {v1, v0}, LEM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LSM3$r;

    invoke-direct {v0, p0}, LSM3$r;-><init>(LSM3;)V

    new-instance v1, LFM3;

    invoke-direct {v1, v0}, LFM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LSM3$s;

    invoke-direct {v0, p0}, LSM3$s;-><init>(LSM3;)V

    new-instance v1, LGM3;

    invoke-direct {v1, v0}, LGM3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun setDefaultS\u2026}\n      .schedulers()\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LSM3;->q1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final w1(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdPayment;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, LSM3;->l:Ljava/lang/String;

    iget-object p1, p0, LSM3;->m:La94;

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LSM3;->l:Ljava/lang/String;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lco/bird/android/model/BirdPayment;

    invoke-virtual {v2}, Lco/bird/android/model/BirdPayment;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LSM3;->l:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v1, v0

    :cond_2
    check-cast v1, Lco/bird/android/model/BirdPayment;

    if-eqz v1, :cond_3

    iget-object p1, p0, LSM3;->m:La94;

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0, v1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method
