.class Lcom/auth0/android/jwt/JWTDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvi2<",
        "Lnh2;",
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
.method public a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lnh2;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonParseException;
        }
    .end annotation

    invoke-virtual {p1}, Lyi2;->s()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lyi2;->u()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    const-string p2, "iss"

    invoke-virtual {p0, p1, p2}, Lcom/auth0/android/jwt/JWTDeserializer;->c(LTi2;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p2, "sub"

    invoke-virtual {p0, p1, p2}, Lcom/auth0/android/jwt/JWTDeserializer;->c(LTi2;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string p2, "exp"

    invoke-virtual {p0, p1, p2}, Lcom/auth0/android/jwt/JWTDeserializer;->b(LTi2;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    const-string p2, "nbf"

    invoke-virtual {p0, p1, p2}, Lcom/auth0/android/jwt/JWTDeserializer;->b(LTi2;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    const-string p2, "iat"

    invoke-virtual {p0, p1, p2}, Lcom/auth0/android/jwt/JWTDeserializer;->b(LTi2;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    const-string p2, "jti"

    invoke-virtual {p0, p1, p2}, Lcom/auth0/android/jwt/JWTDeserializer;->c(LTi2;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string p2, "aud"

    invoke-virtual {p0, p1, p2}, Lcom/auth0/android/jwt/JWTDeserializer;->d(LTi2;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, LTi2;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    new-instance v0, LIj0;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lyi2;

    invoke-direct {v0, p2}, LIj0;-><init>(Lyi2;)V

    invoke-interface {v8, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Lnh2;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lnh2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    return-object p1

    :cond_1
    new-instance p1, Lcom/auth0/android/jwt/DecodeException;

    const-string p2, "The token\'s payload had an invalid JSON format."

    invoke-direct {p1, p2}, Lcom/auth0/android/jwt/DecodeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(LTi2;Ljava/lang/String;)Ljava/util/Date;
    .locals 2

    invoke-virtual {p1, p2}, LTi2;->z(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1, p2}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->h()J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    mul-long/2addr p1, v0

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method public final c(LTi2;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1, p2}, LTi2;->z(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1, p2}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->j()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(LTi2;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTi2;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, p2}, LTi2;->z(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, p2}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->o()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lyi2;->c()Lfi2;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lfi2;->size()I

    move-result p2

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Lfi2;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    invoke-virtual {p1, p2}, Lfi2;->y(I)Lyi2;

    move-result-object v1

    invoke-virtual {v1}, Lyi2;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lyi2;->j()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic deserialize(Lyi2;Ljava/lang/reflect/Type;Lui2;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonParseException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lcom/auth0/android/jwt/JWTDeserializer;->a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lnh2;

    move-result-object p1

    return-object p1
.end method
