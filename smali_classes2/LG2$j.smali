.class public final LLG2$j;
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
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainPresenter.kt\nco/bird/android/app/feature/main/MainPresenterImpl$startApp$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,439:1\n1#2:440\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LLG2;


# direct methods
.method public constructor <init>(LLG2;)V
    .locals 0

    iput-object p1, p0, LLG2$j;->g:LLG2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LLG2$j;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/User;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/User;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v0}, Lco/bird/android/model/User;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object p1, p0, LLG2$j;->g:LLG2;

    invoke-static {p1}, LLG2;->access$getNavigator$p(LLG2;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->C2()V

    iget-object p1, p0, LLG2$j;->g:LLG2;

    invoke-static {p1}, LLG2;->access$getNavigator$p(LLG2;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    iget-object p1, p0, LLG2$j;->g:LLG2;

    invoke-static {p1}, LLG2;->access$getAnalyticsManager$p(LLG2;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/SplashScreenNavigation;

    const-string v1, "IntroMagicLink"

    const-string v2, "checkUser"

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/SplashScreenNavigation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, LLG2$j;->g:LLG2;

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

    return-void

    :cond_0
    const-string v1, "user"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lco/bird/android/model/UserKt;->isContractor(Lco/bird/android/model/User;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LLG2$j;->g:LLG2;

    invoke-static {v1}, LLG2;->access$getPreference$p(LLG2;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->t0()Lco/bird/android/model/constant/MapMode;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-eq v1, v2, :cond_2

    sget-object v1, LOB;->m:LOB$a;

    invoke-static {v0, p1}, Lco/bird/android/model/UserKt;->getRoles(Lco/bird/android/model/User;Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, LOB$a;->a(Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, LLG2$j;->g:LLG2;

    invoke-static {v1}, LLG2;->access$getPreference$p(LLG2;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->r0()Lco/bird/android/model/UserRoleItem;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, LLG2$j;->g:LLG2;

    invoke-static {v2}, LLG2;->access$getPreference$p(LLG2;)Lgl;

    move-result-object v2

    invoke-virtual {v2, v1}, Lgl;->F2(Lco/bird/android/model/UserRoleItem;)V

    :cond_1
    iget-object v1, p0, LLG2$j;->g:LLG2;

    invoke-static {v1}, LLG2;->access$getPreference$p(LLG2;)Lgl;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    invoke-virtual {v1, v2}, Lgl;->z(Lco/bird/android/model/constant/MapMode;)V

    :cond_2
    iget-object v1, p0, LLG2$j;->g:LLG2;

    invoke-static {v1}, LLG2;->access$getSpecialTaskDispatchReceived$p(LLG2;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0}, Lco/bird/android/model/UserKt;->isOperator(Lco/bird/android/model/User;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LLG2$j;->g:LLG2;

    invoke-static {v1}, LLG2;->access$getPreference$p(LLG2;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->r0()Lco/bird/android/model/UserRoleItem;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, LLG2$j;->g:LLG2;

    invoke-static {v2}, LLG2;->access$getPreference$p(LLG2;)Lgl;

    move-result-object v2

    invoke-virtual {v2, v1}, Lgl;->F2(Lco/bird/android/model/UserRoleItem;)V

    :cond_3
    iget-object v1, p0, LLG2$j;->g:LLG2;

    invoke-static {v1}, LLG2;->access$getPreference$p(LLG2;)Lgl;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    invoke-virtual {v1, v2}, Lgl;->z(Lco/bird/android/model/constant/MapMode;)V

    :cond_4
    iget-object v1, p0, LLG2$j;->g:LLG2;

    const-string v2, "isMerchant"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-static {v1, v0, v2}, LLG2;->access$isPermissionRemoved(LLG2;Lco/bird/android/model/User;Z)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, LLG2$j;->g:LLG2;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v1, v0, p1}, LLG2;->access$isRiderTheOnlyRole(LLG2;Lco/bird/android/model/User;Z)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    iget-object p1, p0, LLG2$j;->g:LLG2;

    invoke-static {p1}, LLG2;->access$resetToRiderMode(LLG2;)V

    :cond_6
    return-void
.end method
