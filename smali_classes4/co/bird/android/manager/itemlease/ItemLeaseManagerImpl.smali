.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMc2;
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0008\u0007\u0012\u0006\u0010I\u001a\u00020G\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010T\u001a\u00020R\u0012\u0006\u0010W\u001a\u00020U\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0008\u0008\u0001\u0010b\u001a\u00020\u000e\u0012\u0006\u0010e\u001a\u00020c\u0012\u0006\u0010h\u001a\u00020f\u0012\u0006\u0010k\u001a\u00020i\u0012\u0006\u0010o\u001a\u00020l\u00a2\u0006\u0006\u0008\u008a\u0001\u0010\u008b\u0001J8\u0010\u000c\u001a\u00020\u000b2\u001e\u0010\u0008\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002J8\u0010\r\u001a\u00020\u000b2\u001e\u0010\u0008\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J@\u0010\u0015\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00120\u0011*\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0006\u0012\u0004\u0012\u00020\u00140\u00120\u0011J\u0008\u0010\u0017\u001a\u00020\u0016H\u0016J<\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00112\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00112\u0006\u0010\t\u001a\u00020\u0007H\u0016JD\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0\u00112\u0006\u0010!\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\'2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0006H\u0016J\u0016\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0\u00112\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0018\u0010.\u001a\u00020\'2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00100\u001a\u00020\'2\u0006\u0010/\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001a\u00101\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001a\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010/\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00103\u001a\u00020\'2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00104\u001a\u00020\'2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00105\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00106\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00107\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u00108\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J \u0010=\u001a\u00020\'2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0016J\u0018\u0010A\u001a\u00020\'2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0008\u0010B\u001a\u00020\u000bH\u0016J2\u0010F\u001a\u0008\u0012\u0004\u0012\u00020E0\u00112\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\'2\u0008\u0010D\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0016R\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0014\u0010b\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008`\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u0010dR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010gR\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR\'\u0010t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00060p8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00084\u0010q\u001a\u0004\u0008r\u0010sR\'\u0010w\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020>0u0p8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008F\u0010q\u001a\u0004\u0008v\u0010sR\'\u0010x\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060p8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u0010q\u001a\u0004\u0008O\u0010sR3\u0010z\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00040p8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00086\u0010q\u001a\u0004\u0008y\u0010sR3\u0010}\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00040p8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008{\u0010q\u001a\u0004\u0008|\u0010sR \u0010\u007f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00060\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008r\u0010~R!\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020>0u0\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010~R!\u0010\u0081\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010~R-\u0010\u0082\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010~R-\u0010\u0083\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008|\u0010~R\u001d\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0087\u0001\u0010\u0088\u0001\u00a8\u0006\u008c\u0001"
    }
    d2 = {
        "Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;",
        "LMc2;",
        "LVX0;",
        "La94;",
        "",
        "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "relay",
        "bird",
        "leaseType",
        "",
        "p0",
        "n0",
        "LLifecycleOwner;",
        "owner",
        "onStart",
        "Lio/reactivex/F;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/itemlease/ItemLease;",
        "Lco/bird/android/model/RideStates;",
        "Y",
        "Lio/reactivex/c;",
        "b",
        "",
        "partnerId",
        "leasedItemId",
        "associatedItemId",
        "Lco/bird/api/request/WirePaymentAuthRequest;",
        "paymentAuth",
        "Lco/bird/android/model/itemlease/LeaseStartResponse;",
        "x",
        "E",
        "leaseId",
        "Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;",
        "purpose",
        "",
        "fileSize",
        "mimeType",
        "",
        "autoScanned",
        "autoScannedCodes",
        "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
        "B",
        "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
        "u",
        "l",
        "birdId",
        "C",
        "z",
        "p",
        "t",
        "n",
        "f",
        "q",
        "y",
        "j",
        "Lco/bird/android/model/wire/configs/Config;",
        "config",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "physicalLock",
        "v",
        "Lco/bird/android/model/itemlease/ItemLeaseExemption;",
        "exemption",
        "A",
        "k",
        "e",
        "present",
        "itemId",
        "Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;",
        "o",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "LLc2;",
        "c",
        "LLc2;",
        "client",
        "LOh;",
        "d",
        "LOh;",
        "buildConfig",
        "Lwi2;",
        "Lwi2;",
        "deserializer",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "LGI3;",
        "g",
        "LGI3;",
        "partnerManager",
        "LTq4;",
        "h",
        "LTq4;",
        "reactiveConfig",
        "i",
        "LLifecycleOwner;",
        "processLifecycleOwner",
        "Lgl;",
        "Lgl;",
        "appPreference",
        "LYR4;",
        "LYR4;",
        "rideManager",
        "LaM;",
        "LaM;",
        "birdManager",
        "Ldr4;",
        "m",
        "Ldr4;",
        "locationManager",
        "LZ84;",
        "Lkotlin/Lazy;",
        "s",
        "()LZ84;",
        "activeLeases",
        "",
        "X",
        "currentExemptions",
        "activeLeaseBirds",
        "D",
        "readyToLeaseBirds",
        "r",
        "w",
        "readyToEndLeaseBirds",
        "La94;",
        "mutableActiveLeases",
        "mutableLeaseExemption",
        "mutableActiveLeaseBirds",
        "mutableReadyToLeaseBirds",
        "mutableReadyToEndLeaseBirds",
        "W",
        "()Ljava/util/List;",
        "currentActiveLeaseBirds",
        "a",
        "()Ljava/lang/String;",
        "imageCacheDirectoryPath",
        "<init>",
        "(Landroid/content/Context;LLc2;LOh;Lwi2;LEa;LGI3;LTq4;LLifecycleOwner;Lgl;LYR4;LaM;Ldr4;)V",
        "co.bird.android.manager.itemlease"
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
        "SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 6 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,476:1\n1603#2,9:477\n1855#2:486\n1856#2:488\n1612#2:489\n1747#2,3:497\n288#2,2:500\n1747#2,3:502\n1747#2,3:505\n1747#2,3:508\n1747#2,3:511\n1#3:487\n1#3:496\n44#4:490\n44#4:494\n237#5:491\n237#5:495\n52#6,2:492\n*S KotlinDebug\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl\n*L\n100#1:477,9\n100#1:486\n100#1:488\n100#1:489\n312#1:497,3\n322#1:500,2\n329#1:502,3\n339#1:505,3\n351#1:508,3\n397#1:511,3\n100#1:487\n119#1:490\n154#1:494\n119#1:491\n154#1:495\n124#1:492,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:LLc2;

.field public final d:LOh;

.field public final e:Lwi2;

.field public final f:LEa;

.field public final g:LGI3;

.field public final h:LTq4;

.field public final i:LLifecycleOwner;

.field public final j:Lgl;

.field public final k:LYR4;

.field public final l:LaM;

.field public final m:Ldr4;

.field public final n:Lkotlin/Lazy;

.field public final o:Lkotlin/Lazy;

.field public final p:Lkotlin/Lazy;

.field public final q:Lkotlin/Lazy;

.field public final r:Lkotlin/Lazy;

.field public final s:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLease;",
            ">;>;"
        }
    .end annotation
