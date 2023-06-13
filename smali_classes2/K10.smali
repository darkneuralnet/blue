.class public LK10;
.super LyN1;
.source "SourceFile"


# instance fields
.field public final h:Lcom/braintreepayments/api/models/Authorization;


# direct methods
.method public constructor <init>(Lcom/braintreepayments/api/models/Authorization;)V
    .locals 1

    invoke-direct {p0}, LyN1;-><init>()V

    iput-object p1, p0, LK10;->h:Lcom/braintreepayments/api/models/Authorization;

    invoke-static {}, LK10;->n()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LyN1;->l(Ljava/lang/String;)LyN1;

    :try_start_0
    new-instance p1, LmY5;

    invoke-static {}, LH10;->a()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p1, v0}, LmY5;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p0, p1}, LyN1;->k(Ljavax/net/ssl/SSLSocketFactory;)LyN1;
    :try_end_0
    .catch Ljavax/net/ssl/SSLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LyN1;->k(Ljavax/net/ssl/SSLSocketFactory;)LyN1;

    :goto_0
    return-void
.end method

.method public static n()Ljava/lang/String;
    .locals 1

    const-string v0, "braintree/android/3.17.2"

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;LHN1;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Path cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, LyN1;->f(LHN1;Ljava/lang/Exception;)V

    return-void

    :cond_0
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LyN1;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    iget-object v0, p0, LK10;->h:Lcom/braintreepayments/api/models/Authorization;

    instance-of v1, v0, Lcom/braintreepayments/api/models/ClientToken;

    if-nez v1, :cond_2

    instance-of v0, v0, Lcom/braintreepayments/api/models/PayPalUAT;

    if-eqz v0, :cond_3

    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    iget-object v0, p0, LK10;->h:Lcom/braintreepayments/api/models/Authorization;

    invoke-virtual {v0}, Lcom/braintreepayments/api/models/Authorization;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "authorizationFingerprint"

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    :cond_3
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1, p2}, LyN1;->a(Ljava/lang/String;LHN1;)V

    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-super {p0, p1}, LyN1;->b(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object p1

    iget-object v0, p0, LK10;->h:Lcom/braintreepayments/api/models/Authorization;

    instance-of v1, v0, Lcom/braintreepayments/api/models/TokenizationKey;

    if-eqz v1, :cond_0

    const-string v1, "Client-Key"

    invoke-virtual {v0}, Lcom/braintreepayments/api/models/Authorization;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public c(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    :try_start_0
    invoke-super {p0, p1}, LyN1;->c(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lcom/braintreepayments/api/exceptions/AuthorizationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/braintreepayments/api/exceptions/UnprocessableEntityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    instance-of v0, p1, Lcom/braintreepayments/api/exceptions/AuthorizationException;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/braintreepayments/api/exceptions/ErrorWithResponse;

    const/16 v1, 0x193

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/braintreepayments/api/exceptions/ErrorWithResponse;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0}, Lcom/braintreepayments/api/exceptions/ErrorWithResponse;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/braintreepayments/api/exceptions/AuthorizationException;

    invoke-direct {v0, p1}, Lcom/braintreepayments/api/exceptions/AuthorizationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/braintreepayments/api/exceptions/ErrorWithResponse;

    const/16 v1, 0x1a6

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/braintreepayments/api/exceptions/ErrorWithResponse;-><init>(ILjava/lang/String;)V

    throw v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LK10;->h:Lcom/braintreepayments/api/models/Authorization;

    instance-of v0, v0, Lcom/braintreepayments/api/models/ClientToken;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, LK10;->h:Lcom/braintreepayments/api/models/Authorization;

    check-cast p2, Lcom/braintreepayments/api/models/ClientToken;

    invoke-virtual {p2}, Lcom/braintreepayments/api/models/ClientToken;->h()Ljava/lang/String;

    move-result-object p2

    const-string v1, "authorizationFingerprint"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-super {p0, p1, p2}, LyN1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;LHN1;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LK10;->h:Lcom/braintreepayments/api/models/Authorization;

    instance-of v0, v0, Lcom/braintreepayments/api/models/ClientToken;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "authorizationFingerprint"

    iget-object v1, p0, LK10;->h:Lcom/braintreepayments/api/models/Authorization;

    check-cast v1, Lcom/braintreepayments/api/models/ClientToken;

    invoke-virtual {v1}, Lcom/braintreepayments/api/models/ClientToken;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-super {p0, p1, p2, p3}, LyN1;->e(Ljava/lang/String;Ljava/lang/String;LHN1;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p3, p1}, LyN1;->f(LHN1;Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
