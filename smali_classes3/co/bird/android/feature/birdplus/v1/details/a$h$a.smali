.class public final Lco/bird/android/feature/birdplus/v1/details/a$h$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/birdplus/v1/details/a$h;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/BirdPayment;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00012z\u0010\u0006\u001av\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*:\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Triple;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/BirdPayment;",
        "",
        "it",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/birdplus/v1/details/a;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lkotlin/Unit;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/BirdPayment;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {p1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getAnalyticsManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LEa;

    move-result-object p1

    new-instance v12, LVQ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getSessionId(Lco/bird/android/feature/birdplus/v1/details/a;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "sessionId"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LtQ;

    invoke-virtual {v0}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v0

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getCodename()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v6, v5

    :goto_0
    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LtQ;

    invoke-virtual {v0}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlanId()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    :cond_1
    move-object v7, v5

    :goto_1
    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LtQ;

    invoke-virtual {v0}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscriptionId()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_2

    :cond_2
    move-object v8, v5

    :goto_2
    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LtQ;

    invoke-virtual {v0}, LtQ;->c()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LtQ;

    invoke-virtual {v0}, LtQ;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    move v9, v0

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LtQ;

    invoke-virtual {v0}, LtQ;->c()Z

    move-result v10

    const/4 v11, 0x7

    const/4 v13, 0x0

    move-object v0, v12

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move-object v11, v13

    invoke-direct/range {v0 .. v11}, LVQ;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v12}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$h$a;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
