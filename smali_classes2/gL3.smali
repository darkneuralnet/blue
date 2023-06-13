.class public LgL3;
.super LrN3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LrN3<",
        "LgL3;",
        ">;"
    }
.end annotation


# instance fields
.field public g:Ljava/lang/String;

.field public h:Lorg/json/JSONObject;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LrN3;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, LgL3;->h:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "correlationId"

    iget-object v1, p0, LgL3;->g:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "intent"

    iget-object v1, p0, LgL3;->i:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, LgL3;->h:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LgL3;->h:Lorg/json/JSONObject;

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LgL3;->j:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "merchant_account_id"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    const-string v0, "paypalAccount"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public d(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 0

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "paypal_accounts"

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, "PayPalAccount"

    return-object v0
.end method

.method public l(Ljava/lang/String;)LgL3;
    .locals 0

    iput-object p1, p0, LgL3;->g:Ljava/lang/String;

    return-object p0
.end method

.method public m(Ljava/lang/String;)LgL3;
    .locals 0

    iput-object p1, p0, LgL3;->i:Ljava/lang/String;

    return-object p0
.end method

.method public n(Ljava/lang/String;)LgL3;
    .locals 0

    iput-object p1, p0, LgL3;->j:Ljava/lang/String;

    return-object p0
.end method

.method public o(Lorg/json/JSONObject;)LgL3;
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, LgL3;->h:Lorg/json/JSONObject;

    :cond_0
    return-object p0
.end method
