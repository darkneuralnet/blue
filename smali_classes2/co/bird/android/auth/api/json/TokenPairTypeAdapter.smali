.class public final Lco/bird/android/auth/api/json/TokenPairTypeAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llj2;
.implements Lvi2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llj2<",
        "Lco/bird/android/model/TokenPair;",
        ">;",
        "Lvi2<",
        "Lco/bird/android/model/TokenPair;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J \u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u000cH\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "Lco/bird/android/auth/api/json/TokenPairTypeAdapter;",
        "Llj2;",
        "Lco/bird/android/model/TokenPair;",
        "Lvi2;",
        "src",
        "Ljava/lang/reflect/Type;",
        "type",
        "Lkj2;",
        "context",
        "Lyi2;",
        "b",
        "json",
        "Lui2;",
        "a",
        "<init>",
        "()V",
        "auth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lco/bird/android/model/TokenPair;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonParseException;
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lyi2;->e()LTi2;

    move-result-object p1

    new-instance p2, Lco/bird/android/model/TokenPair;

    new-instance p3, Lcom/auth0/android/jwt/JWT;

    const-string v0, "access"

    invoke-virtual {p1, v0}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object v0

    invoke-virtual {v0}, Lyi2;->j()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Lcom/auth0/android/jwt/JWT;-><init>(Ljava/lang/String;)V

    new-instance v0, Lcom/auth0/android/jwt/JWT;

    const-string v1, "refresh"

    invoke-virtual {p1, v1}, LTi2;->y(Ljava/lang/String;)Lyi2;

    move-result-object p1

    invoke-virtual {p1}, Lyi2;->j()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/auth0/android/jwt/JWT;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, p3, v0}, Lco/bird/android/model/TokenPair;-><init>(Lcom/auth0/android/jwt/JWT;Lcom/auth0/android/jwt/JWT;)V

    return-object p2
.end method

.method public b(Lco/bird/android/model/TokenPair;Ljava/lang/reflect/Type;Lkj2;)Lyi2;
    .locals 1

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LTi2;

    invoke-direct {p2}, LTi2;-><init>()V

    invoke-virtual {p1}, Lco/bird/android/model/TokenPair;->getAccessJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object p3

    invoke-virtual {p3}, Lcom/auth0/android/jwt/JWT;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "access"

    invoke-virtual {p2, v0, p3}, LTi2;->x(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/TokenPair;->getRefreshJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object p1

    invoke-virtual {p1}, Lcom/auth0/android/jwt/JWT;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "refresh"

    invoke-virtual {p2, p3, p1}, LTi2;->x(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public bridge synthetic deserialize(Lyi2;Ljava/lang/reflect/Type;Lui2;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/auth/api/json/TokenPairTypeAdapter;->a(Lyi2;Ljava/lang/reflect/Type;Lui2;)Lco/bird/android/model/TokenPair;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lkj2;)Lyi2;
    .locals 0

    check-cast p1, Lco/bird/android/model/TokenPair;

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/auth/api/json/TokenPairTypeAdapter;->b(Lco/bird/android/model/TokenPair;Ljava/lang/reflect/Type;Lkj2;)Lyi2;

    move-result-object p1

    return-object p1
.end method
