.class public final Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;
.super Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;
.source "SourceFile"

# interfaces
.implements Lf12;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity<",
        "Lg12;",
        ">;",
        "Lf12;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0018\u0000 62\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00017B\u0007\u00a2\u0006\u0004\u00084\u00105J\u0012\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0016J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\nH\u0016J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u000f0\nH\u0016J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f0\nH\u0016J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nH\u0016R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\"\u0010-\u001a\u0010\u0012\u000c\u0012\n **\u0004\u0018\u00010\u000b0\u000b0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\"\u0010/\u001a\u0010\u0012\u000c\u0012\n **\u0004\u0018\u00010\r0\r0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010,R:\u00101\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r **\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f0\u000f0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010,R:\u00103\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012 **\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f0\u000f0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010,\u00a8\u00068"
    }
    d2 = {
        "Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;",
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;",
        "Lg12;",
        "Lf12;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "state",
        "k0",
        "Lio/reactivex/Observable;",
        "",
        "s0",
        "",
        "a0",
        "Lkotlin/Pair;",
        "j6",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "N2",
        "k6",
        "La12;",
        "l",
        "La12;",
        "j0",
        "()La12;",
        "setPresenter",
        "(La12;)V",
        "presenter",
        "Lw02;",
        "m",
        "Lw02;",
        "i0",
        "()Lw02;",
        "setConverter",
        "(Lw02;)V",
        "converter",
        "Lu02;",
        "n",
        "Lu02;",
        "adapter",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "o",
        "Lma4;",
        "skuOrderIdSubject",
        "p",
        "serviceCenterScanSubject",
        "q",
        "vehicleAcceptanceSubject",
        "r",
        "forceScanSubject",
        "<init>",
        "()V",
        "s",
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
        "SMAP\nInboundScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,185:1\n1#2:186\n1747#3,3:187\n218#4:190\n218#4:191\n199#4:192\n199#4:193\n199#4:194\n*S KotlinDebug\n*F\n+ 1 InboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity\n*L\n87#1:187,3\n123#1:190\n137#1:191\n143#1:192\n158#1:193\n172#1:194\n*E\n"
    }
.end annotation


# static fields
.field public static final s:Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$a;


# instance fields
.field public l:La12;

.field public m:Lw02;

.field public final n:Lu02;

.field public final o:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final r:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->s:Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;-><init>()V

    new-instance v0, Lu02;

    invoke-direct {v0}, Lu02;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->n:Lu02;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->o:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Boolean>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->p:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Pair<String, Boolean>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->q:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Pair<WireSkuScanItem, WireSkuOrder>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->r:Lma4;

    return-void
.end method

.method public static synthetic Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->p0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
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

