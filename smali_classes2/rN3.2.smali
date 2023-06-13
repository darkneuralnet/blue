.class public abstract LrN3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Z

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, LrN3;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LrN3;->b:Ljava/lang/String;

    invoke-virtual {p0}, LrN3;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LrN3;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, LrN3;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LrN3;->b:Ljava/lang/String;

    invoke-virtual {p0}, LrN3;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LrN3;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LrN3;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LrN3;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, LrN3;->d:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iput-boolean v1, p0, LrN3;->e:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LrN3;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 6

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v3, "_meta"

    new-instance v4, LHT2;

    invoke-direct {v4}, LHT2;-><init>()V

    iget-object v5, p0, LrN3;->f:Ljava/lang/String;

    invoke-virtual {v4, v5}, LHT2;->c(Ljava/lang/String;)LHT2;

    move-result-object v4

    iget-object v5, p0, LrN3;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, LHT2;->d(Ljava/lang/String;)LHT2;

    move-result-object v4

    iget-object v5, p0, LrN3;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, LHT2;->b(Ljava/lang/String;)LHT2;

    move-result-object v4

    invoke-virtual {v4}, LHT2;->a()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-boolean v3, p0, LrN3;->e:Z

    if-eqz v3, :cond_0

    const-string v3, "validate"

    iget-boolean v4, p0, LrN3;->d:Z

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v3, "options"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    invoke-virtual {p0, v0, v2}, LrN3;->b(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract b(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation
.end method

.method public c(Landroid/content/Context;Lcom/braintreepayments/api/models/Authorization;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/braintreepayments/api/exceptions/BraintreeException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v3, "clientSdkMetadata"

    new-instance v4, LHT2;

    invoke-direct {v4}, LHT2;-><init>()V

    iget-object v5, p0, LrN3;->f:Ljava/lang/String;

    invoke-virtual {v4, v5}, LHT2;->c(Ljava/lang/String;)LHT2;

    move-result-object v4

    iget-object v5, p0, LrN3;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, LHT2;->d(Ljava/lang/String;)LHT2;

    move-result-object v4

    iget-object v5, p0, LrN3;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, LHT2;->b(Ljava/lang/String;)LHT2;

    move-result-object v4

    invoke-virtual {v4}, LHT2;->a()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    iget-boolean v4, p0, LrN3;->e:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "validate"

    if-eqz v4, :cond_0

    :try_start_1
    iget-boolean p2, p0, LrN3;->d:Z

    invoke-virtual {v3, v5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    instance-of v4, p2, Lcom/braintreepayments/api/models/ClientToken;

    if-eqz v4, :cond_1

    const/4 p2, 0x1

    invoke-virtual {v3, v5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_1
    instance-of p2, p2, Lcom/braintreepayments/api/models/TokenizationKey;

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    invoke-virtual {v3, v5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :cond_2
    :goto_0
    const-string p2, "options"

    invoke-virtual {v1, p2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "input"

    invoke-virtual {v2, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p0, p1, v0, v2}, LrN3;->d(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    const-string p1, "variables"

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract d(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/braintreepayments/api/exceptions/BraintreeException;,
            Lorg/json/JSONException;
        }
    .end annotation
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public g()Ljava/lang/String;
    .locals 1

    const-string v0, "custom"

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "form"

    return-object v0
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public j(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iput-object p1, p0, LrN3;->f:Ljava/lang/String;

    return-object p0
.end method

.method public k(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iput-object p1, p0, LrN3;->c:Ljava/lang/String;

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, LrN3;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, LrN3;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, LrN3;->d:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, LrN3;->e:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, LrN3;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
