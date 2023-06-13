.class public final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001XB\u0007\u00a2\u0006\u0004\u0008U\u0010VJ\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0008\u0010\u0007\u001a\u00020\u0005H\u0014J\u0008\u0010\u0008\u001a\u00020\u0005H\u0014J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0008\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u000e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0011H\u0016J\u001c\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001b0\u0011H\u0016J\u000e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0011H\u0016J\u000e\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0016R\"\u0010\'\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008;\u00106\u001a\u0004\u0008<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\"\u0010G\u001a\u0010\u0012\u000c\u0012\n D*\u0004\u0018\u00010\u00120\u00120C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\"\u0010I\u001a\u0010\u0012\u000c\u0012\n D*\u0004\u0018\u00010\u00050\u00050C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010FR>\u0010K\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000b D*\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u001b0\u001b0C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010FR\"\u0010M\u001a\u0010\u0012\u000c\u0012\n D*\u0004\u0018\u00010\u00050\u00050C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010FR\"\u0010O\u001a\u0010\u0012\u000c\u0012\n D*\u0004\u0018\u00010\u00050\u00050C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010FR\u001b\u0010T\u001a\u00020P8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Q\u00106\u001a\u0004\u0008R\u0010S\u00a8\u0006Y"
    }
    d2 = {
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "onPause",
        "Landroid/view/MenuItem;",
        "item",
        "",
        "onOptionsItemSelected",
        "onBackPressed",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;",
        "state",
        "p0",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/constant/VehicleInventoryAction;",
        "K1",
        "c1",
        "I2",
        "b8",
        "z1",
        "W",
        "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
        "A1",
        "Lkotlin/Pair;",
        "V",
        "",
        "T",
        "G",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;",
        "j",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;",
        "i0",
        "()Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;",
        "setPresenter",
        "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V",
        "presenter",
        "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;",
        "k",
        "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;",
        "f0",
        "()Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;",
        "setConverter",
        "(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;)V",
        "converter",
        "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;",
        "l",
        "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;",
        "adapter",
        "LmX5;",
        "m",
        "Lkotlin/Lazy;",
        "j0",
        "()LmX5;",
        "swipeHelper",
        "Landroidx/recyclerview/widget/l;",
        "n",
        "h0",
        "()Landroidx/recyclerview/widget/l;",
        "itemTouchHelper",
        "Lf00;",
        "o",
        "Lf00;",
        "binding",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "p",
        "Lma4;",
        "actionRelay",
        "q",
        "confirmProcessRelay",
        "r",
        "undoDeleteRelay",
        "s",
        "backPressRelay",
        "t",
        "exitConfirmRelay",
        "LRk5;",
        "u",
        "w1",
        "()LRk5;",
        "rendererDelegate",
        "<init>",
        "()V",
        "v",
        "Companion",
        "core-inventory_release"
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
        "SMAP\nCoreInventoryScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanActivity.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n6#2:223\n1#3:224\n1#3:233\n13#4,2:225\n15#4,2:229\n1109#5,2:227\n180#6:231\n180#6:232\n218#6:237\n218#6:238\n199#6:239\n199#6:240\n1726#7,3:234\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanActivity.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity\n*L\n77#1:223\n77#1:224\n77#1:225,2\n77#1:229,2\n77#1:227,2\n95#1:231\n99#1:232\n167#1:237\n175#1:238\n180#1:239\n185#1:240\n141#1:234,3\n*E\n"
    }
.end annotation


# static fields
.field public static final v:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$Companion;


# instance fields
.field public j:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

.field public k:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;

.field public final l:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

.field public final m:Lkotlin/Lazy;

.field public final n:Lkotlin/Lazy;

.field public o:Lf00;

.field public final p:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/constant/VehicleInventoryAction;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
            "Ljava/lang/Boolean;",
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

