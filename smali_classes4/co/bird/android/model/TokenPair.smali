.class public final Lco/bird/android/model/TokenPair;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/model/TokenPair;",
        "",
        "accessJwt",
        "Lcom/auth0/android/jwt/JWT;",
        "refreshJwt",
        "(Lcom/auth0/android/jwt/JWT;Lcom/auth0/android/jwt/JWT;)V",
        "getAccessJwt",
        "()Lcom/auth0/android/jwt/JWT;",
        "getRefreshJwt",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final accessJwt:Lcom/auth0/android/jwt/JWT;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "access"
    .end annotation

    .annotation runtime Lft5;
        value = "access"
    .end annotation
.end field

.field private final refreshJwt:Lcom/auth0/android/jwt/JWT;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "refresh"
    .end annotation

    .annotation runtime Lft5;
        value = "refresh"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/auth0/android/jwt/JWT;Lcom/auth0/android/jwt/JWT;)V
    .locals 1

    const-string v0, "accessJwt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshJwt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/TokenPair;->accessJwt:Lcom/auth0/android/jwt/JWT;

    iput-object p2, p0, Lco/bird/android/model/TokenPair;->refreshJwt:Lcom/auth0/android/jwt/JWT;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/TokenPair;Lcom/auth0/android/jwt/JWT;Lcom/auth0/android/jwt/JWT;ILjava/lang/Object;)Lco/bird/android/model/TokenPair;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/model/TokenPair;->accessJwt:Lcom/auth0/android/jwt/JWT;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/model/TokenPair;->refreshJwt:Lcom/auth0/android/jwt/JWT;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/TokenPair;->copy(Lcom/auth0/android/jwt/JWT;Lcom/auth0/android/jwt/JWT;)Lco/bird/android/model/TokenPair;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/auth0/android/jwt/JWT;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TokenPair;->accessJwt:Lcom/auth0/android/jwt/JWT;

    return-object v0
.end method

.method public final component2()Lcom/auth0/android/jwt/JWT;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TokenPair;->refreshJwt:Lcom/auth0/android/jwt/JWT;

    return-object v0
.end method

.method public final copy(Lcom/auth0/android/jwt/JWT;Lcom/auth0/android/jwt/JWT;)Lco/bird/android/model/TokenPair;
    .locals 1

    const-string v0, "accessJwt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshJwt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/TokenPair;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/TokenPair;-><init>(Lcom/auth0/android/jwt/JWT;Lcom/auth0/android/jwt/JWT;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/TokenPair;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/TokenPair;

    iget-object v1, p0, Lco/bird/android/model/TokenPair;->accessJwt:Lcom/auth0/android/jwt/JWT;

    iget-object v3, p1, Lco/bird/android/model/TokenPair;->accessJwt:Lcom/auth0/android/jwt/JWT;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/TokenPair;->refreshJwt:Lcom/auth0/android/jwt/JWT;

    iget-object p1, p1, Lco/bird/android/model/TokenPair;->refreshJwt:Lcom/auth0/android/jwt/JWT;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getAccessJwt()Lcom/auth0/android/jwt/JWT;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TokenPair;->accessJwt:Lcom/auth0/android/jwt/JWT;

    return-object v0
.end method

.method public final getRefreshJwt()Lcom/auth0/android/jwt/JWT;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/TokenPair;->refreshJwt:Lcom/auth0/android/jwt/JWT;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/TokenPair;->accessJwt:Lcom/auth0/android/jwt/JWT;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/TokenPair;->refreshJwt:Lcom/auth0/android/jwt/JWT;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/TokenPair;->accessJwt:Lcom/auth0/android/jwt/JWT;

    iget-object v1, p0, Lco/bird/android/model/TokenPair;->refreshJwt:Lcom/auth0/android/jwt/JWT;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TokenPair(accessJwt="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", refreshJwt="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
