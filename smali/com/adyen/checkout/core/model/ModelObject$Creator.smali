.class public Lcom/adyen/checkout/core/model/ModelObject$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/core/model/ModelObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/adyen/checkout/core/model/ModelObject;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final mClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/adyen/checkout/core/model/ModelObject$Creator;->mClass:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    invoke-static {p1}, Lcom/adyen/checkout/core/model/JsonUtils;->readFromParcel(Landroid/os/Parcel;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/adyen/checkout/core/model/ModelObject$Creator;->mClass:Ljava/lang/Class;

    invoke-static {p1, v0}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeModel(Lorg/json/JSONObject;Ljava/lang/Class;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_1
    new-instance p1, Lcom/adyen/checkout/core/exception/CheckoutException;

    const-string v0, "Failed to create ModelObject from parcel. JSONObject is null."

    invoke-direct {p1, v0}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/adyen/checkout/core/exception/CheckoutException;

    const-string v1, "Failed to create ModelObject from parcel."

    invoke-direct {v0, v1, p1}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/adyen/checkout/core/model/ModelObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/core/model/ModelObject$Creator;->mClass:Ljava/lang/Class;

    invoke-static {v0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/adyen/checkout/core/model/ModelObject;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;->newArray(I)[Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object p1

    return-object p1
.end method
