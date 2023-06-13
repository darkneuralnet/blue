.class public final Lcom/stripe/android/paymentsheet/ui/PrimaryButton;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;,
        Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001:\u0002IJB%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0014\u00103\u001a\u0004\u0018\u0001042\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u00105\u001a\u0002062\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020608H\u0002J\u0008\u00109\u001a\u000206H\u0002J\u0008\u0010:\u001a\u000206H\u0002J\u0018\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=2\u0008\u0010>\u001a\u0004\u0018\u00010\u0012J\u0012\u0010?\u001a\u0002062\u0008\u0010>\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010@\u001a\u0002062\u0006\u0010A\u001a\u00020&H\u0016J\u0012\u0010B\u001a\u0002062\u0008\u0010C\u001a\u0004\u0018\u00010\u001aH\u0002J\u0008\u0010D\u001a\u000206H\u0002J\u0010\u0010E\u001a\u0002062\u0008\u0010,\u001a\u0004\u0018\u00010-J\u0010\u0010F\u001a\u0002062\u0008\u0010G\u001a\u0004\u0018\u00010HR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R&\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u001b\u0010\u0014\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u001a\u0010%\u001a\u00020&X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u00020/8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00080\u0010\u0014\u001a\u0004\u00081\u00102\u00a8\u0006K"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "animator",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;",
        "borderStrokeColor",
        "borderStrokeWidth",
        "",
        "confirmedIcon",
        "Landroid/widget/ImageView;",
        "cornerRadius",
        "defaultTintList",
        "Landroid/content/res/ColorStateList;",
        "getDefaultTintList$paymentsheet_release$annotations",
        "()V",
        "getDefaultTintList$paymentsheet_release",
        "()Landroid/content/res/ColorStateList;",
        "setDefaultTintList$paymentsheet_release",
        "(Landroid/content/res/ColorStateList;)V",
        "externalLabel",
        "",
        "getExternalLabel$paymentsheet_release$annotations",
        "getExternalLabel$paymentsheet_release",
        "()Ljava/lang/String;",
        "setExternalLabel$paymentsheet_release",
        "(Ljava/lang/String;)V",
        "finishedBackgroundColor",
        "getFinishedBackgroundColor$paymentsheet_release",
        "()I",
        "setFinishedBackgroundColor$paymentsheet_release",
        "(I)V",
        "lockVisible",
        "",
        "getLockVisible$paymentsheet_release",
        "()Z",
        "setLockVisible$paymentsheet_release",
        "(Z)V",
        "originalLabel",
        "state",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
        "viewBinding",
        "Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;",
        "getViewBinding$paymentsheet_release$annotations",
        "getViewBinding$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;",
        "getTextAttributeValue",
        "",
        "onFinishProcessing",
        "",
        "onAnimationEnd",
        "Lkotlin/Function0;",
        "onReadyState",
        "onStartProcessing",
        "setAppearanceConfiguration",
        "primaryButtonStyle",
        "Lcom/stripe/android/uicore/PrimaryButtonStyle;",
        "tintList",
        "setBackgroundTintList",
        "setEnabled",
        "enabled",
        "setLabel",
        "text",
        "updateAlpha",
        "updateState",
        "updateUiState",
        "uiState",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "State",
        "UIState",
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
        "SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButton\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n174#2:255\n174#2:256\n174#2:257\n174#2:258\n177#3,2:259\n262#3,2:270\n262#3,2:272\n262#3,2:274\n262#3,2:276\n262#3,2:278\n52#4,9:261\n1855#5,2:280\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButton\n*L\n62#1:255\n65#1:256\n93#1:257\n94#1:258\n111#1:259,2\n149#1:270,2\n150#1:272,2\n154#1:274,2\n155#1:276,2\n180#1:278,2\n120#1:261,9\n216#1:280,2\n*E\n"
    }
.end annotation


# instance fields
.field private final animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

.field private borderStrokeColor:I

.field private borderStrokeWidth:F

.field private final confirmedIcon:Landroid/widget/ImageView;

.field private cornerRadius:F

.field private defaultTintList:Landroid/content/res/ColorStateList;

.field private externalLabel:Ljava/lang/String;

.field private finishedBackgroundColor:I

.field private lockVisible:Z

.field private originalLabel:Ljava/lang/String;

.field private state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

.field private final viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;


