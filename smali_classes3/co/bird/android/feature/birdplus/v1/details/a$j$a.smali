.class public final Lco/bird/android/feature/birdplus/v1/details/a$j$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/birdplus/v1/details/a$j;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
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
.field public final synthetic g:Lco/bird/android/feature/birdplus/v1/details/a;

.field public final synthetic h:Lco/bird/android/model/persistence/BirdPlusView;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$j$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    iput-object p2, p0, Lco/bird/android/feature/birdplus/v1/details/a$j$a;->h:Lco/bird/android/model/persistence/BirdPlusView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$j$a;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 13

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$j$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {p1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getAnalyticsManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LEa;

    move-result-object p1

    new-instance v12, LiR;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$j$a;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getSessionId(Lco/bird/android/feature/birdplus/v1/details/a;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "sessionId"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$j$a;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getCodename()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$j$a;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlanId()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$j$a;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscriptionId()Ljava/lang/String;

    move-result-object v7

    const-wide/16 v8, 0x0

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, LiR;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v12}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method
