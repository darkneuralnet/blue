.class public final LC75$i;
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
        "Lco/bird/android/model/wire/WireRideDetail;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRideDetail;",
        "kotlin.jvm.PlatformType",
        "rideDetail",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireRideDetail;)V"
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

.field public final synthetic h:Landroid/content/Intent;


# direct methods
.method public constructor <init>(LC75;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, LC75$i;->g:LC75;

    iput-object p2, p0, LC75$i;->h:Landroid/content/Intent;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRideDetail;)V
    .locals 11

    iget-object v0, p0, LC75$i;->g:LC75;

    invoke-static {v0}, LC75;->access$getAnalyticsManager$p(LC75;)LEa;

    move-result-object v0

    new-instance v10, LEG3;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getBirdId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    move-object v6, v1

    const/4 v7, 0x0

    const/16 v8, 0x27

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, LEG3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v0, p0, LC75$i;->h:Landroid/content/Intent;

    const-string v1, "has_physical_lock"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iget-object v1, p0, LC75$i;->h:Landroid/content/Intent;

    const-string v3, "show_parking_warning"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    iget-object v2, p0, LC75$i;->g:LC75;

    invoke-static {v2}, LC75;->access$getNavigator$p(LC75;)Le13;

    move-result-object v2

    const-string v3, "rideDetail"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, p1, v1, v0}, Le13;->F(Lco/bird/android/model/wire/WireRideDetail;ZZ)V

    iget-object p1, p0, LC75$i;->g:LC75;

    invoke-static {p1}, LC75;->access$getNavigator$p(LC75;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRideDetail;

    invoke-virtual {p0, p1}, LC75$i;->a(Lco/bird/android/model/wire/WireRideDetail;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
