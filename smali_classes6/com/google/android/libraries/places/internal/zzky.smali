.class final Lcom/google/android/libraries/places/internal/zzky;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final zza:I

.field final zzb:I

.field final zzc:I

.field final zzd:I

.field private final zze:Ljava/lang/String;

.field private final zzf:[C

.field private final zzg:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;[C)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzky;->zze:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzky;->zzf:[C

    :try_start_0
    array-length p1, p2

    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {p1, v0}, Lcom/google/android/libraries/places/internal/zzaax;->zzb(ILjava/math/RoundingMode;)I

    move-result v0

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzky;->zzb:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-static {v0}, Ljava/lang/Integer;->lowestOneBit(I)I

    move-result v1

    const/16 v2, 0x8

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :try_start_1
    div-int/2addr v2, v1

    iput v2, p0, Lcom/google/android/libraries/places/internal/zzky;->zzc:I

    div-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzky;->zzd:I
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, -0x1

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzky;->zza:I

    const/16 p1, 0x80

    new-array v1, p1, [B

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([BB)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, p2

    const/4 v5, 0x1

    if-ge v3, v4, :cond_2

    aget-char v4, p2, v3

    if-ge v4, p1, :cond_0

    move v6, v5

    goto :goto_1

    :cond_0
    move v6, v2

    :goto_1
    const-string v7, "Non-ASCII character: %s"

    invoke-static {v6, v7, v4}, Lcom/google/android/libraries/places/internal/zzha;->zzf(ZLjava/lang/String;C)V

    aget-byte v6, v1, v4

    if-ne v6, v0, :cond_1

    goto :goto_2

    :cond_1
    move v5, v2

    :goto_2
    const-string v6, "Duplicate character: %s"

    invoke-static {v5, v6, v4}, Lcom/google/android/libraries/places/internal/zzha;->zzf(ZLjava/lang/String;C)V

    int-to-byte v5, v3

    aput-byte v5, v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput-object v1, p0, Lcom/google/android/libraries/places/internal/zzky;->zzg:[B

    iget p1, p0, Lcom/google/android/libraries/places/internal/zzky;->zzc:I

    new-array p1, p1, [Z

    :goto_3
    iget p2, p0, Lcom/google/android/libraries/places/internal/zzky;->zzd:I

    if-ge v2, p2, :cond_3

    mul-int/lit8 p2, v2, 0x8

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzky;->zzb:I

    sget-object v1, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {p2, v0, v1}, Lcom/google/android/libraries/places/internal/zzaax;->zza(IILjava/math/RoundingMode;)I

    move-result p2

    aput-boolean v5, p1, p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p2}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p2

    const-string v2, "Illegal alphabet "

    if-eqz p2, :cond_4

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_4

    :cond_4
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_4
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    array-length p2, p2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x23

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Illegal alphabet length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic zzc(Lcom/google/android/libraries/places/internal/zzky;)[C
    .locals 0

    iget-object p0, p0, Lcom/google/android/libraries/places/internal/zzky;->zzf:[C

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/libraries/places/internal/zzky;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/libraries/places/internal/zzky;

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzky;->zzf:[C

    iget-object p1, p1, Lcom/google/android/libraries/places/internal/zzky;->zzf:[C

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([C[C)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzky;->zzf:[C

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([C)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzky;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final zza(I)C
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzky;->zzf:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final zzb(C)Z
    .locals 1

    const/16 v0, 0x80

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzky;->zzg:[B

    aget-byte p1, v0, p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
