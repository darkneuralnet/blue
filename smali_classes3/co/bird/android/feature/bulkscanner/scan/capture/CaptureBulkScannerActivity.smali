.class public final Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;
.super Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;
.source "SourceFile"

# interfaces
.implements LXe0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity<",
        "LYe0;",
        ">;",
        "LXe0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u00086\u00107J\u0012\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0016J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010!\u001a\u0004\u0008\'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010!\u001a\u0004\u0008,\u0010-R\"\u00103\u001a\u0010\u0012\u000c\u0012\n 0*\u0004\u0018\u00010\u00060\u00060/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\"\u00105\u001a\u0010\u0012\u000c\u0012\n 0*\u0004\u0018\u00010\u00060\u00060/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00102\u00a8\u00068"
    }
    d2 = {
        "Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;",
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;",
        "LYe0;",
        "LXe0;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Lio/reactivex/Observable;",
        "U2",
        "M8",
        "Lco/bird/android/model/wire/WireCaptureValidation;",
        "H1",
        "state",
        "k0",
        "LWe0;",
        "l",
        "LWe0;",
        "i0",
        "()LWe0;",
        "setPresenter",
        "(LWe0;)V",
        "presenter",
        "LHe0;",
        "m",
        "LHe0;",
        "converter",
        "LFe0;",
        "n",
        "LFe0;",
        "adapter",
        "LmX5;",
        "o",
        "Lkotlin/Lazy;",
        "j0",
        "()LmX5;",
        "swipeHelper",
        "Landroidx/recyclerview/widget/l;",
        "p",
        "f0",
        "()Landroidx/recyclerview/widget/l;",
        "itemTouchHelper",
        "LYP3;",
        "q",
        "h0",
        "()LYP3;",
        "peekHelper",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "r",
        "Lma4;",
        "captureClicks",
        "s",
        "captureConfirms",
        "<init>",
        "()V",
        "bulk-scanner_release"
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
        "SMAP\nCaptureBulkScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,124:1\n1#2:125\n218#3:126\n237#3:127\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity\n*L\n98#1:126\n106#1:127\n*E\n"
    }
.end annotation


# instance fields
.field public l:LWe0;

.field public final m:LHe0;

.field public final n:LFe0;

.field public final o:Lkotlin/Lazy;

.field public final p:Lkotlin/Lazy;

.field public final q:Lkotlin/Lazy;

.field public final r:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
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


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;-><init>()V

    new-instance v0, LHe0;

    invoke-direct {v0}, LHe0;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->m:LHe0;

    new-instance v0, LFe0;

    invoke-direct {v0}, LFe0;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->n:LFe0;

    new-instance v0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$h;

    invoke-direct {v0, p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$h;-><init>(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->o:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$a;-><init>(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->p:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$e;

    invoke-direct {v0, p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$e;-><init>(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->q:Lkotlin/Lazy;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->r:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->s:Lma4;

    return-void
.end method

.method public static synthetic Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getBinding(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)Lf00;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCaptureClicks$p(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->r:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getCaptureConfirms$p(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->s:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getSwipeHelper(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)LmX5;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->j0()LmX5;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG6;

    return-object p0
.end method


# virtual methods
.method public H1()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireCaptureValidation;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->j0()LmX5;

    move-result-object v0

    invoke-virtual {v0}, LmX5;->b()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$i;

    iget-object v2, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->n:LFe0;

    invoke-direct {v1, v2}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$i;-><init>(Ljava/lang/Object;)V

    new-instance v2, LDe0;

    invoke-direct {v2, v1}, LDe0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "swipeHelper.itemSwiped()\u2026(adapter::getAdapterItem)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$j;->g:Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$j;

    invoke-static {v0, v1}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public M8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->s:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "captureConfirms.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public U2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->r:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "captureClicks.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final f0()Landroidx/recyclerview/widget/l;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->p:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/l;

    return-object v0
.end method

.method public final h0()LYP3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->q:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYP3;

    return-object v0
.end method

.method public final i0()LWe0;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->l:LWe0;

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

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->o:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX5;

    return-object v0
.end method

.method public k0(LYe0;)V
    .locals 7

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->render(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v0

    iget-object v0, v0, Lf00;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    const-string v1, "binding.progressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYe0;->q()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->m:LHe0;

    invoke-virtual {p1}, LYe0;->r()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LHe0;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->n:LFe0;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, LFe0;->u(Ljava/util/Collection;)V

    invoke-virtual {p1}, LYe0;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v1

    new-instance v2, Lff0;

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->i0()LWe0;

    move-result-object v0

    invoke-virtual {v0}, Lf1;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYe0;

    invoke-virtual {v0}, LYe0;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v2, v0}, Lff0;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$f;->g:Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$f;

    new-instance v2, LBe0;

    invoke-direct {v2, v1}, LBe0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object v0

    const-string v1, "rendererDelegate.birdDia\u2026se == DialogResponse.OK }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v1, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$g;

    invoke-direct {v1, p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$g;-><init>(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)V

    new-instance v2, LCe0;

    invoke-direct {v2, v1}, LCe0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_1
    invoke-virtual {p1}, LYe0;->p()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v2, Lwl5;

    invoke-direct {v2, v0}, Lwl5;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_2
    invoke-virtual {p1}, LYe0;->getError()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-static {v0, p1}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lco/bird/android/feature/bulkscanner/scan/capture/b;->a()Lco/bird/android/feature/bulkscanner/scan/capture/a$a;

    move-result-object p1

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v0

    invoke-interface {p1, v0}, Lco/bird/android/feature/bulkscanner/scan/capture/a$a;->a(LlG2;)Lco/bird/android/feature/bulkscanner/scan/capture/a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/bulkscanner/scan/capture/a;->a(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LRk5;->gm(Z)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object p1

    invoke-virtual {p1, v0}, LRk5;->sm(Z)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p1

    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->n:LFe0;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p1

    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p1

    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->f0()Landroidx/recyclerview/widget/l;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v0

    iget-object v0, v0, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->h0()LYP3;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$b;-><init>(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)V

    invoke-virtual {p1, v0}, LYP3;->g(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->n:LFe0;

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->h0()LYP3;

    move-result-object v0

    invoke-virtual {p1, v0}, LFe0;->A(LYP3;)V

    iget-object p1, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->n:LFe0;

    new-instance v0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$c;-><init>(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)V

    invoke-virtual {p1, v0}, LFe0;->y(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->n:LFe0;

    new-instance v0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$d;

    invoke-direct {v0, p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$d;-><init>(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)V

    invoke-virtual {p1, v0}, LFe0;->B(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->i0()LWe0;

    move-result-object p1

    invoke-virtual {p1, p0}, LWe0;->F(LXe0;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LYe0;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->k0(LYe0;)V

    return-void
.end method
