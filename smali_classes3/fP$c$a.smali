.class public final LfP$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfP$c;->b(Lco/bird/android/model/persistence/BirdPlusView;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/persistence/BirdPlusView;

.field public final synthetic h:LfP;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/BirdPlusView;LfP;)V
    .locals 0

    iput-object p1, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    iput-object p2, p0, LfP$c$a;->h:LfP;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LfP$c$a;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 13

    iget-object p1, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->isIneligible()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p0, LfP$c$a;->h:LfP;

    invoke-static {p1}, LfP;->access$getAnalyticsManager$p(LfP;)LEa;

    move-result-object p1

    new-instance v12, LvQ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v1, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getCodename()Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, v0

    :goto_0
    iget-object v1, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getId()Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, v0

    :goto_1
    iget-object v1, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscription()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->getId()Ljava/lang/String;

    move-result-object v0

    :cond_2
    move-object v7, v0

    const-string v8, "banner"

    const-string v9, "transfer"

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v1, v12

    invoke-direct/range {v1 .. v11}, LvQ;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v12}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    goto :goto_4

    :cond_3
    iget-object p1, p0, LfP$c$a;->h:LfP;

    invoke-static {p1}, LfP;->access$getAnalyticsManager$p(LfP;)LEa;

    move-result-object p1

    new-instance v10, LbP;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v1, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getCodename()Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    goto :goto_2

    :cond_4
    move-object v5, v0

    :goto_2
    iget-object v1, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getId()Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    goto :goto_3

    :cond_5
    move-object v6, v0

    :goto_3
    iget-object v1, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscription()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->getId()Ljava/lang/String;

    move-result-object v0

    :cond_6
    move-object v7, v0

    const/4 v8, 0x7

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, LbP;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v10}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_4
    iget-object p1, p0, LfP$c$a;->h:LfP;

    invoke-static {p1}, LfP;->access$getNavigator$p(LfP;)Le13;

    move-result-object p1

    iget-object v0, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscriptionId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlanId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LfP$c$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusView;->getCodename()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Le13;->X(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
