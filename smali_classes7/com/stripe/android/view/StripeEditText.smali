.class public Lcom/stripe/android/view/StripeEditText;
.super Lcom/google/android/material/textfield/TextInputEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;,
        Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;,
        Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;,
        Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;,
        Lcom/stripe/android/view/StripeEditText$StripeEditTextState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\r\n\u0002\u0008\u0007*\u00016\u0008\u0017\u0018\u00002\u00020\u0001:\u0005defghB%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0012\u0010=\u001a\u00020>2\u0008\u0010?\u001a\u0004\u0018\u00010<H\u0016J\u0008\u0010@\u001a\u00020>H\u0002J\n\u0010A\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010B\u001a\n C*\u0004\u0018\u00010&0&H\u0007J\u0010\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020\u0007H\u0002J\u0008\u0010F\u001a\u00020>H\u0002J\u0008\u0010G\u001a\u00020>H\u0002J\u0012\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020>2\u0006\u0010M\u001a\u00020NH\u0016J\u0012\u0010O\u001a\u00020>2\u0008\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u0008\u0010R\u001a\u00020QH\u0016J\u0012\u0010S\u001a\u00020>2\u0008\u0010?\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010T\u001a\u00020>2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010U\u001a\u00020>2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010V\u001a\u00020>2\u0008\u0008\u0001\u0010W\u001a\u00020\u0007J\u0010\u0010X\u001a\u00020>2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\nJ\u0010\u0010Y\u001a\u00020>2\u0008\u0010 \u001a\u0004\u0018\u00010!J\u0008\u0010Z\u001a\u00020>H\u0007J\u0010\u0010[\u001a\u00020>2\u0008\u0010\\\u001a\u0004\u0018\u00010&J\u0012\u0010]\u001a\u00020>2\u0008\u0010^\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010]\u001a\u00020>2\u0006\u0010_\u001a\u00020\u0007H\u0016J\u0017\u0010`\u001a\u00020>2\u0008\u0010a\u001a\u0004\u0018\u00010bH\u0000\u00a2\u0006\u0002\u0008cR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@AX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u000c\"\u0004\u0008\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\u000cR\u001c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020&0*8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R$\u0010-\u001a\u00020.8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008/\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R\u0010\u00105\u001a\u000206X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00107R$\u00108\u001a\u00020.2\u0006\u00108\u001a\u00020.@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00089\u00102\"\u0004\u0008:\u00104R\u0016\u0010;\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006i"
    }
    d2 = {
        "Lcom/stripe/android/view/StripeEditText;",
        "Lcom/google/android/material/textfield/TextInputEditText;",
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
        "afterTextChangedListener",
        "Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;",
        "<set-?>",
        "Landroid/content/res/ColorStateList;",
        "defaultColorStateList",
        "getDefaultColorStateList$payments_core_release",
        "()Landroid/content/res/ColorStateList;",
        "setDefaultColorStateList$payments_core_release",
        "(Landroid/content/res/ColorStateList;)V",
        "defaultErrorColor",
        "defaultErrorColorInt",
        "getDefaultErrorColorInt",
        "()I",
        "deleteEmptyListener",
        "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;",
        "errorMessage",
        "getErrorMessage$payments_core_release",
        "setErrorMessage$payments_core_release",
        "(Ljava/lang/String;)V",
        "errorMessageListener",
        "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;",
        "externalColorStateList",
        "externalErrorColor",
        "Ljava/lang/Integer;",
        "externalFocusChangeListener",
        "Landroid/view/View$OnFocusChangeListener;",
        "fieldText",
        "getFieldText$payments_core_release",
        "internalFocusChangeListeners",
        "",
        "getInternalFocusChangeListeners",
        "()Ljava/util/List;",
        "isLastKeyDelete",
        "",
        "isLastKeyDelete$payments_core_release$annotations",
        "()V",
        "isLastKeyDelete$payments_core_release",
        "()Z",
        "setLastKeyDelete$payments_core_release",
        "(Z)V",
        "isLastKeyDeleteTextWatcher",
        "com/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1",
        "Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;",
        "shouldShowError",
        "getShouldShowError",
        "setShouldShowError",
        "textWatchers",
        "Landroid/text/TextWatcher;",
        "addTextChangedListener",
        "",
        "watcher",
        "determineDefaultErrorColor",
        "getOnFocusChangeListener",
        "getParentOnFocusChangeListener",
        "kotlin.jvm.PlatformType",
        "isDeleteKey",
        "keyCode",
        "listenForDeleteEmpty",
        "listenForTextChanges",
        "onCreateInputConnection",
        "Landroid/view/inputmethod/InputConnection;",
        "outAttrs",
        "Landroid/view/inputmethod/EditorInfo;",
        "onInitializeAccessibilityNodeInfo",
        "info",
        "Landroid/view/accessibility/AccessibilityNodeInfo;",
        "onRestoreInstanceState",
        "state",
        "Landroid/os/Parcelable;",
        "onSaveInstanceState",
        "removeTextChangedListener",
        "setAfterTextChangedListener",
        "setDeleteEmptyListener",
        "setErrorColor",
        "errorColor",
        "setErrorMessage",
        "setErrorMessageListener",
        "setNumberOnlyInputType",
        "setOnFocusChangeListener",
        "listener",
        "setTextColor",
        "colors",
        "color",
        "setTextSilent",
        "text",
        "",
        "setTextSilent$payments_core_release",
        "AfterTextChangedListener",
        "DeleteEmptyListener",
        "ErrorMessageListener",
        "SoftDeleteInputConnection",
        "StripeEditTextState",
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
        "SMAP\nStripeEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeEditText.kt\ncom/stripe/android/view/StripeEditText\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1#2:342\n58#3,23:343\n93#3,3:366\n1855#4,2:369\n1855#4,2:371\n1855#4,2:373\n*S KotlinDebug\n*F\n+ 1 StripeEditText.kt\ncom/stripe/android/view/StripeEditText\n*L\n200#1:343,23\n200#1:366,3\n317#1:369,2\n321#1:371,2\n277#1:373,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final accessibilityText:Ljava/lang/String;

.field private afterTextChangedListener:Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;

.field private defaultColorStateList:Landroid/content/res/ColorStateList;

.field private defaultErrorColor:I

.field private deleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

.field private errorMessage:Ljava/lang/String;

.field private errorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

.field private externalColorStateList:Landroid/content/res/ColorStateList;

.field private externalErrorColor:Ljava/lang/Integer;

.field private externalFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

.field private final internalFocusChangeListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View$OnFocusChangeListener;",
            ">;"
        }
    .end annotation
.end field

.field private isLastKeyDelete:Z

.field private final isLastKeyDeleteTextWatcher:Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

.field private shouldShowError:Z

.field private textWatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/text/TextWatcher;",
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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/textfield/TextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDeleteTextWatcher:Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->listenForTextChanges()V

    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->listenForDeleteEmpty()V

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    const-string p2, "textColors"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->determineDefaultErrorColor()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->internalFocusChangeListeners:Ljava/util/List;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;->listenForDeleteEmpty$lambda$6(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getAfterTextChangedListener$p(Lcom/stripe/android/view/StripeEditText;)Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/StripeEditText;->afterTextChangedListener:Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;

    return-object p0
.end method

.method public static synthetic b(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/StripeEditText;->setOnFocusChangeListener$lambda$9(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;Z)V

    return-void
.end method

.method private final determineDefaultErrorColor()V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/view/StripeColorUtils;->Companion:Lcom/stripe/android/view/StripeColorUtils$Companion;

    iget-object v2, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeColorUtils$Companion;->isColorDark(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Lcom/stripe/android/R$color;->stripe_error_text_light_theme:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/stripe/android/R$color;->stripe_error_text_dark_theme:I

    :goto_0
    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultErrorColor:I

    return-void
.end method

.method private final isDeleteKey(I)Z
    .locals 1

    const/16 v0, 0x43

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic isLastKeyDelete$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final listenForDeleteEmpty()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDeleteTextWatcher:Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDeleteTextWatcher:Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_1
    new-instance v0, LwS5;

    invoke-direct {v0, p0}, LwS5;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method private static final listenForDeleteEmpty$lambda$6(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0, p2}, Lcom/stripe/android/view/StripeEditText;->isDeleteKey(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDelete:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p0, p0, Lcom/stripe/android/view/StripeEditText;->deleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;->onDeleteEmpty()V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final listenForTextChanges()V
    .locals 1

    new-instance v0, Lcom/stripe/android/view/StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private static final setOnFocusChangeListener$lambda$9(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;Z)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->internalFocusChangeListeners:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View$OnFocusChangeListener;

    invoke-interface {v1, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lcom/stripe/android/view/StripeEditText;->externalFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    if-eqz p0, :cond_1

    invoke-interface {p0, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public addTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public getAccessibilityText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->accessibilityText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefaultColorStateList$payments_core_release()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getDefaultErrorColorInt()I
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->determineDefaultErrorColor()V

    iget v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultErrorColor:I

    return v0
.end method

.method public final getErrorMessage$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getFieldText$payments_core_release()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method public final getInternalFocusChangeListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View$OnFocusChangeListener;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->internalFocusChangeListeners:Ljava/util/List;

    return-object v0
.end method

.method public getOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->externalFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    return-object v0
.end method

.method public final getParentOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    invoke-super {p0}, Landroid/view/View;->getOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    return-object v0
.end method

.method public final getShouldShowError()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    return v0
.end method

.method public final isLastKeyDelete$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDelete:Z

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    const-string v0, "outAttrs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/stripe/android/view/StripeEditText;->deleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    invoke-direct {v0, p1, v1, v2}, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;-><init>(Landroid/view/inputmethod/InputConnection;ZLcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getAccessibilityText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText.StripeEditTextState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->getShouldShowError()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    new-instance v0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;-><init>(Landroid/os/Parcelable;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public removeTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->afterTextChangedListener:Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;

    return-void
.end method

.method public final setDefaultColorStateList$payments_core_release(Landroid/content/res/ColorStateList;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public final setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->deleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    return-void
.end method

.method public final setErrorColor(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->externalErrorColor:Ljava/lang/Integer;

    return-void
.end method

.method public final setErrorMessage(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    return-void
.end method

.method public final setErrorMessage$payments_core_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    return-void
.end method

.method public final setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->errorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    return-void
.end method

.method public final setLastKeyDelete$payments_core_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDelete:Z

    return-void
.end method

.method public final setNumberOnlyInputType()V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    const/16 v1, 0x12

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setInputType(I)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-static {}, Landroid/text/method/HideReturnsTransformationMethod;->getInstance()Landroid/text/method/HideReturnsTransformationMethod;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    return-void
.end method

.method public final setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 1

    new-instance v0, LvS5;

    invoke-direct {v0, p0}, LvS5;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-super {p0, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->externalFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    return-void
.end method

.method public final setShouldShowError(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText;->errorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    if-eqz v1, :cond_1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;->displayErrorMessage(Ljava/lang/String;)V

    :cond_1
    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    if-eq v0, p1, :cond_5

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->externalErrorColor:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultErrorColor:I

    :goto_1
    invoke-super {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->externalColorStateList:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    :cond_4
    invoke-super {p0, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    :cond_5
    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    return-void
.end method

.method public setTextColor(I)V
    .locals 0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->externalColorStateList:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public final setTextSilent$payments_core_release(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/TextWatcher;

    invoke-super {p0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextWatcher;

    invoke-super {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_1
    return-void
.end method
