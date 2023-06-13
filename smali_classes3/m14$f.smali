.class public final Lm14$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm14;->v()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/PaymentIntentStatus;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/PaymentIntentStatus;",
        "kotlin.jvm.PlatformType",
        "status",
        "",
        "a",
        "(Lco/bird/android/model/PaymentIntentStatus;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPreloadV2OptionsPaymentIntentDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsPaymentIntentDelegateImpl.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPaymentIntentDelegateImpl$observePaymentStatus$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lm14;


# direct methods
.method public constructor <init>(Lm14;)V
    .locals 0

    iput-object p1, p0, Lm14$f;->g:Lm14;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/PaymentIntentStatus;)V
    .locals 6

    instance-of v0, p1, Lco/bird/android/model/REQUIRES_AUTHENTICATION;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lm14$f;->g:Lm14;

    invoke-static {p1}, Lm14;->access$getActivity$p(Lm14;)Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->S()V

    iget-object p1, p0, Lm14$f;->g:Lm14;

    invoke-static {p1}, Lm14;->access$getManager$p(Lm14;)LpM3;

    move-result-object p1

    iget-object v0, p0, Lm14$f;->g:Lm14;

    invoke-static {v0}, Lm14;->access$getActivity$p(Lm14;)Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    move-result-object v0

    invoke-interface {p1, v0}, LpM3;->m(Landroidx/appcompat/app/AppCompatActivity;)V

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/REQUIRES_PAYMENT_METHOD;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lm14$f;->g:Lm14;

    invoke-static {p1}, Lm14;->access$getActivity$p(Lm14;)Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->S()V

    iget-object p1, p0, Lm14$f;->g:Lm14;

    invoke-static {p1}, Lm14;->access$getManager$p(Lm14;)LpM3;

    move-result-object p1

    invoke-interface {p1}, LpM3;->r()V

    iget-object p1, p0, Lm14$f;->g:Lm14;

    invoke-static {p1}, Lm14;->access$getNavigator$p(Lm14;)Le13;

    move-result-object v0

    const/16 v1, 0x2755

    const/4 v2, 0x0

    sget-object v3, Lco/bird/android/model/PaymentAddSource;->PRELOAD_SCREEN:Lco/bird/android/model/PaymentAddSource;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Le13$a;->goToEnterCard$default(Le13;IZLco/bird/android/model/PaymentAddSource;ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/COMPLETE;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lm14$f;->g:Lm14;

    invoke-static {p1}, Lm14;->access$getActivity$p(Lm14;)Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LJ14;->c(Z)V

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lco/bird/android/model/UNEXPECTED;

    if-eqz v0, :cond_4

    check-cast p1, Lco/bird/android/model/UNEXPECTED;

    invoke-virtual {p1}, Lco/bird/android/model/UNEXPECTED;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lm14$f;->g:Lm14;

    invoke-static {v0}, Lm14;->access$getActivity$p(Lm14;)Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object v0

    new-instance v1, Lwg1;

    invoke-direct {v1, p1}, Lwg1;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_4

    iget-object p1, p0, Lm14$f;->g:Lm14;

    invoke-static {p1}, Lm14;->access$getActivity$p(Lm14;)Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object p1

    new-instance v0, Lqg1;

    sget v1, Lnl4;->payment_error_title:I

    invoke-direct {v0, v1}, Lqg1;-><init>(I)V

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/PaymentIntentStatus;

    invoke-virtual {p0, p1}, Lm14$f;->a(Lco/bird/android/model/PaymentIntentStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
