.class public final Lcom/auth0/android/jwt/JWT$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/auth0/android/jwt/JWT;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/auth0/android/jwt/JWT;",
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
.method public a(Landroid/os/Parcel;)Lcom/auth0/android/jwt/JWT;
    .locals 1

    new-instance v0, Lcom/auth0/android/jwt/JWT;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/auth0/android/jwt/JWT;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public b(I)[Lcom/auth0/android/jwt/JWT;
    .locals 0

    new-array p1, p1, [Lcom/auth0/android/jwt/JWT;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/auth0/android/jwt/JWT$a;->a(Landroid/os/Parcel;)Lcom/auth0/android/jwt/JWT;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/auth0/android/jwt/JWT$a;->b(I)[Lcom/auth0/android/jwt/JWT;

    move-result-object p1

    return-object p1
.end method
