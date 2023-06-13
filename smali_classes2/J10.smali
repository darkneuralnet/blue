.class public LJ10;
.super LD10;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "2018-03-06"

    invoke-direct {p0, p1, p2, v0}, LJ10;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LD10;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    new-instance p1, LmY5;

    invoke-static {}, LI10;->a()Ljava/io/InputStream;

    move-result-object p2

    invoke-direct {p1, p2}, LmY5;-><init>(Ljava/io/InputStream;)V

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


# virtual methods
.method public c(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-super {p0, p1}, LD10;->c(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "errors"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "extensions"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "An Unexpected Exception Occurred"

    const-string v5, "message"

    invoke-static {v2, v5, v4}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_2

    const-string v6, "legacyCode"

    const-string v7, ""

    invoke-static {v3, v6, v7}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "50000"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v2, "errorType"

    invoke-static {v3, v2, v7}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "user_error"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/braintreepayments/api/exceptions/UnexpectedException;

    invoke-direct {p1, v4}, Lcom/braintreepayments/api/exceptions/UnexpectedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/braintreepayments/api/exceptions/AuthorizationException;

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/braintreepayments/api/exceptions/AuthorizationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/braintreepayments/api/exceptions/UnexpectedException;

    invoke-direct {p1, v4}, Lcom/braintreepayments/api/exceptions/UnexpectedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lcom/braintreepayments/api/exceptions/ErrorWithResponse;->a(Ljava/lang/String;)Lcom/braintreepayments/api/exceptions/ErrorWithResponse;

    move-result-object p1

    throw p1

    :cond_4
    return-object p1
.end method

.method public n(Ljava/lang/String;LHN1;)V
    .locals 1

    const-string v0, ""

    invoke-super {p0, v0, p1, p2}, LyN1;->e(Ljava/lang/String;Ljava/lang/String;LHN1;)V

    return-void
.end method
