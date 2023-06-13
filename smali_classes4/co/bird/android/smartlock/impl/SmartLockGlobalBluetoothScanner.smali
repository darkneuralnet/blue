.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;,
        Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$b;,
        Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;,
        Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 X2\u00020\u0001:\u0004Y*.2BA\u0008\u0007\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A\u00a2\u0006\u0004\u0008V\u0010WJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0002J\u0012\u0010\u000c\u001a\u00020\u000b*\u0008\u0012\u0004\u0012\u00020\n0\tH\u0002J$\u0010\u0011\u001a\u00020\u000b*\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\n0\u000e0\rH\u0002J\u0018\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\r*\u00020\nH\u0002J \u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\r*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J$\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00160\t*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00160\tH\u0002J%\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ \u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0016*\u0008\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010!\u001a\u00020 H\u0002J \u0010(\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\'\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR8\u0010M\u001a&\u0012\u000c\u0012\n J*\u0004\u0018\u00010\u001c0\u001c J*\u0012\u0012\u000c\u0012\n J*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010I0I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020&0N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010U\u001a\u00020R8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010T\u00a8\u0006\\\u00b2\u0006\u000c\u0010Z\u001a\u00020\u001c8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010[\u001a\u00020\u001f8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onStart",
        "onStop",
        "Lio/reactivex/disposables/c;",
        "U",
        "Lio/reactivex/k;",
        "LsE5;",
        "Lio/reactivex/c;",
        "L",
        "Lio/reactivex/p;",
        "Lkotlin/Pair;",
        "Lcy0;",
        "LjI5;",
        "N",
        "C",
        "Lco/bird/android/model/persistence/Bird;",
        "bird",
        "D",
        "",
        "z",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;",
        "action",
        "",
        "secondsAgo",
        "",
        "P",
        "(LsE5;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;I)Ljava/lang/Boolean;",
        "Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;",
        "type",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
        "Q",
        "",
        "smartLockMacAddress",
        "Lorg/joda/time/DateTime;",
        "timeStamp",
        "T",
        "Lq54;",
        "b",
        "Lq54;",
        "privateBirdsManager",
        "LYR4;",
        "c",
        "LYR4;",
        "rideManager",
        "LMc2;",
        "d",
        "LMc2;",
        "itemLeaseManager",
        "LTq4;",
        "e",
        "LTq4;",
        "reactiveConfig",
        "LhF5;",
        "f",
        "LhF5;",
        "smartLockManager",
        "LDX;",
        "g",
        "LDX;",
        "bluetoothManager",
        "Le13;",
        "h",
        "Le13;",
        "navigator",
        "Lio/reactivex/disposables/b;",
        "i",
        "Lio/reactivex/disposables/b;",
        "disposables",
        "Lio/reactivex/Observable;",
        "kotlin.jvm.PlatformType",
        "j",
        "Lio/reactivex/Observable;",
        "bluetoothReady",
        "LvE2;",
        "k",
        "LvE2;",
        "recordedActionCache",
        "Lg46$b;",
        "B",
        "()Lg46$b;",
        "logger",
        "<init>",
        "(Lq54;LYR4;LMc2;LTq4;LhF5;LDX;Le13;)V",
        "l",
        "a",
        "allTypesMatch",
        "wireBird",
        "impl_release"
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
        "SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n44#2:482\n180#3:483\n1603#4,9:484\n1855#4:493\n766#4:494\n857#4,2:495\n1856#4:499\n1612#4:500\n1#5:497\n1#5:498\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner\n*L\n87#1:482\n87#1:483\n450#1:484,9\n450#1:493\n451#1:494\n451#1:495,2\n450#1:499\n450#1:500\n450#1:498\n*E\n"
    }
.end annotation


# static fields
.field public static final l:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$b;


# instance fields
.field public final b:Lq54;

.field public final c:LYR4;

.field public final d:LMc2;

.field public final e:LTq4;

.field public final f:LhF5;

.field public final g:LDX;

.field public final h:Le13;

.field public final i:Lio/reactivex/disposables/b;

.field public final j:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final k:LvE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvE2<",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->l:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$b;

    return-void
.end method

