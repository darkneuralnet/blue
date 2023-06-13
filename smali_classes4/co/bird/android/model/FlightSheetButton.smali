.class public abstract Lco/bird/android/model/FlightSheetButton;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/BottomSheetButton;
.implements Lco/bird/android/model/OperatorBottomSheetButton;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0013\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/model/FlightSheetButton;",
        "Lco/bird/android/model/BottomSheetButton;",
        "Lco/bird/android/model/OperatorBottomSheetButton;",
        "()V",
        "text",
        "",
        "getText",
        "()Ljava/lang/String;",
        "Lco/bird/android/model/AllReviewsButton;",
        "Lco/bird/android/model/BatterySwapButton;",
        "Lco/bird/android/model/CampaignButton;",
        "Lco/bird/android/model/CannotAccessButton;",
        "Lco/bird/android/model/CannotCaptureReports;",
        "Lco/bird/android/model/DiagnosticsButton;",
        "Lco/bird/android/model/DrawableFlightSheetButton;",
        "Lco/bird/android/model/InspectionButton;",
        "Lco/bird/android/model/LastRideInfoButton;",
        "Lco/bird/android/model/LocateBirdButton;",
        "Lco/bird/android/model/MarkDamaged;",
        "Lco/bird/android/model/MarkForInspectionButton;",
        "Lco/bird/android/model/MarkMissingButton;",
        "Lco/bird/android/model/OtherPossibleLocationsButton;",
        "Lco/bird/android/model/PastRepairsButton;",
        "Lco/bird/android/model/PrivatePropertyButton;",
        "Lco/bird/android/model/QuickCaptureButton;",
        "Lco/bird/android/model/SearchNearbyButton;",
        "Lco/bird/android/model/UnmarkDamaged;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/FlightSheetButton;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getText()Ljava/lang/String;
.end method
