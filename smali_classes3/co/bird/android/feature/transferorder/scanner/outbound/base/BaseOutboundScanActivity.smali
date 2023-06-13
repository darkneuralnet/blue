.class public abstract Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;
.super Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;
.source "SourceFile"

# interfaces
.implements LKz3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "LFz3;",
        ">",
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity<",
        "LLz3;",
        ">;",
        "LKz3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008&\u0018\u0000 `*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001aB\u0007\u00a2\u0006\u0004\u0008^\u0010_J\u0012\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\u0008\u0010\u0010\u001a\u00020\u0008H\u0016J\u0010\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00082$\u0010\u0018\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00150\u00140\u0013H\u0016J\u000e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001aH\u0016J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u001c0\u001aH\u0016J\u000e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001aH\u0016J\u000e\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001aH\u0016J\u000e\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001aH\u0016J\u000e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u001aH\u0016J\u000e\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001aH\u0016J\u000e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001aH\u0016J\u001a\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00170\u00140\u001aH\u0016J\u0008\u0010&\u001a\u00020\u0008H&R\"\u0010.\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R\u001a\u0010<\u001a\u0002078\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008D\u0010?\u001a\u0004\u0008E\u0010FR\"\u0010L\u001a\u0010\u0012\u000c\u0012\n I*\u0004\u0018\u00010\u00170\u00170H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\"\u0010N\u001a\u0010\u0012\u000c\u0012\n I*\u0004\u0018\u00010\u000c0\u000c0H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010KR\"\u0010P\u001a\u0010\u0012\u000c\u0012\n I*\u0004\u0018\u00010\u00040\u00040H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010KR\"\u0010R\u001a\u0010\u0012\u000c\u0012\n I*\u0004\u0018\u00010\u00160\u00160H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010KR\"\u0010T\u001a\u0010\u0012\u000c\u0012\n I*\u0004\u0018\u00010\u00080\u00080H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010KR\"\u0010V\u001a\u0010\u0012\u000c\u0012\n I*\u0004\u0018\u00010\u00080\u00080H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010KR6\u0010\u000f\u001a\"\u0012\u001c\u0012\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00150\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u001c\u0010]\u001a\u00028\u00008&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Y\u0010Z\"\u0004\u0008[\u0010\\\u00a8\u0006b"
    }
    d2 = {
        "Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;",
        "LFz3;",
        "T",
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;",
        "LLz3;",
        "LKz3;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Landroid/view/MenuItem;",
        "item",
        "",
        "onOptionsItemSelected",
        "outState",
        "onSaveInstanceState",
        "onBackPressed",
        "state",
        "q0",
        "Lkotlin/Function0;",
        "Lkotlin/Pair;",
        "",
        "LPC5;",
        "",
        "saveInstance",
        "y2",
        "Lio/reactivex/Observable;",
        "I",
        "Lco/bird/android/buava/Optional;",
        "A1",
        "s0",
        "a0",
        "o3",
        "V",
        "z1",
        "W",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "r4",
        "o0",
        "Lbz3;",
        "l",
        "Lbz3;",
        "j0",
        "()Lbz3;",
        "setConverter",
        "(Lbz3;)V",
        "converter",
        "Lwi2;",
        "m",
        "Lwi2;",
        "m0",
        "()Lwi2;",
        "setJsonDeserializer",
        "(Lwi2;)V",
        "jsonDeserializer",
        "LZy3;",
        "n",
        "LZy3;",
        "i0",
        "()LZy3;",
        "adapter",
        "LmX5;",
        "o",
        "Lkotlin/Lazy;",
        "n0",
        "()LmX5;",
        "swipeHelper",
        "Landroidx/recyclerview/widget/l;",
        "p",
        "k0",
        "()Landroidx/recyclerview/widget/l;",
        "itemTouchHelper",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "q",
        "Lma4;",
        "skuOrderIdRelay",
        "r",
        "serviceCenterScanRelay",
        "s",
        "restoreStateRelay",
        "t",
        "undoClicksRelay",
        "u",
        "backPressRelay",
        "v",
        "exitConfirmRelay",
        "w",
        "Lkotlin/jvm/functions/Function0;",
        "getPresenter",
        "()LFz3;",
        "setPresenter",
        "(LFz3;)V",
        "presenter",
        "<init>",
        "()V",
        "x",
        "a",
        "co.bird.android.feature.transfer-order"
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
        "SMAP\nBaseOutboundScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOutboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,252:1\n1#2:253\n199#3:254\n218#3:255\n199#3:256\n*S KotlinDebug\n*F\n+ 1 BaseOutboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity\n*L\n168#1:254\n177#1:255\n183#1:256\n*E\n"
    }
