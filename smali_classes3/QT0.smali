.class public final LQT0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMV0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B1\u0008\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "LQT0;",
        "LMV0;",
        "Landroid/content/Intent;",
        "intent",
        "Lio/reactivex/c;",
        "a",
        "Lgl;",
        "Lgl;",
        "preference",
        "LJT0;",
        "b",
        "LJT0;",
        "dealManager",
        "Lwi2;",
        "c",
        "Lwi2;",
        "deserializer",
        "LEa;",
        "d",
        "LEa;",
        "analyticsManager",
        "Le13;",
        "e",
        "Le13;",
        "navigator",
        "<init>",
        "(Lgl;LJT0;Lwi2;LEa;Le13;)V",
        "deeplink_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lgl;

.field public final b:LJT0;

.field public final c:Lwi2;

.field public final d:LEa;

.field public final e:Le13;


# direct methods
.method public constructor <init>(Lgl;LJT0;Lwi2;LEa;Le13;)V
    .locals 1

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dealManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQT0;->a:Lgl;

    iput-object p2, p0, LQT0;->b:LJT0;

    iput-object p3, p0, LQT0;->c:Lwi2;

    iput-object p4, p0, LQT0;->d:LEa;

    iput-object p5, p0, LQT0;->e:Le13;

    return-void
.end method

.method public static synthetic b(LQT0;Landroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LQT0;->c(LQT0;Landroid/content/Intent;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LQT0;Landroid/content/Intent;)Ljava/lang/Object;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LQT0;->e:Le13;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToRider$default(Le13;ZZLco/bird/android/model/GoDeepLinkParams;ILjava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "deal"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, LQT0;->c:Lwi2;

    check-cast p1, Ljava/lang/String;

    const-class v2, Lco/bird/android/model/Deal;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/Deal;

    iget-object v1, p0, LQT0;->d:LEa;

    new-instance v2, Lco/bird/android/model/analytics/BonusDealPushed;

    iget-object v3, p0, LQT0;->a:Lgl;

    invoke-virtual {v3}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    invoke-direct {v2, p1, v3}, Lco/bird/android/model/analytics/BonusDealPushed;-><init>(Lco/bird/android/model/Deal;Ljava/lang/String;)V

    invoke-interface {v1, v2}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object v1, p0, LQT0;->b:LJT0;

    invoke-interface {v1, p1}, LJT0;->f(Lco/bird/android/model/Deal;)V

    iget-object p0, p0, LQT0;->e:Le13;

    const/4 p1, 0x1

    invoke-static {p0, v0, p1, v0}, Le13$a;->goToDeal$default(Le13;Lco/bird/android/model/Deal;ILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Intent;)Lio/reactivex/c;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPT0;

    invoke-direct {v0, p0, p1}, LPT0;-><init>(LQT0;Landroid/content/Intent;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "fromCallable {\n    navig\u2026ator.goToDeal()\n    }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
