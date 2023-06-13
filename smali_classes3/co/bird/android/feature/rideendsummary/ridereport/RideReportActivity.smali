.class public final Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LG35;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u00087\u00108J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0011H\u0016J\u000e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0011H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\"\u00102\u001a\u0010\u0012\u000c\u0012\n /*\u0004\u0018\u00010\u00120\u00120.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\"\u00104\u001a\u0010\u0012\u000c\u0012\n /*\u0004\u0018\u00010\u00140\u00140.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00101R\"\u00106\u001a\u0010\u0012\u000c\u0012\n /*\u0004\u0018\u00010\u00050\u00050.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00101\u00a8\u00069"
    }
    d2 = {
        "Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LG35;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Landroid/view/Menu;",
        "menu",
        "",
        "onCreateOptionsMenu",
        "Landroid/view/MenuItem;",
        "item",
        "onOptionsItemSelected",
        "LH35;",
        "state",
        "Q",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/wire/WireRideDetail;",
        "N5",
        "Lco/bird/android/model/wire/WireRideReportItem;",
        "t7",
        "k9",
        "LF35;",
        "j",
        "LF35;",
        "P",
        "()LF35;",
        "setPresenter",
        "(LF35;)V",
        "presenter",
        "LQ5;",
        "k",
        "LQ5;",
        "binding",
        "l",
        "Landroid/view/MenuItem;",
        "moreInfoItem",
        "Lr35;",
        "m",
        "Lr35;",
        "adapter",
        "Ls35;",
        "n",
        "Ls35;",
        "converter",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "o",
        "Lma4;",
        "rideDetailRelay",
        "p",
        "reportItemRelay",
        "q",
        "moreInfoRelay",
        "<init>",
        "()V",
        "ride-end-summary_release"
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
        "SMAP\nRideReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportActivity.kt\nco/bird/android/feature/rideendsummary/ridereport/RideReportActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"
    }
.end annotation


# instance fields
.field public j:LF35;

.field public k:LQ5;

.field public l:Landroid/view/MenuItem;

.field public final m:Lr35;

.field public final n:Ls35;

.field public final o:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/wire/WireRideDetail;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/wire/WireRideReportItem;",
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


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, Lr35;

    invoke-direct {v0}, Lr35;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->m:Lr35;

    new-instance v0, Ls35;

    invoke-direct {v0}, Ls35;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->n:Ls35;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<WireRideDetail>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->o:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<WireRideReportItem>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->p:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->q:Lma4;

    return-void
.end method


# virtual methods
.method public N5()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireRideDetail;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->o:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "rideDetailRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final P()LF35;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->j:LF35;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Q(LH35;)V
    .locals 12

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH35;->d()Lco/bird/android/model/wire/WireRideDetail;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->n:Ls35;

    invoke-virtual {v1, v0}, Ls35;->a(Lco/bird/android/model/wire/WireRideDetail;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->m:Lr35;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, LMy;->u(Ljava/util/Collection;)V

    :cond_0
    iget-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->l:Landroid/view/MenuItem;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, LH35;->d()Lco/bird/android/model/wire/WireRideDetail;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRideDetail;->getReport()Lco/bird/android/model/wire/WireRideReport;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRideReport;->getMoreInfoUrl()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :goto_2
    invoke-virtual {p1}, LH35;->b()LNy;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x7e

    const/4 v11, 0x0

    invoke-static/range {v2 .. v11}, LH31$a;->showBirdDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_4
    invoke-virtual {p1}, LH35;->c()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-static {v0, p1}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    :cond_5
    return-void
.end method

.method public k9()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->q:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "moreInfoRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lco/bird/android/feature/rideendsummary/ridereport/a;->a()Lco/bird/android/feature/rideendsummary/ridereport/b$a;

    move-result-object p1

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v0

    invoke-interface {p1, v0}, Lco/bird/android/feature/rideendsummary/ridereport/b$a;->a(LlG2;)Lco/bird/android/feature/rideendsummary/ridereport/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/rideendsummary/ridereport/b;->a(Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LQ5;->c(Landroid/view/LayoutInflater;)LQ5;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->k:LQ5;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, LQ5;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->k:LQ5;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, LQ5;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->k:LQ5;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    invoke-virtual {p1}, LQ5;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    iget-object v2, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->m:Lr35;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p1, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->k:LQ5;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v0, p1

    :goto_0
    invoke-virtual {v0}, LQ5;->b()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object p1, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->m:Lr35;

    new-instance v0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity$a;

    iget-object v1, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->p:Lma4;

    invoke-direct {v0, v1}, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lr35;->w(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->P()LF35;

    move-result-object p1

    invoke-virtual {p1, p0}, LF35;->x(LG35;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "ride_detail"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireRideDetail;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->o:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, LPk4;->menu_ride_report:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget v0, LSh4;->moreInfo:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->P()LF35;

    move-result-object v1

    invoke-virtual {v1}, Lf1;->k()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LH35;

    invoke-virtual {v1}, LH35;->d()Lco/bird/android/model/wire/WireRideDetail;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRideDetail;->getReport()Lco/bird/android/model/wire/WireRideReport;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRideReport;->getMoreInfoUrl()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, LSh4;->moreInfo:I

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->q:Lma4;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lco/bird/android/core/base/BaseCoreActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LH35;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->Q(LH35;)V

    return-void
.end method

.method public t7()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireRideReportItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/rideendsummary/ridereport/RideReportActivity;->p:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "reportItemRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
