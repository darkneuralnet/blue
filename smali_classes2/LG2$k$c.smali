.class public final LLG2$k$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLG2$k;->d(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "isMocked",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Ljava/lang/Boolean;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LLG2;

.field public final synthetic h:Lco/bird/android/model/User;


# direct methods
.method public constructor <init>(LLG2;Lco/bird/android/model/User;)V
    .locals 0

    iput-object p1, p0, LLG2$k$c;->g:LLG2;

    iput-object p2, p0, LLG2$k$c;->h:Lco/bird/android/model/User;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LLG2$k$c;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LLG2$k$c;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Boolean;)Lio/reactivex/K;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "isMocked"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LLG2$k$c;->g:LLG2;

    invoke-static {v0}, LLG2;->access$getAnalyticsManager$p(LLG2;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/AppOpenedWithMockLocationProvider;

    invoke-direct {v1}, Lco/bird/android/model/analytics/AppOpenedWithMockLocationProvider;-><init>()V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object v0, p0, LLG2$k$c;->g:LLG2;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, LLG2$k$c;->h:Lco/bird/android/model/User;

    const-string v2, "user"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LLG2$k$c;->g:LLG2;

    invoke-static {v2}, LLG2;->access$getReactiveConfig$p(LLG2;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getBlockMockLocationProviders()Z

    move-result v2

    invoke-static {v0, p1, v1, v2}, LLG2;->access$blockEntryDueToMockedLocation(LLG2;ZLco/bird/android/model/User;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LLG2$k$c;->g:LLG2;

    invoke-static {p1}, LLG2;->access$getAnalyticsManager$p(LLG2;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/SplashScreenTrace;

    invoke-direct {v1}, Lco/bird/android/model/analytics/SplashScreenTrace;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, LEa$a;->stopTrace$default(LEa;Lco/bird/android/model/analytics/TraceKey;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;ILjava/lang/Object;)V

    iget-object p1, p0, LLG2$k$c;->g:LLG2;

    invoke-static {p1}, LLG2;->access$getUi$p(LLG2;)LbH2;

    move-result-object p1

    invoke-interface {p1}, LbH2;->m6()Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LLG2$k$c$a;

    iget-object v1, p0, LLG2$k$c;->g:LLG2;

    invoke-direct {v0, v1}, LLG2$k$c$a;-><init>(LLG2;)V

    new-instance v1, LQG2;

    invoke-direct {v1, v0}, LQG2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LLG2$k$c$b;->g:LLG2$k$c$b;

    new-instance v1, LRG2;

    invoke-direct {v1, v0}, LRG2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LLG2$k$c;->c(Ljava/lang/Boolean;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
