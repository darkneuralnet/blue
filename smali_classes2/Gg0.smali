.class public final LGg0;
.super LxE;
.source "SourceFile"

# interfaces
.implements LDg0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGg0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\u0019\u0008\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0008H\u0016J\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0017"
    }
    d2 = {
        "LGg0;",
        "LxE;",
        "LDg0;",
        "Lco/bird/android/model/CashpayResponse;",
        "body",
        "",
        "Ii",
        "za",
        "Lio/reactivex/k;",
        "M2",
        "",
        "barcodeText",
        "Rl",
        "Lh3;",
        "b",
        "Lh3;",
        "binding",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lh3;)V",
        "c",
        "a",
        "app_birdRelease"
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
        "SMAP\nCashpayUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashpayUi.kt\nco/bird/android/app/feature/payment/CashpayUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,104:1\n180#2:105\n*S KotlinDebug\n*F\n+ 1 CashpayUi.kt\nco/bird/android/app/feature/payment/CashpayUiImpl\n*L\n92#1:105\n*E\n"
    }
.end annotation


# static fields
.field public static final c:LGg0$a;

.field public static final d:I


# instance fields
.field public final b:Lh3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LGg0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LGg0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LGg0;->c:LGg0$a;

    const/16 v0, 0x8

    sput v0, LGg0;->d:I

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lh3;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LGg0;->b:Lh3;

    invoke-static {p1}, Lcom/bumptech/glide/a;->v(Landroidx/fragment/app/FragmentActivity;)LUI4;

    move-result-object p1

    const-string v0, "https://static.bird.co/cashpay_vendor_badge_horizontal.png"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, LUI4;->h(Landroid/net/Uri;)LrI4;

    move-result-object p1

    iget-object p2, p2, Lh3;->g:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    return-void
.end method

.method public static synthetic Pl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGg0;->Tl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Ql(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LGg0;->Sl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final Sl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final Tl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getBinding$p(LGg0;)Lh3;
    .locals 0

    iget-object p0, p0, LGg0;->b:Lh3;

    return-object p0
.end method


# virtual methods
.method public Ii(Lco/bird/android/model/CashpayResponse;)V
    .locals 12

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->d:Landroid/widget/TextView;

    sget v1, Lnl4;->cashpay_add_body_1:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v10, Lxx1;->a:Lxx1;

    invoke-virtual {p1}, Lco/bird/android/model/CashpayResponse;->getMinAmount()J

    move-result-wide v4

    invoke-virtual {p1}, Lco/bird/android/model/CashpayResponse;->getCurrency()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v3, v10

    invoke-static/range {v3 .. v9}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x0

    aput-object v3, v2, v11

    invoke-virtual {p1}, Lco/bird/android/model/CashpayResponse;->getMaxAmount()J

    move-result-wide v4

    invoke-virtual {p1}, Lco/bird/android/model/CashpayResponse;->getCurrency()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v6

    move-object v3, v10

    invoke-static/range {v3 .. v9}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lco/bird/android/model/CashpayResponse;->getBarcode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LGg0;->Rl(Ljava/lang/String;)V

    return-void
.end method

.method public M2()Lio/reactivex/k;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->h:Landroid/widget/Button;

    const-string v1, "binding.findRetailers"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lio/reactivex/b;->e:Lio/reactivex/b;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object v0

    const-string v1, "binding.findRetailers.cl\u2026ackpressureStrategy.DROP)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final Rl(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->b:Landroid/widget/ImageView;

    const-string v1, "binding.barcode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lmf5;->c(Landroid/view/View;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LGg0$b;

    invoke-direct {v1, p1, p0}, LGg0$b;-><init>(Ljava/lang/String;LGg0;)V

    new-instance v2, LEg0;

    invoke-direct {v2, v1}, LEg0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun loadBarcode(\u2026 View.VISIBLE\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v2, "UNBOUND"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LGg0$c;

    invoke-direct {v1, p0, p1}, LGg0$c;-><init>(LGg0;Ljava/lang/String;)V

    new-instance p1, LFg0;

    invoke-direct {p1, v1}, LFg0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, p1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public za()V
    .locals 4

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->l:Landroid/widget/TextView;

    sget v1, Lnl4;->error_generic_body:I

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v1, v3}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LGg0;->b:Lh3;

    iget-object v0, v0, Lh3;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
