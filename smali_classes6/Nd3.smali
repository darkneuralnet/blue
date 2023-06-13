.class public abstract LNd3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/common/internal/a$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNd3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/mlkit/vision/common/internal/a$b<",
        "LLd3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(LNd3$a;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LNd3$a<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LNd3$a;->b(LNd3$a;)I

    move-result v0

    iput v0, p0, LNd3;->a:I

    invoke-static {p1}, LNd3$a;->e(LNd3$a;)Z

    move-result v0

    iput-boolean v0, p0, LNd3;->b:Z

    invoke-static {p1}, LNd3$a;->d(LNd3$a;)Z

    move-result v0

    iput-boolean v0, p0, LNd3;->c:Z

    invoke-static {p1}, LNd3$a;->c(LNd3$a;)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, LNd3;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget v0, p0, LNd3;->a:I

    return v0
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-object v0, p0, LNd3;->d:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public c()Z
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-boolean v0, p0, LNd3;->c:Z

    return v0
.end method

.method public d()Z
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-boolean v0, p0, LNd3;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LNd3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LNd3;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p1, LNd3;->a:I

    iget v3, p0, LNd3;->a:I

    if-ne v1, v3, :cond_2

    iget-boolean v1, p1, LNd3;->c:Z

    iget-boolean v3, p0, LNd3;->c:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p1, LNd3;->b:Z

    iget-boolean v3, p0, LNd3;->b:Z

    if-ne v1, v3, :cond_2

    iget-object p1, p1, LNd3;->d:Ljava/util/concurrent/Executor;

    iget-object v1, p0, LNd3;->d:Ljava/util/concurrent/Executor;

    invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, LNd3;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-boolean v1, p0, LNd3;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-boolean v1, p0, LNd3;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v1, 0x4

    iget-object v2, p0, LNd3;->d:Ljava/util/concurrent/Executor;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
