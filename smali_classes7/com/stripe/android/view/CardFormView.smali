.class public final Lcom/stripe/android/view/CardFormView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardFormView$Style;,
        Lcom/stripe/android/view/CardFormView$WhenMappings;,
        Lcom/stripe/android/view/CardFormView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c1\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u001d\u0008\u0007\u0018\u0000 Q2\u00020\u0001:\u0002QRB%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010:\u001a\u00020;H\u0002J\u0008\u0010<\u001a\u00020;H\u0002J\u0008\u0010=\u001a\u00020>H\u0002J\u001a\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020\'2\u0008\u0010A\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010B\u001a\u00020;2\u0008\u0010C\u001a\u0004\u0018\u00010DH\u0014J\u0008\u0010E\u001a\u00020DH\u0014J\u0010\u0010F\u001a\u00020;2\u0008\u0010G\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020>H\u0016J\u0008\u0010J\u001a\u00020;H\u0002J\u0008\u0010K\u001a\u00020;H\u0002J\u0008\u0010L\u001a\u00020;H\u0002J\u0012\u0010M\u001a\u00020;2\u0008\u0010A\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010N\u001a\u00020;2\u0008\u0010O\u001a\u0004\u0018\u00010PH\u0002R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\'\u0012\u0006\u0012\u0004\u0018\u00010(0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\'0*8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,R\u0016\u0010-\u001a\n /*\u0004\u0018\u00010.0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"
    }
    d2 = {
        "Lcom/stripe/android/view/CardFormView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "allEditTextFields",
        "",
        "Lcom/stripe/android/view/StripeEditText;",
        "getAllEditTextFields",
        "()Ljava/util/Collection;",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "cardContainer",
        "Lcom/google/android/material/card/MaterialCardView;",
        "cardMultilineWidget",
        "Lcom/stripe/android/view/CardMultilineWidget;",
        "cardParams",
        "Lcom/stripe/android/model/CardParams;",
        "getCardParams",
        "()Lcom/stripe/android/model/CardParams;",
        "cardValidCallback",
        "Lcom/stripe/android/view/CardValidCallback;",
        "cardValidTextWatcher",
        "com/stripe/android/view/CardFormView$cardValidTextWatcher$1",
        "Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;",
        "countryLayout",
        "Lcom/stripe/android/view/CountryTextInputLayout;",
        "countryPostalDivider",
        "Landroid/view/View;",
        "errors",
        "Landroid/widget/TextView;",
        "errorsMap",
        "",
        "Lcom/stripe/android/view/CardValidCallback$Fields;",
        "",
        "invalidFields",
        "",
        "getInvalidFields",
        "()Ljava/util/Set;",
        "layoutInflater",
        "Landroid/view/LayoutInflater;",
        "kotlin.jvm.PlatformType",
        "postalCodeContainer",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "postalCodeValidator",
        "Lcom/stripe/android/view/PostalCodeValidator;",
        "postalCodeView",
        "Lcom/stripe/android/view/PostalCodeEditText;",
        "style",
        "Lcom/stripe/android/view/CardFormView$Style;",
        "viewBinding",
        "Lcom/stripe/android/databinding/StripeCardFormViewBinding;",
        "applyBorderlessStyle",
        "",
        "applyStandardStyle",
        "isPostalValid",
        "",
        "onFieldError",
        "field",
        "errorMessage",
        "onRestoreInstanceState",
        "state",
        "Landroid/os/Parcelable;",
        "onSaveInstanceState",
        "setCardValidCallback",
        "callback",
        "setEnabled",
        "enabled",
        "setupCardWidget",
        "setupCountryAndPostal",
        "showPostalError",
        "updateErrorsView",
        "updatePostalCodeViewLocale",
        "countryCode",
        "Lcom/stripe/android/core/model/CountryCode;",
        "Companion",
        "Style",
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
        "SMAP\nCardFormView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFormView.kt\ncom/stripe/android/view/CardFormView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,472:1\n52#2,9:473\n1#3:482\n1855#4,2:483\n1855#4,2:485\n1855#4,2:513\n1855#4:541\n1856#4:546\n288#4,2:553\n58#5,23:487\n93#5,3:510\n58#5,23:515\n93#5,3:538\n329#6,4:542\n262#6,2:547\n262#6,2:555\n11335#7:549\n11670#7,3:550\n*S KotlinDebug\n*F\n+ 1 CardFormView.kt\ncom/stripe/android/view/CardFormView\n*L\n160#1:473,9\n184#1:483,2\n188#1:485,2\n265#1:513,2\n307#1:541\n307#1:546\n456#1:553,2\n216#1:487,23\n216#1:510,3\n293#1:515,23\n293#1:538,3\n308#1:542,4\n442#1:547,2\n463#1:555,2\n455#1:549\n455#1:550,3\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final CARD_FORM_VIEW:Ljava/lang/String; = "CardFormView"

.field public static final Companion:Lcom/stripe/android/view/CardFormView$Companion;

.field private static final STATE_ENABLED:Ljava/lang/String; = "state_enabled"

.field private static final STATE_SUPER_STATE:Ljava/lang/String; = "state_super_state"


# instance fields
.field private final cardContainer:Lcom/google/android/material/card/MaterialCardView;

.field private final cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

.field private cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

.field private final cardValidTextWatcher:Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

.field private final countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

.field private final countryPostalDivider:Landroid/view/View;

.field private final errors:Landroid/widget/TextView;

.field private final errorsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/view/CardValidCallback$Fields;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final layoutInflater:Landroid/view/LayoutInflater;

.field private final postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

.field private final postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

.field private final postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

.field private style:Lcom/stripe/android/view/CardFormView$Style;

.field private final viewBinding:Lcom/stripe/android/databinding/StripeCardFormViewBinding;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/CardFormView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/CardFormView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/CardFormView;->Companion:Lcom/stripe/android/view/CardFormView$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/CardFormView;->$stable:I

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardFormView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardFormView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    invoke-static {p3, p0}, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeCardFormViewBinding;

    move-result-object p3

    const-string v0, "inflate(layoutInflater, this)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardFormView;->viewBinding:Lcom/stripe/android/databinding/StripeCardFormViewBinding;

    iget-object v0, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->cardMultilineWidgetContainer:Lcom/google/android/material/card/MaterialCardView;

    const-string v1, "viewBinding.cardMultilineWidgetContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardContainer:Lcom/google/android/material/card/MaterialCardView;

    iget-object v1, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const-string v2, "viewBinding.cardMultilineWidget"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    iget-object v2, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->countryPostalDivider:Landroid/view/View;

    const-string v3, "viewBinding.countryPostalDivider"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/stripe/android/view/CardFormView;->countryPostalDivider:Landroid/view/View;

    iget-object v2, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "viewBinding.postalCodeContainer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/stripe/android/view/CardFormView;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v3, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->errors:Landroid/widget/TextView;

    const-string v4, "viewBinding.errors"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->errors:Landroid/widget/TextView;

    iget-object v3, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->postalCode:Lcom/stripe/android/view/PostalCodeEditText;

    const-string v4, "viewBinding.postalCode"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    iget-object p3, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    const-string v3, "viewBinding.countryLayout"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    new-instance v3, Lcom/stripe/android/view/PostalCodeValidator;

    invoke-direct {v3}, Lcom/stripe/android/view/PostalCodeValidator;-><init>()V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

    sget-object v3, Lcom/stripe/android/view/CardFormView$Style;->Standard:Lcom/stripe/android/view/CardFormView$Style;

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->style:Lcom/stripe/android/view/CardFormView$Style;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->errorsMap:Ljava/util/Map;

    new-instance v3, Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

    invoke-direct {v3, p0}, Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;-><init>(Lcom/stripe/android/view/CardFormView;)V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->cardValidTextWatcher:Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

    const/4 v3, 0x1

    invoke-virtual {p0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->setupCountryAndPostal()V

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->setupCardWidget()V

    sget-object v4, Lcom/stripe/android/R$styleable;->StripeCardFormView:[I

    const-string v5, "StripeCardFormView"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-virtual {p1, p2, v4, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(s\u2026efStyleAttr, defStyleRes)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lcom/stripe/android/R$styleable;->StripeCardFormView_backgroundColorStateList:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-static {}, Lcom/stripe/android/view/CardFormView$Style;->values()[Lcom/stripe/android/view/CardFormView$Style;

    move-result-object v4

    sget v6, Lcom/stripe/android/R$styleable;->StripeCardFormView_cardFormStyle:I

    invoke-virtual {p1, v6, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    aget-object v4, v4, v6

    iput-object v4, p0, Lcom/stripe/android/view/CardFormView;->style:Lcom/stripe/android/view/CardFormView$Style;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Lcom/google/android/material/card/MaterialCardView;->setCardBackgroundColor(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p3, v5}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->style:Lcom/stripe/android/view/CardFormView$Style;

    sget-object p2, Lcom/stripe/android/view/CardFormView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    if-eq p1, v3, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->applyBorderlessStyle()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->applyStandardStyle()V

    :goto_0
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
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardFormView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/view/CardFormView;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardFormView;->setupCountryAndPostal$lambda$5(Lcom/stripe/android/view/CardFormView;Landroid/view/View;Z)V

    return-void
.end method

.method public static final synthetic access$getCardMultilineWidget$p(Lcom/stripe/android/view/CardFormView;)Lcom/stripe/android/view/CardMultilineWidget;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    return-object p0
.end method

.method public static final synthetic access$getCardValidCallback$p(Lcom/stripe/android/view/CardFormView;)Lcom/stripe/android/view/CardValidCallback;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    return-object p0
.end method

.method public static final synthetic access$getInvalidFields(Lcom/stripe/android/view/CardFormView;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getInvalidFields()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPostalCodeContainer$p(Lcom/stripe/android/view/CardFormView;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    return-object p0
.end method

.method public static final synthetic access$getPostalCodeView$p(Lcom/stripe/android/view/CardFormView;)Lcom/stripe/android/view/PostalCodeEditText;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    return-object p0
.end method

.method public static final synthetic access$onFieldError(Lcom/stripe/android/view/CardFormView;Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$updatePostalCodeViewLocale(Lcom/stripe/android/view/CardFormView;Lcom/stripe/android/core/model/CountryCode;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardFormView;->updatePostalCodeViewLocale(Lcom/stripe/android/core/model/CountryCode;)V

    return-void
.end method

.method private final applyBorderlessStyle()V
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberTextInputLayout()Lcom/stripe/android/view/CardNumberTextInputLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    iget-object v4, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v1, v4, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    iget-object v4, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v1, v4, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    invoke-static {v1, v0, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryPostalDivider:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardContainer:Lcom/google/android/material/card/MaterialCardView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/card/MaterialCardView;->setCardElevation(F)V

    return-void
.end method

.method private final applyStandardStyle()V
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getSecondRowLayout()Landroid/widget/LinearLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    iget-object v4, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v4}, Lcom/stripe/android/view/CardMultilineWidget;->getSecondRowLayout()Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-static {v1, v4, v2}, Lcom/stripe/android/databinding/StripeVerticalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeVerticalDividerBinding;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeVerticalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    invoke-static {v1, v0, v2}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardContainer:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$dimen;->stripe_card_form_view_card_elevation:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/card/MaterialCardView;->setCardElevation(F)V

    return-void
.end method

.method private final getAllEditTextFields()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/stripe/android/view/StripeEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberEditText()Lcom/stripe/android/view/CardNumberEditText;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method private final getInvalidFields()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/CardValidCallback$Fields;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getInvalidFields$payments_core_release()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Postal:Lcom/stripe/android/view/CardValidCallback$Fields;

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->isPostalValid()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final isPostalValid()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/stripe/android/view/PostalCodeValidator;->isValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->errorsMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/stripe/android/view/CardValidCallback$Fields;->values()[Lcom/stripe/android/view/CardValidCallback$Fields;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    array-length v0, p1

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p1, v2

    iget-object v4, p0, Lcom/stripe/android/view/CardFormView;->errorsMap:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_2

    :cond_3
    :goto_1
    move v0, v2

    :goto_2
    xor-int/2addr v0, v2

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_4
    const/4 p2, 0x0

    :goto_3
    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/stripe/android/view/CardFormView;->updateErrorsView(Ljava/lang/String;)V

    return-void
.end method

.method private final setupCardWidget()V
    .locals 8

    const/4 v0, 0x3

    new-array v1, v0, [Lcom/stripe/android/view/StripeEditText;

    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberEditText()Lcom/stripe/android/view/CardNumberEditText;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v1, v5

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/stripe/android/R$dimen;->stripe_card_form_view_textsize:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    invoke-virtual {v2, v3, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    sget v7, Lcom/stripe/android/R$color;->stripe_card_form_view_text_color:I

    invoke-static {v6, v7}, LNA0;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/stripe/android/view/StripeEditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    const v6, 0x106000d

    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/AppCompatEditText;->setBackgroundResource(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    sget v7, Lcom/stripe/android/R$color;->stripe_card_form_view_form_error:I

    invoke-static {v6, v7}, LNA0;->c(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/stripe/android/view/StripeEditText;->setErrorColor(I)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/stripe/android/view/ExpiryDateEditText;->setIncludeSeparatorGaps$payments_core_release(Z)V

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/CardMultilineWidget;->setExpirationDatePlaceholderRes$payments_core_release(Ljava/lang/Integer;)V

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    sget v7, Lcom/stripe/android/R$string;->stripe_paymentsheet_expiration_date_hint:I

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberTextInputLayout()Lcom/stripe/android/view/CardNumberTextInputLayout;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const-string v6, ""

    invoke-virtual {v1, v6}, Lcom/stripe/android/view/CardMultilineWidget;->setCvcPlaceholderText(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v1

    const/4 v6, 0x5

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    sget v6, Lcom/stripe/android/R$drawable;->stripe_card_form_view_text_input_layout_background:I

    invoke-virtual {v1, v6}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v1

    new-instance v6, Lcom/stripe/android/view/CardFormView$setupCardWidget$$inlined$doAfterTextChanged$1;

    invoke-direct {v6, p0}, Lcom/stripe/android/view/CardFormView$setupCardWidget$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v6, Lcom/stripe/android/R$dimen;->stripe_card_form_view_text_margin_horizontal:I

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/stripe/android/R$dimen;->stripe_card_form_view_text_margin_vertical:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    new-array v0, v0, [Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v7, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v7}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberTextInputLayout()Lcom/stripe/android/view/CardNumberTextInputLayout;

    move-result-object v7

    aput-object v7, v0, v3

    iget-object v7, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v7}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v7

    aput-object v7, v0, v4

    iget-object v4, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v4}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v4

    aput-object v4, v0, v5

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    if-eqz v5, :cond_1

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v5, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v5, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v4, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    invoke-virtual {v4, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    sget v1, Lcom/stripe/android/R$drawable;->stripe_ic_cvc:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->setCvcIcon(Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    new-instance v1, Lcom/stripe/android/view/CardFormView$setupCardWidget$4;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$setupCardWidget$4;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->setCardNumberErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    new-instance v1, Lcom/stripe/android/view/CardFormView$setupCardWidget$5;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$setupCardWidget$5;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->setExpirationDateErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    new-instance v1, Lcom/stripe/android/view/CardFormView$setupCardWidget$6;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$setupCardWidget$6;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->setCvcErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0, v2}, Lcom/stripe/android/view/CardMultilineWidget;->setPostalCodeErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    return-void
.end method

.method private final setupCountryAndPostal()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/CardFormView;->updatePostalCodeViewLocale(Lcom/stripe/android/core/model/CountryCode;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$color;->stripe_card_form_view_form_error:I

    invoke-static {v1, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorColor(I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object v0

    new-instance v1, LGf0;

    invoke-direct {v1, p0}, LGf0;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v1, Lcom/stripe/android/view/CardFormView$setupCountryAndPostal$$inlined$doAfterTextChanged$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$setupCountryAndPostal$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v1, Lcom/stripe/android/view/CardFormView$setupCountryAndPostal$3;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$setupCountryAndPostal$3;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    new-instance v1, Lcom/stripe/android/view/CardFormView$setupCountryAndPostal$4;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$setupCountryAndPostal$4;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CountryTextInputLayout;->setCountryCodeChangeCallback(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final setupCountryAndPostal$lambda$5(Lcom/stripe/android/view/CardFormView;Landroid/view/View;Z)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_2

    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p2

    const/4 v0, 0x1

    xor-int/2addr p2, v0

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->isPostalValid()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getShouldShowError()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->showPostalError()V

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/stripe/android/view/CardValidCallback$Fields;->Postal:Lcom/stripe/android/view/CardValidCallback$Fields;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private final showPostalError()V
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardValidCallback$Fields;->Postal:Lcom/stripe/android/view/CardValidCallback$Fields;

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getErrorMessage$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    return-void
.end method

.method private final updateErrorsView(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->errors:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->errors:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final updatePostalCodeViewLocale(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 2

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->isUS(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    sget-object v0, Lcom/stripe/android/view/PostalCodeEditText$Config;->US:Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Lcom/stripe/android/view/PostalCodeEditText$Config;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$string;->address_zip_invalid:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    sget-object v0, Lcom/stripe/android/view/PostalCodeEditText$Config;->Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Lcom/stripe/android/view/PostalCodeEditText$Config;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$string;->address_postal_code_invalid:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    return-object v0
.end method

.method public final getCardParams()Lcom/stripe/android/model/CardParams;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->validateAllFields()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    return-object v2

    :cond_0
    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/view/CardFormView;->isPostalValid()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/view/CardFormView;->showPostalError()V

    return-object v2

    :cond_1
    invoke-direct {v0, v2}, Lcom/stripe/android/view/CardFormView;->updateErrorsView(Ljava/lang/String;)V

    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v16, Lcom/stripe/android/model/CardParams;

    iget-object v3, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v3}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v4

    const-string v3, "CardFormView"

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    iget-object v3, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v3}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/stripe/android/cards/CardNumber$Validated;->getValue()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_0
    if-nez v3, :cond_3

    const-string v3, ""

    :cond_3
    move-object v6, v3

    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Validated;->getMonth()I

    move-result v7

    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Validated;->getYear()I

    move-result v8

    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_1

    :cond_4
    move-object v9, v2

    :goto_1
    const/4 v10, 0x0

    new-instance v1, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v1}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    iget-object v3, v0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v3}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/model/Address$Builder;->setCountryCode(Lcom/stripe/android/core/model/CountryCode;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v1

    iget-object v3, v0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v3}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_5
    invoke-virtual {v1, v2}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x340

    const/4 v15, 0x0

    move-object/from16 v3, v16

    invoke-direct/range {v3 .. v15}, Lcom/stripe/android/model/CardParams;-><init>(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v16

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "state_super_state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    const-string v0, "state_enabled"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardFormView;->setEnabled(Z)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    :goto_0
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "state_super_state"

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "state_enabled"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final setCardValidCallback(Lcom/stripe/android/view/CardValidCallback;)V
    .locals 3

    iput-object p1, p0, Lcom/stripe/android/view/CardFormView;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getAllEditTextFields()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->cardValidTextWatcher:Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getAllEditTextFields()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardValidTextWatcher:Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getInvalidFields()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getInvalidFields()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/stripe/android/view/CardValidCallback;->onInputChanged(ZLjava/util/Set;)V

    :cond_2
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardContainer:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setEnabled(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->setEnabled(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->errors:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void
.end method
