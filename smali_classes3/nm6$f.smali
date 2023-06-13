.class public final Lnm6$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnm6;->n(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/FleetListVehicle;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/FleetListVehicle;",
        "vehicle",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/persistence/FleetListVehicle;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lnm6;


# direct methods
.method public constructor <init>(Lnm6;)V
    .locals 0

    iput-object p1, p0, Lnm6$f;->g:Lnm6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lnm6;Lco/bird/android/model/persistence/FleetListVehicle;)V
    .locals 0

    invoke-static {p0, p1}, Lnm6$f;->c(Lnm6;Lco/bird/android/model/persistence/FleetListVehicle;)V

    return-void
.end method

.method public static final c(Lnm6;Lco/bird/android/model/persistence/FleetListVehicle;)V
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lnm6;->access$getAnalyticsManager$p(Lnm6;)LEa;

    move-result-object p0

    new-instance v9, Lyo1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getVehicleId()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    const-string v6, ""

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lyo1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v9}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method


# virtual methods
.method public final b(Lco/bird/android/model/persistence/FleetListVehicle;)Lio/reactivex/h;
    .locals 5

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm6$f;->g:Lnm6;

    invoke-static {v0}, Lnm6;->access$getFlightSheetDelegate$p(Lnm6;)LAs1;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getVehicleId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, LAs1$a;->populateFlightSheet$default(LAs1;Ljava/lang/String;ZILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lnm6$f;->g:Lnm6;

    new-instance v2, Lom6;

    invoke-direct {v2, v1, p1}, Lom6;-><init>(Lnm6;Lco/bird/android/model/persistence/FleetListVehicle;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/FleetListVehicle;

    invoke-virtual {p0, p1}, Lnm6$f;->b(Lco/bird/android/model/persistence/FleetListVehicle;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