.method public constructor <init>(Lq54;LYR4;LMc2;LTq4;LhF5;LDX;Le13;)V
    .locals 1

    const-string v0, "privateBirdsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemLeaseManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartLockManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->b:Lq54;

    iput-object p2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->c:LYR4;

    iput-object p3, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->d:LMc2;

    iput-object p4, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->e:LTq4;

    iput-object p5, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->f:LhF5;

    iput-object p6, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->g:LDX;

    iput-object p7, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->h:Le13;

    new-instance p1, Lio/reactivex/disposables/b;

    invoke-direct {p1}, Lio/reactivex/disposables/b;-><init>()V

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->i:Lio/reactivex/disposables/b;

    invoke-interface {p6}, LDX;->b()Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$e;

    invoke-direct {p2, p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$e;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V

    new-instance p3, LxE5;

    invoke-direct {p3, p2}, LxE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$f;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$f;

    new-instance p3, LFE5;

    invoke-direct {p3, p2}, LFE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->j:Lio/reactivex/Observable;

    new-instance p1, LvE2;

    const/16 p2, 0x19

    invoke-direct {p1, p2}, LvE2;-><init>(I)V

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->k:LvE2;

    return-void
.end method

.method public static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final Y(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$filterRecentlyActionedSmartLocks(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;Lio/reactivex/k;)Lio/reactivex/k;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->z(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDisposables$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)Lio/reactivex/disposables/b;
    .locals 0

    iget-object p0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->i:Lio/reactivex/disposables/b;

    return-object p0
.end method

.method public static final synthetic access$getItemLeaseManager$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)LMc2;
    .locals 0

    iget-object p0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->d:LMc2;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)Lg46$b;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->B()Lg46$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)Le13;
    .locals 0

    iget-object p0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->h:Le13;

    return-object p0
.end method

.method public static final synthetic access$getPrivateBirdsManager$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)Lq54;
    .locals 0

    iget-object p0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->b:Lq54;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->e:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getRideManager$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)LYR4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->c:LYR4;

    return-object p0
.end method

.method public static final synthetic access$getSmartLockManager$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)LhF5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->f:LhF5;

    return-object p0
.end method

