.class public final Lcom/paypal/android/sdk/onetouch/core/Result;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/paypal/android/sdk/onetouch/core/Result;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ljava/lang/String; = "Result"


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:LiN4;

.field public final d:LLM4;

.field public final e:Lorg/json/JSONObject;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/Throwable;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/paypal/android/sdk/onetouch/core/Result$a;

    invoke-direct {v0}, Lcom/paypal/android/sdk/onetouch/core/Result$a;-><init>()V

    sput-object v0, Lcom/paypal/android/sdk/onetouch/core/Result;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    sget-object v1, LiN4;->b:LiN4;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(LiN4;Ljava/lang/String;LLM4;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, LiN4;

    iput-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->c:LiN4;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, LLM4;

    iput-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->d:LLM4;

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v2

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lcom/paypal/android/sdk/onetouch/core/Result;->h:Ljava/lang/String;

    const-string v3, "Failed to read parceled JSON for mResponse"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    iput-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->e:Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->f:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    iput-object p1, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->g:Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/paypal/android/sdk/onetouch/core/Result$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(LiN4;Ljava/lang/String;LLM4;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->c:LiN4;

    iput-object p3, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->d:LLM4;

    iput-object p4, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->e:Lorg/json/JSONObject;

    iput-object p5, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->f:Ljava/lang/String;

    iput-object p6, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->g:Ljava/lang/Throwable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LLM4;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 7

    sget-object v1, LiN4;->d:LiN4;

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(LiN4;Ljava/lang/String;LLM4;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 7

    sget-object v1, LiN4;->c:LiN4;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/paypal/android/sdk/onetouch/core/Result;-><init>(LiN4;Ljava/lang/String;LLM4;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->g:Ljava/lang/Throwable;

    return-object v0
.end method

.method public b()Lorg/json/JSONObject;
    .locals 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "environment"

    iget-object v2, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "client"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->e:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    const-string v2, "response"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    iget-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->d:LLM4;

    if-eqz v0, :cond_1

    const-string v2, "response_type"

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->f:Ljava/lang/String;

    if-eqz v0, :cond_2

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "display_string"

    iget-object v3, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "user"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-object v1

    :catch_0
    move-exception v0

    sget-object v1, Lcom/paypal/android/sdk/onetouch/core/Result;->h:Ljava/lang/String;

    const-string v2, "Error encoding JSON"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()LiN4;
    .locals 1

    iget-object v0, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->c:LiN4;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->c:LiN4;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->d:LLM4;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->e:Lorg/json/JSONObject;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/paypal/android/sdk/onetouch/core/Result;->g:Ljava/lang/Throwable;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
