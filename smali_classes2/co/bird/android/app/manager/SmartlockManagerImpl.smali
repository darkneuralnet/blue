.class public final Lco/bird/android/app/manager/SmartlockManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoI5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/manager/SmartlockManagerImpl$g;,
        Lco/bird/android/app/manager/SmartlockManagerImpl$h;,
        Lco/bird/android/app/manager/SmartlockManagerImpl$i;,
        Lco/bird/android/app/manager/SmartlockManagerImpl$NotConnected;,
        Lco/bird/android/app/manager/SmartlockManagerImpl$j;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0003\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010#\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00b8\u00012\u00020\u0001:\u0005?FE\u00b9\u0001BY\u0012\u0006\u0010K\u001a\u00020I\u0012\u0006\u0010N\u001a\u00020L\u0012\u0006\u0010Q\u001a\u00020O\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010X\u001a\u00020V\u0012\u0006\u0010[\u001a\u00020Y\u0012\u0006\u0010^\u001a\u00020\\\u0012\u0006\u0010a\u001a\u00020_\u0012\u0006\u0010d\u001a\u00020b\u0012\u0006\u0010h\u001a\u00020e\u00a2\u0006\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00102\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\u001e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00120\u00122\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u000fH\u0002J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\u001e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u001e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0002J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\u000c\u0010#\u001a\u00020\u0015*\u00020\u0017H\u0002J\u000c\u0010$\u001a\u00020\u0017*\u00020\u0015H\u0002J\u0018\u0010(\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020&H\u0002J\u0008\u0010)\u001a\u00020\tH\u0002J\u0008\u0010*\u001a\u00020\tH\u0002J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020&H\u0002J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0016J\\\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020\t0226\u00107\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u00085\u0012\u0008\u00086\u0012\u0004\u0008\u0008(\u0006\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u00085\u0012\u0008\u00086\u0012\u0004\u0008\u0008(\u0008\u0012\u0004\u0012\u00020\t04H\u0016J \u0010<\u001a\u00020;2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010:\u001a\u000209H\u0016J\u0018\u0010=\u001a\u00020;2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u000bH\u0016J\u0008\u0010@\u001a\u00020\tH\u0016J\u000e\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0012H\u0016J\u0014\u0010E\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020D0C0BH\u0016J\u0008\u0010F\u001a\u00020\tH\u0016J\u0010\u0010H\u001a\u00020;2\u0006\u0010G\u001a\u00020,H\u0016R\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR \u0010l\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0C0i8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008j\u0010kR&\u0010o\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0C0B8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008=\u0010m\u001a\u0004\u0008S\u0010nR\u001a\u0010s\u001a\u0008\u0012\u0004\u0012\u00020\u00170p8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR \u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\"\u0010|\u001a\u0010\u0012\u000c\u0012\n y*\u0004\u0018\u00010\t0\t0x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R \u0010~\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020D0C0i8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010kR/\u0010\u0080\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020D y*\n\u0012\u0004\u0012\u00020D\u0018\u00010C0C0B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u007f\u0010mR$\u0010\u0082\u0001\u001a\u0010\u0012\u000c\u0012\n y*\u0004\u0018\u00010\t0\t0x8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0081\u0001\u0010{R$\u0010\u0084\u0001\u001a\u0010\u0012\u000c\u0012\n y*\u0004\u0018\u00010\t0\t0x8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0083\u0001\u0010{R/\u0010\u0087\u0001\u001a\u001b\u0012\u0017\u0012\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\u0085\u00010C0i8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0086\u0001\u0010kR$\u0010\u0089\u0001\u001a\u0010\u0012\u000c\u0012\n y*\u0004\u0018\u00010\u00050\u00050x8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0088\u0001\u0010{R$\u0010\u008b\u0001\u001a\u0010\u0012\u000c\u0012\n y*\u0004\u0018\u00010\u00170\u00170x8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u008a\u0001\u0010{R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u0092\u0001R\u001a\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0099\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0098\u0001\u0010\u0096\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u009d\u0001\u0010\u009b\u0001R$\u0010\u00a2\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002090\u009f\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u0018\u0010\u00a6\u0001\u001a\u00030\u00a3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R*\u0010\u00aa\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0C0\u00a7\u00010\u00128\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001R5\u0010\u00ac\u0001\u001a\u001b\u0012\u0017\u0012\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\u0085\u00010C0B8\u0016X\u0096\u0004\u00a2\u0006\r\n\u0005\u0008\u00ab\u0001\u0010m\u001a\u0004\u0008f\u0010nR;\u0010\u00af\u0001\u001a&\u0012\u000c\u0012\n y*\u0004\u0018\u00010\u00070\u0007 y*\u0012\u0012\u000c\u0012\n y*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00120\u00128BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001R\u0018\u0010\u00b3\u0001\u001a\u00030\u00b0\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001R\u0016\u0010\u00b5\u0001\u001a\u0002098VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008j\u0010\u00b4\u0001\u00a8\u0006\u00ba\u0001"
    }
    d2 = {
        "Lco/bird/android/app/manager/SmartlockManagerImpl;",
        "LoI5;",
        "Lio/reactivex/disposables/c;",
        "F0",
        "a1",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "lock",
        "Lde5$a;",
        "state",
        "",
        "r1",
        "LXl5;",
        "LTk5;",
        "scanResult",
        "L0",
        "Lco/bird/android/model/wire/WireSmartlock;",
        "Lio/reactivex/F;",
        "d1",
        "Lio/reactivex/Observable;",
        "Lke5;",
        "k0",
        "",
        "E0",
        "",
        "C0",
        "k1",
        "payload",
        "j1",
        "message",
        "Lco/bird/api/response/NokelockResponse;",
        "P0",
        "n0",
        "connection",
        "c1",
        "Q0",
        "A0",
        "z0",
        "smartlock",
        "",
        "error",
        "O0",
        "N0",
        "M0",
        "m1",
        "",
        "y0",
        "()Ljava/lang/Long;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "j",
        "Lkotlin/Function0;",
        "onBleReady",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "onBleNotReady",
        "c",
        "",
        "count",
        "Lio/reactivex/c;",
        "b",
        "m",
        "rideLock",
        "g",
        "d",
        "f",
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "Loe6;",
        "i",
        "h",
        "waitDelayMilliseconds",
        "a",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "Lde5;",
        "Lde5;",
        "bleClient",
        "LhI5;",
        "LhI5;",
        "smartlockClient",
        "LMD;",
        "e",
        "LMD;",
        "baseBluetoothManager",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "LYR4;",
        "LYR4;",
        "rideManager",
        "LTq4;",
        "LTq4;",
        "reactiveConfig",
        "Lgl;",
        "Lgl;",
        "preference",
        "LMc2;",
        "LMc2;",
        "itemLeaseManager",
        "LDX;",
        "k",
        "LDX;",
        "bluetoothManager",
        "La94;",
        "l",
        "La94;",
        "mutableCurrentlyAvailablePrimaryRideLock",
        "LZ84;",
        "()LZ84;",
        "currentlyAvailablePrimaryRideLock",
        "",
        "n",
        "Ljava/util/Set;",
        "scannedMacAddresses",
        "",
        "o",
        "Ljava/util/Map;",
        "connections",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "p",
        "Lma4;",
        "unlocksRelay",
        "q",
        "mutableUnlockErrors",
        "r",
        "unlockErrors",
        "s",
        "locksRelay",
        "t",
        "unlockOrLockingRelay",
        "Lkotlin/Pair;",
        "u",
        "lockScanNotificationRelay",
        "v",
        "rideEnds",
        "w",
        "tokenResponses",
        "x",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "y",
        "Lio/reactivex/disposables/c;",
        "lockDisposable",
        "z",
        "Ljava/lang/Long;",
        "registeredTime",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "A",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "unlocksCount",
        "B",
        "locksCount",
        "C",
        "Ljava/lang/String;",
        "stateRequestToken",
        "D",
        "lockingRequestToken",
        "LvE2;",
        "E",
        "LvE2;",
        "currentTokenRequestIndexCache",
        "Lio/reactivex/disposables/b;",
        "F",
        "Lio/reactivex/disposables/b;",
        "disposables",
        "",
        "G",
        "Lio/reactivex/Observable;",
        "sharedUnlockingForRidesObservable",
        "H",
        "physicalLockScanResults",
        "B0",
        "()Lio/reactivex/Observable;",
        "bleState",
        "",
        "D0",
        "()Z",
        "smartLockV2Enabled",
        "()I",
        "ridePhysicalUnlockCount",
        "<init>",
        "(Landroid/content/Context;Lde5;LhI5;LMD;LEa;LYR4;LTq4;Lgl;LMc2;LDX;)V",
        "I",
        "NotConnected",
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
        "SMAP\nSmartlockManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockManagerImpl.kt\nco/bird/android/app/manager/SmartlockManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,959:1\n180#2:960\n180#2:961\n237#2:962\n180#2:963\n180#2:964\n180#2:966\n180#2:967\n237#2:968\n1#3:965\n52#4,2:969\n*S KotlinDebug\n*F\n+ 1 SmartlockManagerImpl.kt\nco/bird/android/app/manager/SmartlockManagerImpl\n*L\n152#1:960\n161#1:961\n183#1:962\n189#1:963\n327#1:964\n348#1:966\n392#1:967\n666#1:968\n209#1:969,2\n*E\n"
    }
