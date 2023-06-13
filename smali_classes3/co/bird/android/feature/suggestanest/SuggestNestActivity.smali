.class public final Lco/bird/android/feature/suggestanest/SuggestNestActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LNU5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/suggestanest/SuggestNestActivity$a;,
        Lco/bird/android/feature/suggestanest/SuggestNestActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u0002:\u0002\u008b\u0001B\t\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0008\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0008\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\u000e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0017H\u0016J\u000e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u001d0\u0017H\u0016J\u0014\u0010 \u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u001d0\u0017H\u0016J\u000e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0017H\u0016J\u000e\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0017H\u0016J\u000e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\rH\u0014J\u0008\u0010&\u001a\u00020\u0003H\u0014J\u0008\u0010\'\u001a\u00020\u0003H\u0014J\u0008\u0010(\u001a\u00020\u0003H\u0014J\u0008\u0010)\u001a\u00020\u0003H\u0014J\u0008\u0010*\u001a\u00020\u0003H\u0014J\u0008\u0010+\u001a\u00020\u0003H\u0016R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008O\u0010P\u001a\u0004\u0008Q\u0010RR\u0014\u0010V\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u001c\u0010_\u001a\n \\*\u0004\u0018\u00010[0[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0018\u0010i\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010fR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\"\u0010r\u001a\u0010\u0012\u000c\u0012\n \\*\u0004\u0018\u00010o0o0n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR.\u0010v\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020t \\*\n\u0012\u0004\u0012\u00020t\u0018\u00010s0s0n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010qR.\u0010x\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020w \\*\n\u0012\u0004\u0012\u00020w\u0018\u00010s0s0n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010qR\"\u0010\u0018\u001a\u0010\u0012\u000c\u0012\n \\*\u0004\u0018\u00010\u00030\u00030n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010qR\"\u0010{\u001a\u0010\u0012\u000c\u0012\n \\*\u0004\u0018\u00010\u00190\u00190n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010qR.\u0010}\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e \\*\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u001d0n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008|\u0010qR.\u0010\u007f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e \\*\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u001d0n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008~\u0010qR$\u0010\u0081\u0001\u001a\u0010\u0012\u000c\u0012\n \\*\u0004\u0018\u00010\u00100\u00100n8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010qR$\u0010\u0083\u0001\u001a\u0010\u0012\u000c\u0012\n \\*\u0004\u0018\u00010\u001e0\u001e0n8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0082\u0001\u0010qR\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0085\u0001\u0010\u0086\u0001\u00a8\u0006\u008c\u0001"
    }
    d2 = {
        "Lco/bird/android/feature/suggestanest/SuggestNestActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LNU5;",
        "",
        "y1",
        "l1",
        "LcD1;",
        "googleMap",
        "X0",
        "t1",
        "LOU5;",
        "state",
        "F0",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "M1",
        "Lio/reactivex/Observable;",
        "myLocationClicks",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "C2",
        "F8",
        "f",
        "Lco/bird/android/buava/Optional;",
        "",
        "W0",
        "z",
        "h4",
        "W4",
        "b7",
        "outState",
        "onSaveInstanceState",
        "onStart",
        "onResume",
        "onPause",
        "onStop",
        "onDestroy",
        "onLowMemory",
        "LLU5;",
        "j",
        "LLU5;",
        "V0",
        "()LLU5;",
        "setPresenter",
        "(LLU5;)V",
        "presenter",
        "LiU5;",
        "k",
        "LiU5;",
        "R0",
        "()LiU5;",
        "setConverter",
        "(LiU5;)V",
        "converter",
        "LIL2;",
        "l",
        "LIL2;",
        "U0",
        "()LIL2;",
        "setMapStyler",
        "(LIL2;)V",
        "mapStyler",
        "Ll6;",
        "m",
        "Ll6;",
        "binding",
        "n",
        "LcD1;",
        "Landroid/os/HandlerThread;",
        "o",
        "Landroid/os/HandlerThread;",
        "asyncHandlerThread",
        "Landroid/os/Handler;",
        "p",
        "Lkotlin/Lazy;",
        "Q0",
        "()Landroid/os/Handler;",
        "asyncHandler",
        "q",
        "Landroid/os/Handler;",
        "mainHandler",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "r",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "lock",
        "Ljava/util/concurrent/locks/Condition;",
        "kotlin.jvm.PlatformType",
        "s",
        "Ljava/util/concurrent/locks/Condition;",
        "condition",
        "LfM2;",
        "t",
        "LfM2;",
        "locationMarker",
        "Lxj0;",
        "u",
        "Lxj0;",
        "accuracyCircle",
        "v",
        "maxDistanceCircle",
        "LRU5;",
        "w",
        "LRU5;",
        "pinMarker",
        "Lma4;",
        "Landroid/location/Location;",
        "x",
        "Lma4;",
        "moveToRelay",
        "",
        "Lco/bird/android/model/wire/WireArea;",
        "y",
        "areaRelay",
        "Lco/bird/android/model/wire/WireNestArea;",
        "nestRelay",
        "A",
        "B",
        "pinLocationUpdates",
        "C",
        "nameChanges",
        "D",
        "noteChanges",
        "E",
        "capacityChanges",
        "F",
        "assetIdChanges",
        "Lg46$b;",
        "S0",
        "()Lg46$b;",
        "logger",
        "<init>",
        "()V",
        "G",
        "a",
        "suggest-a-nest_release"
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
        "SMAP\nSuggestNestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,474:1\n1#2:475\n199#3:476\n180#3:477\n180#3:478\n180#3:479\n368#4:480\n*S KotlinDebug\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity\n*L\n247#1:476\n381#1:477\n400#1:478\n407#1:479\n348#1:480\n*E\n"
    }
