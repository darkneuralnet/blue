.class public final Lzc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRY5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzc0$a;,
        Lzc0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LRY5<",
        "Lyc0;",
        ">;"
    }
.end annotation


# static fields
.field public static final F:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "LFb0$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Lxb0$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final H:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "LVf6$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final I:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public static final J:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field public static final K:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final L:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Lic0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Landroidx/camera/core/impl/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.appConfig.cameraFactoryProvider"

    const-class v1, LFb0$a;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Lzc0;->F:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.appConfig.deviceSurfaceManagerProvider"

    const-class v1, Lxb0$a;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Lzc0;->G:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.appConfig.useCaseConfigFactoryProvider"

    const-class v1, LVf6$c;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Lzc0;->H:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.appConfig.cameraExecutor"

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Lzc0;->I:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.appConfig.schedulerHandler"

    const-class v1, Landroid/os/Handler;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Lzc0;->J:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.appConfig.minimumLoggingLevel"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Lzc0;->K:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.appConfig.availableCamerasLimiter"

    const-class v1, Lic0;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Lzc0;->L:Landroidx/camera/core/impl/f$a;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzc0;->E:Landroidx/camera/core/impl/n;

    return-void
.end method


# virtual methods
.method public B()Landroidx/camera/core/impl/f;
    .locals 1

    iget-object v0, p0, Lzc0;->E:Landroidx/camera/core/impl/n;

    return-object v0
.end method

.method public R(Lic0;)Lic0;
    .locals 2

    iget-object v0, p0, Lzc0;->E:Landroidx/camera/core/impl/n;

    sget-object v1, Lzc0;->L:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/n;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lic0;

    return-object p1
.end method

.method public S(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 2

    iget-object v0, p0, Lzc0;->E:Landroidx/camera/core/impl/n;

    sget-object v1, Lzc0;->I:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/n;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method

.method public T(LFb0$a;)LFb0$a;
    .locals 2

    iget-object v0, p0, Lzc0;->E:Landroidx/camera/core/impl/n;

    sget-object v1, Lzc0;->F:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/n;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LFb0$a;

    return-object p1
.end method

.method public U(Lxb0$a;)Lxb0$a;
    .locals 2

    iget-object v0, p0, Lzc0;->E:Landroidx/camera/core/impl/n;

    sget-object v1, Lzc0;->G:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/n;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxb0$a;

    return-object p1
.end method

.method public V(Landroid/os/Handler;)Landroid/os/Handler;
    .locals 2

    iget-object v0, p0, Lzc0;->E:Landroidx/camera/core/impl/n;

    sget-object v1, Lzc0;->J:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/n;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    return-object p1
.end method

.method public W(LVf6$c;)LVf6$c;
    .locals 2

    iget-object v0, p0, Lzc0;->E:Landroidx/camera/core/impl/n;

    sget-object v1, Lzc0;->H:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/n;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LVf6$c;

    return-object p1
.end method
