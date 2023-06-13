.class public LAm1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAm1$b;,
        LAm1$c;,
        LAm1$a;
    }
.end annotation


# static fields
.field public static final k:Ljava/lang/Object;

.field public static final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LAm1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lpn1;

.field public final d:Let0;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:LYm2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYm2<",
            "LFS0;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "LtX0;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LAm1$a;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LAm1;->k:Ljava/lang/Object;

    new-instance v0, Lso;

    invoke-direct {v0}, Lso;-><init>()V

    sput-object v0, LAm1;->l:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lpn1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LAm1;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, LAm1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, LAm1;->i:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, LAm1;->j:Ljava/util/List;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, LAm1;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LAm1;->b:Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpn1;

    iput-object p2, p0, LAm1;->c:Lpn1;

    invoke-static {}, Lcom/google/firebase/provider/FirebaseInitProvider;->b()LpP5;

    move-result-object p2

    const-string v0, "Firebase"

    invoke-static {v0}, LSn1;->b(Ljava/lang/String;)V

    const-string v0, "ComponentDiscovery"

    invoke-static {v0}, LSn1;->b(Ljava/lang/String;)V

    const-class v0, Lcom/google/firebase/components/ComponentDiscoveryService;

    invoke-static {p1, v0}, LSs0;->c(Landroid/content/Context;Ljava/lang/Class;)LSs0;

    move-result-object v0

    invoke-virtual {v0}, LSs0;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {}, LSn1;->a()V

    const-string v2, "Runtime"

    invoke-static {v2}, LSn1;->b(Ljava/lang/String;)V

    sget-object v2, Lwd6;->b:Lwd6;

    invoke-static {v2}, Let0;->l(Ljava/util/concurrent/Executor;)Let0$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Let0$b;->d(Ljava/util/Collection;)Let0$b;

    move-result-object v0

    new-instance v2, Lcom/google/firebase/FirebaseCommonRegistrar;

    invoke-direct {v2}, Lcom/google/firebase/FirebaseCommonRegistrar;-><init>()V

    invoke-virtual {v0, v2}, Let0$b;->c(Lcom/google/firebase/components/ComponentRegistrar;)Let0$b;

    move-result-object v0

    new-instance v2, Lcom/google/firebase/concurrent/ExecutorsRegistrar;

    invoke-direct {v2}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;-><init>()V

    invoke-virtual {v0, v2}, Let0$b;->c(Lcom/google/firebase/components/ComponentRegistrar;)Let0$b;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p1, v2, v3}, LEs0;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LEs0;

    move-result-object v2

    invoke-virtual {v0, v2}, Let0$b;->b(LEs0;)Let0$b;

    move-result-object v0

    const-class v2, LAm1;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p0, v2, v3}, LEs0;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LEs0;

    move-result-object v2

    invoke-virtual {v0, v2}, Let0$b;->b(LEs0;)Let0$b;

    move-result-object v0

    const-class v2, Lpn1;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p3, v2, v3}, LEs0;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LEs0;

    move-result-object p3

    invoke-virtual {v0, p3}, Let0$b;->b(LEs0;)Let0$b;

    move-result-object p3

    new-instance v0, LXs0;

    invoke-direct {v0}, LXs0;-><init>()V

    invoke-virtual {p3, v0}, Let0$b;->g(LZs0;)Let0$b;

    move-result-object p3

    invoke-static {p1}, Lmh6;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/firebase/provider/FirebaseInitProvider;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-class v0, LpP5;

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {p2, v0, v1}, LEs0;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LEs0;

    move-result-object p2

    invoke-virtual {p3, p2}, Let0$b;->b(LEs0;)Let0$b;

    :cond_0
    invoke-virtual {p3}, Let0$b;->e()Let0;

    move-result-object p2

    iput-object p2, p0, LAm1;->d:Let0;

    invoke-static {}, LSn1;->a()V

    new-instance p3, LYm2;

    new-instance v0, Lym1;

    invoke-direct {v0, p0, p1}, Lym1;-><init>(LAm1;Landroid/content/Context;)V

    invoke-direct {p3, v0}, LYm2;-><init>(LX94;)V

    iput-object p3, p0, LAm1;->g:LYm2;

    const-class p1, LtX0;

    invoke-interface {p2, p1}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object p1

    iput-object p1, p0, LAm1;->h:LX94;

    new-instance p1, Lzm1;

    invoke-direct {p1, p0}, Lzm1;-><init>(LAm1;)V

    invoke-virtual {p0, p1}, LAm1;->g(LAm1$a;)V

    invoke-static {}, LSn1;->a()V

    return-void
.end method

.method public static synthetic a(LAm1;Z)V
    .locals 0

    invoke-direct {p0, p1}, LAm1;->v(Z)V

    return-void
.end method

.method public static synthetic b(LAm1;Landroid/content/Context;)LFS0;
    .locals 0

    invoke-direct {p0, p1}, LAm1;->u(Landroid/content/Context;)LFS0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, LAm1;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic d(LAm1;)V
    .locals 0

    invoke-virtual {p0}, LAm1;->o()V

    return-void
.end method

