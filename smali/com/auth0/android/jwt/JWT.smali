.class public Lcom/auth0/android/jwt/JWT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/auth0/android/jwt/JWT;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Ljava/lang/String;

.field public c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lnh2;

.field public e:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/auth0/android/jwt/JWT$a;

    invoke-direct {v0}, Lcom/auth0/android/jwt/JWT$a;-><init>()V

    sput-object v0, Lcom/auth0/android/jwt/JWT;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lcom/auth0/android/jwt/JWT;->b(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/auth0/android/jwt/JWT;->b:Ljava/lang/String;

    return-void
.end method

.method public static d()LoE1;
    .locals 3

    new-instance v0, LpE1;

    invoke-direct {v0}, LpE1;-><init>()V

    new-instance v1, Lcom/auth0/android/jwt/JWTDeserializer;

    invoke-direct {v1}, Lcom/auth0/android/jwt/JWTDeserializer;-><init>()V

    const-class v2, Lnh2;

    invoke-virtual {v0, v2, v1}, LpE1;->f(Ljava/lang/reflect/Type;Ljava/lang/Object;)LpE1;

    move-result-object v0

    invoke-virtual {v0}, LpE1;->b()LoE1;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0xb

    :try_start_0
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    new-instance v0, Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/auth0/android/jwt/DecodeException;

    const-string v1, "Received bytes didn\'t correspond to a valid Base64 encoded string."

    invoke-direct {v0, v1, p1}, Lcom/auth0/android/jwt/DecodeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/auth0/android/jwt/JWT;->g(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/auth0/android/jwt/JWT$b;

    invoke-direct {v0, p0}, Lcom/auth0/android/jwt/JWT$b;-><init>(Lcom/auth0/android/jwt/JWT;)V

    invoke-virtual {v0}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {p0, v1}, Lcom/auth0/android/jwt/JWT;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/auth0/android/jwt/JWT;->e(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/auth0/android/jwt/JWT;->c:Ljava/util/Map;

    const/4 v0, 0x1

    aget-object v0, p1, v0

    invoke-virtual {p0, v0}, Lcom/auth0/android/jwt/JWT;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lnh2;

    invoke-virtual {p0, v0, v1}, Lcom/auth0/android/jwt/JWT;->e(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnh2;

    iput-object v0, p0, Lcom/auth0/android/jwt/JWT;->d:Lnh2;

    const/4 v0, 0x2

    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/auth0/android/jwt/JWT;->e:Ljava/lang/String;

    return-void
.end method

.method public c()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/auth0/android/jwt/JWT;->d:Lnh2;

    iget-object v0, v0, Lnh2;->c:Ljava/util/Date;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/auth0/android/jwt/JWT;->d()LoE1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LoE1;->o(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lcom/auth0/android/jwt/DecodeException;

    const-string v0, "The token\'s payload had an invalid JSON format."

    invoke-direct {p2, v0, p1}, Lcom/auth0/android/jwt/DecodeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final g(Ljava/lang/String;)[Ljava/lang/String;
    .locals 6

    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-ne v1, v5, :cond_0

    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-array p1, v2, [Ljava/lang/String;

    aget-object v1, v0, v3

    aput-object v1, p1, v3

    aget-object v0, v0, v4

    aput-object v0, p1, v4

    const-string v0, ""

    aput-object v0, p1, v5

    move-object v0, p1

    :cond_0
    array-length p1, v0

    if-ne p1, v2, :cond_1

    return-object v0

    :cond_1
    new-instance p1, Lcom/auth0/android/jwt/DecodeException;

    new-array v1, v4, [Ljava/lang/Object;

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v3

    const-string v0, "The token was expected to have 3 parts, but got %s."

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/auth0/android/jwt/DecodeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/auth0/android/jwt/JWT;->b:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lcom/auth0/android/jwt/JWT;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