.end annotation


# static fields
.field public static final I:Lco/bird/android/app/manager/SmartlockManagerImpl$g;

.field public static final J:I


# instance fields
.field public A:Ljava/util/concurrent/atomic/AtomicInteger;

.field public B:Ljava/util/concurrent/atomic/AtomicInteger;

.field public C:Ljava/lang/String;

.field public D:Ljava/lang/String;

.field public final E:LvE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvE2<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Lio/reactivex/disposables/b;

.field public final G:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/buava/Optional<",
            "LXl5;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final H:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lkotlin/Pair<",
            "LXl5;",
            "LTk5;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final b:Landroid/content/Context;

.field public final c:Lde5;

.field public final d:LhI5;

.field public final e:LMD;

.field public final f:LEa;

.field public final g:LYR4;

.field public final h:LTq4;

.field public final i:Lgl;

.field public final j:LMc2;

.field public final k:LDX;

.field public final l:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "LXl5;",
            ">;>;"
        }
    .end annotation
.end field

.field public final m:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "LXl5;",
            ">;>;"
        }
    .end annotation
.end field

.field public final n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lke5;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final q:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Loe6;",
            ">;>;"
        }
    .end annotation
.end field

.field public final r:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Loe6;",
            ">;>;"
        }
    .end annotation
.end field

.field public final s:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final u:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lkotlin/Pair<",
            "LXl5;",
            "LTk5;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final v:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public x:Lco/bird/android/model/wire/WirePhysicalLock;

.field public y:Lio/reactivex/disposables/c;

