.class public final Lcom/stripe/android/view/ExpiryDateEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/ExpiryDateEditText$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0007\u0018\u0000 52\u00020\u0001:\u00015B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0002J\u0008\u0010&\u001a\u00020\u000fH\u0002J\u0010\u0010\'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0016H\u0007J#\u0010)\u001a\u00020\u000f2\u0008\u0010*\u001a\u0004\u0018\u00010\u00072\u0008\u0010+\u001a\u0004\u0018\u00010\u0007H\u0000\u00a2\u0006\u0004\u0008,\u0010-J-\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\u00083J\u0012\u00104\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016H\u0002R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0019R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010 \u001a\u0004\u0018\u00010!8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u00066"
    }
    d2 = {
        "Lcom/stripe/android/view/ExpiryDateEditText;",
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
        "completionCallback",
        "Lkotlin/Function0;",
        "",
        "getCompletionCallback$payments_core_release",
        "()Lkotlin/jvm/functions/Function0;",
        "setCompletionCallback$payments_core_release",
        "(Lkotlin/jvm/functions/Function0;)V",
        "dateDigitsLength",
        "<set-?>",
        "",
        "includeSeparatorGaps",
        "getIncludeSeparatorGaps$payments_core_release",
        "()Z",
        "setIncludeSeparatorGaps$payments_core_release",
        "(Z)V",
        "includeSeparatorGaps$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "isDateValid",
        "separator",
        "validatedDate",
        "Lcom/stripe/android/model/ExpirationDate$Validated;",
        "getValidatedDate",
        "()Lcom/stripe/android/model/ExpirationDate$Validated;",
        "month",
        "year",
        "listenForTextChanges",
        "setIncludeSeparatorGaps",
        "include",
        "setText",
        "expiryMonth",
        "expiryYear",
        "setText$payments_core_release",
        "(Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "updateSelectionIndex",
        "newLength",
        "editActionStart",
        "editActionAddition",
        "maxInputLength",
        "updateSelectionIndex$payments_core_release",
        "updateSeparatorUi",
        "Companion",
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
        "SMAP\nExpiryDateEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpiryDateEditText.kt\ncom/stripe/android/view/ExpiryDateEditText\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,326:1\n33#2,3:327\n37#3,2:330\n*S KotlinDebug\n*F\n+ 1 ExpiryDateEditText.kt\ncom/stripe/android/view/ExpiryDateEditText\n*L\n55#1:327,3\n96#1:330,2\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field private static final Companion:Lcom/stripe/android/view/ExpiryDateEditText$Companion;

.field private static final INCLUDE_SEPARATOR_GAPS_DEFAULT:Z = false
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final INVALID_INPUT:I = -0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final SEPARATOR_WITHOUT_GAPS:Ljava/lang/String; = "/"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final SEPARATOR_WITH_GAPS:Ljava/lang/String; = " / "
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private synthetic completionCallback:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final dateDigitsLength:I

.field private final includeSeparatorGaps$delegate:Lkotlin/properties/ReadWriteProperty;

.field private isDateValid:Z

.field private separator:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "includeSeparatorGaps"

    const-string v3, "getIncludeSeparatorGaps$payments_core_release()Z"

    const-class v4, Lcom/stripe/android/view/ExpiryDateEditText;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    sput-object v0, Lcom/stripe/android/view/ExpiryDateEditText;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/stripe/android/view/ExpiryDateEditText$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/ExpiryDateEditText$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/ExpiryDateEditText;->Companion:Lcom/stripe/android/view/ExpiryDateEditText$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/ExpiryDateEditText;->$stable:I

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/ExpiryDateEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/ExpiryDateEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p2, Lcom/stripe/android/view/ExpiryDateEditText$completionCallback$1;->INSTANCE:Lcom/stripe/android/view/ExpiryDateEditText$completionCallback$1;

    iput-object p2, p0, Lcom/stripe/android/view/ExpiryDateEditText;->completionCallback:Lkotlin/jvm/functions/Function0;

    sget-object p2, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance p3, Lcom/stripe/android/view/ExpiryDateEditText$special$$inlined$observable$1;

    invoke-direct {p3, p2, p0}, Lcom/stripe/android/view/ExpiryDateEditText$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/ExpiryDateEditText;)V

    iput-object p3, p0, Lcom/stripe/android/view/ExpiryDateEditText;->includeSeparatorGaps$delegate:Lkotlin/properties/ReadWriteProperty;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/stripe/android/R$integer;->stripe_date_digits_length:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->dateDigitsLength:I

    const-string p1, "/"

    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->separator:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->setNumberOnlyInputType()V

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p0, p3, p1, p2}, Lcom/stripe/android/view/ExpiryDateEditText;->updateSeparatorUi$default(Lcom/stripe/android/view/ExpiryDateEditText;ZILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/stripe/android/view/ExpiryDateEditText;->listenForTextChanges()V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-lt p1, p2, :cond_0

    const-string p1, "creditCardExpirationDate"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setAutofillHints([Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lwi1;

    invoke-direct {p2, p0}, Lwi1;-><init>(Lcom/stripe/android/view/ExpiryDateEditText;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p3}, Landroid/view/View;->setLayoutDirection(I)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/ExpiryDateEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final _init_$lambda$1(Lcom/stripe/android/view/ExpiryDateEditText;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_2

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, p2

    :goto_1
    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid:Z

    if-nez p1, :cond_2

    invoke-virtual {p0, p2}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_2
    return-void
.end method

.method public static final synthetic access$getDateDigitsLength$p(Lcom/stripe/android/view/ExpiryDateEditText;)I
    .locals 0

    iget p0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->dateDigitsLength:I

    return p0
.end method

.method public static final synthetic access$getSeparator$p(Lcom/stripe/android/view/ExpiryDateEditText;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->separator:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$isDateValid(Lcom/stripe/android/view/ExpiryDateEditText;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setDateValid$p(Lcom/stripe/android/view/ExpiryDateEditText;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid:Z

    return-void
.end method

.method public static final synthetic access$updateSeparatorUi(Lcom/stripe/android/view/ExpiryDateEditText;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->updateSeparatorUi(Z)V

    return-void
.end method

.method public static synthetic c(Lcom/stripe/android/view/ExpiryDateEditText;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/ExpiryDateEditText;->_init_$lambda$1(Lcom/stripe/android/view/ExpiryDateEditText;Landroid/view/View;Z)V

    return-void
.end method

.method private final isDateValid(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move p1, v1

    goto :goto_1

    :cond_0
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object p1, v2

    :cond_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    :goto_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v3, :cond_2

    goto :goto_4

    :cond_2
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Lcom/stripe/android/view/DateUtils;->INSTANCE:Lcom/stripe/android/view/DateUtils;

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/stripe/android/view/DateUtils;->convertTwoDigitYearToFour(I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_2
    invoke-static {p2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v2, p2

    :goto_3
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    :goto_4
    invoke-static {p1, v1}, Lcom/stripe/android/view/DateUtils;->isExpiryDataValid(II)Z

    move-result p1

    return p1
.end method

.method private final listenForTextChanges()V
    .locals 1

    new-instance v0, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1;-><init>(Lcom/stripe/android/view/ExpiryDateEditText;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private final updateSeparatorUi(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const-string p1, " / "

    goto :goto_0

    :cond_0
    const-string p1, "/"

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->separator:Ljava/lang/String;

    new-instance p1, Landroid/text/InputFilter$LengthFilter;

    iget v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->dateDigitsLength:I

    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->separator:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p1, v0}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/text/InputFilter$LengthFilter;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/text/InputFilter;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public static synthetic updateSeparatorUi$default(Lcom/stripe/android/view/ExpiryDateEditText;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->updateSeparatorUi(Z)V

    return-void
.end method


# virtual methods
.method public getAccessibilityText()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$string;->acc_label_expiry_date_node:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "resources.getString(R.st\u2026l_expiry_date_node, text)"

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

    iget-object v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->completionCallback:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getIncludeSeparatorGaps$payments_core_release()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->includeSeparatorGaps$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/ExpiryDateEditText;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getValidatedDate()Lcom/stripe/android/model/ExpirationDate$Validated;
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->Companion:Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;->create(Ljava/lang/String;)Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->validate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final isDateValid()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid:Z

    return v0
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

    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->completionCallback:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setIncludeSeparatorGaps(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->setIncludeSeparatorGaps$payments_core_release(Z)V

    return-void
.end method

.method public final setIncludeSeparatorGaps$payments_core_release(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->includeSeparatorGaps$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/ExpiryDateEditText;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setText$payments_core_release(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 9

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0x30

    invoke-static {p1, v0, v2}, Lkotlin/text/StringsKt;->padStart(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v1, v3

    invoke-virtual {p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0, v2}, Lkotlin/text/StringsKt;->padStart(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->separator:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final updateSelectionIndex$payments_core_release(IIII)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x2

    if-gt p2, v1, :cond_0

    add-int v2, p2, p3

    if-lt v2, v1, :cond_0

    iget-object v2, p0, Lcom/stripe/android/view/ExpiryDateEditText;->separator:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const/4 v3, 0x1

    if-nez p3, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/stripe/android/view/ExpiryDateEditText;->separator:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v1

    if-ne p2, v4, :cond_2

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    add-int/2addr p2, p3

    add-int/2addr p2, v2

    if-eqz v3, :cond_3

    if-lez p2, :cond_3

    iget-object p3, p0, Lcom/stripe/android/view/ExpiryDateEditText;->separator:Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    :cond_3
    sub-int/2addr p2, v0

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p4, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method
