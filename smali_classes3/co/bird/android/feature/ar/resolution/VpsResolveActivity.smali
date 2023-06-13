.class public final Lco/bird/android/feature/ar/resolution/VpsResolveActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LYv6;
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ec\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\u00a2\u0006\u0006\u0008\u0093\u0001\u0010\u0094\u0001J\u0012\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0008\u0010\u000f\u001a\u00020\u0006H\u0014J\u0008\u0010\u0010\u001a\u00020\u0006H\u0014J\u0008\u0010\u0011\u001a\u00020\u0006H\u0014J\u0008\u0010\u0012\u001a\u00020\u0006H\u0014J\u0008\u0010\u0013\u001a\u00020\u0006H\u0014J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H\u0014J\u0008\u0010\u0016\u001a\u00020\u0006H\u0016J\u0012\u0010\u0019\u001a\u00020\u00062\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001d\u001a\u00020\u00062\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\"\u0010[\u001a\u0010\u0012\u000c\u0012\n X*\u0004\u0018\u00010W0W0V8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\"\u0010^\u001a\u0010\u0012\u000c\u0012\n X*\u0004\u0018\u00010\\0\\0V8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010ZR\u001d\u0010c\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008_\u0010`\u001a\u0004\u0008a\u0010bR.\u0010i\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020f X*\n\u0012\u0004\u0012\u00020f\u0018\u00010e0e0d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008g\u0010hR\u001b\u0010m\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008j\u0010`\u001a\u0004\u0008k\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008s\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010tR\'\u0010}\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020y0e0x8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008z\u0010`\u001a\u0004\u0008{\u0010|R0\u0010\u0082\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u007f0~0e0x8VX\u0096\u0084\u0002\u00a2\u0006\u000e\n\u0005\u0008\u0080\u0001\u0010`\u001a\u0005\u0008\u0081\u0001\u0010|R+\u0010\u0086\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00010e0x8VX\u0096\u0084\u0002\u00a2\u0006\u000e\n\u0005\u0008\u0084\u0001\u0010`\u001a\u0005\u0008\u0085\u0001\u0010|R&\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020W0\u0087\u00018VX\u0096\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u0088\u0001\u0010`\u001a\u0006\u0008\u0089\u0001\u0010\u008a\u0001R&\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0087\u00018VX\u0096\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u008c\u0001\u0010`\u001a\u0006\u0008\u008d\u0001\u0010\u008a\u0001R9\u0010\u0092\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020f X*\n\u0012\u0004\u0012\u00020f\u0018\u00010e0e0d8VX\u0096\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u008f\u0001\u0010`\u001a\u0006\u0008\u0090\u0001\u0010\u0091\u0001\u00a8\u0006\u0097\u0001\u00b2\u0006\u0010\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lco/bird/android/feature/ar/resolution/VpsResolveActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LYv6;",
        "Landroid/hardware/SensorEventListener;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "b0",
        "",
        "resultRequired",
        "j0",
        "LZv6;",
        "state",
        "h0",
        "onCreate",
        "onStart",
        "onResume",
        "onPause",
        "onStop",
        "onDestroy",
        "outState",
        "onSaveInstanceState",
        "onLowMemory",
        "Landroid/hardware/SensorEvent;",
        "p0",
        "onSensorChanged",
        "Landroid/hardware/Sensor;",
        "",
        "p1",
        "onAccuracyChanged",
        "LWv6;",
        "j",
        "LWv6;",
        "Y",
        "()LWv6;",
        "setPresenter",
        "(LWv6;)V",
        "presenter",
        "Landroid/hardware/SensorManager;",
        "k",
        "Landroid/hardware/SensorManager;",
        "Z",
        "()Landroid/hardware/SensorManager;",
        "setSensorManager",
        "(Landroid/hardware/SensorManager;)V",
        "sensorManager",
        "LRh6;",
        "l",
        "LRh6;",
        "getUserStream",
        "()LRh6;",
        "setUserStream",
        "(LRh6;)V",
        "userStream",
        "LOh;",
        "m",
        "LOh;",
        "getAppBuildConfig",
        "()LOh;",
        "setAppBuildConfig",
        "(LOh;)V",
        "appBuildConfig",
        "Lgl;",
        "n",
        "Lgl;",
        "getAppPreference",
        "()Lgl;",
        "setAppPreference",
        "(Lgl;)V",
        "appPreference",
        "Lt6;",
        "o",
        "Lt6;",
        "binding",
        "Lco/bird/android/feature/ar/view/VpsView;",
        "p",
        "Lco/bird/android/feature/ar/view/VpsView;",
        "vpsView",
        "Lco/bird/android/model/wire/WireBird;",
        "q",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "",
        "r",
        "Ljava/lang/String;",
        "rideId",
        "Lio/reactivex/subjects/d;",
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "s",
        "Lio/reactivex/subjects/d;",
        "response",
        "Lco/bird/android/model/GravityVector;",
        "t",
        "gravityVectorSubject",
        "u",
        "Lkotlin/Lazy;",
        "X",
        "()Landroid/hardware/Sensor;",
        "gravitySensor",
        "Lio/reactivex/subjects/a;",
        "Lco/bird/android/buava/Optional;",
        "Lcom/google/ar/core/ArCoreApk$InstallStatus;",
        "v",
        "Lio/reactivex/subjects/a;",
        "installStatus",
        "w",
        "U",
        "()Z",
        "debugging",
        "LcD1;",
        "x",
        "LcD1;",
        "googleMap",
        "LfM2;",
        "y",
        "LfM2;",
        "arCoreLocationMarker",
        "z",
        "deviceLocationMarker",
        "LZ84;",
        "Lcom/google/ar/core/Earth;",
        "A",
        "r9",
        "()LZ84;",
        "earth",
        "",
        "LBx;",
        "B",
        "A6",
        "barcodeUpdates",
        "Lcom/google/ar/core/Session;",
        "C",
        "C4",
        "session",
        "Lio/reactivex/Observable;",
        "D",
        "L8",
        "()Lio/reactivex/Observable;",
        "errorDialogResponse",
        "E",
        "E8",
        "sensorChanged",
        "F",
        "S",
        "()Lio/reactivex/subjects/a;",
        "arCoreInstallStatus",
        "<init>",
        "()V",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "deviceLocation",
        "co.bird.android.feature.ar-parking"
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
        "SMAP\nVpsResolveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsResolveActivity.kt\nco/bird/android/feature/ar/resolution/VpsResolveActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,306:1\n1#2:307\n199#3:308\n*S KotlinDebug\n*F\n+ 1 VpsResolveActivity.kt\nco/bird/android/feature/ar/resolution/VpsResolveActivity\n*L\n301#1:308\n*E\n"
    }