.end annotation


# static fields
.field public static final G:Lco/bird/android/feature/suggestanest/SuggestNestActivity$a;


# instance fields
.field public final A:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final B:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field public final C:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final D:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final E:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public j:LLU5;

.field public k:LiU5;

.field public l:LIL2;

.field public m:Ll6;

.field public n:LcD1;

.field public final o:Landroid/os/HandlerThread;

.field public final p:Lkotlin/Lazy;

.field public final q:Landroid/os/Handler;

.field public final r:Ljava/util/concurrent/locks/ReentrantLock;

.field public final s:Ljava/util/concurrent/locks/Condition;

.field public t:LfM2;

.field public u:Lxj0;

.field public v:Lxj0;

.field public w:LRU5;

.field public final x:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireArea;",
            ">;>;"
        }
    .end annotation
.end field

.field public final z:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireNestArea;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->G:Lco/bird/android/feature/suggestanest/SuggestNestActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "async"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->o:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$c;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->p:Lkotlin/Lazy;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->q:Landroid/os/Handler;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->r:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->s:Ljava/util/concurrent/locks/Condition;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Location>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->x:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<List<WireArea>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->y:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<List<WireNestArea>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->z:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->A:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<LatLng>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->B:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Optional<String>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->C:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->D:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Int>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->E:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->F:Lma4;

    return-void
.end method

.method public static synthetic A0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->L1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    return-void
.end method

