.class public LIY3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "address2"

    invoke-static {p0, v2, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "address3"

    invoke-static {p0, v3, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "address4"

    invoke-static {p0, v3, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "address5"

    invoke-static {p0, v2, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 6

    if-nez p0, :cond_0

    new-instance p0, Lcom/braintreepayments/api/models/PostalAddress;

    invoke-direct {p0}, Lcom/braintreepayments/api/models/PostalAddress;-><init>()V

    return-object p0

    :cond_0
    const-string v0, "street1"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "street2"

    invoke-static {p0, v2, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "country"

    invoke-static {p0, v3, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v0, :cond_1

    const-string v0, "line1"

    invoke-static {p0, v0, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    if-nez v2, :cond_2

    const-string v2, "line2"

    invoke-static {p0, v2, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_2
    if-nez v3, :cond_3

    const-string v3, "countryCode"

    invoke-static {p0, v3, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_3
    if-nez v0, :cond_4

    const-string v4, "name"

    invoke-static {p0, v4, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {p0}, LIY3;->c(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance v4, Lcom/braintreepayments/api/models/PostalAddress;

    invoke-direct {v4}, Lcom/braintreepayments/api/models/PostalAddress;-><init>()V

    const-string v5, "recipientName"

    invoke-static {p0, v5, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/braintreepayments/api/models/PostalAddress;->n(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/braintreepayments/api/models/PostalAddress;->q(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/braintreepayments/api/models/PostalAddress;->b(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v0

    const-string v2, "city"

    invoke-static {p0, v2, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/braintreepayments/api/models/PostalAddress;->k(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v0

    const-string v2, "state"

    invoke-static {p0, v2, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/braintreepayments/api/models/PostalAddress;->o(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v0

    const-string v2, "postalCode"

    invoke-static {p0, v2, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/braintreepayments/api/models/PostalAddress;->m(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object p0

    invoke-virtual {p0, v3}, Lcom/braintreepayments/api/models/PostalAddress;->a(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 4

    new-instance v0, Lcom/braintreepayments/api/models/PostalAddress;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/PostalAddress;-><init>()V

    const-string v1, "name"

    const-string v2, ""

    invoke-static {p0, v1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/braintreepayments/api/models/PostalAddress;->n(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v1

    const-string v3, "phoneNumber"

    invoke-static {p0, v3, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/braintreepayments/api/models/PostalAddress;->l(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v1

    const-string v3, "address1"

    invoke-static {p0, v3, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/braintreepayments/api/models/PostalAddress;->q(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v1

    invoke-static {p0}, LIY3;->a(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/braintreepayments/api/models/PostalAddress;->b(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v1

    const-string v3, "locality"

    invoke-static {p0, v3, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/braintreepayments/api/models/PostalAddress;->k(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v1

    const-string v3, "administrativeArea"

    invoke-static {p0, v3, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/braintreepayments/api/models/PostalAddress;->o(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v1

    const-string v3, "countryCode"

    invoke-static {p0, v3, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/braintreepayments/api/models/PostalAddress;->a(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v1

    const-string v3, "postalCode"

    invoke-static {p0, v3, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/braintreepayments/api/models/PostalAddress;->m(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v1

    const-string v3, "sortingCode"

    invoke-static {p0, v3, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/braintreepayments/api/models/PostalAddress;->p(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;

    return-object v0
.end method
