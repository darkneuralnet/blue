.class public final LfL3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCx0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfL3;->v(LG10;Lcom/braintreepayments/api/models/PayPalRequest;ZLiL3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic b:LG10;

.field public final synthetic c:Lcom/braintreepayments/api/models/PayPalRequest;

.field public final synthetic d:Z

.field public final synthetic e:LHN1;


# direct methods
.method public constructor <init>(LG10;Lcom/braintreepayments/api/models/PayPalRequest;ZLHN1;)V
    .locals 0

    iput-object p1, p0, LfL3$b;->b:LG10;

    iput-object p2, p0, LfL3$b;->c:Lcom/braintreepayments/api/models/PayPalRequest;

    iput-boolean p3, p0, LfL3$b;->d:Z

    iput-object p4, p0, LfL3$b;->e:LHN1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Lex0;)V
    .locals 3

    invoke-virtual {p1}, Lex0;->f()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LfL3$b;->b:LG10;

    new-instance v0, Lcom/braintreepayments/api/exceptions/BraintreeException;

    const-string v1, "PayPal is not enabled. See https://developers.braintreepayments.com/guides/paypal/overview/android/ for more information."

    invoke-direct {v0, v1}, Lcom/braintreepayments/api/exceptions/BraintreeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LG10;->ya(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object p1, p0, LfL3$b;->b:LG10;

    invoke-static {p1}, LfL3;->l(LG10;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, LfL3$b;->b:LG10;

    const-string v0, "paypal.invalid-manifest"

    invoke-virtual {p1, v0}, LG10;->Ea(Ljava/lang/String;)V

    iget-object p1, p0, LfL3$b;->b:LG10;

    new-instance v0, Lcom/braintreepayments/api/exceptions/BraintreeException;

    const-string v1, "BraintreeBrowserSwitchActivity missing, incorrectly configured in AndroidManifest.xml or another app defines the same browser switch url as this app. See https://developers.braintreepayments.com/guides/client-sdk/android/#browser-switch for the correct configuration"

    invoke-direct {v0, v1}, Lcom/braintreepayments/api/exceptions/BraintreeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LG10;->ya(Ljava/lang/Exception;)V

    return-void

    :cond_1
    :try_start_0
    iget-object p1, p0, LfL3$b;->b:LG10;

    invoke-virtual {p1}, LG10;->T9()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, LfL3$b;->c:Lcom/braintreepayments/api/models/PayPalRequest;

    invoke-static {p1, v0}, LfL3;->b(Landroid/content/Context;Lcom/braintreepayments/api/models/PayPalRequest;)V

    iget-object p1, p0, LfL3$b;->b:LG10;

    iget-object v0, p0, LfL3$b;->c:Lcom/braintreepayments/api/models/PayPalRequest;

    iget-boolean v1, p0, LfL3$b;->d:Z

    iget-object v2, p0, LfL3$b;->e:LHN1;

    invoke-static {p1, v0, v1, v2}, LfL3;->c(LG10;Lcom/braintreepayments/api/models/PayPalRequest;ZLHN1;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, LfL3$b;->b:LG10;

    invoke-virtual {v0, p1}, LG10;->ya(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
