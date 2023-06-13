.class public final Lsa1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000c\u001a\u00020\u00022\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lsa1;",
        "",
        "",
        "validationRequired",
        "Lco/bird/android/model/TokenPair;",
        "tokens",
        "a",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Z",
        "c",
        "()Z",
        "Lco/bird/android/model/TokenPair;",
        "b",
        "()Lco/bird/android/model/TokenPair;",
        "<init>",
        "(ZLco/bird/android/model/TokenPair;)V",
        "auth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final tokens:Lco/bird/android/model/TokenPair;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "tokens"
    .end annotation

    .annotation runtime Lft5;
        value = "tokens"
    .end annotation
.end field

.field private final validationRequired:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "validation_required"
    .end annotation

    .annotation runtime Lft5;
        value = "validation_required"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lsa1;-><init>(ZLco/bird/android/model/TokenPair;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLco/bird/android/model/TokenPair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lsa1;->validationRequired:Z

    iput-object p2, p0, Lsa1;->tokens:Lco/bird/android/model/TokenPair;

    return-void
.end method

.method public synthetic constructor <init>(ZLco/bird/android/model/TokenPair;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-direct {p0, p1, p2}, Lsa1;-><init>(ZLco/bird/android/model/TokenPair;)V

    return-void
.end method

.method public static synthetic copy$default(Lsa1;ZLco/bird/android/model/TokenPair;ILjava/lang/Object;)Lsa1;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lsa1;->validationRequired:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lsa1;->tokens:Lco/bird/android/model/TokenPair;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lsa1;->a(ZLco/bird/android/model/TokenPair;)Lsa1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZLco/bird/android/model/TokenPair;)Lsa1;
    .locals 1

    new-instance v0, Lsa1;

    invoke-direct {v0, p1, p2}, Lsa1;-><init>(ZLco/bird/android/model/TokenPair;)V

    return-object v0
.end method

.method public final b()Lco/bird/android/model/TokenPair;
    .locals 1

    iget-object v0, p0, Lsa1;->tokens:Lco/bird/android/model/TokenPair;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lsa1;->validationRequired:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsa1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsa1;

    iget-boolean v1, p0, Lsa1;->validationRequired:Z

    iget-boolean v3, p1, Lsa1;->validationRequired:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lsa1;->tokens:Lco/bird/android/model/TokenPair;

    iget-object p1, p1, Lsa1;->tokens:Lco/bird/android/model/TokenPair;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lsa1;->validationRequired:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lsa1;->tokens:Lco/bird/android/model/TokenPair;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/TokenPair;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lsa1;->validationRequired:Z

    iget-object v1, p0, Lsa1;->tokens:Lco/bird/android/model/TokenPair;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EmailMagicLinkResponse(validationRequired="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", tokens="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
