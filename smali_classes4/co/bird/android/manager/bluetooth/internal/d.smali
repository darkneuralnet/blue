.class public final Lco/bird/android/manager/bluetooth/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsm6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/bluetooth/internal/d$a;,
        Lco/bird/android/manager/bluetooth/internal/d$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010H\u001a\u00020F\u0012\u0006\u0010K\u001a\u00020I\u00a2\u0006\u0004\u0008j\u0010kJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001b\u0010\n\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ1\u0010\u0015\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J1\u0010\u0018\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000c2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u001e\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u001e\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u000cH\u0016J\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u001e\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u001dH\u0016J&\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u000c2\u0006\u00100\u001a\u00020\u000cH\u0016J\u0019\u00104\u001a\u0004\u0018\u00010\u00082\u0006\u00103\u001a\u000202H\u0000\u00a2\u0006\u0004\u00084\u00105J;\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u00107\u001a\u0002062\n\u0008\u0002\u00109\u001a\u0004\u0018\u0001082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010;\u001a\u00020:H\u0000\u00a2\u0006\u0004\u0008<\u0010=J/\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u00103\u001a\u0002022\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010;\u001a\u00020:H\u0000\u00a2\u0006\u0004\u0008>\u0010?J\u0008\u0010@\u001a\u00020\u0006H\u0016J\u0016\u0010B\u001a\u0008\u0012\u0004\u0012\u00020A0\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010C\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010MR\u001c\u0010R\u001a\n P*\u0004\u0018\u00010O0O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010TR\"\u0010X\u001a\u0010\u0012\u000c\u0012\n P*\u0004\u0018\u00010\u00020\u00020V8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010WR.\u0010[\u001a\u001c\u0012\u0004\u0012\u000202\u0012\u0012\u0012\u0010\u0012\u000c\u0012\n P*\u0004\u0018\u00010\u00020\u00020V0Y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010ZR.\u0010\\\u001a\u001c\u0012\u0004\u0012\u000202\u0012\u0012\u0012\u0010\u0012\u000c\u0012\n P*\u0004\u0018\u00010\u00020\u00020V0Y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010ZR\u0016\u0010^\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010]R$\u0010_\u001a\u0010\u0012\u000c\u0012\n P*\u0004\u0018\u00010\u00060\u00060V8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010WR\"\u0010b\u001a\u0010\u0012\u000c\u0012\n P*\u0004\u0018\u00010\u00060\u00060`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010fR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010h\u00a8\u0006l"
    }
    d2 = {
        "Lco/bird/android/manager/bluetooth/internal/d;",
        "Lsm6;",
        "Lco/bird/android/model/Vehicle;",
        "vehicle",
        "",
        "msg",
        "",
        "G0",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "characteristic",
        "r0",
        "(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;)V",
        "",
        "status",
        "s0",
        "(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;I)V",
        "t0",
        "Landroid/bluetooth/BluetoothGatt;",
        "gatt",
        "Lio/reactivex/H;",
        "emitter",
        "v0",
        "(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;ILio/reactivex/H;)V",
        "newState",
        "u0",
        "Lio/reactivex/Observable;",
        "p",
        "Lio/reactivex/F;",
        "i",
        "",
        "a",
        "s",
        "b",
        "o",
        "lightOn",
        "c",
        "q",
        "minutes",
        "n",
        "f",
        "r",
        "j",
        "Lco/bird/android/model/AlarmType;",
        "type",
        "h",
        "enabled",
        "m",
        "ecuType",
        "maxSpeed",
        "g",
        "Lco/bird/android/model/GattUuid;",
        "uuid",
        "d0",
        "(Lco/bird/android/model/GattUuid;)Landroid/bluetooth/BluetoothGattCharacteristic;",
        "Lco/bird/android/model/Command;",
        "command",
        "",
        "data",
        "",
        "retryCount",
        "J0",
        "(Lco/bird/android/model/Command;[BLco/bird/android/model/Vehicle;J)Lio/reactivex/F;",
        "y0",
        "(Lco/bird/android/model/GattUuid;Lco/bird/android/model/Vehicle;J)Lio/reactivex/F;",
        "release",
        "Lco/bird/android/model/Vehicle$ConnectionState;",
        "e",
        "d",
        "k",
        "l",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "LaY;",
        "LaY;",
        "scheduler",
        "Landroid/bluetooth/BluetoothManager;",
        "Landroid/bluetooth/BluetoothManager;",
        "manager",
        "Landroid/bluetooth/BluetoothAdapter;",
        "kotlin.jvm.PlatformType",
        "Landroid/bluetooth/BluetoothAdapter;",
        "adapter",
        "Landroid/bluetooth/BluetoothGattService;",
        "Landroid/bluetooth/BluetoothGattService;",
        "birdService",
        "Lio/reactivex/subjects/a;",
        "Lio/reactivex/subjects/a;",
        "vehicleSubject",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "gattSubjects",
        "notificationSubjects",
        "Z",
        "connecting",
        "disconnectingSubject",
        "Lio/reactivex/subjects/d;",
        "Lio/reactivex/subjects/d;",
        "disconnectedSubject",
        "",
        "Ljava/lang/Object;",
        "lock",
        "Landroid/bluetooth/BluetoothGatt;",
        "Ljava/util/concurrent/Semaphore;",
        "Ljava/util/concurrent/Semaphore;",
        "bluetoothLock",
        "<init>",
        "(Landroid/content/Context;LaY;)V",
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
        "SMAP\nVehicleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/VehicleManagerImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ThreadSafeUtility.kt\nco/bird/android/manager/bluetooth/internal/ThreadSafeUtilityKt\n*L\n1#1,550:1\n8676#2,2:551\n9358#2,4:553\n8676#2,2:557\n9358#2,4:559\n288#3,2:563\n288#3,2:565\n288#3,2:572\n35#4,5:567\n*S KotlinDebug\n*F\n+ 1 VehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/VehicleManagerImpl\n*L\n61#1:551,2\n61#1:553,4\n64#1:557,2\n64#1:559,4\n136#1:563,2\n431#1:565,2\n530#1:572,2\n507#1:567,5\n*E\n"
    }
