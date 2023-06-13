.class public final Lco/bird/android/feature/birdplus/v1/details/a$i$b;
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
        "Lkotlin/Unit;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lkotlin/Unit;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/persistence/BirdPlusView;

.field public final synthetic h:Lco/bird/android/feature/birdplus/v1/details/a;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/BirdPlusView;Lco/bird/android/feature/birdplus/v1/details/a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->g:Lco/bird/android/model/persistence/BirdPlusView;

    iput-object p2, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/feature/birdplus/v1/details/a;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->f(Lco/bird/android/feature/birdplus/v1/details/a;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->e(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V

    return-void
.end method

.method public static final e(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$birdPlusView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getAnalyticsManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LEa;

    move-result-object v0

    new-instance v11, LmP;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getSessionId(Lco/bird/android/feature/birdplus/v1/details/a;)Ljava/lang/String;

    move-result-object v5

    const-string p0, "sessionId"

    invoke-static {v5, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getCodename()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlanId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscriptionId()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, LmP;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public static final f(Lco/bird/android/feature/birdplus/v1/details/a;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getBirdPlusManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LJQ;

    move-result-object p0

    invoke-interface {p0}, LJQ;->refresh()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lkotlin/Unit;)Lio/reactivex/h;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getUserSubscriptionId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getBirdPlusManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LJQ;

    move-result-object v0

    invoke-interface {v0, p1}, LJQ;->Q(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->g:Lco/bird/android/model/persistence/BirdPlusView;

    new-instance v2, LhQ;

    invoke-direct {v2, v0, v1}, LhQ;-><init>(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V

    invoke-virtual {p1, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    new-instance v1, LiQ;

    invoke-direct {v1, v0}, LiQ;-><init>(Lco/bird/android/feature/birdplus/v1/details/a;)V

    invoke-static {v1}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/birdplus/v1/details/a$i$b$a;

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->h:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-direct {v0, v1}, Lco/bird/android/feature/birdplus/v1/details/a$i$b$a;-><init>(Lco/bird/android/feature/birdplus/v1/details/a;)V

    new-instance v1, LjQ;

    invoke-direct {v1, v0}, LjQ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->d(Lkotlin/Unit;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
