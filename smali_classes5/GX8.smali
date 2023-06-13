.class public final LGX8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static k:LeL7;

.field public static final l:LIL7;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:LwX8;

.field public final d:LZy5;

.field public final e:Lcom/google/android/gms/tasks/Task;

.field public final f:Lcom/google/android/gms/tasks/Task;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:Ljava/util/Map;

.field public final j:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "optional-module-barcode"

    const-string v1, "com.google.android.gms.vision.barcode"

    invoke-static {v0, v1}, LIL7;->c(Ljava/lang/Object;Ljava/lang/Object;)LIL7;

    move-result-object v0

    sput-object v0, LGX8;->l:LIL7;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LZy5;LwX8;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LGX8;->i:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LGX8;->j:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LGX8;->a:Ljava/lang/String;

    invoke-static {p1}, LCp0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LGX8;->b:Ljava/lang/String;

    iput-object p2, p0, LGX8;->d:LZy5;

    iput-object p3, p0, LGX8;->c:LwX8;

    invoke-static {}, LXZ8;->a()LXZ8;

    iput-object p4, p0, LGX8;->g:Ljava/lang/String;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    new-instance v0, LmX8;

    invoke-direct {v0, p0}, LmX8;-><init>(LGX8;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, LGX8;->e:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    new-instance v0, LcX8;

    invoke-direct {v0, p2}, LcX8;-><init>(LZy5;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, LGX8;->f:Lcom/google/android/gms/tasks/Task;

    sget-object p2, LGX8;->l:LIL7;

    invoke-virtual {p2, p4}, LIL7;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, LIL7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, LGX8;->h:I

    return-void
.end method

.method public static declared-synchronized d()LeL7;
    .locals 5

    const-class v0, LGX8;

    monitor-enter v0

    :try_start_0
    sget-object v1, LGX8;->k:LeL7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-static {v1}, Lfx0;->a(Landroid/content/res/Configuration;)Lvv2;

    move-result-object v1

    new-instance v2, LCJ7;

    invoke-direct {v2}, LCJ7;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lvv2;->h()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v1, v3}, Lvv2;->c(I)Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4}, LCp0;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, LCJ7;->c(Ljava/lang/Object;)LCJ7;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, LCJ7;->d()LeL7;

    move-result-object v1

    sput-object v1, LGX8;->k:LeL7;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/internal/LibraryVersion;->getInstance()Lcom/google/android/gms/common/internal/LibraryVersion;

    move-result-object v0

    iget-object v1, p0, LGX8;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/LibraryVersion;->getVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic b(LkY8;LIH8;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1, p2}, LkY8;->e(LIH8;)LkY8;

    invoke-virtual {p1}, LkY8;->b()Ljava/lang/String;

    move-result-object p2

    new-instance v0, LNQ8;

    invoke-direct {v0}, LNQ8;-><init>()V

    iget-object v1, p0, LGX8;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, LNQ8;->b(Ljava/lang/String;)LNQ8;

    iget-object v1, p0, LGX8;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, LNQ8;->c(Ljava/lang/String;)LNQ8;

    invoke-static {}, LGX8;->d()LeL7;

    move-result-object v1

    invoke-virtual {v0, v1}, LNQ8;->h(LeL7;)LNQ8;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, LNQ8;->g(Ljava/lang/Boolean;)LNQ8;

    invoke-virtual {v0, p2}, LNQ8;->l(Ljava/lang/String;)LNQ8;

    invoke-virtual {v0, p3}, LNQ8;->j(Ljava/lang/String;)LNQ8;

    iget-object p2, p0, LGX8;->f:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LGX8;->f:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, LGX8;->d:LZy5;

    invoke-virtual {p2}, LZy5;->a()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, p2}, LNQ8;->i(Ljava/lang/String;)LNQ8;

    const/16 p2, 0xa

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, LNQ8;->d(Ljava/lang/Integer;)LNQ8;

    iget p2, p0, LGX8;->h:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, LNQ8;->k(Ljava/lang/Integer;)LNQ8;

    invoke-virtual {p1, v0}, LkY8;->f(LNQ8;)LkY8;

    iget-object p2, p0, LGX8;->c:LwX8;

    invoke-interface {p2, p1}, LwX8;->a(LkY8;)V

    return-void
