.class public final LP36$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHN1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP36;->b(LG10;Lcom/braintreepayments/api/models/ThreeDSecureLookup;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/braintreepayments/api/models/CardNonce;

.field public final synthetic b:LG10;


# direct methods
.method public constructor <init>(Lcom/braintreepayments/api/models/CardNonce;LG10;)V
    .locals 0

    iput-object p1, p0, LP36$a;->a:Lcom/braintreepayments/api/models/CardNonce;

    iput-object p2, p0, LP36$a;->b:LG10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, LP36$a;->b:LG10;

    const-string v1, "three-d-secure.verification-flow.upgrade-payment-method.errored"

    invoke-virtual {v0, v1}, LG10;->Ea(Ljava/lang/String;)V

    iget-object v0, p0, LP36$a;->b:LG10;

    invoke-virtual {v0, p1}, LG10;->ya(Ljava/lang/Exception;)V

    return-void
.end method

.method public success(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Lcom/braintreepayments/api/models/ThreeDSecureAuthenticationResponse;->a(Ljava/lang/String;)Lcom/braintreepayments/api/models/ThreeDSecureAuthenticationResponse;

    move-result-object v0

    iget-object v1, p0, LP36$a;->a:Lcom/braintreepayments/api/models/CardNonce;

    invoke-static {p1, v1}, Lcom/braintreepayments/api/models/ThreeDSecureAuthenticationResponse;->d(Ljava/lang/String;Lcom/braintreepayments/api/models/CardNonce;)Lcom/braintreepayments/api/models/CardNonce;

    move-result-object p1

    invoke-virtual {v0}, Lcom/braintreepayments/api/models/ThreeDSecureAuthenticationResponse;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LP36$a;->b:LG10;

    const-string v2, "three-d-secure.verification-flow.upgrade-payment-method.failure.returned-lookup-nonce"

    invoke-virtual {v1, v2}, LG10;->Ea(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/braintreepayments/api/models/CardNonce;->i()Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    move-result-object v1

    invoke-virtual {v0}, Lcom/braintreepayments/api/models/ThreeDSecureAuthenticationResponse;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/braintreepayments/api/models/ThreeDSecureInfo;->d(Ljava/lang/String;)V

    iget-object v0, p0, LP36$a;->b:LG10;

    invoke-static {v0, p1}, LP36;->a(LG10;Lcom/braintreepayments/api/models/CardNonce;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LP36$a;->b:LG10;

    const-string v1, "three-d-secure.verification-flow.upgrade-payment-method.succeeded"

    invoke-virtual {v0, v1}, LG10;->Ea(Ljava/lang/String;)V

    iget-object v0, p0, LP36$a;->b:LG10;

    invoke-static {v0, p1}, LP36;->a(LG10;Lcom/braintreepayments/api/models/CardNonce;)V

    :goto_0
    return-void
.end method
