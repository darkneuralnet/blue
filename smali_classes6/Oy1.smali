.class public LOy1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lad;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:LMy1;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/fragment/app/Fragment;",
            "LNy1$a;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lad;->e()Lad;

    move-result-object v0

    sput-object v0, LOy1;->e:Lad;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    new-instance v0, LMy1;

    invoke-direct {v0}, LMy1;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, p1, v0, v1}, LOy1;-><init>(Landroid/app/Activity;LMy1;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;LMy1;Ljava/util/Map;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "LMy1;",
            "Ljava/util/Map<",
            "Landroidx/fragment/app/Fragment;",
            "LNy1$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LOy1;->d:Z

    iput-object p1, p0, LOy1;->a:Landroid/app/Activity;

    iput-object p2, p0, LOy1;->b:LMy1;

    iput-object p3, p0, LOy1;->c:Ljava/util/Map;

    return-void
.end method

.method public static a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final b()Ljy3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljy3<",
            "LNy1$a;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, LOy1;->d:Z

    if-nez v0, :cond_0

    sget-object v0, LOy1;->e:Lad;

    const-string v1, "No recording has been started."

    invoke-virtual {v0, v1}, Lad;->a(Ljava/lang/String;)V

    invoke-static {}, Ljy3;->a()Ljy3;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LOy1;->b:LMy1;

    invoke-virtual {v0}, LMy1;->b()[Landroid/util/SparseIntArray;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, LOy1;->e:Lad;

    const-string v1, "FrameMetricsAggregator.mMetrics is uninitialized."

    invoke-virtual {v0, v1}, Lad;->a(Ljava/lang/String;)V

    invoke-static {}, Ljy3;->a()Ljy3;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v1, 0x0

    aget-object v1, v0, v1

    if-nez v1, :cond_2

    sget-object v0, LOy1;->e:Lad;

    const-string v1, "FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized."

    invoke-virtual {v0, v1}, Lad;->a(Ljava/lang/String;)V

    invoke-static {}, Ljy3;->a()Ljy3;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-static {v0}, LNy1;->a([Landroid/util/SparseIntArray;)LNy1$a;

    move-result-object v0

    invoke-static {v0}, Ljy3;->e(Ljava/lang/Object;)Ljy3;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 4

    iget-boolean v0, p0, LOy1;->d:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    sget-object v0, LOy1;->e:Lad;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, LOy1;->a:Landroid/app/Activity;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "FrameMetricsAggregator is already recording %s"

    invoke-virtual {v0, v2, v1}, Lad;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, LOy1;->b:LMy1;

    iget-object v2, p0, LOy1;->a:Landroid/app/Activity;

    invoke-virtual {v0, v2}, LMy1;->a(Landroid/app/Activity;)V

    iput-boolean v1, p0, LOy1;->d:Z

    return-void
.end method

.method public d(Landroidx/fragment/app/Fragment;)V
    .locals 4

    iget-boolean v0, p0, LOy1;->d:Z

    if-nez v0, :cond_0

    sget-object p1, LOy1;->e:Lad;

    const-string v0, "Cannot start sub-recording because FrameMetricsAggregator is not recording"

    invoke-virtual {p1, v0}, Lad;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, LOy1;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    sget-object v0, LOy1;->e:Lad;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    const-string p1, "Cannot start sub-recording because one is already ongoing with the key %s"

    invoke-virtual {v0, p1, v2}, Lad;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, LOy1;->b()Ljy3;

    move-result-object v0

    invoke-virtual {v0}, Ljy3;->d()Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v0, LOy1;->e:Lad;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    const-string p1, "startFragment(%s): snapshot() failed"

    invoke-virtual {v0, p1, v2}, Lad;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    iget-object v1, p0, LOy1;->c:Ljava/util/Map;

    invoke-virtual {v0}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNy1$a;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e()Ljy3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljy3<",
            "LNy1$a;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, LOy1;->d:Z

    if-nez v0, :cond_0

    sget-object v0, LOy1;->e:Lad;

    const-string v1, "Cannot stop because no recording was started"

    invoke-virtual {v0, v1}, Lad;->a(Ljava/lang/String;)V

    invoke-static {}, Ljy3;->a()Ljy3;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LOy1;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, LOy1;->e:Lad;

    const-string v1, "Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace."

    invoke-virtual {v0, v1}, Lad;->a(Ljava/lang/String;)V

    iget-object v0, p0, LOy1;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_1
    invoke-virtual {p0}, LOy1;->b()Ljy3;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LOy1;->b:LMy1;

    iget-object v3, p0, LOy1;->a:Landroid/app/Activity;

    invoke-virtual {v2, v3}, LMy1;->c(Landroid/app/Activity;)[Landroid/util/SparseIntArray;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    instance-of v2, v0, Ljava/lang/NullPointerException;

    if-eqz v2, :cond_3

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-gt v2, v3, :cond_2

    goto :goto_1

    :cond_2
    throw v0

    :cond_3
    :goto_1
    sget-object v2, LOy1;->e:Lad;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v1

    const-string v0, "View not hardware accelerated. Unable to collect FrameMetrics. %s"

    invoke-virtual {v2, v0, v3}, Lad;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ljy3;->a()Ljy3;

    move-result-object v0

    :goto_2
    iget-object v2, p0, LOy1;->b:LMy1;

    invoke-virtual {v2}, LMy1;->d()[Landroid/util/SparseIntArray;

    iput-boolean v1, p0, LOy1;->d:Z

    return-object v0
.end method

.method public f(Landroidx/fragment/app/Fragment;)Ljy3;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            ")",
            "Ljy3<",
            "LNy1$a;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, LOy1;->d:Z

    if-nez v0, :cond_0

    sget-object p1, LOy1;->e:Lad;

    const-string v0, "Cannot stop sub-recording because FrameMetricsAggregator is not recording"

    invoke-virtual {p1, v0}, Lad;->a(Ljava/lang/String;)V

    invoke-static {}, Ljy3;->a()Ljy3;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LOy1;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    sget-object v0, LOy1;->e:Lad;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    const-string p1, "Sub-recording associated with key %s was not started or does not exist"

    invoke-virtual {v0, p1, v2}, Lad;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ljy3;->a()Ljy3;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, LOy1;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNy1$a;

    invoke-virtual {p0}, LOy1;->b()Ljy3;

    move-result-object v3

    invoke-virtual {v3}, Ljy3;->d()Z

    move-result v4

    if-nez v4, :cond_2

    sget-object v0, LOy1;->e:Lad;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    const-string p1, "stopFragment(%s): snapshot() failed"

    invoke-virtual {v0, p1, v2}, Lad;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ljy3;->a()Ljy3;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {v3}, Ljy3;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LNy1$a;

    invoke-virtual {p1, v0}, LNy1$a;->a(LNy1$a;)LNy1$a;

    move-result-object p1

    invoke-static {p1}, Ljy3;->e(Ljava/lang/Object;)Ljy3;

    move-result-object p1

    return-object p1
.end method