.end annotation


# static fields
.field public static final o:Lco/bird/android/manager/bluetooth/internal/d$a;

.field public static final p:Ljava/util/UUID;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LaY;

.field public final c:Landroid/bluetooth/BluetoothManager;

.field public final d:Landroid/bluetooth/BluetoothAdapter;

.field public e:Landroid/bluetooth/BluetoothGattService;

.field public final f:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lco/bird/android/model/GattUuid;",
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/model/Vehicle;",
            ">;>;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lco/bird/android/model/GattUuid;",
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/model/Vehicle;",
            ">;>;"
        }
    .end annotation
.end field

.field public volatile i:Z

.field public j:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/lang/Object;

.field public m:Landroid/bluetooth/BluetoothGatt;

.field public final n:Ljava/util/concurrent/Semaphore;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/manager/bluetooth/internal/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/d;->o:Lco/bird/android/manager/bluetooth/internal/d$a;

    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/d;->p:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LaY;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d;->b:LaY;

    const-string p2, "bluetooth"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.bluetooth.BluetoothManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/bluetooth/BluetoothManager;

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->c:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string p2, "create<Vehicle>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->f:Lio/reactivex/subjects/a;

    sget-object p1, Lco/bird/android/model/GattUuid;->Companion:Lco/bird/android/model/GattUuid$Companion;

    invoke-virtual {p1}, Lco/bird/android/model/GattUuid$Companion;->getValues()[Lco/bird/android/model/GattUuid;

    move-result-object p1

    array-length p2, p1

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result p2

    const/16 v0, 0x10

    invoke-static {p2, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p2

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length p2, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, p2, :cond_0

    aget-object v4, p1, v3

    new-instance v5, Lkotlin/Pair;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v6

    invoke-direct {v5, v4, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, LHY;->d(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->g:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object p1, Lco/bird/android/model/GattUuid;->Companion:Lco/bird/android/model/GattUuid$Companion;

    invoke-virtual {p1}, Lco/bird/android/model/GattUuid$Companion;->getValues()[Lco/bird/android/model/GattUuid;

    move-result-object p1

    array-length p2, p1

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result p2

    invoke-static {p2, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length p2, p1

    :goto_1
    if-ge v2, p2, :cond_1

    aget-object v1, p1, v2

    new-instance v3, Lkotlin/Pair;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v0}, LHY;->d(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string p2, "create<Unit>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->j:Lio/reactivex/subjects/a;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->k:Lio/reactivex/subjects/d;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->l:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/Semaphore;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    return-void
.end method

.method public static synthetic A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->F0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final A0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->D0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final B0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic C(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lco/bird/android/model/GattUuid;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/d;->z0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lco/bird/android/model/GattUuid;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final C0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->l0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final D0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic E(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lco/bird/android/model/Command;[B)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lco/bird/android/manager/bluetooth/internal/d;->K0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lco/bird/android/model/Command;[B)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final E0()Lco/bird/android/model/Command;
    .locals 1

    sget-object v0, Lco/bird/android/model/Command;->SOFT_RESET:Lco/bird/android/model/Command;

    return-object v0
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final F0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lco/bird/android/manager/bluetooth/internal/d;->w0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final H0(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;Z)Lco/bird/android/model/Command;
    .locals 1

    const-string v0, "$vehicle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Vehicle;->getAuthenticated()Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, p1, Lco/bird/android/manager/bluetooth/internal/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object p1, Lco/bird/android/model/GattUuid;->LOCK:Lco/bird/android/model/GattUuid;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    sget-object p0, Lco/bird/android/model/Command;->UNLOCK_LIGHT_ON:Lco/bird/android/model/Command;

    goto :goto_0

    :cond_0
    sget-object p0, Lco/bird/android/model/Command;->UNLOCK_LIGHT_OFF:Lco/bird/android/model/Command;

    :goto_0
    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->A0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final I0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->C0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->B0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final K0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lco/bird/android/model/Command;[B)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$command"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "write: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    const/16 p1, 0x64

    invoke-static {p1}, LHY;->b(I)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->l:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-object v0, Lco/bird/android/model/GattUuid;->COMMAND:Lco/bird/android/model/GattUuid;

    invoke-virtual {p0, v0}, Lco/bird/android/manager/bluetooth/internal/d;->d0(Lco/bird/android/model/GattUuid;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->m:Landroid/bluetooth/BluetoothGatt;

    if-eqz p0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0, v0, p2, p3}, Lco/bird/android/manager/bluetooth/internal/b;->c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Lco/bird/android/model/Command;[B)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit p1

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit p1

    throw p0
.end method

.method public static synthetic L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->L0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final L0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic M()Lco/bird/android/model/Command;
    .locals 1

    invoke-static {}, Lco/bird/android/manager/bluetooth/internal/d;->E0()Lco/bird/android/model/Command;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->I0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;Z)Lco/bird/android/model/Command;
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/d;->H0(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;Z)Lco/bird/android/model/Command;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lco/bird/android/model/AlarmType;)Lco/bird/android/model/Command;
    .locals 0

    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/d;->Y(Lco/bird/android/model/AlarmType;)Lco/bird/android/model/Command;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(Lco/bird/android/model/Vehicle;Z)Lco/bird/android/model/Command;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->n0(Lco/bird/android/model/Vehicle;Z)Lco/bird/android/model/Command;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lco/bird/android/model/Vehicle;I)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->j0(Lco/bird/android/model/Vehicle;I)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final Y(Lco/bird/android/model/AlarmType;)Lco/bird/android/model/Command;
    .locals 1

    const-string v0, "$type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/manager/bluetooth/internal/d$b;->$EnumSwitchMapping$1:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lco/bird/android/model/Command;->ALARM_LONG:Lco/bird/android/model/Command;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lco/bird/android/model/Command;->ALARM_SHORT:Lco/bird/android/model/Command;

    goto :goto_0

    :cond_2
    sget-object p0, Lco/bird/android/model/Command;->ALARM_CHIRP:Lco/bird/android/model/Command;

    :goto_0
    return-object p0
.end method

.method public static final Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final a0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)[B
    .locals 6

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->j:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Lco/bird/android/model/GattUuid;->AUTH:Lco/bird/android/model/GattUuid;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getToken()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-static {p0, p1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v1, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0
.end method

.method public static final synthetic access$getAdapter$p(Lco/bird/android/manager/bluetooth/internal/d;)Landroid/bluetooth/BluetoothAdapter;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->d:Landroid/bluetooth/BluetoothAdapter;

    return-object p0
.end method

.method public static final synthetic access$getContext$p(Lco/bird/android/manager/bluetooth/internal/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getDisconnectingSubject$p(Lco/bird/android/manager/bluetooth/internal/d;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->j:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getGatt$p(Lco/bird/android/manager/bluetooth/internal/d;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->m:Landroid/bluetooth/BluetoothGatt;

    return-object p0
.end method

.method public static final synthetic access$getGattSubjects$p(Lco/bird/android/manager/bluetooth/internal/d;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->g:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method public static final synthetic access$getLock$p(Lco/bird/android/manager/bluetooth/internal/d;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->l:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic access$getNOTIFY_UUID$cp()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lco/bird/android/manager/bluetooth/internal/d;->p:Ljava/util/UUID;

    return-object v0
.end method

.method public static final synthetic access$getNotificationSubjects$p(Lco/bird/android/manager/bluetooth/internal/d;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method public static final synthetic access$getScheduler$p(Lco/bird/android/manager/bluetooth/internal/d;)LaY;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->b:LaY;

    return-object p0
.end method

.method public static final synthetic access$setConnecting$p(Lco/bird/android/manager/bluetooth/internal/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->i:Z

    return-void
.end method

.method public static final synthetic access$setGatt$p(Lco/bird/android/manager/bluetooth/internal/d;Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->m:Landroid/bluetooth/BluetoothGatt;

    return-void
.end method

.method public static final synthetic access$trace(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    return-void
.end method

.method public static final b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/Vehicle;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/Vehicle;

    return-object p0
.end method

.method public static final e0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->i:Z

    const-string v0, "disconnect"

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->j:Lio/reactivex/subjects/a;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-object p1
.end method

.method public static final f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final h0(Z)Lco/bird/android/model/Command;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, Lco/bird/android/model/Command;->DEEP_SLEEP_ON:Lco/bird/android/model/Command;

    goto :goto_0

    :cond_0
    sget-object p0, Lco/bird/android/model/Command;->DEEP_SLEEP_OFF:Lco/bird/android/model/Command;

    :goto_0
    return-object p0
.end method

.method public static final i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final j0(Lco/bird/android/model/Vehicle;I)Lkotlin/Pair;
    .locals 2

    const-string v0, "$vehicle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Vehicle;->getAuthenticated()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x4

    new-array p0, p0, [B

    shr-int/lit8 v0, p1, 0x18

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, p0, v1

    shr-int/lit8 v0, p1, 0x10

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, p0, v1

    shr-int/lit8 v0, p1, 0x8

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, p0, v1

    const/4 v0, 0x3

    int-to-byte p1, p1

    aput-byte p1, p0, v0

    sget-object p1, Lco/bird/android/model/Command;->FLASH_LIGHTS:Lco/bird/android/model/Command;

    invoke-static {p1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final l0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final n0(Lco/bird/android/model/Vehicle;Z)Lco/bird/android/model/Command;
    .locals 1

    const-string v0, "$vehicle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Vehicle;->getAuthenticated()Z

    move-result p0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    sget-object p0, Lco/bird/android/model/Command;->LIGHT_ON:Lco/bird/android/model/Command;

    goto :goto_0

    :cond_0
    sget-object p0, Lco/bird/android/model/Command;->LIGHT_OFF:Lco/bird/android/model/Command;

    :goto_0
    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final p0(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$vehicle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Vehicle;->getAuthenticated()Z

    move-result p0

    if-eqz p0, :cond_0

    iget-object p0, p1, Lco/bird/android/manager/bluetooth/internal/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object p1, Lco/bird/android/model/GattUuid;->LOCK:Lco/bird/android/model/GattUuid;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic read$bluetooth_release$default(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/GattUuid;Lco/bird/android/model/Vehicle;JILjava/lang/Object;)Lio/reactivex/F;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const-wide/16 p3, 0x3

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/manager/bluetooth/internal/d;->y0(Lco/bird/android/model/GattUuid;Lco/bird/android/model/Vehicle;J)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/Vehicle;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/Vehicle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->e0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final w0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_onServicesDiscovered"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$gatt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$service"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDiscovered"

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->l:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    invoke-static {p2, p3}, Lco/bird/android/manager/bluetooth/internal/b;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static synthetic write$bluetooth_release$default(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Command;[BLco/bird/android/model/Vehicle;JILjava/lang/Object;)Lio/reactivex/F;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_1

    const-wide/16 p4, 0x3

    :cond_1
    move-wide v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lco/bird/android/manager/bluetooth/internal/d;->J0(Lco/bird/android/model/Command;[BLco/bird/android/model/Vehicle;J)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->p0(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic y(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)[B
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->a0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Z)Lco/bird/android/model/Command;
    .locals 0

    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/d;->h0(Z)Lco/bird/android/model/Command;

    move-result-object p0

    return-object p0
.end method

.method public static final z0(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lco/bird/android/model/GattUuid;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uuid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "read: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p1, 0x64

    invoke-static {p1}, LHY;->b(I)V

    invoke-virtual {p0, p2}, Lco/bird/android/manager/bluetooth/internal/d;->d0(Lco/bird/android/model/GattUuid;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d;->l:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/d;->m:Landroid/bluetooth/BluetoothGatt;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/bluetooth/BluetoothGatt;->readCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    move v0, p1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit p2

    throw p0
.end method


# virtual methods
.method public final G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", on thread="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final J0(Lco/bird/android/model/Command;[BLco/bird/android/model/Vehicle;J)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Command;",
            "[B",
            "Lco/bird/android/model/Vehicle;",
            "J)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehicle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LBm6;

    invoke-direct {v0, p0, p3, p1, p2}, LBm6;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lco/bird/android/model/Command;[B)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p2

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->b:LaY;

    invoke-interface {v0}, LaY;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p2

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->b:LaY;

    invoke-interface {v0}, LaY;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$v;

    invoke-direct {v0, p1, p3, p0}, Lco/bird/android/manager/bluetooth/internal/d$v;-><init>(Lco/bird/android/model/Command;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;)V

    new-instance p1, LCm6;

    invoke-direct {p1, v0}, LCm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "internal fun write(comma\u2026   .retry(retryCount)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public a(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDm6;

    invoke-direct {v0, p0, p1}, LDm6;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$g;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$g;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance v2, LFm6;

    invoke-direct {v2, v1}, LFm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$h;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$h;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LGm6;

    invoke-direct {p1, v1}, LGm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun disconnect(\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public b(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/model/GattUuid;->DISTANCE:Lco/bird/android/model/GattUuid;

    const-wide/16 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-static/range {v1 .. v7}, Lco/bird/android/manager/bluetooth/internal/d;->read$bluetooth_release$default(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/GattUuid;Lco/bird/android/model/Vehicle;JILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public c(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "Z)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LUm6;

    invoke-direct {v0, p1, p0, p2}, LUm6;-><init>(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;Z)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$u;

    invoke-direct {v0, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$u;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LVm6;

    invoke-direct {p1, v0}, LVm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun unlock(vehi\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, p2}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public d(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle$ConnectionState;
    .locals 4

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->j:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lco/bird/android/model/Vehicle$ConnectionState;->CLOSED:Lco/bird/android/model/Vehicle$ConnectionState;

    return-object p1

    :cond_0
    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->c:Landroid/bluetooth/BluetoothManager;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothManager;->getConnectedDevices(I)Ljava/util/List;

    move-result-object v0

    const-string v1, "manager\n      .getConnec\u2026es(BluetoothProfile.GATT)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    sget-object p1, Lco/bird/android/model/Vehicle$ConnectionState;->CONNECTED:Lco/bird/android/model/Vehicle$ConnectionState;

    goto :goto_2

    :cond_4
    sget-object p1, Lco/bird/android/model/Vehicle$ConnectionState;->DISCONNECTED:Lco/bird/android/model/Vehicle$ConnectionState;

    :goto_2
    return-object p1
.end method

.method public final d0(Lco/bird/android/model/GattUuid;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 5

    const-string v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->e:Landroid/bluetooth/BluetoothGattService;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattService;->getCharacteristics()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/model/GattUuid;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v1, v2

    :cond_1
    check-cast v1, Landroid/bluetooth/BluetoothGattCharacteristic;

    :cond_2
    return-object v1
.end method

.method public e(Lco/bird/android/model/Vehicle;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/Vehicle$ConnectionState;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->d(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle$ConnectionState;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "just(getConnectionState(vehicle))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWm6;

    invoke-direct {v0}, LWm6;-><init>()V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$t;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$t;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LXm6;

    invoke-direct {p1, v1}, LXm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun softReset(v\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public g(Lco/bird/android/model/Vehicle;II)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "II)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string p2, "vehicle"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x2

    new-array v2, p2, [B

    const/4 p2, 0x0

    int-to-byte v0, p3

    aput-byte v0, v2, p2

    shr-int/lit8 p2, p3, 0x8

    int-to-byte p2, p2

    const/4 p3, 0x1

    aput-byte p2, v2, p3

    sget-object v1, Lco/bird/android/model/Command;->MAX_SPEED:Lco/bird/android/model/Command;

    const-wide/16 v4, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    invoke-static/range {v0 .. v7}, Lco/bird/android/manager/bluetooth/internal/d;->write$bluetooth_release$default(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Command;[BLco/bird/android/model/Vehicle;JILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, p2}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public h(Lco/bird/android/model/Vehicle;Lco/bird/android/model/AlarmType;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "Lco/bird/android/model/AlarmType;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMm6;

    invoke-direct {v0, p2}, LMm6;-><init>(Lco/bird/android/model/AlarmType;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$c;

    invoke-direct {v0, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$c;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LNm6;

    invoke-direct {p1, v0}, LNm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun alarm(vehic\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, p2}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public i(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$f;

    invoke-direct {v0, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$f;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    invoke-static {v0}, Lnh5;->k(Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public j(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJm6;

    invoke-direct {v0, p0, p1}, LJm6;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$d;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$d;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance v2, LKm6;

    invoke-direct {v2, v1}, LKm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$e;

    invoke-direct {v1, p1}, Lco/bird/android/manager/bluetooth/internal/d$e;-><init>(Lco/bird/android/model/Vehicle;)V

    new-instance p1, LLm6;

    invoke-direct {p1, v1}, LLm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun authenticat\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public k(Lco/bird/android/model/Vehicle;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->j:Lio/reactivex/subjects/a;

    invoke-virtual {p1}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "disconnectingSubject.hide()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public l(Lco/bird/android/model/Vehicle;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->k:Lio/reactivex/subjects/d;

    invoke-virtual {p1}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "disconnectedSubject.hide()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public m(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "Z)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPm6;

    invoke-direct {v0, p2}, LPm6;-><init>(Z)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$i;

    invoke-direct {v0, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$i;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LRm6;

    invoke-direct {p1, v0}, LRm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun enableDeepS\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, p2}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public n(Lco/bird/android/model/Vehicle;I)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "I)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LOm6;

    invoke-direct {v0, p1, p2}, LOm6;-><init>(Lco/bird/android/model/Vehicle;I)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$j;

    invoke-direct {v0, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$j;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LQm6;

    invoke-direct {p1, v0}, LQm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun flashLights\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, p2}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public o(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltm6;

    invoke-direct {v0, p1, p0}, Ltm6;-><init>(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$n;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$n;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LEm6;

    invoke-direct {p1, v1}, LEm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun lock(vehicl\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public p(Lco/bird/android/model/Vehicle;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->f:Lio/reactivex/subjects/a;

    invoke-virtual {p1}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "vehicleSubject.hide()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public q(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "Z)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LHm6;

    invoke-direct {v0, p1, p2}, LHm6;-><init>(Lco/bird/android/model/Vehicle;Z)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$m;

    invoke-direct {v0, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$m;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LIm6;

    invoke-direct {p1, v0}, LIm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun lights(vehi\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, p2}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public r(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/model/GattUuid;->IMEI:Lco/bird/android/model/GattUuid;

    const-wide/16 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-static/range {v1 .. v7}, Lco/bird/android/manager/bluetooth/internal/d;->read$bluetooth_release$default(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/GattUuid;Lco/bird/android/model/Vehicle;JILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$q;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$q;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance v2, Lwm6;

    invoke-direct {v2, v1}, Lwm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$r;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$r;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance v2, Lxm6;

    invoke-direct {v2, v1}, Lxm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$s;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$s;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, Lym6;

    invoke-direct {p1, v1}, Lym6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun readNetwork\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final r0(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "characteristic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LNn6;->b(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onChanged: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->f:Lio/reactivex/subjects/a;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    sget-object v0, Lco/bird/android/model/GattUuid;->Companion:Lco/bird/android/model/GattUuid$Companion;

    invoke-virtual {v0, p2}, Lco/bird/android/model/GattUuid$Companion;->from(Landroid/bluetooth/BluetoothGattCharacteristic;)Lco/bird/android/model/GattUuid;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onChanged, bluetooth characteristic changed gatt: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/subjects/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/subjects/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/reactivex/subjects/a;->onComplete()V

    :cond_1
    return-void
.end method

.method public release()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V

    :try_start_0
    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/d;->access$getDisconnectingSubject$p(Lco/bird/android/manager/bluetooth/internal/d;)Lio/reactivex/subjects/a;

    move-result-object v1

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v1, v2}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/d;->access$getLock$p(Lco/bird/android/manager/bluetooth/internal/d;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/d;->access$getGatt$p(Lco/bird/android/manager/bluetooth/internal/d;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    :cond_0
    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/d;->access$getGatt$p(Lco/bird/android/manager/bluetooth/internal/d;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_2
    invoke-static {v2}, Lg46;->e(Ljava/lang/Throwable;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :goto_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    return-void

    :goto_1
    :try_start_4
    monitor-exit v1

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    throw v1
.end method

.method public s(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/model/GattUuid;->DISTANCE:Lco/bird/android/model/GattUuid;

    const-wide/16 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-static/range {v1 .. v7}, Lco/bird/android/manager/bluetooth/internal/d;->read$bluetooth_release$default(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/GattUuid;Lco/bird/android/model/Vehicle;JILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$k;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$k;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance v2, Lzm6;

    invoke-direct {v2, v1}, Lzm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$l;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$l;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LAm6;

    invoke-direct {p1, v1}, LAm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun get(vehicle\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->n:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final s0(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "characteristic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/GattUuid;->Companion:Lco/bird/android/model/GattUuid$Companion;

    invoke-virtual {v0, p2}, Lco/bird/android/model/GattUuid$Companion;->from(Landroid/bluetooth/BluetoothGattCharacteristic;)Lco/bird/android/model/GattUuid;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/subjects/a;

    if-nez p3, :cond_2

    if-eqz v0, :cond_6

    invoke-static {p1, p2}, LNn6;->b(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/reactivex/subjects/a;->onComplete()V

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "onRead: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    sget-object p1, Lco/bird/android/manager/bluetooth/internal/c;->c:Lco/bird/android/manager/bluetooth/internal/c$a;

    invoke-virtual {p1, p3}, Lco/bird/android/manager/bluetooth/internal/c$a;->a(I)Lco/bird/android/manager/bluetooth/internal/c;

    move-result-object v4

    if-nez v0, :cond_3

    const/4 p1, -0x1

    goto :goto_0

    :cond_3
    sget-object p1, Lco/bird/android/manager/bluetooth/internal/d$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    :goto_0
    const/4 p2, 0x1

    if-eq p1, p2, :cond_5

    const/4 p2, 0x2

    if-eq p1, p2, :cond_4

    new-instance p1, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v3, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->d:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    new-instance p1, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v3, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->b:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    new-instance p1, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v3, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->c:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    if-eqz v1, :cond_6

    invoke-virtual {v1, p1}, Lio/reactivex/subjects/a;->onError(Ljava/lang/Throwable;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final t0(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "characteristic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/Command;->Companion:Lco/bird/android/model/Command$Companion;

    invoke-virtual {v0, p2}, Lco/bird/android/model/Command$Companion;->from(Landroid/bluetooth/BluetoothGattCharacteristic;)Lco/bird/android/model/Command;

    move-result-object v0

    if-nez p3, :cond_0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p2

    sget-object p3, Lco/bird/android/model/GattUuid;->COMMAND:Lco/bird/android/model/GattUuid;

    invoke-virtual {p3}, Lco/bird/android/model/GattUuid;->getUuid()Ljava/util/UUID;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz v0, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "onWrite: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p2, Lco/bird/android/manager/bluetooth/internal/c;->c:Lco/bird/android/manager/bluetooth/internal/c$a;

    invoke-virtual {p2, p3}, Lco/bird/android/manager/bluetooth/internal/c$a;->a(I)Lco/bird/android/manager/bluetooth/internal/c;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onWrite failed: "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " for command: "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final u0(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;ILio/reactivex/H;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "Landroid/bluetooth/BluetoothGatt;",
            "I",
            "Lio/reactivex/H<",
            "Lco/bird/android/model/Vehicle;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gatt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    const/4 p4, 0x2

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    const-string p3, "onConnection: CONNECTED"

    invoke-virtual {p0, p1, p3}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iput-boolean v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->i:Z

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->l:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_1
    iget-object p3, p0, Lco/bird/android/manager/bluetooth/internal/d;->l:Ljava/lang/Object;

    monitor-enter p3

    :try_start_1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGatt;->close()V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p3

    const-string p2, "onConnection: DISCONNECTED"

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/d;->G0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-boolean p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->i:Z

    if-eqz p1, :cond_2

    iput-boolean v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->i:Z

    new-instance p1, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p4, p1}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d;->k:Lio/reactivex/subjects/d;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :goto_0
    return-void

    :catchall_1
    move-exception p1

    monitor-exit p3

    throw p1
.end method

.method public final v0(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;ILio/reactivex/H;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "Landroid/bluetooth/BluetoothGatt;",
            "I",
            "Lio/reactivex/H<",
            "Lco/bird/android/model/Vehicle;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gatt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_3

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/bluetooth/BluetoothGattService;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/GattUuid;->BIRD_SERVICE:Lco/bird/android/model/GattUuid;

    invoke-virtual {v2}, Lco/bird/android/model/GattUuid;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Landroid/bluetooth/BluetoothGattService;

    iput-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d;->e:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_4

    new-instance p3, Lum6;

    invoke-direct {p3, p0, p1, p2, v0}, Lum6;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V

    invoke-static {p3}, Lio/reactivex/Observable;->fromCallable(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p2

    iget-object p3, p0, Lco/bird/android/manager/bluetooth/internal/d;->b:LaY;

    invoke-interface {p3}, LaY;->a()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p2

    new-instance p3, Lco/bird/android/manager/bluetooth/internal/d$o;

    invoke-direct {p3, p4, p1}, Lco/bird/android/manager/bluetooth/internal/d$o;-><init>(Lio/reactivex/H;Lco/bird/android/model/Vehicle;)V

    new-instance p1, Lvm6;

    invoke-direct {p1, p3}, Lvm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    goto :goto_1

    :cond_3
    sget-object p1, Lco/bird/android/manager/bluetooth/internal/c;->c:Lco/bird/android/manager/bluetooth/internal/c$a;

    invoke-virtual {p1, p3}, Lco/bird/android/manager/bluetooth/internal/c$a;->a(I)Lco/bird/android/manager/bluetooth/internal/c;

    move-result-object v2

    new-instance p1, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v1, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->g:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p4, p1}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final y0(Lco/bird/android/model/GattUuid;Lco/bird/android/model/Vehicle;J)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/GattUuid;",
            "Lco/bird/android/model/Vehicle;",
            "J)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehicle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSm6;

    invoke-direct {v0, p0, p2, p1}, LSm6;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lco/bird/android/model/GattUuid;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d;->b:LaY;

    invoke-interface {v1}, LaY;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d;->b:LaY;

    invoke-interface {v1}, LaY;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$p;

    invoke-direct {v1, p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/d$p;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/GattUuid;Lco/bird/android/model/Vehicle;)V

    new-instance p1, LTm6;

    invoke-direct {p1, v1}, LTm6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "internal fun read(uuid: \u2026   .retry(retryCount)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
