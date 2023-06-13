.class public final Lco/bird/android/manager/payment/StripeResolverManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBS5;
.implements LVX0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u00012\u00020\u0002BC\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0008\u0008\u0001\u0010!\u001a\u00020\u0003\u00a2\u0006\u0004\u00081\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R&\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0\'0&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R,\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0\'0+8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/\u00a8\u00063"
    }
    d2 = {
        "Lco/bird/android/manager/payment/StripeResolverManagerImpl;",
        "LBS5;",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onStart",
        "Landroid/content/Context;",
        "b",
        "Landroid/content/Context;",
        "context",
        "LTq4;",
        "c",
        "LTq4;",
        "reactiveConfig",
        "LOh;",
        "d",
        "LOh;",
        "appBuildConfig",
        "LRh6;",
        "e",
        "LRh6;",
        "userStream",
        "Lgl;",
        "f",
        "Lgl;",
        "appPreference",
        "Lcom/stripe/android/Stripe;",
        "g",
        "Lcom/stripe/android/Stripe;",
        "stripe",
        "h",
        "LLifecycleOwner;",
        "processLifecycleOwner",
        "",
        "i",
        "Ljava/lang/String;",
        "appPreferenceStripeKey",
        "La94;",
        "Lkotlin/Pair;",
        "j",
        "La94;",
        "currentUserStripeRelay",
        "LZ84;",
        "k",
        "LZ84;",
        "a",
        "()LZ84;",
        "currentUserStripe",
        "<init>",
        "(Landroid/content/Context;LTq4;LOh;LRh6;Lgl;Lcom/stripe/android/Stripe;LLifecycleOwner;)V",
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
        "SMAP\nStripeResolverManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeResolverManagerImpl.kt\nco/bird/android/manager/payment/StripeResolverManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,53:1\n44#2:54\n180#3:55\n*S KotlinDebug\n*F\n+ 1 StripeResolverManagerImpl.kt\nco/bird/android/manager/payment/StripeResolverManagerImpl\n*L\n49#1:54\n49#1:55\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:LTq4;

.field public final d:LOh;

.field public final e:LRh6;

.field public final f:Lgl;

.field public final g:Lcom/stripe/android/Stripe;

.field public final h:LLifecycleOwner;

.field public final i:Ljava/lang/String;

.field public final j:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/Stripe;",
            ">;>;"
        }
    .end annotation
.end field

.field public final k:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/Stripe;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;LTq4;LOh;LRh6;Lgl;Lcom/stripe/android/Stripe;LLifecycleOwner;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appBuildConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appPreference"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripe"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->b:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->c:LTq4;

    iput-object p3, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->d:LOh;

    iput-object p4, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->e:LRh6;

    iput-object p5, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->f:Lgl;

    iput-object p6, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->g:Lcom/stripe/android/Stripe;

    iput-object p7, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->h:LLifecycleOwner;

    invoke-virtual {p5}, Lgl;->O()Luf1;

    move-result-object p2

    invoke-virtual {p2}, Luf1;->h()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "context.getString(appPre\u2026.getEnvironment().stripe)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->i:Ljava/lang/String;

    sget-object p2, La94;->h:La94$a;

    invoke-static {p1, p6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p3, 0x0

    const/4 p4, 0x2

    invoke-static {p2, p1, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->j:La94;

    sget-object p2, LZ84;->d:LZ84$a;

    invoke-virtual {p2, p1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->k:LZ84;

    invoke-interface {p7}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method

.method public static final synthetic access$getAppBuildConfig$p(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)LOh;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->d:LOh;

    return-object p0
.end method

.method public static final synthetic access$getContext$p(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getCurrentUserStripeRelay$p(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->j:La94;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->c:LTq4;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/Stripe;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->k:LZ84;

    return-object v0
.end method

.method public onStart(LLifecycleOwner;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    iget-object v0, p0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;->e:LRh6;

    invoke-interface {v0}, LRh6;->j()LZ84;

    move-result-object v0

    invoke-static {v0}, LYf5;->S(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;

    invoke-direct {v1, p0}, Lco/bird/android/manager/payment/StripeResolverManagerImpl$a;-><init>(Lco/bird/android/manager/payment/StripeResolverManagerImpl;)V

    new-instance v2, LCS5;

    invoke-direct {v2, v1}, LCS5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun onStart(own\u2026))\n      .subscribe()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p1

    const-string v1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method
