.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$a;,
        Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$NotConnected;,
        Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;,
        Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u0093\u00012\u00020\u0001:\u0004E\u0094\u0001IBa\u0008\u0007\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0008\u0008\u0001\u0010[\u001a\u00020X\u0012\u000e\u0008\u0001\u0010`\u001a\u0008\u0012\u0004\u0012\u00020]0\\\u0012\u0008\u0008\u0001\u0010d\u001a\u00020a\u0012\u0008\u0008\u0001\u0010h\u001a\u00020e\u00a2\u0006\u0006\u0008\u0091\u0001\u0010\u0092\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0008\u0010\u0007\u001a\u00020\u0002H\u0002J\u0008\u0010\u0008\u001a\u00020\u0002H\u0002J\u0008\u0010\t\u001a\u00020\u0002H\u0002J\u0008\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0010H\u0002J\u000e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0013H\u0002J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00180\u00170\u0013H\u0002J\u000c\u0010\u001b\u001a\u00020\u000b*\u00020\u001aH\u0002J\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0013H\u0002J\u001e\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010 \u001a\u00020\u0010H\u0002J\u000c\u0010\"\u001a\u00020\u0010*\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010H\u0002J\u0010\u0010\'\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010H\u0002J\u0008\u0010(\u001a\u00020\u0010H\u0002J\u000e\u0010*\u001a\u0004\u0018\u00010)*\u00020\u0015H\u0002J\u000e\u0010+\u001a\u0004\u0018\u00010)*\u00020\u0015H\u0002J\n\u0010,\u001a\u0004\u0018\u00010)H\u0002J\n\u0010-\u001a\u0004\u0018\u00010)H\u0002J\u0008\u0010.\u001a\u00020\u0010H\u0002J\u0008\u0010/\u001a\u00020\u0010H\u0002J\u0008\u00100\u001a\u00020\u0010H\u0002J\u0008\u00101\u001a\u00020\u0010H\u0002J\u0008\u00102\u001a\u00020\u0010H\u0002J\u0018\u00104\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0010H\u0002J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0010H\u0002J\u000c\u00106\u001a\u00020\r*\u00020\u0010H\u0002J\u000c\u00107\u001a\u00020\r*\u00020\u0010H\u0002J\u000e\u00109\u001a\u0004\u0018\u000108*\u00020\u0010H\u0002J\u000c\u0010:\u001a\u00020\r*\u00020\u0010H\u0002J\u000c\u0010;\u001a\u00020\r*\u00020\u0010H\u0002J\u000c\u0010<\u001a\u00020\r*\u00020\u0010H\u0002J\u000c\u0010=\u001a\u00020\r*\u00020\u0010H\u0002J\u000c\u0010>\u001a\u00020\r*\u00020\u0010H\u0002J\u000c\u0010?\u001a\u00020\r*\u00020\u0010H\u0002J\u000c\u0010@\u001a\u00020\r*\u00020\u0010H\u0002J\u000c\u0010A\u001a\u00020\r*\u00020\u0010H\u0002J\u000c\u0010B\u001a\u00020\u0010*\u00020\u0010H\u0002J\u000c\u0010C\u001a\u00020\r*\u00020\u0010H\u0002R\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u001a\u0010`\u001a\u0008\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u0016\u0010j\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008i\u0010\u0019R\u0016\u0010l\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010\u0019R\u0016\u0010n\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008m\u0010\u0019R\u001a\u0010r\u001a\u0008\u0012\u0004\u0012\u00020\u000b0o8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0016\u0010y\u001a\u00020\u000b8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0016\u0010|\u001a\u00020\u00108\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\u0018\u0010\u007f\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R)\u0010\u008a\u0001\u001a\u0014\u0012\u000f\u0012\r \u0087\u0001*\u0005\u0018\u00010\u0086\u00010\u0086\u00010\u0085\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001R)\u0010\u008e\u0001\u001a\u0014\u0012\u000f\u0012\r \u0087\u0001*\u0005\u0018\u00010\u0086\u00010\u0086\u00010\u008b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\'\u0010\u0090\u0001\u001a\u0012\u0012\r\u0012\u000b \u0087\u0001*\u0004\u0018\u00010\u00020\u00020\u008b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u008d\u0001\u00a8\u0006\u0095\u0001"
    }
    d2 = {
        "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;",
        "",
        "",
        "b1",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Y0",
        "C1",
        "I1",
        "S0",
        "y0",
        "",
        "context",
        "",
        "success",
        "P1",
        "",
        "payload",
        "aesKey",
        "Lio/reactivex/F;",
        "y1",
        "Lco/bird/api/response/SmartlockResponse;",
        "v1",
        "LHM4;",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "Z",
        "Lco/bird/android/model/constant/PhysicalLockPurpose;",
        "N1",
        "A1",
        "oldPassword",
        "newPassword",
        "d0",
        "targetAesKey",
        "b0",
        "k0",
        "X0",
        "V0",
        "newAesKey",
        "x0",
        "w0",
        "L1",
        "Lco/bird/api/response/SmartlockKey;",
        "W0",
        "x1",
        "g0",
        "i0",
        "f0",
        "Y",
        "h0",
        "H1",
        "M1",
        "key",
        "l0",
        "j0",
        "p0",
        "u0",
        "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;",
        "O1",
        "t0",
        "m0",
        "v0",
        "q0",
        "n0",
        "r0",
        "s0",
        "K1",
        "B1",
        "o0",
        "LMD;",
        "a",
        "LMD;",
        "baseBluetoothManager",
        "LhI5;",
        "b",
        "LhI5;",
        "smartlockClient",
        "LJy4;",
        "c",
        "LJy4;",
        "repairClient",
        "Lgl;",
        "d",
        "Lgl;",
        "preference",
        "LEa;",
        "e",
        "LEa;",
        "analyticsManager",
        "LDQ3;",
        "f",
        "LDQ3;",
        "permissionManager",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "g",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "scopeProvider",
        "Lco/bird/android/app/feature/physicallock/smartlock/b;",
        "h",
        "Lco/bird/android/app/feature/physicallock/smartlock/b;",
        "ui",
        "Le13;",
        "i",
        "Le13;",
        "navigator",
        "j",
        "useProvisionalPassword",
        "k",
        "useProvisionalAesKey",
        "l",
        "usedProvisionalAesKeyForTokenRequest",
        "",
        "m",
        "Ljava/util/List;",
        "seenLockMacAddresses",
        "Lke5;",
        "n",
        "Lke5;",
        "smartlockConnection",
        "o",
        "Ljava/lang/String;",
        "macAddress",
        "p",
        "[B",
        "sessionToken",
        "q",
        "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;",
        "sessionTokenResponse",
        "r",
        "Lco/bird/api/response/SmartlockResponse;",
        "smartlockResponse",
        "s",
        "Lco/bird/android/model/wire/WireBird;",
        "LCG4;",
        "LTk5;",
        "kotlin.jvm.PlatformType",
        "t",
        "LCG4;",
        "bluetoothScanResults",
        "Lma4;",
        "u",
        "Lma4;",
        "scanResultRelay",
        "v",
        "tokenRequestsRelay",
        "<init>",
        "(LMD;LhI5;LJy4;Lgl;LEa;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/physicallock/smartlock/b;Le13;)V",
        "w",
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
        "SMAP\nSmartlockAssociationV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockAssociationV2Presenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,878:1\n180#2:879\n180#2:880\n180#2:881\n180#2:882\n180#2:883\n180#2:884\n180#2:885\n180#2:886\n180#2:887\n199#2:888\n199#2:889\n288#3,2:890\n288#3,2:892\n*S KotlinDebug\n*F\n+ 1 SmartlockAssociationV2Presenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter\n*L\n129#1:879\n157#1:880\n171#1:881\n185#1:882\n211#1:883\n221#1:884\n253#1:885\n264#1:886\n295#1:887\n536#1:888\n557#1:889\n726#1:890,2\n727#1:892,2\n*E\n"
    }
