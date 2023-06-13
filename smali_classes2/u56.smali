.class public Lu56;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LG10;Lcom/braintreepayments/api/models/CardBuilder;LLN3;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu56;->d(LG10;Lcom/braintreepayments/api/models/CardBuilder;LLN3;)V

    return-void
.end method

.method public static synthetic b(LG10;LrN3;LLN3;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu56;->e(LG10;LrN3;LLN3;)V

    return-void
.end method

.method public static c(LG10;LrN3;LLN3;)V
    .locals 1

    invoke-virtual {p0}, LG10;->la()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LrN3;->j(Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lu56$a;

    invoke-direct {v0, p1, p0, p2}, Lu56$a;-><init>(LrN3;LG10;LLN3;)V

    invoke-virtual {p0, v0}, LG10;->Ja(LCx0;)V

    return-void
.end method

.method public static d(LG10;Lcom/braintreepayments/api/models/CardBuilder;LLN3;)V
    .locals 3

    const-string v0, "card.graphql.tokenization.started"

    invoke-virtual {p0, v0}, LG10;->Ea(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, LG10;->T9()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, LG10;->da()Lcom/braintreepayments/api/models/Authorization;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LrN3;->c(Landroid/content/Context;Lcom/braintreepayments/api/models/Authorization;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lcom/braintreepayments/api/exceptions/BraintreeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, LG10;->fa()LJ10;

    move-result-object v1

    new-instance v2, Lu56$b;

    invoke-direct {v2, p2, p1, p0}, Lu56$b;-><init>(LLN3;Lcom/braintreepayments/api/models/CardBuilder;LG10;)V

    invoke-virtual {v1, v0, v2}, LJ10;->n(Ljava/lang/String;LHN1;)V

    return-void

    :catch_0
    move-exception p0

    invoke-interface {p2, p0}, LLN3;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public static e(LG10;LrN3;LLN3;)V
    .locals 3

    invoke-virtual {p0}, LG10;->ha()LK10;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "payment_methods/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LrN3;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu56;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LrN3;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lu56$c;

    invoke-direct {v2, p2, p1}, Lu56$c;-><init>(LLN3;LrN3;)V

    invoke-virtual {p0, v0, v1, v2}, LK10;->e(Ljava/lang/String;Ljava/lang/String;LHN1;)V

    return-void
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/v1/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
