.class public final Lsx0;
.super LAx0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LAx0<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# static fields
.field public static a:Lsx0;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LAx0;-><init>()V

    return-void
.end method

.method public static declared-synchronized e()Lsx0;
    .locals 2

    const-class v0, Lsx0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lsx0;->a:Lsx0;

    if-nez v1, :cond_0

    new-instance v1, Lsx0;

    invoke-direct {v1}, Lsx0;-><init>()V

    sput-object v1, Lsx0;->a:Lsx0;

    :cond_0
    sget-object v1, Lsx0;->a:Lsx0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs"

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "sessions_cpu_capture_frequency_fg_ms"

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "fpr_session_gauge_cpu_capture_frequency_fg_ms"

    return-object v0
.end method

.method public d()Ljava/lang/Long;
    .locals 2

    const-wide/16 v0, 0x64

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
