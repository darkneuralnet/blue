.class public final Lcom/adyen/checkout/redirect/RedirectConfiguration$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/redirect/RedirectConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/adyen/checkout/redirect/RedirectConfiguration;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/adyen/checkout/redirect/RedirectConfiguration;
    .locals 1

    new-instance v0, Lcom/adyen/checkout/redirect/RedirectConfiguration;

    invoke-direct {v0, p1}, Lcom/adyen/checkout/redirect/RedirectConfiguration;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Lcom/adyen/checkout/redirect/RedirectConfiguration;
    .locals 0

    new-array p1, p1, [Lcom/adyen/checkout/redirect/RedirectConfiguration;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/redirect/RedirectConfiguration$a;->a(Landroid/os/Parcel;)Lcom/adyen/checkout/redirect/RedirectConfiguration;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/redirect/RedirectConfiguration$a;->b(I)[Lcom/adyen/checkout/redirect/RedirectConfiguration;

    move-result-object p1

    return-object p1
.end method
