.class public Lcom/braintreepayments/api/exceptions/GoogleApiClientException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/braintreepayments/api/exceptions/GoogleApiClientException$a;
    }
.end annotation


# instance fields
.field public b:Lcom/braintreepayments/api/exceptions/GoogleApiClientException$a;

.field public c:I


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/braintreepayments/api/exceptions/GoogleApiClientException;->c:I

    return v0
.end method

.method public b()Lcom/braintreepayments/api/exceptions/GoogleApiClientException$a;
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/exceptions/GoogleApiClientException;->b:Lcom/braintreepayments/api/exceptions/GoogleApiClientException$a;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/braintreepayments/api/exceptions/GoogleApiClientException;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/braintreepayments/api/exceptions/GoogleApiClientException;->b()Lcom/braintreepayments/api/exceptions/GoogleApiClientException$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/braintreepayments/api/exceptions/GoogleApiClientException;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
