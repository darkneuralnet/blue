.class final Lcom/google/android/gms/tagmanager/zzff;
.super Lcom/google/android/gms/tagmanager/zzey;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
.end annotation

.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# static fields
.field private static final zza:Ljava/lang/Object;

.field private static zzb:Lcom/google/android/gms/tagmanager/zzff;


# instance fields
.field private zze:Z

.field private zzf:Z

.field private zzg:Z

.field private zzj:Z

.field private final zzl:Lcom/google/android/gms/tagmanager/zzez;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzff;->zza:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzey;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzff;->zze:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/zzff;->zzf:Z

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzff;->zzg:Z

    new-instance v0, Lcom/google/android/gms/tagmanager/zzez;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/zzez;-><init>(Lcom/google/android/gms/tagmanager/zzff;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzff;->zzl:Lcom/google/android/gms/tagmanager/zzez;

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/zzff;->zzj:Z

    return-void
.end method

.method public static bridge synthetic zze(Lcom/google/android/gms/tagmanager/zzff;)Lcom/google/android/gms/tagmanager/zzcd;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static zzg()Lcom/google/android/gms/tagmanager/zzff;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzff;->zzb:Lcom/google/android/gms/tagmanager/zzff;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/zzff;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/zzff;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzff;->zzb:Lcom/google/android/gms/tagmanager/zzff;

    :cond_0
    sget-object v0, Lcom/google/android/gms/tagmanager/zzff;->zzb:Lcom/google/android/gms/tagmanager/zzff;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized zza()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzff;->zzf:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/tagmanager/zzdh;->zzb:Lcom/google/android/gms/tagmanager/zzbg;

    const-string v1, "Dispatch call queued. Dispatch will run once initialization is complete."

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/zzbg;->zzd(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzff;->zze:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/tagmanager/zzfa;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/zzfa;-><init>(Lcom/google/android/gms/tagmanager/zzff;)V

    const/4 v0, 0x0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
