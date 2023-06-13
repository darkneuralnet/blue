.class final Lco/bird/android/model/BdBleScannedVehicle$connect$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/BdBleScannedVehicle;->connect()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lke5;",
        "Lco/bird/android/model/VehicleConnection;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lke5;",
        "it",
        "Lco/bird/android/model/VehicleConnection;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lke5;)Lco/bird/android/model/VehicleConnection;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/model/BdBleScannedVehicle;


# direct methods
.method public constructor <init>(Lco/bird/android/model/BdBleScannedVehicle;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/BdBleScannedVehicle$connect$1;->this$0:Lco/bird/android/model/BdBleScannedVehicle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lke5;)Lco/bird/android/model/VehicleConnection;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/BdVehicleConnection;

    iget-object v1, p0, Lco/bird/android/model/BdBleScannedVehicle$connect$1;->this$0:Lco/bird/android/model/BdBleScannedVehicle;

    invoke-static {v1}, Lco/bird/android/model/BdBleScannedVehicle;->access$getRxBleDevice$p(Lco/bird/android/model/BdBleScannedVehicle;)Lne5;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/model/BdBleScannedVehicle$connect$1;->this$0:Lco/bird/android/model/BdBleScannedVehicle;

    invoke-virtual {v2}, Lco/bird/android/model/BdBleScannedVehicle;->payloadEncryptor()Lco/bird/android/model/BlePayloadEncryptor;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lco/bird/android/model/BdVehicleConnection;-><init>(Lke5;Lne5;Lco/bird/android/model/BlePayloadEncryptor;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lke5;

    invoke-virtual {p0, p1}, Lco/bird/android/model/BdBleScannedVehicle$connect$1;->invoke(Lke5;)Lco/bird/android/model/VehicleConnection;

    move-result-object p1

    return-object p1
.end method
