.class public Lcom/adyen/checkout/redirect/RedirectConfiguration;
.super Lcom/adyen/checkout/components/base/Configuration;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/adyen/checkout/redirect/RedirectConfiguration;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/adyen/checkout/redirect/RedirectConfiguration$a;

    invoke-direct {v0}, Lcom/adyen/checkout/redirect/RedirectConfiguration$a;-><init>()V

    sput-object v0, Lcom/adyen/checkout/redirect/RedirectConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/adyen/checkout/components/base/Configuration;-><init>(Landroid/os/Parcel;)V

    return-void
.end method