.method public static final synthetic access$handleConnection(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;)Lio/reactivex/p;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->C(LsE5;)Lio/reactivex/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handlePendingItemLeaseConnection(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/p;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->D(LsE5;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handlePreUnlockAndConnectionStep(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;Lio/reactivex/k;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->L(Lio/reactivex/k;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleUnlockStep(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;Lio/reactivex/p;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->N(Lio/reactivex/p;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$lastActionOccurredAtLeastSecondsAgo(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;I)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->P(LsE5;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;I)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$mapToSmartLockScannableBirds(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;Ljava/util/List;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->Q(Ljava/util/List;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$recordAction(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->T(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;)V

    return-void
.end method

.method public static final synthetic access$scanAndUnlockAvailableSmartLocks(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)Lio/reactivex/disposables/c;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->U()Lio/reactivex/disposables/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->Y(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final B()Lg46$b;
    .locals 2

    const-string v0, "smartlock-global-ble-scanner"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"smartlock-global-ble-scanner\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final C(LsE5;)Lio/reactivex/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsE5;",
            ")",
            "Lio/reactivex/p<",
            "Lcy0<",
            "LjI5;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "attempting to connect to smart lock now"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->f:LhF5;

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v1}, Lkotlin/time/Duration$Companion;->getINFINITE-UwyO8pc()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, LhF5;->c(LsE5;J)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    const-string v0, "smartLockManager.connect\u2026E,\n    )\n      .toMaybe()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final D(LsE5;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/p;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsE5;",
            "Lco/bird/android/model/persistence/Bird;",
            ")",
            "Lio/reactivex/p<",
            "Lcy0<",
            "LjI5;",
            ">;>;"
        }
    .end annotation

    invoke-static {p2}, LZK;->p(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;

    move-result-object p2

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->d:LMc2;

    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v0, p2, v1}, LMc2;->l(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v0

    const-string v1, "private fun SmartLock.ha\u2026d connect: \") }\n    }\n  }"

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string p2, "handlePendingItemLeaseConnection called, we already have a helmet lease so just connecting now"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p2, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->f:LhF5;

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v0}, Lkotlin/time/Duration$Companion;->getINFINITE-UwyO8pc()J

    move-result-wide v2

    invoke-interface {p2, p1, v2, v3}, LhF5;->c(LsE5;J)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$h;

    invoke-direct {v0, p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$h;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;)V

    new-instance p1, LAE5;

    invoke-direct {p1, v0}, LAE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    sget-object p2, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$i;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$i;

    new-instance v0, LBE5;

    invoke-direct {v0, p2}, LBE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->c:LYR4;

    invoke-interface {v0}, LYR4;->y()V

    const-string v0, "handlePendingItemLeaseConnection called, starting lease before connecting"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->d:LMc2;

    invoke-interface {v0, p2}, LMc2;->E(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$j;

    invoke-direct {v0, p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$j;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;)V

    new-instance v2, LCE5;

    invoke-direct {v2, v0}, LCE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v2}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;

    invoke-direct {v0, p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;)V

    new-instance p1, LDE5;

    invoke-direct {p1, v0}, LDE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    sget-object p2, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$l;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$l;

    new-instance v0, LEE5;

    invoke-direct {v0, p2}, LEE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/p;->p(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public final L(Lio/reactivex/k;)Lio/reactivex/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "LsE5;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m;

    invoke-direct {v0, p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V

    new-instance v1, LME5;

    invoke-direct {v1, v0}, LME5;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, Lio/reactivex/k;->a0(Lio/reactivex/functions/o;ZI)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "private fun Flowable<Sma\u2026/* maxConcurrency */)\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final N(Lio/reactivex/p;)Lio/reactivex/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/p<",
            "Lkotlin/Pair<",
            "Lcy0<",
            "LjI5;",
            ">;",
            "LsE5;",
            ">;>;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;

    invoke-direct {v0, p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V

    new-instance v1, LzE5;

    invoke-direct {v1, v0}, LzE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->A(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "private fun Maybe<Pair<C\u2026ErrorComplete()\n    }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final P(LsE5;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;I)Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->k:LvE2;

    invoke-virtual {p1}, LsE5;->f()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/joda/time/DateTime;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p3}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isBeforeNow()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final Q(Ljava/util/List;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v6}, Lco/bird/android/model/wire/WirePhysicalLock;->isBrainLock()Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_1

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_3

    move-object v6, v3

    goto :goto_2

    :cond_3
    move-object v6, v2

    :goto_2
    if-eqz v6, :cond_4

    new-instance v1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    const/16 v8, 0x10

    const/4 v9, 0x0

    move-object v2, v1

    move-object v3, p2

    invoke-direct/range {v2 .. v9}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_4
    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method public final T(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->k:LvE2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LvE2;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final U()Lio/reactivex/disposables/c;
    .locals 3

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->j:Lio/reactivex/Observable;

    sget-object v1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$q;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$q;

    new-instance v2, LHE5;

    invoke-direct {v2, v1}, LHE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r;

    invoke-direct {v1, p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$r;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V

    new-instance v2, LIE5;

    invoke-direct {v2, v1}, LIE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$s;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$s;

    new-instance v2, LJE5;

    invoke-direct {v2, v1}, LJE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$t;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$t;

    new-instance v2, LKE5;

    invoke-direct {v2, v1}, LKE5;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->distinctUntilChanged(Lio/reactivex/functions/d;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$u;

    invoke-direct {v1, p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$u;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V

    new-instance v2, LLE5;

    invoke-direct {v2, v1}, LLE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->subscribe()Lio/reactivex/disposables/c;

    move-result-object v0

    const-string v1, "private fun scanAndUnloc\u2026     }\n      .subscribe()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onStart(LLifecycleOwner;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->e:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    sget-object v1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$o;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$o;

    new-instance v2, LNE5;

    invoke-direct {v2, v1}, LNE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "reactiveConfig.config\n  \u2026  .distinctUntilChanged()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p1

    const-string v1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$p;

    invoke-direct {v0, p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$p;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V

    new-instance v1, LyE5;

    invoke-direct {v1, v0}, LyE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public onStop(LLifecycleOwner;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStop(LLifecycleOwner;)V

    iget-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->i:Lio/reactivex/disposables/b;

    invoke-virtual {p1}, Lio/reactivex/disposables/b;->h()I

    move-result p1

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->B()Lg46$b;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Stopping v2 physical/smart lock bluetooth scanning on stop"

    invoke-virtual {p1, v1, v0}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->i:Lio/reactivex/disposables/b;

    invoke-virtual {p1}, Lio/reactivex/disposables/b;->d()V

    :cond_0
    return-void
.end method

.method public final z(Lio/reactivex/k;)Lio/reactivex/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "Ljava/util/List<",
            "LsE5;",
            ">;>;)",
            "Lio/reactivex/k<",
            "Ljava/util/List<",
            "LsE5;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$g;

    invoke-direct {v0, p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$g;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V

    new-instance v1, LGE5;

    invoke-direct {v1, v0}, LGE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/k;->q0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    const-string v0, "private fun Flowable<Lis\u2026?: true\n      }\n    }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
