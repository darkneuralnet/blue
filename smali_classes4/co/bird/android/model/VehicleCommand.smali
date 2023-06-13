.class public abstract Lco/bird/android/model/VehicleCommand;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\u001b\u0008\u0004\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u0082\u0001\n#$%&\'()*+,\u00a8\u0006-"
    }
    d2 = {
        "Lco/bird/android/model/VehicleCommand;",
        "Landroid/os/Parcelable;",
        "bluetooth",
        "",
        "cellular",
        "(ZZ)V",
        "getBluetooth",
        "()Z",
        "getCellular",
        "command",
        "",
        "getCommand",
        "()Ljava/lang/String;",
        "flightSheetCommand",
        "Lco/bird/android/model/constant/FlightSheetCommand;",
        "getFlightSheetCommand",
        "()Lco/bird/android/model/constant/FlightSheetCommand;",
        "icon",
        "",
        "getIcon",
        "()I",
        "method",
        "Lco/bird/android/model/CommandMethod;",
        "getMethod",
        "()Lco/bird/android/model/CommandMethod;",
        "setMethod",
        "(Lco/bird/android/model/CommandMethod;)V",
        "model",
        "Lco/bird/android/model/constant/BirdModel;",
        "getModel",
        "()Lco/bird/android/model/constant/BirdModel;",
        "title",
        "",
        "getTitle",
        "()Ljava/lang/CharSequence;",
        "Lco/bird/android/model/AlarmCommand;",
        "Lco/bird/android/model/LightsCommand;",
        "Lco/bird/android/model/LockCommand;",
        "Lco/bird/android/model/SleepCommand;",
        "Lco/bird/android/model/SoftResetCommand;",
        "Lco/bird/android/model/UnlockBatteryCommand;",
        "Lco/bird/android/model/UnlockCableCommand;",
        "Lco/bird/android/model/UnlockCommand;",
        "Lco/bird/android/model/UnlockHelmetCommand;",
        "Lco/bird/android/model/WakeCommand;",
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


# instance fields
.field private final bluetooth:Z

.field private final cellular:Z


# direct methods
.method private constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/VehicleCommand;->bluetooth:Z

    iput-boolean p2, p0, Lco/bird/android/model/VehicleCommand;->cellular:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/VehicleCommand;-><init>(ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/VehicleCommand;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method public getBluetooth()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/VehicleCommand;->bluetooth:Z

    return v0
.end method

.method public getCellular()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/VehicleCommand;->cellular:Z

    return v0
.end method

.method public abstract getCommand()Ljava/lang/String;
.end method

.method public abstract getFlightSheetCommand()Lco/bird/android/model/constant/FlightSheetCommand;
.end method

.method public abstract getIcon()I
.end method

.method public abstract getMethod()Lco/bird/android/model/CommandMethod;
.end method

.method public abstract getModel()Lco/bird/android/model/constant/BirdModel;
.end method

.method public abstract getTitle()Ljava/lang/CharSequence;
.end method

.method public abstract setMethod(Lco/bird/android/model/CommandMethod;)V
.end method
