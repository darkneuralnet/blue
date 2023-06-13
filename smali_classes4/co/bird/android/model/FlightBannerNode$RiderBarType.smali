.class public final enum Lco/bird/android/model/FlightBannerNode$RiderBarType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/FlightBannerNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RiderBarType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/FlightBannerNode$RiderBarType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\'\u0008\u0002\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008j\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/model/FlightBannerNode$RiderBarType;",
        "",
        "iconRes",
        "",
        "titleText",
        "bodyText",
        "(Ljava/lang/String;ILjava/lang/Integer;II)V",
        "getBodyText",
        "()I",
        "getIconRes",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getTitleText",
        "IN_NO_RIDE_AREA",
        "BLUETOOTH_DISABLED",
        "END_RIDE_LOCK_PHOTO_REQUIRED",
        "LOCATION_SERVICES_DISABLED",
        "FLYER_PROMOTION",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/FlightBannerNode$RiderBarType;

.field public static final enum BLUETOOTH_DISABLED:Lco/bird/android/model/FlightBannerNode$RiderBarType;

.field public static final enum END_RIDE_LOCK_PHOTO_REQUIRED:Lco/bird/android/model/FlightBannerNode$RiderBarType;

.field public static final enum FLYER_PROMOTION:Lco/bird/android/model/FlightBannerNode$RiderBarType;

.field public static final enum IN_NO_RIDE_AREA:Lco/bird/android/model/FlightBannerNode$RiderBarType;

.field public static final enum LOCATION_SERVICES_DISABLED:Lco/bird/android/model/FlightBannerNode$RiderBarType;


# instance fields
.field private final bodyText:I

.field private final iconRes:Ljava/lang/Integer;

.field private final titleText:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/FlightBannerNode$RiderBarType;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lco/bird/android/model/FlightBannerNode$RiderBarType;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/FlightBannerNode$RiderBarType;->IN_NO_RIDE_AREA:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/FlightBannerNode$RiderBarType;->BLUETOOTH_DISABLED:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/FlightBannerNode$RiderBarType;->END_RIDE_LOCK_PHOTO_REQUIRED:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/FlightBannerNode$RiderBarType;->LOCATION_SERVICES_DISABLED:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/FlightBannerNode$RiderBarType;->FLYER_PROMOTION:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 13

    new-instance v6, Lco/bird/android/model/FlightBannerNode$RiderBarType;

    const-string v1, "IN_NO_RIDE_AREA"

    const/4 v2, 0x0

    sget v0, Lrg4;->ic_rider_bar_outside_service_area:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget v4, Lnl4;->rider_bar_inside_no_ride_area_title:I

    sget v5, Lnl4;->rider_bar_inside_no_ride_area_body:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/FlightBannerNode$RiderBarType;-><init>(Ljava/lang/String;ILjava/lang/Integer;II)V

    sput-object v6, Lco/bird/android/model/FlightBannerNode$RiderBarType;->IN_NO_RIDE_AREA:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;

    const-string v8, "BLUETOOTH_DISABLED"

    const/4 v9, 0x1

    sget v1, Lrg4;->ic_rider_bar_bluetooth_disabled:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    sget v11, Lnl4;->rider_bar_bluetooth_disabled_title:I

    sget v12, Lnl4;->rider_bar_bluetooth_disabled_body:I

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lco/bird/android/model/FlightBannerNode$RiderBarType;-><init>(Ljava/lang/String;ILjava/lang/Integer;II)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->BLUETOOTH_DISABLED:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;

    const-string v2, "END_RIDE_LOCK_PHOTO_REQUIRED"

    const/4 v3, 0x2

    sget v1, Lrg4;->ic_rider_bar_physical_lock_red:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lnl4;->rider_bar_ride_lock_photo_required_title:I

    sget v6, Lnl4;->rider_bar_ride_lock_photo_required_body:I

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/FlightBannerNode$RiderBarType;-><init>(Ljava/lang/String;ILjava/lang/Integer;II)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->END_RIDE_LOCK_PHOTO_REQUIRED:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;

    const-string v8, "LOCATION_SERVICES_DISABLED"

    const/4 v9, 0x3

    sget v1, Lrg4;->ic_rider_bar_location_services_off:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    sget v11, Lnl4;->rider_bar_location_services_disabled_title:I

    sget v12, Lnl4;->rider_bar_location_services_disabled_body:I

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lco/bird/android/model/FlightBannerNode$RiderBarType;-><init>(Ljava/lang/String;ILjava/lang/Integer;II)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->LOCATION_SERVICES_DISABLED:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;

    const-string v2, "FLYER_PROMOTION"

    const/4 v3, 0x4

    sget v1, Lrg4;->ic_filled_flyer_logo:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lnl4;->rider_bar_flyer_promotion_title:I

    sget v6, Lnl4;->rider_bar_flyer_promotion_body:I

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/FlightBannerNode$RiderBarType;-><init>(Ljava/lang/String;ILjava/lang/Integer;II)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->FLYER_PROMOTION:Lco/bird/android/model/FlightBannerNode$RiderBarType;

    invoke-static {}, Lco/bird/android/model/FlightBannerNode$RiderBarType;->$values()[Lco/bird/android/model/FlightBannerNode$RiderBarType;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->$VALUES:[Lco/bird/android/model/FlightBannerNode$RiderBarType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Integer;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->iconRes:Ljava/lang/Integer;

    iput p4, p0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->titleText:I

    iput p5, p0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->bodyText:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Integer;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x2

    if-eqz p3, :cond_1

    sget p4, Lol4;->empty:I

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x4

    if-eqz p3, :cond_2

    sget p5, Lol4;->empty:I

    :cond_2
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/FlightBannerNode$RiderBarType;-><init>(Ljava/lang/String;ILjava/lang/Integer;II)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/FlightBannerNode$RiderBarType;
    .locals 1

    const-class v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/FlightBannerNode$RiderBarType;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/FlightBannerNode$RiderBarType;
    .locals 1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->$VALUES:[Lco/bird/android/model/FlightBannerNode$RiderBarType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/FlightBannerNode$RiderBarType;

    return-object v0
.end method


# virtual methods
.method public final getBodyText()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->bodyText:I

    return v0
.end method

.method public final getIconRes()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->iconRes:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTitleText()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/FlightBannerNode$RiderBarType;->titleText:I

    return v0
.end method
