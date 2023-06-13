.class public final Lcom/adyen/checkout/core/api/Environment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/adyen/checkout/core/api/Environment;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/adyen/checkout/core/api/Environment;

.field public static final d:Lcom/adyen/checkout/core/api/Environment;

.field public static final e:Lcom/adyen/checkout/core/api/Environment;

.field public static final f:Lcom/adyen/checkout/core/api/Environment;


# instance fields
.field public final b:Ljava/net/URL;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/adyen/checkout/core/api/Environment$a;

    invoke-direct {v0}, Lcom/adyen/checkout/core/api/Environment$a;-><init>()V

    sput-object v0, Lcom/adyen/checkout/core/api/Environment;->CREATOR:Landroid/os/Parcelable$Creator;

    :try_start_0
    new-instance v0, Lcom/adyen/checkout/core/api/Environment;

    new-instance v1, Ljava/net/URL;

    const-string v2, "https://checkoutshopper-test.adyen.com/checkoutshopper/"

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/api/Environment;-><init>(Ljava/net/URL;)V

    sput-object v0, Lcom/adyen/checkout/core/api/Environment;->c:Lcom/adyen/checkout/core/api/Environment;

    new-instance v0, Lcom/adyen/checkout/core/api/Environment;

    new-instance v1, Ljava/net/URL;

    const-string v2, "https://checkoutshopper-live.adyen.com/checkoutshopper/"

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/api/Environment;-><init>(Ljava/net/URL;)V

    sput-object v0, Lcom/adyen/checkout/core/api/Environment;->d:Lcom/adyen/checkout/core/api/Environment;

    new-instance v0, Lcom/adyen/checkout/core/api/Environment;

    new-instance v1, Ljava/net/URL;

    const-string v2, "https://checkoutshopper-live-us.adyen.com/checkoutshopper/"

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/api/Environment;-><init>(Ljava/net/URL;)V

    sput-object v0, Lcom/adyen/checkout/core/api/Environment;->e:Lcom/adyen/checkout/core/api/Environment;

    new-instance v0, Lcom/adyen/checkout/core/api/Environment;

    new-instance v1, Ljava/net/URL;

    const-string v2, "https://checkoutshopper-live-au.adyen.com/checkoutshopper/"

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/api/Environment;-><init>(Ljava/net/URL;)V

    sput-object v0, Lcom/adyen/checkout/core/api/Environment;->f:Lcom/adyen/checkout/core/api/Environment;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/adyen/checkout/core/exception/CheckoutException;

    const-string v2, "Failed to parse Environment URL."

    invoke-direct {v1, v2, v0}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/net/URL;

    iput-object p1, p0, Lcom/adyen/checkout/core/api/Environment;->b:Ljava/net/URL;

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/adyen/checkout/core/api/Environment;->b:Ljava/net/URL;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/core/api/Environment;->b:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lcom/adyen/checkout/core/api/Environment;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/adyen/checkout/core/api/Environment;

    iget-object v0, p0, Lcom/adyen/checkout/core/api/Environment;->b:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/adyen/checkout/core/api/Environment;->b:Ljava/net/URL;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lcom/adyen/checkout/core/api/Environment;->b:Ljava/net/URL;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
