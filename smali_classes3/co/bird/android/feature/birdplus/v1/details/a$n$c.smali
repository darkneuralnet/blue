.class public final Lco/bird/android/feature/birdplus/v1/details/a$n$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/birdplus/v1/details/a$n;->d(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;)Lio/reactivex/B;
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
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "Lco/bird/android/buava/Optional;",
        "",
        "kotlin.jvm.PlatformType",
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


# instance fields
.field public final synthetic g:Lco/bird/android/feature/birdplus/v1/details/a;

.field public final synthetic h:Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    iput-object p2, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->h:Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlanId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "streamed bird plus view "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getHasEmittedDisplayEvent$p(Lco/bird/android/feature/birdplus/v1/details/a;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getAnalyticsManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LEa;

    move-result-object v1

    new-instance v13, LxP;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v2}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getSessionId(Lco/bird/android/feature/birdplus/v1/details/a;)Ljava/lang/String;

    move-result-object v6

    const-string v2, "sessionId"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->h:Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;

    instance-of v7, v2, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;

    const/4 v8, 0x0

    if-eqz v7, :cond_0

    check-cast v2, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;

    invoke-virtual {v2}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->unbox-impl()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v8

    :goto_0
    if-nez v2, :cond_1

    move-object v7, v8

    goto :goto_1

    :cond_1
    move-object v7, v2

    :goto_1
    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->h:Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;

    instance-of v9, v2, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;

    if-eqz v9, :cond_2

    check-cast v2, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;

    invoke-virtual {v2}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;->unbox-impl()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v8

    :goto_2
    if-nez v2, :cond_3

    move-object v9, v8

    goto :goto_3

    :cond_3
    move-object v9, v2

    :goto_3
    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->h:Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;

    instance-of v10, v2, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;

    if-eqz v10, :cond_4

    check-cast v2, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;

    invoke-virtual {v2}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;->unbox-impl()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_4
    move-object v2, v8

    :goto_4
    if-nez v2, :cond_5

    move-object v10, v8

    goto :goto_5

    :cond_5
    move-object v10, v2

    :goto_5
    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    const-string v8, "activeSubscriptionId"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0, p1}, Lco/bird/android/feature/birdplus/v1/details/a;->R(Lco/bird/android/model/persistence/BirdPlusView;Lco/bird/android/buava/Optional;)Ljava/lang/String;

    move-result-object p1

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v2, v13

    move-object v8, v9

    move-object v9, v10

    move-object v10, p1

    invoke-direct/range {v2 .. v12}, LxP;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v13}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$n$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$setHasEmittedDisplayEvent$p(Lco/bird/android/feature/birdplus/v1/details/a;Z)V

    :cond_6
    return-void
.end method
