.class public final LwQ6;
.super Li77;
.source "SourceFile"


# instance fields
.field public final a:LL77;

.field public final b:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

.field public final c:LX57;

.field public final d:Z


# direct methods
.method public constructor <init>(LL77;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;LX57;Z)V
    .locals 0

    invoke-direct {p0}, Li77;-><init>()V

    iput-object p1, p0, LwQ6;->a:LL77;

    iput-object p2, p0, LwQ6;->b:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    if-eqz p3, :cond_0

    iput-object p3, p0, LwQ6;->c:LX57;

    iput-boolean p4, p0, LwQ6;->d:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null lineBoxParcels"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()LX57;
    .locals 1

    iget-object v0, p0, LwQ6;->c:LX57;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;
    .locals 1

    iget-object v0, p0, LwQ6;->b:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    return-object v0
.end method

.method public final c()LL77;
    .locals 1

    iget-object v0, p0, LwQ6;->a:LL77;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LwQ6;->d:Z

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li77;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Li77;

    iget-object v1, p0, LwQ6;->a:LL77;

    invoke-virtual {p1}, Li77;->c()LL77;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LwQ6;->b:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    invoke-virtual {p1}, Li77;->b()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LwQ6;->c:LX57;

    invoke-virtual {p1}, Li77;->a()LX57;

    move-result-object v3

    invoke-virtual {v1, v3}, LX57;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, LwQ6;->d:Z

    invoke-virtual {p1}, Li77;->d()Z

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, LwQ6;->a:LL77;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    iget-object v2, p0, LwQ6;->b:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    mul-int/2addr v0, v1

    xor-int/2addr v0, v2

    iget-object v2, p0, LwQ6;->c:LX57;

    invoke-virtual {v2}, LX57;->hashCode()I

    move-result v2

    mul-int/2addr v0, v1

    xor-int/2addr v0, v2

    const/4 v2, 0x1

    iget-boolean v3, p0, LwQ6;->d:Z

    if-eq v2, v3, :cond_0

    const/16 v2, 0x4d5

    goto :goto_0

    :cond_0
    const/16 v2, 0x4cf

    :goto_0
    mul-int/2addr v0, v1

    xor-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LwQ6;->a:LL77;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LwQ6;->b:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LwQ6;->c:LX57;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iget-boolean v3, p0, LwQ6;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "VkpResults{status="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", textParcel="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", lineBoxParcels="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fromColdCall="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
