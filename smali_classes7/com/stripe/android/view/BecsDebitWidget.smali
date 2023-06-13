.class public final Lcom/stripe/android/view/BecsDebitWidget;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001:\u0001!B/\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u001e\u001a\u00020\u001f2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0008\u0010 \u001a\u00020\u001fH\u0002R\u0014\u0010\u000b\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/view/BecsDebitWidget;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "companyName",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V",
        "isInputValid",
        "",
        "()Z",
        "params",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getParams",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "validParamsCallback",
        "Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;",
        "getValidParamsCallback",
        "()Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;",
        "setValidParamsCallback",
        "(Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;)V",
        "viewBinding",
        "Lcom/stripe/android/databinding/BecsDebitWidgetBinding;",
        "getViewBinding$payments_core_release",
        "()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;",
        "viewBinding$delegate",
        "Lkotlin/Lazy;",
        "applyAttributes",
        "",
        "verifyCompanyName",
        "ValidParamsCallback",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBecsDebitWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BecsDebitWidget.kt\ncom/stripe/android/view/BecsDebitWidget\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,230:1\n1855#2:231\n1856#2:258\n1855#2:259\n1856#2:286\n58#3,23:232\n93#3,3:255\n58#3,23:260\n93#3,3:283\n1#4:287\n52#5,9:288\n*S KotlinDebug\n*F\n+ 1 BecsDebitWidget.kt\ncom/stripe/android/view/BecsDebitWidget\n*L\n77#1:231\n77#1:258\n151#1:259\n151#1:286\n78#1:232,23\n78#1:255,3\n152#1:260,23\n152#1:283,3\n174#1:288,9\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private validParamsCallback:Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

