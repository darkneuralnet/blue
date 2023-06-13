.class public final Lco/bird/android/manager/bluetooth/internal/a;
.super LYo2;
.source "SourceFile"

# interfaces
.implements Lsm6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/bluetooth/internal/a$b;,
        Lco/bird/android/manager/bluetooth/internal/a$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYo2<",
        "LCk6;",
        ">;",
        "Lsm6;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00af\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001T\u0018\u0000 \\2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002&)B\u0017\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010?\u001a\u00020=\u00a2\u0006\u0004\u0008Z\u0010[J.\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0002J4\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0008\u0010 \u001a\u00020\u001fH\u0014J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0010H\u0016J%\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008*\u0010+J\u0016\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016J\u001e\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0010H\u0016J\u001e\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0013H\u0016J\u001e\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J&\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0016\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u00107\u001a\u00020\u001dH\u0016J\u0016\u00109\u001a\u0008\u0012\u0004\u0012\u0002080!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010:\u001a\u0002082\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u001d0!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u001d0!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u0010AR\"\u0010F\u001a\u0010\u0012\u000c\u0012\n D*\u0004\u0018\u00010\u00040\u00040C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010ER$\u0010G\u001a\u0010\u0012\u000c\u0012\n D*\u0004\u0018\u00010\u001d0\u001d0C8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010ER\"\u0010J\u001a\u0010\u0012\u000c\u0012\n D*\u0004\u0018\u00010\u001d0\u001d0H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010IR\"\u0010M\u001a\u0010\u0012\u000c\u0012\n D*\u0004\u0018\u00010\u00070\u00070K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010LR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u0010OR\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010V\u00a8\u0006]"
    }
    d2 = {
        "Lco/bird/android/manager/bluetooth/internal/a;",
        "LYo2;",
        "LCk6;",
        "Lsm6;",
        "Lco/bird/android/model/Vehicle;",
        "vehicle",
        "Lkotlin/Function1;",
        "",
        "command",
        "Lco/bird/android/manager/bluetooth/internal/a$c;",
        "loggingInfo",
        "Lio/reactivex/c;",
        "c0",
        "Lio/reactivex/F;",
        "d0",
        "token",
        "",
        "locking",
        "X",
        "",
        "ecuType",
        "maxSpeed",
        "a0",
        "enabled",
        "W",
        "response",
        "b0",
        "(Ljava/lang/String;)Ljava/lang/Boolean;",
        "msg",
        "",
        "e0",
        "LxU$b;",
        "C",
        "Lio/reactivex/Observable;",
        "p",
        "i",
        "a",
        "s",
        "b",
        "o",
        "lightOn",
        "c",
        "Y",
        "(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;",
        "j",
        "Lco/bird/android/model/AlarmType;",
        "type",
        "h",
        "q",
        "minutes",
        "n",
        "m",
        "g",
        "f",
        "r",
        "release",
        "Lco/bird/android/model/Vehicle$ConnectionState;",
        "e",
        "d",
        "k",
        "l",
        "LaY;",
        "LaY;",
        "scheduler",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "commandCharacteristic",
        "Lio/reactivex/subjects/a;",
        "kotlin.jvm.PlatformType",
        "Lio/reactivex/subjects/a;",
        "vehicleSubject",
        "disconnectingSubject",
        "Lio/reactivex/subjects/d;",
        "Lio/reactivex/subjects/d;",
        "disconnectedSubject",
        "Lma4;",
        "Lma4;",
        "notificationRelay",
        "",
        "Ljava/lang/Object;",
        "lock",
        "Ljava/util/concurrent/Semaphore;",
        "Ljava/util/concurrent/Semaphore;",
        "bluetoothLock",
        "co/bird/android/manager/bluetooth/internal/a$d",
        "t",
        "Lco/bird/android/manager/bluetooth/internal/a$d;",
        "gattCallback",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;LaY;)V",
        "u",
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
        "SMAP\nBDVehicleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BDVehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/BDVehicleManagerImpl\n+ 2 Singles.kt\nio/reactivex/rxkotlin/SinglesKt\n+ 3 ThreadSafeUtility.kt\nco/bird/android/manager/bluetooth/internal/ThreadSafeUtilityKt\n*L\n1#1,450:1\n119#2:451\n35#3,5:452\n*S KotlinDebug\n*F\n+ 1 BDVehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/BDVehicleManagerImpl\n*L\n257#1:451\n347#1:452,5\n*E\n"
    }
