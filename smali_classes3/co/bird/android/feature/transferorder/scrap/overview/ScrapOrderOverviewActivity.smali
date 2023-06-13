.class public final Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LEo5;
.implements LTx6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008X\u0010YJ\u0012\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0006H\u0014J\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0014J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u000e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0012H\u0016J\u000e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u000e\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0012H\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010 \u001a\u0004\u0008&\u0010\'R\u001b\u0010-\u001a\u00020)8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010 \u001a\u0004\u0008+\u0010,R \u00104\u001a\u0008\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\"\u0010S\u001a\u0010\u0012\u000c\u0012\n Q*\u0004\u0018\u00010\u00060\u00060.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u00101R\"\u0010U\u001a\u0010\u0012\u000c\u0012\n Q*\u0004\u0018\u00010\u00060\u00060.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u00101R\"\u0010W\u001a\u0010\u0012\u000c\u0012\n Q*\u0004\u0018\u00010\u00060\u00060.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u00101\u00a8\u0006Z"
    }
    d2 = {
        "Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LEo5;",
        "LTx6;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "LFo5;",
        "state",
        "R",
        "Lio/reactivex/Observable;",
        "W7",
        "",
        "q6",
        "c8",
        "P4",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "j",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "getActivity",
        "()Landroidx/appcompat/app/AppCompatActivity;",
        "activity",
        "Lsx4;",
        "k",
        "Lkotlin/Lazy;",
        "w1",
        "()Lsx4;",
        "rendererDelegate",
        "Lco/bird/android/widget/OperatorInfoCard;",
        "l",
        "p1",
        "()Lco/bird/android/widget/OperatorInfoCard;",
        "operatorInfoCard",
        "Lco/bird/android/widget/BlockingEnterLocationView;",
        "m",
        "d7",
        "()Lco/bird/android/widget/BlockingEnterLocationView;",
        "blockingEnterLocationView",
        "Lma4;",
        "Lco/bird/android/model/DialogResponse;",
        "n",
        "Lma4;",
        "a7",
        "()Lma4;",
        "warehouseVerificationRelay",
        "LBy6;",
        "o",
        "LBy6;",
        "Q",
        "()LBy6;",
        "setWarehouseChecker",
        "(LBy6;)V",
        "warehouseChecker",
        "LAo5;",
        "p",
        "LAo5;",
        "P",
        "()LAo5;",
        "setPresenter",
        "(LAo5;)V",
        "presenter",
        "LV5;",
        "q",
        "LV5;",
        "binding",
        "Ljo5;",
        "r",
        "Ljo5;",
        "converter",
        "Lio5;",
        "s",
        "Lio5;",
        "adapter",
        "kotlin.jvm.PlatformType",
        "t",
        "warehouseChecksRelay",
        "u",
        "processContainerOrderSuccessRelay",
        "v",
        "refreshScrapVehiclesRelay",
        "<init>",
        "()V",
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
        "SMAP\nScrapOrderOverviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewActivity.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,103:1\n1#2:104\n199#3:105\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewActivity.kt\nco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity\n*L\n87#1:105\n*E\n"
    }
.end annotation


# instance fields
.field public final j:Landroidx/appcompat/app/AppCompatActivity;

.field public final k:Lkotlin/Lazy;

.field public final l:Lkotlin/Lazy;

.field public final m:Lkotlin/Lazy;

.field public final n:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation
.end field

.field public o:LBy6;

.field public p:LAo5;

.field public q:LV5;

.field public final r:Ljo5;

.field public final s:Lio5;

.field public final t:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
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


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->j:Landroidx/appcompat/app/AppCompatActivity;

    new-instance v0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity$c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity$c;-><init>(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->k:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity$b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity$b;-><init>(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->l:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity$a;-><init>(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->m:Lkotlin/Lazy;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->n:Lma4;

    new-instance v0, Ljo5;

    invoke-direct {v0}, Ljo5;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->r:Ljo5;

    new-instance v0, Lio5;

    invoke-direct {v0}, Lio5;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->s:Lio5;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->t:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->u:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->v:Lma4;

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;)LV5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->q:LV5;

    return-object p0
.end method


# virtual methods
.method public D0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LTx6$a;->a(LTx6;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final P()LAo5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->p:LAo5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public P4()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->v:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "refreshScrapVehiclesRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final Q()LBy6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->o:LBy6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "warehouseChecker"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public R(LFo5;)V
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYe6;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->r:Ljo5;

    invoke-interface {p1}, LFo5;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, LFo5;->c()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljo5;->a(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->s:Lio5;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LQ64;

    if-eqz v0, :cond_1

    invoke-interface {p1}, LFo5;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    new-instance v1, Lco/bird/android/core/base/viewmodel/ScrapRemovalComplete;

    invoke-direct {v1, p1}, Lco/bird/android/core/base/viewmodel/ScrapRemovalComplete;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1, v2}, LH31$a;->showBottomSheetAlert$default(LH31;LNy;Ljava/lang/Integer;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lbg1;

    if-eqz v0, :cond_2

    invoke-interface {p1}, LFo5;->getError()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-static {v0, p1}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public W7()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->t:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "warehouseChecksRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public a7()Lma4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lma4<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->n:Lma4;

    return-object v0
.end method

.method public c8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->u:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "processContainerOrderSuccessRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d7()Lco/bird/android/widget/BlockingEnterLocationView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->m:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/BlockingEnterLocationView;

    return-object v0
.end method

.method public e8(LUx6;)V
    .locals 0

    invoke-static {p0, p1}, LTx6$a;->c(LTx6;LUx6;)V

    return-void
.end method

.method public getActivity()Landroidx/appcompat/app/AppCompatActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->j:Landroidx/appcompat/app/AppCompatActivity;

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0x274b

    if-ne p1, p3, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->u:Lma4;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LV5;->c(Landroid/view/LayoutInflater;)LV5;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->q:LV5;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, LV5;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, LeQ0;->a()Lqn5$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v2

    invoke-interface {p1, v2}, Lqn5$a;->a(LlG2;)Lqn5;

    move-result-object p1

    invoke-interface {p1, p0}, Lqn5;->a(Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;)V

    iget-object p1, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->q:LV5;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    iget-object p1, p1, LV5;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->q:LV5;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    iget-object p1, p1, LV5;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/g;

    invoke-direct {v2}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object p1, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->q:LV5;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v0, p1

    :goto_0
    iget-object p1, v0, LV5;->d:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->s:Lio5;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->P()LAo5;

    move-result-object p1

    invoke-virtual {p1, p0}, LAo5;->A(LEo5;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->Q()LBy6;

    move-result-object p1

    invoke-virtual {p1, p0}, LBy6;->p(LTx6;)V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->t:Lma4;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->v:Lma4;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public p1()Lco/bird/android/widget/OperatorInfoCard;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->l:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/OperatorInfoCard;

    return-object v0
.end method

.method public q6()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->s:Lio5;

    invoke-virtual {v0}, Lio5;->q6()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LFo5;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->R(LFo5;)V

    return-void
.end method

.method public v1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LTx6$a;->b(LTx6;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public w1()Lsx4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scrap/overview/ScrapOrderOverviewActivity;->k:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsx4;

    return-object v0
.end method

.method public z5()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LTx6$a;->d(LTx6;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
