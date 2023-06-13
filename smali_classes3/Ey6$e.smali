.class public final LEy6$e;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEy6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0015"
    }
    d2 = {
        "LEy6$e;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lorg/joda/time/DateTime;",
        "updatedAt",
        "i",
        "Llg2;",
        "b",
        "Llg2;",
        "binding",
        "Lio/reactivex/disposables/c;",
        "c",
        "Lio/reactivex/disposables/c;",
        "disposable",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LEy6;Landroid/view/View;)V",
        "warehouse-flight-sheet_release"
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
        "SMAP\nWarehouseFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$VehicleDetailsTitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,183:1\n18#2:184\n9#3,4:185\n41#4:189\n180#5:190\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$VehicleDetailsTitleViewHolder\n*L\n142#1:184\n142#1:185,4\n149#1:189\n149#1:190\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Llg2;

.field public c:Lio/reactivex/disposables/c;

.field public final synthetic d:LEy6;


# direct methods
.method public constructor <init>(LEy6;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LEy6$e;->d:LEy6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Llg2;->a(Landroid/view/View;)Llg2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LEy6$e;->b:Llg2;

    iget-object p2, p2, Llg2;->c:Landroid/widget/ImageView;

    const-string v0, "binding.icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LEy6$e$a;

    invoke-direct {v0, p1, p0}, LEy6$e$a;-><init>(LEy6;LEy6$e;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LEy6$e;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic b(LEy6$e;Lorg/joda/time/DateTime;)V
    .locals 0

    invoke-virtual {p0, p1}, LEy6$e;->i(Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LEy6$e;->d:LEy6;

    invoke-static {v0}, LEy6;->access$getAdapterData(LEy6;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/RefreshWarehouseButton;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/RefreshWarehouseButton;

    if-eqz p1, :cond_3

    iget-object v0, p0, LEy6$e;->d:LEy6;

    iget-object v1, p0, LEy6$e;->b:Llg2;

    iget-object v1, v1, Llg2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/RefreshWarehouseButton;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/RefreshWarehouseButton;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {p0, v1}, LEy6$e;->i(Lorg/joda/time/DateTime;)V

    iget-object v1, p0, LEy6$e;->c:Lio/reactivex/disposables/c;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lio/reactivex/disposables/c;->dispose()V

    :cond_1
    const-wide/16 v1, 0x1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v1, v2, v3}, Lio/reactivex/Observable;->interval(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "interval(1L, TimeUnit.SE\u2026dSchedulers.mainThread())"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LEy6;->access$getBottomSheet$p(LEy6;)Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    const-string v2, "ViewScopeProvider.from(this)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LEy6$e$b;

    invoke-direct {v1, p0, p1}, LEy6$e$b;-><init>(LEy6$e;Lco/bird/android/model/RefreshWarehouseButton;)V

    new-instance p1, LFy6;

    invoke-direct {p1, v1}, LFy6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, p1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    iput-object p1, p0, LEy6$e;->c:Lio/reactivex/disposables/c;

    nop

    :cond_3
    :goto_1
    return-void
.end method

.method public final i(Lorg/joda/time/DateTime;)V
    .locals 6

    iget-object v0, p0, LEy6$e;->b:Llg2;

    iget-object v0, v0, Llg2;->b:Landroid/widget/TextView;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->updated_time_format:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "itemView.context"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-static {p1, v4, v5}, LpT0;->c(Lorg/joda/time/DateTime;Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
