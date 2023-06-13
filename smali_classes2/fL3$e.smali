.class public final LfL3$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLN3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfL3;->n(LG10;Landroid/content/Intent;Lcom/paypal/android/sdk/onetouch/core/Request;Lcom/paypal/android/sdk/onetouch/core/Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:LG10;


# direct methods
.method public constructor <init>(LG10;)V
    .locals 0

    iput-object p1, p0, LfL3$e;->a:LG10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, LfL3$e;->a:LG10;

    invoke-virtual {v0, p1}, LG10;->ya(Ljava/lang/Exception;)V

    return-void
.end method

.method public b(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
    .locals 2

    instance-of v0, p1, Lcom/braintreepayments/api/models/PayPalAccountNonce;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/braintreepayments/api/models/PayPalAccountNonce;

    invoke-virtual {v0}, Lcom/braintreepayments/api/models/PayPalAccountNonce;->h()Lcom/braintreepayments/api/models/PayPalCreditFinancing;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LfL3$e;->a:LG10;

    const-string v1, "paypal.credit.accepted"

    invoke-virtual {v0, v1}, LG10;->Ea(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LfL3$e;->a:LG10;

    invoke-virtual {v0, p1}, LG10;->va(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    return-void
.end method
