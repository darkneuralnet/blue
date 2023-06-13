.class public Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;
.super Lcom/google/android/material/textfield/TextInputEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText$b;
    }
.end annotation


# instance fields
.field public b:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    if-nez p3, :cond_0

    sget p3, Luf4;->editTextStyle:I

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/textfield/TextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;->d()Landroid/text/TextWatcher;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/text/Editable;)V
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;->b:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText$b;->a(Landroid/text/Editable;)V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v1, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    :cond_0
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public final d()Landroid/text/TextWatcher;
    .locals 1

    new-instance v0, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText$a;

    invoke-direct {v0, p0}, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText$a;-><init>(Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;)V

    return-object v0
.end method

.method public setOnChangeListener(Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText$b;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;->b:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText$b;

    return-void
.end method
