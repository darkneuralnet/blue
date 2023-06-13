.class public final LfP$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfP;->onBannerShown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "Lio/reactivex/B<",
        "+",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "plan",
        "Lio/reactivex/B;",
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/persistence/BirdPlusView;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LfP;


# direct methods
.method public constructor <init>(LfP;)V
    .locals 0

    iput-object p1, p0, LfP$c;->g:LfP;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LfP$c;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lco/bird/android/model/persistence/BirdPlusView;)Lio/reactivex/B;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "plan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LfP$c;->g:LfP;

    invoke-static {v0}, LfP;->access$getUi$p(LfP;)LkP;

    move-result-object v0

    invoke-interface {v0, p1}, LkP;->b(Lco/bird/android/model/persistence/BirdPlusView;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->isIneligible()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, LfP$c;->g:LfP;

    invoke-static {v0}, LfP;->access$getAnalyticsManager$p(LfP;)LEa;

    move-result-object v0

    new-instance v12, LwQ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getCodename()Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object v6, v1

    :goto_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getId()Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object v7, v1

    :goto_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscription()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->getId()Ljava/lang/String;

    move-result-object v1

    :cond_2
    move-object v8, v1

    const-string v9, "banner"

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, LwQ;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v12}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    goto :goto_4

    :cond_3
    iget-object v0, p0, LfP$c;->g:LfP;

    invoke-static {v0}, LfP;->access$getAnalyticsManager$p(LfP;)LEa;

    move-result-object v0

    new-instance v11, LcP;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getCodename()Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    goto :goto_2

    :cond_4
    move-object v6, v1

    :goto_2
    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getId()Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto :goto_3

    :cond_5
    move-object v7, v1

    :goto_3
    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscription()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->getId()Ljava/lang/String;

    move-result-object v1

    :cond_6
    move-object v8, v1

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, LcP;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_4
    iget-object v0, p0, LfP$c;->g:LfP;

    invoke-static {v0}, LfP;->access$getUi$p(LfP;)LkP;

    move-result-object v0

    invoke-interface {v0}, LkP;->a()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LfP$c$a;

    iget-object v2, p0, LfP$c;->g:LfP;

    invoke-direct {v1, p1, v2}, LfP$c$a;-><init>(Lco/bird/android/model/persistence/BirdPlusView;LfP;)V

    new-instance p1, LgP;

    invoke-direct {p1, v1}, LgP;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {p0, p1}, LfP$c;->b(Lco/bird/android/model/persistence/BirdPlusView;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
