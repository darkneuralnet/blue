.class public final Lcom/google/android/libraries/places/internal/zzie;
.super Lcom/google/android/libraries/places/internal/zzif;
.source "SourceFile"


# static fields
.field private static final zzc:Lcom/google/android/libraries/places/internal/zzie;


# instance fields
.field final zza:Lcom/google/android/libraries/places/internal/zzhn;

.field final zzb:Lcom/google/android/libraries/places/internal/zzhn;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/libraries/places/internal/zzie;

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzhl;->zzb()Lcom/google/android/libraries/places/internal/zzhl;

    move-result-object v1

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzhj;->zzb()Lcom/google/android/libraries/places/internal/zzhj;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/libraries/places/internal/zzie;-><init>(Lcom/google/android/libraries/places/internal/zzhn;Lcom/google/android/libraries/places/internal/zzhn;)V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzie;->zzc:Lcom/google/android/libraries/places/internal/zzie;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/libraries/places/internal/zzhn;Lcom/google/android/libraries/places/internal/zzhn;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzif;-><init>()V

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzie;->zza:Lcom/google/android/libraries/places/internal/zzhn;

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzie;->zzb:Lcom/google/android/libraries/places/internal/zzhn;

    invoke-virtual {p1, p2}, Lcom/google/android/libraries/places/internal/zzhn;->zza(Lcom/google/android/libraries/places/internal/zzhn;)I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzhj;->zzb()Lcom/google/android/libraries/places/internal/zzhj;

    move-result-object v0

    if-eq p1, v0, :cond_1

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzhl;->zzb()Lcom/google/android/libraries/places/internal/zzhl;

    move-result-object v0

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Lcom/google/android/libraries/places/internal/zzie;->zzf(Lcom/google/android/libraries/places/internal/zzhn;Lcom/google/android/libraries/places/internal/zzhn;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const-string v1, "Invalid range: "

    if-eqz p2, :cond_2

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static zza(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static zzb(Ljava/lang/Comparable;)Lcom/google/android/libraries/places/internal/zzie;
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzhm;

    invoke-direct {v0, p0}, Lcom/google/android/libraries/places/internal/zzhm;-><init>(Ljava/lang/Comparable;)V

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzhj;->zzb()Lcom/google/android/libraries/places/internal/zzhj;

    move-result-object p0

    new-instance v1, Lcom/google/android/libraries/places/internal/zzie;

    invoke-direct {v1, v0, p0}, Lcom/google/android/libraries/places/internal/zzie;-><init>(Lcom/google/android/libraries/places/internal/zzhn;Lcom/google/android/libraries/places/internal/zzhn;)V

    return-object v1
.end method

.method public static zzc(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/google/android/libraries/places/internal/zzie;
    .locals 1

    new-instance v0, Lcom/google/android/libraries/places/internal/zzhm;

    invoke-direct {v0, p0}, Lcom/google/android/libraries/places/internal/zzhm;-><init>(Ljava/lang/Comparable;)V

    new-instance p0, Lcom/google/android/libraries/places/internal/zzhk;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzhk;-><init>(Ljava/lang/Comparable;)V

    new-instance p1, Lcom/google/android/libraries/places/internal/zzie;

    invoke-direct {p1, v0, p0}, Lcom/google/android/libraries/places/internal/zzie;-><init>(Lcom/google/android/libraries/places/internal/zzhn;Lcom/google/android/libraries/places/internal/zzhn;)V

    return-object p1
.end method

.method public static zzd(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/google/android/libraries/places/internal/zzie;
    .locals 1

    new-instance v0, Lcom/google/android/libraries/places/internal/zzhm;

    invoke-direct {v0, p0}, Lcom/google/android/libraries/places/internal/zzhm;-><init>(Ljava/lang/Comparable;)V

    new-instance p0, Lcom/google/android/libraries/places/internal/zzhm;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzhm;-><init>(Ljava/lang/Comparable;)V

    new-instance p1, Lcom/google/android/libraries/places/internal/zzie;

    invoke-direct {p1, v0, p0}, Lcom/google/android/libraries/places/internal/zzie;-><init>(Lcom/google/android/libraries/places/internal/zzhn;Lcom/google/android/libraries/places/internal/zzhn;)V

    return-object p1
.end method

.method private static zzf(Lcom/google/android/libraries/places/internal/zzhn;Lcom/google/android/libraries/places/internal/zzhn;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/libraries/places/internal/zzhn;->zzc(Ljava/lang/StringBuilder;)V

    const-string p0, ".."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Lcom/google/android/libraries/places/internal/zzhn;->zzd(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/android/libraries/places/internal/zzie;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/libraries/places/internal/zzie;

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzie;->zza:Lcom/google/android/libraries/places/internal/zzhn;

    iget-object v2, p1, Lcom/google/android/libraries/places/internal/zzie;->zza:Lcom/google/android/libraries/places/internal/zzhn;

    invoke-virtual {v0, v2}, Lcom/google/android/libraries/places/internal/zzhn;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzie;->zzb:Lcom/google/android/libraries/places/internal/zzhn;

    iget-object p1, p1, Lcom/google/android/libraries/places/internal/zzie;->zzb:Lcom/google/android/libraries/places/internal/zzhn;

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzhn;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzie;->zza:Lcom/google/android/libraries/places/internal/zzhn;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzhn;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/libraries/places/internal/zzie;->zzb:Lcom/google/android/libraries/places/internal/zzhn;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzhn;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzie;->zza:Lcom/google/android/libraries/places/internal/zzhn;

    iget-object v1, p0, Lcom/google/android/libraries/places/internal/zzie;->zzb:Lcom/google/android/libraries/places/internal/zzhn;

    invoke-static {v0, v1}, Lcom/google/android/libraries/places/internal/zzie;->zzf(Lcom/google/android/libraries/places/internal/zzhn;Lcom/google/android/libraries/places/internal/zzhn;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zze(Ljava/lang/Comparable;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzie;->zza:Lcom/google/android/libraries/places/internal/zzhn;

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzhn;->zze(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzie;->zzb:Lcom/google/android/libraries/places/internal/zzhn;

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzhn;->zze(Ljava/lang/Comparable;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
