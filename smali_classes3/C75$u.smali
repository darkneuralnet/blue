.class public final LC75$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC75;->b(Landroid/content/Intent;)V
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
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Float;",
        "+",
        "Ljava/lang/Boolean;",
        ">;+",
        "Lco/bird/android/model/wire/WireRideDetail;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072j\u0010\u0006\u001af\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00030\u0003 \u0005*2\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lkotlin/Pair;",
        "",
        "",
        "Lco/bird/android/model/wire/WireRideDetail;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
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
.field public final synthetic g:LC75;


# direct methods
.method public constructor <init>(LC75;)V
    .locals 0

    iput-object p1, p0, LC75$u;->g:LC75;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lco/bird/android/model/wire/WireRideDetail;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireRideDetail;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    iget-object v3, p0, LC75$u;->g:LC75;

    invoke-static {v3}, LC75;->access$getAnalyticsManager$p(LC75;)LEa;

    move-result-object v3

    new-instance v4, Lco/bird/android/model/analytics/RideRated;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    iget-object v6, p0, LC75$u;->g:LC75;

    invoke-static {v6}, LC75;->access$getReactiveConfig$p(LC75;)LTq4;

    move-result-object v6

    invoke-virtual {v6}, LTq4;->f8()LZ84;

    move-result-object v6

    invoke-virtual {v6}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/wire/configs/Config;

    invoke-static {v6}, LFv0;->a(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object v6

    invoke-direct {v4, v5, v2, v6}, Lco/bird/android/model/analytics/RideRated;-><init>(FLco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireRidePrice;)V

    invoke-interface {v3, v4}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    const/high16 v4, 0x40a00000    # 5.0f

    cmpg-float v3, v3, v4

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    iget-object p1, p0, LC75$u;->g:LC75;

    invoke-static {p1}, LC75;->access$getRideSummaryUi$p(LC75;)LF75;

    move-result-object p1

    invoke-interface {p1}, LF75;->D()V

    iget-object p1, p0, LC75$u;->g:LC75;

    invoke-static {p1}, LC75;->access$getRideSummaryUi$p(LC75;)LF75;

    move-result-object p1

    new-instance v0, LC75$u$a;

    iget-object v1, p0, LC75$u;->g:LC75;

    invoke-direct {v0, v1, v2}, LC75$u$a;-><init>(LC75;Lco/bird/android/model/wire/WireRide;)V

    invoke-interface {p1, v0}, LF75;->X2(Lkotlin/jvm/functions/Function0;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v1, v3}, Lco/bird/android/model/wire/WireRideDetail;->setRating(Ljava/lang/Float;)V

    iget-object v3, p0, LC75$u;->g:LC75;

    invoke-static {v3}, LC75;->access$getAppPreference$p(LC75;)Lgl;

    move-result-object v3

    const-string v4, "rideDetail"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lgl;->i2(Lco/bird/android/model/wire/WireRideDetail;)V

    const-string v1, "enableEndRideRatingIssuesV2"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LC75$u;->g:LC75;

    invoke-static {p1}, LC75;->access$getNavigator$p(LC75;)Le13;

    move-result-object p1

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    sget-object v1, LI35;->g:LI35;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v2, v0, v1}, Le13;->I1(Lco/bird/android/model/wire/WireRide;FLjava/lang/Integer;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, LC75$u;->g:LC75;

    invoke-static {p1}, LC75;->access$getNavigator$p(LC75;)Le13;

    move-result-object p1

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    sget-object v1, LI35;->g:LI35;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v2, v0, v1}, Le13;->D1(Lco/bird/android/model/wire/WireRide;FLjava/lang/Integer;)V

    :goto_1
    iget-object p1, p0, LC75$u;->g:LC75;

    invoke-static {p1}, LC75;->access$getNavigator$p(LC75;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LC75$u;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
