.class public final Lcom/stripe/android/view/CvcEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CvcEditText$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u001b\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a2\u0006\u0002\u0010!J9\u0010\"\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0000\u00a2\u0006\u0002\u0008\'R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/view/CvcEditText;",
        "Lcom/stripe/android/view/StripeEditText;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "accessibilityText",
        "",
        "getAccessibilityText",
        "()Ljava/lang/String;",
        "cardBrand",
        "Lcom/stripe/android/model/CardBrand;",
        "completionCallback",
        "Lkotlin/Function0;",
        "",
        "getCompletionCallback$payments_core_release",
        "()Lkotlin/jvm/functions/Function0;",
        "setCompletionCallback$payments_core_release",
        "(Lkotlin/jvm/functions/Function0;)V",
        "cvc",
        "Lcom/stripe/android/cards/Cvc$Validated;",
        "getCvc$payments_core_release",
        "()Lcom/stripe/android/cards/Cvc$Validated;",
        "unvalidatedCvc",
        "Lcom/stripe/android/cards/Cvc$Unvalidated;",
        "getUnvalidatedCvc",
        "()Lcom/stripe/android/cards/Cvc$Unvalidated;",
        "createFilters",
        "",
        "Landroid/text/InputFilter;",
        "(Lcom/stripe/android/model/CardBrand;)[Landroid/text/InputFilter;",
        "updateBrand",
        "customHintText",
        "customPlaceholderText",
        "textInputLayout",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "updateBrand$payments_core_release",
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
        "SMAP\nCvcEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcEditText.kt\ncom/stripe/android/view/CvcEditText\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,123:1\n58#2,23:124\n93#2,3:147\n*S KotlinDebug\n*F\n+ 1 CvcEditText.kt\ncom/stripe/android/view/CvcEditText\n*L\n51#1:124,23\n51#1:147,3\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private cardBrand:Lcom/stripe/android/model/CardBrand;

.field private synthetic completionCallback:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CvcEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CvcEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    iput-object p1, p0, Lcom/stripe/android/view/CvcEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    sget-object p2, Lcom/stripe/android/view/CvcEditText$completionCallback$1;->INSTANCE:Lcom/stripe/android/view/CvcEditText$completionCallback$1;

    iput-object p2, p0, Lcom/stripe/android/view/CvcEditText;->completionCallback:Lkotlin/jvm/functions/Function0;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lcom/stripe/android/R$string;->invalid_cvc:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    sget p2, Lcom/stripe/android/R$string;->cvc_number_hint:I

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setHint(I)V

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CvcEditText;->createFilters(Lcom/stripe/android/model/CardBrand;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->setNumberOnlyInputType()V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-lt p1, p2, :cond_0

    const-string p1, "creditCardSecurityCode"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setAutofillHints([Ljava/lang/String;)V

    :cond_0
    new-instance p1, Lcom/stripe/android/view/CvcEditText$special$$inlined$doAfterTextChanged$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/CvcEditText$special$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/CvcEditText;)V

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance p2, LGF0;

    invoke-direct {p2, p0}, LGF0;-><init>(Lcom/stripe/android/view/CvcEditText;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

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

    sget p3, Lvf4;->editTextStyle:I

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CvcEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final _init_$lambda$1(Lcom/stripe/android/view/CvcEditText;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lcom/stripe/android/cards/Cvc$Unvalidated;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/view/CvcEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {p2}, Lcom/stripe/android/model/CardBrand;->getMaxCvcLength()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/cards/Cvc$Unvalidated;->isPartialEntry(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_0
    return-void
.end method

.method public static final synthetic access$getCardBrand$p(Lcom/stripe/android/view/CvcEditText;)Lcom/stripe/android/model/CardBrand;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CvcEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    return-object p0
.end method

.method public static final synthetic access$getUnvalidatedCvc(Lcom/stripe/android/view/CvcEditText;)Lcom/stripe/android/cards/Cvc$Unvalidated;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lcom/stripe/android/cards/Cvc$Unvalidated;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/stripe/android/view/CvcEditText;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CvcEditText;->_init_$lambda$1(Lcom/stripe/android/view/CvcEditText;Landroid/view/View;Z)V

    return-void
.end method

.method private final createFilters(Lcom/stripe/android/model/CardBrand;)[Landroid/text/InputFilter;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getMaxCvcLength()I

    move-result p1

    invoke-direct {v1, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    return-object v0
.end method

.method private final getUnvalidatedCvc()Lcom/stripe/android/cards/Cvc$Unvalidated;
    .locals 2

    new-instance v0, Lcom/stripe/android/cards/Cvc$Unvalidated;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/cards/Cvc$Unvalidated;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic updateBrand$payments_core_release$default(Lcom/stripe/android/view/CvcEditText;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/view/CvcEditText;->updateBrand$payments_core_release(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-void
.end method


# virtual methods
.method public getAccessibilityText()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$string;->acc_label_cvc_node:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "resources.getString(R.st\u2026acc_label_cvc_node, text)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getCompletionCallback$payments_core_release()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CvcEditText;->completionCallback:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getCvc$payments_core_release()Lcom/stripe/android/cards/Cvc$Validated;
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lcom/stripe/android/cards/Cvc$Unvalidated;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CvcEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getMaxCvcLength()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/cards/Cvc$Unvalidated;->validate(I)Lcom/stripe/android/cards/Cvc$Validated;

    move-result-object v0

    return-object v0
.end method

.method public final setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CvcEditText;->completionCallback:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final synthetic updateBrand$payments_core_release(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 4

    const-string v0, "cardBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CvcEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CvcEditText;->createFilters(Lcom/stripe/android/model/CardBrand;)[Landroid/text/InputFilter;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    if-nez p2, :cond_1

    sget-object p2, Lcom/stripe/android/model/CardBrand;->AmericanExpress:Lcom/stripe/android/model/CardBrand;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lcom/stripe/android/R$string;->cvc_amex_hint:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lcom/stripe/android/R$string;->cvc_number_hint:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    :goto_0
    const-string v0, "if (cardBrand == CardBra\u2026umber_hint)\n            }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lcom/stripe/android/cards/Cvc$Unvalidated;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/cards/Cvc$Unvalidated;->getNormalized$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/stripe/android/view/CvcEditText;->getUnvalidatedCvc()Lcom/stripe/android/cards/Cvc$Unvalidated;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getMaxCvcLength()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/stripe/android/cards/Cvc$Unvalidated;->validate(I)Lcom/stripe/android/cards/Cvc$Validated;

    move-result-object v0

    if-nez v0, :cond_3

    move v1, v2

    :cond_3
    invoke-virtual {p0, v1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_4
    if-eqz p4, :cond_7

    invoke-virtual {p4, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget-object p3, Lcom/stripe/android/view/CvcEditText$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    if-ne p1, v2, :cond_6

    sget p1, Lcom/stripe/android/R$string;->cvc_multiline_helper_amex:I

    goto :goto_2

    :cond_6
    sget p1, Lcom/stripe/android/R$string;->cvc_multiline_helper:I

    :goto_2
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    :goto_3
    invoke-virtual {p4, p3}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_7
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :goto_4
    return-void
.end method
