.class public final Lco/bird/android/model/GattUuid$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/GattUuid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/GattUuid$Companion;",
        "",
        "()V",
        "values",
        "",
        "Lco/bird/android/model/GattUuid;",
        "getValues",
        "()[Lco/bird/android/model/GattUuid;",
        "[Lco/bird/android/model/GattUuid;",
        "from",
        "characteristic",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGattUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GattUuid.kt\nco/bird/android/model/GattUuid$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,100:1\n1282#2,2:101\n*S KotlinDebug\n*F\n+ 1 GattUuid.kt\nco/bird/android/model/GattUuid$Companion\n*L\n96#1:101,2\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/GattUuid$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Landroid/bluetooth/BluetoothGattCharacteristic;)Lco/bird/android/model/GattUuid;
    .locals 6

    const-string v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/GattUuid$Companion;->getValues()[Lco/bird/android/model/GattUuid;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lco/bird/android/model/GattUuid;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method

.method public final getValues()[Lco/bird/android/model/GattUuid;
    .locals 1

    invoke-static {}, Lco/bird/android/model/GattUuid;->access$getValues$cp()[Lco/bird/android/model/GattUuid;

    move-result-object v0

    return-object v0
.end method
