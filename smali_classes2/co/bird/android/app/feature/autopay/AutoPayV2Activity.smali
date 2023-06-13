.class public final Lco/bird/android/app/feature/autopay/AutoPayV2Activity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"

# interfaces
.implements LMN3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008:\u0010;J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0008\u0010\u0007\u001a\u00020\u0005H\u0014J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0008\u0010\u0011\u001a\u00020\u0005H\u0002R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00087\u00108\u00a8\u0006<"
    }
    d2 = {
        "Lco/bird/android/app/feature/autopay/AutoPayV2Activity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "LMN3;",
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
        "Lcom/braintreepayments/api/models/PaymentMethodNonce;",
        "paymentMethodNonce",
        "i",
        "k0",
        "Lms;",
        "B",
        "Lms;",
        "n0",
        "()Lms;",
        "setFactory",
        "(Lms;)V",
        "factory",
        "Ldz1;",
        "C",
        "Ldz1;",
        "o0",
        "()Ldz1;",
        "setFreeRideDelegateFactory",
        "(Ldz1;)V",
        "freeRideDelegateFactory",
        "Lvr;",
        "D",
        "Lvr;",
        "p0",
        "()Lvr;",
        "setPaymentIntentDelegateFactory",
        "(Lvr;)V",
        "paymentIntentDelegateFactory",
        "Lyr;",
        "E",
        "Lyr;",
        "presenter",
        "Lbz1;",
        "F",
        "Lbz1;",
        "freeRideDelegate",
        "Lmr;",
        "G",
        "Lmr;",
        "paymentIntentDelegate",
        "LT2;",
        "H",
        "LT2;",
        "binding",
        "<init>",
        "()V",
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
        "SMAP\nAutoPayV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2Activity.kt\nco/bird/android/app/feature/autopay/AutoPayV2Activity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,86:1\n44#2:87\n180#3:88\n*S KotlinDebug\n*F\n+ 1 AutoPayV2Activity.kt\nco/bird/android/app/feature/autopay/AutoPayV2Activity\n*L\n49#1:87\n79#1:88\n*E\n"
    }
.end annotation


# instance fields
.field public B:Lms;

.field public C:Ldz1;

.field public D:Lvr;

.field public E:Lyr;

.field public F:Lbz1;

.field public G:Lmr;

.field public H:LT2;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public i(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
    .locals 1

    const-string v0, "paymentMethodNonce"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->E:Lyr;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lyr;->a(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    :cond_0
    return-void
.end method

.method public final k0()V
    .locals 5

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->H:LT2;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, LT2;->l:Landroidx/appcompat/widget/Toolbar;

    sget v3, Lrg4;->ic_close:I

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->H:LT2;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget-object v0, v0, LT2;->l:Landroidx/appcompat/widget/Toolbar;

    const-string v3, "binding.toolbar"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lif5;->a(Landroidx/appcompat/widget/Toolbar;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v3

    invoke-static {v3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lco/bird/android/app/feature/autopay/AutoPayV2Activity$a;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/autopay/AutoPayV2Activity$a;-><init>(Lco/bird/android/app/feature/autopay/AutoPayV2Activity;)V

    new-instance v4, Lkr;

    invoke-direct {v4, v3}, Lkr;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->H:LT2;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    iget-object v0, v1, LT2;->l:Landroidx/appcompat/widget/Toolbar;

    sget v1, Lnl4;->autopay_v2_title:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final n0()Lms;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->B:Lms;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "factory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final o0()Ldz1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->C:Ldz1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "freeRideDelegateFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->E:Lyr;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lyr;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 12

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, LH22;->a:LH22;

    invoke-virtual {p1, p0}, LH22;->a0(Lco/bird/android/app/feature/autopay/AutoPayV2Activity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LT2;->c(Landroid/view/LayoutInflater;)LT2;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->H:LT2;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, LT2;->b()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->k0()V

    new-instance v5, Lts;

    iget-object p1, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->H:LT2;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, p1

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getPaymentConfig()Lco/bird/android/model/wire/configs/PaymentConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/PaymentConfig;->getPreloadDefaultOptions()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_2

    sget-object p1, Lco/bird/android/model/constant/AutoPayPaymentType;->Companion:Lco/bird/android/model/constant/AutoPayPaymentType$Companion;

    invoke-virtual {p1}, Lco/bird/android/model/constant/AutoPayPaymentType$Companion;->getDEFAULT_OPTIONS()Ljava/util/List;

    move-result-object p1

    :cond_2
    invoke-direct {v5, p0, v0, p1}, Lts;-><init>(Lco/bird/android/core/mvp/BaseActivity;LT2;Ljava/util/List;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->o0()Ldz1;

    move-result-object p1

    invoke-interface {p1, v5, p0}, Ldz1;->a(LH31;Lco/bird/android/core/mvp/BaseActivity;)Lcz1;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->F:Lbz1;

    invoke-virtual {p0}, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->p0()Lvr;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v0

    invoke-interface {p1, p0, v0, v5}, Lvr;->a(Landroidx/appcompat/app/AppCompatActivity;Le13;Lqs;)Ltr;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->G:Lmr;

    invoke-virtual {p0}, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->n0()Lms;

    move-result-object v2

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v4

    const-string p1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v6

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "ride_config"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v7, p1

    check-cast v7, Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "balance"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v8, p1

    check-cast v8, Lco/bird/android/model/Balance;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "has_default_card"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v9

    iget-object v10, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->F:Lbz1;

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v11, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->G:Lmr;

    move-object v3, p0

    invoke-interface/range {v2 .. v11}, Lms;->a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lqs;Le13;Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/Balance;ZLbz1;Lmr;)Lks;

    move-result-object p1

    invoke-virtual {p1}, Lks;->C0()V

    iput-object p1, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->E:Lyr;

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->E:Lyr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lyr;->onResume()V

    :cond_0
    return-void
.end method

.method public final p0()Lvr;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/AutoPayV2Activity;->D:Lvr;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "paymentIntentDelegateFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
