.class public Lhj1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj1$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:F

.field public final g:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(IIIIZFLjava/util/concurrent/Executor;Lhf7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lhj1;->a:I

    iput p2, p0, Lhj1;->b:I

    iput p3, p0, Lhj1;->c:I

    iput p4, p0, Lhj1;->d:I

    iput-boolean p5, p0, Lhj1;->e:Z

    iput p6, p0, Lhj1;->f:F

    iput-object p7, p0, Lhj1;->g:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lhj1;->f:F

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lhj1;->c:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lhj1;->b:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lhj1;->a:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lhj1;->d:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhj1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhj1;

    iget v1, p0, Lhj1;->f:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    iget v3, p1, Lhj1;->f:F

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Lhj1;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v3, p1, Lhj1;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lhj1;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v3, p1, Lhj1;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lhj1;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v3, p1, Lhj1;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lhj1;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v3, p1, Lhj1;->e:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lhj1;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v3, p1, Lhj1;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lhj1;->g:Ljava/util/concurrent/Executor;

    iget-object p1, p1, Lhj1;->g:Ljava/util/concurrent/Executor;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final f()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lhj1;->g:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lhj1;->e:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lhj1;->f:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lhj1;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lhj1;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget v1, p0, Lhj1;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lhj1;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget v1, p0, Lhj1;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v1, 0x6

    iget-object v2, p0, Lhj1;->g:Ljava/util/concurrent/Executor;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, "FaceDetectorOptions"

    invoke-static {v0}, Ldv9;->a(Ljava/lang/String;)LHt9;

    move-result-object v0

    const-string v1, "landmarkMode"

    iget v2, p0, Lhj1;->a:I

    invoke-virtual {v0, v1, v2}, LHt9;->b(Ljava/lang/String;I)LHt9;

    const-string v1, "contourMode"

    iget v2, p0, Lhj1;->b:I

    invoke-virtual {v0, v1, v2}, LHt9;->b(Ljava/lang/String;I)LHt9;

    const-string v1, "classificationMode"

    iget v2, p0, Lhj1;->c:I

    invoke-virtual {v0, v1, v2}, LHt9;->b(Ljava/lang/String;I)LHt9;

    const-string v1, "performanceMode"

    iget v2, p0, Lhj1;->d:I

    invoke-virtual {v0, v1, v2}, LHt9;->b(Ljava/lang/String;I)LHt9;

    const-string v1, "trackingEnabled"

    iget-boolean v2, p0, Lhj1;->e:Z

    invoke-virtual {v0, v1, v2}, LHt9;->d(Ljava/lang/String;Z)LHt9;

    const-string v1, "minFaceSize"

    iget v2, p0, Lhj1;->f:F

    invoke-virtual {v0, v1, v2}, LHt9;->a(Ljava/lang/String;F)LHt9;

    invoke-virtual {v0}, LHt9;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