.end annotation


# static fields
.field public static final u:Lco/bird/android/manager/bluetooth/internal/a$b;


# instance fields
.field public final l:LaY;

.field public m:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final n:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Ljava/lang/Object;

.field public final s:Ljava/util/concurrent/Semaphore;

.field public final t:Lco/bird/android/manager/bluetooth/internal/a$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/manager/bluetooth/internal/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/a;->u:Lco/bird/android/manager/bluetooth/internal/a$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LaY;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LYo2;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/a;->l:LaY;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string p2, "create<Vehicle>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->n:Lio/reactivex/subjects/a;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string p2, "create<Unit>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->o:Lio/reactivex/subjects/a;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->p:Lio/reactivex/subjects/d;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    const-string p2, "create<String>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->q:Lma4;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->r:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/Semaphore;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->s:Ljava/util/concurrent/Semaphore;

    new-instance p1, Lco/bird/android/manager/bluetooth/internal/a$d;

    invoke-direct {p1, p0}, Lco/bird/android/manager/bluetooth/internal/a$d;-><init>(Lco/bird/android/manager/bluetooth/internal/a;)V

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->t:Lco/bird/android/manager/bluetooth/internal/a$d;

    new-instance p1, Lco/bird/android/manager/bluetooth/internal/a$a;

    invoke-direct {p1, p0}, Lco/bird/android/manager/bluetooth/internal/a$a;-><init>(Lco/bird/android/manager/bluetooth/internal/a;)V

    invoke-virtual {p0, p1}, LYo2;->L(LyU;)V

    return-void
.end method

