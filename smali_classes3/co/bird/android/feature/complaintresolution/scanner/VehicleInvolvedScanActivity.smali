.class public final Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;
.super Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;
.source "SourceFile"

# interfaces
.implements LZl6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity<",
        "Lam6;",
        ">;",
        "LZl6;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0016J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nH\u0016R\"\u0010\u0013\u001a\u00020\u000c8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\"\u0010&\u001a\u0010\u0012\u000c\u0012\n #*\u0004\u0018\u00010\u00060\u00060\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006)"
    }
    d2 = {
        "Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;",
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;",
        "Lam6;",
        "LZl6;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "state",
        "d0",
        "Lio/reactivex/Observable;",
        "doneClicks",
        "LWl6;",
        "l",
        "LWl6;",
        "b0",
        "()LWl6;",
        "setPresenter",
        "(LWl6;)V",
        "presenter",
        "LOl6;",
        "m",
        "LOl6;",
        "converter",
        "LNl6;",
        "n",
        "LNl6;",
        "adapter",
        "LYP3;",
        "o",
        "Lkotlin/Lazy;",
        "Z",
        "()LYP3;",
        "peekHelper",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "p",
        "Lma4;",
        "doneRelay",
        "<init>",
        "()V",
        "co.bird.android.feature.complaintresolution"
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
        "SMAP\nVehicleInvolvedScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInvolvedScanActivity.kt\nco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"
    }
.end annotation


# instance fields
.field public l:LWl6;

.field public final m:LOl6;

.field public final n:LNl6;

.field public final o:Lkotlin/Lazy;

.field public final p:Lma4;
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

    new-instance v0, LOl6;

    invoke-direct {v0}, LOl6;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->m:LOl6;

    new-instance v0, LNl6;

    invoke-direct {v0}, LNl6;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->n:LNl6;

    new-instance v0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$c;-><init>(Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->o:Lkotlin/Lazy;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->p:Lma4;

    return-void
.end method

.method public static final synthetic access$getBinding(Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;)Lf00;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDoneRelay$p(Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->p:Lma4;

    return-object p0
.end method


# virtual methods
.method public final Z()LYP3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->o:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYP3;

    return-object v0
.end method

.method public final b0()LWl6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->l:LWl6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public d0(Lam6;)V
    .locals 5

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->render(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->m:LOl6;

    invoke-virtual {p1}, Lam6;->p()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LOl6;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->n:LNl6;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, LMy;->u(Ljava/util/Collection;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v0

    iget-object v0, v0, Lf00;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    const-string v1, "binding.progressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lam6;->o()I

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

    invoke-virtual {p1}, Lam6;->getError()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-static {v0, p1}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public doneClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->p:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "doneRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lco/bird/android/feature/complaintresolution/scanner/a;->a()Lco/bird/android/feature/complaintresolution/scanner/b$a;

    move-result-object p1

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v0

    invoke-interface {p1, v0}, Lco/bird/android/feature/complaintresolution/scanner/b$a;->a(LlG2;)Lco/bird/android/feature/complaintresolution/scanner/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/complaintresolution/scanner/b;->a(Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LRk5;->gm(Z)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LRk5;->sm(Z)V

    iget-object p1, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->n:LNl6;

    invoke-virtual {p0}, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->Z()LYP3;

    move-result-object v0

    invoke-virtual {p1, v0}, LNl6;->x(LYP3;)V

    invoke-virtual {p0}, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->Z()LYP3;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$a;-><init>(Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;)V

    invoke-virtual {p1, v0}, LYP3;->g(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p1

    iget-object p1, p1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->n:LNl6;

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

    iget-object p1, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->n:LNl6;

    new-instance v0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$b;-><init>(Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;)V

    invoke-virtual {p1, v0}, LNl6;->w(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0}, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->b0()LWl6;

    move-result-object p1

    invoke-virtual {p1, p0}, LWl6;->v(LZl6;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lam6;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->d0(Lam6;)V

    return-void
.end method