.field public final u:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->v:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

    invoke-direct {v0}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->l:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$swipeHelper$2;

    invoke-direct {v0, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$swipeHelper$2;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->m:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemTouchHelper$2;

    invoke-direct {v0, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemTouchHelper$2;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->n:Lkotlin/Lazy;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<VehicleInventoryAction>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->p:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->q:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v2, "create<Pair<WireVehicleInventoryScan, Boolean?>>()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->r:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->s:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->t:Lma4;

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$rendererDelegate$2;

    invoke-direct {v0, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$rendererDelegate$2;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->u:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->t0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic Y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireVehicleInventoryScan;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireVehicleInventoryScan;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)Lf00;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o:Lf00;

    return-object p0
.end method

.method public static final synthetic access$getConfirmProcessRelay$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->q:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getExitConfirmRelay$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->t:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getSwipeHelper(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)LmX5;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->j0()LmX5;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUndoDeleteRelay$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->r:Lma4;

    return-object p0
.end method

.method public static synthetic b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireVehicleInventoryScan;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireVehicleInventoryScan;

    return-object p0
.end method

.method public static final n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG6;

    return-object p0
.end method

.method public static final o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final t0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A1()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->j0()LmX5;

    move-result-object v0

    invoke-virtual {v0}, LmX5;->b()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$1;

    iget-object v2, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->l:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

    invoke-direct {v1, v2}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$1;-><init>(Ljava/lang/Object;)V

    new-instance v2, LfC0;

    invoke-direct {v2, v1}, LfC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$2;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$2;

    new-instance v2, LgC0;

    invoke-direct {v2, v1}, LgC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;

    invoke-direct {v1, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    new-instance v2, LhC0;

    invoke-direct {v2, v1}, LhC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doAfterNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$4;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$4;

    new-instance v2, LiC0;

    invoke-direct {v2, v1}, LiC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun itemSwiped(\u2026  .map { (scan) -> scan }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public G()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {v0}, LRk5;->G()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public I2()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->l:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

    invoke-virtual {v0}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->I2()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public K1()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/constant/VehicleInventoryAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->p:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "actionRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public T()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {v0}, LRk5;->Am()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public V()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->r:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "undoDeleteRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public W()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->t:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "exitConfirmRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->q:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "confirmProcessRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->l:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

    invoke-virtual {v0}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->c1()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final f0()Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->k:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "converter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h0()Landroidx/recyclerview/widget/l;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->n:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/l;

    return-object v0
.end method

.method public final i0()Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->j:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j0()LmX5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->m:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX5;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->s:Lma4;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11

    const-string v0, "Array contains no element matching the predicate."

    const-class v1, Lco/bird/android/model/constant/VehicleInventoryAction;

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lf00;->c(Landroid/view/LayoutInflater;)Lf00;

    move-result-object p1

    const-string v2, "inflate(layoutInflater)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o:Lf00;

    const-string v2, "binding"

    const/4 v3, 0x0

    if-nez p1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_0
    invoke-virtual {p1}, Lf00;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v4, "intent"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "vehicle_inventory_action"

    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz p1, :cond_5

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v7, v6

    move v8, v4

    :goto_0
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    move-object v10, v9

    check-cast v10, Ljava/lang/Enum;

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p1, v5}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_1

    const-string p1, "{\n    E::class.java.enum\u2026.equals(name, true) }\n  }"

    invoke-static {v9, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ljava/lang/Enum;

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v1, p1

    move v6, v4

    :goto_1
    if-ge v6, v1, :cond_4

    aget-object v7, p1, v6

    move-object v9, v7

    check-cast v9, Ljava/lang/Enum;

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    const-string v10, "UNKNOWN"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const-string p1, "{\n    E::class.java.enum\u2026m.name == \"UNKNOWN\" }\n  }"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    move-object v9, v3

    :goto_2
    check-cast v9, Lco/bird/android/model/constant/VehicleInventoryAction;

    if-nez v9, :cond_6

    return-void

    :cond_6
    invoke-static {}, LpI0;->a()LPB0$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    invoke-interface {p1, v0}, LPB0$a;->a(LlG2;)LPB0;

    move-result-object p1

    invoke-interface {p1, p0}, LPB0;->a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object p1

    invoke-virtual {p1, v5}, LRk5;->gm(Z)V

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object p1

    const/16 v0, 0x96

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, LRk5;->qm(I)V

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object p1

    invoke-virtual {p1, v4}, LRk5;->sm(Z)V

    iget-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o:Lf00;

    if-nez p1, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_7
    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->l:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o:Lf00;

    if-nez p1, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_8
    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o:Lf00;

    if-nez p1, :cond_9

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_9
    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->h0()Landroidx/recyclerview/widget/l;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o:Lf00;

    if-nez v0, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_a
    iget-object v0, v0, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o:Lf00;

    if-nez p1, :cond_b

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_b
    iget-object p1, p1, Lf00;->e:LYy0;

    iget-object p1, p1, LYy0;->d:Landroid/widget/ImageButton;

    const-string v0, "binding.constraintLayout.code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1, v5, v3}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {p1, v4}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v4, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v6, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$onCreate$1;

    invoke-direct {v6, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$onCreate$1;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    new-instance v7, LZB0;

    invoke-direct {v7, v6}, LZB0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v7}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o:Lf00;

    if-nez p1, :cond_c

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_c
    iget-object p1, p1, Lf00;->e:LYy0;

    iget-object p1, p1, LYy0;->f:Landroid/widget/ImageButton;

    const-string v2, "binding.constraintLayout.flashlight"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0, v1, v5, v3}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$onCreate$2;

    invoke-direct {v0, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$onCreate$2;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    new-instance v1, LaC0;

    invoke-direct {v1, v0}, LaC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->i0()Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    move-result-object p1

    invoke-virtual {p1, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->J(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;)V

    iget-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->p:Lma4;

    invoke-virtual {p1, v9}, Lma4;->accept(Ljava/lang/Object;)V

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

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->onBackPressed()V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {v0}, LRk5;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {v0}, LRk5;->onResume()V

    return-void
.end method

.method public p0(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)V
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer$DefaultImpls;->a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)V

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->f0()Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;

    move-result-object v0

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->getAction()Lco/bird/android/model/constant/VehicleInventoryAction;

    move-result-object v1

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->l()Ljava/util/List;

    move-result-object v2

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->f()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;->a(Lco/bird/android/model/constant/VehicleInventoryAction;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->l:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, LMy;->u(Ljava/util/Collection;)V

    instance-of v0, p1, Lco/bird/android/feature/coreinventory/scan/UpdateUi;

    if-eqz v0, :cond_6

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Pair;

    invoke-virtual {v3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v3, "vehicle_inventory_action"

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->getAction()Lco/bird/android/model/constant/VehicleInventoryAction;

    move-result-object v4

    invoke-static {v0, v3, v4}, Lc62;->a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Enum;)Landroid/content/Intent;

    const-string v3, "warehouse"

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v3, -0x1

    invoke-virtual {p0, v3, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v2}, Landroid/app/Activity;->setResult(I)V

    :goto_1
    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->o:Lf00;

    const/4 v3, 0x0

    if-nez v0, :cond_4

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_4
    iget-object v0, v0, Lf00;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    const-string v4, "binding.progressBar"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->m()I

    move-result p1

    if-lez p1, :cond_5

    goto :goto_2

    :cond_5
    move v1, v2

    :goto_2
    const/4 p1, 0x2

    invoke-static {v0, v1, v2, p1, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto/16 :goto_3

    :cond_6
    instance-of v0, p1, Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;

    const-string v1, "rendererDelegate.birdDia\u2026se == DialogResponse.OK }"

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object v3

    new-instance v4, LQB0;

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->getAction()Lco/bird/android/model/constant/VehicleInventoryAction;

    move-result-object v0

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, v0, p1}, LQB0;-><init>(Lco/bird/android/model/constant/VehicleInventoryAction;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$render$3;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$render$3;

    new-instance v3, LbC0;

    invoke-direct {v3, v0}, LbC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v3}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$render$4;

    invoke-direct {v0, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$render$4;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    new-instance v1, LcC0;

    invoke-direct {v1, v0}, LcC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    goto/16 :goto_3

    :cond_7
    instance-of v0, p1, Lco/bird/android/feature/coreinventory/scan/ConfirmExit;

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object v3

    new-instance v4, LZ86;

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->b()I

    move-result p1

    invoke-direct {v4, p1}, LZ86;-><init>(I)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$render$5;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$render$5;

    new-instance v3, LdC0;

    invoke-direct {v3, v0}, LdC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v3}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$render$6;

    invoke-direct {v0, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$render$6;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V

    new-instance v1, LeC0;

    invoke-direct {v1, v0}, LeC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    goto :goto_3

    :cond_8
    instance-of v0, p1, Lco/bird/android/feature/coreinventory/scan/AlertDisabledEmpty;

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object v3

    sget-object v4, LRB0;->d:LRB0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    goto :goto_3

    :cond_9
    instance-of p1, p1, Lco/bird/android/feature/coreinventory/scan/AlertDisabledError;

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->w1()LRk5;

    move-result-object v3

    sget-object v4, LSB0;->d:LSB0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_a
    :goto_3
    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->p0(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)V

    return-void
.end method

.method public w1()LRk5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->u:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRk5;

    return-object v0
.end method

.method public z1()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->s:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "backPressRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