.end method

.method public final c(LaQ7;LIH8;)V
    .locals 9

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, LGX8;->i:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, LGX8;->i:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long v2, v0, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1e

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gtz v2, :cond_1

    return-void

    :cond_1
    :goto_0
    iget-object v2, p0, LGX8;->i:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, LaQ7;->a:Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;

    iget-object v1, p1, LaQ7;->b:LxH8;

    iget p1, p1, LaQ7;->c:I

    new-instance v2, LUH8;

    invoke-direct {v2}, LUH8;-><init>()V

    sget-object v3, LEG8;->e:LEG8;

    invoke-virtual {v2, v3}, LUH8;->d(LEG8;)LUH8;

    new-instance v3, LAC8;

    invoke-direct {v3}, LAC8;-><init>()V

    new-instance v4, LiD8;

    invoke-direct {v4}, LiD8;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->u()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_2

    sget-object v5, LuD8;->e:LuD8;

    invoke-virtual {v4, v5}, LiD8;->a(LuD8;)LiD8;

    goto :goto_1

    :cond_2
    sget-object v5, LuD8;->d:LuD8;

    invoke-virtual {v4, v5}, LiD8;->a(LuD8;)LiD8;

    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->zzd()I

    move-result v5

    if-ne v5, v6, :cond_3

    sget-object v5, LSD8;->e:LSD8;

    invoke-virtual {v4, v5}, LiD8;->d(LSD8;)LiD8;

    goto :goto_2

    :cond_3
    sget-object v5, LSD8;->d:LSD8;

    invoke-virtual {v4, v5}, LiD8;->d(LSD8;)LiD8;

    :goto_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->zzc()I

    move-result v5

    if-ne v5, v6, :cond_4

    sget-object v5, LGD8;->e:LGD8;

    invoke-virtual {v4, v5}, LiD8;->b(LGD8;)LiD8;

    goto :goto_3

    :cond_4
    sget-object v5, LGD8;->d:LGD8;

    invoke-virtual {v4, v5}, LiD8;->b(LGD8;)LiD8;

    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->v()I

    move-result v5

    if-ne v5, v6, :cond_5

    sget-object v5, LdE8;->e:LdE8;

    invoke-virtual {v4, v5}, LiD8;->f(LdE8;)LiD8;

    goto :goto_4

    :cond_5
    sget-object v5, LdE8;->d:LdE8;

    invoke-virtual {v4, v5}, LiD8;->f(LdE8;)LiD8;

    :goto_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->s()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v4, v5}, LiD8;->e(Ljava/lang/Float;)LiD8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->x()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v0}, LiD8;->c(Ljava/lang/Boolean;)LiD8;

    invoke-virtual {v4}, LiD8;->k()LBE8;

    move-result-object v0

    invoke-virtual {v3, v0}, LAC8;->b(LBE8;)LAC8;

    invoke-virtual {v3, v1}, LAC8;->a(LxH8;)LAC8;

    invoke-virtual {v3}, LAC8;->c()LWC8;

    move-result-object v0

    invoke-virtual {v2, v0}, LUH8;->f(LWC8;)LUH8;

    invoke-static {v2, p1}, LkY8;->d(LUH8;I)LkY8;

    move-result-object v5

    iget-object p1, p0, LGX8;->e:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, LGX8;->e:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_5

    :cond_6
    invoke-static {}, Lcom/google/android/gms/common/internal/LibraryVersion;->getInstance()Lcom/google/android/gms/common/internal/LibraryVersion;

    move-result-object p1

    iget-object v0, p0, LGX8;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/internal/LibraryVersion;->getVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_5
    move-object v7, p1

    invoke-static {}, LME2;->d()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v0, LSW8;

    const/4 v8, 0x0

    move-object v3, v0

    move-object v4, p0

    move-object v6, p2

    invoke-direct/range {v3 .. v8}, LSW8;-><init>(LGX8;LkY8;LIH8;Ljava/lang/String;[B)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
