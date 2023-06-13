.class public final Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;->L(Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/H<",
        "LrD2;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/H;",
        "LrD2;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/H;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->g:Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;

    iput-object p2, p0, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic b(LdE2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->h(LdE2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;LrD2;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->f(Lkotlin/jvm/functions/Function1;LrD2;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;LrD2;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->i(Lkotlin/jvm/functions/Function1;LrD2;)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;LrD2;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h(LdE2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "$successListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$failureListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LNz1;

    invoke-direct {v0, p1}, LNz1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, LdE2;->j(LVD2;)LdE2;

    new-instance p1, LOz1;

    invoke-direct {p1, p2}, LOz1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1}, LdE2;->i(LVD2;)LdE2;

    return-void
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;LrD2;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "LrD2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e$b;

    invoke-direct {v0, p1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e$b;-><init>(Lio/reactivex/H;)V

    new-instance v1, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e$a;

    invoke-direct {v1, p1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e$a;-><init>(Lio/reactivex/H;)V

    iget-object v2, p0, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->g:Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->h:Ljava/lang/String;

    invoke-static {v2, v3}, LAD2;->j(Landroid/content/Context;Ljava/lang/String;)LdE2;

    move-result-object v2

    new-instance v3, LKz1;

    invoke-direct {v3, v0}, LKz1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v3}, LdE2;->d(LVD2;)LdE2;

    new-instance v3, LLz1;

    invoke-direct {v3, v1}, LLz1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v3}, LdE2;->c(LVD2;)LdE2;

    new-instance v3, LMz1;

    invoke-direct {v3, v2, v0, v1}, LMz1;-><init>(LdE2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v3}, Lio/reactivex/H;->a(Lio/reactivex/functions/f;)V

    return-void
.end method
