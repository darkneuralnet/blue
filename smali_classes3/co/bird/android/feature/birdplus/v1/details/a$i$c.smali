.class public final Lco/bird/android/feature/birdplus/v1/details/a$i$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/birdplus/v1/details/a$i;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
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

.field public final synthetic h:Lco/bird/android/model/persistence/BirdPlusView;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    iput-object p2, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$c;->h:Lco/bird/android/model/persistence/BirdPlusView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$i$c;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 14

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getAnalyticsManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LEa;

    move-result-object v0

    new-instance v13, LoP;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getSessionId(Lco/bird/android/feature/birdplus/v1/details/a;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "sessionId"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$c;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getCodename()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$c;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlanId()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$c;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscriptionId()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x187

    const/4 v12, 0x0

    move-object v1, v13

    invoke-direct/range {v1 .. v12}, LoP;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v13}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$c;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    new-instance v1, Lco/bird/android/feature/birdplus/v1/details/a$i$c$a;

    invoke-direct {v1, p1}, Lco/bird/android/feature/birdplus/v1/details/a$i$c$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method