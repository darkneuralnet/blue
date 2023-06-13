.class public final LfL3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHN1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfL3;->v(LG10;Lcom/braintreepayments/api/models/PayPalRequest;ZLiL3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:LG10;

.field public final synthetic b:Lcom/braintreepayments/api/models/PayPalRequest;

.field public final synthetic c:Z

.field public final synthetic d:LiL3;


# direct methods
.method public constructor <init>(LG10;Lcom/braintreepayments/api/models/PayPalRequest;ZLiL3;)V
    .locals 0

    iput-object p1, p0, LfL3$a;->a:LG10;

    iput-object p2, p0, LfL3$a;->b:Lcom/braintreepayments/api/models/PayPalRequest;

    iput-boolean p3, p0, LfL3$a;->c:Z

    iput-object p4, p0, LfL3$a;->d:LiL3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, LfL3$a;->a:LG10;

    invoke-virtual {v0, p1}, LG10;->ya(Ljava/lang/Exception;)V

    return-void
.end method

.method public success(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, LrL3;->a(Ljava/lang/String;)LrL3;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, LrL3;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    iget-object v0, p0, LfL3$a;->b:Lcom/braintreepayments/api/models/PayPalRequest;

    invoke-virtual {v0}, Lcom/braintreepayments/api/models/PayPalRequest;->m()Ljava/lang/String;

    move-result-object v0

    const-string v1, "useraction"

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-boolean v0, p0, LfL3$a;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LfL3$a;->a:LG10;

    invoke-static {v0, p1}, LfL3;->f(LG10;Ljava/lang/String;)Lcom/paypal/android/sdk/onetouch/core/BillingAgreementRequest;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LfL3$a;->a:LG10;

    invoke-static {v0, p1}, LfL3;->g(LG10;Ljava/lang/String;)Lcom/paypal/android/sdk/onetouch/core/CheckoutRequest;

    move-result-object p1

    :goto_0
    iget-object v0, p0, LfL3$a;->a:LG10;

    iget-object v1, p0, LfL3$a;->d:LiL3;

    invoke-static {v0, p1, v1}, LfL3;->a(LG10;Lcom/paypal/android/sdk/onetouch/core/Request;LiL3;)V

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, LfL3$a;->a:LG10;

    invoke-virtual {v0, p1}, LG10;->ya(Ljava/lang/Exception;)V

    return-void
.end method