.field public z:Ljava/lang/Long;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/manager/SmartlockManagerImpl$g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl$g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->I:Lco/bird/android/app/manager/SmartlockManagerImpl$g;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->J:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lde5;LhI5;LMD;LEa;LYR4;LTq4;Lgl;LMc2;LDX;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartlockClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseBluetoothManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemLeaseManager"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->b:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->c:Lde5;

    iput-object p3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->d:LhI5;

    iput-object p4, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->e:LMD;

    iput-object p5, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->f:LEa;

    iput-object p6, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->g:LYR4;

    iput-object p7, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->h:LTq4;

    iput-object p8, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->i:Lgl;

    iput-object p9, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->j:LMc2;

    iput-object p10, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->k:LDX;

    sget-object p1, La94;->h:La94$a;

    sget-object p2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p3

    const/4 p4, 0x0

    const/4 p5, 0x2

    invoke-static {p1, p3, p4, p5, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p3

    iput-object p3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->l:La94;

    sget-object p6, LZ84;->d:LZ84$a;

    invoke-virtual {p6, p3}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p3

    iput-object p3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->m:LZ84;

    new-instance p3, Ljava/util/LinkedHashSet;

    invoke-direct {p3}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->n:Ljava/util/Set;

    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->o:Ljava/util/Map;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p3

    const-string p8, "create<Unit>()"

    invoke-static {p3, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->p:Lma4;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p9

    invoke-static {p1, p9, p4, p5, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p9

    iput-object p9, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->q:La94;

    invoke-virtual {p6, p9}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p9

    iput-object p9, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->r:LZ84;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p9

    invoke-static {p9, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p9, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->s:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p10

    invoke-static {p10, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p10, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->t:Lma4;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p2

    invoke-static {p1, p2, p4, p5, p4}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->u:La94;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p2

    const-string p4, "create<WirePhysicalLock>()"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->v:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p4

    const-string p8, "create<String>()"

    invoke-static {p4, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->w:Lma4;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p8, 0x0

    invoke-direct {p4, p8}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p4, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p4, p8}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p4, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p4, LvE2;

    const/4 p8, 0x5

    invoke-direct {p4, p8}, LvE2;-><init>(I)V

    iput-object p4, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->E:LvE2;

    new-instance p4, Lio/reactivex/disposables/b;

    invoke-direct {p4}, Lio/reactivex/disposables/b;-><init>()V

    iput-object p4, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->F:Lio/reactivex/disposables/b;

    new-instance p4, Lco/bird/android/app/manager/SmartlockManagerImpl$a;

    invoke-direct {p4, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$a;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance p8, LcJ5;

    invoke-direct {p8, p4}, LcJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, p8}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p3

    const-string p4, "unlocksRelay\n      .flat\u2026 ?: Maybe.empty()\n      }"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p4, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string p8, "UNBOUND"

    invoke-static {p4, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p10

    invoke-virtual {p3, p10}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p3

    const-string p10, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p3, p10}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {p3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    new-instance p3, Lco/bird/android/app/manager/SmartlockManagerImpl$b;

    invoke-direct {p3, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$b;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance v0, LdJ5;

    invoke-direct {v0, p3}, LdJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p9, v0}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p3

    const-string p9, "locksRelay\n      .flatMa\u2026 ?: Maybe.empty()\n      }"

    invoke-static {p3, p9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p9

    invoke-virtual {p3, p9}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, p10}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {p3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    new-instance p3, Lco/bird/android/app/manager/SmartlockManagerImpl$c;

    invoke-direct {p3, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$c;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance p9, LeJ5;

    invoke-direct {p9, p3}, LeJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p9}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p2

    sget-object p3, Lco/bird/android/app/manager/SmartlockManagerImpl$d;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$d;

    new-instance p9, LfJ5;

    invoke-direct {p9, p3}, LfJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p9}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p2

    const-string p3, "rideEnds\n      .flatMapC\u2026\n      .onErrorComplete()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p2

    const-string p3, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p2}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    invoke-virtual {p7}, LTq4;->f8()LZ84;

    move-result-object p2

    sget-object p3, Lco/bird/android/app/manager/SmartlockManagerImpl$e;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$e;

    new-instance p7, LqI5;

    invoke-direct {p7, p3}, LqI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p7}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p2

    const-string p3, "reactiveConfig.config\n  \u2026  .distinctUntilChanged()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p10}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p3, Lco/bird/android/app/manager/SmartlockManagerImpl$f;

    invoke-direct {p3, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$f;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance p4, LrI5;

    invoke-direct {p4, p3}, LrI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, p4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->e()LZ84;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p2, p5, p3}, LYf5;->j0(Lio/reactivex/Observable;IZ)Lio/reactivex/Observable;

    move-result-object p2

    new-instance p3, Lco/bird/android/app/manager/SmartlockManagerImpl$K;

    invoke-direct {p3, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$K;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance p4, LsI5;

    invoke-direct {p4, p3}, LsI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/Observable;->share()Lio/reactivex/Observable;

    move-result-object p2

    const-string p3, "currentlyAvailablePrimar\u2026 }\n      }\n      .share()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->G:Lio/reactivex/Observable;

    invoke-virtual {p6, p1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->H:LZ84;

    return-void
.end method

.method public static synthetic A(J)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->U0(J)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->l0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->n1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic G()V
    .locals 0

    invoke-static {}, Lco/bird/android/app/manager/SmartlockManagerImpl;->g1()V

    return-void
.end method

.method public static final G0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->u0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final H0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->l1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final I0(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/B;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lee3;->a:Lee3;

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->g:LYR4;

    invoke-interface {v0}, LYR4;->R()LZ84;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$w;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$w;

    new-instance v2, LBI5;

    invoke-direct {v2, v1}, LBI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->distinctUntilChanged(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "rideManager.primaryRideS\u2026tateOptional.isInRide() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->j:LMc2;

    invoke-interface {p0}, LMc2;->s()LZ84;

    move-result-object p0

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$z;->a:Lco/bird/android/app/manager/SmartlockManagerImpl$z;

    invoke-static {v0, p0, v1}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p0

    const-string v0, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final J0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->b1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final K0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static synthetic L(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->m0(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    return-void
.end method

.method public static synthetic M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->v0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->R0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->I0(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final R0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->X0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final S0(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/h;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->B0()Lio/reactivex/Observable;

    move-result-object p0

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$C;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$C;

    new-instance v1, LZI5;

    invoke-direct {v1, v0}, LZI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->t0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final T0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static synthetic U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->r0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final U0(J)Lio/reactivex/h;
    .locals 1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, p1, v0}, Lio/reactivex/c;->c0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->J0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final V0(Lco/bird/android/app/manager/SmartlockManagerImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->e:LMD;

    invoke-interface {p0}, LMD;->d()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "Attempt to enable bluetooth failed, perhaps bluetooth was already on or airplane mode is on?"

    invoke-static {v0, p0}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->s0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final W0(Lco/bird/android/app/manager/SmartlockManagerImpl;J)Lio/reactivex/h;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->B0()Lio/reactivex/Observable;

    move-result-object p0

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$D;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$D;

    new-instance v1, LXI5;

    invoke-direct {v1, v0}, LXI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p0

    new-instance v0, LYI5;

    invoke-direct {v0, p1, p2}, LYI5;-><init>(J)V

    invoke-static {v0}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p0

    const-wide/16 p1, 0x1388

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, p2, v0}, Lio/reactivex/c;->Z(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lco/bird/android/app/manager/SmartlockManagerImpl;J)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->W0(Lco/bird/android/app/manager/SmartlockManagerImpl;J)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final X0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static synthetic Y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->K0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final Y0(J)Lio/reactivex/h;
    .locals 2

    const-wide/16 v0, 0x2

    mul-long/2addr p0, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, p1, v0}, Lio/reactivex/c;->c0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final Z0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a0(J)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->Y0(J)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBaseBluetoothManager$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)LMD;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->e:LMD;

    return-object p0
.end method

.method public static final synthetic access$getBleClient$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lde5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->c:Lde5;

    return-object p0
.end method

.method public static final synthetic access$getBleState(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/Observable;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->B0()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDisposables$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/disposables/b;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->F:Lio/reactivex/disposables/b;

    return-object p0
.end method

.method public static final synthetic access$getItemLeaseManager$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)LMc2;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->j:LMc2;

    return-object p0
.end method

.method public static final synthetic access$getLock$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lco/bird/android/model/wire/WirePhysicalLock;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    return-object p0
.end method

.method public static final synthetic access$getLockingRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->D:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getLocksCount$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic access$getMutableCurrentlyAvailablePrimaryRideLock$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->l:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableUnlockErrors$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->q:La94;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lgl;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->i:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->h:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getRideEnds$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->v:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getRideManager$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)LYR4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->g:LYR4;

    return-object p0
.end method

.method public static final synthetic access$getScannedMacAddresses$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->n:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic access$getStateRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->C:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getTokenResponses$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->w:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getUnlockOrLockingRelay$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->t:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getUnlocksCount$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic access$listen(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/Observable;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->E0(Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$listenForRideStateChanges(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/disposables/c;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->F0()Lio/reactivex/disposables/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$notifyScanResultForLock(Lco/bird/android/app/manager/SmartlockManagerImpl;LXl5;LTk5;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->L0(LXl5;LTk5;)V

    return-void
.end method

.method public static final synthetic access$onLockLocked(Lco/bird/android/app/manager/SmartlockManagerImpl;)V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->M0()V

    return-void
.end method

.method public static final synthetic access$onLockUnlocked(Lco/bird/android/app/manager/SmartlockManagerImpl;)V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->N0()V

    return-void
.end method

.method public static final synthetic access$onUnlockError(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->O0(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$parseLockMessage(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;[B)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->P0(Lco/bird/android/model/wire/WireSmartlock;[B)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$restartLastRideLockAvailabilityIfNeeded(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/disposables/c;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->a1()Lio/reactivex/disposables/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$saveConnection(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;Lke5;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->c1(Lco/bird/android/model/wire/WireSmartlock;Lke5;)V

    return-void
.end method

.method public static final synthetic access$scan(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->d1(Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sendPayload(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/String;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->j1(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sendTokenRequest(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->k1(Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setLockingRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->D:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setStateRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->C:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$updateUnlockErrorIfNecessary(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WirePhysicalLock;Lde5$a;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->r1(Lco/bird/android/model/wire/WirePhysicalLock;Lde5$a;)V

    return-void
.end method

.method public static synthetic b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->T0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final b1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->o1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->f1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final e1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final f1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final g1()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "scan subscription dispose"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final l0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final l1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final m0(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$lock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->Q0(Lco/bird/android/model/wire/WireSmartlock;)V

    return-void
.end method

.method public static synthetic n()V
    .locals 0

    invoke-static {}, Lco/bird/android/app/manager/SmartlockManagerImpl;->p1()V

    return-void
.end method

.method public static final n1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final o1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->H0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final p0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final p1()V
    .locals 0

    return-void
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->p0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final q1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->Z0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final r0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final s0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic t(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->S0(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final t0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final u0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->G0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final v0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;

    move-result-object p0

    return-object p0
.end method

.method public static final w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lna4;

    return-object p0
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->e1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static synthetic y(Lco/bird/android/app/manager/SmartlockManagerImpl;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->V0(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    return-void
.end method

.method public static synthetic z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->q1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A0(Ljava/lang/String;)[B
    .locals 1

    invoke-static {}, LEy;->a()LEy$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LEy$a;->a(Ljava/lang/String;)[B

    move-result-object p1

    const-string v0, "getDecoder().decode(this)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final B0()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lde5$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->c:Lde5;

    invoke-virtual {v0}, Lde5;->d()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->c:Lde5;

    invoke-virtual {v1}, Lde5;->c()Lde5$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final C0(Lco/bird/android/model/wire/WireSmartlock;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->h:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getEnableMultipleSmartlockKeys()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getTokenRequest()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getTokenRequest()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->E:LvE2;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getTokenRequests()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    rem-int v3, v0, v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->E:LvE2;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getId()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, p1, v0}, LvE2;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v2

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Using "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " as the next token to try in a token request to lock"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method public final D0()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->h:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getSmartlockConfig()Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/SmartlockRideConfig;->getEnableV2()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final E0(Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSmartlock;",
            ")",
            "Lio/reactivex/Observable<",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->n0(Lco/bird/android/model/wire/WireSmartlock;)Lke5;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->d:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    invoke-virtual {v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->b()Ljava/util/UUID;

    move-result-object v0

    invoke-interface {p1, v0}, Lke5;->d(Ljava/util/UUID;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lco/bird/android/app/manager/SmartlockManagerImpl$NotConnected;->b:Lco/bird/android/app/manager/SmartlockManagerImpl$NotConnected;

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "error(NotConnected)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final F0()Lio/reactivex/disposables/c;
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->j:LMc2;

    invoke-interface {v0}, LMc2;->b()Lio/reactivex/c;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$v;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$v;

    new-instance v2, LtI5;

    invoke-direct {v2, v1}, LtI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LuI5;

    invoke-direct {v1, p0}, LuI5;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    invoke-static {v1}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$x;

    invoke-direct {v1, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$x;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance v2, LvI5;

    invoke-direct {v2, v1}, LvI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$y;->b:Lco/bird/android/app/manager/SmartlockManagerImpl$y;

    new-instance v2, LwI5;

    invoke-direct {v2, v1}, LwI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->onErrorReturnItem(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun listenForRid\u2026D)\n      .subscribe()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v3, "UNBOUND"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final L0(LXl5;LTk5;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->u:La94;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final M0()V
    .locals 6

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onLockLocked called"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->s:Lma4;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->f:LEa;

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getKind()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "unknown"

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->y0()Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    iget-object v4, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->g:LYR4;

    invoke-interface {v4}, LYR4;->n0()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lco/bird/android/model/analytics/SmartlockLocked;

    invoke-direct {v5, v1, v2, v4, v3}, Lco/bird/android/model/analytics/SmartlockLocked;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;I)V

    invoke-interface {v0, v5}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    return-void
.end method

.method public final N0()V
    .locals 20

    move-object/from16 v0, p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLockUnlocked called"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->p:Lma4;

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v1, v2}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v2, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->g:LYR4;

    invoke-interface {v2, v1}, LYR4;->q1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v1

    iget-object v2, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->f:LEa;

    if-eqz v1, :cond_0

    const-string v3, "ride"

    goto :goto_0

    :cond_0
    const-string v3, "private_bird"

    :goto_0
    move-object v8, v3

    iget-object v3, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lco/bird/android/model/wire/WirePhysicalLock;->getId()Ljava/lang/String;

    move-result-object v3

    move-object v11, v3

    goto :goto_1

    :cond_1
    move-object v11, v4

    :goto_1
    iget-object v3, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/wire/WirePhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v3

    move-object v12, v3

    goto :goto_2

    :cond_2
    move-object v12, v4

    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v1

    move-object v13, v1

    goto :goto_3

    :cond_3
    move-object v13, v4

    :goto_3
    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getKind()Ljava/lang/String;

    move-result-object v1

    move-object v14, v1

    goto :goto_4

    :cond_4
    move-object v14, v4

    :goto_4
    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/constant/PhysicalLockPurpose;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v15, v1

    goto :goto_5

    :cond_5
    move-object v15, v4

    :goto_5
    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireSmartlock;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    :cond_6
    const-string v1, ""

    :cond_7
    move-object v10, v1

    new-instance v1, LRS3;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1807

    const/16 v19, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v19}, LRS3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_8
    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->f:LEa;

    iget-object v2, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lco/bird/android/model/wire/WirePhysicalLock;->getKind()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_a

    :cond_9
    const-string v2, "unknown"

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->y0()Ljava/lang/Long;

    move-result-object v3

    iget-object v4, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4

    iget-object v5, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->g:LYR4;

    invoke-interface {v5}, LYR4;->n0()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lco/bird/android/model/analytics/SmartlockUnlocked;

    invoke-direct {v6, v2, v3, v5, v4}, Lco/bird/android/model/analytics/SmartlockUnlocked;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;I)V

    invoke-interface {v1, v6}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    return-void
.end method

.method public final O0(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/Throwable;)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_f

    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_0

    instance-of v1, v10, Ljava/util/concurrent/TimeoutException;

    if-eqz v1, :cond_0

    goto/16 :goto_d

    :cond_0
    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->q:La94;

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v3, Loe6;

    move-object/from16 v11, p1

    invoke-direct {v3, v11, v10}, Loe6;-><init>(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v3}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    iget-object v12, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->f:LEa;

    new-instance v13, Lco/bird/android/model/analytics/SmartlockUnlockError;

    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    const-string v14, ""

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getKind()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    goto :goto_1

    :cond_2
    :goto_0
    move-object v2, v14

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->y0()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_2

    :cond_3
    const-wide/16 v3, -0x1

    :goto_2
    invoke-virtual/range {p0 .. p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->m1(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v5

    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->n:Ljava/util/Set;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    instance-of v1, v10, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    const/4 v15, 0x0

    if-eqz v1, :cond_4

    move-object v1, v10

    check-cast v1, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    invoke-virtual {v1}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v7, v1

    goto :goto_3

    :cond_4
    move-object v7, v15

    :goto_3
    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->g:LYR4;

    invoke-interface {v1}, LYR4;->n0()Ljava/lang/String;

    move-result-object v9

    move-object v1, v13

    move-object/from16 v8, p2

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/analytics/SmartlockUnlockError;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-interface {v12, v13}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v2, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->g:LYR4;

    invoke-interface {v2, v1}, LYR4;->q1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v1

    goto :goto_4

    :cond_5
    move-object v1, v15

    :goto_4
    invoke-virtual/range {p0 .. p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->m1(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "cancelled"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    iget-object v3, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->f:LEa;

    if-eqz v1, :cond_6

    const-string v4, "ride"

    goto :goto_5

    :cond_6
    const-string v4, "private_bird"

    :goto_5
    move-object/from16 v20, v4

    iget-object v4, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lco/bird/android/model/wire/WirePhysicalLock;->getId()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v23, v4

    goto :goto_6

    :cond_7
    move-object/from16 v23, v15

    :goto_6
    iget-object v4, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lco/bird/android/model/wire/WirePhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v24, v4

    goto :goto_7

    :cond_8
    move-object/from16 v24, v15

    :goto_7
    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v25, v1

    goto :goto_8

    :cond_9
    move-object/from16 v25, v15

    :goto_8
    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getKind()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v26, v1

    goto :goto_9

    :cond_a
    move-object/from16 v26, v15

    :goto_9
    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lco/bird/android/model/constant/PhysicalLockPurpose;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v27, v1

    goto :goto_a

    :cond_b
    move-object/from16 v27, v15

    :goto_a
    iget-object v1, v0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireSmartlock;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_c

    goto :goto_b

    :cond_c
    move-object/from16 v22, v1

    goto :goto_c

    :cond_d
    :goto_b
    move-object/from16 v22, v14

    :goto_c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " - "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    const-string v1, "network_failure"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    :cond_e
    move-object/from16 v29, v15

    new-instance v1, LRS3;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v30, 0x7

    const/16 v31, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v16 .. v31}, LRS3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_f
    :goto_d
    return-void
.end method

.method public final P0(Lco/bird/android/model/wire/WireSmartlock;[B)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSmartlock;",
            "[B)",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/NokelockResponse;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/api/request/NokelockMessage;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->z0([B)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lco/bird/api/request/NokelockMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->d:LhI5;

    invoke-interface {p1, v0}, LhI5;->e(Lco/bird/api/request/NokelockMessage;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final Q0(Lco/bird/android/model/wire/WireSmartlock;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->o:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getMacAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(J)Lio/reactivex/c;
    .locals 3

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "ignoring attempt to resetBluetooth since smartLockV2Enabled"

    invoke-static {p2, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "complete()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, Lco/bird/android/app/manager/SmartlockManagerImpl$A;

    invoke-direct {v0, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$A;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    invoke-static {v0}, Lnh5;->e(Lkotlin/jvm/functions/Function1;)Lio/reactivex/c;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$B;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$B;

    new-instance v2, LQI5;

    invoke-direct {v2, v1}, LQI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LRI5;

    invoke-direct {v1, p0}, LRI5;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    invoke-static {v1}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LSI5;

    invoke-direct {v1, p1, p2}, LSI5;-><init>(J)V

    invoke-static {v1}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LTI5;

    invoke-direct {v1, p0}, LTI5;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LUI5;

    invoke-direct {v1, p0, p1, p2}, LUI5;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;J)V

    invoke-static {v1}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    sget-object p2, Lco/bird/android/app/manager/SmartlockManagerImpl$E;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$E;

    new-instance v0, LVI5;

    invoke-direct {v0, p2}, LVI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun resetBlueto\u2026bluetooth adapter.\")}\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final a1()Lio/reactivex/disposables/c;
    .locals 11

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->i:Lgl;

    invoke-virtual {v0}, Lgl;->Z()Lgl$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->g:LYR4;

    invoke-interface {v2}, LYR4;->R()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-static {v2}, LhU4;->a(Lco/bird/android/buava/Optional;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lgl$b;->b()Lorg/joda/time/DateTime;

    move-result-object v2

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result v2

    if-ne v2, v4, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_3

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->l:La94;

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v10, LXl5;

    invoke-virtual {v0}, Lgl$b;->c()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v5

    sget-object v6, LUR4;->b:LUR4;

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, LXl5;-><init>(Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v10}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lgl$b;->b()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-static {v1}, LpT0;->h(Lorg/joda/time/DateTime;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0}, Lgl$b;->c()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WirePhysicalLock;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "restarted last ride lock availability for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " seconds with lock id "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v4, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v1, v2, v3}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "timer(secondsRemaining, TimeUnit.SECONDS)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v3, "UNBOUND"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/manager/SmartlockManagerImpl$F;

    invoke-direct {v2, p0, v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$F;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lgl$b;)V

    new-instance v0, LbJ5;

    invoke-direct {v0, v2}, LbJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method public b(LTk5;Lco/bird/android/model/wire/WirePhysicalLock;I)Lio/reactivex/c;
    .locals 11

    const-string v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->D0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "ignoring attempt to continueUnlockingWithForcedRetries since smartLockV2Enabled"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->O()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "never()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Starting attempt to continue unlocking for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " times, 10 seconds apart"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-wide/16 v2, 0x0

    int-to-long v4, p3

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0xa

    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static/range {v2 .. v10}, Lio/reactivex/Observable;->intervalRange(JJJJLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p3

    new-instance v0, Lco/bird/android/app/manager/SmartlockManagerImpl$u;

    invoke-direct {v0, p1, p0, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl$u;-><init>(LTk5;Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WirePhysicalLock;)V

    new-instance p1, LCI5;

    invoke-direct {p1, v0}, LCI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, p1}, Lio/reactivex/Observable;->switchMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun continueUnl\u2026rorComplete()\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Lco/bird/android/model/wire/WirePhysicalLock;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            "-",
            "Lde5$a;",
            "Lkotlin/Unit;",
            ">;)",
            "Lio/reactivex/F<",
            "LTk5;",
            ">;"
        }
    .end annotation

    const-string v0, "lock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBleReady"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBleNotReady"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "ignoring attempt to start scanning since smartLockV2Enabled"

    invoke-static {p2, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/F;->M()Lio/reactivex/F;

    move-result-object p1

    const-string p2, "never()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v4

    if-nez v4, :cond_1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " does not have a smartlock"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "error(IllegalArgumentExc\u2026s not have a smartlock\"))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->B0()Lio/reactivex/Observable;

    move-result-object v6

    new-instance v7, Lco/bird/android/app/manager/SmartlockManagerImpl$L;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p0

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/manager/SmartlockManagerImpl$L;-><init>(Lco/bird/android/model/wire/WirePhysicalLock;Lkotlin/jvm/functions/Function0;Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;Lkotlin/jvm/functions/Function2;)V

    new-instance p1, LDI5;

    invoke-direct {p1, v7}, LDI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v6, p1}, Lio/reactivex/Observable;->switchMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun startScanni\u2026      .firstOrError()\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final c1(Lco/bird/android/model/wire/WireSmartlock;Lke5;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->o:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getMacAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public declared-synchronized d()V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->D0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "ignoring attempt to stopUnlocking since smartLockV2Enabled"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v0, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "clearing out lock state for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->y:Lio/reactivex/disposables/c;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lio/reactivex/disposables/c;->e()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "Disposing lock disposable now"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final d1(Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/F;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSmartlock;",
            ")",
            "Lio/reactivex/F<",
            "LTk5;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trying to connect to lock "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->n:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->e:LMD;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LMD$a;->scanBleDevices$default(LMD;IZLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$G;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$G;

    new-instance v2, LpI5;

    invoke-direct {v2, v1}, LpI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$H;

    invoke-direct {v1, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$H;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance v2, LAI5;

    invoke-direct {v2, v1}, LAI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LLI5;

    invoke-direct {v1}, LLI5;-><init>()V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnDispose(Lio/reactivex/functions/a;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$I;

    invoke-direct {v1, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$I;-><init>(Lco/bird/android/model/wire/WireSmartlock;)V

    new-instance v2, LWI5;

    invoke-direct {v2, v1}, LWI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$J;

    invoke-direct {v1, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$J;-><init>(Lco/bird/android/model/wire/WireSmartlock;)V

    new-instance p1, LaJ5;

    invoke-direct {p1, v1}, LaJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "private fun scan(lock: W\u2026 ${lock.id}\")\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "LXl5;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->m:LZ84;

    return-object v0
.end method

.method public f()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->p:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "unlocksRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public declared-synchronized g(LXl5;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "rideLock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->D0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "ignoring attempt to startUnlocking since smartLockV2Enabled"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p1}, LXl5;->b()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "attempting to listen for requests to unlock lock id "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Lco/bird/android/model/wire/WirePhysicalLock;->isSame(Lco/bird/android/model/wire/WirePhysicalLock;)Z

    move-result v2

    if-ne v2, v3, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    if-eqz v2, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Lock "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " already unlocking"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v2

    if-nez v2, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not have a smartlock"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :try_start_3
    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->y:Lio/reactivex/disposables/c;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Lio/reactivex/disposables/c;->e()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    move v3, v1

    :goto_1
    if-eqz v3, :cond_5

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "lock disposable disposing for lock "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->y:Lio/reactivex/disposables/c;

    if-eqz v2, :cond_5

    invoke-interface {v2}, Lio/reactivex/disposables/c;->dispose()V

    :cond_5
    iput-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->x:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v2, :cond_6

    monitor-exit p0

    return-void

    :cond_6
    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->z:Ljava/lang/Long;

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->c:Lde5;

    invoke-virtual {v1}, Lde5;->c()Lde5$a;

    move-result-object v1

    const-string v2, "bleClient.state"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->r1(Lco/bird/android/model/wire/WirePhysicalLock;Lde5$a;)V

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$M;

    invoke-direct {v1, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$M;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance v2, Lco/bird/android/app/manager/SmartlockManagerImpl$N;

    invoke-direct {v2, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$N;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    invoke-virtual {p0, v0, v1, v2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->c(Lco/bird/android/model/wire/WirePhysicalLock;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/manager/SmartlockManagerImpl$O;

    invoke-direct {v2, p1, p0, v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$O;-><init>(LXl5;Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WirePhysicalLock;)V

    new-instance p1, LxI5;

    invoke-direct {p1, v2}, LxI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "@Synchronized\n  override\u2026 lock flow\")\n      })\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v1, "UNBOUND"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    new-instance v0, LyI5;

    invoke-direct {v0}, LyI5;-><init>()V

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$P;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$P;

    new-instance v2, LzI5;

    invoke-direct {v2, v1}, LzI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0, v2}, Lcom/uber/autodispose/CompletableSubscribeProxy;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->y:Lio/reactivex/disposables/c;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->u:La94;

    invoke-virtual {v0}, La94;->j()V

    return-void
.end method

.method public i()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Loe6;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->r:LZ84;

    return-object v0
.end method

.method public j(Lcom/uber/autodispose/ScopeProvider;)V
    .locals 3

    const-string v0, "scopeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "start unlocking for rides called now"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->D0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "ignoring attempt to start unlocking for rides since smartLockV2Enabled"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->G:Lio/reactivex/Observable;

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public final j1(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/String;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSmartlock;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->n0(Lco/bird/android/model/wire/WireSmartlock;)Lke5;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->c:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    invoke-virtual {v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->b()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p0, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->A0(Ljava/lang/String;)[B

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lke5;->c(Ljava/util/UUID;[B)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lco/bird/android/app/manager/SmartlockManagerImpl$NotConnected;->b:Lco/bird/android/app/manager/SmartlockManagerImpl$NotConnected;

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "error(NotConnected)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public k()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lkotlin/Pair<",
            "LXl5;",
            "LTk5;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->H:LZ84;

    return-object v0
.end method

.method public final k0(Lco/bird/android/model/wire/WireSmartlock;LTk5;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSmartlock;",
            "LTk5;",
            ")",
            "Lio/reactivex/Observable<",
            "Lke5;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, LTk5;->a()Lne5;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lne5;->a(Z)Lio/reactivex/Observable;

    move-result-object p2

    const-string v0, "scanResult.bleDevice.establishConnection(false)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->k:LDX;

    sget-object v1, Lbi3;->i:Lbi3;

    invoke-static {p2, v0, v1}, LTX;->l(Lio/reactivex/Observable;LDX;Lbi3;)Lio/reactivex/Observable;

    move-result-object p2

    const-wide/16 v0, 0x1f4

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, v2}, Lio/reactivex/Observable;->delaySubscription(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p2

    new-instance v0, Lco/bird/android/app/manager/SmartlockManagerImpl$k;

    invoke-direct {v0, p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$k;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    new-instance v1, LOI5;

    invoke-direct {v1, v0}, LOI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p2

    new-instance v0, LPI5;

    invoke-direct {v0, p0, p1}, LPI5;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->doOnDispose(Lio/reactivex/functions/a;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "private fun connect(lock\u2026oveConnection(lock) }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final k1(Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSmartlock;",
            ")",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->C0(Lco/bird/android/model/wire/WireSmartlock;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->A0(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    :cond_1
    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->n0(Lco/bird/android/model/wire/WireSmartlock;)Lke5;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->c:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    invoke-virtual {v1}, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lke5;->c(Ljava/util/UUID;[B)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_3

    sget-object p1, Lco/bird/android/app/manager/SmartlockManagerImpl$NotConnected;->b:Lco/bird/android/app/manager/SmartlockManagerImpl$NotConnected;

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "error(NotConnected)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    return-object p1
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v0

    return v0
.end method

.method public m(LTk5;Lco/bird/android/model/wire/WirePhysicalLock;)Lio/reactivex/c;
    .locals 5

    const-string v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->D0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "ignoring attempt to continueUnlocking since smartLockV2Enabled"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->O()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "never()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/wire/WirePhysicalLock;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LTk5;->a()Lne5;

    move-result-object v2

    invoke-interface {v2}, Lne5;->e()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "continuing unlock of lock id "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " for scan result with mac address "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " does not have a smartlock"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "error(IllegalArgumentExc\u2026s not have a smartlock\"))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    const-string v2, "attempting to ble connect now"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->k0(Lco/bird/android/model/wire/WireSmartlock;LTk5;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$l;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$l;

    new-instance v2, LEI5;

    invoke-direct {v2, v1}, LEI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$m;

    invoke-direct {v1, p0, v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$m;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    new-instance v2, LFI5;

    invoke-direct {v2, v1}, LFI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$n;

    invoke-direct {v1, v0, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$n;-><init>(Lco/bird/android/model/wire/WireSmartlock;Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance v2, LGI5;

    invoke-direct {v2, v1}, LGI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$o;

    invoke-direct {v1, p0, v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$o;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    new-instance v2, LHI5;

    invoke-direct {v2, v1}, LHI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$p;

    invoke-direct {v1, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$p;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance v2, LII5;

    invoke-direct {v2, v1}, LII5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v1, Lco/bird/android/app/manager/SmartlockManagerImpl$q;

    invoke-direct {v1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl$q;-><init>(Lco/bird/android/model/wire/WirePhysicalLock;)V

    new-instance p2, LJI5;

    invoke-direct {p2, v1}, LJI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/app/manager/SmartlockManagerImpl$r;

    invoke-direct {p2, p0, v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$r;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    new-instance v1, LKI5;

    invoke-direct {v1, p2}, LKI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    new-instance p2, Lco/bird/android/app/manager/SmartlockManagerImpl$s;

    invoke-direct {p2, p0, v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$s;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    new-instance v0, LMI5;

    invoke-direct {v0, p2}, LMI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    sget-object p2, Lco/bird/android/app/manager/SmartlockManagerImpl$h;->b:Lco/bird/android/app/manager/SmartlockManagerImpl$h;

    invoke-static {p2}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    new-instance p2, Lco/bird/android/app/manager/SmartlockManagerImpl$t;

    invoke-direct {p2, p0}, Lco/bird/android/app/manager/SmartlockManagerImpl$t;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance v0, LNI5;

    invoke-direct {v0, p2}, LNI5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/c;->V(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun continueUnl\u2026}\n          }\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final m1(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    instance-of v0, p2, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_1

    iget-object p2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->n:Ljava/util/Set;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getMacAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "connection_failure"

    goto :goto_2

    :cond_0
    const-string p1, "timed_out"

    goto :goto_2

    :cond_1
    instance-of p1, p2, Lco/bird/api/error/RetrofitException;

    if-eqz p1, :cond_2

    const-string p1, "network_failure"

    goto :goto_2

    :cond_2
    instance-of p1, p2, Lcom/polidea/rxandroidble2/exceptions/BleServiceNotFoundException;

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    move p1, v0

    goto :goto_0

    :cond_3
    instance-of p1, p2, Lcom/polidea/rxandroidble2/exceptions/BleCharacteristicNotFoundException;

    :goto_0
    if-eqz p1, :cond_4

    const-string p1, "invalid_peripheral"

    goto :goto_2

    :cond_4
    instance-of p1, p2, Lcom/polidea/rxandroidble2/exceptions/BleAdapterDisabledException;

    if-eqz p1, :cond_5

    const-string p1, "bluetooth_unavailable"

    goto :goto_2

    :cond_5
    instance-of p1, p2, Lcom/polidea/rxandroidble2/exceptions/BleAlreadyConnectedException;

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    instance-of v0, p2, Lcom/polidea/rxandroidble2/exceptions/BleConflictingNotificationAlreadySetException;

    :goto_1
    if-eqz v0, :cond_7

    const-string p1, "already_connected"

    goto :goto_2

    :cond_7
    instance-of p1, p2, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;

    if-eqz p1, :cond_8

    const-string p1, "cancelled"

    goto :goto_2

    :cond_8
    instance-of p1, p2, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    if-eqz p1, :cond_9

    const-string p1, "scan_failure"

    goto :goto_2

    :cond_9
    instance-of p1, p2, Lcom/polidea/rxandroidble2/exceptions/BleGattCharacteristicException;

    if-eqz p1, :cond_a

    const-string p1, "request_write_failure"

    goto :goto_2

    :cond_a
    instance-of p1, p2, Lcom/polidea/rxandroidble2/exceptions/BleGattException;

    if-eqz p1, :cond_b

    const-string p1, "other_ble_gatt_exception"

    goto :goto_2

    :cond_b
    instance-of p1, p2, Lcom/polidea/rxandroidble2/exceptions/BleException;

    if-eqz p1, :cond_c

    const-string p1, "other_ble_exception"

    goto :goto_2

    :cond_c
    const-string p1, "other"

    :goto_2
    return-object p1
.end method

.method public final n0(Lco/bird/android/model/wire/WireSmartlock;)Lke5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->o:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSmartlock;->getMacAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lke5;

    return-object p1
.end method

.method public final r1(Lco/bird/android/model/wire/WirePhysicalLock;Lde5$a;)V
    .locals 4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/constant/PhysicalLockPurpose;->LOCK_TO:Lco/bird/android/model/constant/PhysicalLockPurpose;

    if-ne p1, v1, :cond_5

    sget-object p1, Lco/bird/android/app/manager/SmartlockManagerImpl$j;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object p2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->q:La94;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v2, Loe6;

    new-instance v3, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    invoke-direct {v3, p1}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;-><init>(I)V

    invoke-direct {v2, v0, v3}, Loe6;-><init>(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {p2, p1}, La94;->accept(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public final y0()Ljava/lang/Long;
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl;->z:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final z0([B)Ljava/lang/String;
    .locals 1

    invoke-static {}, LEy;->b()LEy$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LEy$b;->e([B)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getEncoder().encodeToString(this)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