.end annotation


# static fields
.field public static final x:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$a;


# instance fields
.field public l:Lbz3;

.field public m:Lwi2;

.field public final n:LZy3;

.field public final o:Lkotlin/Lazy;

.field public final p:Lkotlin/Lazy;

.field public final q:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "LLz3;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "LPC5;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
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

.field public w:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "LPC5;",
            ">;+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->x:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;-><init>()V

    new-instance v0, LZy3;

    invoke-direct {v0}, LZy3;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->n:LZy3;

    new-instance v0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$g;

    invoke-direct {v0, p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$g;-><init>(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->o:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$d;

    invoke-direct {v0, p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$d;-><init>(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->p:Lkotlin/Lazy;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->q:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Boolean>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->r:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<OutboundScanState>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->s:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<SkuScanItem>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->t:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->u:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->v:Lma4;

    return-void
.end method

.method public static synthetic Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBinding(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)Lf00;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getExitConfirmRelay$p(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->v:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getSwipeHelper(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)LmX5;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->n0()LmX5;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUndoClicksRelay$p(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->t:Lma4;

    return-object p0
.end method

.method public static synthetic b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->t0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->p0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final p0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

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

.method public static final w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
            "Lco/bird/android/buava/Optional<",
            "LPC5;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->n0()LmX5;

    move-result-object v0

    invoke-virtual {v0}, LmX5;->b()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$c;

    invoke-direct {v1, p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$c;-><init>(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)V

    new-instance v2, LlC;

    invoke-direct {v2, v1}, LlC;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "T: OutboundScanPresenter\u2026        }\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public I()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->n:LZy3;

    invoke-virtual {v0}, LZy3;->v()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$b;

    invoke-direct {v1, p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$b;-><init>(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)V

    new-instance v2, LkC;

    invoke-direct {v2, v1}, LkC;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun completeCli\u2026.just(Unit)\n      }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public V()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LPC5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->t:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "undoClicksRelay.hide()"

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

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->v:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "exitConfirmRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public a0()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->r:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "serviceCenterScanRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public abstract getPresenter()LFz3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public final i0()LZy3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->n:LZy3;

    return-object v0
.end method

.method public final j0()Lbz3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->l:Lbz3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "converter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k0()Landroidx/recyclerview/widget/l;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->p:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/l;

    return-object v0
.end method

.method public final m0()Lwi2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->m:Lwi2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "jsonDeserializer"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final n0()LmX5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->o:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX5;

    return-object v0
.end method

.method public abstract o0()V
.end method

.method public o3()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LLz3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->s:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "restoreStateRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onBackPressed()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->u:Lma4;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super/range {p0 .. p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->o0()V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, LRk5;->gm(Z)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    const/16 v4, 0x96

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2, v4}, LRk5;->qm(I)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, LRk5;->sm(Z)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v2

    iget-object v2, v2, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v5, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v2

    iget-object v2, v2, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->n:LZy3;

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v2

    iget-object v2, v2, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Landroidx/recyclerview/widget/g;

    invoke-direct {v5}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->k0()Landroidx/recyclerview/widget/l;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v5

    iget-object v5, v5, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->getPresenter()LFz3;

    move-result-object v2

    invoke-virtual {v2, v0}, LFz3;->S(LKz3;)V

    const-class v2, Ljava/util/List;

    if-eqz v1, :cond_0

    const-string v5, "sku_scan_items"

    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->m0()Lwi2;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->m0()Lwi2;

    move-result-object v7

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v8

    new-array v9, v3, [Lkotlin/reflect/KClass;

    const-class v10, LPC5;

    invoke-static {v10}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v10

    aput-object v10, v9, v4

    invoke-virtual {v7, v8, v9}, Lwi2;->a(Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;)Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-virtual {v6, v5, v7}, Lwi2;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-nez v5, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    :cond_1
    move-object v8, v5

    if-eqz v1, :cond_2

    const-string v5, "success_ids"

    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->m0()Lwi2;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->m0()Lwi2;

    move-result-object v6

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-array v3, v3, [Lkotlin/reflect/KClass;

    const-class v7, Ljava/lang/String;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    aput-object v7, v3, v4

    invoke-virtual {v6, v2, v3}, Lwi2;->a(Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;)Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v5, v1, v2}, Lwi2;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_3

    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_3
    move-object v9, v1

    iget-object v1, v0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->s:Lma4;

    new-instance v2, LLz3;

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xff9

    const/16 v20, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v20}, LLz3;-><init>(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, Lma4;->accept(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "service_center_flow"

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, v0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->r:Lma4;

    invoke-virtual {v2, v1}, Lma4;->accept(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "sku_order_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->q:Lma4;

    invoke-virtual {v2, v1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_4
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

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->onBackPressed()V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->w:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->m0()Lwi2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lwi2;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sku_scan_items"

    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->m0()Lwi2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lwi2;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "success_ids"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public q0(LLz3;)V
    .locals 13

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->render(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {p1}, LLz3;->o()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v1, v3, v4, v5}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, LLz3;->r()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LLz3;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->n:LZy3;

    invoke-virtual {v1}, LMy;->getItemCount()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    const-wide/16 v6, 0xfa

    invoke-virtual {v0, v6, v7}, LXC;->vibrate(J)V

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-static {v0, v3, v3, v4, v5}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, LLz3;->u()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->j0()Lbz3;

    move-result-object v0

    invoke-virtual {p1}, LLz3;->u()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v1

    invoke-virtual {p1}, LLz3;->r()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p1}, LLz3;->v()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v0, v1, v6, v7}, Lbz3;->a(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->n:LZy3;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, LMy;->u(Ljava/util/Collection;)V

    :cond_2
    invoke-virtual {p1}, LLz3;->getError()Ljava/lang/Throwable;

    move-result-object v0

    const-wide/16 v6, 0x3e8

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, LXC;->vibrate(J)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v1

    invoke-static {v1, v0}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {v0}, LRk5;->p3()V

    :cond_3
    invoke-virtual {p1}, LLz3;->p()Lbk5;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v8

    invoke-virtual {v8, v6, v7}, LXC;->vibrate(J)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v6

    invoke-static {v6, v3, v3, v4, v5}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v7

    new-instance v8, La96;

    invoke-virtual {v0}, Lbk5;->b()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_PICK_UP:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne v4, v5, :cond_4

    goto :goto_1

    :cond_4
    move v2, v3

    :goto_1
    invoke-virtual {v0}, Lbk5;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v2, v0}, La96;-><init>(ZLjava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {v0}, LRk5;->p3()V

    :cond_5
    invoke-virtual {p1}, LLz3;->s()LhA5;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    new-instance v3, LZ86;

    invoke-virtual {v0}, LhA5;->b()I

    move-result v0

    invoke-direct {v3, v0}, LZ86;-><init>(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    sget-object v2, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$e;->g:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$e;

    new-instance v3, LiC;

    invoke-direct {v3, v2}, LiC;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object v0

    const-string v2, "rendererDelegate.birdDia\u2026se == DialogResponse.OK }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v2, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$f;

    invoke-direct {v2, p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$f;-><init>(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)V

    new-instance v3, LjC;

    invoke-direct {v3, v2}, LjC;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_6
    invoke-virtual {p1}, LLz3;->q()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    sget-object v3, Lg96;->d:Lg96;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_7
    return-void
.end method

.method public r4()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lio/reactivex/Observable;->never()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "never()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LLz3;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->q0(LLz3;)V

    return-void
.end method

.method public s0()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->q:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "skuOrderIdRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public y2(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "LPC5;",
            ">;+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;)V"
        }
    .end annotation

    const-string v0, "saveInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->w:Lkotlin/jvm/functions/Function0;

    return-void
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

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;->u:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "backPressRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
