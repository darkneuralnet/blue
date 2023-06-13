.class public Lcom/adyen/checkout/card/ui/CardNumberInput;
.super Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;
.source "SourceFile"


# static fields
.field public static final d:[I

.field public static final e:[I


# instance fields
.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/adyen/checkout/card/ui/CardNumberInput;->d:[I

    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/adyen/checkout/card/ui/CardNumberInput;->e:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x4
        0x6
        0x5
        0x4
    .end array-data

    :array_1
    .array-data 4
        0x4
        0x4
        0x4
        0x4
        0x3
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/adyen/checkout/card/ui/CardNumberInput;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/adyen/checkout/card/ui/CardNumberInput;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x17

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;->b(I)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setInputType(I)V

    const-string p1, "0123456789 "

    invoke-static {p1}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/text/Editable;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x20

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/adyen/checkout/card/ui/CardNumberInput;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p1, v2, v0, v1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    :cond_0
    invoke-super {p0, p1}, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;->a(Landroid/text/Editable;)V

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/adyen/checkout/card/ui/CardNumberInput;->c:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/adyen/checkout/card/ui/CardNumberInput;->d:[I

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/adyen/checkout/card/ui/CardNumberInput;->e:[I

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/adyen/checkout/card/ui/CardNumberInput;->f(Ljava/lang/String;[I)[Ljava/lang/String;

    move-result-object p1

    const-string v0, " "

    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final varargs f(Ljava/lang/String;[I)[Ljava/lang/String;
    .locals 5

    array-length v0, p2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p2

    if-ge v2, v3, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    aget v4, p2, v2

    if-lt v3, v4, :cond_0

    invoke-virtual {p1, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    aget v3, p2, v2

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    aput-object p1, v0, v2

    :cond_1
    return-object v0
.end method

.method public setAmexCardFormat(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/adyen/checkout/card/ui/CardNumberInput;->c:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/adyen/checkout/card/ui/CardNumberInput;->c:Z

    invoke-virtual {p0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/card/ui/CardNumberInput;->a(Landroid/text/Editable;)V

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/adyen/checkout/card/ui/CardNumberInput;->c:Z

    return-void
.end method
