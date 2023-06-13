.class public final Lv24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu24;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ)\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lv24;",
        "Lu24;",
        "Landroid/location/Location;",
        "location",
        "",
        "radius",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/VehiclePricingDetails;",
        "a",
        "(Landroid/location/Location;Ljava/lang/Double;)Lio/reactivex/F;",
        "Lt24;",
        "Lt24;",
        "pricingClient",
        "<init>",
        "(Lt24;)V",
        "pricing_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lt24;


# direct methods
.method public constructor <init>(Lt24;)V
    .locals 1

    const-string v0, "pricingClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv24;->a:Lt24;

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;Ljava/lang/Double;)Lio/reactivex/F;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "Ljava/lang/Double;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/VehiclePricingDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv24;->a:Lt24;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :cond_1
    invoke-interface {v0, v2, v1, p2}, Lt24;->a(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
