.class public abstract Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lgt0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<OutputDataT::",
        "LcA3;",
        "ConfigurationT:",
        "Lcom/adyen/checkout/components/base/Configuration;",
        "ComponentStateT:",
        "Ljava/lang/Object;",
        "ComponentT::",
        "Luu6<",
        "TOutputDataT;TConfigurationT;TComponentStateT;>;>",
        "Landroid/widget/LinearLayout;",
        "Lgt0<",
        "TOutputDataT;TComponentT;>;"
    }
.end annotation


# instance fields
.field public b:Luu6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TComponentT;"
        }
    .end annotation
.end field

.field public c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public c(Luu6;LLifecycleOwner;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TComponentT;",
            "LLifecycleOwner;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;->b:Luu6;

    invoke-interface {p0}, Lgt0;->b()V

    iget-object p1, p0, Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;->b:Luu6;

    invoke-interface {p1}, LFs0;->d()Lcom/adyen/checkout/components/base/Configuration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/adyen/checkout/components/base/Configuration;->c()Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;->e(Ljava/util/Locale;)V

    invoke-interface {p0}, Lgt0;->a()V

    iget-object p1, p0, Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;->c:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;->f(Landroid/content/Context;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;->b:Luu6;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p1, v0}, Luu6;->c(Landroid/content/Context;)V

    invoke-virtual {p0, p2}, Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;->g(LLifecycleOwner;)V

    return-void
.end method

.method public d()Luu6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TComponentT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;->b:Luu6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Should not get Component before it\'s attached"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Ljava/util/Locale;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    new-instance v1, Landroid/content/res/Configuration;

    invoke-direct {v1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-virtual {v1, p1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/adyen/checkout/components/ui/view/AdyenLinearLayout;->c:Landroid/content/Context;

    return-void
.end method

.method public abstract f(Landroid/content/Context;)V
.end method

.method public abstract g(LLifecycleOwner;)V
.end method