.end annotation


# static fields
.field public static final w:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$a;

.field public static final x:I

.field public static final y:[B


# instance fields
.field public final a:LMD;

.field public final b:LhI5;

.field public final c:LJy4;

.field public final d:Lgl;

.field public final e:LEa;

.field public final f:LDQ3;

.field public final g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lco/bird/android/app/feature/physicallock/smartlock/b;

.field public final i:Le13;

.field public j:Z

.field public k:Z

.field public l:Z

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lke5;

.field public o:Ljava/lang/String;

.field public p:[B

.field public q:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;

.field public r:Lco/bird/api/response/SmartlockResponse;

.field public s:Lco/bird/android/model/wire/WireBird;

.field public final t:LCG4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LCG4<",
            "LTk5;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "LTk5;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->w:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->x:I

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->y:[B

    return-void

    :array_0
    .array-data 1
        0x6t
        0x1t
        0x1t
        0x1t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(LMD;LhI5;LJy4;Lgl;LEa;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/physicallock/smartlock/b;Le13;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD;",
            "LhI5;",
            "LJy4;",
            "Lgl;",
            "LEa;",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/app/feature/physicallock/smartlock/b;",
            "Le13;",
            ")V"
        }
    .end annotation

    const-string v0, "baseBluetoothManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartlockClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repairClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->a:LMD;

    iput-object p2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->b:LhI5;

    iput-object p3, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->c:LJy4;

    iput-object p4, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->d:Lgl;

    iput-object p5, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->e:LEa;

    iput-object p6, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->f:LDQ3;

    iput-object p7, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    iput-object p8, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    iput-object p9, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i:Le13;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->m:Ljava/util/List;

    invoke-static {}, LCG4;->g()LCG4;

    move-result-object p1

    const-string p2, "create<ScanResult>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->t:LCG4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->u:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    const-string p2, "create<Unit>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->v:Lma4;

    return-void
.end method

.method public static synthetic A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->M0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final A0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static synthetic B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->A0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final B0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->e1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final C0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static synthetic D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->I0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final D0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final D1(Lco/bird/android/model/constant/PhysicalLockPurpose;)I
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    sget p0, Lnl4;->smartlock_lock_purpose_helmet:I

    goto :goto_1

    :cond_1
    sget p0, Lnl4;->smartlock_lock_purpose_lock_to:I

    :goto_1
    return p0
.end method

.method public static synthetic E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->s1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final E0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final E1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->K0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method

.method public static final F0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final F1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->Z0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final G0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final G1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->H0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final H0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static synthetic I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->j1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final I0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static synthetic J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->B0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final J0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static final J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static synthetic K(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->O0(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final K0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static synthetic L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->F1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final L0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->U0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final M0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static synthetic N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->L0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final N0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static synthetic O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->R0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final O0(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lio/reactivex/K;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->v1()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$m;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$m;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance p0, LzH5;

    invoke-direct {p0, v1}, LzH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->P0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final P0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->D0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final Q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->z0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final R0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->q1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->p1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final T0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static synthetic U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->f1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final U0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->a1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->d1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final Z0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->n1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final a1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$alternateAesKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)[B
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->Y()[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$associateLockToBird(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->Z()Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$changeAesKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->b0([B)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$changePassword(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B[B)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->d0([B[B)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$currentAesKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)[B
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->f0()[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$currentNonProvisionalKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/api/response/SmartlockKey;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g0()Lco/bird/api/response/SmartlockKey;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$currentProvisionalKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/api/response/SmartlockKey;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i0()Lco/bird/api/response/SmartlockKey;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$decrypt(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B[B)[B
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->j0([B[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$encode(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Ljava/lang/String;)[B
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k0(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Le13;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i:Le13;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lgl;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->d:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getSeenLockMacAddresses$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->m:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getSessionTokenResponse$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->q:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;

    return-object p0
.end method

.method public static final synthetic access$getSmartlockClient$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)LhI5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->b:LhI5;

    return-object p0
.end method

.method public static final synthetic access$getSmartlockResponse$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/api/response/SmartlockResponse;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->r:Lco/bird/api/response/SmartlockResponse;

    return-object p0
.end method

.method public static final synthetic access$getTOKEN_REQUEST$cp()[B
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->y:[B

    return-object v0
.end method

.method public static final synthetic access$getTokenRequestsRelay$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->v:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/android/app/feature/physicallock/smartlock/b;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    return-object p0
.end method

.method public static final synthetic access$getUsedProvisionalAesKeyForTokenRequest$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Z
    .locals 0

    iget-boolean p0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->l:Z

    return p0
.end method

.method public static final synthetic access$isAesKeyChangeResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->m0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isCableInsertedResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->n0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isConsideredUnlockSuccess(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->o0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isKnownResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->p0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isLockResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->q0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isLockStateResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->r0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isLocked(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->s0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isPasswordChangeResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->t0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isSessionTokenResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->u0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isUnlockResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->v0([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$keyHighPayload(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)[B
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->w0([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$newPasswordPayload(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)[B
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->V0([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$nonProvisionalKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->W0(Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$promoteSmartlock(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->v1()Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$provisionalKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->x1(Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sendPayload(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B[B)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->y1([B[B)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sendUnlockingRequest(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->A1()Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sessionToken(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)[B
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->B1([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMacAddress$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->o:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setSessionToken$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->p:[B

    return-void
.end method

.method public static final synthetic access$setSessionTokenResponse$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->q:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;

    return-void
.end method

.method public static final synthetic access$setSmartlockConnection$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Lke5;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->n:Lke5;

    return-void
.end method

.method public static final synthetic access$setSmartlockResponse$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Lco/bird/api/response/SmartlockResponse;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->r:Lco/bird/api/response/SmartlockResponse;

    return-void
.end method

.method public static final synthetic access$setUseProvisionalAesKey$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k:Z

    return-void
.end method

.method public static final synthetic access$setUseProvisionalPassword$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->j:Z

    return-void
.end method

.method public static final synthetic access$setUsedProvisionalAesKeyForTokenRequest$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->l:Z

    return-void
.end method

.method public static final synthetic access$setupDropdown$label(Lco/bird/android/model/constant/PhysicalLockPurpose;)I
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->D1(Lco/bird/android/model/constant/PhysicalLockPurpose;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$sourcePassword(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)[B
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->H1()[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$successful(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->K1([B)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$targetAesKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)[B
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->L1()[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$targetPassword(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)[B
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->M1()[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toSessionTokenResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->O1([B)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$trackOpenLockEvent(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Ljava/lang/String;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->P1(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->w1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->C0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final c1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->m1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->G1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final e1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->c1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final f1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->F0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final g1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->t1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final j1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->T0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final k1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final l1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->r1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final m1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->u1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final o1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->o1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final p1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->J0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method

.method public static final q1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final r1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->N0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final s1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->l1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final t1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final u1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->G0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final w1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->E0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->Q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->E1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final z0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic z1(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B[BILjava/lang/Object;)Lio/reactivex/F;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->f0()[B

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->y1([B[B)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A1()Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [B

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/Random;->nextBytes([B)V

    const/16 v2, 0x10

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h0()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->p:[B

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string v2, "sessionToken"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "payload"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {p0, v0, v3, v1, v3}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->z1(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B[BILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 1
        0x5t
        0x1t
        0x6t
    .end array-data
.end method

.method public final B1([B)[B
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x3

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    return-object p1
.end method

.method public final C1()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->d:Lgl;

    invoke-virtual {v1}, Lgl;->N()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v1

    invoke-static {v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->D1(Lco/bird/android/model/constant/PhysicalLockPurpose;)I

    move-result v1

    invoke-interface {v0, v1}, Lco/bird/android/app/feature/physicallock/smartlock/b;->e4(I)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    invoke-interface {v0}, Lco/bird/android/app/feature/physicallock/smartlock/b;->V0()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$Y;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$Y;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LwH5;

    invoke-direct {v2, v1}, LwH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$Z;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$Z;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LxH5;

    invoke-direct {v2, v1}, LxH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$a0;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$a0;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LyH5;

    invoke-direct {v2, v1}, LyH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun setupDropdow\u2026r)\n      .subscribe()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public final H1()[B
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g0()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getPassword()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    :cond_1
    return-object v0
.end method

.method public final I1()V
    .locals 6

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->a:LMD;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LMD$a;->scanBleDevices$default(LMD;IZLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b0;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b0;

    new-instance v2, LbH5;

    invoke-direct {v2, v1}, LbH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "baseBluetoothManager\n   \u2026) && !it.isSolebeLock() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->t:LCG4;

    invoke-interface {v0, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final K1([B)Z
    .locals 1

    const/4 v0, 0x3

    aget-byte p1, p1, v0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result p1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final L1()[B
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i0()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k0(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    :cond_1
    return-object v0
.end method

.method public final M1()[B
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i0()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getPassword()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    :cond_1
    return-object v0
.end method

.method public final N1(Lco/bird/android/model/constant/PhysicalLockPurpose;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string p1, "smartlock_cable_oklock_helmet"

    goto :goto_0

    :cond_0
    const-string p1, "smartlock_cable_nokelock_birdv1"

    :goto_0
    return-object p1
.end method

.method public final O1([B)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;
    .locals 1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->u0([B)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$b;-><init>([B)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final P1(Ljava/lang/String;Z)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->d:Lgl;

    invoke-virtual {v1}, Lgl;->N()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v1

    iget-object v2, v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->e:LEa;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->N1(Lco/bird/android/model/constant/PhysicalLockPurpose;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    move-object v14, v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    iget-object v1, v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->r:Lco/bird/api/response/SmartlockResponse;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/api/response/SmartlockResponse;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    const-string v1, ""

    :cond_2
    move-object v10, v1

    new-instance v1, LRS3;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x19c7

    const/16 v19, 0x0

    move-object v4, v1

    move-object/from16 v8, p1

    move/from16 v9, p2

    invoke-direct/range {v4 .. v19}, LRS3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public final S0()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->v:Lma4;

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$y;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$y;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LZG5;

    invoke-direct {v2, v1}, LZG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun listenForTok\u2026)\n      .subscribe {}\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$z;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$z;

    new-instance v2, LaH5;

    invoke-direct {v2, v1}, LaH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final V0([B)[B
    .locals 4

    const/4 v0, 0x3

    new-array v1, v0, [B

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/Random;->nextBytes([B)V

    const/16 v2, 0x10

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->p:[B

    if-nez v0, :cond_0

    const-string v0, "sessionToken"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const-string v0, "allocate(16)\n      .orde\u2026t(padding)\n      .array()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :array_0
    .array-data 1
        0x5t
        0x4t
        0x6t
    .end array-data
.end method

.method public final W0(Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;
    .locals 2

    invoke-virtual {p1}, Lco/bird/api/response/SmartlockResponse;->getKeysList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/api/response/SmartlockKey;

    invoke-virtual {v1}, Lco/bird/api/response/SmartlockKey;->getProvisional()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lco/bird/api/response/SmartlockKey;

    return-object v0
.end method

.method public final X0([B)[B
    .locals 4

    const/4 v0, 0x3

    new-array v1, v0, [B

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/Random;->nextBytes([B)V

    const/16 v2, 0x10

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->p:[B

    if-nez v0, :cond_0

    const-string v0, "sessionToken"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const-string v0, "allocate(16)\n      .orde\u2026t(padding)\n      .array()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :array_0
    .array-data 1
        0x5t
        0x3t
        0x6t
    .end array-data
.end method

.method public final Y()[B
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i0()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k0(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_3

    :cond_0
    new-array v0, v1, [B

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g0()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k0(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    new-array v0, v1, [B

    :cond_3
    :goto_0
    return-object v0
.end method

.method public final Y0(Lco/bird/android/model/wire/WireBird;)V
    .locals 3

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scanned Bird "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->s:Lco/bird/android/model/wire/WireBird;

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    invoke-interface {p1, v1}, Lco/bird/android/app/feature/physicallock/smartlock/b;->A1(Z)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lco/bird/android/app/feature/physicallock/smartlock/b;->g0(Z)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->Z()Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$A;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$A;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v1, LXG5;

    invoke-direct {v1, v0}, LXG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$B;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$B;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LYG5;

    invoke-direct {v2, v0}, LYG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1, v2}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final Z()Lio/reactivex/F;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->c:LJy4;

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->s:Lco/bird/android/model/wire/WireBird;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "bird"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->d:Lgl;

    invoke-virtual {v1}, Lgl;->N()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->N1(Lco/bird/android/model/constant/PhysicalLockPurpose;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    const-string v1, "smartlock_cable_nokelock_birdv1"

    :cond_2
    move-object v5, v1

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->o:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, "macAddress"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v2

    goto :goto_0

    :cond_3
    move-object v8, v1

    :goto_0
    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->d:Lgl;

    invoke-virtual {v1}, Lgl;->N()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v1

    if-nez v1, :cond_4

    sget-object v1, Lco/bird/android/model/constant/PhysicalLockPurpose;->LOCK_TO:Lco/bird/android/model/constant/PhysicalLockPurpose;

    :cond_4
    move-object v9, v1

    new-instance v1, Lco/bird/api/request/ReplacePhysicalLockBody;

    const-string v6, "0000"

    const/4 v7, 0x0

    const/16 v10, 0x8

    const/4 v11, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v11}, Lco/bird/api/request/ReplacePhysicalLockBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PhysicalLockPurpose;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, LJy4;->f(Lco/bird/api/request/ReplacePhysicalLockBody;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$d;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$d;

    new-instance v2, LeH5;

    invoke-direct {v2, v1}, LeH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "repairClient.replacePhys\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b0([B)Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->x0([B)[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->z1(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B[BILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    const-wide/16 v1, 0xc8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/F;->l(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$e;

    invoke-direct {v1, p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$e;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)V

    new-instance p1, LIG5;

    invoke-direct {p1, v1}, LIG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "private fun changeAesKey\u2026e\n          }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b1()V
    .locals 12

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->d:Lgl;

    invoke-virtual {v0}, Lgl;->O()Luf1;

    move-result-object v0

    sget-object v1, Luf1;->k:Luf1;

    if-eq v0, v1, :cond_0

    iget-object v2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    sget-object v3, LkI5;->d:LkI5;

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$M;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$M;

    new-instance v7, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$P;

    invoke-direct {v7, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$P;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x64

    const/4 v11, 0x0

    invoke-static/range {v2 .. v11}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->C1()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->I1()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->y0()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->S0()V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lco/bird/android/app/feature/physicallock/smartlock/b;->a0(Z)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    invoke-interface {v0}, Lco/bird/android/app/feature/physicallock/smartlock/b;->e0()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$Q;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$Q;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v3, LAH5;

    invoke-direct {v3, v2}, LAH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    invoke-interface {v0}, Lco/bird/android/app/feature/physicallock/smartlock/b;->V()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$R;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$R;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v3, LNG5;

    invoke-direct {v3, v2}, LNG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$S;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$S;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v3, LOG5;

    invoke-direct {v3, v2}, LOG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$T;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$T;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v3, LPG5;

    invoke-direct {v3, v2}, LPG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v2, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$U;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$U;

    new-instance v3, LQG5;

    invoke-direct {v3, v2}, LQG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->retry(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "fun onCreate() {\n    // \u2026hButton(true)\n      }\n  }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$V;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$V;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LRG5;

    invoke-direct {v4, v3}, LRG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$W;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$W;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v5, LSG5;

    invoke-direct {v5, v3}, LSG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4, v5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    invoke-interface {v0}, Lco/bird/android/app/feature/physicallock/smartlock/b;->jg()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$C;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$C;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LUG5;

    invoke-direct {v4, v3}, LUG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    invoke-interface {v0}, Lco/bird/android/app/feature/physicallock/smartlock/b;->w()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$D;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$D;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LVG5;

    invoke-direct {v4, v3}, LVG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$E;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$E;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LWG5;

    invoke-direct {v4, v3}, LWG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$F;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$F;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LBH5;

    invoke-direct {v4, v3}, LBH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    invoke-interface {v0}, Lco/bird/android/app/feature/physicallock/smartlock/b;->K1()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$G;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$G;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LCH5;

    invoke-direct {v4, v3}, LCH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$H;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$H;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LDH5;

    invoke-direct {v4, v3}, LDH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$I;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$I;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LEH5;

    invoke-direct {v4, v3}, LEH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$J;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$J;

    new-instance v4, LFH5;

    invoke-direct {v4, v3}, LFH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->retry(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$K;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$K;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LJG5;

    invoke-direct {v4, v3}, LJG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->doOnEach(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$L;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$L;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v3, LKG5;

    invoke-direct {v3, v2}, LKG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$N;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$N;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v4, LLG5;

    invoke-direct {v4, v2}, LLG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->h:Lco/bird/android/app/feature/physicallock/smartlock/b;

    invoke-interface {v0}, Lco/bird/android/app/feature/physicallock/smartlock/b;->J0()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$O;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$O;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LMG5;

    invoke-direct {v2, v1}, LMG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final d0([B[B)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B[B)",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->X0([B)[B

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->z1(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B[BILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-wide/16 v0, 0xc8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lio/reactivex/F;->l(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$f;

    invoke-direct {v0, p0, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$f;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)V

    new-instance p2, LpH5;

    invoke-direct {p2, v0}, LpH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "private fun changePasswo\u2026newPassword))\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final f0()[B
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i0()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k0(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_3

    :cond_0
    new-array v0, v1, [B

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g0()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->k0(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    new-array v0, v1, [B

    :cond_3
    :goto_0
    return-object v0
.end method

.method public final g0()Lco/bird/api/response/SmartlockKey;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->r:Lco/bird/api/response/SmartlockResponse;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->W0(Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final h0()[B
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->j:Z

    const-string v1, "this as java.lang.String).getBytes(charset)"

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i0()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getPassword()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_3

    :cond_0
    new-array v0, v2, [B

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g0()Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/api/response/SmartlockKey;->getPassword()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_3

    :cond_2
    new-array v0, v2, [B

    :cond_3
    :goto_0
    return-object v0
.end method

.method public final i0()Lco/bird/api/response/SmartlockKey;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->r:Lco/bird/api/response/SmartlockResponse;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->x1(Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final j0([B[B)[B
    .locals 2

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string p2, "AES/ECB/NoPadding"

    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p2

    const/4 v1, 0x2

    invoke-virtual {p2, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {p2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    const-string p2, "cipher.doFinal(payload)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final k0(Ljava/lang/String;)[B
    .locals 1

    invoke-static {}, LEy;->a()LEy$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LEy$a;->a(Ljava/lang/String;)[B

    move-result-object p1

    const-string v0, "getDecoder().decode(this)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final l0([B[B)[B
    .locals 2

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string p2, "AES/ECB/NoPadding"

    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p2

    const/4 v1, 0x1

    invoke-virtual {p2, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {p2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    const-string p2, "cipher.doFinal(payload)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final m0([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x7t
        0x3t
        0x1t
    .end array-data
.end method

.method public final n0([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x5t
        0x8t
        0x1t
    .end array-data
.end method

.method public final o0([B)Z
    .locals 1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->r0([B)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->s0([B)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->v0([B)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->K1([B)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final p0([B)Z
    .locals 1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->u0([B)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->t0([B)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->m0([B)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->v0([B)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->q0([B)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->n0([B)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->r0([B)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final q0([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x5t
        0xdt
        0x1t
    .end array-data
.end method

.method public final r0([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x5t
        0xft
        0x1t
    .end array-data
.end method

.method public final s0([B)Z
    .locals 1

    const/4 v0, 0x3

    aget-byte p1, p1, v0

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final t0([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x5t
        0x5t
        0x1t
    .end array-data
.end method

.method public final u0([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x6t
        0x2t
    .end array-data
.end method

.method public final v0([B)Z
    .locals 3

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        0x5t
        0x2t
        0x1t
    .end array-data
.end method

.method public final v1()Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/SmartlockResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->b:LhI5;

    new-instance v7, Lco/bird/api/request/PromoteKeyBody;

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->o:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "macAddress"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    const/4 v3, 0x0

    invoke-virtual {p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->i0()Lco/bird/api/response/SmartlockKey;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/api/response/SmartlockKey;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    const-string v1, ""

    :cond_2
    move-object v4, v1

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lco/bird/api/request/PromoteKeyBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, LhI5;->f(Lco/bird/api/request/PromoteKeyBody;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$X;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$X;

    new-instance v2, LTG5;

    invoke-direct {v2, v1}, LTG5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "smartlockClient.promoteK\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final w0([B)[B
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [B

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    new-instance v2, Lkotlin/ranges/IntRange;

    const/16 v3, 0x8

    const/16 v4, 0xf

    invoke-direct {v2, v3, v4}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v2}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->p:[B

    if-nez v1, :cond_0

    const-string v1, "sessionToken"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const-string v0, "allocate(16)\n      .orde\u2026t(padding)\n      .array()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :array_0
    .array-data 1
        0x7t
        0x2t
        0x8t
    .end array-data
.end method

.method public final x0([B)[B
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [B

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    new-instance v2, Lkotlin/ranges/IntRange;

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-direct {v2, v3, v4}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v2}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->p:[B

    if-nez v1, :cond_0

    const-string v1, "sessionToken"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const-string v0, "allocate(16)\n      .orde\u2026t(padding)\n      .array()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :array_0
    .array-data 1
        0x7t
        0x1t
        0x8t
    .end array-data
.end method

.method public final x1(Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;
    .locals 2

    invoke-virtual {p1}, Lco/bird/api/response/SmartlockResponse;->getKeysList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/api/response/SmartlockKey;

    invoke-virtual {v1}, Lco/bird/api/response/SmartlockKey;->getProvisional()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lco/bird/api/response/SmartlockKey;

    return-object v0
.end method

.method public final y0()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->t:LCG4;

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$p;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$p;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LcH5;

    invoke-direct {v2, v1}, LcH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$q;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$q;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LmH5;

    invoke-direct {v2, v1}, LmH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$r;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$r;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LnH5;

    invoke-direct {v2, v1}, LnH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LoH5;

    invoke-direct {v2, v1}, LoH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$t;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$t;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LqH5;

    invoke-direct {v2, v1}, LqH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$u;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$u;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LrH5;

    invoke-direct {v2, v1}, LrH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$v;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$v;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LsH5;

    invoke-direct {v2, v1}, LsH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$w;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$w;

    new-instance v2, LtH5;

    invoke-direct {v2, v1}, LtH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$x;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$x;

    new-instance v2, LuH5;

    invoke-direct {v2, v1}, LuH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LvH5;

    invoke-direct {v2, v1}, LvH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$h;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$h;

    new-instance v2, LdH5;

    invoke-direct {v2, v1}, LdH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$i;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$i;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LfH5;

    invoke-direct {v2, v1}, LfH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->retry(J)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$j;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$j;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LgH5;

    invoke-direct {v2, v1}, LgH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$k;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$k;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LhH5;

    invoke-direct {v2, v1}, LhH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LiH5;

    invoke-direct {v2, v1}, LiH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LjH5;

    invoke-direct {v1, p0}, LjH5;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    invoke-static {v1}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "private fun listenForSma\u2026\")\n        }\n      })\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->g:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$n;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$n;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v2, LkH5;

    invoke-direct {v2, v1}, LkH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$o;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$o;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v3, LlH5;

    invoke-direct {v3, v1}, LlH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2, v3}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final y1([B[B)Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B[B)",
            "Lio/reactivex/F<",
            "[B>;"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sending payload to lock "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->l0([B[B)[B

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encrypted payload: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p2, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->n:Lke5;

    if-eqz p2, :cond_0

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->c:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    invoke-virtual {v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->b()Ljava/util/UUID;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Lke5;->c(Ljava/util/UUID;[B)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$NotConnected;->b:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$NotConnected;

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "error(NotConnected)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method
