.class public final Let;
.super LBp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Let$b;
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, LBp;-><init>()V

    iput p1, p0, Let;->b:I

    iput p2, p0, Let;->c:I

    iput p3, p0, Let;->d:I

    iput p4, p0, Let;->e:I

    return-void
.end method

.method public synthetic constructor <init>(IIIILet$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Let;-><init>(IIII)V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Let;->e:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Let;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Let;->d:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Let;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LBp;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, LBp;

    iget v1, p0, Let;->b:I

    invoke-virtual {p1}, LBp;->c()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Let;->c:I

    invoke-virtual {p1}, LBp;->e()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Let;->d:I

    invoke-virtual {p1}, LBp;->d()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Let;->e:I

    invoke-virtual {p1}, LBp;->b()I

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Let;->b:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, Let;->c:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Let;->d:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Let;->e:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AudioSettings{audioSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Let;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sampleRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Let;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", channelCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Let;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", audioFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Let;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
