.class public final LRx0;
.super LxA;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002J\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007J(\u0010\u000f\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000cJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "LRx0;",
        "LxA;",
        "Lio/reactivex/Observable;",
        "",
        "f",
        "Pl",
        "dismiss",
        "Lco/bird/android/model/BirdPayment;",
        "defaultPayment",
        "Rl",
        "",
        "Lkotlin/Pair;",
        "",
        "lineItems",
        "totalAmountText",
        "Ql",
        "",
        "loading",
        "Sl",
        "LLZ;",
        "c",
        "LLZ;",
        "binding",
        "Landroid/content/DialogInterface;",
        "d",
        "Landroid/content/DialogInterface;",
        "dialog",
        "Lco/bird/android/core/base/BaseCoreActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/base/BaseCoreActivity;LLZ;Landroid/content/DialogInterface;)V",
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
        "SMAP\nConfirmPurchaseDialogUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPurchaseDialogUi.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseDialogUi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1855#2,2:66\n*S KotlinDebug\n*F\n+ 1 ConfirmPurchaseDialogUi.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseDialogUi\n*L\n51#1:66,2\n*E\n"
    }
.end annotation


# instance fields
.field public final c:LLZ;

.field public final d:Landroid/content/DialogInterface;


# direct methods
.method public constructor <init>(Lco/bird/android/core/base/BaseCoreActivity;LLZ;Landroid/content/DialogInterface;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dialog"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxA;-><init>(Lco/bird/android/core/base/BaseCoreActivity;)V

    iput-object p2, p0, LRx0;->c:LLZ;

    iput-object p3, p0, LRx0;->d:Landroid/content/DialogInterface;

    return-void
.end method


# virtual methods
.method public final Pl()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LRx0;->c:LLZ;

    iget-object v0, v0, LLZ;->e:Lco/bird/android/widget/PaymentButton;

    const-string v1, "binding.defaultPayment"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final Ql(Ljava/util/List;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "lineItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "totalAmountText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LRx0;->c:LLZ;

    iget-object v0, v0, LLZ;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, LRx0;->c:LLZ;

    iget-object p2, p2, LLZ;->h:Landroid/widget/LinearLayout;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/Pair;

    invoke-virtual {p0}, LxA;->getActivity()Lco/bird/android/core/base/BaseCoreActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Ljd2;->c(Landroid/view/LayoutInflater;)Ljd2;

    move-result-object v0

    const-string v1, "inflate(activity.layoutInflater)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Ljd2;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Ljd2;->b:Landroid/widget/TextView;

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, LRx0;->c:LLZ;

    iget-object p2, p2, LLZ;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Ljd2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final Rl(Lco/bird/android/model/BirdPayment;)V
    .locals 4

    const-string v0, "defaultPayment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isAdyen()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_2

    iget-object v0, p0, LRx0;->c:LLZ;

    iget-object v0, v0, LLZ;->e:Lco/bird/android/widget/PaymentButton;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v2

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getBrand()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    move-object v3, v1

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getLastCardNumbers()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    invoke-virtual {v0, v2, v3, v1}, Lco/bird/android/widget/PaymentButton;->setAdyenCard(ZLjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isStripeCard()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LRx0;->c:LLZ;

    iget-object v0, v0, LLZ;->e:Lco/bird/android/widget/PaymentButton;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getStripeCard()Lcom/stripe/android/model/Card;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lco/bird/android/widget/PaymentButton;->setStripeCard(Lcom/stripe/android/model/Card;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isStripePaymentMethod()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LRx0;->c:LLZ;

    iget-object v0, v0, LLZ;->e:Lco/bird/android/widget/PaymentButton;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getStripePaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lco/bird/android/widget/PaymentButton;->setStripePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isPaypal()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, LRx0;->c:LLZ;

    iget-object v0, v0, LLZ;->e:Lco/bird/android/widget/PaymentButton;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getPaypalEmail()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    move-object v1, p1

    :goto_1
    invoke-virtual {v0, v1}, Lco/bird/android/widget/PaymentButton;->setPaypal(Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final Sl(Z)V
    .locals 4

    iget-object v0, p0, LRx0;->c:LLZ;

    iget-object v0, v0, LLZ;->k:Landroidx/constraintlayout/widget/Group;

    const-string v1, "binding.loadingViews"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public final dismiss()V
    .locals 1

    iget-object v0, p0, LRx0;->d:Landroid/content/DialogInterface;

    invoke-interface {v0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public final f()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LRx0;->c:LLZ;

    iget-object v0, v0, LLZ;->l:Landroid/widget/Button;

    const-string v1, "binding.payButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
