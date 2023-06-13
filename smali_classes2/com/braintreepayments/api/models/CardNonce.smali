.class public Lcom/braintreepayments/api/models/CardNonce;
.super Lcom/braintreepayments/api/models/PaymentMethodNonce;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/braintreepayments/api/models/CardNonce;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Lcom/braintreepayments/api/models/ThreeDSecureInfo;

.field public i:Ljava/lang/String;

.field public j:Lcom/braintreepayments/api/models/BinData;

.field public k:Lcom/braintreepayments/api/models/AuthenticationInsight;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/braintreepayments/api/models/CardNonce$a;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/CardNonce$a;-><init>()V

    sput-object v0, Lcom/braintreepayments/api/models/CardNonce;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/braintreepayments/api/models/PaymentMethodNonce;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/models/PaymentMethodNonce;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->e:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->f:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->g:Ljava/lang/String;

    const-class v0, Lcom/braintreepayments/api/models/BinData;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/braintreepayments/api/models/BinData;

    iput-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->j:Lcom/braintreepayments/api/models/BinData;

    const-class v0, Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    iput-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->h:Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    const-class v0, Lcom/braintreepayments/api/models/AuthenticationInsight;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/braintreepayments/api/models/AuthenticationInsight;

    iput-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->k:Lcom/braintreepayments/api/models/AuthenticationInsight;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->l:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->m:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/CardNonce;->n:Ljava/lang/String;

    return-void
.end method

.method public static h(Ljava/lang/String;)Lcom/braintreepayments/api/models/CardNonce;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lcom/braintreepayments/api/models/CardNonce;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/CardNonce;-><init>()V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "data"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0, v1}, Lcom/braintreepayments/api/models/CardNonce;->g(Lorg/json/JSONObject;)V

    goto :goto_0

    :cond_0
    const-string p0, "creditCards"

    invoke-static {p0, v1}, Lcom/braintreepayments/api/models/PaymentMethodNonce;->b(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/braintreepayments/api/models/CardNonce;->a(Lorg/json/JSONObject;)V

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/braintreepayments/api/models/PaymentMethodNonce;->a(Lorg/json/JSONObject;)V

    const-string v0, "details"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "lastTwo"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->f:Ljava/lang/String;

    const-string v1, "lastFour"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->g:Ljava/lang/String;

    const-string v1, "cardType"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->e:Ljava/lang/String;

    const-string v1, "threeDSecureInfo"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/braintreepayments/api/models/ThreeDSecureInfo;->a(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->h:Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    const-string v1, "bin"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->i:Ljava/lang/String;

    const-string v1, "binData"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/braintreepayments/api/models/BinData;->b(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/BinData;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->j:Lcom/braintreepayments/api/models/BinData;

    const-string v1, "authenticationInsight"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Lcom/braintreepayments/api/models/AuthenticationInsight;->a(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/AuthenticationInsight;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/CardNonce;->k:Lcom/braintreepayments/api/models/AuthenticationInsight;

    const-string p1, "expirationMonth"

    invoke-static {v0, p1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/CardNonce;->l:Ljava/lang/String;

    const-string p1, "expirationYear"

    invoke-static {v0, p1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/CardNonce;->m:Ljava/lang/String;

    const-string p1, "cardholderName"

    invoke-static {v0, p1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/CardNonce;->n:Ljava/lang/String;

    return-void
.end method

.method public final g(Lorg/json/JSONObject;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "tokenizeCreditCard"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "creditCard"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "last4"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x4

    if-ge v1, v3, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->g:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->f:Ljava/lang/String;

    const-string v1, "brand"

    const-string v3, "Unknown"

    invoke-static {v0, v1, v3}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->e:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/braintreepayments/api/models/ThreeDSecureInfo;->a(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->h:Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    const-string v1, "bin"

    invoke-static {v0, v1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->i:Ljava/lang/String;

    const-string v1, "binData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/braintreepayments/api/models/BinData;->b(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/BinData;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->j:Lcom/braintreepayments/api/models/BinData;

    const-string v1, "token"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/PaymentMethodNonce;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/braintreepayments/api/models/CardNonce;->f:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ending in \u2022\u2022"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/braintreepayments/api/models/CardNonce;->f:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    iput-object v1, p0, Lcom/braintreepayments/api/models/PaymentMethodNonce;->c:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/braintreepayments/api/models/PaymentMethodNonce;->d:Z

    const-string v1, "authenticationInsight"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Lcom/braintreepayments/api/models/AuthenticationInsight;->a(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/AuthenticationInsight;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/CardNonce;->k:Lcom/braintreepayments/api/models/AuthenticationInsight;

    const-string p1, "expirationMonth"

    invoke-static {v0, p1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/CardNonce;->l:Ljava/lang/String;

    const-string p1, "expirationYear"

    invoke-static {v0, p1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/CardNonce;->m:Ljava/lang/String;

    const-string p1, "cardholderName"

    invoke-static {v0, p1, v2}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/CardNonce;->n:Ljava/lang/String;

    return-void

    :cond_2
    new-instance p1, Lorg/json/JSONException;

    const-string v0, "Failed to parse GraphQL response JSON"

    invoke-direct {p1, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i()Lcom/braintreepayments/api/models/ThreeDSecureInfo;
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->h:Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/braintreepayments/api/models/PaymentMethodNonce;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->j:Lcom/braintreepayments/api/models/BinData;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->h:Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/CardNonce;->k:Lcom/braintreepayments/api/models/AuthenticationInsight;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/CardNonce;->l:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/CardNonce;->m:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/CardNonce;->n:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
