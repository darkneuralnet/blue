.class public Lcom/braintreepayments/api/models/PayPalCreditFinancing;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/braintreepayments/api/models/PayPalCreditFinancing;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Z

.field public c:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

.field public d:Z

.field public e:I

.field public f:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

.field public g:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/braintreepayments/api/models/PayPalCreditFinancing$a;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/PayPalCreditFinancing$a;-><init>()V

    sput-object v0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->b:Z

    const-class v0, Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    iput-object v3, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->c:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iput-boolean v1, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->d:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->e:I

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    iput-object v1, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->f:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    iput-object p1, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->g:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/braintreepayments/api/models/PayPalCreditFinancing$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/models/PayPalCreditFinancing;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/PayPalCreditFinancing;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/PayPalCreditFinancing;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "cardAmountImmutable"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->b:Z

    const-string v1, "monthlyPayment"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;->a(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    move-result-object v1

    iput-object v1, v0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->c:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    const-string v1, "payerAcceptance"

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->d:Z

    const-string v1, "term"

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, v0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->e:I

    const-string v1, "totalCost"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;->a(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    move-result-object v1

    iput-object v1, v0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->f:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    const-string v1, "totalInterest"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;->a(Lorg/json/JSONObject;)Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    move-result-object p0

    iput-object p0, v0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->g:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-boolean v0, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->b:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->c:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean v0, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->d:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget v0, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->f:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/PayPalCreditFinancing;->g:Lcom/braintreepayments/api/models/PayPalCreditFinancingAmount;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