.field private final viewBinding$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/view/BecsDebitWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/view/BecsDebitWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/view/BecsDebitWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V
    .locals 6
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "companyName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Lcom/stripe/android/view/BecsDebitWidget$viewBinding$2;

    invoke-direct {p3, p1, p0}, Lcom/stripe/android/view/BecsDebitWidget$viewBinding$2;-><init>(Landroid/content/Context;Lcom/stripe/android/view/BecsDebitWidget;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitWidget;->viewBinding$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/stripe/android/view/BecsDebitWidget$validParamsCallback$1;

    invoke-direct {p1}, Lcom/stripe/android/view/BecsDebitWidget$validParamsCallback$1;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitWidget;->validParamsCallback:Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-lt p1, p3, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    const-string p3, "name"

    filled-new-array {p3}, [Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/EditText;->setAutofillHints([Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    const-string p3, "emailAddress"

    filled-new-array {p3}, [Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/EditText;->setAutofillHints([Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x4

    new-array p1, p1, [Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    const/4 v0, 0x0

    aput-object p3, p1, v0

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    const/4 v1, 0x1

    aput-object p3, p1, v1

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    const/4 v2, 0x2

    aput-object p3, p1, v2

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    const/4 v3, 0x3

    aput-object p3, p1, v3

    invoke-static {p1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const-string v3, "field"

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/view/StripeEditText;

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/stripe/android/view/BecsDebitWidget$_init_$lambda$1$$inlined$doAfterTextChanged$1;

    invoke-direct {v3, p0}, Lcom/stripe/android/view/BecsDebitWidget$_init_$lambda$1$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/BecsDebitWidget;)V

    invoke-virtual {p3, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    new-instance p3, Lcom/stripe/android/view/BecsDebitWidget$2;

    invoke-direct {p3, p0}, Lcom/stripe/android/view/BecsDebitWidget$2;-><init>(Lcom/stripe/android/view/BecsDebitWidget;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/BecsDebitBsbEditText;->setOnBankChangedCallback(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    new-instance p3, Lcom/stripe/android/view/BecsDebitWidget$3;

    invoke-direct {p3, p0}, Lcom/stripe/android/view/BecsDebitWidget$3;-><init>(Lcom/stripe/android/view/BecsDebitWidget;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/BecsDebitBsbEditText;->setOnCompletedCallback(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    new-instance p3, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    const-string v5, "viewBinding.nameEditText"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v4}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    new-instance p3, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    const-string v5, "viewBinding.emailEditText"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v4}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    new-instance p3, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    const-string v5, "viewBinding.bsbEditText"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v4}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v4, Lcom/stripe/android/R$string;->becs_widget_name_required:I

    invoke-virtual {p3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage$payments_core_release(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v5, "viewBinding.nameTextInputLayout"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v4}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v5, "viewBinding.emailTextInputLayout"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v4}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v5, "viewBinding.bsbTextInputLayout"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v4}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->accountNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v5, "viewBinding.accountNumberTextInputLayout"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v4}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    new-array p1, v2, [Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    aput-object p3, p1, v0

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    aput-object p3, p1, v1

    invoke-static {p1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/view/StripeEditText;

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/view/BecsDebitWidget$_init_$lambda$3$$inlined$doAfterTextChanged$1;

    invoke-direct {v0, p3}, Lcom/stripe/android/view/BecsDebitWidget$_init_$lambda$3$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_2
    invoke-static {p4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/2addr p1, v1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 p4, 0x0

    :goto_2
    if-eqz p4, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->mandateAcceptanceTextView:Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    invoke-virtual {p1, p4}, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->setCompanyName(Ljava/lang/String;)V

    :cond_4
    invoke-direct {p0, p2}, Lcom/stripe/android/view/BecsDebitWidget;->applyAttributes(Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/stripe/android/view/BecsDebitWidget;->verifyCompanyName()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const-string p4, ""

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/view/BecsDebitWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$isInputValid(Lcom/stripe/android/view/BecsDebitWidget;)Z
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/BecsDebitWidget;->isInputValid()Z

    move-result p0

    return p0
.end method

.method private final applyAttributes(Landroid/util/AttributeSet;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/R$styleable;->BecsDebitWidget:[I

    const-string v2, "BecsDebitWidget"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "obtainStyledAttributes(s\u2026efStyleAttr, defStyleRes)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/R$styleable;->BecsDebitWidget_companyName:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->mandateAcceptanceTextView:Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->setCompanyName(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private final isInputValid()Z
    .locals 5

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/EmailEditText;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/BecsDebitBsbEditText;->getBsb$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    invoke-virtual {v3}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getAccountNumber()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v4, 0x0

    if-nez v0, :cond_6

    const/4 v0, 0x1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v0

    :goto_1
    if-nez v1, :cond_6

    if-eqz v2, :cond_3

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v4

    goto :goto_3

    :cond_3
    :goto_2
    move v1, v0

    :goto_3
    if-nez v1, :cond_6

    if-eqz v3, :cond_5

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    move v1, v4

    goto :goto_5

    :cond_5
    :goto_4
    move v1, v0

    :goto_5
    if-nez v1, :cond_6

    move v4, v0

    :cond_6
    return v4
.end method

.method private final verifyCompanyName()V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->mandateAcceptanceTextView:Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    invoke-virtual {v0}, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->isValid$payments_core_release()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "A company name is required to render a BecsDebitWidget."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getParams()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 12

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/EmailEditText;->getEmail()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/BecsDebitBsbEditText;->getBsb$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getAccountNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    invoke-virtual {v2, v5}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_1

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_0

    :cond_0
    move v7, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v7, v6

    :goto_1
    invoke-virtual {v2, v7}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    move v7, v5

    goto :goto_3

    :cond_3
    :goto_2
    move v7, v6

    :goto_3
    invoke-virtual {v2, v7}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitWidget;->getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    if-eqz v1, :cond_5

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_4

    :cond_4
    move v7, v5

    goto :goto_5

    :cond_5
    :goto_4
    move v7, v6

    :goto_5
    invoke-virtual {v2, v7}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_d

    if-eqz v3, :cond_7

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_6

    :cond_6
    move v2, v5

    goto :goto_7

    :cond_7
    :goto_6
    move v2, v6

    :goto_7
    if-nez v2, :cond_d

    if-eqz v0, :cond_9

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_8

    :cond_8
    move v2, v5

    goto :goto_9

    :cond_9
    :goto_8
    move v2, v6

    :goto_9
    if-nez v2, :cond_d

    if-eqz v1, :cond_a

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_b

    :cond_a
    move v5, v6

    :cond_b
    if-eqz v5, :cond_c

    goto :goto_a

    :cond_c
    sget-object v8, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    new-instance v9, Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;

    invoke-direct {v9, v0, v1}, Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x9

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v8

    move-object v7, v9

    move-object v8, v0

    move-object v9, v1

    invoke-static/range {v6 .. v11}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->create$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    return-object v0

    :cond_d
    :goto_a
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getValidParamsCallback()Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/BecsDebitWidget;->validParamsCallback:Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

    return-object v0
.end method

.method public final getViewBinding$payments_core_release()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/BecsDebitWidget;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/databinding/BecsDebitWidgetBinding;

    return-object v0
.end method

.method public final setValidParamsCallback(Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitWidget;->validParamsCallback:Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

    return-void
.end method
