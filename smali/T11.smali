.class public final LT11;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0016\u001a\u0004\u0008\u0012\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u0019\u0010\u0017\u00a8\u0006\u001d"
    }
    d2 = {
        "LT11;",
        "",
        "LXf0;",
        "a",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "LXf0;",
        "b",
        "()LXf0;",
        "cardType",
        "Z",
        "isReliable",
        "()Z",
        "c",
        "d",
        "enableLuhnCheck",
        "Lcom/adyen/checkout/card/api/model/Brand$c;",
        "Lcom/adyen/checkout/card/api/model/Brand$c;",
        "()Lcom/adyen/checkout/card/api/model/Brand$c;",
        "cvcPolicy",
        "e",
        "expiryDatePolicy",
        "<init>",
        "(LXf0;ZZLcom/adyen/checkout/card/api/model/Brand$c;Lcom/adyen/checkout/card/api/model/Brand$c;)V",
        "card_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field public final a:LXf0;

.field public final b:Z

.field public final c:Z

.field public final d:Lcom/adyen/checkout/card/api/model/Brand$c;

.field public final e:Lcom/adyen/checkout/card/api/model/Brand$c;


# direct methods
.method public constructor <init>(LXf0;ZZLcom/adyen/checkout/card/api/model/Brand$c;Lcom/adyen/checkout/card/api/model/Brand$c;)V
    .locals 1

    const-string v0, "cardType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcPolicy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expiryDatePolicy"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT11;->a:LXf0;

    iput-boolean p2, p0, LT11;->b:Z

    iput-boolean p3, p0, LT11;->c:Z

    iput-object p4, p0, LT11;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    iput-object p5, p0, LT11;->e:Lcom/adyen/checkout/card/api/model/Brand$c;

    return-void
.end method


# virtual methods
.method public final a()LXf0;
    .locals 1

    iget-object v0, p0, LT11;->a:LXf0;

    return-object v0
.end method

.method public final b()LXf0;
    .locals 1

    iget-object v0, p0, LT11;->a:LXf0;

    return-object v0
.end method

.method public final c()Lcom/adyen/checkout/card/api/model/Brand$c;
    .locals 1

    iget-object v0, p0, LT11;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LT11;->c:Z

    return v0
.end method

.method public final e()Lcom/adyen/checkout/card/api/model/Brand$c;
    .locals 1

    iget-object v0, p0, LT11;->e:Lcom/adyen/checkout/card/api/model/Brand$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LT11;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LT11;

    iget-object v1, p0, LT11;->a:LXf0;

    iget-object v3, p1, LT11;->a:LXf0;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, LT11;->b:Z

    iget-boolean v3, p1, LT11;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LT11;->c:Z

    iget-boolean v3, p1, LT11;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LT11;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    iget-object v3, p1, LT11;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LT11;->e:Lcom/adyen/checkout/card/api/model/Brand$c;

    iget-object p1, p1, LT11;->e:Lcom/adyen/checkout/card/api/model/Brand$c;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LT11;->a:LXf0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LT11;->b:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LT11;->c:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LT11;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LT11;->e:Lcom/adyen/checkout/card/api/model/Brand$c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DetectedCardType(cardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT11;->a:LXf0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isReliable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LT11;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableLuhnCheck="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LT11;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cvcPolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT11;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expiryDatePolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT11;->e:Lcom/adyen/checkout/card/api/model/Brand$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
