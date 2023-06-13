.class public Lcom/braintreepayments/api/models/PostalAddress;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/braintreepayments/api/models/PostalAddress;",
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

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/braintreepayments/api/models/PostalAddress$a;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/PostalAddress$a;-><init>()V

    sput-object v0, Lcom/braintreepayments/api/models/PostalAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->d:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->e:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->f:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->g:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->h:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->j:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->i:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/braintreepayments/api/models/PostalAddress$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/models/PostalAddress;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 0

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->j:Ljava/lang/String;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 0

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->e:Ljava/lang/String;

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->j:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->e:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->h:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->b:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->g:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/braintreepayments/api/models/PostalAddress;->d:Ljava/lang/String;

    return-object v0
.end method

.method public k(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 0

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->f:Ljava/lang/String;

    return-object p0
.end method

.method public l(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 0

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->c:Ljava/lang/String;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 0

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->h:Ljava/lang/String;

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 0

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->b:Ljava/lang/String;

    return-object p0
.end method

.method public o(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 0

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->g:Ljava/lang/String;

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 0

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->i:Ljava/lang/String;

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lcom/braintreepayments/api/models/PostalAddress;
    .locals 0

    iput-object p1, p0, Lcom/braintreepayments/api/models/PostalAddress;->d:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/braintreepayments/api/models/PostalAddress;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/braintreepayments/api/models/PostalAddress;->d:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/braintreepayments/api/models/PostalAddress;->e:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/braintreepayments/api/models/PostalAddress;->f:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/braintreepayments/api/models/PostalAddress;->g:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/braintreepayments/api/models/PostalAddress;->h:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/braintreepayments/api/models/PostalAddress;->j:Ljava/lang/String;

    aput-object v2, v0, v1

    const-string v1, "%s\n%s\n%s\n%s, %s\n%s %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lcom/braintreepayments/api/models/PostalAddress;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/PostalAddress;->e:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/PostalAddress;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/PostalAddress;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/PostalAddress;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/PostalAddress;->j:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/PostalAddress;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/PostalAddress;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/braintreepayments/api/models/PostalAddress;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
