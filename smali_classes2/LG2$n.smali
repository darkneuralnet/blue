.class public final LLG2$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLG2;->F()V
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
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)Lio/reactivex/h;",
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
.field public final synthetic g:LLG2;


# direct methods
.method public constructor <init>(LLG2;)V
    .locals 0

    iput-object p1, p0, LLG2$n;->g:LLG2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LLG2;)V
    .locals 0

    invoke-static {p0}, LLG2$n;->c(LLG2;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LLG2$n;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(LLG2;)V
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "deeplink navigator resolved"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p0}, LLG2;->access$getAnalyticsManager$p(LLG2;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/SplashScreenNavigation;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-string v4, "ForwardedToDeeplink"

    invoke-direct {v1, v4, v2, v3, v2}, Lco/bird/android/model/analytics/SplashScreenNavigation;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    invoke-static {p0}, LLG2;->access$getAnalyticsManager$p(LLG2;)LEa;

    move-result-object v5

    new-instance v6, Lco/bird/android/model/analytics/SplashScreenTrace;

    invoke-direct {v6}, Lco/bird/android/model/analytics/SplashScreenTrace;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, LEa$a;->stopTrace$default(LEa;Lco/bird/android/model/analytics/TraceKey;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;ILjava/lang/Object;)V

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
.method public final invoke(Ljava/lang/Boolean;)Lio/reactivex/h;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LLG2$n;->g:LLG2;

    invoke-static {p1}, LLG2;->access$getDeepLinkNavigatorResolver$p(LLG2;)LNV0;

    iget-object p1, p0, LLG2$n;->g:LLG2;

    invoke-static {p1}, LLG2;->access$getDeepLinkNavigatorResolver$p(LLG2;)LNV0;

    move-result-object p1

    invoke-interface {p1}, LNV0;->b()Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LLG2$n;->g:LLG2;

    new-instance v1, LTG2;

    invoke-direct {v1, v0}, LTG2;-><init>(LLG2;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LLG2$n$a;

    iget-object v1, p0, LLG2$n;->g:LLG2;

    invoke-direct {v0, v1}, LLG2$n$a;-><init>(LLG2;)V

    new-instance v1, LUG2;

    invoke-direct {v1, v0}, LUG2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LLG2$n;->invoke(Ljava/lang/Boolean;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