.method public static synthetic e(LAm1;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, LAm1;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic f(LAm1;Z)V
    .locals 0

    invoke-virtual {p0, p1}, LAm1;->x(Z)V

    return-void
.end method

.method public static k()LAm1;
    .locals 4

    sget-object v0, LAm1;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LAm1;->l:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAm1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Default FirebaseApp is not initialized in this process "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/google/android/gms/common/util/ProcessUtils;->getMyProcessName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". Make sure to call FirebaseApp.initializeApp(Context) first."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static p(Landroid/content/Context;)LAm1;
    .locals 3

    sget-object v0, LAm1;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LAm1;->l:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, LAm1;->k()LAm1;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :cond_0
    invoke-static {p0}, Lpn1;->a(Landroid/content/Context;)Lpn1;

    move-result-object v1

    if-nez v1, :cond_1

    const-string p0, "FirebaseApp"

    const-string v1, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project."

    invoke-static {p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-static {p0, v1}, LAm1;->q(Landroid/content/Context;Lpn1;)LAm1;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static q(Landroid/content/Context;Lpn1;)LAm1;
    .locals 1

    const-string v0, "[DEFAULT]"

    invoke-static {p0, p1, v0}, LAm1;->r(Landroid/content/Context;Lpn1;Ljava/lang/String;)LAm1;

    move-result-object p0

    return-object p0
.end method

.method public static r(Landroid/content/Context;Lpn1;Ljava/lang/String;)LAm1;
    .locals 5

    invoke-static {p0}, LAm1$b;->a(Landroid/content/Context;)V

    invoke-static {p2}, LAm1;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    :goto_0
    sget-object v0, LAm1;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LAm1;->l:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "FirebaseApp name "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " already exists!"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(ZLjava/lang/Object;)V

    const-string v2, "Application context cannot be null."

    invoke-static {p0, v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LAm1;

    invoke-direct {v2, p0, p2, p1}, LAm1;-><init>(Landroid/content/Context;Ljava/lang/String;Lpn1;)V

    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, LAm1;->o()V

    return-object v2

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private synthetic u(Landroid/content/Context;)LFS0;
    .locals 4

    new-instance v0, LFS0;

    invoke-virtual {p0}, LAm1;->n()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LAm1;->d:Let0;

    const-class v3, Loa4;

    invoke-interface {v2, v3}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loa4;

    invoke-direct {v0, p1, v1, v2}, LFS0;-><init>(Landroid/content/Context;Ljava/lang/String;Loa4;)V

    return-object v0
.end method

.method private synthetic v(Z)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, LAm1;->h:LX94;

    invoke-interface {p1}, LX94;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LtX0;

    invoke-virtual {p1}, LtX0;->l()Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public static w(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LAm1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LAm1;->b:Ljava/lang/String;

    check-cast p1, LAm1;

    invoke-virtual {p1}, LAm1;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g(LAm1$a;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    invoke-virtual {p0}, LAm1;->h()V

    iget-object v0, p0, LAm1;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->getInstance()Lcom/google/android/gms/common/api/internal/BackgroundDetector;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->isInBackground()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LAm1$a;->onBackgroundStateChanged(Z)V

    :cond_0
    iget-object v0, p0, LAm1;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, LAm1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp was deleted"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(ZLjava/lang/Object;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LAm1;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, LAm1;->h()V

    iget-object v0, p0, LAm1;->d:Let0;

    invoke-interface {v0, p1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, LAm1;->h()V

    iget-object v0, p0, LAm1;->a:Landroid/content/Context;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LAm1;->h()V

    iget-object v0, p0, LAm1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public m()Lpn1;
    .locals 1

    invoke-virtual {p0}, LAm1;->h()V

    iget-object v0, p0, LAm1;->c:Lpn1;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LAm1;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/util/Base64Utils;->encodeUrlSafeNoPadding([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LAm1;->m()Lpn1;

    move-result-object v1

    invoke-virtual {v1}, Lpn1;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/util/Base64Utils;->encodeUrlSafeNoPadding([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, LAm1;->a:Landroid/content/Context;

    invoke-static {v0}, Lmh6;->a(Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LAm1;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, LAm1;->a:Landroid/content/Context;

    invoke-static {v0}, LAm1$c;->a(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device unlocked: initializing all Firebase APIs for app "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LAm1;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, LAm1;->d:Let0;

    invoke-virtual {p0}, LAm1;->t()Z

    move-result v1

    invoke-virtual {v0, v1}, Let0;->o(Z)V

    iget-object v0, p0, LAm1;->h:LX94;

    invoke-interface {v0}, LX94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LtX0;

    invoke-virtual {v0}, LtX0;->l()Lcom/google/android/gms/tasks/Task;

    :goto_0
    return-void
.end method

.method public s()Z
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    invoke-virtual {p0}, LAm1;->h()V

    iget-object v0, p0, LAm1;->g:LYm2;

    invoke-virtual {v0}, LYm2;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFS0;

    invoke-virtual {v0}, LFS0;->b()Z

    move-result v0

    return v0
.end method

.method public t()Z
    .locals 2
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    const-string v0, "[DEFAULT]"

    invoke-virtual {p0}, LAm1;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Objects;->toStringHelper(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "name"

    iget-object v2, p0, LAm1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "options"

    iget-object v2, p0, LAm1;->c:Lpn1;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x(Z)V
    .locals 2

    const-string v0, "FirebaseApp"

    const-string v1, "Notifying background state change listeners."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, LAm1;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAm1$a;

    invoke-interface {v1, p1}, LAm1$a;->onBackgroundStateChanged(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method
