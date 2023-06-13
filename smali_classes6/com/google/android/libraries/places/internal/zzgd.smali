.class public final Lcom/google/android/libraries/places/internal/zzgd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u$b;


# instance fields
.field private final zza:Lcom/google/android/libraries/places/internal/zzfs;

.field private final zzb:Lcom/google/android/libraries/places/internal/zzgi;

.field private final zzc:Lcom/google/android/libraries/places/internal/zzgj;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/places/internal/zzfs;Lcom/google/android/libraries/places/internal/zzgi;Lcom/google/android/libraries/places/internal/zzgj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzgd;->zza:Lcom/google/android/libraries/places/internal/zzfs;

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzgd;->zzb:Lcom/google/android/libraries/places/internal/zzgi;

    iput-object p3, p0, Lcom/google/android/libraries/places/internal/zzgd;->zzc:Lcom/google/android/libraries/places/internal/zzgj;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;)LOr6;
    .locals 4

    const-class v0, Lcom/google/android/libraries/places/internal/zzgf;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "This factory can only be used to instantiate its enclosing class."

    invoke-static {p1, v0}, Lcom/google/android/libraries/places/internal/zzha;->zze(ZLjava/lang/Object;)V

    new-instance p1, Lcom/google/android/libraries/places/internal/zzgf;

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzgd;->zza:Lcom/google/android/libraries/places/internal/zzfs;

    iget-object v1, p0, Lcom/google/android/libraries/places/internal/zzgd;->zzb:Lcom/google/android/libraries/places/internal/zzgi;

    iget-object v2, p0, Lcom/google/android/libraries/places/internal/zzgd;->zzc:Lcom/google/android/libraries/places/internal/zzgj;

    const/4 v3, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/google/android/libraries/places/internal/zzgf;-><init>(Lcom/google/android/libraries/places/internal/zzfs;Lcom/google/android/libraries/places/internal/zzgi;Lcom/google/android/libraries/places/internal/zzgj;Lcom/google/android/libraries/places/internal/zzge;)V

    return-object p1
.end method

.method public bridge synthetic create(Ljava/lang/Class;LFE0;)LOr6;
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/lifecycle/u$b;->create(Ljava/lang/Class;LFE0;)LOr6;

    move-result-object p1

    return-object p1
.end method
