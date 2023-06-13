.class public final Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u00083\u00104J\u001c\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0008\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u001a\u0010-\u001a\u0008\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010,R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010,R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u00101\u00a8\u00065"
    }
    d2 = {
        "Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "",
        "onReceive",
        "h",
        "i",
        "LhY;",
        "a",
        "LhY;",
        "e",
        "()LhY;",
        "setBluetoothTraceClient",
        "(LhY;)V",
        "bluetoothTraceClient",
        "Ldr4;",
        "b",
        "Ldr4;",
        "f",
        "()Ldr4;",
        "setLocationManager",
        "(Ldr4;)V",
        "locationManager",
        "Lgl;",
        "c",
        "Lgl;",
        "g",
        "()Lgl;",
        "setPreference",
        "(Lgl;)V",
        "preference",
        "LTq4;",
        "d",
        "LTq4;",
        "getReactiveConfig",
        "()LTq4;",
        "setReactiveConfig",
        "(LTq4;)V",
        "reactiveConfig",
        "",
        "Lco/bird/api/request/BleDeviceBody;",
        "Ljava/util/List;",
        "btDevices",
        "Lco/bird/api/request/BleScan;",
        "btDevicesWithTimestamp",
        "Lio/reactivex/disposables/c;",
        "Lio/reactivex/disposables/c;",
        "disposable",
        "<init>",
        "()V",
        "app_birdRelease"
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
        "SMAP\nBluetoothDiscoveryReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothDiscoveryReceiver.kt\nco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,97:1\n11335#2:98\n11670#2,3:99\n*S KotlinDebug\n*F\n+ 1 BluetoothDiscoveryReceiver.kt\nco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver\n*L\n63#1:98\n63#1:99,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:LhY;

.field public b:Ldr4;

.field public c:Lgl;

.field public d:LTq4;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/request/BleDeviceBody;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/request/BleScan;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lio/reactivex/disposables/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->f:Ljava/util/List;

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, p0}, LH22;->S2(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->f()Ldr4;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ldr4;->m(Z)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver$a;->g:Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver$a;

    new-instance v2, LdX;

    invoke-direct {v2, v1}, LdX;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver$b;->g:Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver$b;

    new-instance v3, LeX;

    invoke-direct {v3, v1}, LeX;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object v0

    const-string v1, "locationManager.frequent\u2026    Timber.e(it)\n      })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->g:Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()LhY;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->a:LhY;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "bluetoothTraceClient"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Ldr4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->b:Ldr4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "locationManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Lgl;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->c:Lgl;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "preference"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h(Landroid/content/Intent;)V
    .locals 13

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const/16 v2, -0x8000

    if-eqz p1, :cond_1

    const-string v3, "android.bluetooth.device.extra.RSSI"

    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getShortExtra(Ljava/lang/String;S)S

    move-result v2

    :cond_1
    move v4, v2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p1

    move-object v5, p1

    goto :goto_1

    :cond_2
    move-object v5, v0

    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    move-object v9, p1

    goto :goto_2

    :cond_3
    move-object v9, v0

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getUuids()[Landroid/os/ParcelUuid;

    move-result-object p1

    goto :goto_3

    :cond_4
    move-object p1, v0

    :goto_3
    if-eqz p1, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_5

    aget-object v3, p1, v2

    invoke-virtual {v3}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    if-eqz v5, :cond_7

    if-nez v0, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    move-object v7, p1

    goto :goto_5

    :cond_6
    move-object v7, v0

    :goto_5
    invoke-virtual {p0}, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->g()Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->W()Lco/bird/android/model/wire/WireLocation;

    move-result-object v10

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v6

    new-instance p1, Lco/bird/api/request/BleScan;

    const-string v0, "now()"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/16 v11, 0x10

    const/4 v12, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lco/bird/api/request/BleScan;-><init>(ILjava/lang/String;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    return-void
.end method

.method public final i(Landroid/content/Context;)V
    .locals 4

    invoke-virtual {p0}, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->e()LhY;

    move-result-object v0

    new-instance v1, Lco/bird/api/request/BleScanReportBody;

    iget-object v2, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->f:Ljava/util/List;

    sget-object v3, Lco/bird/api/request/BLEScanTrigger;->REMOTE_NOTIFICATION:Lco/bird/api/request/BLEScanTrigger;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lco/bird/api/request/BleScanReportBody;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LhY;->a(Lco/bird/api/request/BleScanReportBody;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->subscribe()Lio/reactivex/disposables/c;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "android.bluetooth.device.action.FOUND"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->i(Landroid/content/Context;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p0, p2}, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->h(Landroid/content/Intent;)V

    :cond_2
    :goto_1
    iget-object p1, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->g:Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lio/reactivex/disposables/c;->dispose()V

    return-void
.end method
