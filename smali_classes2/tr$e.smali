.class public final Ltr$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltr;->n()Lio/reactivex/c;
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
        "it",
        "",
        "b",
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
        "SMAP\nAutoPayV2PaymentIntentDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2PaymentIntentDelegateImpl.kt\nco/bird/android/app/feature/autopay/AutoPayV2PaymentIntentDelegateImpl$observePaymentStatus$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ltr;


# direct methods
.method public constructor <init>(Ltr;)V
    .locals 0

    iput-object p1, p0, Ltr$e;->g:Ltr;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Ltr;)V
    .locals 0

    invoke-static {p0}, Ltr$e;->c(Ltr;)V

    return-void
.end method

.method public static final c(Ltr;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ltr;->access$getActivity$p(Ltr;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Lco/bird/android/navigator/AutoPayV2Answer;

    invoke-static {p0}, Ltr;->access$getSelectedPlanId$p(Ltr;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lco/bird/android/navigator/AutoPayV2Answer;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, LX52;->a(Lco/bird/android/navigator/ActivityResult;)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-static {p0}, Ltr;->access$getNavigator$p(Ltr;)Le13;

    move-result-object p0

    invoke-interface {p0}, Le13;->close()V

    return-void
.end method


# virtual methods
.method public final b(Lco/bird/android/model/PaymentIntentStatus;)V
    .locals 6

    instance-of v0, p1, Lco/bird/android/model/REQUIRES_AUTHENTICATION;

    if-eqz v0, :cond_0

    iget-object p1, p0, Ltr$e;->g:Ltr;

    invoke-static {p1}, Ltr;->access$getManager$p(Ltr;)LpM3;

    move-result-object p1

    iget-object v0, p0, Ltr$e;->g:Ltr;

    invoke-static {v0}, Ltr;->access$getActivity$p(Ltr;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-interface {p1, v0}, LpM3;->m(Landroidx/appcompat/app/AppCompatActivity;)V

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/REQUIRES_PAYMENT_METHOD;

    if-eqz v0, :cond_1

    iget-object p1, p0, Ltr$e;->g:Ltr;

    invoke-static {p1}, Ltr;->access$getNavigator$p(Ltr;)Le13;

    move-result-object v0

    sget-object p1, LCI4;->b:LCI4;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    sget-object v3, Lco/bird/android/model/PaymentAddSource;->PRELOAD_SCREEN:Lco/bird/android/model/PaymentAddSource;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Le13$a;->goToEnterCard$default(Le13;IZLco/bird/android/model/PaymentAddSource;ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/COMPLETE;

    if-eqz v0, :cond_2

    iget-object p1, p0, Ltr$e;->g:Ltr;

    invoke-static {p1}, Ltr;->access$getActivity$p(Ltr;)Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    new-instance v0, Lco/bird/android/navigator/AutoPayV2Answer;

    iget-object v1, p0, Ltr$e;->g:Ltr;

    invoke-static {v1}, Ltr;->access$getSelectedPlanId$p(Ltr;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lco/bird/android/navigator/AutoPayV2Answer;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, LX52;->a(Lco/bird/android/navigator/ActivityResult;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p1, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    iget-object p1, p0, Ltr$e;->g:Ltr;

    invoke-static {p1}, Ltr;->access$getNavigator$p(Ltr;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lco/bird/android/model/UNEXPECTED;

    if-eqz v0, :cond_5

    check-cast p1, Lco/bird/android/model/UNEXPECTED;

    invoke-virtual {p1}, Lco/bird/android/model/UNEXPECTED;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Ltr$e;->g:Ltr;

    invoke-static {v0}, Ltr;->access$getUi$p(Ltr;)Lqs;

    move-result-object v0

    invoke-interface {v0, p1}, LaM5;->error(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_4

    iget-object p1, p0, Ltr$e;->g:Ltr;

    invoke-static {p1}, Ltr;->access$getUi$p(Ltr;)Lqs;

    move-result-object p1

    sget v0, Lnl4;->payment_error_title:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    :cond_4
    iget-object p1, p0, Ltr$e;->g:Ltr;

    invoke-static {p1}, Ltr;->access$getHandler$p(Ltr;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Ltr$e;->g:Ltr;

    new-instance v1, Lur;

    invoke-direct {v1, v0}, Lur;-><init>(Ltr;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/PaymentIntentStatus;

    invoke-virtual {p0, p1}, Ltr$e;->b(Lco/bird/android/model/PaymentIntentStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
