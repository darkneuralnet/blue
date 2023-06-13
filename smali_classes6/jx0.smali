.class public final Ljx0;
.super LAx0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LAx0<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# static fields
.field public static a:Ljx0;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LAx0;-><init>()V

    return-void
.end method

.method public static declared-synchronized e()Ljx0;
    .locals 2

    const-class v0, Ljx0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ljx0;->a:Ljx0;

    if-nez v1, :cond_0

    new-instance v1, Ljx0;

    invoke-direct {v1}, Ljx0;-><init>()V

    sput-object v1, Ljx0;->a:Ljx0;

    :cond_0
    sget-object v1, Ljx0;->a:Ljx0;
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

    const-string v0, "com.google.firebase.perf.FragmentSamplingRate"

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "fragment_sampling_percentage"

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "fpr_vc_fragment_sampling_rate"

    return-object v0
.end method

.method public d()Ljava/lang/Double;
    .locals 2

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method
