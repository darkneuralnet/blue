.class public final Lcom/google/android/gms/internal/gtm/zzbv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation


# static fields
.field private static volatile zza:Lcom/google/android/gms/internal/gtm/zzbv;


# instance fields
.field private final zzb:Landroid/content/Context;

.field private final zzc:Landroid/content/Context;

.field private final zzd:Lcom/google/android/gms/common/util/Clock;

.field private final zze:Lcom/google/android/gms/internal/gtm/zzct;

.field private final zzf:Lcom/google/android/gms/internal/gtm/zzfb;

.field private final zzg:LQl9;

.field private final zzh:Lcom/google/android/gms/internal/gtm/zzbq;

.field private final zzi:Lcom/google/android/gms/internal/gtm/zzcy;

.field private final zzj:Lcom/google/android/gms/internal/gtm/zzft;

.field private final zzk:Lcom/google/android/gms/internal/gtm/zzfh;

.field private final zzl:LaD1;

.field private final zzm:Lcom/google/android/gms/internal/gtm/zzcn;

.field private final zzn:Lcom/google/android/gms/internal/gtm/zzbi;

.field private final zzo:Lcom/google/android/gms/internal/gtm/zzcf;

.field private final zzp:Lcom/google/android/gms/internal/gtm/zzcx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gtm/zzbw;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbw;->zza()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Application context can\'t be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbw;->zzb()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzb:Landroid/content/Context;

    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzc:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzd:Lcom/google/android/gms/common/util/Clock;

    new-instance v1, Lcom/google/android/gms/internal/gtm/zzct;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/gtm/zzct;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zze:Lcom/google/android/gms/internal/gtm/zzct;

    new-instance v1, Lcom/google/android/gms/internal/gtm/zzfb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/gtm/zzfb;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbs;->zzX()V

    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzf:Lcom/google/android/gms/internal/gtm/zzfb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/gtm/zzbt;->zza:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit16 v3, v3, 0x86

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Google Analytics "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/gtm/zzbr;->zzM(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/gtm/zzfh;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/gtm/zzfh;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbs;->zzX()V

    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzk:Lcom/google/android/gms/internal/gtm/zzfh;

    new-instance v1, Lcom/google/android/gms/internal/gtm/zzft;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/gtm/zzft;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbs;->zzX()V

    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzj:Lcom/google/android/gms/internal/gtm/zzft;

    new-instance v1, Lcom/google/android/gms/internal/gtm/zzbq;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/gtm/zzbq;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;Lcom/google/android/gms/internal/gtm/zzbw;)V

    new-instance p1, Lcom/google/android/gms/internal/gtm/zzcn;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/gtm/zzcn;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    new-instance v2, Lcom/google/android/gms/internal/gtm/zzbi;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/gtm/zzbi;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    new-instance v3, Lcom/google/android/gms/internal/gtm/zzcf;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/gtm/zzcf;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    new-instance v4, Lcom/google/android/gms/internal/gtm/zzcx;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/gtm/zzcx;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    invoke-static {v0}, LQl9;->b(Landroid/content/Context;)LQl9;

    move-result-object v0

    new-instance v5, Lcom/google/android/gms/internal/gtm/zzbu;

    invoke-direct {v5, p0}, Lcom/google/android/gms/internal/gtm/zzbu;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    invoke-virtual {v0, v5}, LQl9;->j(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzg:LQl9;

    new-instance v0, LaD1;

    invoke-direct {v0, p0}, LaD1;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbs;->zzX()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzm:Lcom/google/android/gms/internal/gtm/zzcn;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/gtm/zzbs;->zzX()V

    iput-object v2, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzn:Lcom/google/android/gms/internal/gtm/zzbi;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/gtm/zzbs;->zzX()V

    iput-object v3, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzo:Lcom/google/android/gms/internal/gtm/zzcf;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/gtm/zzbs;->zzX()V

    iput-object v4, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzp:Lcom/google/android/gms/internal/gtm/zzcx;

    new-instance p1, Lcom/google/android/gms/internal/gtm/zzcy;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/gtm/zzcy;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbs;->zzX()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzi:Lcom/google/android/gms/internal/gtm/zzcy;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbs;->zzX()V

    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzh:Lcom/google/android/gms/internal/gtm/zzbq;

    invoke-virtual {v0}, LaD1;->l()V

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzl:LaD1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbq;->zzm()V

    return-void
.end method

.method public static zzg(Landroid/content/Context;)Lcom/google/android/gms/internal/gtm/zzbv;
    .locals 6

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzbv;->zza:Lcom/google/android/gms/internal/gtm/zzbv;

    if-nez v0, :cond_1

    const-class v0, Lcom/google/android/gms/internal/gtm/zzbv;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzbv;->zza:Lcom/google/android/gms/internal/gtm/zzbv;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v2

    new-instance v4, Lcom/google/android/gms/internal/gtm/zzbw;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/gtm/zzbw;-><init>(Landroid/content/Context;)V

    new-instance p0, Lcom/google/android/gms/internal/gtm/zzbv;

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/gtm/zzbv;-><init>(Lcom/google/android/gms/internal/gtm/zzbw;)V

    sput-object p0, Lcom/google/android/gms/internal/gtm/zzbv;->zza:Lcom/google/android/gms/internal/gtm/zzbv;

    invoke-static {}, LaD1;->k()V

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    sget-object v1, Lcom/google/android/gms/internal/gtm/zzeu;->zzQ:Lcom/google/android/gms/internal/gtm/zzet;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v3, v4, v1

    if-lez v3, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    move-result-object p0

    const-string v3, "Slow initialization (ms)"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v3, v4, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzT(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/gtm/zzbv;->zza:Lcom/google/android/gms/internal/gtm/zzbv;

    return-object p0
.end method

.method private static final zzs(Lcom/google/android/gms/internal/gtm/zzbs;)V
    .locals 1

    const-string v0, "Analytics service not created/initialized"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzY()Z

    move-result p0

    const-string v0, "Analytics service not initialized"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final zza()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzb:Landroid/content/Context;

    return-object v0
.end method

.method public final zzb()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzc:Landroid/content/Context;

    return-object v0
.end method

.method public final zzc()LaD1;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzl:LaD1;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzl:LaD1;

    invoke-virtual {v0}, LaD1;->m()Z

    move-result v0

    const-string v1, "Analytics instance not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzl:LaD1;

    return-object v0
.end method

.method public final zzd()LQl9;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzg:LQl9;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzg:LQl9;

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/internal/gtm/zzbi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzn:Lcom/google/android/gms/internal/gtm/zzbi;

    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzs(Lcom/google/android/gms/internal/gtm/zzbs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzn:Lcom/google/android/gms/internal/gtm/zzbi;

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/internal/gtm/zzbq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzh:Lcom/google/android/gms/internal/gtm/zzbq;

    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzs(Lcom/google/android/gms/internal/gtm/zzbs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzh:Lcom/google/android/gms/internal/gtm/zzbq;

    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/internal/gtm/zzcf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzo:Lcom/google/android/gms/internal/gtm/zzcf;

    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzs(Lcom/google/android/gms/internal/gtm/zzbs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzo:Lcom/google/android/gms/internal/gtm/zzcf;

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/internal/gtm/zzcn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzm:Lcom/google/android/gms/internal/gtm/zzcn;

    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzs(Lcom/google/android/gms/internal/gtm/zzbs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzm:Lcom/google/android/gms/internal/gtm/zzcn;

    return-object v0
.end method

.method public final zzj()Lcom/google/android/gms/internal/gtm/zzct;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zze:Lcom/google/android/gms/internal/gtm/zzct;

    return-object v0
.end method

.method public final zzk()Lcom/google/android/gms/internal/gtm/zzcx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzp:Lcom/google/android/gms/internal/gtm/zzcx;

    return-object v0
.end method

.method public final zzl()Lcom/google/android/gms/internal/gtm/zzcy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzi:Lcom/google/android/gms/internal/gtm/zzcy;

    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzs(Lcom/google/android/gms/internal/gtm/zzbs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzi:Lcom/google/android/gms/internal/gtm/zzcy;

    return-object v0
.end method

.method public final zzm()Lcom/google/android/gms/internal/gtm/zzfb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzf:Lcom/google/android/gms/internal/gtm/zzfb;

    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzs(Lcom/google/android/gms/internal/gtm/zzbs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzf:Lcom/google/android/gms/internal/gtm/zzfb;

    return-object v0
.end method

.method public final zzn()Lcom/google/android/gms/internal/gtm/zzfb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzf:Lcom/google/android/gms/internal/gtm/zzfb;

    return-object v0
.end method

.method public final zzo()Lcom/google/android/gms/internal/gtm/zzfh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzk:Lcom/google/android/gms/internal/gtm/zzfh;

    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzs(Lcom/google/android/gms/internal/gtm/zzbs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzk:Lcom/google/android/gms/internal/gtm/zzfh;

    return-object v0
.end method

.method public final zzp()Lcom/google/android/gms/internal/gtm/zzfh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzk:Lcom/google/android/gms/internal/gtm/zzfh;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzY()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzk:Lcom/google/android/gms/internal/gtm/zzfh;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzq()Lcom/google/android/gms/internal/gtm/zzft;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzj:Lcom/google/android/gms/internal/gtm/zzft;

    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzs(Lcom/google/android/gms/internal/gtm/zzbs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzj:Lcom/google/android/gms/internal/gtm/zzft;

    return-object v0
.end method

.method public final zzr()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbv;->zzd:Lcom/google/android/gms/common/util/Clock;

    return-object v0
.end method
