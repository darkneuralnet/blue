.class public final LO85;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh85;
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO85$a;,
        LO85$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e8\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00ca\u00012\u00020\u00012\u00020\u0002:\u0001LB\u00ea\u0001\u0008\u0007\u0012\u0006\u0010[\u001a\u00020+\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010g\u001a\u00020d\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010o\u001a\u00020l\u0012\u0006\u0010s\u001a\u00020p\u0012\u0006\u0010w\u001a\u00020t\u0012\u0006\u0010{\u001a\u00020x\u0012\u0006\u0010\u007f\u001a\u00020|\u0012\u0008\u0010\u0083\u0001\u001a\u00030\u0080\u0001\u0012\u0008\u0010\u0087\u0001\u001a\u00030\u0084\u0001\u0012\u0008\u0010\u008b\u0001\u001a\u00030\u0088\u0001\u0012\u0008\u0010\u008f\u0001\u001a\u00030\u008c\u0001\u0012\u0008\u0010\u0093\u0001\u001a\u00030\u0090\u0001\u0012\u0008\u0010\u0097\u0001\u001a\u00030\u0094\u0001\u0012\u0008\u0010\u009b\u0001\u001a\u00030\u0098\u0001\u0012\u0008\u0010\u009f\u0001\u001a\u00030\u009c\u0001\u0012\u0008\u0010\u00a3\u0001\u001a\u00030\u00a0\u0001\u0012\u0008\u0010\u00a7\u0001\u001a\u00030\u00a4\u0001\u0012\u0011\u0008\u0001\u0010\u00ac\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a9\u00010\u00a8\u0001\u0012\n\u0008\u0001\u0010\u00b0\u0001\u001a\u00030\u00ad\u0001\u0012\n\u0008\u0001\u0010\u00b4\u0001\u001a\u00030\u00b1\u0001\u00a2\u0006\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0008\u0010\u0011\u001a\u00020\rH\u0002J\u000c\u0010\u0012\u001a\u00020\u0005*\u00020\u0003H\u0002J$\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\"\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00180\u00170\u001a2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0016\u0010\u001c\u001a\u00020\r2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J@\u0010&\u001a\u00020\r2\u0008\u0010 \u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\u0019\u0008\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r0\"\u00a2\u0006\u0002\u0008$H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002J\u0014\u0010-\u001a\u00020\u0003*\u00020+2\u0006\u0010,\u001a\u00020\u0003H\u0002J\u001a\u0010/\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0008\u0010.\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u00102\u001a\u00020\r2\u0008\u00101\u001a\u0004\u0018\u000100H\u0002J\u0018\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0005H\u0002J\u0008\u00107\u001a\u00020\rH\u0002J\u0010\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0005H\u0002J\u0012\u0010<\u001a\u00020\u00052\u0008\u0010;\u001a\u0004\u0018\u00010:H\u0002J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0018H\u0002J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0018H\u0002J\u0012\u0010@\u001a\u00020\u00052\u0008\u0010;\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010A\u001a\u00020\u00052\u0008\u0010;\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010B\u001a\u00020\u00052\u0008\u0010;\u001a\u0004\u0018\u00010:H\u0002J\u0008\u0010C\u001a\u00020\rH\u0002J\u000c\u0010D\u001a\u00020\r*\u000200H\u0002J\u0008\u0010E\u001a\u00020\rH\u0002J6\u0010K\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00032\u0008\u0010H\u001a\u0004\u0018\u00010\u00032\u0008\u0010I\u001a\u0004\u0018\u00010\u00032\u0008\u0010J\u001a\u0004\u0018\u00010\u0003H\u0002J\u0008\u0010L\u001a\u00020\rH\u0016J\u0008\u0010M\u001a\u00020\rH\u0016J\u0008\u0010N\u001a\u00020\rH\u0016J\u0010\u0010Q\u001a\u00020\r2\u0006\u0010P\u001a\u00020OH\u0016J\u0012\u0010T\u001a\u00020\r2\u0008\u0010S\u001a\u0004\u0018\u00010RH\u0016J\u001a\u0010Y\u001a\u00020\r2\u0008\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010X\u001a\u00020WH\u0016R\u0014\u0010[\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008i\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009d\u0001\u0010\u009e\u0001R\u0018\u0010\u00a3\u0001\u001a\u00030\u00a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R\u0018\u0010\u00a7\u0001\u001a\u00030\u00a4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001R\u001f\u0010\u00ac\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a9\u00010\u00a8\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001R\u0018\u0010\u00b0\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R\u0018\u0010\u00b4\u0001\u001a\u00030\u00b1\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001R\u0019\u0010\u00b7\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001R \u0010\u00bb\u0001\u001a\u000b \u00b8\u0001*\u0004\u0018\u00010U0U8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001R)\u0010\u00c0\u0001\u001a\u0014\u0012\u000f\u0012\r \u00b8\u0001*\u0005\u0018\u00010\u00bd\u00010\u00bd\u00010\u00bc\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00be\u0001\u0010\u00bf\u0001R)\u0010\u00c3\u0001\u001a\u0014\u0012\u000f\u0012\r \u00b8\u0001*\u0005\u0018\u00010\u00c1\u00010\u00c1\u00010\u00bc\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c2\u0001\u0010\u00bf\u0001R\u001a\u0010\u00c7\u0001\u001a\u00030\u00c4\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c5\u0001\u0010\u00c6\u0001\u00a8\u0006\u00cb\u0001"
    }
    d2 = {
        "LO85;",
        "Lh85;",
        "Landroid/hardware/SensorEventListener;",
        "",
        "raw",
        "",
        "isCameraScan",
        "E0",
        "url",
        "Q",
        "I0",
        "Lx24;",
        "pricingText",
        "",
        "R0",
        "text",
        "O",
        "N0",
        "U",
        "code",
        "A0",
        "merchantQRCode",
        "F0",
        "LHM4;",
        "Lco/bird/android/model/BirdScan;",
        "scanResponse",
        "Lio/reactivex/Observable;",
        "u0",
        "t0",
        "",
        "throwable",
        "s0",
        "birdScan",
        "paired",
        "Lkotlin/Function1;",
        "Landroid/content/Intent;",
        "Lkotlin/ExtensionFunctionType;",
        "supplementIntent",
        "L",
        "(Lco/bird/android/model/BirdScan;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V",
        "LNy;",
        "alert",
        "J0",
        "Landroid/content/Context;",
        "birdCode",
        "K",
        "secondaryMessage",
        "K0",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "P0",
        "Lco/bird/android/model/wire/configs/RideConfig;",
        "config",
        "showPriceChangeNotificationModal",
        "M0",
        "z0",
        "enabled",
        "N",
        "Lco/bird/android/model/constant/ScanStatus;",
        "scanStatus",
        "J",
        "scan",
        "P",
        "w0",
        "R",
        "T",
        "S",
        "L0",
        "T0",
        "O0",
        "success",
        "rawData",
        "merchantId",
        "siteId",
        "placardId",
        "Q0",
        "a",
        "onResume",
        "onPause",
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
        "Landroid/content/Context;",
        "context",
        "Lgl;",
        "c",
        "Lgl;",
        "preference",
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
        "Lqi1;",
        "h",
        "Lqi1;",
        "experimentManager",
        "LTq4;",
        "i",
        "LTq4;",
        "reactiveConfig",
        "Ldr4;",
        "j",
        "Ldr4;",
        "locationManager",
        "LMK4;",
        "k",
        "LMK4;",
        "reservationManager",
        "Lq54;",
        "l",
        "Lq54;",
        "privateBirdManager",
        "Landroid/hardware/SensorManager;",
        "m",
        "Landroid/hardware/SensorManager;",
        "sensorManager",
        "Lu24;",
        "n",
        "Lu24;",
        "pricingManager",
        "LRh6;",
        "o",
        "LRh6;",
        "userStream",
        "Landroid/os/Handler;",
        "p",
        "Landroid/os/Handler;",
        "handler",
        "Le13;",
        "q",
        "Le13;",
        "navigator",
        "LQz1;",
        "r",
        "LQz1;",
        "frequentFlyerManager",
        "LBl5;",
        "s",
        "LBl5;",
        "scanlessRideManager",
        "LYR4;",
        "t",
        "LYR4;",
        "rideManager",
        "LMD;",
        "u",
        "LMD;",
        "rxBleManager",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "v",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "scopeProvider",
        "Lco/bird/android/model/extra/RiderBirdScanExtra;",
        "w",
        "Lco/bird/android/model/extra/RiderBirdScanExtra;",
        "extras",
        "LZS;",
        "x",
        "LZS;",
        "ui",
        "y",
        "Z",
        "shouldEnableScanner",
        "kotlin.jvm.PlatformType",
        "z",
        "Landroid/hardware/Sensor;",
        "lightSensor",
        "LAG;",
        "",
        "A",
        "LAG;",
        "lightSensorReading",
        "Lak5;",
        "B",
        "scanEntryMode",
        "Lio/reactivex/disposables/b;",
        "C",
        "Lio/reactivex/disposables/b;",
        "onResumeDisposable",
        "<init>",
        "(Landroid/content/Context;Lgl;LEa;LaM;LiO;LQh2;Lqi1;LTq4;Ldr4;LMK4;Lq54;Landroid/hardware/SensorManager;Lu24;LRh6;Landroid/os/Handler;Le13;LQz1;LBl5;LYR4;LMD;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/RiderBirdScanExtra;LZS;)V",
        "D",
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
        "SMAP\nRiderBirdScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderBirdScanPresenter.kt\nco/bird/android/app/feature/scanner/RiderBirdScanPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,945:1\n218#2:946\n180#2:947\n180#2:948\n180#2:949\n180#2:950\n180#2:951\n180#2:952\n180#2:953\n180#2:956\n180#2:957\n180#2:959\n199#2:960\n180#2:961\n199#2:962\n237#2:963\n199#2:964\n52#3,2:954\n1#4:958\n*S KotlinDebug\n*F\n+ 1 RiderBirdScanPresenter.kt\nco/bird/android/app/feature/scanner/RiderBirdScanPresenterImpl\n*L\n183#1:946\n194#1:947\n202#1:948\n211#1:949\n228#1:950\n245#1:951\n262#1:952\n270#1:953\n317#1:956\n352#1:957\n427#1:959\n439#1:960\n524#1:961\n532#1:962\n750#1:963\n851#1:964\n281#1:954,2\n*E\n"
    }
.end annotation


# static fields
.field public static final D:LO85$a;

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

.field public C:Lio/reactivex/disposables/b;

.field public final b:Landroid/content/Context;

.field public final c:Lgl;

.field public final d:LEa;

.field public final e:LaM;

.field public final f:LiO;

.field public final g:LQh2;

.field public final h:Lqi1;

.field public final i:LTq4;

.field public final j:Ldr4;

.field public final k:LMK4;

.field public final l:Lq54;

.field public final m:Landroid/hardware/SensorManager;

.field public final n:Lu24;

.field public final o:LRh6;

.field public final p:Landroid/os/Handler;

.field public final q:Le13;

.field public final r:LQz1;

.field public final s:LBl5;

.field public final t:LYR4;

.field public final u:LMD;

.field public final v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Lco/bird/android/model/extra/RiderBirdScanExtra;

.field public final x:LZS;

.field public y:Z

.field public final z:Landroid/hardware/Sensor;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LO85$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO85$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LO85;->D:LO85$a;

    const/16 v0, 0x8

    sput v0, LO85;->E:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lgl;LEa;LaM;LiO;LQh2;Lqi1;LTq4;Ldr4;LMK4;Lq54;Landroid/hardware/SensorManager;Lu24;LRh6;Landroid/os/Handler;Le13;LQz1;LBl5;LYR4;LMD;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/RiderBirdScanExtra;LZS;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lgl;",
            "LEa;",
            "LaM;",
            "LiO;",
            "LQh2;",
            "Lqi1;",
            "LTq4;",
            "Ldr4;",
            "LMK4;",
            "Lq54;",
            "Landroid/hardware/SensorManager;",
            "Lu24;",
            "LRh6;",
            "Landroid/os/Handler;",
            "Le13;",
            "LQz1;",
            "LBl5;",
            "LYR4;",
            "LMD;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/model/extra/RiderBirdScanExtra;",
            "LZS;",
            ")V"
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

    const-string v0, "context"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdManager"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdPayManager"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jobProducer"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experimentManager"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reservationManager"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privateBirdManager"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sensorManager"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pricingManager"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frequentFlyerManager"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanlessRideManager"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideManager"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBleManager"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    move-object/from16 v15, p23

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p16

    iput-object v1, v0, LO85;->b:Landroid/content/Context;

    iput-object v2, v0, LO85;->c:Lgl;

    iput-object v3, v0, LO85;->d:LEa;

    iput-object v4, v0, LO85;->e:LaM;

    iput-object v5, v0, LO85;->f:LiO;

    iput-object v6, v0, LO85;->g:LQh2;

    iput-object v7, v0, LO85;->h:Lqi1;

    iput-object v8, v0, LO85;->i:LTq4;

    iput-object v9, v0, LO85;->j:Ldr4;

    iput-object v10, v0, LO85;->k:LMK4;

    iput-object v11, v0, LO85;->l:Lq54;

    iput-object v12, v0, LO85;->m:Landroid/hardware/SensorManager;

    iput-object v13, v0, LO85;->n:Lu24;

    iput-object v14, v0, LO85;->o:LRh6;

    move-object/from16 v1, p15

    iput-object v1, v0, LO85;->p:Landroid/os/Handler;

    iput-object v15, v0, LO85;->q:Le13;

    move-object/from16 v1, p17

    move-object/from16 v2, p18

    iput-object v1, v0, LO85;->r:LQz1;

    iput-object v2, v0, LO85;->s:LBl5;

    move-object/from16 v1, p19

    move-object/from16 v2, p20

    iput-object v1, v0, LO85;->t:LYR4;

    iput-object v2, v0, LO85;->u:LMD;

    move-object/from16 v1, p21

    move-object/from16 v2, p22

    iput-object v1, v0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    iput-object v2, v0, LO85;->w:Lco/bird/android/model/extra/RiderBirdScanExtra;

    move-object/from16 v1, p23

    iput-object v1, v0, LO85;->x:LZS;

    const/4 v1, 0x1

    iput-boolean v1, v0, LO85;->y:Z

    const/4 v1, 0x5

    invoke-virtual {v12, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    iput-object v1, v0, LO85;->z:Landroid/hardware/Sensor;

    invoke-static {}, LAG;->g()LAG;

    move-result-object v1

    const-string v2, "create<Float>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LO85;->A:LAG;

    sget-object v1, Lak5;->b:Lak5;

    invoke-static {v1}, LAG;->h(Ljava/lang/Object;)LAG;

    move-result-object v1

    const-string v2, "createDefault<ScanEntryMode>(ScanEntryMode.QR)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LO85;->B:LAG;

    new-instance v1, Lio/reactivex/disposables/b;

    invoke-direct {v1}, Lio/reactivex/disposables/b;-><init>()V

    iput-object v1, v0, LO85;->C:Lio/reactivex/disposables/b;

    return-void
.end method

.method public static synthetic A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, LO85;->c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->y0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final B0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static synthetic C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final C0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final D0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->H0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LO85;->v0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final G0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
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

    invoke-static {p0, p1}, LO85;->C0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic M(LO85;Lco/bird/android/model/BirdScan;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, LO85$c;->g:LO85$c;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LO85;->L(Lco/bird/android/model/BirdScan;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final S0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final Y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final synthetic access$enableScanner(LO85;Z)V
    .locals 0

    invoke-virtual {p0, p1}, LO85;->N(Z)V

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(LO85;)LEa;
    .locals 0

    iget-object p0, p0, LO85;->d:LEa;

    return-object p0
.end method

.method public static final synthetic access$getBirdManager$p(LO85;)LaM;
    .locals 0

    iget-object p0, p0, LO85;->e:LaM;

    return-object p0
.end method

.method public static final synthetic access$getLightSensorReading$p(LO85;)LAG;
    .locals 0

    iget-object p0, p0, LO85;->A:LAG;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(LO85;)Le13;
    .locals 0

    iget-object p0, p0, LO85;->q:Le13;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(LO85;)Lgl;
    .locals 0

    iget-object p0, p0, LO85;->c:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(LO85;)LTq4;
    .locals 0

    iget-object p0, p0, LO85;->i:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getScanEntryMode$p(LO85;)LAG;
    .locals 0

    iget-object p0, p0, LO85;->B:LAG;

    return-object p0
.end method

.method public static final synthetic access$getScanlessRideManager$p(LO85;)LBl5;
    .locals 0

    iget-object p0, p0, LO85;->s:LBl5;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(LO85;)LZS;
    .locals 0

    iget-object p0, p0, LO85;->x:LZS;

    return-object p0
.end method

.method public static final synthetic access$handleCodeEntered(LO85;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, LO85;->O(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$onScanError(LO85;Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, LO85;->s0(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$onScanSuccess(LO85;LHM4;)V
    .locals 0

    invoke-virtual {p0, p1}, LO85;->t0(LHM4;)V

    return-void
.end method

.method public static final synthetic access$pairBirdOnOwnableScan(LO85;LHM4;)Lio/reactivex/Observable;
    .locals 0

    invoke-virtual {p0, p1}, LO85;->u0(LHM4;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$resumeScanner(LO85;)V
    .locals 0

    invoke-virtual {p0}, LO85;->z0()V

    return-void
.end method

.method public static final synthetic access$showPriceChangedBlockingDialog(LO85;Lco/bird/android/model/wire/configs/RideConfig;Z)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, LO85;->M0(Lco/bird/android/model/wire/configs/RideConfig;Z)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$showPricingStringIfApplicable(LO85;)V
    .locals 0

    invoke-virtual {p0}, LO85;->N0()V

    return-void
.end method

.method public static final synthetic access$trackScan(LO85;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, LO85;->Q0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$trackScannerScreenViewed(LO85;Lx24;)V
    .locals 0

    invoke-virtual {p0, p1}, LO85;->R0(Lx24;)V

    return-void
.end method

.method public static final b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LO85;->Y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

    invoke-static {p0, p1}, LO85;->h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->D0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
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

    invoke-static {p0, p1}, LO85;->m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->p0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LO85;->V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, LO85;->b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
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

    invoke-static {p0, p1}, LO85;->l0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final l0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LO85;->B0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->r0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final p0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final r0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, LO85;->a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final v0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->S0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LO85;->G0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final y0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LO85;->d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A0(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 6

    iget-object v0, p0, LO85;->e:LaM;

    sget-object v2, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    iget-object v1, p0, LO85;->w:Lco/bird/android/model/extra/RiderBirdScanExtra;

    invoke-virtual {v1}, Lco/bird/android/model/extra/RiderBirdScanExtra;->getScanIntention()Lco/bird/android/model/constant/ScanIntention;

    move-result-object v3

    move-object v1, p1

    move v4, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, LaM;->W0(Ljava/lang/String;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;ZLjava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object p2, p0, LO85;->x:LZS;

    const/4 p3, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, p2, v1, p3, v0}, LsD;->progress$default(Lio/reactivex/Observable;LS74;IILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, LO85$R;

    invoke-direct {p2, p0}, LO85$R;-><init>(Ljava/lang/Object;)V

    new-instance p3, LD85;

    invoke-direct {p3, p2}, LD85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "birdManager\n      .scanB\u2026dSchedulers.mainThread())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, LO85$S;

    invoke-direct {p2, p0}, LO85$S;-><init>(Ljava/lang/Object;)V

    new-instance p3, LF85;

    invoke-direct {p3, p2}, LF85;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance p2, LO85$T;

    invoke-direct {p2, p0}, LO85$T;-><init>(Ljava/lang/Object;)V

    new-instance v0, LG85;

    invoke-direct {v0, p2}, LG85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3, v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final E0(Ljava/lang/String;Z)Z
    .locals 6

    sget-object v0, LJt4;->a:LJt4;

    invoke-virtual {v0, p1}, LJt4;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LO85;->i:LTq4;

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

    invoke-virtual {p0, p1}, LO85;->Q(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0, p1}, LO85;->I0(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object p1, p0, LO85;->q:Le13;

    invoke-interface {p1}, Le13;->S3()V

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v5

    :goto_0
    invoke-virtual {p0, v1, p2, p1}, LO85;->A0(Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_4

    if-eqz v2, :cond_4

    invoke-virtual {p0, v0, p1}, LO85;->F0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v3}, LO85;->U(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz p2, :cond_5

    goto :goto_1

    :cond_5
    move-object p1, v5

    :goto_1
    invoke-virtual {p0, v3, p2, p1}, LO85;->A0(Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, LO85;->z0()V

    const/4 v4, 0x0

    :goto_2
    return v4
.end method

.method public final F0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, LO85;->f:LiO;

    invoke-interface {v0, p1}, LiO;->k(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, LO85;->x:LZS;

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

    iget-object v1, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v1, LO85$U;

    invoke-direct {v1, p0, p2, p1}, LO85$U;-><init>(LO85;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, LI85;

    invoke-direct {p1, v1}, LI85;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance p2, LO85$V;

    invoke-direct {p2, p0}, LO85$V;-><init>(LO85;)V

    new-instance v1, LJ85;

    invoke-direct {v1, p2}, LJ85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, p1, v1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final I0(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "https://qrco.de/birdbike"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final J(Lco/bird/android/model/constant/ScanStatus;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ScanStatus;->ALREADY_HAS_RESERVATION:Lco/bird/android/model/constant/ScanStatus;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final J0(LNy;)V
    .locals 2

    instance-of v0, p1, Lzk5;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LO85;->O0()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, LO85;->k:LMK4;

    invoke-interface {v0}, LMK4;->e()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LO85;->b:Landroid/content/Context;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Reservation;

    invoke-virtual {v0}, Lco/bird/android/model/Reservation;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, LO85;->K(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, LO85;->K0(LNy;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final K(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lnl4;->scan_bird_already_has_reservation_title:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lnl4;->scan_bird_already_has_reservation_content:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder()\n      .a\u2026dCode))\n      .toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final K0(LNy;Ljava/lang/String;)V
    .locals 10

    iget-object v0, p0, LO85;->x:LZS;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, LO85$W;

    invoke-direct {v4, p1, p0}, LO85$W;-><init>(LNy;LO85;)V

    new-instance v5, LO85$X;

    invoke-direct {v5, p0}, LO85$X;-><init>(LO85;)V

    const/4 v6, 0x0

    const/16 v8, 0x24

    const/4 v9, 0x0

    move-object v1, p1

    move-object v7, p2

    invoke-static/range {v0 .. v9}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final L(Lco/bird/android/model/BirdScan;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/BirdScan;",
            "Ljava/lang/Boolean;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Intent;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LO85;->w:Lco/bird/android/model/extra/RiderBirdScanExtra;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "closing down and sending extras as "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LO85;->w:Lco/bird/android/model/extra/RiderBirdScanExtra;

    iget-object v1, p0, LO85;->q:Le13;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "rider_bird_scan"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "bird"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const-string p2, "paired"

    invoke-virtual {v2, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_0
    invoke-interface {p3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 p1, -0x1

    invoke-interface {v1, p1, v2}, Le13;->C1(ILandroid/content/Intent;)V

    return-void
.end method

.method public final L0()V
    .locals 13

    iget-object v0, p0, LO85;->k:LMK4;

    invoke-interface {v0}, LMK4;->e()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Reservation;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/Reservation;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, LO85;->b:Landroid/content/Context;

    sget v2, Lnl4;->scan_bird_already_has_reservation_content:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, LO85;->b:Landroid/content/Context;

    sget v1, Lnl4;->scan_bird_already_has_reservation_content_no_code:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_2
    move-object v3, v0

    const-string v0, "reservedBirdCode?.let { \u2026ervation_content_no_code)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LO85;->x:LZS;

    iget-object v0, p0, LO85;->b:Landroid/content/Context;

    sget v2, Lnl4;->scan_bird_already_has_reservation_title:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, LO85$Y;

    invoke-direct {v8, p0}, LO85$Y;-><init>(LO85;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x1ac

    const/4 v12, 0x0

    invoke-static/range {v1 .. v12}, LH31$a;->showDialog$default(LH31;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/Integer;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public final M0(Lco/bird/android/model/wire/configs/RideConfig;Z)Z
    .locals 13

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getPriceChangeExpName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LO85;->h:Lqi1;

    invoke-interface {v0, p1}, Lqi1;->a(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "experimentManager.markSt\u2026       .onErrorComplete()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_0
    iget-object p1, p0, LO85;->c:Lgl;

    invoke-virtual {p1}, Lgl;->h1()Lco/bird/android/model/wire/WireRidePrice;

    move-result-object p1

    iget-object v0, p0, LO85;->i:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-static {v0}, LFv0;->a(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object v0

    iget-object v1, p0, LO85;->c:Lgl;

    invoke-virtual {v1, v0}, Lgl;->k2(Lco/bird/android/model/wire/WireRidePrice;)V

    iget-object v1, p0, LO85;->i:LTq4;

    invoke-static {v1, p1}, LX85;->a(LTq4;Lco/bird/android/model/wire/WireRidePrice;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, LO85;->d:LEa;

    new-instance v2, Lco/bird/android/model/analytics/PriceChangeDetected;

    invoke-direct {v2, v0}, Lco/bird/android/model/analytics/PriceChangeDetected;-><init>(Lco/bird/android/model/wire/WireRidePrice;)V

    invoke-interface {p1, v2}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    if-eqz p2, :cond_1

    invoke-virtual {p0, v1}, LO85;->N(Z)V

    iget-object v3, p0, LO85;->x:LZS;

    new-instance v4, Ls24;

    invoke-direct {v4, v0}, Ls24;-><init>(Lco/bird/android/model/wire/WireRidePrice;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, LO85$Z;

    invoke-direct {v7, p0}, LO85$Z;-><init>(LO85;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x74

    const/4 v12, 0x0

    invoke-static/range {v3 .. v12}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, LO85;->d:LEa;

    new-instance p2, Lco/bird/android/model/analytics/PriceIncreaseModalShown;

    invoke-direct {p2, v0}, Lco/bird/android/model/analytics/PriceIncreaseModalShown;-><init>(Lco/bird/android/model/wire/WireRidePrice;)V

    invoke-interface {p1, p2}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final N(Z)V
    .locals 2

    iput-boolean p1, p0, LO85;->y:Z

    if-eqz p1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LO85;->x:LZS;

    invoke-interface {v1, v0}, Lhm5;->l5(Lfm5;)V

    if-eqz p1, :cond_1

    iget-object p1, p0, LO85;->x:LZS;

    invoke-interface {p1}, Lhm5;->n1()V

    :cond_1
    return-void
.end method

.method public final N0()V
    .locals 4

    sget-object v0, Lr24;->a:Lr24;

    iget-object v1, p0, LO85;->b:Landroid/content/Context;

    iget-object v2, p0, LO85;->i:LTq4;

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lr24;->b(Landroid/content/Context;Lco/bird/android/model/wire/configs/RideConfig;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LO85;->i:LTq4;

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getShowPriceOnScanner()Lco/bird/android/model/constant/PriceOnScannerKind;

    move-result-object v1

    sget-object v2, LO85$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object v1, Lx24;->e:Lx24;

    invoke-virtual {p0, v1}, LO85;->R0(Lx24;)V

    iget-object v1, p0, LO85;->i:LTq4;

    iget-object v2, p0, LO85;->c:Lgl;

    invoke-static {v1, v2}, LX85;->b(LTq4;Lgl;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LO85;->x:LZS;

    invoke-interface {v1, v0}, LZS;->nl(Ljava/lang/String;)V

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0, v3}, Lhm5;->w9(Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, LZS;->ol()V

    iget-object v0, p0, LO85;->i:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableScannerCodeEntryV2()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LO85;->x:LZS;

    iget-object v1, p0, LO85;->i:LTq4;

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableScannerCodeEntryV2()Z

    move-result v1

    invoke-interface {v0, v1}, Lhm5;->w9(Z)V

    goto :goto_0

    :cond_2
    sget-object v1, Lx24;->e:Lx24;

    invoke-virtual {p0, v1}, LO85;->R0(Lx24;)V

    iget-object v1, p0, LO85;->x:LZS;

    invoke-interface {v1, v0}, LZS;->nl(Ljava/lang/String;)V

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0, v3}, Lhm5;->w9(Z)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, LZS;->ol()V

    iget-object v0, p0, LO85;->i:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableScannerCodeEntryV2()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LO85;->x:LZS;

    const/4 v1, 0x0

    invoke-static {v0, v3, v2, v1}, Lhm5$a;->showInfoText$default(Lhm5;ZILjava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final O(Ljava/lang/String;)V
    .locals 11

    iget-object v0, p0, LO85;->i:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, LO85;->E0(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object v1, p0, LO85;->x:LZS;

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

.method public final O0()V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, LO85;->x:LZS;

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

    new-instance v3, LO85$a0;

    move-object/from16 v16, v3

    invoke-direct {v3, v0}, LO85$a0;-><init>(LO85;)V

    new-instance v3, LO85$b0;

    move-object/from16 v17, v3

    invoke-direct {v3, v0}, LO85$b0;-><init>(LO85;)V

    new-instance v3, LO85$c0;

    move-object/from16 v18, v3

    invoke-direct {v3, v0}, LO85$c0;-><init>(LO85;)V

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0x633fe

    const/16 v22, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v22}, LH31$a;->showCustomDialog$default(LH31;ILjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZILjava/lang/Object;)V

    return-void
.end method

.method public final P(Lco/bird/android/model/BirdScan;)Z
    .locals 24

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdScan;->getError()Lco/bird/android/model/wire/WireError;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireError;->getTitle()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, 0x0

    if-eqz v1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdScan;->getError()Lco/bird/android/model/wire/WireError;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireError;->getMessage()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v4, v0, LO85;->x:LZS;

    sget v5, LJj4;->dialog_general:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    sget v1, LYg4;->title:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    sget v1, LYg4;->message:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdScan;->getError()Lco/bird/android/model/wire/WireError;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireError;->getTitle()Ljava/lang/String;

    move-result-object v1

    move-object v13, v1

    goto :goto_2

    :cond_3
    const/4 v13, 0x0

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdScan;->getError()Lco/bird/android/model/wire/WireError;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireError;->getMessage()Ljava/lang/String;

    move-result-object v1

    move-object v14, v1

    goto :goto_3

    :cond_4
    const/4 v14, 0x0

    :goto_3
    sget v15, LYg4;->confirmButton:I

    sget v1, LYg4;->secondaryButton:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdScan;->getError()Lco/bird/android/model/wire/WireError;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireError;->getButtonText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    :cond_5
    iget-object v1, v0, LO85;->x:LZS;

    sget v2, Lnl4;->ok_uppercased:I

    new-array v10, v3, [Ljava/lang/Object;

    invoke-interface {v1, v2, v10}, LZS;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/BirdScan;->getError()Lco/bird/android/model/wire/WireError;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireError;->getButtonText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v2, v0, LO85;->x:LZS;

    sget v10, Lnl4;->general_not_now:I

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v2, v10, v3}, LZS;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    :goto_4
    new-instance v3, LO85$d;

    move-object/from16 v19, v3

    move-object/from16 v10, p1

    invoke-direct {v3, v10, v0}, LO85$d;-><init>(Lco/bird/android/model/BirdScan;LO85;)V

    sget-object v20, LO85$e;->g:LO85$e;

    sget-object v21, LO85$f;->g:LO85$f;

    sget-object v22, LO85$g;->g:LO85$g;

    const/16 v23, 0x1

    const/4 v3, 0x1

    move v10, v3

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    invoke-interface/range {v4 .. v23}, LH31;->showCustomDialog(ILjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V

    const/4 v1, 0x1

    return v1

    :cond_8
    :goto_5
    return v3
.end method

.method public final P0(Lco/bird/android/model/wire/WireBird;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LO85;->j:Ldr4;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object p1

    invoke-interface {v0, p1}, Ldr4;->b(Landroid/location/Location;)V

    :cond_0
    return-void
.end method

.method public final Q(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, LO85;->i:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0, p1}, Lco/bird/android/model/wire/configs/Config;->getScannerUrlRedirect(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LO85;->q:Le13;

    invoke-interface {v0, p1}, Le13;->m2(Ljava/lang/String;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final Q0(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LO85;->d:LEa;

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

.method public final R(Lco/bird/android/model/constant/ScanStatus;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ScanStatus;->OWNABLE:Lco/bird/android/model/constant/ScanStatus;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final R0(Lx24;)V
    .locals 3

    iget-object v0, p0, LO85;->A:LAG;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LO85$d0;

    invoke-direct {v1, p0, p1}, LO85$d0;-><init>(LO85;Lx24;)V

    new-instance p1, LE85;

    invoke-direct {p1, v1}, LE85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->doAfterNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "private fun trackScanner\u2026r)\n      .subscribe()\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public final S(Lco/bird/android/model/constant/ScanStatus;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ScanStatus;->AVAILABLE_INSIDE_NO_RIDE_ZONE:Lco/bird/android/model/constant/ScanStatus;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final T(Lco/bird/android/model/constant/ScanStatus;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ScanStatus;->AVAILABLE_OUTSIDE_SERVICE_AREA:Lco/bird/android/model/constant/ScanStatus;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final T0(Lco/bird/android/model/wire/WireBird;)V
    .locals 72

    move-object/from16 v0, p1

    move-object/from16 v15, p0

    iget-object v14, v15, LO85;->g:LQh2;

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

    const/16 v16, 0x0

    move-object/from16 v71, v14

    move/from16 v14, v16

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x1

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, -0x1

    const/16 v68, -0x2

    const/16 v69, 0x3

    const/16 v70, 0x0

    invoke-static/range {v0 .. v70}, Lco/bird/android/model/wire/WireBird;->copy$default(Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v2, v71

    invoke-static {v2, v0, v1}, LYS;->b(LQh2;Lco/bird/android/model/wire/WireBird;Z)V

    return-void
.end method

.method public final U(Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, LO85;->i:LTq4;

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

.method public a()V
    .locals 8

    iget-object v0, p0, LO85;->i:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getPricingUiConfig()Lco/bird/android/model/wire/configs/PricingUiConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/PricingUiConfig;->getEnabled()Z

    move-result v0

    const-wide/16 v1, 0x1

    const-string v3, "override fun onCreate() \u2026itor(extras.birdCode)\n  }"

    const-string v4, "this.`as`(AutoDispose.autoDisposable(provider))"

    if-eqz v0, :cond_2

    iget-object v0, p0, LO85;->o:LRh6;

    invoke-interface {v0}, LRh6;->a()Lco/bird/android/model/User;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lco/bird/android/model/User;->getRideCount()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, LZS;->c5()V

    sget-object v0, Lx24;->c:Lx24;

    invoke-virtual {p0, v0}, LO85;->R0(Lx24;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LO85;->c:Lgl;

    invoke-virtual {v0}, Lgl;->b0()Lco/bird/android/model/VehiclePricingDetails;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, LZS;->c5()V

    sget-object v0, Lx24;->c:Lx24;

    invoke-virtual {p0, v0}, LO85;->R0(Lx24;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LO85;->n:Lu24;

    iget-object v5, p0, LO85;->j:Ldr4;

    invoke-interface {v5}, Ldr4;->p()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/location/Location;

    const-wide/high16 v6, 0x4024000000000000L    # 10.0

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Lu24;->a(Landroid/location/Location;Ljava/lang/Double;)Lio/reactivex/F;

    move-result-object v0

    new-instance v5, LO85$t;

    invoke-direct {v5, p0}, LO85$t;-><init>(LO85;)V

    new-instance v6, LM85;

    invoke-direct {v6, v5}, LM85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v6}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lio/reactivex/p;->P(J)Lio/reactivex/p;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v5

    invoke-virtual {v0, v5}, Lio/reactivex/p;->I(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v5}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v5

    invoke-virtual {v0, v5}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v5, LO85$w;

    invoke-direct {v5, p0}, LO85$w;-><init>(LO85;)V

    new-instance v6, Ls85;

    invoke-direct {v6, v5}, Ls85;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v5, LO85$x;

    invoke-direct {v5, p0}, LO85$x;-><init>(LO85;)V

    new-instance v7, Lv85;

    invoke-direct {v7, v5}, Lv85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v6, v7}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :goto_0
    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, LZS;->F2()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v5, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v5}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v5

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v5, LO85$y;

    invoke-direct {v5, p0}, LO85$y;-><init>(LO85;)V

    new-instance v6, Lw85;

    invoke-direct {v6, v5}, Lw85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_2
    iget-object v0, p0, LO85;->r:LQz1;

    invoke-interface {v0}, LQz1;->getData()LZ84;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v5

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v5, "frequentFlyerManager.dat\u2026dSchedulers.mainThread())"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v5}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v5

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v5, LO85$z;

    invoke-direct {v5, p0}, LO85$z;-><init>(LO85;)V

    new-instance v6, Lx85;

    invoke-direct {v6, v5}, Lx85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, Lhm5;->sa()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v5, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v5}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v5

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v5, LO85$A;

    invoke-direct {v5, p0}, LO85$A;-><init>(LO85;)V

    new-instance v6, Ly85;

    invoke-direct {v6, v5}, Ly85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, Lhm5;->z1()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v5, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v5}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v5

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v5, LO85$B;

    invoke-direct {v5, p0}, LO85$B;-><init>(LO85;)V

    new-instance v6, Lz85;

    invoke-direct {v6, v5}, Lz85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, Lhm5;->W3()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v5, LO85$C;

    invoke-direct {v5, p0}, LO85$C;-><init>(LO85;)V

    new-instance v6, LA85;

    invoke-direct {v6, v5}, LA85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v6}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v5}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v5

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v5, LO85$D;

    invoke-direct {v5, p0}, LO85$D;-><init>(LO85;)V

    new-instance v6, LB85;

    invoke-direct {v6, v5}, LB85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LO85;->i:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    iget-object v5, p0, LO85;->x:LZS;

    invoke-interface {v5}, Lhm5;->Vg()Lio/reactivex/Observable;

    move-result-object v5

    invoke-virtual {v5, v1, v2}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, LO85$i;

    invoke-direct {v2, v0, p0}, LO85$i;-><init>(Lco/bird/android/model/wire/configs/RideConfig;LO85;)V

    new-instance v5, LC85;

    invoke-direct {v5, v2}, LC85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v5}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getScannerCodeEntryTooltipMaxDuration()I

    move-result v2

    int-to-long v5, v2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v5, v6, v2}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LO85$j;

    invoke-direct {v2, p0, v0}, LO85$j;-><init>(LO85;Lco/bird/android/model/wire/configs/RideConfig;)V

    new-instance v0, LN85;

    invoke-direct {v0, v2}, LN85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LO85;->x:LZS;

    iget-object v1, p0, LO85;->i:LTq4;

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result v1

    invoke-interface {v0, v1}, Lhm5;->d2(I)V

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, Lhm5;->zc()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LO85$k;

    invoke-direct {v1, p0}, LO85$k;-><init>(LO85;)V

    new-instance v2, Lj85;

    invoke-direct {v2, v1}, Lj85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    sget-object v1, Lee3;->a:Lee3;

    iget-object v1, p0, LO85;->i:LTq4;

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    sget-object v2, LO85$l;->g:LO85$l;

    new-instance v5, Lk85;

    invoke-direct {v5, v2}, Lk85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v5}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "reactiveConfig.config\n  \u2026canlessRideStartScanner }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LO85;->t:LYR4;

    invoke-interface {v2}, LYR4;->o0()LZ84;

    move-result-object v2

    sget-object v5, LO85$m;->g:LO85$m;

    new-instance v6, Ll85;

    invoke-direct {v6, v5}, Ll85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v6}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v2

    const-string v5, "rideManager.rideStates\n \u2026it.activeRideCount == 0 }"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LO85$h;->a:LO85$h;

    invoke-static {v1, v2, v5}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LO85$n;->g:LO85$n;

    new-instance v5, Lm85;

    invoke-direct {v5, v2}, Lm85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v5}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, LO85$o;

    invoke-direct {v2, v0, p0}, LO85$o;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;LO85;)V

    new-instance v5, Ln85;

    invoke-direct {v5, v2}, Ln85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v5}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LO85;->j:Ldr4;

    invoke-interface {v2}, Ldr4;->p()LZ84;

    move-result-object v2

    invoke-static {v1, v2}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v1

    iget-object v2, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LO85$p;

    invoke-direct {v2, p0, v0}, LO85$p;-><init>(LO85;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    new-instance v0, Lo85;

    invoke-direct {v0, v2}, Lo85;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v2, LO85$q;->b:LO85$q;

    new-instance v5, Lp85;

    invoke-direct {v5, v2}, Lp85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v0, v5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, LZS;->Hh()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LO85;->s:LBl5;

    invoke-interface {v1}, LBl5;->e()LZ84;

    move-result-object v1

    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, LO85$r;->g:LO85$r;

    invoke-static {v0, v1}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LO85$s;

    invoke-direct {v1, p0}, LO85$s;-><init>(LO85;)V

    new-instance v2, Lq85;

    invoke-direct {v2, v1}, Lq85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LO85$u;

    invoke-direct {v1, p0}, LO85$u;-><init>(LO85;)V

    new-instance v2, Lr85;

    invoke-direct {v2, v1}, Lr85;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, LO85$v;->b:LO85$v;

    new-instance v3, Lu85;

    invoke-direct {v3, v1}, Lu85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {p0}, LO85;->N0()V

    iget-object v0, p0, LO85;->x:LZS;

    iget-object v1, p0, LO85;->w:Lco/bird/android/model/extra/RiderBirdScanExtra;

    invoke-virtual {v1}, Lco/bird/android/model/extra/RiderBirdScanExtra;->getBirdCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lhm5;->tc(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lem5;)V
    .locals 1

    const-string v0, "rawResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lem5;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LO85;->E0(Ljava/lang/String;Z)Z

    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onPause()V
    .locals 2

    iget-object v0, p0, LO85;->m:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "camera: onPause"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LO85;->C:Lio/reactivex/disposables/b;

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->dispose()V

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, Lhm5;->a1()V

    return-void
.end method

.method public onResume()V
    .locals 5

    iget-object v0, p0, LO85;->m:Landroid/hardware/SensorManager;

    iget-object v1, p0, LO85;->z:Landroid/hardware/Sensor;

    const v2, 0x989680

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "camera: onResume"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LO85;->x:LZS;

    const v1, 0x3e4ccccd    # 0.2f

    invoke-interface {v0, v1}, Lhm5;->d6(F)V

    iget-object v0, p0, LO85;->C:Lio/reactivex/disposables/b;

    iget-object v1, p0, LO85;->i:LTq4;

    invoke-virtual {v1}, LTq4;->k9()Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v1

    const-string v2, "reactiveConfig\n      .sh\u2026l()\n      .firstOrError()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v2, LO85$E;

    invoke-direct {v2, p0}, LO85$E;-><init>(LO85;)V

    new-instance v3, Li85;

    invoke-direct {v3, v2}, Li85;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v2, LO85$F;

    invoke-direct {v2, p0}, LO85$F;-><init>(LO85;)V

    new-instance v4, Lt85;

    invoke-direct {v4, v2}, Lt85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v3, v4}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/disposables/b;->c(Lio/reactivex/disposables/c;)Z

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, LO85;->A:LAG;

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget p1, p1, v1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final s0(Ljava/lang/Throwable;)V
    .locals 12

    instance-of v0, p1, Lco/bird/android/coreinterface/manager/PairException;

    if-eqz v0, :cond_0

    iget-object v1, p0, LO85;->x:LZS;

    sget-object v2, LtE3;->d:LtE3;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x7c

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, LaM5;->errorGeneric()V

    :goto_0
    iget-object v0, p0, LO85;->d:LEa;

    new-instance v11, LU55;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p1}, LQ36;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1}, LQ36;->b(Ljava/lang/Throwable;)Z

    move-result v6

    iget-object p1, p0, LO85;->i:LTq4;

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableAndroidScanToRide()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-object p1, p0, LO85;->t:LYR4;

    invoke-interface {p1}, LYR4;->o0()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RideStates;

    invoke-virtual {p1}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result p1

    int-to-long v8, p1

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, LU55;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual {p0}, LO85;->z0()V

    return-void
.end method

.method public final t0(LHM4;)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v6, p0

    invoke-virtual/range {p1 .. p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/android/model/BirdScan;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    invoke-virtual {v6, v0}, LO85;->P0(Lco/bird/android/model/wire/WireBird;)V

    iget-object v2, v6, LO85;->i:LTq4;

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v2

    iget-object v3, v6, LO85;->d:LEa;

    new-instance v4, LCa5;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getBirdCode()Ljava/lang/String;

    move-result-object v5

    const/16 v29, 0x0

    if-nez v5, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object/from16 v11, v29

    goto :goto_1

    :cond_1
    :goto_0
    move-object v11, v5

    :goto_1
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    move-object v12, v5

    goto :goto_2

    :cond_2
    move-object/from16 v12, v29

    :goto_2
    iget-object v5, v6, LO85;->i:LTq4;

    invoke-virtual {v5}, LTq4;->f8()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getMinimumRidePrice()J

    move-result-wide v14

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getMinutePrice()J

    move-result-wide v16

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getIncludedMinutes()I

    move-result v5

    move-object/from16 v18, v11

    int-to-long v10, v5

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v20, v5

    goto :goto_3

    :cond_3
    move-object/from16 v20, v29

    :goto_3
    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getAdditionalFees()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;->getApplyTax()Z

    move-result v21

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getBasePrice()J

    move-result-wide v22

    iget-object v2, v6, LO85;->c:Lgl;

    invoke-virtual {v2}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v2

    invoke-static {v2}, Lco/bird/android/model/UserKt;->isInRegistration(Lco/bird/android/model/User;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v24

    iget-object v2, v6, LO85;->B:LAG;

    invoke-virtual {v2}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lak5;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v25, v2

    goto :goto_4

    :cond_4
    move-object/from16 v25, v29

    :goto_4
    const/16 v26, 0x0

    const/16 v27, 0x4007

    const/16 v28, 0x0

    move-object v7, v4

    move-wide/from16 v30, v10

    const/4 v2, 0x0

    move-object v10, v2

    move-object/from16 v11, v18

    move-wide/from16 v18, v30

    invoke-direct/range {v7 .. v28}, LCa5;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;ZJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v4}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual {v6, v1}, LO85;->P(Lco/bird/android/model/BirdScan;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-void

    :cond_5
    invoke-virtual {v6, v1}, LO85;->w0(Lco/bird/android/model/BirdScan;)Z

    move-result v2

    if-eqz v2, :cond_6

    return-void

    :cond_6
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v2

    invoke-virtual {v6, v2}, LO85;->R(Lco/bird/android/model/constant/ScanStatus;)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v0, :cond_7

    invoke-virtual {v6, v0}, LO85;->T0(Lco/bird/android/model/wire/WireBird;)V

    iget-object v7, v6, LO85;->x:LZS;

    sget-object v8, LuE3;->d:LuE3;

    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v11, LO85$G;

    invoke-direct {v11, v6, v1}, LO85$G;-><init>(LO85;Lco/bird/android/model/BirdScan;)V

    const/4 v12, 0x0

    new-instance v13, LO85$H;

    invoke-direct {v13, v6, v1}, LO85$H;-><init>(LO85;Lco/bird/android/model/BirdScan;)V

    const/4 v14, 0x0

    const/16 v15, 0x54

    const/16 v16, 0x0

    invoke-static/range {v7 .. v16}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_5

    :cond_7
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v0

    invoke-virtual {v6, v0}, LO85;->T(Lco/bird/android/model/constant/ScanStatus;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    iget-object v3, v6, LO85;->i:LTq4;

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxRideDurationSecondsOutsideOperatingArea()I

    move-result v3

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v3

    long-to-int v0, v3

    iget-object v3, v6, LO85;->x:LZS;

    sget-object v4, Lxx1;->a:Lxx1;

    iget-object v5, v6, LO85;->b:Landroid/content/Context;

    invoke-virtual {v4, v5, v0, v2}, Lxx1;->k(Landroid/content/Context;IZ)Ljava/lang/String;

    move-result-object v0

    new-instance v2, LO85$I;

    invoke-direct {v2, v6, v1}, LO85$I;-><init>(LO85;Lco/bird/android/model/BirdScan;)V

    new-instance v1, LO85$J;

    invoke-direct {v1, v6}, LO85$J;-><init>(LO85;)V

    new-instance v4, LO85$K;

    invoke-direct {v4, v6}, LO85$K;-><init>(LO85;)V

    invoke-interface {v3, v0, v2, v1, v4}, LZS;->Q3(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    goto/16 :goto_5

    :cond_8
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v0

    invoke-virtual {v6, v0}, LO85;->S(Lco/bird/android/model/constant/ScanStatus;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    iget-object v3, v6, LO85;->i:LTq4;

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxRideDurationSecondsNoRideZone()I

    move-result v3

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v3

    long-to-int v0, v3

    iget-object v3, v6, LO85;->x:LZS;

    sget-object v4, Lxx1;->a:Lxx1;

    iget-object v5, v6, LO85;->b:Landroid/content/Context;

    invoke-virtual {v4, v5, v0, v2}, Lxx1;->k(Landroid/content/Context;IZ)Ljava/lang/String;

    move-result-object v0

    new-instance v2, LO85$L;

    invoke-direct {v2, v6, v1}, LO85$L;-><init>(LO85;Lco/bird/android/model/BirdScan;)V

    new-instance v1, LO85$M;

    invoke-direct {v1, v6}, LO85$M;-><init>(LO85;)V

    new-instance v4, LO85$N;

    invoke-direct {v4, v6}, LO85$N;-><init>(LO85;)V

    invoke-interface {v3, v0, v2, v1, v4}, LZS;->we(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v0

    invoke-virtual {v6, v0}, LO85;->J(Lco/bird/android/model/constant/ScanStatus;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual/range {p0 .. p0}, LO85;->L0()V

    goto :goto_5

    :cond_a
    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getMode()Lco/bird/android/model/constant/ScanMode;

    move-result-object v0

    invoke-virtual {v1}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v2

    iget-object v3, v6, LO85;->i:LTq4;

    invoke-static {v0, v2, v3}, LOy;->a(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanStatus;LTq4;)LNy;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v6, v0}, LO85;->J0(LNy;)V

    sget-object v29, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_b
    if-nez v29, :cond_d

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, LO85;->M(LO85;Lco/bird/android/model/BirdScan;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    goto :goto_5

    :cond_c
    invoke-static/range {p1 .. p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ltg1;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v1, v6, LO85;->x:LZS;

    invoke-interface {v1, v0}, LaM5;->error(Ljava/lang/String;)V

    :cond_d
    :goto_5
    return-void
.end method

.method public final u0(LHM4;)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;)",
            "Lio/reactivex/Observable<",
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/BirdScan;

    const-string v1, "just(scanResponse)"

    if-nez v0, :cond_0

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/BirdScan;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-virtual {v0}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v3

    invoke-virtual {p0, v3}, LO85;->R(Lco/bird/android/model/constant/ScanStatus;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object p1, p0, LO85;->l:Lq54;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lq54;->r(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    new-instance v1, LO85$O;

    invoke-direct {v1, v2, v0}, LO85$O;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/BirdScan;)V

    new-instance v0, LH85;

    invoke-direct {v0, v1}, LH85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "responseBody = scanRespo\u2026dScanResponse))\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public final w0(Lco/bird/android/model/BirdScan;)Z
    .locals 11

    iget-object v0, p0, LO85;->u:LMD;

    invoke-interface {v0}, LMD;->b()LMD$b;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/BirdScan;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getPhysicalLock()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/BirdScan;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getPhysicalLock()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v2

    :cond_1
    sget-object v1, Lco/bird/android/model/constant/PhysicalLockPurpose;->HELMET:Lco/bird/android/model/constant/PhysicalLockPurpose;

    if-eq v2, v1, :cond_3

    sget-object v1, LMD$b;->f:LMD$b;

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v4

    goto :goto_2

    :cond_3
    :goto_1
    move v1, v3

    :goto_2
    iget-object v2, p0, LO85;->i:LTq4;

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getForceBtPermissionByModel()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/BirdScan;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    move p1, v3

    goto :goto_3

    :cond_4
    move p1, v4

    :goto_3
    if-nez p1, :cond_5

    sget-object p1, LMD$b;->f:LMD$b;

    if-ne v0, p1, :cond_5

    goto :goto_4

    :cond_5
    move p1, v4

    goto :goto_5

    :cond_6
    :goto_4
    move p1, v3

    :goto_5
    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    return v4

    :cond_7
    new-instance p1, LYX;

    invoke-direct {p1, v0}, LYX;-><init>(LMD$b;)V

    iget-object v5, p0, LO85;->x:LZS;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v6, p1

    invoke-static/range {v5 .. v10}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, LO85;->v:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v1, LO85$P;

    invoke-direct {v1, p1, p0}, LO85$P;-><init>(LYX;LO85;)V

    new-instance p1, LK85;

    invoke-direct {p1, v1}, LK85;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, LO85$Q;->b:LO85$Q;

    new-instance v2, LL85;

    invoke-direct {v2, v1}, LL85;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, p1, v2}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return v3
.end method

.method public final z0()V
    .locals 1

    iget-boolean v0, p0, LO85;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0, p0}, Lhm5;->l5(Lfm5;)V

    :cond_0
    iget-object v0, p0, LO85;->x:LZS;

    invoke-interface {v0}, Lhm5;->n1()V

    return-void
.end method
