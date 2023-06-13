.class public final Lcom/google/android/gms/internal/vision/G$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOF8;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/vision/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOF8<",
        "Lcom/google/android/gms/internal/vision/G$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:LT19;

.field public final d:Z


# virtual methods
.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/vision/G$e;

    iget v0, p0, Lcom/google/android/gms/internal/vision/G$e;->b:I

    iget p1, p1, Lcom/google/android/gms/internal/vision/G$e;->b:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final l3(LcS8;LcS8;)LcS8;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final v0(LSQ8;LlQ8;)LSQ8;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/vision/G$b;

    check-cast p2, Lcom/google/android/gms/internal/vision/G;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/vision/G$b;->m(Lcom/google/android/gms/internal/vision/G;)Lcom/google/android/gms/internal/vision/G$b;

    move-result-object p1

    return-object p1
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/vision/G$e;->b:I

    return v0
.end method

.method public final zzb()LT19;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$e;->c:LT19;

    return-object v0
.end method

.method public final zzc()Lx29;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$e;->c:LT19;

    invoke-virtual {v0}, LT19;->a()Lx29;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$e;->d:Z

    return v0
.end method

.method public final zze()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
