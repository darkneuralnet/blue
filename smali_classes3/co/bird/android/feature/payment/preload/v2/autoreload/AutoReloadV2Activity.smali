.class public final Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LYs;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u00089\u0010:J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\u0007H\u0016J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0008\u0010\u0012\u001a\u00020\u0005H\u0002J\u0008\u0010\u0013\u001a\u00020\u0005H\u0002J.\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u00152\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u0016\u0010\u001d\u001a\u00020\u00052\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0017H\u0002R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u00108\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00107\u00a8\u0006;"
    }
    d2 = {
        "Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LYs;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Lio/reactivex/Observable;",
        "",
        "Y2",
        "J0",
        "Lco/bird/android/buava/Optional;",
        "LDs;",
        "E1",
        "O0",
        "LXs;",
        "state",
        "U",
        "X",
        "P",
        "autoReloadToggled",
        "",
        "currency",
        "",
        "Lco/bird/api/response/ReloadOption;",
        "autoReloadOptions",
        "optionIdSelected",
        "Y",
        "disclaimers",
        "Q",
        "LGs;",
        "j",
        "LGs;",
        "R",
        "()LGs;",
        "setConverter",
        "(LGs;)V",
        "converter",
        "LUs;",
        "k",
        "LUs;",
        "S",
        "()LUs;",
        "setPresenter",
        "(LUs;)V",
        "presenter",
        "LU2;",
        "l",
        "LU2;",
        "binding",
        "LEs;",
        "m",
        "LEs;",
        "adapter",
        "n",
        "Z",
        "isLoading",
        "<init>",
        "()V",
        "co.bird.android.feature.payment"
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
        "SMAP\nAutoReloadV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadV2Activity.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n199#2:126\n1855#3,2:127\n*S KotlinDebug\n*F\n+ 1 AutoReloadV2Activity.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity\n*L\n88#1:126\n115#1:127,2\n*E\n"
    }
.end annotation


# instance fields
.field public j:LGs;

.field public k:LUs;

.field public l:LU2;

.field public final m:LEs;

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, LEs;

    invoke-direct {v0}, LEs;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->m:LEs;

    return-void
.end method


# virtual methods
.method public E1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "LDs;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->m:LEs;

    invoke-virtual {v0}, LEs;->w()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public J0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->m:LEs;

    invoke-virtual {v0}, LEs;->J0()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public O0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->l:LU2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, LU2;->g:Landroid/widget/TextView;

    const-string v2, "binding.paymentTerms"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final P()V
    .locals 6

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    sget-object v1, LCs;->d:LCs;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public final Q(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    sget v0, Lnl4;->subject_to_bird_payment_terms:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(L.string.subject_to_bird_payment_terms)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "binding"

    if-eqz v1, :cond_1

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->l:LU2;

    if-nez p1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    iget-object p1, v2, LU2;->g:Landroid/widget/TextView;

    new-instance v1, Landroid/text/style/UnderlineSpan;

    invoke-direct {v1}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-static {v0, v0, v1}, LmS5;->n(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "\n"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->l:LU2;

    if-nez p1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    move-object v2, p1

    :goto_2
    iget-object p1, v2, LU2;->g:Landroid/widget/TextView;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "builder.toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/text/style/UnderlineSpan;

    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-static {v1, v0, v2}, LmS5;->n(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    return-void
.end method

.method public final R()LGs;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->j:LGs;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "converter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final S()LUs;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->k:LUs;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public U(LXs;)V
    .locals 8

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lzs;

    const-string v1, "binding"

    const/4 v2, 0x2

    const-string v3, "binding.loadingViews"

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lzs;

    invoke-virtual {p1}, Lzs;->c()Z

    move-result v0

    invoke-virtual {p1}, Lzs;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lzs;->b()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p1}, Lzs;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, v6, v7, p1}, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->Y(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    iput-boolean v5, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->n:Z

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->l:LU2;

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v4

    :cond_0
    iget-object p1, p1, LU2;->f:Landroidx/constraintlayout/widget/Group;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5, v5, v2, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljg1;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, Ljg1;

    invoke-virtual {p1}, Ljg1;->b()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, LXC;->error(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lrg1;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, Lrg1;

    invoke-virtual {p1}, Lrg1;->b()I

    move-result p1

    invoke-virtual {v0, p1}, LXC;->error(I)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, LGt2;

    if-eqz v0, :cond_5

    check-cast p1, LGt2;

    invoke-virtual {p1}, LGt2;->b()Z

    move-result v0

    iput-boolean v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->n:Z

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->l:LU2;

    if-nez v0, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v4

    :cond_4
    iget-object v0, v0, LU2;->f:Landroidx/constraintlayout/widget/Group;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LGt2;->b()Z

    move-result p1

    invoke-static {v0, p1, v5, v2, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_0

    :cond_5
    instance-of p1, p1, LW41;

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->P()V

    :cond_6
    :goto_0
    return-void
.end method

.method public final X()V
    .locals 3

    sget v0, Lnl4;->subject_to_bird_payment_terms:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(R.string.subject_to_bird_payment_terms)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->l:LU2;

    if-nez v1, :cond_0

    const-string v1, "binding"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    iget-object v1, v1, LU2;->g:Landroid/widget/TextView;

    new-instance v2, Landroid/text/style/UnderlineSpan;

    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-static {v0, v0, v2}, LmS5;->n(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final Y(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/api/response/ReloadOption;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->R()LGs;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, LGs;->a(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object p3, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->m:LEs;

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p3, p2}, LMy;->u(Ljava/util/Collection;)V

    invoke-virtual {p0, p1}, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->Q(Ljava/util/List;)V

    return-void
.end method

.method public Y2()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->m:LEs;

    invoke-virtual {v0}, LEs;->v()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lco/bird/android/core/base/BaseCoreActivity;->D()V

    invoke-static {}, LdO0;->a()Lv04$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    invoke-interface {p1, v0}, Lv04$a;->a(LlG2;)Lv04;

    move-result-object p1

    invoke-interface {p1, p0}, Lv04;->a(Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LU2;->c(Landroid/view/LayoutInflater;)LU2;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->l:LU2;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    iget-object p1, p1, LU2;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "binding.footer"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->l:LU2;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, LU2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->l:LU2;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, p1

    :goto_0
    iget-object p1, v0, LU2;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->m:LEs;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->X()V

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->S()LUs;

    move-result-object p1

    invoke-virtual {p1, p0}, LUs;->y(LYs;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LXs;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2Activity;->U(LXs;)V

    return-void
.end method
