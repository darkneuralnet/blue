.class public Lcom/braintreepayments/api/models/ThreeDSecureRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/braintreepayments/api/models/ThreeDSecureRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lcom/braintreepayments/api/models/ThreeDSecurePostalAddress;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Lcom/braintreepayments/api/models/ThreeDSecureAdditionalInformation;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Lcom/cardinalcommerce/shared/userinterfaces/UiCustomization;

.field public o:Lcom/braintreepayments/api/models/ThreeDSecureV1UiCustomization;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/braintreepayments/api/models/ThreeDSecureRequest$a;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/ThreeDSecureRequest$a;-><init>()V

    sput-object v0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "1"

    iput-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->h:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->k:Z

    iput-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->l:Z

    iput-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->m:Z

    new-instance v0, Lcom/cardinalcommerce/shared/userinterfaces/UiCustomization;

    invoke-direct {v0}, Lcom/cardinalcommerce/shared/userinterfaces/UiCustomization;-><init>()V

    iput-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->n:Lcom/cardinalcommerce/shared/userinterfaces/UiCustomization;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "1"

    iput-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->h:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->k:Z

    iput-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->l:Z

    iput-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->m:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->d:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->e:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->f:Ljava/lang/String;

    const-class v1, Lcom/braintreepayments/api/models/ThreeDSecurePostalAddress;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/braintreepayments/api/models/ThreeDSecurePostalAddress;

    iput-object v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->g:Lcom/braintreepayments/api/models/ThreeDSecurePostalAddress;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->h:Ljava/lang/String;

    const-class v1, Lcom/braintreepayments/api/models/ThreeDSecureAdditionalInformation;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/braintreepayments/api/models/ThreeDSecureAdditionalInformation;

    iput-object v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->j:Lcom/braintreepayments/api/models/ThreeDSecureAdditionalInformation;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    const/4 v2, 0x1

    if-lez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iput-boolean v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->k:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-lez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    iput-boolean v1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->l:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-lez v1, :cond_2

    move v0, v2

    :cond_2
    iput-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->m:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/cardinalcommerce/shared/userinterfaces/UiCustomization;

    iput-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->n:Lcom/cardinalcommerce/shared/userinterfaces/UiCustomization;

    const-class v0, Lcom/braintreepayments/api/models/ThreeDSecureV1UiCustomization;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/braintreepayments/api/models/ThreeDSecureV1UiCustomization;

    iput-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->o:Lcom/braintreepayments/api/models/ThreeDSecureV1UiCustomization;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->g:Lcom/braintreepayments/api/models/ThreeDSecurePostalAddress;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->j:Lcom/braintreepayments/api/models/ThreeDSecureAdditionalInformation;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->k:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->l:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->m:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->n:Lcom/cardinalcommerce/shared/userinterfaces/UiCustomization;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->o:Lcom/braintreepayments/api/models/ThreeDSecureV1UiCustomization;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/ThreeDSecureRequest;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
