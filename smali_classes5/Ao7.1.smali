.class public final LAo7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static k:LvU8;

.field public static final l:LQU8;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lzo7;

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

    invoke-static {v0, v1}, LQU8;->c(Ljava/lang/Object;Ljava/lang/Object;)LQU8;

    move-result-object v0

    sput-object v0, LAo7;->l:LQU8;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LZy5;Lzo7;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LAo7;->i:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LAo7;->j:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LAo7;->a:Ljava/lang/String;

    invoke-static {p1}, LCp0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LAo7;->b:Ljava/lang/String;

    iput-object p2, p0, LAo7;->d:LZy5;

    iput-object p3, p0, LAo7;->c:Lzo7;

    iput-object p4, p0, LAo7;->g:Ljava/lang/String;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    new-instance v0, Lyo7;

    invoke-direct {v0, p4}, Lyo7;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, LAo7;->e:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lxo7;

    invoke-direct {v0, p2}, Lxo7;-><init>(LZy5;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, LAo7;->f:Lcom/google/android/gms/tasks/Task;

    sget-object p2, LAo7;->l:LQU8;

    invoke-virtual {p2, p4}, LQU8;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, LQU8;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, LAo7;->h:I

    return-void
.end method

.method public static declared-synchronized d()LvU8;
    .locals 5

    const-class v0, LAo7;

    monitor-enter v0

    :try_start_0
    sget-object v1, LAo7;->k:LvU8;
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

    new-instance v2, LlT8;

    invoke-direct {v2}, LlT8;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lvv2;->h()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v1, v3}, Lvv2;->c(I)Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4}, LCp0;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, LlT8;->c(Ljava/lang/Object;)LlT8;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, LlT8;->d()LvU8;

    move-result-object v1

    sput-object v1, LAo7;->k:LvU8;
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
.method public final synthetic a(Lso7;LWk7;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p1, p2}, Lso7;->b(LWk7;)Lso7;

    invoke-interface {p1}, Lso7;->zzd()Ljava/lang/String;

    move-result-object p2

    new-instance v0, LCm7;

    invoke-direct {v0}, LCm7;-><init>()V

    iget-object v1, p0, LAo7;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, LCm7;->b(Ljava/lang/String;)LCm7;

    iget-object v1, p0, LAo7;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, LCm7;->c(Ljava/lang/String;)LCm7;

    invoke-static {}, LAo7;->d()LvU8;

    move-result-object v1

    invoke-virtual {v0, v1}, LCm7;->h(LvU8;)LCm7;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, LCm7;->g(Ljava/lang/Boolean;)LCm7;

    invoke-virtual {v0, p2}, LCm7;->l(Ljava/lang/String;)LCm7;

    invoke-virtual {v0, p3}, LCm7;->j(Ljava/lang/String;)LCm7;

    iget-object p2, p0, LAo7;->f:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LAo7;->f:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, LAo7;->d:LZy5;

    invoke-virtual {p2}, LZy5;->a()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, p2}, LCm7;->i(Ljava/lang/String;)LCm7;

    const/16 p2, 0xa

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, LCm7;->d(Ljava/lang/Integer;)LCm7;

    iget p2, p0, LAo7;->h:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, LCm7;->k(Ljava/lang/Integer;)LCm7;

    invoke-interface {p1, v0}, Lso7;->c(LCm7;)Lso7;

    iget-object p2, p0, LAo7;->c:Lzo7;

    invoke-interface {p2, p1}, Lzo7;->a(Lso7;)V

    return-void
.end method

.method public final b(Lso7;LWk7;)V
    .locals 2

    iget-object v0, p0, LAo7;->e:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LAo7;->e:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/LibraryVersion;->getInstance()Lcom/google/android/gms/common/internal/LibraryVersion;

    move-result-object v0

    iget-object v1, p0, LAo7;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/LibraryVersion;->getVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, p1, p2, v0}, LAo7;->c(Lso7;LWk7;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lso7;LWk7;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, LME2;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lwo7;

    invoke-direct {v1, p0, p1, p2, p3}, Lwo7;-><init>(LAo7;Lso7;LWk7;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
