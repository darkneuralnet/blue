.class final Lco/bird/android/model/BirdFlexVehicleConnection$deviceName$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/BirdFlexVehicleConnection;-><init>(Lke5;Lne5;Lco/bird/android/model/BlePayloadEncryptor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
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
.field final synthetic this$0:Lco/bird/android/model/BirdFlexVehicleConnection;


# direct methods
.method public constructor <init>(Lco/bird/android/model/BirdFlexVehicleConnection;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/BirdFlexVehicleConnection$deviceName$2;->this$0:Lco/bird/android/model/BirdFlexVehicleConnection;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/BirdFlexVehicleConnection$deviceName$2;->invoke()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexVehicleConnection$deviceName$2;->this$0:Lco/bird/android/model/BirdFlexVehicleConnection;

    invoke-virtual {v0}, Lco/bird/android/model/BirdFlexVehicleConnection;->getRxBleDevice()Lne5;

    move-result-object v0

    invoke-interface {v0}, Lne5;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