# direct methods
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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    invoke-direct {p3, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    invoke-static {p3, p0}, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    move-result-object p3

    const-string v0, "inflate(\n        LayoutI\u2026text),\n        this\n    )"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    iget-object v1, p3, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->confirmedIcon:Landroid/widget/ImageView;

    const-string v2, "viewBinding.confirmedIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->confirmedIcon:Landroid/widget/ImageView;

    sget-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getCornerRadius()F

    move-result v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {p1, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result v2

    iput v2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->cornerRadius:F

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getBorderStrokeWidth()F

    move-result v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {p1, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result v2

    iput v2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeWidth:F

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v1

    iput v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeColor:I

    sget v1, Lcom/stripe/android/paymentsheet/R$color;->stripe_paymentsheet_primary_button_success_background:I

    invoke-static {p1, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedBackgroundColor:I

    iget-object p1, p3, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->label:Landroidx/compose/ui/platform/ComposeView;

    sget-object p3, Landroidx/compose/ui/platform/k$c;->b:Landroidx/compose/ui/platform/k$c;

    invoke-virtual {p1, p3}, Landroidx/compose/ui/platform/AbstractComposeView;->setViewCompositionStrategy(Landroidx/compose/ui/platform/k;)V

    invoke-direct {p0, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getTextAttributeValue(Landroid/util/AttributeSet;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setLabel(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setEnabled(Z)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateUiState$lambda$5(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic getDefaultTintList$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getExternalLabel$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getTextAttributeValue(Landroid/util/AttributeSet;)Ljava/lang/CharSequence;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x101014f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "obtainStyledAttributes(s\u2026efStyleAttr, defStyleRes)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method public static synthetic getViewBinding$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final onFinishProcessing(Lkotlin/jvm/functions/Function0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedBackgroundColor:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->label:Landroidx/compose/ui/platform/ComposeView;

    const-string v2, "viewBinding.label"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;->fadeOut$paymentsheet_release(Landroid/view/View;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->confirmingIcon:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v2, "viewBinding.confirmingIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;->fadeOut$paymentsheet_release(Landroid/view/View;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->confirmedIcon:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    new-instance v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$onFinishProcessing$1;

    invoke-direct {v3, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$onFinishProcessing$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;->fadeIn$paymentsheet_release(Landroid/view/View;ILkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private final onReadyState()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->originalLabel:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setLabel(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultTintList:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    const-string v1, "viewBinding.lockIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    const/16 v2, 0x8

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->confirmingIcon:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v1, "viewBinding.confirmingIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final onStartProcessing()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    const-string v1, "viewBinding.lockIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->confirmingIcon:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v1, "viewBinding.confirmingIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_primary_button_processing:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setLabel(Ljava/lang/String;)V

    return-void
.end method

.method private final setLabel(Ljava/lang/String;)V
    .locals 3

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->externalLabel:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    instance-of v0, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->originalLabel:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->label:Landroidx/compose/ui/platform/ComposeView;

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;-><init>(Ljava/lang/String;)V

    const p1, 0x4a124745    # 2396625.2f

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lkotlin/jvm/functions/Function2;)V

    :cond_1
    return-void
.end method

.method private final updateAlpha()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->label:Landroidx/compose/ui/platform/ComposeView;

    const-string v2, "viewBinding.label"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    const-string v2, "viewBinding.lockIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    if-eqz v2, :cond_0

    instance-of v2, v2, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_1

    const/high16 v2, 0x3f000000    # 0.5f

    goto :goto_1

    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static final updateUiState$lambda$5(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getOnClick()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getDefaultTintList$paymentsheet_release()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultTintList:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getExternalLabel$paymentsheet_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->externalLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getFinishedBackgroundColor$paymentsheet_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedBackgroundColor:I

    return v0
.end method

.method public final getLockVisible$paymentsheet_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    return v0
.end method

.method public final getViewBinding$paymentsheet_release()Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    return-object v0
.end method

.method public final setAppearanceConfiguration(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/res/ColorStateList;)V
    .locals 3

    const-string v0, "primaryButtonStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getCornerRadius()F

    move-result v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result v0

    iput v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->cornerRadius:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getBorderStrokeWidth()F

    move-result v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result v0

    iput v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeWidth:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeColor:I

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getOnBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultTintList:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->cornerRadius:F

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    iget p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeWidth:F

    float-to-int p1, p1

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeColor:I

    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_primary_button_padding:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public final setDefaultTintList$paymentsheet_release(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultTintList:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateAlpha()V

    return-void
.end method

.method public final setExternalLabel$paymentsheet_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->externalLabel:Ljava/lang/String;

    return-void
.end method

.method public final setFinishedBackgroundColor$paymentsheet_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedBackgroundColor:I

    return-void
.end method

.method public final setLockVisible$paymentsheet_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    return-void
.end method

.method public final updateState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V
    .locals 1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateAlpha()V

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->onReadyState()V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->onStartProcessing()V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;->getOnComplete()Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->onFinishProcessing(Lkotlin/jvm/functions/Function0;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final updateUiState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v0, 0x8

    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    if-nez v1, :cond_2

    instance-of v0, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setLabel(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getEnabled()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setEnabled(Z)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getLockVisible()Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    new-instance v0, Ly24;

    invoke-direct {v0, p1}, Ly24;-><init>(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    return-void
.end method
