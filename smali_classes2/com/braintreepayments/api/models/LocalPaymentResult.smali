.class public Lcom/braintreepayments/api/models/LocalPaymentResult;
.super Lcom/braintreepayments/api/models/PaymentMethodNonce;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/braintreepayments/api/models/LocalPaymentResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public e:Ljava/lang/String;

.field public f:Lcom/braintreepayments/api/models/PostalAddress;

.field public g:Lcom/braintreepayments/api/models/PostalAddress;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/braintreepayments/api/models/LocalPaymentResult$a;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/LocalPaymentResult$a;-><init>()V

    sput-object v0, Lcom/braintreepayments/api/models/LocalPaymentResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/braintreepayments/api/models/PaymentMethodNonce;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/models/PaymentMethodNonce;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->e:Ljava/lang/String;

    const-class v0, Lcom/braintreepayments/api/models/PostalAddress;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/braintreepayments/api/models/PostalAddress;

    iput-object v1, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->f:Lcom/braintreepayments/api/models/PostalAddress;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/braintreepayments/api/models/PostalAddress;

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->g:Lcom/braintreepayments/api/models/PostalAddress;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->h:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->i:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->k:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->j:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->l:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->m:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/braintreepayments/api/models/LocalPaymentResult$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/models/LocalPaymentResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static g(Ljava/lang/String;)Lcom/braintreepayments/api/models/LocalPaymentResult;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lcom/braintreepayments/api/models/LocalPaymentResult;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/LocalPaymentResult;-><init>()V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "paypalAccounts"

    invoke-static {p0, v1}, Lcom/braintreepayments/api/models/PaymentMethodNonce;->b(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/braintreepayments/api/models/LocalPaymentResult;->a(Lorg/json/JSONObject;)V

    return-object v0
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "accountAddress"

    const-string v1, ""

    invoke-super {p0, p1}, Lcom/braintreepayments/api/models/PaymentMethodNonce;->a(Lorg/json/JSONObject;)V

    const-string v2, "details"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "email"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->k:Ljava/lang/String;

    const-string v5, "correlationId"

    invoke-static {v2, v5, v4}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->e:Ljava/lang/String;

    const-string v5, "type"

    const-string v6, "PayPalAccount"

    invoke-static {p1, v5, v6}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->m:Ljava/lang/String;

    :try_start_0
    const-string p1, "payerInfo"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "billingAddress"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    const-string v2, "shippingAddress"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v0}, LIY3;->b(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->f:Lcom/braintreepayments/api/models/PostalAddress;

    invoke-static {v2}, LIY3;->b(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/PostalAddress;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->g:Lcom/braintreepayments/api/models/PostalAddress;

    const-string v0, "firstName"

    invoke-static {p1, v0, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->h:Ljava/lang/String;

    const-string v0, "lastName"

    invoke-static {p1, v0, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->i:Ljava/lang/String;

    const-string v0, "phone"

    invoke-static {p1, v0, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->j:Ljava/lang/String;

    const-string v0, "payerId"

    invoke-static {p1, v0, v1}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->l:Ljava/lang/String;

    iget-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->k:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-static {p1, v3, v4}, Lci2;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->k:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance p1, Lcom/braintreepayments/api/models/PostalAddress;

    invoke-direct {p1}, Lcom/braintreepayments/api/models/PostalAddress;-><init>()V

    iput-object p1, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->f:Lcom/braintreepayments/api/models/PostalAddress;

    new-instance p1, Lcom/braintreepayments/api/models/PostalAddress;

    invoke-direct {p1}, Lcom/braintreepayments/api/models/PostalAddress;-><init>()V

    iput-object p1, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->g:Lcom/braintreepayments/api/models/PostalAddress;

    :cond_1
    :goto_1
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/braintreepayments/api/models/PaymentMethodNonce;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->f:Lcom/braintreepayments/api/models/PostalAddress;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->g:Lcom/braintreepayments/api/models/PostalAddress;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->k:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->j:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->l:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/LocalPaymentResult;->m:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
