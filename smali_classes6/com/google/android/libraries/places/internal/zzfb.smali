.class final Lcom/google/android/libraries/places/internal/zzfb;
.super Lcom/google/android/libraries/places/internal/zzfk;
.source "SourceFile"


# instance fields
.field private zza:Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

.field private zzb:Lcom/google/android/libraries/places/internal/zzhs;

.field private zzc:Lcom/google/android/libraries/places/internal/zzfj;

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:Lcom/google/android/libraries/places/api/model/LocationBias;

.field private zzg:Lcom/google/android/libraries/places/api/model/LocationRestriction;

.field private zzh:Lcom/google/android/libraries/places/internal/zzhs;

.field private zzi:Lcom/google/android/libraries/places/api/model/TypeFilter;

.field private zzj:I

.field private zzk:I

.field private zzl:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzfk;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/libraries/places/internal/zzfl;Lcom/google/android/libraries/places/internal/zzfa;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzfk;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zzh()Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zza:Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zzj()Lcom/google/android/libraries/places/internal/zzhs;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzb:Lcom/google/android/libraries/places/internal/zzhs;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zzf()Lcom/google/android/libraries/places/internal/zzfj;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzc:Lcom/google/android/libraries/places/internal/zzfj;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zzl()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzd:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zzk()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zze:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zzc()Lcom/google/android/libraries/places/api/model/LocationBias;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzf:Lcom/google/android/libraries/places/api/model/LocationBias;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zzd()Lcom/google/android/libraries/places/api/model/LocationRestriction;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzg:Lcom/google/android/libraries/places/api/model/LocationRestriction;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zzi()Lcom/google/android/libraries/places/internal/zzhs;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzh:Lcom/google/android/libraries/places/internal/zzhs;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zze()Lcom/google/android/libraries/places/api/model/TypeFilter;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzi:Lcom/google/android/libraries/places/api/model/TypeFilter;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zza()I

    move-result p2

    iput p2, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzj:I

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzfl;->zzb()I

    move-result p1

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzk:I

    const/4 p1, 0x3

    iput-byte p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzl:B

    return-void
.end method


# virtual methods
.method public final zza(Ljava/util/List;)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 0

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzhs;->zzk(Ljava/util/Collection;)Lcom/google/android/libraries/places/internal/zzhs;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzh:Lcom/google/android/libraries/places/internal/zzhs;

    return-object p0
.end method

.method public final zzb(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zze:Ljava/lang/String;

    return-object p0
.end method

.method public final zzc(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzd:Ljava/lang/String;

    return-object p0
.end method

.method public final zzd(Lcom/google/android/libraries/places/api/model/LocationBias;)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzf:Lcom/google/android/libraries/places/api/model/LocationBias;

    return-object p0
.end method

.method public final zze(Lcom/google/android/libraries/places/api/model/LocationRestriction;)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzg:Lcom/google/android/libraries/places/api/model/LocationRestriction;

    return-object p0
.end method

.method public final zzf(Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zza:Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null mode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzg(Lcom/google/android/libraries/places/internal/zzfj;)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzc:Lcom/google/android/libraries/places/internal/zzfj;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null origin"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzh(Ljava/util/List;)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 0

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzhs;->zzk(Ljava/util/Collection;)Lcom/google/android/libraries/places/internal/zzhs;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzb:Lcom/google/android/libraries/places/internal/zzhs;

    return-object p0
.end method

.method public final zzi(I)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 0

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzj:I

    iget-byte p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzl:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzl:B

    return-object p0
.end method

.method public final zzj(I)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 0

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzk:I

    iget-byte p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzl:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzl:B

    return-object p0
.end method

.method public final zzk(Lcom/google/android/libraries/places/api/model/TypeFilter;)Lcom/google/android/libraries/places/internal/zzfk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzi:Lcom/google/android/libraries/places/api/model/TypeFilter;

    return-object p0
.end method

.method public final zzl()Lcom/google/android/libraries/places/internal/zzfl;
    .locals 14

    iget-byte v0, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzl:B

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v3, p0, Lcom/google/android/libraries/places/internal/zzfb;->zza:Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzb:Lcom/google/android/libraries/places/internal/zzhs;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzc:Lcom/google/android/libraries/places/internal/zzfj;

    if-eqz v5, :cond_1

    iget-object v10, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzh:Lcom/google/android/libraries/places/internal/zzhs;

    if-nez v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/libraries/places/internal/zzfe;

    iget-object v6, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzd:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/libraries/places/internal/zzfb;->zze:Ljava/lang/String;

    iget-object v8, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzf:Lcom/google/android/libraries/places/api/model/LocationBias;

    iget-object v9, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzg:Lcom/google/android/libraries/places/api/model/LocationRestriction;

    iget-object v11, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzi:Lcom/google/android/libraries/places/api/model/TypeFilter;

    iget v12, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzj:I

    iget v13, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzk:I

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Lcom/google/android/libraries/places/internal/zzfe;-><init>(Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;Lcom/google/android/libraries/places/internal/zzhs;Lcom/google/android/libraries/places/internal/zzfj;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/libraries/places/api/model/LocationBias;Lcom/google/android/libraries/places/api/model/LocationRestriction;Lcom/google/android/libraries/places/internal/zzhs;Lcom/google/android/libraries/places/api/model/TypeFilter;II)V

    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zza:Lcom/google/android/libraries/places/widget/model/AutocompleteActivityMode;

    if-nez v1, :cond_2

    const-string v1, " mode"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzb:Lcom/google/android/libraries/places/internal/zzhs;

    if-nez v1, :cond_3

    const-string v1, " placeFields"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzc:Lcom/google/android/libraries/places/internal/zzfj;

    if-nez v1, :cond_4

    const-string v1, " origin"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzh:Lcom/google/android/libraries/places/internal/zzhs;

    if-nez v1, :cond_5

    const-string v1, " countries"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-byte v1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzl:B

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_6

    const-string v1, " primaryColor"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-byte v1, p0, Lcom/google/android/libraries/places/internal/zzfb;->zzl:B

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_7

    const-string v1, " primaryColorDark"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Missing required properties:"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
