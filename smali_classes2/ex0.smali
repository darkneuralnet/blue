.class public Lex0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:LC10;

.field public i:Laa;

.field public j:LDf0;

.field public k:Z

.field public l:LlL3;

.field public m:LzD1;

.field public n:Z

.field public o:Lzo6;

.field public p:LCl2;

.field public q:LOd6;

.field public r:LAu6;

.field public s:LTD1;

.field public t:Lci5;

.field public u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lex0;->d:Ljava/util/Set;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lex0;->b:Ljava/lang/String;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "assetsUrl"

    const-string v1, ""

    invoke-static {v0, p1, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lex0;->a:Ljava/lang/String;

    const-string p1, "clientApiUrl"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lex0;->c:Ljava/lang/String;

    const-string p1, "challenges"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {p0, p1}, Lex0;->g(Lorg/json/JSONArray;)V

    const-string p1, "environment"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lex0;->e:Ljava/lang/String;

    const-string p1, "merchantId"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lex0;->f:Ljava/lang/String;

    const-string p1, "merchantAccountId"

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lex0;->g:Ljava/lang/String;

    const-string p1, "analytics"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Laa;->a(Lorg/json/JSONObject;)Laa;

    move-result-object p1

    iput-object p1, p0, Lex0;->i:Laa;

    const-string p1, "braintreeApi"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, LC10;->a(Lorg/json/JSONObject;)LC10;

    move-result-object p1

    iput-object p1, p0, Lex0;->h:LC10;

    const-string p1, "creditCards"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, LDf0;->a(Lorg/json/JSONObject;)LDf0;

    move-result-object p1

    iput-object p1, p0, Lex0;->j:LDf0;

    const-string p1, "paypalEnabled"

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lex0;->k:Z

    const-string p1, "paypal"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, LlL3;->a(Lorg/json/JSONObject;)LlL3;

    move-result-object p1

    iput-object p1, p0, Lex0;->l:LlL3;

    const-string p1, "androidPay"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, LzD1;->a(Lorg/json/JSONObject;)LzD1;

    move-result-object p1

    iput-object p1, p0, Lex0;->m:LzD1;

    const-string p1, "threeDSecureEnabled"

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lex0;->n:Z

    const-string p1, "payWithVenmo"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Lzo6;->a(Lorg/json/JSONObject;)Lzo6;

    move-result-object p1

    iput-object p1, p0, Lex0;->o:Lzo6;

    const-string p1, "kount"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, LCl2;->a(Lorg/json/JSONObject;)LCl2;

    move-result-object p1

    iput-object p1, p0, Lex0;->p:LCl2;

    const-string p1, "unionPay"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, LOd6;->a(Lorg/json/JSONObject;)LOd6;

    move-result-object p1

    iput-object p1, p0, Lex0;->q:LOd6;

    const-string p1, "visaCheckout"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, LAu6;->a(Lorg/json/JSONObject;)LAu6;

    move-result-object p1

    iput-object p1, p0, Lex0;->r:LAu6;

    const-string p1, "graphQL"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, LTD1;->a(Lorg/json/JSONObject;)LTD1;

    move-result-object p1

    iput-object p1, p0, Lex0;->s:LTD1;

    const-string p1, "samsungPay"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Lci5;->a(Lorg/json/JSONObject;)Lci5;

    move-result-object p1

    iput-object p1, p0, Lex0;->t:Lci5;

    const-string p1, "cardinalAuthenticationJWT"

    invoke-static {v0, p1, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lex0;->u:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Lorg/json/JSONException;

    const-string v0, "Configuration cannot be null"

    invoke-direct {p1, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Ljava/lang/String;)Lex0;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lex0;

    invoke-direct {v0, p0}, Lex0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b()Laa;
    .locals 1

    iget-object v0, p0, Lex0;->i:Laa;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lex0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()LTD1;
    .locals 1

    iget-object v0, p0, Lex0;->s:LTD1;

    return-object v0
.end method

.method public e()LlL3;
    .locals 1

    iget-object v0, p0, Lex0;->l:LlL3;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lex0;->k:Z

    return v0
.end method

.method public final g(Lorg/json/JSONArray;)V
    .locals 3

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lex0;->d:Ljava/util/Set;

    const-string v2, ""

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lex0;->b:Ljava/lang/String;

    return-object v0
.end method
