.class public final Lpx0;
.super LAx0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LAx0<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field public static a:Lpx0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LAx0;-><init>()V

    return-void
.end method

.method public static declared-synchronized e()Lpx0;
    .locals 2

    const-class v0, Lpx0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lpx0;->a:Lpx0;

    if-nez v1, :cond_0

    new-instance v1, Lpx0;

    invoke-direct {v1}, Lpx0;-><init>()V

    sput-object v1, Lpx0;->a:Lpx0;

    :cond_0
    sget-object v1, Lpx0;->a:Lpx0;
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

    const-string v0, "com.google.firebase.perf.SdkDisabledVersions"

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "fpr_disabled_android_versions"

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
