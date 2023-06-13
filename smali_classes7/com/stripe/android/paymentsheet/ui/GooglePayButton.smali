.class public final Lcom/stripe/android/paymentsheet/ui/GooglePayButton;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/GooglePayButton$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\u000f\u001a\u00020\u0010H\u0002J\u0008\u0010\u0011\u001a\u00020\u0010H\u0002J\u0008\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0008\u0010\t\u001a\u0004\u0018\u00010\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/GooglePayButton;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "state",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
        "viewBinding",
        "Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;",
        "getViewBinding$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;",
        "onFinishProcessing",
        "",
        "onReadyState",
        "onStartProcessing",
        "setEnabled",
        "enabled",
        "",
        "updateAlpha",
        "updateState",
        "Companion",
        "paymentsheet_release"
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
        "SMAP\nGooglePayButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,106:1\n262#2,2:107\n262#2,2:109\n262#2,2:111\n262#2,2:113\n262#2,2:115\n262#2,2:117\n*S KotlinDebug\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButton\n*L\n54#1:107,2\n55#1:109,2\n59#1:111,2\n60#1:113,2\n64#1:115,2\n65#1:117,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/paymentsheet/ui/GooglePayButton$Companion;

.field public static final TEST_TAG:Ljava/lang/String; = "google-pay-button"


# instance fields
.field private state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

.field private final viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->Companion:Lcom/stripe/android/paymentsheet/ui/GooglePayButton$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    move-result-object p1

    const-string p2, "inflate(\n        LayoutI\u2026text),\n        this\n    )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    const/4 p2, 0x1

    invoke-super {p0, p2}, Landroid/view/View;->setClickable(Z)V

    invoke-super {p0, p2}, Landroid/view/View;->setEnabled(Z)V

    iget-object p2, p1, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayPrimaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayPrimaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setFinishedBackgroundColor$paymentsheet_release(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final onFinishProcessing()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayPrimaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    const-string v1, "viewBinding.googlePayPrimaryButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayButtonContent:Landroid/widget/ImageView;

    const-string v1, "viewBinding.googlePayButtonContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final onReadyState()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayPrimaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    const-string v1, "viewBinding.googlePayPrimaryButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayButtonContent:Landroid/widget/ImageView;

    const-string v1, "viewBinding.googlePayButtonContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final onStartProcessing()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayPrimaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    const-string v1, "viewBinding.googlePayPrimaryButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayButtonContent:Landroid/widget/ImageView;

    const-string v1, "viewBinding.googlePayButtonContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final updateAlpha()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayButtonLayout:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    if-eqz v1, :cond_0

    instance-of v1, v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_1

    const/high16 v1, 0x3f000000    # 0.5f

    goto :goto_0

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method


# virtual methods
.method public final getViewBinding$paymentsheet_release()Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    return-object v0
.end method

.method public setEnabled(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayPrimaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->updateAlpha()V

    return-void
.end method

.method public final updateState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayPrimaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->updateAlpha()V

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->onReadyState()V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->onStartProcessing()V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButton;->onFinishProcessing()V

    :cond_2
    :goto_0
    return-void
.end method
