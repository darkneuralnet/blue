.class final Lco/bird/android/model/BirdBikeVehicleConnection$writeData$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/BirdBikeVehicleConnection;->writeData([BLjava/util/UUID;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "[B",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "data",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "([B)Lio/reactivex/h;",
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
.field final synthetic $characteristicUuid:Ljava/util/UUID;

.field final synthetic this$0:Lco/bird/android/model/BirdBikeVehicleConnection;


# direct methods
.method public constructor <init>(Lco/bird/android/model/BirdBikeVehicleConnection;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/BirdBikeVehicleConnection$writeData$1;->this$0:Lco/bird/android/model/BirdBikeVehicleConnection;

    iput-object p2, p0, Lco/bird/android/model/BirdBikeVehicleConnection$writeData$1;->$characteristicUuid:Ljava/util/UUID;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke([B)Lio/reactivex/h;
    .locals 3

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/BirdBikeVehicleConnection$writeData$1;->this$0:Lco/bird/android/model/BirdBikeVehicleConnection;

    invoke-virtual {v0, p1}, Lco/bird/android/model/BirdBikeVehicleConnection;->toHex([B)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "received encrypted data from server to send via BLE "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/model/BirdBikeVehicleConnection$writeData$1;->this$0:Lco/bird/android/model/BirdBikeVehicleConnection;

    iget-object v1, p0, Lco/bird/android/model/BirdBikeVehicleConnection$writeData$1;->$characteristicUuid:Ljava/util/UUID;

    invoke-static {v0, p1, v1}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->writeData(Lco/bird/android/model/VehicleConnection;[BLjava/util/UUID;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lco/bird/android/model/BirdBikeVehicleConnection$writeData$1;->invoke([B)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
