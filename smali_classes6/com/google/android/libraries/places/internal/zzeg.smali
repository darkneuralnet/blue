.class final Lcom/google/android/libraries/places/internal/zzeg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzej;


# instance fields
.field private zza:Landroid/content/Context;

.field private zzb:Lcom/google/android/libraries/places/internal/zzem;

.field private zzc:Lcom/google/android/libraries/places/internal/zzet;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/libraries/places/internal/zzef;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/libraries/places/internal/zzem;)Lcom/google/android/libraries/places/internal/zzej;
    .locals 0

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzeg;->zzb:Lcom/google/android/libraries/places/internal/zzem;

    return-object p0
.end method

.method public final synthetic zzb(Lcom/google/android/libraries/places/internal/zzet;)Lcom/google/android/libraries/places/internal/zzej;
    .locals 0

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzeg;->zzc:Lcom/google/android/libraries/places/internal/zzet;

    return-object p0
.end method

.method public final synthetic zzc(Landroid/content/Context;)Lcom/google/android/libraries/places/internal/zzej;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzeg;->zza:Landroid/content/Context;

    return-object p0
.end method

.method public final zzd()Lcom/google/android/libraries/places/internal/zzek;
    .locals 5

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzeg;->zza:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/libraries/places/internal/zzagk;->zzb(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzeg;->zzb:Lcom/google/android/libraries/places/internal/zzem;

    const-class v1, Lcom/google/android/libraries/places/internal/zzem;

    invoke-static {v0, v1}, Lcom/google/android/libraries/places/internal/zzagk;->zzb(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzeg;->zzc:Lcom/google/android/libraries/places/internal/zzet;

    const-class v1, Lcom/google/android/libraries/places/internal/zzet;

    invoke-static {v0, v1}, Lcom/google/android/libraries/places/internal/zzagk;->zzb(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/libraries/places/internal/zzei;

    iget-object v1, p0, Lcom/google/android/libraries/places/internal/zzeg;->zza:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/libraries/places/internal/zzeg;->zzb:Lcom/google/android/libraries/places/internal/zzem;

    iget-object v3, p0, Lcom/google/android/libraries/places/internal/zzeg;->zzc:Lcom/google/android/libraries/places/internal/zzet;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/libraries/places/internal/zzei;-><init>(Landroid/content/Context;Lcom/google/android/libraries/places/internal/zzem;Lcom/google/android/libraries/places/internal/zzet;Lcom/google/android/libraries/places/internal/zzeh;)V

    return-object v0
.end method