.method public static final n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final p0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public N2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->r:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "forceScanSubject.hide()"

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

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->p:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "serviceCenterScanSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final i0()Lw02;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->m:Lw02;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "converter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j0()La12;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->l:La12;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public j6()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->q:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "vehicleAcceptanceSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public k0(Lg12;)V
    .locals 13

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->render(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {p1}, Lg12;->q()I

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

    invoke-virtual {p1}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->i0()Lw02;

    move-result-object v0

    invoke-virtual {p1}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v1

    invoke-virtual {p1}, Lg12;->u()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lw02;->a(Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->n:Lu02;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, LMy;->u(Ljava/util/Collection;)V

    :cond_1
    invoke-virtual {p1}, Lg12;->t()Lam5;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v4

    const-wide/16 v6, 0xfa

    invoke-virtual {v4, v6, v7}, LXC;->vibrate(J)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/fragment/app/FragmentManager;->z0()Ljava/util/List;

    move-result-object v4

    const-string v6, "supportFragmentManager.fragments"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    instance-of v6, v4, Ljava/util/Collection;

    if-eqz v6, :cond_3

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_2
    move v4, v3

    goto :goto_1

    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/Fragment;

    instance-of v6, v6, Lb02;

    if-eqz v6, :cond_4

    move v4, v2

    :goto_1
    if-nez v4, :cond_b

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v4

    invoke-virtual {v4}, LXC;->getCurrentBirdDialog()LNy;

    move-result-object v4

    if-eqz v4, :cond_5

    goto/16 :goto_2

    :cond_5
    sget-object v6, Lb02;->g:Lb02$a;

    invoke-virtual {v0}, Lam5;->c()Lco/bird/android/model/wire/WireSkuScanItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireSkuScanItem;->getBird()Lco/bird/android/model/wire/WireSkuVehicle;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireSkuVehicle;->getId()Ljava/lang/String;

    move-result-object v5

    :cond_6
    move-object v7, v5

    invoke-virtual {p1}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireSkuOrder;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v4

    if-nez v4, :cond_8

    :cond_7
    sget-object v4, Lco/bird/android/model/constant/TransferOrderDemandSource;->UNKNOWN:Lco/bird/android/model/constant/TransferOrderDemandSource;

    :cond_8
    move-object v9, v4

    invoke-virtual {v0}, Lam5;->d()Lco/bird/api/response/TransferOrderVehicleViewResponse;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/api/response/TransferOrderVehicleViewResponse;->getAcceptTitle()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    sget v4, Lnl4;->generic_accept_question:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "getString(L.string.generic_accept_question)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    move-object v10, v4

    invoke-virtual {v0}, Lam5;->d()Lco/bird/api/response/TransferOrderVehicleViewResponse;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/api/response/TransferOrderVehicleViewResponse;->getAcceptButtonTitle()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_a

    sget v4, Lnl4;->generic_accept_uppercase:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "getString(L.string.generic_accept_uppercase)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_a
    move-object v11, v4

    invoke-virtual {v0}, Lam5;->d()Lco/bird/api/response/TransferOrderVehicleViewResponse;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/api/response/TransferOrderVehicleViewResponse;->getActions()Ljava/util/List;

    move-result-object v12

    invoke-virtual/range {v6 .. v12}, Lb02$a;->a(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lb02;

    move-result-object v4

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v5

    const-string v6, "ReceiveAcceptanceBottomSheet"

    invoke-virtual {v4, v5, v6}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-virtual {v4}, Lb02;->a5()Lio/reactivex/F;

    move-result-object v4

    new-instance v5, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;

    invoke-direct {v5, v0, p1, p0}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;-><init>(Lam5;Lg12;Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;)V

    new-instance v0, Ll02;

    invoke-direct {v0, v5}, Ll02;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v0}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object v0

    const-string v4, "override fun render(stat\u2026CameraPreview()\n    }\n  }"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v4, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$c;

    iget-object v5, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->q:Lma4;

    invoke-direct {v4, v5}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$c;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lm02;

    invoke-direct {v5, v4}, Lm02;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v5}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    goto :goto_3

    :cond_b
    :goto_2
    return-void

    :cond_c
    :goto_3
    invoke-virtual {p1}, Lg12;->p()LSw1;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {p1}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v4

    if-eqz v4, :cond_10

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v4

    invoke-virtual {v4}, LXC;->getCurrentBirdDialog()LNy;

    move-result-object v4

    if-eqz v4, :cond_d

    return-void

    :cond_d
    invoke-virtual {p1}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTransferOrder;->getDestinationWarehouse()Lco/bird/android/model/wire/WireWarehouse;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireWarehouse;->getName()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_f

    :cond_e
    const-string v4, ""

    :cond_f
    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v5

    new-instance v6, LDt5;

    invoke-direct {v6, v4}, LDt5;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v4

    sget-object v5, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$d;->g:Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$d;

    new-instance v6, Ln02;

    invoke-direct {v6, v5}, Ln02;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v6}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object v4

    new-instance v5, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$e;

    invoke-direct {v5, v0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$e;-><init>(LSw1;Lg12;)V

    new-instance v0, Lo02;

    invoke-direct {v0, v5}, Lo02;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v0}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object v0

    const-string v4, "state: InboundScanState)\u2026nItem to state.skuOrder }"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v4, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$f;

    iget-object v5, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->r:Lma4;

    invoke-direct {v4, v5}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$f;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lp02;

    invoke-direct {v5, v4}, Lp02;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v5}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_10
    invoke-virtual {p1}, Lg12;->r()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v4

    sget-object v5, Lg96;->d:Lg96;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_11
    invoke-virtual {p1}, Lg12;->getError()Ljava/lang/Throwable;

    move-result-object v0

    const-wide/16 v4, 0x3e8

    if-eqz v0, :cond_12

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v6

    invoke-virtual {v6, v4, v5}, LXC;->vibrate(J)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v6

    invoke-static {v6, v0}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {v0}, LRk5;->p3()V

    :cond_12
    invoke-virtual {p1}, Lg12;->o()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v6

    invoke-virtual {v6, v4, v5}, LXC;->vibrate(J)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v7

    new-instance v8, Li86;

    invoke-direct {v8, v0}, Li86;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v6

    invoke-virtual {v0, v6}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {v0}, LRk5;->p3()V

    :cond_13
    invoke-virtual {p1}, Lg12;->s()Lck5;

    move-result-object p1

    if-eqz p1, :cond_15

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, LXC;->vibrate(J)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v6

    new-instance v7, La96;

    invoke-virtual {p1}, Lck5;->b()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v0

    sget-object v4, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_DROP_OFF:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne v0, v4, :cond_14

    goto :goto_4

    :cond_14
    move v2, v3

    :goto_4
    invoke-virtual {p1}, Lck5;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v7, v2, p1}, La96;-><init>(ZLjava/lang/String;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object p1

    invoke-virtual {p1}, LRk5;->p3()V

    :cond_15
    return-void
.end method

.method public k6()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->n:Lu02;

    invoke-virtual {v0}, Lu02;->v()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, LSP0;->a()LUj5$a;

    move-result-object p1

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v0

    invoke-interface {p1, v0}, LUj5$a;->a(LlG2;)LUj5;

    move-result-object p1

    invoke-interface {p1, p0}, LUj5;->a(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LRk5;->gm(Z)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object p1

    const/16 v0, 0x80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, LRk5;->qm(I)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LRk5;->sm(Z)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p1

    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p1

    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->n:Lu02;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p1

    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/g;

    invoke-direct {v1}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->j0()La12;

    move-result-object p1

    invoke-virtual {p1, p0}, La12;->Q(Lf12;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "service_center_flow"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->p:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "sku_order_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->o:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg12;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->k0(Lg12;)V

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

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->o:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "skuOrderIdSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
