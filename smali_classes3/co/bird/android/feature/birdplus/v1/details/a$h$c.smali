.class public final Lco/bird/android/feature/birdplus/v1/details/a$h$c;
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
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "e",
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


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$h$c;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/feature/birdplus/v1/details/a$h$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getAnalyticsManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LEa;

    move-result-object v1

    new-instance v14, LUQ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v2, v0, Lco/bird/android/feature/birdplus/v1/details/a$h$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v2}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getSessionId(Lco/bird/android/feature/birdplus/v1/details/a;)Ljava/lang/String;

    move-result-object v6

    const-string v2, "sessionId"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lco/bird/android/feature/birdplus/v1/details/a$h$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-virtual {v2}, Lf1;->k()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LtQ;

    invoke-virtual {v2}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v2

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusView;->getCodename()Ljava/lang/String;

    move-result-object v2

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object v8, v7

    :goto_0
    iget-object v2, v0, Lco/bird/android/feature/birdplus/v1/details/a$h$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-virtual {v2}, Lf1;->k()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LtQ;

    invoke-virtual {v2}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlanId()Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object v9, v7

    :goto_1
    iget-object v2, v0, Lco/bird/android/feature/birdplus/v1/details/a$h$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-virtual {v2}, Lf1;->k()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LtQ;

    invoke-virtual {v2}, LtQ;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscriptionId()Ljava/lang/String;

    move-result-object v2

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object v10, v7

    :goto_2
    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x187

    const/4 v15, 0x0

    move-object v2, v14

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move v12, v13

    move-object v13, v15

    invoke-direct/range {v2 .. v13}, LUQ;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v14}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-static/range {p1 .. p1}, Lg46;->e(Ljava/lang/Throwable;)V

    iget-object v1, v0, Lco/bird/android/feature/birdplus/v1/details/a$h$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    new-instance v2, Lco/bird/android/feature/birdplus/v1/details/a$h$c$a;

    move-object/from16 v3, p1

    invoke-direct {v2, v3}, Lco/bird/android/feature/birdplus/v1/details/a$h$c$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
