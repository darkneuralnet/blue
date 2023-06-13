.class public abstract Lco/bird/android/core/mvp/BaseActivity;
.super Lco/bird/android/core/base/BaseCoreActivity;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/core/mvp/BaseActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/core/base/BaseCoreActivity;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
        "LRE;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008&\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u00d6\u0001B+\u0012\u0008\u0008\u0002\u0010,\u001a\u00020\u0011\u0012\n\u0008\u0003\u0010/\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u0016J\n\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J-\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0008\u0010#\u001a\u00020\u000bH\u0014J\u0008\u0010$\u001a\u00020\u000bH\u0014J\u0008\u0010%\u001a\u00020\u000bH\u0016J\u0010\u0010\'\u001a\u00020\u000b2\u0008\u0010&\u001a\u0004\u0018\u00010\u0019R\u0017\u0010,\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0019\u00104\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u001a\u0010:\u001a\u0002058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R!\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008)\u0010=R\"\u0010F\u001a\u00020?8\u0016@\u0016X\u0097.\u00a2\u0006\u0012\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ER\"\u0010N\u001a\u00020G8\u0016@\u0016X\u0096.\u00a2\u0006\u0012\n\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MR\"\u0010V\u001a\u00020O8\u0016@\u0016X\u0097.\u00a2\u0006\u0012\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010S\"\u0004\u0008T\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[\"\u0004\u0008\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008`\u0010a\u001a\u0004\u0008b\u0010c\"\u0004\u0008d\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008h\u0010i\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008p\u0010q\u001a\u0004\u0008r\u0010s\"\u0004\u0008t\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008x\u0010y\u001a\u0004\u0008z\u0010{\"\u0004\u0008|\u0010}R)\u0010\u0086\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\"\u0006\u0008\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001\u001a\u0006\u0008\u008a\u0001\u0010\u008b\u0001\"\u0006\u0008\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001\u001a\u0006\u0008\u0092\u0001\u0010\u0093\u0001\"\u0006\u0008\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001\"\u0006\u0008\u009c\u0001\u0010\u009d\u0001R*\u0010\u00a6\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001\u001a\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001\"\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R*\u0010\u00ae\u0001\u001a\u00030\u00a7\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001\u001a\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001\"\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001R*\u0010\u00b6\u0001\u001a\u00030\u00af\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001\u001a\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001\"\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001R)\u0010\u00bd\u0001\u001a\u00030\u00b7\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0017\n\u0005\u0008B\u0010\u00b8\u0001\u001a\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001\"\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001R)\u0010\u00c4\u0001\u001a\u00030\u00be\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0017\n\u0005\u0008J\u0010\u00bf\u0001\u001a\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001\"\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001R)\u0010\u00cb\u0001\u001a\u00030\u00c5\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0017\n\u0005\u0008R\u0010\u00c6\u0001\u001a\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001\"\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001R\u001b\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00cc\u0001\u0010\u00cd\u0001R\'\u0010\u00d3\u0001\u001a\u0012\u0012\r\u0012\u000b \u00d0\u0001*\u0004\u0018\u00010\u00030\u00030\u00cf\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001\u00a8\u0006\u00d7\u0001"
    }
    d2 = {
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Lco/bird/android/core/base/BaseCoreActivity;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "Lio/reactivex/Observable;",
        "c2",
        "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;",
        "O8",
        "f0",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "d0",
        "i0",
        "Landroid/view/Menu;",
        "menu",
        "",
        "onCreateOptionsMenu",
        "Landroid/view/MenuItem;",
        "item",
        "onOptionsItemSelected",
        "",
        "requestCode",
        "",
        "",
        "permissions",
        "",
        "grantResults",
        "onRequestPermissionsResult",
        "(I[Ljava/lang/String;[I)V",
        "LG2;",
        "mode",
        "onSupportActionModeStarted",
        "onSupportActionModeFinished",
        "onDestroy",
        "onPause",
        "D",
        "message",
        "E",
        "c",
        "Z",
        "getNoActionBar",
        "()Z",
        "noActionBar",
        "d",
        "Ljava/lang/Integer;",
        "actionBarTitle",
        "e",
        "Ljava/lang/Boolean;",
        "getLightTheme",
        "()Ljava/lang/Boolean;",
        "lightTheme",
        "LJy;",
        "f",
        "LJy;",
        "Q",
        "()LJy;",
        "kind",
        "g",
        "Lkotlin/Lazy;",
        "()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "scopeProvider",
        "Le13;",
        "h",
        "Le13;",
        "w",
        "()Le13;",
        "setNavigator",
        "(Le13;)V",
        "navigator",
        "LDQ3;",
        "i",
        "LDQ3;",
        "x",
        "()LDQ3;",
        "h0",
        "(LDQ3;)V",
        "permissionManager",
        "LTq4;",
        "j",
        "LTq4;",
        "y",
        "()LTq4;",
        "setReactiveConfig",
        "(LTq4;)V",
        "reactiveConfig",
        "Landroid/os/Handler;",
        "k",
        "Landroid/os/Handler;",
        "S",
        "()Landroid/os/Handler;",
        "setMainHandler",
        "(Landroid/os/Handler;)V",
        "mainHandler",
        "Lgl;",
        "l",
        "Lgl;",
        "X",
        "()Lgl;",
        "setPreference",
        "(Lgl;)V",
        "preference",
        "LEa;",
        "m",
        "LEa;",
        "F",
        "()LEa;",
        "setAnalyticsManager",
        "(LEa;)V",
        "analyticsManager",
        "LEg1;",
        "n",
        "LEg1;",
        "M",
        "()LEg1;",
        "setEventBus",
        "(LEg1;)V",
        "eventBus",
        "Llh6;",
        "o",
        "Llh6;",
        "b0",
        "()Llh6;",
        "setUserManager",
        "(Llh6;)V",
        "userManager",
        "Llg6;",
        "p",
        "Llg6;",
        "getAgreementManager",
        "()Llg6;",
        "setAgreementManager",
        "(Llg6;)V",
        "agreementManager",
        "Lqi1;",
        "q",
        "Lqi1;",
        "P",
        "()Lqi1;",
        "setExperimentManager",
        "(Lqi1;)V",
        "experimentManager",
        "LVq4;",
        "r",
        "LVq4;",
        "getEventStream",
        "()LVq4;",
        "setEventStream",
        "(LVq4;)V",
        "eventStream",
        "LjB0;",
        "s",
        "LjB0;",
        "J",
        "()LjB0;",
        "setContractorManager",
        "(LjB0;)V",
        "contractorManager",
        "LFO2;",
        "t",
        "LFO2;",
        "U",
        "()LFO2;",
        "setMechanicManager",
        "(LFO2;)V",
        "mechanicManager",
        "LYR4;",
        "u",
        "LYR4;",
        "Y",
        "()LYR4;",
        "setRideManager",
        "(LYR4;)V",
        "rideManager",
        "LaM;",
        "v",
        "LaM;",
        "H",
        "()LaM;",
        "setBirdManager",
        "(LaM;)V",
        "birdManager",
        "LpJ;",
        "LpJ;",
        "getBluetoothManager",
        "()LpJ;",
        "setBluetoothManager",
        "(LpJ;)V",
        "bluetoothManager",
        "Ldr4;",
        "Ldr4;",
        "R",
        "()Ldr4;",
        "setLocationManager",
        "(Ldr4;)V",
        "locationManager",
        "Lo21;",
        "Lo21;",
        "K",
        "()Lo21;",
        "setDeviceCheckManager",
        "(Lo21;)V",
        "deviceCheckManager",
        "z",
        "LG2;",
        "actionMode",
        "Lio/reactivex/subjects/a;",
        "kotlin.jvm.PlatformType",
        "A",
        "Lio/reactivex/subjects/a;",
        "lifecycleEvents",
        "<init>",
        "(ZLjava/lang/Integer;Ljava/lang/Boolean;)V",
        "a",
        "core-basemvp_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final A:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Z

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/Boolean;

.field public final f:LJy;

.field public final g:Lkotlin/Lazy;

.field public h:Le13;

.field public i:LDQ3;

.field public j:LTq4;

.field public k:Landroid/os/Handler;

.field public l:Lgl;

.field public m:LEa;

.field public n:LEg1;

.field public o:Llh6;

.field public p:Llg6;

.field public q:Lqi1;

.field public r:LVq4;

.field public s:LjB0;

.field public t:LFO2;

.field public u:LYR4;

.field public v:LaM;

.field public w:LpJ;

.field public x:Ldr4;

.field public y:Lo21;

.field public z:LG2;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/core/base/BaseCoreActivity;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/core/mvp/BaseActivity;->c:Z

    iput-object p2, p0, Lco/bird/android/core/mvp/BaseActivity;->d:Ljava/lang/Integer;

    iput-object p3, p0, Lco/bird/android/core/mvp/BaseActivity;->e:Ljava/lang/Boolean;

    sget-object p1, LJy;->e:LJy;

    iput-object p1, p0, Lco/bird/android/core/mvp/BaseActivity;->f:LJy;

    new-instance p1, Lco/bird/android/core/mvp/BaseActivity$b;

    invoke-direct {p1, p0}, Lco/bird/android/core/mvp/BaseActivity$b;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/core/mvp/BaseActivity;->g:Lkotlin/Lazy;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string p2, "create<BasicScopeEvent>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/core/mvp/BaseActivity;->A:Lio/reactivex/subjects/a;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public D()V
    .locals 0

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->D()V

    return-void
.end method

.method public final E(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lj56;->b(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method public final F()LEa;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->m:LEa;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "analyticsManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final H()LaM;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->v:LaM;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "birdManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final J()LjB0;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->s:LjB0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "contractorManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final K()Lo21;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->y:Lo21;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "deviceCheckManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final M()LEg1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->n:LEg1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "eventBus"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public O8()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "LRE;",
            ">;"
        }
    .end annotation

    sget-object v0, LRE;->b:LRE$a;

    invoke-virtual {v0}, LRE$a;->a()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    move-result-object v0

    return-object v0
.end method

.method public final P()Lqi1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->q:Lqi1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "experimentManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Q()LJy;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->f:LJy;

    return-object v0
.end method

.method public final R()Ldr4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->x:Ldr4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "locationManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final S()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->k:Landroid/os/Handler;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mainHandler"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final U()LFO2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->t:LFO2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mechanicManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final X()Lgl;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->l:Lgl;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "preference"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Y()LYR4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->u:LYR4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rideManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->g:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    return-object v0
.end method

.method public final b0()Llh6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->o:Llh6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "userManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public c2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LRE;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->A:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "lifecycleEvents.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d0()V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar;->l()V

    :cond_0
    return-void
.end method

.method public f0()LRE;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->A:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRE;

    return-object v0
.end method

.method public h0(LDQ3;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/core/mvp/BaseActivity;->i:LDQ3;

    return-void
.end method

.method public final i0()V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar;->G()V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-static {}, Lco/bird/android/core/mvp/a;->a()Lco/bird/android/core/mvp/BaseActivity$a$a;

    move-result-object v0

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    const-string v3, "application"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-interface {v0, v1}, Lco/bird/android/core/mvp/BaseActivity$a$a;->a(LlG2;)Lco/bird/android/core/mvp/BaseActivity$a$a;

    move-result-object v0

    invoke-interface {v0}, Lco/bird/android/core/mvp/BaseActivity$a$a;->build()Lco/bird/android/core/mvp/BaseActivity$a;

    move-result-object v0

    invoke-interface {v0, p0}, Lco/bird/android/core/mvp/BaseActivity$a;->a(Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->X()Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->t0()Lco/bird/android/model/constant/MapMode;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->e:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lco/bird/android/core/mvp/BaseActivity;->c:Z

    invoke-virtual {p0, v0}, Lco/bird/android/core/base/BaseCoreActivity;->B(Z)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lco/bird/android/core/mvp/BaseActivity;->c:Z

    invoke-virtual {p0, v0}, Lco/bird/android/core/base/BaseCoreActivity;->C(Z)V

    :goto_1
    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->A:Lio/reactivex/subjects/a;

    sget-object v1, LRE;->d:LRE;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lco/bird/android/core/mvp/BaseActivity;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->E(Ljava/lang/CharSequence;)V

    :cond_2
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->v(Z)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->B(Z)V

    :cond_3
    new-instance v0, LDQ3;

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->X()Lgl;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->F()LEa;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, LDQ3;-><init>(Landroid/app/Activity;Lgl;LEa;)V

    invoke-virtual {p0, v0}, Lco/bird/android/core/mvp/BaseActivity;->h0(LDQ3;)V

    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->A:Lio/reactivex/subjects/a;

    sget-object v1, LRE;->e:LRE;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->z:LG2;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, LG2;->c()V

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LDQ3;->h(I[Ljava/lang/String;[I)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->z0()Ljava/util/List;

    move-result-object v0

    const-string v1, "supportFragmentManager.fragments"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onSupportActionModeFinished(LG2;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onSupportActionModeFinished(LG2;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lco/bird/android/core/mvp/BaseActivity;->z:LG2;

    return-void
.end method

.method public onSupportActionModeStarted(LG2;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onSupportActionModeStarted(LG2;)V

    iput-object p1, p0, Lco/bird/android/core/mvp/BaseActivity;->z:LG2;

    return-void
.end method

.method public bridge synthetic peekLifecycle()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->f0()LRE;

    move-result-object v0

    return-object v0
.end method

.method public w()Le13;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->h:Le13;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "navigator"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public x()LDQ3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->i:LDQ3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "permissionManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public y()LTq4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mvp/BaseActivity;->j:LTq4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "reactiveConfig"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