.method public static synthetic B0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->O1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final B1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->n:LcD1;

    invoke-virtual {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->U0()LIL2;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, LIL2$a;->onMapReady$default(LIL2;LcD1;Ljava/util/List;ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->X0(LcD1;)V

    new-instance v0, LRU5;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {p1}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/maps/model/CameraPosition;->b:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    sget v3, Lkg4;->ic_suggestion_pin_valid:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LfB0;->icon$default(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    const v3, 0x3f5eb852    # 0.87f

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->R1(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const/high16 v2, 0x42ca0000    # 101.0f

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {p1, v1}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v1

    invoke-direct {v0, v1}, LRU5;-><init>(LfM2;)V

    iput-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->w:LRU5;

    new-instance v0, LFT5;

    invoke-direct {v0, p0, p1}, LFT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V

    invoke-virtual {p1, v0}, LcD1;->u(LcD1$e;)V

    new-instance v0, LGT5;

    invoke-direct {v0, p0}, LGT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-virtual {p1, v0}, LcD1;->v(LcD1$f;)V

    new-instance v0, LHT5;

    invoke-direct {v0, p0, p1}, LHT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V

    invoke-virtual {p1, v0}, LcD1;->s(LcD1$c;)V

    iget-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->r:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->s:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->o:Landroid/os/HandlerThread;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/os/Looper;->quitSafely()V

    :cond_0
    return-void

    :catchall_0
    move-exception p0

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0
.end method

.method public static synthetic C0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->j1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final C1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$googleMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->V0()LLU5;

    move-result-object v0

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOU5;

    invoke-virtual {v0}, LOU5;->o()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->B:Lma4;

    invoke-virtual {p1}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/maps/model/CameraPosition;->b:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    iget-object p1, p1, Ll6;->l:Landroid/widget/ImageView;

    const-string v1, "binding.suggestionPin"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {p1, v3, v1, v2, v0}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->w:LRU5;

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LRU5;->c(Ljava/lang/Boolean;)V

    :goto_0
    return-void
.end method

.method public static final D1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;I)V
    .locals 4

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->V0()LLU5;

    move-result-object p1

    invoke-virtual {p1}, Lf1;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LOU5;

    invoke-virtual {p1}, LOU5;->o()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    iget-object p1, p1, Ll6;->l:Landroid/widget/ImageView;

    const-string v1, "binding.suggestionPin"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {p1, v3, v1, v2, v0}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->w:LRU5;

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LRU5;->c(Ljava/lang/Boolean;)V

    :goto_0
    return-void
.end method

.method public static synthetic E0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final F1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$googleMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->V0()LLU5;

    move-result-object v0

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOU5;

    invoke-virtual {v0}, LOU5;->o()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->B:Lma4;

    invoke-virtual {p1}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/maps/model/CameraPosition;->b:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->w:LRU5;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/maps/model/CameraPosition;->b:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, p1}, LRU5;->b(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_0
    iget-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->w:LRU5;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, LRU5;->c(Ljava/lang/Boolean;)V

    :goto_1
    iget-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->q:Landroid/os/Handler;

    new-instance v0, LKT5;

    invoke-direct {v0, p0}, LKT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    const-wide/16 v1, 0x32

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static final I1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p0, v0

    :cond_0
    iget-object p0, p0, Ll6;->l:Landroid/widget/ImageView;

    const-string v1, "binding.suggestionPin"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v2, v1, v0}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public static final J1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LbM2$a;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->S0()Lg46$b;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initialized maps with renderer: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final K0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->r:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :goto_0
    :try_start_0
    iget-object v1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->n:LcD1;

    if-nez v1, :cond_0

    iget-object v1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->s:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->await()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->q:Landroid/os/Handler;

    new-instance v2, LJT5;

    invoke-direct {v2, p0, p1}, LJT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0
.end method

.method public static final L0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->M1(LOU5;)V

    return-void
.end method

.method public static final L1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Ll6;->l:Landroid/widget/ImageView;

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez p0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    :goto_0
    iget-object p0, v1, Ll6;->l:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    int-to-float p0, p0

    const v1, -0x41428f5c    # -0.37f

    mul-float/2addr p0, v1

    invoke-virtual {v0, p0}, Landroid/view/View;->setTranslationY(F)V

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

.method public static final N0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0
.end method

.method public static final N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final O1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic P(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->o1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    return-void
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->a1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic R(Lco/bird/android/feature/suggestanest/SuggestNestActivity;I)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->D1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;I)V

    return-void
.end method

.method public static synthetic S(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->r1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    return-void
.end method

.method public static synthetic U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lqc0;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->u1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lqc0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->n1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    return-void
.end method

.method public static synthetic Y(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->F1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V

    return-void
.end method

.method public static final Y0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static synthetic Z(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->C1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V

    return-void
.end method

.method public static final Z0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final a1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getAsyncHandlerThread$p(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)Landroid/os/HandlerThread;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->o:Landroid/os/HandlerThread;

    return-object p0
.end method

.method public static final synthetic access$getGoogleMap$p(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)LcD1;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->n:LcD1;

    return-object p0
.end method

.method public static final synthetic access$getMyLocationClicks$p(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->A:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getNameChanges$p(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->C:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getNoteChanges$p(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->D:Lma4;

    return-object p0
.end method

.method public static synthetic b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->N0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->Z0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->B1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LcD1;)V

    return-void
.end method

.method public static final f1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic h0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->K0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V

    return-void
.end method

.method public static final h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static synthetic i0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->s1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    return-void
.end method

.method public static final i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->Y0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final j1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic k0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LbM2$a;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->J1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LbM2$a;)V

    return-void
.end method

.method public static final k1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->x1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final n1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    const-string v3, "from(binding.bottomSheet)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x5

    invoke-virtual {v0, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0(I)V

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez p0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    :goto_0
    iget-object p0, v1, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->setPeekHeight(I)V

    return-void
.end method

.method public static synthetic o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final o1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->u()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v3, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v1

    :cond_1
    invoke-virtual {v3}, Ll6;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    iget-object v4, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v4, v4, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    sub-int/2addr v3, v4

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez p0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v1, p0

    :goto_0
    iget-object p0, v1, Ll6;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    sub-int/2addr v3, p0

    invoke-virtual {v0, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0(I)V

    :cond_4
    return-void
.end method

.method public static synthetic p0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->L0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V

    return-void
.end method

.method public static synthetic q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->M0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final r1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ll6;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v1, LIT5;

    invoke-direct {v1, p0}, LIT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static final s1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const-string v1, "binding"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    iget-object v0, v0, Ll6;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget-object v3, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v3, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    :cond_1
    iget-object v3, v3, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    const-string v4, "binding.bottomSheet"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    instance-of v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v4, :cond_2

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_3

    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    if-ne v3, v0, :cond_4

    return-void

    :cond_4
    iget-object v3, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v3, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    :cond_5
    iget-object v3, v3, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;

    iput v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget-object p0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez p0, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    move-object v2, p0

    :goto_2
    iget-object p0, v2, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {p0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static synthetic t0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->I1(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    return-void
.end method

.method public static final u1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lqc0;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqc0;

    return-object p0
.end method

.method public static synthetic w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->f1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->k1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final x1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public C2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->B:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "pinLocationUpdates.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final F0(LOU5;)V
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->Q0()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, LbU5;

    invoke-direct {v1, p0, p1}, LbU5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public F8()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Ll6;->k:Landroid/widget/Button;

    const-string v2, "binding.suggestNest"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public M1(LOU5;)V
    .locals 18

    move-object/from16 v6, p0

    const-string v0, "state"

    move-object/from16 v7, p1

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->n:LcD1;

    if-nez v0, :cond_0

    invoke-virtual/range {p0 .. p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->F0(LOU5;)V

    :cond_0
    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const-string v8, "binding"

    const/4 v9, 0x0

    if-nez v0, :cond_1

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v9

    :cond_1
    iget-object v0, v0, Ll6;->i:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    const-string v1, "binding.progressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LOU5;->m()I

    move-result v1

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-lez v1, :cond_2

    move v1, v10

    goto :goto_0

    :cond_2
    move v1, v11

    :goto_0
    const/4 v12, 0x2

    invoke-static {v0, v1, v11, v12, v9}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->y:Lma4;

    invoke-virtual/range {p1 .. p1}, LOU5;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->z:Lma4;

    invoke-virtual/range {p1 .. p1}, LOU5;->k()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, LOU5;->i()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->x:Lma4;

    invoke-virtual {v1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_3
    invoke-virtual/range {p1 .. p1}, LOU5;->q()Landroid/location/Location;

    move-result-object v13

    if-eqz v13, :cond_b

    invoke-static {v13}, Lcm2;->d(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v14

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->t:LfM2;

    const/high16 v15, 0x42c80000    # 100.0f

    if-nez v0, :cond_5

    iget-object v5, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->n:LcD1;

    if-eqz v5, :cond_4

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v0, v14}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v4

    sget v1, Lrg4;->ic_user_location_v2:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    move-object/from16 v0, p0

    move-object v9, v4

    move/from16 v4, v16

    move-object v11, v5

    move-object/from16 v5, v17

    invoke-static/range {v0 .. v5}, LfB0;->icon$default(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/google/android/gms/maps/model/MarkerOptions;->E(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {v11, v0}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v0

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    iput-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->t:LfM2;

    :cond_5
    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v0, v14}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_2
    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->u:Lxj0;

    if-nez v0, :cond_8

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->n:LcD1;

    if-eqz v0, :cond_7

    new-instance v1, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual {v1, v14}, Lcom/google/android/gms/maps/model/CircleOptions;->s(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v13}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->m0(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    sget v2, LDf4;->birdESBlue10:I

    invoke-static {v6, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->u(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->D0(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v1, v15}, Lcom/google/android/gms/maps/model/CircleOptions;->E0(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, LcD1;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lxj0;

    move-result-object v0

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :goto_3
    iput-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->u:Lxj0;

    :cond_8
    if-nez v0, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v0, v14}, Lxj0;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_4
    if-nez v0, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {v13}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lxj0;->b(D)V

    :cond_b
    :goto_5
    invoke-virtual/range {p1 .. p1}, LOU5;->p()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->t:LfM2;

    if-nez v1, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {v1, v0}, LfM2;->n(F)V

    :cond_d
    :goto_6
    invoke-virtual/range {p1 .. p1}, LOU5;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_12

    invoke-virtual/range {p1 .. p1}, LOU5;->q()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_12

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->v:Lxj0;

    if-nez v0, :cond_f

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->n:LcD1;

    if-eqz v0, :cond_e

    new-instance v1, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual/range {p1 .. p1}, LOU5;->q()Landroid/location/Location;

    move-result-object v2

    invoke-static {v2}, Lcm2;->d(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->s(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LOU5;->g()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->m0(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    sget v2, LDf4;->birdESBlue10:I

    invoke-static {v6, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->u(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    sget v2, LDf4;->birdESBlue:I

    invoke-static {v6, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->p0(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->D0(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, LcD1;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lxj0;

    move-result-object v0

    goto :goto_7

    :cond_e
    const/4 v0, 0x0

    :goto_7
    iput-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->v:Lxj0;

    :cond_f
    if-nez v0, :cond_10

    goto :goto_8

    :cond_10
    invoke-virtual/range {p1 .. p1}, LOU5;->q()Landroid/location/Location;

    move-result-object v1

    invoke-static {v1}, Lcm2;->d(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxj0;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_8
    if-nez v0, :cond_11

    goto :goto_9

    :cond_11
    invoke-virtual/range {p1 .. p1}, LOU5;->g()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lxj0;->b(D)V

    :cond_12
    :goto_9
    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->w:LRU5;

    if-eqz v0, :cond_13

    invoke-virtual/range {p1 .. p1}, LOU5;->e()LBj6;

    move-result-object v1

    invoke-static {v1}, LcU5;->access$isValid(LBj6;)Z

    move-result v1

    invoke-virtual {v0, v1, v6}, LRU5;->a(ZLandroid/content/Context;)V

    :cond_13
    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_14

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_14
    iget-object v0, v0, Ll6;->l:Landroid/widget/ImageView;

    invoke-virtual/range {p1 .. p1}, LOU5;->e()LBj6;

    move-result-object v1

    invoke-static {v1}, LcU5;->access$isValid(LBj6;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_15

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_15
    iget-object v0, v0, Ll6;->k:Landroid/widget/Button;

    invoke-virtual/range {p1 .. p1}, LOU5;->e()LBj6;

    move-result-object v1

    invoke-static {v1}, LcU5;->access$isValid(LBj6;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_16

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_16
    iget-object v0, v0, Ll6;->m:Landroid/widget/TextView;

    const-string v1, "binding.validityMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LOU5;->e()LBj6;

    move-result-object v1

    const/4 v2, -0x1

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_a

    :cond_17
    sget-object v3, Lco/bird/android/feature/suggestanest/SuggestNestActivity$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    :goto_a
    if-eq v1, v2, :cond_1b

    if-eq v1, v10, :cond_1a

    if-eq v1, v12, :cond_19

    const/4 v2, 0x3

    if-ne v1, v2, :cond_18

    sget v1, Lnl4;->suggest_nest_location_invalid_not_in_circle:I

    invoke-virtual {v6, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_b

    :cond_18
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_19
    sget v1, Lnl4;->suggest_nest_location_invalid_not_permitted:I

    invoke-virtual {v6, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_b

    :cond_1a
    sget v1, Lnl4;->suggest_nest_location_valid:I

    invoke-virtual {v6, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_b

    :cond_1b
    const/4 v1, 0x0

    :goto_b
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v12, v3}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_1c

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1c
    iget-object v0, v0, Ll6;->k:Landroid/widget/Button;

    const-string v1, "binding.suggestNest"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LOU5;->o()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    if-nez v1, :cond_1d

    move v1, v10

    goto :goto_c

    :cond_1d
    const/4 v1, 0x0

    :goto_c
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v12, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v3, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v3, :cond_1e

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_1e
    iget-object v0, v3, Ll6;->j:Landroidx/constraintlayout/widget/Group;

    const-string v1, "binding.secondaryButtons"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LOU5;->o()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    if-eqz v1, :cond_1f

    move v2, v10

    const/4 v1, 0x0

    goto :goto_d

    :cond_1f
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_d
    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v12, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, LOU5;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->R0()LiU5;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, LOU5;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, LOU5;->j()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, LOU5;->l()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, LOU5;->n()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    :cond_20
    move v15, v10

    invoke-virtual/range {p1 .. p1}, LOU5;->f()Ljava/lang/Integer;

    move-result-object v16

    invoke-virtual/range {v11 .. v16}, LiU5;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Ljava/util/List;

    move-result-object v0

    iget-object v1, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v1, :cond_21

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_21
    iget-object v1, v1, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {v1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->v()LwZ;

    move-result-object v1

    invoke-virtual {v1, v0}, LwZ;->c(Ljava/util/List;)V

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_22

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_22
    iget-object v0, v0, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->C()Z

    move-result v0

    if-eqz v0, :cond_26

    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_23

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v9, v3

    goto :goto_e

    :cond_23
    move-object v9, v0

    :goto_e
    iget-object v0, v9, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->W()V

    goto :goto_10

    :cond_24
    iget-object v0, v6, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_25

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v9, v3

    goto :goto_f

    :cond_25
    move-object v9, v0

    :goto_f
    iget-object v0, v9, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->U()V

    :cond_26
    :goto_10
    invoke-virtual/range {p1 .. p1}, LOU5;->h()Lco/bird/android/model/wire/WireNestSuggestionMessage;

    move-result-object v0

    if-eqz v0, :cond_27

    new-instance v9, LnB1;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireNestSuggestionMessage;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireNestSuggestionMessage;->getBody()Ljava/lang/String;

    move-result-object v0

    sget-object v2, LFY3;->b:LFY3;

    invoke-direct {v9, v1, v0, v2}, LnB1;-><init>(Ljava/lang/String;Ljava/lang/String;LFY3;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    if-eqz v0, :cond_27

    invoke-static/range {p0 .. p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    if-eqz v0, :cond_27

    new-instance v1, Lco/bird/android/feature/suggestanest/SuggestNestActivity$t;

    invoke-direct {v1, v6}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$t;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    new-instance v2, LBT5;

    invoke-direct {v2, v1}, LBT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/feature/suggestanest/SuggestNestActivity$u;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity$u;

    new-instance v3, LMT5;

    invoke-direct {v3, v1}, LMT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2, v3}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_27
    invoke-virtual/range {p1 .. p1}, LOU5;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_28

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v1

    invoke-static {v1, v0}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    :cond_28
    return-void
.end method

.method public final Q0()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->p:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method

.method public final R0()LiU5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->k:LiU5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "converter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final S0()Lg46$b;
    .locals 2

    const-string v0, "Suggest Nest"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"Suggest Nest\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final U0()LIL2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->l:LIL2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapStyler"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final V0()LLU5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->j:LLU5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public W0()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->C:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "nameChanges.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public W4()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->F:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "assetIdChanges.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final X0(LcD1;)V
    .locals 6

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->y:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/suggestanest/SuggestNestActivity$f;

    invoke-direct {v1, p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$f;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    new-instance v2, LLT5;

    invoke-direct {v2, v1}, LLT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/suggestanest/SuggestNestActivity$g;->b:Lco/bird/android/feature/suggestanest/SuggestNestActivity$g;

    new-instance v2, LNT5;

    invoke-direct {v2, v1}, LNT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun initAreaRend\u2026 { e -> Timber.e(e) }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lco/bird/android/feature/suggestanest/SuggestNestActivity$h;

    invoke-direct {v3, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$h;-><init>(LcD1;)V

    new-instance v4, LOT5;

    invoke-direct {v4, v3}, LOT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v3, Lco/bird/android/feature/suggestanest/SuggestNestActivity$i;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity$i;

    new-instance v5, LPT5;

    invoke-direct {v5, v3}, LPT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4, v5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->z:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/feature/suggestanest/SuggestNestActivity$j;

    invoke-direct {v3, p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$j;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    new-instance v4, LQT5;

    invoke-direct {v4, v3}, LQT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v3, Lco/bird/android/feature/suggestanest/SuggestNestActivity$k;->b:Lco/bird/android/feature/suggestanest/SuggestNestActivity$k;

    new-instance v4, LRT5;

    invoke-direct {v4, v3}, LRT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/feature/suggestanest/SuggestNestActivity$l;

    invoke-direct {v1, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$l;-><init>(LcD1;)V

    new-instance p1, LST5;

    invoke-direct {p1, v1}, LST5;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/feature/suggestanest/SuggestNestActivity$m;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity$m;

    new-instance v2, LTT5;

    invoke-direct {v2, v1}, LTT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, p1, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public b7()Lio/reactivex/Observable;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const-string v1, "binding"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    iget-object v0, v0, Ll6;->b:Landroid/widget/Button;

    const-string v3, "binding.back"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    invoke-static {v0, v3, v4, v5, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v3, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v3, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    iget-object v1, v2, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {v1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->u()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lsu6;->g(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Lio/reactivex/Observable;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Lco/bird/android/feature/suggestanest/SuggestNestActivity$d;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity$d;

    new-instance v3, LWT5;

    invoke-direct {v3, v2}, LWT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Lco/bird/android/feature/suggestanest/SuggestNestActivity$e;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity$e;

    new-instance v3, LXT5;

    invoke-direct {v3, v2}, LXT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object v1

    :goto_1
    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "merge(\n    binding.back.\u2026?: Observable.empty()\n  )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public f()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Ll6;->e:Landroid/widget/Button;

    const-string v2, "binding.confirm"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public h4()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->E:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "capacityChanges.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final l1()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    new-instance v3, LCT5;

    invoke-direct {v3, p0}, LCT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget-object v0, v0, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v3, LDT5;

    invoke-direct {v3, p0}, LDT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    iget-object v0, v0, Ll6;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v3, LET5;

    invoke-direct {v3, p0}, LET5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    iget-object v0, v0, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    new-instance v3, Lco/bird/android/feature/suggestanest/SuggestNestActivity$n;

    invoke-direct {v3, p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$n;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-virtual {v0, v3}, Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;->setOnNameUpdated(Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    iget-object v0, v0, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    new-instance v3, Lco/bird/android/feature/suggestanest/SuggestNestActivity$o;

    invoke-direct {v3, p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$o;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-virtual {v0, v3}, Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;->setOnNoteUpdated(Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v0

    :goto_0
    iget-object v0, v1, Ll6;->c:Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;

    new-instance v1, Lco/bird/android/feature/suggestanest/SuggestNestActivity$p;

    iget-object v2, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->E:Lma4;

    invoke-direct {v1, v2}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$p;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lco/bird/android/feature/suggestanest/bottomsheet/SuggestNestBottomSheet;->setOnCapacityUpdated(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public myLocationClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->A:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "myLocationClicks.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x275f

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "asset_id"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->F:Lma4;

    invoke-virtual {p2, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 18

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1}, Ll6;->c(Landroid/view/LayoutInflater;)Ll6;

    move-result-object v1

    const-string v2, "inflate(layoutInflater)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    const-string v3, "binding"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1}, Ll6;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, LRQ0;->a()LhU5$a;

    move-result-object v1

    sget-object v4, LoG2;->a:LoG2;

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v5

    const-string v6, "application"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v4

    new-instance v15, Lco/bird/android/model/PhotoBannerViewModel;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget v5, Lnl4;->suggest_nest_photo_title:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    sget v5, Lnl4;->suggest_nest_photo_body:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1cf

    const/16 v17, 0x0

    move-object v5, v15

    move-object v2, v15

    move/from16 v15, v16

    move-object/from16 v16, v17

    invoke-direct/range {v5 .. v16}, Lco/bird/android/model/PhotoBannerViewModel;-><init>(Lco/bird/android/model/PhotoBannerContext;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4, v2}, LhU5$a;->a(LlG2;Lco/bird/android/model/PhotoBannerViewModel;)LhU5;

    move-result-object v1

    invoke-interface {v1, v0}, LhU5;->a(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    sget-object v1, LbM2$a;->c:LbM2$a;

    new-instance v2, LUT5;

    invoke-direct {v2, v0}, LUT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-static {v0, v1, v2}, LbM2;->b(Landroid/content/Context;LbM2$a;LVg3;)I

    iget-object v1, v0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_1
    iget-object v1, v1, Ll6;->f:Lcom/google/android/gms/maps/MapView;

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/MapView;->b(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->y1()V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->l1()V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->t1()V

    iget-object v1, v0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_2
    iget-object v1, v1, Ll6;->h:Landroid/widget/ImageView;

    const-string v2, "binding.myLocation"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lco/bird/android/feature/suggestanest/SuggestNestActivity$s;

    invoke-direct {v2, v0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$s;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-static {v1, v2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    iget-object v1, v2, Ll6;->l:Landroid/widget/ImageView;

    new-instance v2, LVT5;

    invoke-direct {v2, v0}, LVT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->V0()LLU5;

    move-result-object v1

    invoke-virtual {v1, v0}, LLU5;->O(LNU5;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ll6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->c()V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ll6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->d()V

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ll6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->e()V

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ll6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->f()V

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ll6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView;->g(Landroid/os/Bundle;)V

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ll6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->h()V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ll6;->f:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->i()V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LOU5;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->M1(LOU5;)V

    return-void
.end method

.method public final t1()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->x:Lma4;

    sget-object v1, Lco/bird/android/feature/suggestanest/SuggestNestActivity$q;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity$q;

    new-instance v2, LZT5;

    invoke-direct {v2, v1}, LZT5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "moveToRelay\n      .map {\u2026(), DEFAULT_ZOOM_LEVEL) }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/feature/suggestanest/SuggestNestActivity$r;

    invoke-direct {v1, p0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$r;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    new-instance v2, LaU5;

    invoke-direct {v2, v1}, LaU5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final y1()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->m:Ll6;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Ll6;->f:Lcom/google/android/gms/maps/MapView;

    new-instance v1, LYT5;

    invoke-direct {v1, p0}, LYT5;-><init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/MapView;->a(LUg3;)V

    return-void
.end method

.method public z()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->D:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "noteChanges.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
