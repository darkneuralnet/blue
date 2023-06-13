.class public final LSS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxS;
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSS$a;,
        LSS$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d2\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001=B\u00d9\u0001\u0008\u0007\u0012\u0006\u0010Z\u001a\u00020X\u0012\u0006\u0010^\u001a\u00020[\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020c\u0012\u0006\u0010j\u001a\u00020g\u0012\u0006\u0010n\u001a\u00020k\u0012\u0006\u0010r\u001a\u00020o\u0012\u0006\u0010v\u001a\u00020s\u0012\u0006\u0010z\u001a\u00020w\u0012\u0006\u0010~\u001a\u00020{\u0012\u0007\u0010\u0082\u0001\u001a\u00020\u007f\u0012\u0008\u0010\u0086\u0001\u001a\u00030\u0083\u0001\u0012\u0008\u0010\u008a\u0001\u001a\u00030\u0087\u0001\u0012\u0008\u0010\u008e\u0001\u001a\u00030\u008b\u0001\u0012\u0008\u0010\u0092\u0001\u001a\u00030\u008f\u0001\u0012\u0011\u0008\u0001\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u0001\u0012\n\u0008\u0001\u0010\u009a\u0001\u001a\u00030\u0097\u0001\u0012\n\u0008\u0001\u0010\u009e\u0001\u001a\u00030\u009b\u0001\u0012\n\u0008\u0001\u0010\u00a2\u0001\u001a\u00030\u009f\u0001\u0012\t\u0008\u0003\u0010\u00a4\u0001\u001a\u00020\u0005\u0012\t\u0008\u0001\u0010\u00a6\u0001\u001a\u00020\u0005\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001J \u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u000c\u0010\u000c\u001a\u00020\u0005*\u00020\u0003H\u0002J.\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J-\u0010\u0019\u001a\u00020\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0019\u0008\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015\u00a2\u0006\u0002\u0008\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001c\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0012\u0010\"\u001a\u00020\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u0008\u0010#\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u001a\u0010(\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020&2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u001a\u0010+\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020&2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u0002J$\u0010,\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020&2\u0008\u0010*\u001a\u0004\u0018\u00010)2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u000c\u0010-\u001a\u00020\n*\u00020\u0013H\u0002J\u0008\u0010.\u001a\u00020\nH\u0002J\u0008\u0010/\u001a\u00020\nH\u0002J0\u00101\u001a\u00020\n2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0016\u00104\u001a\u0008\u0012\u0004\u0012\u000203022\u0006\u0010$\u001a\u00020\u0005H\u0002J \u00105\u001a\u00020\n2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u0008\u00106\u001a\u00020\nH\u0002J6\u0010<\u001a\u00020\n2\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00032\u0008\u00109\u001a\u0004\u0018\u00010\u00032\u0008\u0010:\u001a\u0004\u0018\u00010\u00032\u0008\u0010;\u001a\u0004\u0018\u00010\u0003H\u0002J\u0008\u0010=\u001a\u00020\nH\u0016J\u0008\u0010>\u001a\u00020\nH\u0016J\u0008\u0010?\u001a\u00020\nH\u0016J\u0008\u0010@\u001a\u00020\nH\u0016J\u0008\u0010A\u001a\u00020\nH\u0016J\u0010\u0010D\u001a\u00020\n2\u0006\u0010C\u001a\u00020BH\u0016J\u0012\u0010G\u001a\u00020\n2\u0008\u0010F\u001a\u0004\u0018\u00010EH\u0016J\u001a\u0010L\u001a\u00020\n2\u0008\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010K\u001a\u00020JH\u0016J\"\u0010P\u001a\u00020\n2\u0006\u0010M\u001a\u00020J2\u0006\u0010N\u001a\u00020J2\u0008\u0010O\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010Q\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010T\u001a\u00020\n2\u000c\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u001f0RH\u0007J\u0010\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0007R\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008d\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008x\u0010yR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u001e\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008A\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u00a2\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u0016\u0010\u00a4\u0001\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u00a3\u0001\u0010+R\u0016\u0010\u00a6\u0001\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u00a5\u0001\u0010+R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001\u001a\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001\"\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u0010+R\'\u0010\u00b2\u0001\u001a\u0012\u0012\r\u0012\u000b \u00af\u0001*\u0004\u0018\u00010\n0\n0\u00ae\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001R \u0010\u00b5\u0001\u001a\u000b \u00af\u0001*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001R(\u0010\u00b9\u0001\u001a\u0014\u0012\u000f\u0012\r \u00af\u0001*\u0005\u0018\u00010\u00b7\u00010\u00b7\u00010\u00b6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008/\u0010\u00b8\u0001R(\u0010\u00bb\u0001\u001a\u0014\u0012\u000f\u0012\r \u00af\u0001*\u0005\u0018\u00010\u00ba\u00010\u00ba\u00010\u00b6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0019\u0010\u00b8\u0001R\u001b\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001\u00a8\u0006\u00c1\u0001"
    }
    d2 = {
        "LSS;",
        "LxS;",
        "Landroid/hardware/SensorEventListener;",
        "",
        "raw",
        "",
        "isCameraScan",
        "validateInput",
        "h0",
        "text",
        "",
        "L",
        "M",
        "code",
        "Lco/bird/android/model/constant/BirdAction;",
        "action",
        "c0",
        "merchantQRCode",
        "i0",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lkotlin/Function1;",
        "Landroid/content/Intent;",
        "Lkotlin/ExtensionFunctionType;",
        "supplementIntent",
        "B",
        "LNy;",
        "alert",
        "l0",
        "secondaryMessage",
        "m0",
        "Lco/bird/android/model/BirdScan;",
        "scan",
        "a0",
        "q0",
        "b0",
        "enabled",
        "K",
        "Lco/bird/android/model/constant/MapMode;",
        "mode",
        "E",
        "Lco/bird/android/model/constant/ScanStatus;",
        "scanStatus",
        "Z",
        "D",
        "s0",
        "O",
        "A",
        "birdId",
        "F",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/DialogResponse;",
        "o0",
        "x",
        "p0",
        "success",
        "rawData",
        "merchantId",
        "siteId",
        "placardId",
        "r0",
        "a",
        "onResume",
        "onPause",
        "onBackPressed",
        "q",
        "Lem5;",
        "rawResult",
        "b",
        "Landroid/hardware/SensorEvent;",
        "event",
        "onSensorChanged",
        "Landroid/hardware/Sensor;",
        "sensor",
        "",
        "accuracy",
        "onAccuracyChanged",
        "requestCode",
        "resultCode",
        "data",
        "onActivityResult",
        "N",
        "LHM4;",
        "scanResponse",
        "Y",
        "",
        "throwable",
        "X",
        "Lgl;",
        "Lgl;",
        "preference",
        "LEg1;",
        "c",
        "LEg1;",
        "eventBus",
        "LEa;",
        "d",
        "LEa;",
        "analyticsManager",
        "LaM;",
        "e",
        "LaM;",
        "birdManager",
        "LiO;",
        "f",
        "LiO;",
        "birdPayManager",
        "LQh2;",
        "g",
        "LQh2;",
        "jobProducer",
        "LYR4;",
        "h",
        "LYR4;",
        "rideManager",
        "Lde5;",
        "i",
        "Lde5;",
        "rxBleClient",
        "LTq4;",
        "j",
        "LTq4;",
        "reactiveConfig",
        "Ldr4;",
        "k",
        "Ldr4;",
        "locationManager",
        "LVq4;",
        "l",
        "LVq4;",
        "eventStream",
        "Landroid/hardware/SensorManager;",
        "m",
        "Landroid/hardware/SensorManager;",
        "sensorManager",
        "Landroid/os/Handler;",
        "n",
        "Landroid/os/Handler;",
        "handler",
        "Lrd5;",
        "o",
        "Lrd5;",
        "bluetoothManagerRxBle",
        "LpJ;",
        "p",
        "LpJ;",
        "bluetoothManager",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "scopeProvider",
        "Lco/bird/android/model/extra/ScanBarcodeExtra;",
        "r",
        "Lco/bird/android/model/extra/ScanBarcodeExtra;",
        "extras",
        "LZS;",
        "s",
        "LZS;",
        "ui",
        "Le13;",
        "t",
        "Le13;",
        "navigator",
        "u",
        "returnResult",
        "v",
        "shouldValidateInput",
        "w",
        "Lco/bird/android/model/constant/BirdAction;",
        "getAction",
        "()Lco/bird/android/model/constant/BirdAction;",
        "setAction",
        "(Lco/bird/android/model/constant/BirdAction;)V",
        "shouldEnableScanner",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "y",
        "Lio/reactivex/subjects/d;",
        "bluetoothCheckSubject",
        "z",
        "Landroid/hardware/Sensor;",
        "lightSensor",
        "LAG;",
        "",
        "LAG;",
        "lightSensorReading",
        "Lak5;",
        "scanEntryMode",
        "C",
        "Lco/bird/android/model/wire/WireBird;",
        "limitBird",
        "<init>",
        "(Lgl;LEg1;LEa;LaM;LiO;LQh2;LYR4;Lde5;LTq4;Ldr4;LVq4;Landroid/hardware/SensorManager;Landroid/os/Handler;Lrd5;LpJ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/ScanBarcodeExtra;LZS;Le13;ZZ)V",
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
        "SMAP\nBirdScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdScanPresenter.kt\nco/bird/android/app/feature/scanner/BirdScanPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,806:1\n180#2:807\n180#2:808\n180#2:809\n180#2:810\n180#2:811\n199#2:813\n180#2:814\n199#2:815\n199#2:816\n199#2:817\n180#2:818\n199#2:819\n237#2:820\n199#2:821\n199#2:822\n1#3:812\n*S KotlinDebug\n*F\n+ 1 BirdScanPresenter.kt\nco/bird/android/app/feature/scanner/BirdScanPresenterImpl\n*L\n161#1:807\n177#1:808\n194#1:809\n202#1:810\n221#1:811\n299#1:813\n390#1:814\n398#1:815\n460#1:816\n467#1:817\n628#1:818\n642#1:819\n718#1:820\n734#1:821\n747#1:822\n*E\n"
    }
.end annotation


# static fields
.field public static final D:LSS$a;

.field public static final E:I


# instance fields
.field public final A:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final B:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Lak5;",
            ">;"
        }
    .end annotation
