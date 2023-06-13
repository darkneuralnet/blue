.class public Lcom/adyen/checkout/card/ui/SecurityCodeInput;
.super Lcom/adyen/checkout/card/ui/CardNumberInput;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/adyen/checkout/card/ui/SecurityCodeInput;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/adyen/checkout/card/ui/SecurityCodeInput;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/adyen/checkout/card/ui/CardNumberInput;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;->b(I)V

    return-void
.end method
