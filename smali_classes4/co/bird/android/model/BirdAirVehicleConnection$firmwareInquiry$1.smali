.class final Lco/bird/android/model/BirdAirVehicleConnection$firmwareInquiry$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/BirdAirVehicleConnection;->firmwareInquiry()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "count",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Long;)Lio/reactivex/h;",
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
.field final synthetic this$0:Lco/bird/android/model/BirdAirVehicleConnection;


# direct methods
.method public constructor <init>(Lco/bird/android/model/BirdAirVehicleConnection;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/BirdAirVehicleConnection$firmwareInquiry$1;->this$0:Lco/bird/android/model/BirdAirVehicleConnection;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Long;)Lio/reactivex/h;
    .locals 4

    const-string v0, "count"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v2, v0

    if-nez p1, :cond_0

    sget-object p1, Lco/bird/android/model/Command;->BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

    invoke-virtual {p1}, Lco/bird/android/model/Command;->getData()[B

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/model/Command;->BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY:Lco/bird/android/model/Command;

    invoke-virtual {p1}, Lco/bird/android/model/Command;->getData()[B

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lco/bird/android/model/BirdAirVehicleConnection$firmwareInquiry$1;->this$0:Lco/bird/android/model/BirdAirVehicleConnection;

    sget-object v1, Lco/bird/android/model/GattUuid;->BIRD_AIR_COMMAND_UUID:Lco/bird/android/model/GattUuid;

    invoke-virtual {v1}, Lco/bird/android/model/GattUuid;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lco/bird/android/model/BirdAirVehicleConnection;->writeData([BLjava/util/UUID;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lco/bird/android/model/BirdAirVehicleConnection$firmwareInquiry$1;->invoke(Ljava/lang/Long;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