.end field

.field public C:Lco/bird/android/model/wire/WireBird;

.field public final b:Lgl;

.field public final c:LEg1;

.field public final d:LEa;

.field public final e:LaM;

.field public final f:LiO;

.field public final g:LQh2;

.field public final h:LYR4;

.field public final i:Lde5;

.field public final j:LTq4;

.field public final k:Ldr4;

.field public final l:LVq4;

.field public final m:Landroid/hardware/SensorManager;

.field public final n:Landroid/os/Handler;

.field public final o:Lrd5;

.field public final p:LpJ;

.field public final q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Lco/bird/android/model/extra/ScanBarcodeExtra;

.field public final s:LZS;

.field public final t:Le13;

.field public final u:Z

.field public final v:Z

.field public w:Lco/bird/android/model/constant/BirdAction;

.field public x:Z

.field public final y:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final z:Landroid/hardware/Sensor;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LSS$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSS$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSS;->D:LSS$a;

    const/16 v0, 0x8

    sput v0, LSS;->E:I

    return-void
.end method

.method public constructor <init>(Lgl;LEg1;LEa;LaM;LiO;LQh2;LYR4;Lde5;LTq4;Ldr4;LVq4;Landroid/hardware/SensorManager;Landroid/os/Handler;Lrd5;LpJ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/ScanBarcodeExtra;LZS;Le13;ZZ)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgl;",
            "LEg1;",
            "LEa;",
            "LaM;",
            "LiO;",
            "LQh2;",
            "LYR4;",
            "Lde5;",
            "LTq4;",
            "Ldr4;",
            "LVq4;",
            "Landroid/hardware/SensorManager;",
            "Landroid/os/Handler;",
            "Lrd5;",
            "LpJ;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/model/extra/ScanBarcodeExtra;",
            "LZS;",
            "Le13;",
            "ZZ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v0, p16

    const-string v0, "preference"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventBus"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdManager"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdPayManager"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jobProducer"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideManager"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBleClient"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventStream"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sensorManager"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManagerRxBle"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p16

    iput-object v1, v0, LSS;->b:Lgl;

    iput-object v2, v0, LSS;->c:LEg1;

    iput-object v3, v0, LSS;->d:LEa;

    iput-object v4, v0, LSS;->e:LaM;

    iput-object v5, v0, LSS;->f:LiO;

    iput-object v6, v0, LSS;->g:LQh2;

    iput-object v7, v0, LSS;->h:LYR4;

    iput-object v8, v0, LSS;->i:Lde5;

    iput-object v9, v0, LSS;->j:LTq4;

    iput-object v10, v0, LSS;->k:Ldr4;

    iput-object v11, v0, LSS;->l:LVq4;

    iput-object v12, v0, LSS;->m:Landroid/hardware/SensorManager;

    iput-object v13, v0, LSS;->n:Landroid/os/Handler;

    iput-object v14, v0, LSS;->o:Lrd5;

    move-object/from16 v1, p15

    iput-object v1, v0, LSS;->p:LpJ;

    iput-object v15, v0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-object/from16 v1, p17

    move-object/from16 v2, p18

    iput-object v1, v0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    iput-object v2, v0, LSS;->s:LZS;

    move-object/from16 v1, p19

    iput-object v1, v0, LSS;->t:Le13;

    move/from16 v1, p20

    iput-boolean v1, v0, LSS;->u:Z

    move/from16 v1, p21

    iput-boolean v1, v0, LSS;->v:Z

    const/4 v1, 0x1

    iput-boolean v1, v0, LSS;->x:Z

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v1

    const-string v2, "create<Unit>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LSS;->y:Lio/reactivex/subjects/d;

    const/4 v1, 0x5

    invoke-virtual {v12, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    iput-object v1, v0, LSS;->z:Landroid/hardware/Sensor;

    invoke-static {}, LAG;->g()LAG;

    move-result-object v1

    const-string v2, "create<Float>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LSS;->A:LAG;

    sget-object v1, Lak5;->b:Lak5;

    invoke-static {v1}, LAG;->h(Ljava/lang/Object;)LAG;

    move-result-object v1

    const-string v2, "createDefault<ScanEntryMode>(ScanEntryMode.QR)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LSS;->B:LAG;

    return-void
.end method

.method public synthetic constructor <init>(Lgl;LEg1;LEa;LaM;LiO;LQh2;LYR4;Lde5;LTq4;Ldr4;LVq4;Landroid/hardware/SensorManager;Landroid/os/Handler;Lrd5;LpJ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/ScanBarcodeExtra;LZS;Le13;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    const/high16 v0, 0x80000

    and-int v0, p22, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move/from16 v21, v0

    goto :goto_0

    :cond_0
    move/from16 v21, p20

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move/from16 v22, p21

    invoke-direct/range {v1 .. v22}, LSS;-><init>(Lgl;LEg1;LEa;LaM;LiO;LQh2;LYR4;Lde5;LTq4;Ldr4;LVq4;Landroid/hardware/SensorManager;Landroid/os/Handler;Lrd5;LpJ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/ScanBarcodeExtra;LZS;Le13;ZZ)V

    return-void
.end method

.method public static synthetic C(LSS;Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, LSS$e;->g:LSS$e;

    :cond_0
    invoke-virtual {p0, p1, p2}, LSS;->B(Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final I(ZLSS;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    iget-object p0, p1, LSS;->s:LZS;

    sget p1, Lnl4;->sleep_bird_action_success_text:I

    sget-object v0, Lf56;->d:Lf56;

    invoke-interface {p0, p1, v0}, Lh56;->topToast(ILf56;)V

    goto :goto_0

    :cond_0
    iget-object p0, p1, LSS;->s:LZS;

    sget p1, Lnl4;->wake_bird_action_success_text:I

    sget-object v0, Lf56;->d:Lf56;

    invoke-interface {p0, p1, v0}, Lh56;->topToast(ILf56;)V

    :goto_0
    return-void
.end method

.method public static final J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$enableScanner(LSS;Z)V
    .locals 0

    invoke-virtual {p0, p1}, LSS;->K(Z)V

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(LSS;)LEa;
    .locals 0

    iget-object p0, p0, LSS;->d:LEa;

    return-object p0
.end method

.method public static final synthetic access$getBirdManager$p(LSS;)LaM;
    .locals 0

    iget-object p0, p0, LSS;->e:LaM;

    return-object p0
.end method

.method public static final synthetic access$getBluetoothManagerRxBle$p(LSS;)Lrd5;
    .locals 0

    iget-object p0, p0, LSS;->o:Lrd5;

    return-object p0
.end method

.method public static final synthetic access$getEventBus$p(LSS;)LEg1;
    .locals 0

    iget-object p0, p0, LSS;->c:LEg1;

    return-object p0
.end method

.method public static final synthetic access$getHandler$p(LSS;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, LSS;->n:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getLightSensorReading$p(LSS;)LAG;
    .locals 0

    iget-object p0, p0, LSS;->A:LAG;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(LSS;)Le13;
    .locals 0

    iget-object p0, p0, LSS;->t:Le13;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(LSS;)Lgl;
    .locals 0

    iget-object p0, p0, LSS;->b:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(LSS;)LTq4;
    .locals 0

    iget-object p0, p0, LSS;->j:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getScanEntryMode$p(LSS;)LAG;
    .locals 0

    iget-object p0, p0, LSS;->B:LAG;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(LSS;)LZS;
    .locals 0

    iget-object p0, p0, LSS;->s:LZS;

    return-object p0
.end method

.method public static final synthetic access$handleCodeEntered(LSS;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, LSS;->L(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$postBirdScannedForCodeEvent(LSS;Lco/bird/android/model/BirdScan;)V
    .locals 0

    invoke-virtual {p0, p1}, LSS;->a0(Lco/bird/android/model/BirdScan;)V

    return-void
.end method

.method public static final synthetic access$trackScan(LSS;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, LSS;->r0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LSS;->H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LSS;->d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic k(ZLSS;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->I(ZLSS;)V

    return-void
.end method

.method public static final k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n0(LSS;LNy;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LSS;->m0(LNy;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LSS;->k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 2

    iget-object v0, p0, LSS;->y:Lio/reactivex/subjects/d;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public final B(Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Intent;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LSS;->t:Le13;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "bird"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 p1, -0x1

    invoke-interface {v0, p1, v1}, Le13;->C1(ILandroid/content/Intent;)V

    return-void
.end method

.method public final D(Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanStatus;Lco/bird/android/model/constant/BirdAction;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-ne p1, v0, :cond_0

    sget-object p1, Lco/bird/android/model/constant/ScanStatus;->INVALID_CODE:Lco/bird/android/model/constant/ScanStatus;

    if-eq p2, p1, :cond_0

    sget-object p1, Lco/bird/android/model/constant/BirdAction;->GET_CODE:Lco/bird/android/model/constant/BirdAction;

    if-ne p3, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final E(Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    if-eqz p2, :cond_0

    invoke-static {p2}, LYS;->a(Lco/bird/android/model/wire/WireBird;)Z

    move-result p2

    if-ne p2, p1, :cond_0

    move p2, p1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    if-eqz p2, :cond_1

    move v0, p1

    :cond_1
    return v0
.end method

.method public final F(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/MapMode;Z)V
    .locals 3

    sget-object v0, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-eq p3, v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    iget-object p2, p0, LSS;->e:LaM;

    invoke-interface {p2, p1}, LaM;->M0(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p2

    :cond_2
    new-instance p1, LSS$g;

    invoke-direct {p1, p4, p0}, LSS$g;-><init>(ZLSS;)V

    new-instance p3, LDS;

    invoke-direct {p3, p1}, LDS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p3}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "private fun enableDeepSl\u2026r)\n      .subscribe()\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, LSS;->s:LZS;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, p3, v2, v0, v1}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    new-instance p3, LES;

    invoke-direct {p3, p4, p0}, LES;-><init>(ZLSS;)V

    invoke-virtual {p1, p3}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    new-instance p3, LSS$h;

    invoke-direct {p3, p4, p0}, LSS$h;-><init>(ZLSS;)V

    new-instance p4, LFS;

    invoke-direct {p4, p3}, LFS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p4}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void

    :cond_3
    :goto_0
    invoke-virtual {p0, p4}, LSS;->o0(Z)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "showDeepSleepError(enabl\u2026dSchedulers.mainThread())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance p2, LSS$f;

    invoke-direct {p2, p0}, LSS$f;-><init>(LSS;)V

    new-instance p3, LCS;

    invoke-direct {p3, p2}, LCS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final K(Z)V
    .locals 2

    iput-boolean p1, p0, LSS;->x:Z

    if-eqz p1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LSS;->s:LZS;

    invoke-interface {v1, v0}, Lhm5;->l5(Lfm5;)V

    if-eqz p1, :cond_1

    iget-object p1, p0, LSS;->s:LZS;

    invoke-interface {p1}, Lhm5;->n1()V

    :cond_1
    return-void
.end method

.method public final L(Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, LSS;->j:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    const/4 v1, 0x0

    iget-boolean v2, p0, LSS;->v:Z

    invoke-virtual {p0, p1, v1, v2}, LSS;->h0(Ljava/lang/String;ZZ)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object v1, p0, LSS;->s:LZS;

    new-instance v2, Ljk5;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMinBirdCodeLength()I

    move-result p1

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result v0

    invoke-direct {v2, p1, v0}, Ljk5;-><init>(II)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x7e

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final M(Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, LSS;->j:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMinBirdCodeLength()I

    move-result v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v2, 0x0

    if-gt v1, p1, :cond_0

    if-gt p1, v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public N(Lco/bird/android/model/wire/WireBird;)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LSS;->C:Lco/bird/android/model/wire/WireBird;

    return-void
.end method

.method public final O()V
    .locals 3

    iget-object v0, p0, LSS;->y:Lio/reactivex/subjects/d;

    iget-object v1, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LSS$i;

    invoke-direct {v1, p0}, LSS$i;-><init>(LSS;)V

    new-instance v2, LGS;

    invoke-direct {v2, v1}, LGS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final X(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LSS;->s:LZS;

    invoke-interface {p1}, LaM5;->errorGeneric()V

    invoke-virtual {p0}, LSS;->b0()V

    return-void
.end method

.method public final Y(LHM4;)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "scanResponse"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/BirdScan;

    if-eqz v1, :cond_1b

    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    iget-object v4, v0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v4}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getMode()Lco/bird/android/model/constant/MapMode;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-ne v4, v5, :cond_5

    invoke-virtual {v0, v3}, LSS;->q0(Lco/bird/android/model/wire/WireBird;)V

    iget-object v4, v0, LSS;->j:LTq4;

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v4

    iget-object v5, v0, LSS;->d:LEa;

    new-instance v14, LCa5;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getBirdCode()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v11, v7

    :goto_1
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    move-object v12, v7

    goto :goto_2

    :cond_2
    const/4 v12, 0x0

    :goto_2
    iget-object v7, v0, LSS;->j:LTq4;

    invoke-virtual {v7}, LTq4;->f8()LZ84;

    move-result-object v7

    invoke-virtual {v7}, LZ84;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getMinimumRidePrice()J

    move-result-wide v15

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getMinutePrice()J

    move-result-wide v17

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getIncludedMinutes()I

    move-result v7

    move-object/from16 v20, v11

    int-to-long v10, v7

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v21, v7

    goto :goto_3

    :cond_3
    const/16 v21, 0x0

    :goto_3
    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getAdditionalFees()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;->getApplyTax()Z

    move-result v22

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getBasePrice()J

    move-result-wide v23

    iget-object v4, v0, LSS;->b:Lgl;

    invoke-virtual {v4}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v4

    invoke-static {v4}, Lco/bird/android/model/UserKt;->isInRegistration(Lco/bird/android/model/User;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-object v7, v0, LSS;->B:LAG;

    invoke-virtual {v7}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lak5;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v25, v7

    goto :goto_4

    :cond_4
    const/16 v25, 0x0

    :goto_4
    const/16 v26, 0x0

    const/16 v27, 0x4007

    const/16 v28, 0x0

    move-object v7, v14

    move-wide/from16 v29, v10

    const/4 v10, 0x0

    move-object/from16 v11, v20

    move-object v6, v14

    move-wide v14, v15

    move-wide/from16 v16, v17

    move-wide/from16 v18, v29

    move-object/from16 v20, v21

    move/from16 v21, v22

    move-wide/from16 v22, v23

    move-object/from16 v24, v4

    invoke-direct/range {v7 .. v28}, LCa5;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;ZJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5, v6}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_5
    iget-object v4, v0, LSS;->C:Lco/bird/android/model/wire/WireBird;

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_9

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    if-nez v3, :cond_6

    invoke-virtual/range {p0 .. p0}, LSS;->b0()V

    iget-object v8, v0, LSS;->s:LZS;

    sget-object v9, LtN5;->d:LtN5;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, LH31$a;->dialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v3

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v3

    const-string v4, "ui.dialog(SomethingWentW\u2026dSchedulers.mainThread())"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {v3}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    move-result-object v6

    goto/16 :goto_a

    :cond_6
    if-eqz v4, :cond_7

    invoke-static {v4, v3}, LYS;->access$sameAs(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WireBird;)Z

    move-result v4

    if-ne v4, v7, :cond_7

    move v5, v7

    :cond_7
    if-nez v5, :cond_8

    invoke-virtual/range {p0 .. p0}, LSS;->b0()V

    iget-object v7, v0, LSS;->s:LZS;

    sget-object v8, LoH6;->d:LoH6;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, LH31$a;->dialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v3

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v3

    const-string v4, "ui.dialog(WrongBirdScann\u2026dSchedulers.mainThread())"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {v3}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    move-result-object v6

    goto/16 :goto_a

    :cond_8
    const/4 v1, 0x0

    invoke-static {v0, v3, v1, v6, v1}, LSS;->C(LSS;Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :cond_9
    iget-boolean v4, v0, LSS;->u:Z

    if-eqz v4, :cond_a

    if-eqz v3, :cond_a

    new-array v4, v6, [Lco/bird/android/model/constant/ScanStatus;

    sget-object v8, Lco/bird/android/model/constant/ScanStatus;->QR_DETACHED:Lco/bird/android/model/constant/ScanStatus;

    aput-object v8, v4, v5

    sget-object v8, Lco/bird/android/model/constant/ScanStatus;->INVALID_CODE:Lco/bird/android/model/constant/ScanStatus;

    aput-object v8, v4, v7

    invoke-static {v4}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v6, v4}, LSS;->C(LSS;Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :cond_a
    iget-object v4, v0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v4}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getMode()Lco/bird/android/model/constant/MapMode;

    move-result-object v4

    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v8

    invoke-virtual {v0, v4, v8}, LSS;->Z(Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanStatus;)Z

    move-result v4

    if-eqz v4, :cond_14

    iget-object v4, v0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v4}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getAction()Lco/bird/android/model/constant/BirdAction;

    move-result-object v4

    if-nez v4, :cond_b

    const/4 v4, -0x1

    goto :goto_5

    :cond_b
    sget-object v8, LSS$b;->$EnumSwitchMapping$1:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v8, v4

    :goto_5
    if-eq v4, v7, :cond_13

    if-eq v4, v6, :cond_12

    const/4 v6, 0x3

    if-eq v4, v6, :cond_11

    const/4 v6, 0x4

    if-eq v4, v6, :cond_10

    if-eqz v3, :cond_e

    iget-object v1, v0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v1}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getDamageStatusUpdate()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, v0, LSS;->l:LVq4;

    invoke-interface {v1, v3}, LVq4;->a(Lco/bird/android/model/wire/WireBird;)V

    iget-object v1, v0, LSS;->t:Le13;

    invoke-interface {v1}, Le13;->e3()V

    goto :goto_6

    :cond_c
    iget-object v1, v0, LSS;->b:Lgl;

    invoke-virtual {v1}, Lgl;->K()Lco/bird/android/model/Contractor;

    move-result-object v1

    if-eqz v1, :cond_d

    iget-object v4, v0, LSS;->j:LTq4;

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1, v4}, Lco/bird/android/model/Contractor;->isHourly(Lco/bird/android/model/wire/configs/Config;)Z

    move-result v5

    :cond_d
    iget-object v1, v0, LSS;->s:LZS;

    invoke-interface {v1, v3, v5}, Lhm5;->ec(Lco/bird/android/model/wire/WireBird;Z)V

    :goto_6
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_7

    :cond_e
    const/4 v6, 0x0

    :goto_7
    if-nez v6, :cond_f

    iget-object v1, v0, LSS;->s:LZS;

    invoke-interface {v1}, Lhm5;->u5()V

    :cond_f
    invoke-virtual {v0, v7}, LSS;->K(Z)V

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :cond_10
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getBirdId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_17

    iget-object v3, v0, LSS;->t:Le13;

    invoke-interface {v3, v1}, Le13;->P1(Ljava/lang/String;)V

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :cond_11
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getBirdId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, LSS;->x(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;)V

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :cond_12
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getBirdId()Ljava/lang/String;

    move-result-object v1

    iget-object v4, v0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v4}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getMode()Lco/bird/android/model/constant/MapMode;

    move-result-object v4

    invoke-virtual {v0, v1, v3, v4, v7}, LSS;->F(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/MapMode;Z)V

    invoke-virtual {v0, v7}, LSS;->K(Z)V

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :cond_13
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getBirdId()Ljava/lang/String;

    move-result-object v1

    iget-object v4, v0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v4}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getMode()Lco/bird/android/model/constant/MapMode;

    move-result-object v4

    invoke-virtual {v0, v1, v3, v4, v5}, LSS;->F(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/MapMode;Z)V

    invoke-virtual {v0, v7}, LSS;->K(Z)V

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_a

    :cond_14
    iget-object v4, v0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v4}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getMode()Lco/bird/android/model/constant/MapMode;

    move-result-object v4

    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v5

    iget-object v7, v0, LSS;->w:Lco/bird/android/model/constant/BirdAction;

    invoke-virtual {v0, v4, v5, v7}, LSS;->D(Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanStatus;Lco/bird/android/model/constant/BirdAction;)Z

    move-result v4

    if-eqz v4, :cond_15

    iget-object v1, v0, LSS;->t:Le13;

    invoke-interface {v1}, Le13;->e3()V

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_a

    :cond_15
    iget-object v4, v0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v4}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getMode()Lco/bird/android/model/constant/MapMode;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, LSS;->E(Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/wire/WireBird;)Z

    move-result v4

    if-eqz v4, :cond_18

    if-eqz v3, :cond_17

    invoke-static {v3}, Lco/bird/android/model/wire/WireBirdKt;->isAsleep(Lco/bird/android/model/wire/WireBird;)Z

    move-result v1

    if-eqz v1, :cond_16

    iget-object v1, v0, LSS;->t:Le13;

    invoke-interface {v1}, Le13;->e3()V

    invoke-virtual {v0, v3}, LSS;->s0(Lco/bird/android/model/wire/WireBird;)V

    goto :goto_8

    :cond_16
    iget-object v1, v0, LSS;->t:Le13;

    invoke-interface {v1}, Le13;->e3()V

    :goto_8
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_a

    :cond_17
    const/4 v6, 0x0

    goto :goto_a

    :cond_18
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getMode()Lco/bird/android/model/constant/ScanMode;

    move-result-object v4

    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v1

    iget-object v5, v0, LSS;->j:LTq4;

    invoke-static {v4, v1, v5}, LOy;->a(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanStatus;LTq4;)LNy;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-virtual {v0, v1}, LSS;->l0(LNy;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_9

    :cond_19
    const/4 v1, 0x0

    :goto_9
    if-nez v1, :cond_1a

    const/4 v1, 0x0

    invoke-static {v0, v3, v1, v6, v1}, LSS;->C(LSS;Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_1a
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_a
    if-nez v6, :cond_1c

    :cond_1b
    invoke-static/range {p1 .. p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object v1

    if-eqz v1, :cond_1c

    invoke-virtual {v1}, Ltg1;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1c

    iget-object v2, v0, LSS;->s:LZS;

    invoke-interface {v2, v1}, LaM5;->error(Ljava/lang/String;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1c
    return-void
.end method

.method public final Z(Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanStatus;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    if-ne p1, v0, :cond_0

    sget-object p1, Lco/bird/android/model/constant/ScanStatus;->INVALID_CODE:Lco/bird/android/model/constant/ScanStatus;

    if-eq p2, p1, :cond_0

    sget-object p1, Lco/bird/android/model/constant/ScanStatus;->QR_DETACHED:Lco/bird/android/model/constant/ScanStatus;

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public a()V
    .locals 4

    iget-object v0, p0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v0}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getAction()Lco/bird/android/model/constant/BirdAction;

    move-result-object v0

    iput-object v0, p0, LSS;->w:Lco/bird/android/model/constant/BirdAction;

    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0}, Lhm5;->sa()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LSS$j;

    invoke-direct {v2, p0}, LSS$j;-><init>(LSS;)V

    new-instance v3, LyS;

    invoke-direct {v3, v2}, LyS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0}, Lhm5;->z1()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LSS$k;

    invoke-direct {v2, p0}, LSS$k;-><init>(LSS;)V

    new-instance v3, LJS;

    invoke-direct {v3, v2}, LJS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0}, Lhm5;->W3()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, LSS$l;

    invoke-direct {v2, p0}, LSS$l;-><init>(LSS;)V

    new-instance v3, LKS;

    invoke-direct {v3, v2}, LKS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "override fun onCreate() \u2026ScanNewQrCode()\n    }\n  }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LSS$m;

    invoke-direct {v2, p0}, LSS$m;-><init>(LSS;)V

    new-instance v3, LLS;

    invoke-direct {v3, v2}, LLS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0}, Lhm5;->Vg()Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "ui.globalLayoutChanges()\n      .take(1)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LSS$n;

    invoke-direct {v2, p0}, LSS$n;-><init>(LSS;)V

    new-instance v3, LMS;

    invoke-direct {v3, v2}, LMS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-boolean v0, p0, LSS;->v:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LSS;->s:LZS;

    iget-object v2, p0, LSS;->j:LTq4;

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result v2

    invoke-interface {v0, v2}, Lhm5;->d2(I)V

    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0}, Lhm5;->zc()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LSS$o;

    invoke-direct {v1, p0}, LSS$o;-><init>(LSS;)V

    new-instance v2, LNS;

    invoke-direct {v2, v1}, LNS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_0
    invoke-virtual {p0}, LSS;->O()V

    invoke-virtual {p0}, LSS;->A()V

    iget-object v0, p0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v0}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getScanType()Lco/bird/android/model/ScanType;

    move-result-object v0

    sget-object v1, LSS$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0}, Lhm5;->gk()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0}, Lhm5;->Yi()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, LSS;->s:LZS;

    iget-object v1, p0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v1}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getBirdCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lhm5;->tc(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final a0(Lco/bird/android/model/BirdScan;)V
    .locals 3

    invoke-virtual {p1}, Lco/bird/android/model/BirdScan;->getBirdCode()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/BirdScan;->getBirdId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, LSS;->c:LEg1;

    new-instance v2, LcT;

    invoke-direct {v2, v0, p1}, LcT;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, LEg1;->c(Lg70;)V

    :cond_0
    return-void
.end method

.method public b(Lem5;)V
    .locals 2

    const-string v0, "rawResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lem5;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, LSS;->h0(Ljava/lang/String;ZZ)Z

    return-void
.end method

.method public final b0()V
    .locals 1

    iget-boolean v0, p0, LSS;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0, p0}, Lhm5;->l5(Lfm5;)V

    :cond_0
    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0}, Lhm5;->n1()V

    return-void
.end method

.method public final c0(Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;ZLjava/lang/String;)V
    .locals 6

    iget-object v0, p0, LSS;->e:LaM;

    iget-object v1, p0, LSS;->b:Lgl;

    invoke-virtual {v1}, Lgl;->t0()Lco/bird/android/model/constant/MapMode;

    move-result-object v2

    iget-object v1, p0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v1}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getIntention()Lco/bird/android/model/constant/ScanIntention;

    move-result-object v3

    move-object v1, p1

    move v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, LaM;->W0(Ljava/lang/String;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;ZLjava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object p3, p0, LSS;->s:LZS;

    const/4 p4, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, p3, v1, p4, v0}, LsD;->progress$default(Lio/reactivex/Observable;LS74;IILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p3, LSS$q;

    invoke-direct {p3, p0}, LSS$q;-><init>(LSS;)V

    new-instance p4, LQS;

    invoke-direct {p4, p3}, LQS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p3, LSS$r;

    invoke-direct {p3, p2, p0}, LSS$r;-><init>(Lco/bird/android/model/constant/BirdAction;LSS;)V

    new-instance p2, LRS;

    invoke-direct {p2, p3}, LRS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doAfterNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "private fun scan(code: S\u2026ccess, ::onScanError)\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, LSS$s;

    invoke-direct {p2, p0}, LSS$s;-><init>(Ljava/lang/Object;)V

    new-instance p3, LzS;

    invoke-direct {p3, p2}, LzS;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance p2, LSS$t;

    invoke-direct {p2, p0}, LSS$t;-><init>(Ljava/lang/Object;)V

    new-instance p4, LAS;

    invoke-direct {p4, p2}, LAS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3, p4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final h0(Ljava/lang/String;ZZ)Z
    .locals 6

    sget-object v0, LJt4;->a:LJt4;

    invoke-virtual {v0, p1}, LJt4;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LSS;->j:LTq4;

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getBirdPayConfig()Lco/bird/android/model/wire/configs/BirdPayConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/BirdPayConfig;->getEnableBirdPay()Z

    move-result v2

    invoke-virtual {v0, p1}, LJt4;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "no."

    const/4 v4, 0x1

    invoke-static {p1, v3, v4}, LmS5;->k(Ljava/lang/String;Ljava/lang/CharSequence;Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    iget-object p3, p0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {p3}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getScanType()Lco/bird/android/model/ScanType;

    move-result-object p3

    sget-object v0, Lco/bird/android/model/ScanType;->EXISTING_QR_CODE:Lco/bird/android/model/ScanType;

    if-eq p3, v0, :cond_0

    iget-object p1, p0, LSS;->c:LEg1;

    new-instance p2, LeT;

    sget-object p3, Lco/bird/android/model/ScanType;->NEW_QR_CODE:Lco/bird/android/model/ScanType;

    invoke-direct {p2, p3, v1}, LeT;-><init>(Lco/bird/android/model/ScanType;Ljava/lang/String;)V

    invoke-interface {p1, p2}, LEg1;->c(Lg70;)V

    iget-object p1, p0, LSS;->t:Le13;

    invoke-interface {p1}, Le13;->e3()V

    goto :goto_3

    :cond_0
    iget-object p3, p0, LSS;->w:Lco/bird/android/model/constant/BirdAction;

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v5

    :goto_0
    invoke-virtual {p0, v1, p3, p2, p1}, LSS;->c0(Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;ZLjava/lang/String;)V

    goto :goto_3

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    invoke-virtual {p0, v0, p1}, LSS;->i0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    iget-object v0, p0, LSS;->r:Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual {v0}, Lco/bird/android/model/extra/ScanBarcodeExtra;->getScanType()Lco/bird/android/model/ScanType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/ScanType;->EXISTING_QR_CODE:Lco/bird/android/model/ScanType;

    if-eq v0, v1, :cond_4

    iget-object p2, p0, LSS;->c:LEg1;

    new-instance p3, LeT;

    sget-object v0, Lco/bird/android/model/ScanType;->SERIAL_NUMBER:Lco/bird/android/model/ScanType;

    invoke-direct {p3, v0, p1}, LeT;-><init>(Lco/bird/android/model/ScanType;Ljava/lang/String;)V

    invoke-interface {p2, p3}, LEg1;->c(Lg70;)V

    iget-object p1, p0, LSS;->t:Le13;

    invoke-interface {p1}, Le13;->e3()V

    goto :goto_3

    :cond_4
    if-eqz p3, :cond_6

    invoke-virtual {p0, v3}, LSS;->M(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    goto :goto_3

    :cond_6
    :goto_1
    iget-object p3, p0, LSS;->w:Lco/bird/android/model/constant/BirdAction;

    if-eqz p2, :cond_7

    goto :goto_2

    :cond_7
    move-object p1, v5

    :goto_2
    invoke-virtual {p0, v3, p3, p2, p1}, LSS;->c0(Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;ZLjava/lang/String;)V

    :goto_3
    return v4
.end method

.method public final i0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, LSS;->f:LiO;

    invoke-interface {v0, p1}, LiO;->k(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, LSS;->s:LZS;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "birdPayManager.scan(merc\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v1, LSS$u;

    invoke-direct {v1, p0, p2, p1}, LSS$u;-><init>(LSS;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, LOS;

    invoke-direct {p1, v1}, LOS;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance p2, LSS$v;

    invoke-direct {p2, p0}, LSS$v;-><init>(LSS;)V

    new-instance v1, LPS;

    invoke-direct {v1, p2}, LPS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, p1, v1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final l0(LNy;)V
    .locals 2

    instance-of v0, p1, Lzk5;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LSS;->p0()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, LSS;->n0(LSS;LNy;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final m0(LNy;Ljava/lang/String;)V
    .locals 10

    iget-object v0, p0, LSS;->s:LZS;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, LSS$w;

    invoke-direct {v4, p1, p0}, LSS$w;-><init>(LNy;LSS;)V

    new-instance v5, LSS$x;

    invoke-direct {v5, p0}, LSS$x;-><init>(LSS;)V

    const/4 v6, 0x0

    const/16 v8, 0x24

    const/4 v9, 0x0

    move-object v1, p1

    move-object v7, p2

    invoke-static/range {v0 .. v9}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final o0(Z)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, LSS;->s:LZS;

    sget-object v2, LZD5;->d:LZD5;

    invoke-interface {p1, v2, v1, v0}, LH31;->dialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LSS;->s:LZS;

    sget-object v2, Luw6;->d:Luw6;

    invoke-interface {p1, v2, v1, v0}, LH31;->dialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    const/16 p3, 0x271d

    if-ne p1, p3, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    iget-object p1, p0, LSS;->t:Le13;

    invoke-interface {p1}, Le13;->close()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, LSS;->t:Le13;

    invoke-interface {v0}, Le13;->e3()V

    return-void
.end method

.method public onPause()V
    .locals 2

    iget-object v0, p0, LSS;->m:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "camera: onPause"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LSS;->s:LZS;

    invoke-interface {v0}, Lhm5;->a1()V

    return-void
.end method

.method public onResume()V
    .locals 3

    iget-object v0, p0, LSS;->m:Landroid/hardware/SensorManager;

    iget-object v1, p0, LSS;->z:Landroid/hardware/Sensor;

    const v2, 0x989680

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "camera: onResume"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LSS;->s:LZS;

    const v1, 0x3e4ccccd    # 0.2f

    invoke-interface {v0, v1}, Lhm5;->d6(F)V

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, LSS;->A:LAG;

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget p1, p1, v1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final p0()V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, LSS;->s:LZS;

    sget v2, Lcj4;->dialog_private_bird_scanned_error:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    sget v12, LVg4;->positiveButton:I

    sget v13, LVg4;->negativeButton:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    new-instance v3, LSS$y;

    move-object/from16 v16, v3

    invoke-direct {v3, v0}, LSS$y;-><init>(LSS;)V

    new-instance v3, LSS$z;

    move-object/from16 v17, v3

    invoke-direct {v3, v0}, LSS$z;-><init>(LSS;)V

    new-instance v3, LSS$A;

    move-object/from16 v18, v3

    invoke-direct {v3, v0}, LSS$A;-><init>(LSS;)V

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0x633fe

    const/16 v22, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v22}, LH31$a;->showCustomDialog$default(LH31;ILjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZILjava/lang/Object;)V

    return-void
.end method

.method public q()V
    .locals 3

    iget-object v0, p0, LSS;->s:LZS;

    sget v1, Lnl4;->enter_code:I

    sget v2, Lnl4;->enter_vehicle_code_dialog_hint:I

    invoke-interface {v0, v1, v2}, LZS;->M(II)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "ui.enterCodeDialogWithRe\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v1, LSS$p;

    invoke-direct {v1, p0}, LSS$p;-><init>(LSS;)V

    new-instance v2, LBS;

    invoke-direct {v2, v1}, LBS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final q0(Lco/bird/android/model/wire/WireBird;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LSS;->k:Ldr4;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object p1

    invoke-interface {v0, p1}, Ldr4;->b(Landroid/location/Location;)V

    :cond_0
    return-void
.end method

.method public final r0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LSS;->d:LEa;

    new-instance v13, LgN;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v2, v13

    move v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    invoke-direct/range {v2 .. v12}, LgN;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v13}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public final s0(Lco/bird/android/model/wire/WireBird;)V
    .locals 2

    iget-object v0, p0, LSS;->g:LQh2;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, LYS;->b(LQh2;Lco/bird/android/model/wire/WireBird;Z)V

    return-void
.end method

.method public final x(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;)V
    .locals 4

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, LSS;->s:LZS;

    sget-object p2, Lpe6;->d:Lpe6;

    invoke-interface {p1, p2, v1, v1}, LH31;->dialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "ui.dialog(alert = Unlock\u2026dSchedulers.mainThread())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance p2, LSS$c;

    invoke-direct {p2, p0}, LSS$c;-><init>(LSS;)V

    new-instance v0, LHS;

    invoke-direct {v0, p2}, LHS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void

    :cond_0
    const/4 v2, 0x0

    if-eqz p2, :cond_1

    invoke-static {p2}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p2

    goto :goto_0

    :cond_1
    move-object p2, v2

    :goto_0
    if-nez p2, :cond_2

    iget-object p2, p0, LSS;->e:LaM;

    invoke-interface {p2, p1}, LaM;->M0(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p2

    :cond_2
    iget-object p1, p0, LSS;->s:LZS;

    const/4 v3, 0x2

    invoke-static {p2, p1, v1, v3, v2}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "bird?.let {\n      Single\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LSS;->q:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance p2, LSS$d;

    invoke-direct {p2, p0}, LSS$d;-><init>(LSS;)V

    new-instance v0, LIS;

    invoke-direct {v0, p2}, LIS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
