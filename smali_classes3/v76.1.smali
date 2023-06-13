.class public final Lv76;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt76;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\"\u0010#J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0008\u001a\u00020\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006$"
    }
    d2 = {
        "Lv76;",
        "Lt76;",
        "Lio/reactivex/Observable;",
        "",
        "M0",
        "LZD3;",
        "Lco/bird/android/model/wire/WireMerchantTransaction;",
        "transactions",
        "N0",
        "",
        "title",
        "P0",
        "R0",
        "",
        "show",
        "Q0",
        "O0",
        "L",
        "",
        "id",
        "getString",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "a",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Ll4;",
        "b",
        "Ll4;",
        "binding",
        "LvO4;",
        "Lpr6;",
        "c",
        "LvO4;",
        "adapter",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Ll4;)V",
        "co.bird.android.feature.merchant"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Ll4;

.field public final c:LvO4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvO4<",
            "Lco/bird/android/model/wire/WireMerchantTransaction;",
            "Lpr6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Ll4;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv76;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p2, p0, Lv76;->b:Ll4;

    new-instance v0, LvO4;

    new-instance v1, LFQ2;

    invoke-direct {v1, p1}, LFQ2;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, LvO4;-><init>(LwO4;)V

    iput-object v0, p0, Lv76;->c:LvO4;

    iget-object v1, p2, Ll4;->h:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object v1, p2, Ll4;->h:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, LMf0;

    sget-object v3, LD62;->f:LD62;

    invoke-virtual {v3}, LD62;->b()Landroid/view/animation/Interpolator;

    move-result-object v3

    invoke-direct {v2, v3}, LMf0;-><init>(Landroid/view/animation/Interpolator;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object v1, p2, Ll4;->h:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, LFN5;

    sget v3, LXf4;->card_spacing:I

    invoke-direct {v2, p1, v3}, LFN5;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object p1, p2, Ll4;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method


# virtual methods
.method public L()Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireMerchantTransaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv76;->c:LvO4;

    invoke-virtual {v0}, LvO4;->u()Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/Observable;->throttleFirst(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "adapter.itemClicks().thr\u20260, TimeUnit.MILLISECONDS)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public M0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv76;->b:Ll4;

    iget-object v0, v0, Ll4;->b:Landroid/widget/Button;

    const-string v1, "binding.agreementActionButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public N0(LZD3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZD3<",
            "Lco/bird/android/model/wire/WireMerchantTransaction;",
            ">;)V"
        }
    .end annotation

    const-string v0, "transactions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, v0}, Lv76;->Q0(Z)V

    invoke-virtual {p1}, LZD3;->X()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lc86;

    invoke-direct {v1, p0}, Lc86;-><init>(Lt76;)V

    invoke-virtual {p1, v0, v1}, LZD3;->u(Ljava/util/List;LZD3$b;)V

    iget-object v0, p0, Lv76;->c:LvO4;

    invoke-virtual {v0, p1}, LaE3;->q(LZD3;)V

    return-void
.end method

.method public O0(Z)V
    .locals 4

    iget-object v0, p0, Lv76;->b:Ll4;

    iget-object v0, v0, Ll4;->c:Landroidx/cardview/widget/CardView;

    const-string v1, "binding.agreementContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public P0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv76;->b:Ll4;

    iget-object v0, v0, Ll4;->b:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public Q0(Z)V
    .locals 4

    iget-object v0, p0, Lv76;->b:Ll4;

    iget-object v0, v0, Ll4;->g:Landroid/widget/TextView;

    const-string v1, "binding.emptyMerchantHistory"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public R0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv76;->b:Ll4;

    iget-object v0, v0, Ll4;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv76;->a:Lco/bird/android/core/mvp/BaseActivity;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "activity.getString(id)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
