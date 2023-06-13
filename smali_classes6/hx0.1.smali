.class public final Lhx0;
.super LAx0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LAx0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static a:Lhx0;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LAx0;-><init>()V

    return-void
.end method

.method public static declared-synchronized d()Lhx0;
    .locals 2

    const-class v0, Lhx0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lhx0;->a:Lhx0;

    if-nez v1, :cond_0

    new-instance v1, Lhx0;

    invoke-direct {v1}, Lhx0;-><init>()V

    sput-object v1, Lhx0;->a:Lhx0;

    :cond_0
    sget-object v1, Lhx0;->a:Lhx0;
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

    const-string v0, "isEnabled"

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "firebase_performance_collection_enabled"

    return-object v0
.end method