.end annotation


# instance fields
.field public final A:Lkotlin/Lazy;

.field public final B:Lkotlin/Lazy;

.field public final C:Lkotlin/Lazy;

.field public final D:Lkotlin/Lazy;

.field public final E:Lkotlin/Lazy;

.field public final F:Lkotlin/Lazy;

.field public j:LWv6;

.field public k:Landroid/hardware/SensorManager;

.field public l:LRh6;

.field public m:LOh;

.field public n:Lgl;

.field public o:Lt6;

.field public p:Lco/bird/android/feature/ar/view/VpsView;

.field public q:Lco/bird/android/model/wire/WireBird;

.field public r:Ljava/lang/String;

.field public final s:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/model/GravityVector;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Lkotlin/Lazy;

.field public final v:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/buava/Optional<",
            "Lcom/google/ar/core/ArCoreApk$InstallStatus;",
            ">;>;"
        }
    .end annotation
.end field

.field public final w:Lkotlin/Lazy;

.field public x:LcD1;

.field public y:LfM2;

.field public z:LfM2;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<DialogResponse>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->s:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<GravityVector>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->t:Lio/reactivex/subjects/d;

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$f;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$f;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->u:Lkotlin/Lazy;

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/subjects/a;->g(Ljava/lang/Object;)Lio/reactivex/subjects/a;

    move-result-object v0

    const-string v1, "createDefault(Optional.a\u2026CoreApk.InstallStatus>())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->v:Lio/reactivex/subjects/a;

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$c;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->w:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$d;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$d;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->A:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$b;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->B:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$k;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$k;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->C:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$e;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$e;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->D:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$j;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$j;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->E:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$a;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->F:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic P(LbM2$a;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->d0(LbM2$a;)V

    return-void
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic R(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;LcD1;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->f0(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;LcD1;)V

    return-void
.end method

.method public static final synthetic access$getBird$p(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)Lco/bird/android/model/wire/WireBird;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->q:Lco/bird/android/model/wire/WireBird;

    return-object p0
.end method

.method public static final synthetic access$getGravityVectorSubject$p(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->t:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getInstallStatus$p(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->v:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getResponse$p(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->s:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getVpsView$p(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)Lco/bird/android/feature/ar/view/VpsView;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->p:Lco/bird/android/feature/ar/view/VpsView;

    return-object p0
.end method

.method public static final d0(LbM2$a;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initialized maps with renderer: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final f0(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;LcD1;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->x:LcD1;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v3, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    const-string v4, "ARCore Location"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v4, v1, v2, v1, v2}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    invoke-virtual {p1, v3}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->y:LfM2;

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->x:LcD1;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    const-string v3, "Device Location"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v3, v1, v2, v1, v2}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->s(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p1, v0}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->z:LfM2;

    return-void
.end method

.method public static final i0(Lkotlin/Lazy;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lcom/google/android/gms/maps/model/LatLng;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method public static final k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A6()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/List<",
            "LBx;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->B:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public C4()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lcom/google/ar/core/Session;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->C:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public E8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/GravityVector;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->E:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-sensorChanged>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public L8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->D:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-errorDialogResponse>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public S()Lio/reactivex/subjects/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/buava/Optional<",
            "Lcom/google/ar/core/ArCoreApk$InstallStatus;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->F:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/subjects/a;

    return-object v0
.end method

.method public final U()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->w:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final X()Landroid/hardware/Sensor;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->u:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Sensor;

    return-object v0
.end method

.method public final Y()LWv6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->j:LWv6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Z()Landroid/hardware/SensorManager;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->k:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sensorManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b0(Landroid/os/Bundle;)V
    .locals 6

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    const-string v1, "binding"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    iget-object v0, v0, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    const-string v3, "binding.mapView"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    invoke-static {v0, v5, v3, v4, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    sget-object v0, LbM2$a;->c:LbM2$a;

    new-instance v3, Ltv6;

    invoke-direct {v3}, Ltv6;-><init>()V

    invoke-static {p0, v0, v3}, LbM2;->b(Landroid/content/Context;LbM2$a;LVg3;)I

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    iget-object v0, v0, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView;->b(Landroid/os/Bundle;)V

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, p1

    :goto_0
    iget-object p1, v2, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    new-instance v0, Luv6;

    invoke-direct {v0, p0}, Luv6;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/MapView;->a(LUg3;)V

    return-void
.end method

.method public bridge synthetic getArCoreInstallStatus()Lio/reactivex/Observable;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->S()Lio/reactivex/subjects/a;

    move-result-object v0

    return-object v0
.end method

.method public h0(LZv6;)V
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LEU0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "binding"

    const/4 v4, 0x0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_0
    iget-object v0, v0, Lt6;->c:Landroid/widget/TextView;

    const-string v5, "binding.debug"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_1
    iget-object v0, v0, Lt6;->c:Landroid/widget/TextView;

    move-object v3, p1

    check-cast v3, LEU0;

    invoke-virtual {v3}, LEU0;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, LEU0;->c()Lcom/google/ar/core/Earth;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/ar/core/Earth;->getCameraGeospatialPose()Lcom/google/ar/core/GeospatialPose;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/google/ar/core/GeospatialPose;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v0}, Lcom/google/ar/core/GeospatialPose;->getLongitude()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    :cond_2
    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$i;

    invoke-direct {v0, p1}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$i;-><init>(LZv6;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    if-eqz v4, :cond_a

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->y:LfM2;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0, v4}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_0
    invoke-static {p1}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->i0(Lkotlin/Lazy;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v3, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->z:LfM2;

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v3, v0}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_5
    :goto_1
    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->y:LfM2;

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v0, v1}, LfM2;->r(Z)V

    :goto_2
    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->z:LfM2;

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {p1}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->i0(Lkotlin/Lazy;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    if-eqz p1, :cond_8

    move p1, v1

    goto :goto_3

    :cond_8
    move p1, v2

    :goto_3
    invoke-virtual {v0, p1}, LfM2;->r(Z)V

    :goto_4
    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->x:LcD1;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, LcD1;->k()LU74;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, LU74;->b()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object p1, p1, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    if-eqz p1, :cond_9

    invoke-virtual {p1, v4}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p1

    if-ne p1, v1, :cond_9

    goto :goto_5

    :cond_9
    move v1, v2

    :goto_5
    if-nez v1, :cond_26

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->x:LcD1;

    if-eqz p1, :cond_26

    const/high16 v0, 0x41880000    # 17.0f

    invoke-static {v4, v0}, Lrc0;->e(Lcom/google/android/gms/maps/model/LatLng;F)Lqc0;

    move-result-object v0

    invoke-virtual {p1, v0}, LcD1;->m(Lqc0;)V

    goto/16 :goto_e

    :cond_a
    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->y:LfM2;

    if-nez p1, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {p1, v2}, LfM2;->r(Z)V

    :goto_6
    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->z:LfM2;

    if-nez p1, :cond_c

    goto/16 :goto_e

    :cond_c
    invoke-virtual {p1, v2}, LfM2;->r(Z)V

    goto/16 :goto_e

    :cond_d
    instance-of v0, p1, Lbw6;

    if-eqz v0, :cond_e

    goto :goto_7

    :cond_e
    instance-of v1, p1, Lx;

    :goto_7
    const-string v0, "binding.qrCodeOverlay"

    const-string v5, "binding.buildingsOverlay"

    const-string v6, "vpsView"

    if-eqz v1, :cond_13

    const-string p1, "Attempting to set VPS AR Core session to geospatialMode enabled"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->p:Lco/bird/android/feature/ar/view/VpsView;

    if-nez p1, :cond_f

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_f
    sget-object v1, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$g;->g:Lco/bird/android/feature/ar/resolution/VpsResolveActivity$g;

    invoke-virtual {p1, v1}, Lco/bird/android/feature/ar/view/VpsView;->d1(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_10

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_10
    iget-object p1, p1, Lt6;->e:Lco/bird/android/feature/ar/resolution/ScanResolutionView;

    sget v1, Lnl4;->vps_scan_directions:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(L.string.vps_scan_directions)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lrg4;->ic_scan_surround:I

    invoke-static {p0, v2}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p1, v4, v1, v2}, Lco/bird/android/feature/ar/resolution/ScanResolutionView;->e(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_11

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_11
    iget-object p1, p1, Lt6;->b:Landroid/widget/ImageView;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_12

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_8

    :cond_12
    move-object v4, p1

    :goto_8
    iget-object p1, v4, Lt6;->i:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    goto/16 :goto_e

    :cond_13
    instance-of v1, p1, LpA5;

    if-eqz v1, :cond_18

    const-string p1, "Attempting to set VPS AR Core session to geospatialMode disabled"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->p:Lco/bird/android/feature/ar/view/VpsView;

    if-nez p1, :cond_14

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_14
    sget-object v1, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$h;->g:Lco/bird/android/feature/ar/resolution/VpsResolveActivity$h;

    invoke-virtual {p1, v1}, Lco/bird/android/feature/ar/view/VpsView;->d1(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_15

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_15
    iget-object p1, p1, Lt6;->e:Lco/bird/android/feature/ar/resolution/ScanResolutionView;

    sget v1, Lnl4;->scan_qr_code_arcore_parking_title:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lnl4;->scan_qr_code_arcore_parking_description:I

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v6, "getString(L.string.scan_\u2026core_parking_description)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v6, Lrg4;->ic_qr_code_alt:I

    invoke-static {p0, v6}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {p1, v1, v2, v6}, Lco/bird/android/feature/ar/resolution/ScanResolutionView;->e(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_16

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_16
    iget-object p1, p1, Lt6;->i:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_17

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_9

    :cond_17
    move-object v4, p1

    :goto_9
    iget-object p1, v4, Lt6;->b:Landroid/widget/ImageView;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    goto/16 :goto_e

    :cond_18
    instance-of v0, p1, LH32;

    if-eqz v0, :cond_1a

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_19

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_a

    :cond_19
    move-object v4, p1

    :goto_a
    iget-object p1, v4, Lt6;->d:Landroid/widget/ImageView;

    const-string v0, "binding.inside"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    goto/16 :goto_e

    :cond_1a
    instance-of v0, p1, LkA3;

    if-eqz v0, :cond_1c

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_1b

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_b

    :cond_1b
    move-object v4, p1

    :goto_b
    iget-object p1, v4, Lt6;->g:Landroid/widget/ImageView;

    const-string v0, "binding.outside"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    goto/16 :goto_e

    :cond_1c
    instance-of v0, p1, LpH6;

    if-eqz v0, :cond_1d

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    sget v0, Lnl4;->wrong_bird_dialog_title:I

    sget-object v1, Lf56;->d:Lf56;

    invoke-virtual {p1, v0, v1}, LXC;->topToast(ILf56;)V

    goto/16 :goto_e

    :cond_1d
    instance-of v0, p1, Law6;

    if-eqz v0, :cond_1e

    check-cast p1, Law6;

    invoke-virtual {p1}, Law6;->b()Z

    move-result p1

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->j0(Z)V

    goto/16 :goto_e

    :cond_1e
    instance-of v0, p1, LQC2;

    if-eqz v0, :cond_20

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_1f

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_c

    :cond_1f
    move-object v4, p1

    :goto_c
    iget-object p1, v4, Lt6;->b:Landroid/widget/ImageView;

    sget v0, Lrg4;->ic_turn_up:I

    invoke-static {p0, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_e

    :cond_20
    instance-of v0, p1, LPC2;

    if-eqz v0, :cond_22

    iget-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez p1, :cond_21

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_d

    :cond_21
    move-object v4, p1

    :goto_d
    iget-object p1, v4, Lt6;->b:Landroid/widget/ImageView;

    sget v0, Lrg4;->ic_turn_left_and_right:I

    invoke-static {p0, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_e

    :cond_22
    instance-of v0, p1, LBd6;

    if-eqz v0, :cond_23

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    sget v0, Lnl4;->scan_surroundings_unavailable_description:I

    invoke-virtual {p1, v0}, LXC;->warn(I)V

    goto :goto_e

    :cond_23
    instance-of v0, p1, LKt4;

    if-eqz v0, :cond_25

    check-cast p1, LKt4;

    invoke-virtual {p1}, LKt4;->b()Z

    move-result p1

    if-eqz p1, :cond_24

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->Z()Landroid/hardware/SensorManager;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->X()Landroid/hardware/Sensor;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p1, p0, v0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;II)Z

    goto :goto_e

    :cond_24
    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->Z()Landroid/hardware/SensorManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    goto :goto_e

    :cond_25
    instance-of v0, p1, LRI4;

    if-eqz v0, :cond_26

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->S()Lio/reactivex/subjects/a;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-static {}, Lcom/google/ar/core/ArCoreApk;->getInstance()Lcom/google/ar/core/ArCoreApk;

    move-result-object v2

    check-cast p1, LRI4;

    invoke-virtual {p1}, LRI4;->b()Z

    move-result p1

    invoke-virtual {v2, p0, p1}, Lcom/google/ar/core/ArCoreApk;->requestInstall(Landroid/app/Activity;Z)Lcom/google/ar/core/ArCoreApk$InstallStatus;

    move-result-object p1

    const-string v2, "getInstance().requestIns\u2026(this, state.userRequest)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_26
    :goto_e
    return-void
.end method

.method public final j0(Z)V
    .locals 4

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-virtual {v0}, LXC;->dialogShown()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    new-instance v1, LUH3;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3, v2, v3}, LUH3;-><init>(ZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1, p1}, LXC;->birdDialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$l;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$l;-><init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    new-instance v1, Lvv6;

    invoke-direct {v1, v0}, Lvv6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "private fun showCannotDe\u2026   .subscribe()\n    }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_0
    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 9

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "bird"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->q:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "ride_id"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->r:Ljava/lang/String;

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->q:Lco/bird/android/model/wire/WireBird;

    const/4 v2, 0x0

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getStickerId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-static {}, Lco/bird/android/feature/ar/resolution/a;->a()Lco/bird/android/feature/ar/resolution/b$a;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->x()LDQ3;

    move-result-object v6

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->q:Lco/bird/android/model/wire/WireBird;

    if-nez v0, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v2

    goto :goto_0

    :cond_4
    move-object v7, v0

    :goto_0
    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->r:Ljava/lang/String;

    if-nez v0, :cond_5

    const-string v0, "rideId"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v2

    goto :goto_1

    :cond_5
    move-object v8, v0

    :goto_1
    move-object v5, p0

    invoke-interface/range {v3 .. v8}, Lco/bird/android/feature/ar/resolution/b$a;->a(LlG2;Landroid/app/Activity;LDQ3;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)Lco/bird/android/feature/ar/resolution/b;

    move-result-object v0

    invoke-interface {v0, p0}, Lco/bird/android/feature/ar/resolution/b;->a(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lt6;->c(Landroid/view/LayoutInflater;)Lt6;

    move-result-object v0

    const-string v1, "inflate(layoutInflater)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    const-string v1, "binding"

    if-nez v0, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_6
    invoke-virtual {v0}, Lt6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v2, v0

    :goto_2
    iget-object v0, v2, Lt6;->j:Lco/bird/android/feature/ar/view/VpsView;

    const-string v1, "binding.vpsView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->p:Lco/bird/android/feature/ar/view/VpsView;

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->U()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->b0(Landroid/os/Bundle;)V

    :cond_8
    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->c()V

    :cond_1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->d()V

    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->e()V

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->Y()LWv6;

    move-result-object v0

    invoke-virtual {v0}, LWv6;->s0()V

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->Z()Landroid/hardware/SensorManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->f()V

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->Y()LWv6;

    move-result-object v0

    invoke-virtual {v0, p0}, LWv6;->N(LYv6;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView;->g(Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 6

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->t:Lio/reactivex/subjects/d;

    new-instance v1, Lco/bird/android/model/GravityVector;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz v3, :cond_0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lkotlin/collections/ArraysKt;->getOrNull([FI)Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object v4, p1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz v4, :cond_1

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lkotlin/collections/ArraysKt;->getOrNull([FI)Ljava/lang/Float;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz p1, :cond_2

    const/4 v5, 0x2

    invoke-static {p1, v5}, Lkotlin/collections/ArraysKt;->getOrNull([FI)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :cond_2
    invoke-direct {v1, v3, v4, v2}, Lco/bird/android/model/GravityVector;-><init>(FFF)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->h()V

    :cond_1
    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->o:Lt6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lt6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->i()V

    :cond_1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    return-void
.end method

.method public r9()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lcom/google/ar/core/Earth;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->A:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LZv6;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->h0(LZv6;)V

    return-void
.end method
