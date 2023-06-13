.class public final LFe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAe5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFe5$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\n*\u0001$\u0018\u0000 ,2\u00020\u0001:\u0001\u0008B!\u0008\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u00a2\u0006\u0004\u0008*\u0010+J\u001e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00122\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006-"
    }
    d2 = {
        "LFe5;",
        "LAe5;",
        "",
        "scanTime",
        "Ljava/util/concurrent/TimeUnit;",
        "scanTimeUnit",
        "Lio/reactivex/k;",
        "LTk5;",
        "a",
        "Lco/bird/android/model/VehicleDescriptor;",
        "vehicleDescriptor",
        "",
        "checkCache",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/BleScannedVehicle;",
        "b",
        "Lco/bird/api/request/BLEScanTrigger;",
        "bleTrigger",
        "Lio/reactivex/Observable;",
        "l",
        "scanResult",
        "h",
        "LMD;",
        "LMD;",
        "baseBluetoothManager",
        "LaY;",
        "LaY;",
        "scheduler",
        "LhX;",
        "c",
        "LhX;",
        "bluetoothEncryptionClient",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "d",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "vehicles",
        "Fe5$b$a",
        "e",
        "Lkotlin/Lazy;",
        "g",
        "()LFe5$b$a;",
        "hongjiEncryptor",
        "<init>",
        "(LMD;LaY;LhX;)V",
        "f",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final f:LFe5$a;


# instance fields
.field public final a:LMD;

.field public final b:LaY;

.field public final c:LhX;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lco/bird/android/model/VehicleDescriptor;",
            "Lco/bird/android/model/BleScannedVehicle;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LFe5$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFe5$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFe5;->f:LFe5$a;

    return-void
.end method

.method public constructor <init>(LMD;LaY;LhX;)V
    .locals 1

    const-string v0, "baseBluetoothManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothEncryptionClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFe5;->a:LMD;

    iput-object p2, p0, LFe5;->b:LaY;

    iput-object p3, p0, LFe5;->c:LhX;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LFe5;->d:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, LFe5$b;

    invoke-direct {p1, p0}, LFe5$b;-><init>(LFe5;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LFe5;->e:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getBluetoothEncryptionClient$p(LFe5;)LhX;
    .locals 0

    iget-object p0, p0, LFe5;->c:LhX;

    return-object p0
.end method

.method public static final synthetic access$getVehicles$p(LFe5;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    iget-object p0, p0, LFe5;->d:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method public static final synthetic access$initBleScannedVehicle(LFe5;Lco/bird/android/model/VehicleDescriptor;LTk5;)Lco/bird/android/model/BleScannedVehicle;
    .locals 0

    invoke-virtual {p0, p1, p2}, LFe5;->h(Lco/bird/android/model/VehicleDescriptor;LTk5;)Lco/bird/android/model/BleScannedVehicle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLFe5;Lco/bird/android/model/VehicleDescriptor;)Lco/bird/android/model/BleScannedVehicle;
    .locals 0

    invoke-static {p0, p1, p2}, LFe5;->i(ZLFe5;Lco/bird/android/model/VehicleDescriptor;)Lco/bird/android/model/BleScannedVehicle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BleScannedVehicle;
    .locals 0

    invoke-static {p0, p1}, LFe5;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BleScannedVehicle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LFe5;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LFe5;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final i(ZLFe5;Lco/bird/android/model/VehicleDescriptor;)Lco/bird/android/model/BleScannedVehicle;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicleDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    iget-object p0, p1, LFe5;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/BleScannedVehicle;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BleScannedVehicle;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/BleScannedVehicle;

    return-object p0
.end method

.method public static synthetic m(LFe5;Lco/bird/api/request/BLEScanTrigger;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LFe5;->l(Lco/bird/api/request/BLEScanTrigger;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/k;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/k<",
            "LTk5;",
            ">;"
        }
    .end annotation

    const-string v0, "scanTimeUnit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LFe5;->a:LMD;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LMD$a;->scanBleDevices$default(LMD;IZLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {p1, p2, p3}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lio/reactivex/b;->d:Lio/reactivex/b;

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object p1

    const-string p2, "baseBluetoothManager.sca\u2026kpressureStrategy.BUFFER)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Lco/bird/android/model/VehicleDescriptor;Z)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/VehicleDescriptor;",
            "Z)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/BleScannedVehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicleDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LBe5;

    invoke-direct {v0, p2, p0, p1}, LBe5;-><init>(ZLFe5;Lco/bird/android/model/VehicleDescriptor;)V

    invoke-static {v0}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LFe5;->m(LFe5;Lco/bird/api/request/BLEScanTrigger;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LFe5$c;

    invoke-direct {v1, p1}, LFe5$c;-><init>(Lco/bird/android/model/VehicleDescriptor;)V

    new-instance v2, LCe5;

    invoke-direct {v2, v1}, LCe5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LFe5$d;

    invoke-direct {v1, p0, p1}, LFe5$d;-><init>(LFe5;Lco/bird/android/model/VehicleDescriptor;)V

    new-instance p1, LDe5;

    invoke-direct {p1, v1}, LDe5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/p;->W(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, LFe5;->b:LaY;

    invoke-interface {v0}, LaY;->a()Lio/reactivex/E;

    move-result-object v0

    const-wide/16 v1, 0xa

    invoke-virtual {p1, v1, v2, p2, v0}, Lio/reactivex/F;->b0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun scan(vehicl\u2026ONDS, scheduler.main)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final g()LFe5$b$a;
    .locals 1

    iget-object v0, p0, LFe5;->e:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFe5$b$a;

    return-object v0
.end method

.method public final h(Lco/bird/android/model/VehicleDescriptor;LTk5;)Lco/bird/android/model/BleScannedVehicle;
    .locals 20

    move-object/from16 v0, p2

    sget-object v1, Lco/bird/android/model/constant/EnergyMode;->NORMAL:Lco/bird/android/model/constant/EnergyMode;

    invoke-static/range {p2 .. p2}, LUk5;->E(LTk5;)Z

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-static {}, Lf;->c()Lf;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, LTk5;->c()LCk5;

    move-result-object v5

    invoke-interface {v5}, LCk5;->a()[B

    move-result-object v5

    invoke-virtual {v2, v5}, Lf;->d([B)Ljava/util/List;

    move-result-object v2

    const-string v5, "getInstance().parse(scanResult.scanRecord.bytes)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v5, v3

    move v6, v4

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg;

    instance-of v8, v7, Ld;

    if-eqz v8, :cond_0

    check-cast v7, Ld;

    invoke-virtual {v7}, Lg;->a()[B

    move-result-object v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v5

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    move-result v6

    move-object/from16 v7, p1

    invoke-static {v7, v6}, LBd1;->a(Lco/bird/android/model/VehicleDescriptor;B)Lco/bird/android/model/constant/EnergyMode;

    move-result-object v6

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-static {v1}, LHY;->c(I)I

    move-result v1

    move-object/from16 v19, v6

    move v6, v1

    move-object/from16 v1, v19

    goto :goto_0

    :cond_0
    move-object/from16 v7, p1

    goto :goto_0

    :cond_1
    move v2, v3

    move v3, v5

    goto :goto_1

    :cond_2
    move v2, v3

    move v6, v4

    :goto_1
    invoke-static/range {p2 .. p2}, LUk5;->G(LTk5;)Z

    move-result v5

    const-string v7, "scanRecord"

    const-string v8, "bluetoothDevice"

    const-string v9, "bleDevice"

    if-eqz v5, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "detected bird flex scan result: "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v5, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v5

    invoke-interface {v5}, Lne5;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, LTk5;->b()I

    move-result v10

    invoke-virtual/range {p2 .. p2}, LTk5;->c()LCk5;

    move-result-object v0

    new-instance v17, Lco/bird/android/model/BirdFlexBleScannedVehicle;

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, v17

    move-object v8, v4

    move-object v9, v5

    move v10, v3

    move v11, v2

    move v12, v6

    move-object v13, v1

    move-object/from16 v16, v0

    invoke-direct/range {v7 .. v16}, Lco/bird/android/model/BirdFlexBleScannedVehicle;-><init>(Lne5;Landroid/bluetooth/BluetoothDevice;IIILco/bird/android/model/constant/EnergyMode;Ljava/lang/Integer;Ljava/lang/String;LCk5;)V

    goto/16 :goto_2

    :cond_3
    invoke-static/range {p2 .. p2}, LUk5;->y(LTk5;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v5

    invoke-interface {v5}, Lne5;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, LTk5;->b()I

    move-result v10

    invoke-static/range {p2 .. p2}, LUk5;->Y(LTk5;)Lco/bird/android/model/VehicleDescriptor;

    move-result-object v11

    invoke-virtual {v11}, Lco/bird/android/model/VehicleDescriptor;->getImei()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, LTk5;->c()LCk5;

    move-result-object v0

    new-instance v17, Lco/bird/android/model/BdBleScannedVehicle;

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, v17

    move-object v8, v4

    move-object v9, v5

    move v10, v3

    move v11, v2

    move v12, v6

    move-object v13, v1

    move-object/from16 v16, v0

    invoke-direct/range {v7 .. v16}, Lco/bird/android/model/BdBleScannedVehicle;-><init>(Lne5;Landroid/bluetooth/BluetoothDevice;IIILco/bird/android/model/constant/EnergyMode;Ljava/lang/Integer;Ljava/lang/String;LCk5;)V

    goto/16 :goto_2

    :cond_4
    invoke-static/range {p2 .. p2}, LUk5;->A(LTk5;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v5

    invoke-interface {v5}, Lne5;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, LTk5;->b()I

    move-result v10

    invoke-virtual/range {p2 .. p2}, LTk5;->c()LCk5;

    move-result-object v0

    new-instance v17, Lco/bird/android/model/BirdAirBleScannedVehicle;

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, v17

    move-object v8, v4

    move-object v9, v5

    move v10, v3

    move v11, v2

    move v12, v6

    move-object v13, v1

    move-object/from16 v16, v0

    invoke-direct/range {v7 .. v16}, Lco/bird/android/model/BirdAirBleScannedVehicle;-><init>(Lne5;Landroid/bluetooth/BluetoothDevice;IIILco/bird/android/model/constant/EnergyMode;Ljava/lang/Integer;Ljava/lang/String;LCk5;)V

    goto/16 :goto_2

    :cond_5
    invoke-static/range {p2 .. p2}, LUk5;->C(LTk5;)Z

    move-result v5

    if-eqz v5, :cond_6

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "detected bird bike scan result: "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v5, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LFe5;->g()LFe5$b$a;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v10

    invoke-interface {v10}, Lne5;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, LTk5;->b()I

    move-result v11

    invoke-virtual/range {p2 .. p2}, LTk5;->c()LCk5;

    move-result-object v15

    invoke-static/range {p2 .. p2}, LUk5;->M(LTk5;)Z

    move-result v18

    new-instance v0, Lco/bird/android/model/BirdBikeBleScannedVehicle;

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/16 v17, 0x0

    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v0

    move-object v8, v4

    move-object v9, v5

    move v11, v3

    move v12, v2

    move v13, v6

    move-object v14, v1

    move-object v1, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v1

    invoke-direct/range {v7 .. v18}, Lco/bird/android/model/BirdBikeBleScannedVehicle;-><init>(Lco/bird/android/model/HJPayloadEncryptor;Lne5;Landroid/bluetooth/BluetoothDevice;IIILco/bird/android/model/constant/EnergyMode;Ljava/lang/Integer;Ljava/lang/String;LCk5;Z)V

    move-object/from16 v17, v0

    goto :goto_2

    :cond_6
    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LTk5;->a()Lne5;

    move-result-object v5

    invoke-interface {v5}, Lne5;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, LTk5;->b()I

    move-result v10

    invoke-virtual/range {p2 .. p2}, LTk5;->c()LCk5;

    move-result-object v0

    new-instance v17, Lco/bird/android/model/BirdBleScannedVehicle;

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, v17

    move-object v8, v4

    move-object v9, v5

    move v10, v3

    move v11, v2

    move v12, v6

    move-object v13, v1

    move-object/from16 v16, v0

    invoke-direct/range {v7 .. v16}, Lco/bird/android/model/BirdBleScannedVehicle;-><init>(Lne5;Landroid/bluetooth/BluetoothDevice;IIILco/bird/android/model/constant/EnergyMode;Ljava/lang/Integer;Ljava/lang/String;LCk5;)V

    :goto_2
    return-object v17
.end method

.method public final l(Lco/bird/api/request/BLEScanTrigger;)Lio/reactivex/Observable;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BLEScanTrigger;",
            ")",
            "Lio/reactivex/Observable<",
            "LTk5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LFe5;->a:LMD;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v3, p1

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LMD$a;->scanBleDevices$default(LMD;IZLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, LFe5$e;->g:LFe5$e;

    new-instance v1, LEe5;

    invoke-direct {v1, v0}, LEe5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "baseBluetoothManager.sca\u2026| it.isBirdFlex()\n      }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