.method public static synthetic R(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/a;->V(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/a;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/a;->U(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;

    move-result-object p0

    return-object p0
.end method

.method public static final U(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connect called"

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/a;->e0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a;->o:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->i()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a;->r:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connecting to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lco/bird/android/manager/bluetooth/internal/a;->e0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object v1, p0, LYo2;->k:LyU;

    invoke-virtual {p0, v1}, LYo2;->L(LyU;)V

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p0, v1}, LxU;->w(Landroid/bluetooth/BluetoothDevice;)Lno/nordicsemi/android/ble/n0;

    move-result-object v1

    invoke-virtual {v1}, Lno/nordicsemi/android/ble/A0;->I()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connect: request failed \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lco/bird/android/manager/bluetooth/internal/a;->e0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    new-instance p0, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v3, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0

    :cond_0
    const-string v0, "connect: authenticating after disconnecting is an error, this object cannot be reused after disconnecting."

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/a;->e0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    new-instance p0, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v3, 0x0

    const-string v4, "Attempting to reuse object after disconnect."

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0
.end method

.method public static final V(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disconnect"

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/a;->e0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a;->o:Lio/reactivex/subjects/a;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p0}, LxU;->x()Lno/nordicsemi/android/ble/p0;

    move-result-object v0

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/A0;->I()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "disconnect: exception caught, but ignoring: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/a;->e0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    :goto_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

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

.method public static final synthetic access$enableNotifications(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-virtual {p0, p1}, LxU;->z(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/D0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCommandCharacteristic$p(Lco/bird/android/manager/bluetooth/internal/a;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/a;->m:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p0
.end method

.method public static final synthetic access$getDisconnectedSubject$p(Lco/bird/android/manager/bluetooth/internal/a;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/a;->p:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getDisconnectingSubject$p(Lco/bird/android/manager/bluetooth/internal/a;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/a;->o:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getLock$p(Lco/bird/android/manager/bluetooth/internal/a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/a;->r:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic access$getNotificationRelay$p(Lco/bird/android/manager/bluetooth/internal/a;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/a;->q:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getVehicleSubject$p(Lco/bird/android/manager/bluetooth/internal/a;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/bluetooth/internal/a;->n:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$lightsCommand(Lco/bird/android/manager/bluetooth/internal/a;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/a;->W(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$lockCommand(Lco/bird/android/manager/bluetooth/internal/a;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/a;->X(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$maxSpeedCommand(Lco/bird/android/manager/bluetooth/internal/a;Ljava/lang/String;II)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/manager/bluetooth/internal/a;->a0(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$parseLockCommandResponse(Lco/bird/android/manager/bluetooth/internal/a;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/a;->b0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setCommandCharacteristic$p(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->m:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-void
.end method

.method public static final synthetic access$setNotificationCallback(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothGattCharacteristic;)LEj6;
    .locals 0

    invoke-virtual {p0, p1}, LxU;->M(Landroid/bluetooth/BluetoothGattCharacteristic;)LEj6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$trace(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/a;->e0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$writeCharacteristic(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-virtual {p0, p1, p2}, LxU;->P(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lno/nordicsemi/android/ble/D0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public C()LxU$b;
    .locals 1

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a;->t:Lco/bird/android/manager/bluetooth/internal/a$d;

    return-object v0
.end method

.method public final W(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AT+BKLED="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",0,"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "$\r\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final X(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    if-eqz p2, :cond_0

    const-string p2, "1"

    goto :goto_0

    :cond_0
    const-string p2, "0"

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AT+BKSCT="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "$\r\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final Y(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;
    .locals 2
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

    if-eqz p2, :cond_0

    const-string v0, "lock"

    goto :goto_0

    :cond_0
    const-string v0, "unlock"

    :goto_0
    new-instance v1, Lco/bird/android/manager/bluetooth/internal/a$f;

    invoke-direct {v1, p0, p2}, Lco/bird/android/manager/bluetooth/internal/a$f;-><init>(Lco/bird/android/manager/bluetooth/internal/a;Z)V

    new-instance p2, Lco/bird/android/manager/bluetooth/internal/a$c;

    invoke-direct {p2, v0}, Lco/bird/android/manager/bluetooth/internal/a$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v1, p2}, Lco/bird/android/manager/bluetooth/internal/a;->d0(Lco/bird/android/model/Vehicle;Lkotlin/jvm/functions/Function1;Lco/bird/android/manager/bluetooth/internal/a$c;)Lio/reactivex/F;

    move-result-object p2

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/a$g;

    invoke-direct {v1, p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/a$g;-><init>(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    new-instance p1, Lzv;

    invoke-direct {p1, v1}, Lzv;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "internal fun lockInterna\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/a;->s:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, p2}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public a(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 1
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

    new-instance v0, LBv;

    invoke-direct {v0, p0, p1}, LBv;-><init>(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "fromCallable {\n      tra\u2026      }\n      false\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a;->s:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final a0(Ljava/lang/String;II)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AT+BKECP="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ",,$\r\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 20
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

    move-object/from16 v0, p1

    const-string v1, "vehicle"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    const/16 v17, 0x0

    const v18, 0x1fff7

    const/16 v19, 0x0

    invoke-static/range {v0 .. v19}, Lco/bird/android/model/Vehicle;->copy$default(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;ILjava/lang/Object;)Lco/bird/android/model/Vehicle;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "just(vehicle.copy(distance = 0))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b0(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "+ACK:BKSCT,1$"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    const-string v0, "+ACK:BKSCT,0$"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_1
    :goto_0
    return-object v3
.end method

.method public c(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;
    .locals 0
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

    const-string p2, "vehicle"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/a;->Y(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final c0(Lco/bird/android/model/Vehicle;Lkotlin/jvm/functions/Function1;Lco/bird/android/manager/bluetooth/internal/a$c;)Lio/reactivex/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/manager/bluetooth/internal/a$c;",
            ")",
            "Lio/reactivex/c;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getToken()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/a$h;

    move-object v1, v0

    move-object v2, p2

    move-object v4, p1

    move-object v5, p0

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lco/bird/android/manager/bluetooth/internal/a$h;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/manager/bluetooth/internal/a$c;)V

    invoke-static {v0}, Lnh5;->k(Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/a;->l:LaY;

    invoke-interface {p2}, LaY;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/a;->l:LaY;

    invoke-interface {p2}, LaY;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v1, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->f:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v2, 0x0

    invoke-virtual {p3}, Lco/bird/android/manager/bluetooth/internal/a$c;->a()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to write "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "error(VehicleException(e\u2026ite ${loggingInfo.tag}\"))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public d(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle$ConnectionState;
    .locals 1

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->o:Lio/reactivex/subjects/a;

    invoke-virtual {p1}, Lio/reactivex/subjects/a;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lco/bird/android/model/Vehicle$ConnectionState;->CLOSED:Lco/bird/android/model/Vehicle$ConnectionState;

    return-object p1

    :cond_0
    invoke-virtual {p0}, LxU;->A()I

    move-result p1

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    sget-object p1, Lco/bird/android/model/Vehicle$ConnectionState;->CLOSED:Lco/bird/android/model/Vehicle$ConnectionState;

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/model/Vehicle$ConnectionState;->CONNECTED:Lco/bird/android/model/Vehicle$ConnectionState;

    goto :goto_0

    :cond_2
    sget-object p1, Lco/bird/android/model/Vehicle$ConnectionState;->CONNECTED:Lco/bird/android/model/Vehicle$ConnectionState;

    goto :goto_0

    :cond_3
    sget-object p1, Lco/bird/android/model/Vehicle$ConnectionState;->DISCONNECTED:Lco/bird/android/model/Vehicle$ConnectionState;

    goto :goto_0

    :cond_4
    sget-object p1, Lco/bird/android/model/Vehicle$ConnectionState;->DISCONNECTED:Lco/bird/android/model/Vehicle$ConnectionState;

    :goto_0
    return-object p1
.end method

.method public final d0(Lco/bird/android/model/Vehicle;Lkotlin/jvm/functions/Function1;Lco/bird/android/manager/bluetooth/internal/a$c;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/manager/bluetooth/internal/a$c;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/manager/bluetooth/internal/a;->c0(Lco/bird/android/model/Vehicle;Lkotlin/jvm/functions/Function1;Lco/bird/android/manager/bluetooth/internal/a$c;)Lio/reactivex/c;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lio/reactivex/c;->j0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "sendCommand(vehicle, com\u2026fo).toSingleDefault(true)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/a;->q:Lma4;

    invoke-virtual {p2}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p2

    const-string p3, "notificationRelay.firstOrError()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lco/bird/android/manager/bluetooth/internal/a$i;

    invoke-direct {p3}, Lco/bird/android/manager/bluetooth/internal/a$i;-><init>()V

    invoke-virtual {p1, p2, p3}, Lio/reactivex/F;->u0(Lio/reactivex/K;Lio/reactivex/functions/c;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "zipWith(other, BiFunctio\u2026-> zipper.invoke(t, u) })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
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

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/a;->d(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle$ConnectionState;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "just(getConnectionState(vehicle))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final e0(Lco/bird/android/model/Vehicle;Ljava/lang/String;)V
    .locals 3

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

    const-string v2, "bluetooth ble "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

.method public f(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
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

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "just(vehicle)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public g(Lco/bird/android/model/Vehicle;II)Lio/reactivex/F;
    .locals 3
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

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/a$j;

    invoke-direct {v0, p0, p2, p3}, Lco/bird/android/manager/bluetooth/internal/a$j;-><init>(Lco/bird/android/manager/bluetooth/internal/a;II)V

    new-instance p2, Lco/bird/android/manager/bluetooth/internal/a$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "maxSpeed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lco/bird/android/manager/bluetooth/internal/a$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0, p2}, Lco/bird/android/manager/bluetooth/internal/a;->c0(Lco/bird/android/model/Vehicle;Lkotlin/jvm/functions/Function1;Lco/bird/android/manager/bluetooth/internal/a$c;)Lio/reactivex/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/reactivex/c;->j0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun setMaxSpeed\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/a;->s:Ljava/util/concurrent/Semaphore;

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

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "just(vehicle)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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

    new-instance v0, LAv;

    invoke-direct {v0, p0, p1}, LAv;-><init>(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "fromCallable {\n      tra\u2026    }\n      vehicle\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a;->s:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, v0}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public j(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
    .locals 22
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

    move-object/from16 v0, p0

    const-string v1, "vehicle"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lco/bird/android/manager/bluetooth/internal/a;->o:Lio/reactivex/subjects/a;

    invoke-virtual {v1}, Lio/reactivex/subjects/a;->i()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x1ffbf

    const/16 v21, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v21}, Lco/bird/android/model/Vehicle;->copy$default(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;ILjava/lang/Object;)Lco/bird/android/model/Vehicle;

    move-result-object v1

    iget-object v2, v0, Lco/bird/android/manager/bluetooth/internal/a;->n:Lio/reactivex/subjects/a;

    invoke-virtual {v2, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    invoke-static {v1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    const-string v2, "just(v)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_0
    new-instance v1, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v4, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1
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

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->o:Lio/reactivex/subjects/a;

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

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->p:Lio/reactivex/subjects/d;

    invoke-virtual {p1}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "disconnectedSubject.hide()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public m(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;
    .locals 0
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

    const-string p2, "vehicle"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "just(vehicle)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public n(Lco/bird/android/model/Vehicle;I)Lio/reactivex/F;
    .locals 0
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

    const-string p2, "vehicle"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "just(vehicle)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public o(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
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

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/bluetooth/internal/a;->Y(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;

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

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a;->n:Lio/reactivex/subjects/a;

    invoke-virtual {p1}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "vehicleSubject.hide()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public q(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;
    .locals 4
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

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/a$e;

    invoke-direct {v0, p0, p2}, Lco/bird/android/manager/bluetooth/internal/a$e;-><init>(Lco/bird/android/manager/bluetooth/internal/a;Z)V

    new-instance v1, Lco/bird/android/manager/bluetooth/internal/a$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lights:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p2}, Lco/bird/android/manager/bluetooth/internal/a$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0, v1}, Lco/bird/android/manager/bluetooth/internal/a;->c0(Lco/bird/android/model/Vehicle;Lkotlin/jvm/functions/Function1;Lco/bird/android/manager/bluetooth/internal/a$c;)Lio/reactivex/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/reactivex/c;->j0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun lights(vehi\u2026ration(bluetoothLock)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/a;->s:Ljava/util/concurrent/Semaphore;

    invoke-static {p1, p2}, LK36;->f(Lio/reactivex/F;Ljava/util/concurrent/Semaphore;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public r(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
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

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "just(vehicle)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public release()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a;->s:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V

    :try_start_0
    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/a;->access$getDisconnectingSubject$p(Lco/bird/android/manager/bluetooth/internal/a;)Lio/reactivex/subjects/a;

    move-result-object v1

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v1, v2}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/a;->access$getLock$p(Lco/bird/android/manager/bluetooth/internal/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, LxU;->x()Lno/nordicsemi/android/ble/p0;

    move-result-object v2

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/A0;->k()V
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

    :goto_0
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

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

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "just(vehicle)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
