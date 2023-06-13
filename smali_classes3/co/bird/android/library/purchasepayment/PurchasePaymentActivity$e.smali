.class public final Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/reactivex/Observable<",
        "LcL3;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a&\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/reactivex/Observable;",
        "LcL3;",
        "kotlin.jvm.PlatformType",
        "b",
        "()Lio/reactivex/Observable;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e;->g:Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LcL3;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LcL3;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LcL3;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LcL3;

    return-object p0
.end method


# virtual methods
.method public final b()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LcL3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e;->g:Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;

    invoke-static {v0}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;->access$getBinding$p(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)LV4;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, LV4;->c:Landroid/widget/Button;

    const-string v2, "binding.gPay"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e$a;

    iget-object v2, p0, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e;->g:Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;

    invoke-direct {v1, v2}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e$a;-><init>(Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;)V

    new-instance v2, Lra4;

    invoke-direct {v2, v1}, Lra4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/library/purchasepayment/PurchasePaymentActivity$e;->b()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
