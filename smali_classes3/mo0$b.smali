.class public final Lmo0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmo0;->t(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/VehicleScrapRequest;)Lio/reactivex/F;
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
.field public final synthetic g:Lco/bird/android/model/wire/WireBird;

.field public final synthetic h:Lco/bird/android/model/VehicleScrapRequest;

.field public final synthetic i:Lmo0;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/VehicleScrapRequest;Lmo0;)V
    .locals 0

    iput-object p1, p0, Lmo0$b;->g:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, Lmo0$b;->h:Lco/bird/android/model/VehicleScrapRequest;

    iput-object p3, p0, Lmo0$b;->i:Lmo0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lmo0$b;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 11

    iget-object p1, p0, Lmo0$b;->g:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lmo0$b;->g:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lmo0$b;->h:Lco/bird/android/model/VehicleScrapRequest;

    invoke-virtual {p1}, Lco/bird/android/model/VehicleScrapRequest;->getId()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lmo0$b;->h:Lco/bird/android/model/VehicleScrapRequest;

    invoke-virtual {p1}, Lco/bird/android/model/VehicleScrapRequest;->getRequestReason()Lco/bird/android/model/constant/ScrapRequestReason;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v7, p1

    iget-object p1, p0, Lmo0$b;->h:Lco/bird/android/model/VehicleScrapRequest;

    invoke-virtual {p1}, Lco/bird/android/model/VehicleScrapRequest;->getScrapReason()Ljava/lang/String;

    move-result-object v8

    new-instance p1, Lon5;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v9, 0xd

    const/4 v10, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v10}, Lon5;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, p0, Lmo0$b;->i:Lmo0;

    invoke-static {v0}, Lmo0;->access$getAnalyticsManager$p(Lmo0;)LEa;

    move-result-object v0

    invoke-interface {v0, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method
