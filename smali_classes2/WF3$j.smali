.class public final LWF3$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWF3;->onBannerShown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireLocation;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lco/bird/android/model/wire/WireLocation;",
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
.field public final synthetic g:LWF3;


# direct methods
.method public constructor <init>(LWF3;)V
    .locals 0

    iput-object p1, p0, LWF3$j;->g:LWF3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {p0, p1}, LWF3$j;->invoke(Lco/bird/android/model/wire/WireLocation;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lco/bird/android/model/wire/WireLocation;)V
    .locals 12

    iget-object v0, p0, LWF3$j;->g:LWF3;

    invoke-static {v0}, LWF3;->access$getNavigator$p(LWF3;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->u2(Landroid/location/Location;)V

    iget-object p1, p0, LWF3$j;->g:LWF3;

    invoke-static {p1}, LWF3;->access$getAreaManager$p(LWF3;)Lbn;

    move-result-object p1

    invoke-interface {p1}, Lbn;->c0()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/ParkingNestData;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNestData;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LWF3$j;->g:LWF3;

    invoke-static {v0}, LWF3;->access$getAnalyticsManager$p(LWF3;)LEa;

    move-result-object v1

    new-instance v11, LfG3;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, LWF3;->access$getRideManager$p(LWF3;)LYR4;

    move-result-object v2

    invoke-interface {v2}, LYR4;->n0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0}, LWF3;->access$getReactiveLocationManager$p(LWF3;)Ldr4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object p1

    invoke-interface {v0, p1}, Ldr4;->n(Landroid/location/Location;)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, LfG3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_0
    return-void
.end method