.end field

.field public final t:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/Set<",
            "Lco/bird/android/model/itemlease/ItemLeaseExemption;",
            ">;>;"
        }
    .end annotation
.end field

.field public final u:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;"
        }
    .end annotation
.end field

.field public final v:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final w:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;LLc2;LOh;Lwi2;LEa;LGI3;LTq4;LLifecycleOwner;Lgl;LYR4;LaM;Ldr4;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "partnerManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appPreference"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideManager"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdManager"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->b:Landroid/content/Context;

    iput-object p2, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->c:LLc2;

    iput-object p3, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->d:LOh;

    iput-object p4, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->e:Lwi2;

    iput-object p5, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->f:LEa;

    iput-object p6, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->g:LGI3;

    iput-object p7, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->h:LTq4;

    iput-object p8, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->i:LLifecycleOwner;

    iput-object p9, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->j:Lgl;

    iput-object p10, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->k:LYR4;

    iput-object p11, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->l:LaM;

    iput-object p12, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->m:Ldr4;

    new-instance p1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$c;

    invoke-direct {p1, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$c;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->n:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$e;

    invoke-direct {p1, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$e;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->o:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$b;

    invoke-direct {p1, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$b;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->p:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$p;

    invoke-direct {p1, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$p;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->q:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$o;

    invoke-direct {p1, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$o;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->r:Lkotlin/Lazy;

    sget-object p1, La94;->h:La94$a;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p4, 0x2

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->s:La94;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p2

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->t:La94;

    invoke-virtual {p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->W()Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->u:La94;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->v:La94;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->w:La94;

    invoke-interface {p8}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method

.method public static synthetic G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->l0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseReturnResponse;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseReturnResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

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

.method public static final a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getAppPreference$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)Lgl;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->j:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getBirdManager$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LaM;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->l:LaM;

    return-object p0
.end method

.method public static final synthetic access$getBuildConfig$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LOh;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->d:LOh;

    return-object p0
.end method

.method public static final synthetic access$getClient$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LLc2;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->c:LLc2;

    return-object p0
.end method

.method public static final synthetic access$getCurrentActiveLeaseBirds(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->W()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLocationManager$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)Ldr4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->m:Ldr4;

    return-object p0
.end method

.method public static final synthetic access$getMutableActiveLeaseBirds$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->u:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableActiveLeases$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->s:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableLeaseExemption$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->t:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableReadyToEndLeaseBirds$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->w:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableReadyToLeaseBirds$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->v:La94;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->h:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getRideManager$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LYR4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->k:LYR4;

    return-object p0
.end method

.method public static final b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;

    return-object p0
.end method

.method public static final c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final e0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseReturnResponse;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/itemlease/LeaseReturnResponse;

    return-object p0
.end method

.method public static final j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

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

.method public static final m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;

    return-object p0
.end method

.method public static final o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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
.method public A(Lco/bird/android/model/itemlease/ItemLeaseExemption;)V
    .locals 2

    const-string v0, "exemption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->t:La94;

    new-instance v1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$d;

    invoke-direct {v1, p1, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$d;-><init>(Lco/bird/android/model/itemlease/ItemLeaseExemption;Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    invoke-virtual {v0, v1}, La94;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public B(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;JLjava/lang/String;ZLjava/util/List;)Lio/reactivex/F;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;",
            "J",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p7

    const-string v1, "leaseId"

    move-object v3, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "purpose"

    move-object v2, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mimeType"

    move-object/from16 v7, p5

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "autoScannedCodes"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    iget-object v10, v1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->c:LLc2;

    invoke-virtual {p2}, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v9, v0

    new-instance v0, Lco/bird/api/request/WireLeaseAssetRequest;

    move-object v2, v0

    move-object v3, p1

    move-wide v5, p3

    move-object/from16 v7, p5

    move/from16 v8, p6

    invoke-direct/range {v2 .. v9}, Lco/bird/api/request/WireLeaseAssetRequest;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/util/List;)V

    invoke-interface {v10, v0}, LLc2;->f(Lco/bird/api/request/WireLeaseAssetRequest;)Lio/reactivex/F;

    move-result-object v0

    sget-object v2, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$v;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$v;

    new-instance v3, LQc2;

    invoke-direct {v3, v2}, LQc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    const-string v2, "client.submitLeaseAsset(\u2026nedUrl,\n        )\n      }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public C(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z
    .locals 3

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->s()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/itemlease/ItemLease;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/itemlease/ItemLease;->isLeaseForBirdId(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    :cond_2
    :goto_0
    return v2
.end method

.method public D()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->q:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public E(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/F;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/itemlease/LeaseStartResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v2, v0

    sget-object v3, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    const-string v4, ""

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->x(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$t;

    invoke-direct {v1, p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$t;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;Lco/bird/android/model/wire/WireBird;)V

    new-instance p1, LPc2;

    invoke-direct {p1, v1}, LPc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun startLease(\u2026ird, lease) }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final W()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->j:Lgl;

    invoke-virtual {v0}, Lgl;->B()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgl$c;

    invoke-virtual {v2}, Lgl$c;->c()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public X()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/Set<",
            "Lco/bird/android/model/itemlease/ItemLeaseExemption;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->o:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public final Y(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/F<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLease;",
            ">;",
            "Lco/bird/android/model/RideStates;",
            ">;>;)",
            "Lio/reactivex/F<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLease;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$f;

    invoke-direct {v0, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$f;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    new-instance v1, LRc2;

    invoke-direct {v1, v0}, LRc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$g;

    invoke-direct {v0, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$g;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    new-instance v1, LSc2;

    invoke-direct {v1, v0}, LSc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "fun Single<Pair<List<Ite\u2026veLeaseBirds)\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/itemlease"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lio/reactivex/c;
    .locals 5

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->c:LLc2;

    invoke-interface {v0}, LLc2;->b()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$n;

    invoke-direct {v1, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$n;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    new-instance v2, Lbd2;

    invoke-direct {v2, v1}, Lbd2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "override fun queryActive\u2026     .ignoreElement()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->Y(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    const-wide/16 v2, 0x64

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v4}, Lio/reactivex/F;->l(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->p:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public e()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "cleared lease exemptions"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->t:La94;

    invoke-virtual {v0}, La94;->j()V

    return-void
.end method

.method public f(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->v:La94;

    invoke-virtual {p0, v0, p1, p2}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->p0(La94;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    return-void
.end method

.method public j(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->w:La94;

    invoke-virtual {p0, v0, p1, p2}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->n0(La94;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    return-void
.end method

.method public k(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z
    .locals 5

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->X()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/itemlease/ItemLeaseExemption;

    iget-object v3, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->h:LTq4;

    invoke-virtual {v1}, Lco/bird/android/model/itemlease/ItemLeaseExemption;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    invoke-static {v3, v4}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v3

    invoke-virtual {v1, v3}, Lco/bird/android/model/itemlease/ItemLeaseExemption;->isValid(Lco/bird/android/model/wire/configs/Config;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/itemlease/ItemLeaseExemption;->getLeaseType()Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    move-result-object v3

    if-ne v3, p2, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/itemlease/ItemLeaseExemption;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-virtual {v1, p1}, Lco/bird/android/model/wire/WireBird;->isProbablySame(Lco/bird/android/model/wire/WireBird;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v4

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    move v2, v4

    :cond_3
    :goto_1
    return v2
.end method

.method public l(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->C(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result p1

    return p1
.end method

.method public n(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z
    .locals 3

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->v:La94;

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    check-cast p2, Ljava/lang/Iterable;

    instance-of v1, p2, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move p1, v0

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1, p1}, Lco/bird/android/model/wire/WireBird;->isProbablySame(Lco/bird/android/model/wire/WireBird;)Z

    move-result v1

    if-eqz v1, :cond_2

    move p1, v2

    :goto_0
    if-ne p1, v2, :cond_3

    move v0, v2

    :cond_3
    return v0
.end method

.method public final n0(La94;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La94<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;>;",
            "Lco/bird/android/model/wire/WireBird;",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_0
    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$w;

    invoke-direct {v2, p2}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$w;-><init>(Lco/bird/android/model/wire/WireBird;)V

    new-instance p2, LWc2;

    invoke-direct {p2, v2}, LWc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, p2}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public o(Lco/bird/android/model/itemlease/enum/ItemLeaseType;ZLjava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "leaseType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->c:LLc2;

    invoke-virtual {p1}, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lco/bird/api/request/WireLeaseItemAvailabilityRequest;

    invoke-direct {v1, p1, p3, p4, p2}, Lco/bird/api/request/WireLeaseItemAvailabilityRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, LLc2;->c(Lco/bird/api/request/WireLeaseItemAvailabilityRequest;)Lio/reactivex/F;

    move-result-object p1

    sget-object p2, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$h;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$h;

    new-instance p3, LOc2;

    invoke-direct {p3, p2}, LOc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "client.markLeaseItemAvai\u2026      )\n        }\n      }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onStart(LLifecycleOwner;)V
    .locals 5

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onAppForeground called"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->b()Lio/reactivex/c;

    move-result-object v0

    const-wide/16 v1, 0x1e

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/c;->Z(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/c;

    move-result-object v0

    sget-object v1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$j;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$j;

    new-instance v2, LNc2;

    invoke-direct {v2, v1}, LNc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "queryActiveLeases()\n    \u2026\n      .onErrorComplete()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v1

    const-string v2, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    sget-object v0, Lee3;->a:Lee3;

    invoke-virtual {p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->s()LZ84;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->d()LZ84;

    move-result-object v3

    sget-object v4, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$i;->a:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$i;

    invoke-static {v0, v3, v4}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v3, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$k;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$k;

    new-instance v4, LTc2;

    invoke-direct {v4, v3}, LTc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$l;

    invoke-direct {v3, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$l;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    new-instance v4, LUc2;

    invoke-direct {v4, v3}, LUc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$m;

    invoke-direct {v3, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$m;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    new-instance v4, LVc2;

    invoke-direct {v4, v3}, LVc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v3, "override fun onStart(own\u2026))\n      .subscribe()\n  }"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public p(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Lco/bird/android/model/itemlease/ItemLease;
    .locals 3

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->s()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/itemlease/ItemLease;

    invoke-virtual {v2, p1, p2}, Lco/bird/android/model/itemlease/ItemLease;->isLeaseForBirdId(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lco/bird/android/model/itemlease/ItemLease;

    return-object v1
.end method

.method public final p0(La94;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La94<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;>;",
            "Lco/bird/android/model/wire/WireBird;",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_0
    check-cast v1, Ljava/util/Collection;

    invoke-static {v1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public q(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->v:La94;

    invoke-virtual {p0, v0, p1, p2}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->n0(La94;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    return-void
.end method

.method public s()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/itemlease/ItemLease;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->n:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public t(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z
    .locals 5

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move p1, v1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WirePhysicalLock;

    iget-object v4, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->h:LTq4;

    invoke-static {v4, p1}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v4

    invoke-virtual {p0, v4, v2, p2}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->v(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v2

    if-eqz v2, :cond_2

    move p1, v3

    :goto_0
    if-ne p1, v3, :cond_3

    move v1, v3

    :cond_3
    return v1
.end method

.method public u(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/itemlease/LeaseReturnResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "leaseId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->c:LLc2;

    new-instance v1, Lco/bird/api/request/WireLeaseReturnRequest;

    invoke-direct {v1, p1}, Lco/bird/api/request/WireLeaseReturnRequest;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LLc2;->d(Lco/bird/api/request/WireLeaseReturnRequest;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$q;

    invoke-direct {v0, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$q;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    new-instance v1, LZc2;

    invoke-direct {v1, v0}, LZc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$r;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$r;

    new-instance v1, Lad2;

    invoke-direct {v1, v0}, Lad2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun returnLease\u2026e()\n        )\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public v(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z
    .locals 3

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "physicalLock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p3, v1, :cond_1

    const/4 p1, 0x2

    if-ne p3, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getLeaseConfig()Lco/bird/android/model/wire/configs/LeaseConfig;

    move-result-object p3

    invoke-virtual {p3}, Lco/bird/android/model/wire/configs/LeaseConfig;->getLeaseTypes()Lco/bird/android/model/wire/configs/LeaseTypesConfig;

    move-result-object p3

    invoke-virtual {p3}, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->getHelmet()Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    move-result-object p3

    invoke-virtual {p3}, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->getEnabled()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object p3

    sget-object v2, Lco/bird/android/model/constant/PhysicalLockPurpose;->HELMET:Lco/bird/android/model/constant/PhysicalLockPurpose;

    if-ne p3, v2, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/wire/WirePhysicalLock;->isSolebe()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getSmartlockConfig()Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/SmartlockRideConfig;->getEnableSolebeLocks()Ljava/lang/Boolean;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    :goto_0
    return v0
.end method

.method public w()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->r:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public x(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/api/request/WirePaymentAuthRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/itemlease/LeaseStartResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leasedItemId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->g:LGI3;

    invoke-interface {v0, p1}, LGI3;->u(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$u;

    invoke-direct {v0, p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$u;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    new-instance v1, LXc2;

    invoke-direct {v1, v0}, LXc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->d:LOh;

    invoke-static {v0}, LRh;->c(LOh;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->R(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->d:LOh;

    invoke-static {p1}, LRh;->c(LOh;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    const-string v0, "override fun startLease(\u2026)\n          }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)V

    new-instance p2, LYc2;

    invoke-direct {p2, v7}, LYc2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public y(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->w:La94;

    invoke-virtual {p0, v0, p1, p2}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->p0(La94;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    return-void
.end method

.method public z(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Lco/bird/android/model/itemlease/ItemLease;
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leaseType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->p(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Lco/bird/android/model/itemlease/ItemLease;

    move-result-object p1

    return-object p1
.end method
