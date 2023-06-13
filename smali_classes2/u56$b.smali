.class public final Lu56$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHN1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu56;->d(LG10;Lcom/braintreepayments/api/models/CardBuilder;LLN3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:LLN3;

.field public final synthetic b:Lcom/braintreepayments/api/models/CardBuilder;

.field public final synthetic c:LG10;


# direct methods
.method public constructor <init>(LLN3;Lcom/braintreepayments/api/models/CardBuilder;LG10;)V
    .locals 0

    iput-object p1, p0, Lu56$b;->a:LLN3;

    iput-object p2, p0, Lu56$b;->b:Lcom/braintreepayments/api/models/CardBuilder;

    iput-object p3, p0, Lu56$b;->c:LG10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lu56$b;->c:LG10;

    const-string v1, "card.graphql.tokenization.failure"

    invoke-virtual {v0, v1}, LG10;->Ea(Ljava/lang/String;)V

    iget-object v0, p0, Lu56$b;->a:LLN3;

    invoke-interface {v0, p1}, LLN3;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public success(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu56$b;->a:LLN3;

    iget-object v1, p0, Lu56$b;->b:Lcom/braintreepayments/api/models/CardBuilder;

    invoke-virtual {v1}, Lcom/braintreepayments/api/models/BaseCardBuilder;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/braintreepayments/api/models/PaymentMethodNonce;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/braintreepayments/api/models/PaymentMethodNonce;

    move-result-object p1

    invoke-interface {v0, p1}, LLN3;->b(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    iget-object p1, p0, Lu56$b;->c:LG10;

    const-string v0, "card.graphql.tokenization.success"

    invoke-virtual {p1, v0}, LG10;->Ea(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lu56$b;->a:LLN3;

    invoke-interface {v0, p1}, LLN3;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
