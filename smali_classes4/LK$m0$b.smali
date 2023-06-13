.class public final LLK$m0$b;
.super Ljj5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK$m0;->b(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0016\u0010\u000c\u001a\u00020\u00042\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "LK$m0$b",
        "Ljj5;",
        "",
        "errorCode",
        "",
        "b",
        "callbackType",
        "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
        "result",
        "c",
        "",
        "results",
        "a",
        "d",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scan$1$scanCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,969:1\n1855#2,2:970\n*S KotlinDebug\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scan$1$scanCallback$1\n*L\n570#1:970,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LLK;

.field public final synthetic b:Lio/reactivex/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/y<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(LLK;Lio/reactivex/y;Lco/bird/android/model/wire/WireBird;ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLK;",
            "Lio/reactivex/y<",
            "Lco/bird/android/model/Vehicle;",
            ">;",
            "Lco/bird/android/model/wire/WireBird;",
            "Z",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LLK$m0$b;->a:LLK;

    iput-object p2, p0, LLK$m0$b;->b:Lio/reactivex/y;

    iput-object p3, p0, LLK$m0$b;->c:Lco/bird/android/model/wire/WireBird;

    iput-boolean p4, p0, LLK$m0$b;->d:Z

    iput-object p5, p0, LLK$m0$b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljj5;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
            ">;)V"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Ljj5;->a(Ljava/util/List;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    invoke-virtual {p0, v0}, LLK$m0$b;->d(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 4

    invoke-super {p0, p1}, Ljj5;->b(I)V

    iget-object p1, p0, LLK$m0$b;->a:LLK;

    invoke-virtual {p1, p0}, LLK;->H2(Ljj5;)V

    iget-object p1, p0, LLK$m0$b;->b:Lio/reactivex/y;

    iget-object v0, p0, LLK$m0$b;->a:LLK;

    iget-object v1, p0, LLK$m0$b;->c:Lco/bird/android/model/wire/WireBird;

    iget-boolean v2, p0, LLK$m0$b;->d:Z

    sget-object v3, Lco/bird/android/model/exception/BluetoothException$Reason;->SCAN:Lco/bird/android/model/exception/BluetoothException$Reason;

    invoke-static {p1, v0, v1, v2, v3}, LLK;->access$scan$onErrorOrComplete(Lio/reactivex/y;LLK;Lco/bird/android/model/wire/WireBird;ZLco/bird/android/model/exception/BluetoothException$Reason;)V

    return-void
.end method

.method public c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Ljj5;->c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    invoke-virtual {p0, p2}, LLK$m0$b;->d(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    return-void
.end method

.method public final d(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)V
    .locals 24

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, LUk5;->Z(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Lco/bird/android/model/VehicleDescriptor;

    move-result-object v1

    iget-object v2, v0, LLK$m0$b;->a:LLK;

    invoke-virtual/range {p1 .. p1}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p1 .. p1}, LUk5;->d(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, LLK$m0$b;->c:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getImei()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, LLK$m0$b;->c:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "handleScanResult via BleCompat: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " descriptor: "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " bird imei "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " | serial number "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LLK;->J2(Ljava/lang/String;)V

    iget-object v2, v0, LLK$m0$b;->c:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1, v2}, Lco/bird/android/model/VehicleDescriptor;->matchesBird(Lco/bird/android/model/wire/WireBird;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v0, LLK$m0$b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v0, LLK$m0$b;->a:LLK;

    iget-object v3, v0, LLK$m0$b;->c:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "scan: found bird service: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LLK;->J2(Ljava/lang/String;)V

    new-instance v2, Lco/bird/android/model/Vehicle;

    move-object v4, v2

    invoke-virtual/range {p1 .. p1}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    move-object v5, v3

    const-string v6, "result.device"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, LLK$m0$b;->c:Lco/bird/android/model/wire/WireBird;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual {v1}, Lco/bird/android/model/VehicleDescriptor;->getImei()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lco/bird/android/model/VehicleDescriptor;->getSerialNumber()Ljava/lang/String;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0x1cffc

    const/16 v23, 0x0

    invoke-direct/range {v4 .. v23}, Lco/bird/android/model/Vehicle;-><init>(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->c()LBk5;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, LBk5;->b()[B

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v2, v3}, LTK;->a(Lco/bird/android/model/Vehicle;[B)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, LLK;->access$getScannedVehicles$cp()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, LLK$m0$b;->a:LLK;

    invoke-virtual {v2}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "scan: found a valid vehicle: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LLK;->J2(Ljava/lang/String;)V

    iget-object v1, v0, LLK$m0$b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, v0, LLK$m0$b;->a:LLK;

    invoke-virtual {v1, v0}, LLK;->H2(Ljj5;)V

    iget-object v1, v0, LLK$m0$b;->a:LLK;

    invoke-virtual {v1, v2}, LLK;->K2(Lco/bird/android/model/Vehicle;)V

    iget-object v1, v0, LLK$m0$b;->b:Lio/reactivex/y;

    invoke-interface {v1, v2}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    iget-object v1, v0, LLK$m0$b;->b:Lio/reactivex/y;

    invoke-interface {v1}, Lio/reactivex/j;->onComplete()V

    goto :goto_1

    :cond_1
    iget-object v1, v0, LLK$m0$b;->a:LLK;

    invoke-virtual {v2}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "scan: found a junk vehicle: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LLK;->J2(Ljava/lang/String;)V

    iget-object v1, v0, LLK$m0$b;->b:Lio/reactivex/y;

    iget-object v2, v0, LLK$m0$b;->a:LLK;

    iget-object v3, v0, LLK$m0$b;->c:Lco/bird/android/model/wire/WireBird;

    iget-boolean v4, v0, LLK$m0$b;->d:Z

    sget-object v5, Lco/bird/android/model/exception/BluetoothException$Reason;->SCAN:Lco/bird/android/model/exception/BluetoothException$Reason;

    invoke-static {v1, v2, v3, v4, v5}, LLK;->access$scan$onErrorOrComplete(Lio/reactivex/y;LLK;Lco/bird/android/model/wire/WireBird;ZLco/bird/android/model/exception/BluetoothException$Reason;)V

    goto :goto_1

    :cond_2
    iget-object v1, v0, LLK$m0$b;->a:LLK;

    invoke-virtual {v1, v0}, LLK;->H2(Ljj5;)V

    :cond_3
    :goto_1
    return-void
.end method
