.class public abstract Lco/bird/android/model/RideStatusBottomSheetButton;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/BottomSheetButton;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0006R\u0012\u0010\u0008\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0007\u000c\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/model/RideStatusBottomSheetButton;",
        "Lco/bird/android/model/BottomSheetButton;",
        "()V",
        "inProgress",
        "",
        "getInProgress",
        "()Z",
        "isEnabled",
        "text",
        "",
        "getText",
        "()Ljava/lang/String;",
        "Lco/bird/android/model/EndSelectedRideButton;",
        "Lco/bird/android/model/RideStatusEndButton;",
        "Lco/bird/android/model/RideStatusLockButton;",
        "Lco/bird/android/model/RideStatusManageRidesButton;",
        "Lco/bird/android/model/RideStatusScanAfterReserveButton;",
        "Lco/bird/android/model/RideStatusUnlockButton;",
        "Lco/bird/android/model/SelectedRideButton;",
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

    invoke-direct {p0}, Lco/bird/android/model/RideStatusBottomSheetButton;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getInProgress()Z
.end method

.method public abstract getText()Ljava/lang/String;
.end method

.method public abstract isEnabled()Z
.end method
