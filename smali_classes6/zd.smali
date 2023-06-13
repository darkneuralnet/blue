.class public Lzd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z

.field public static final b:Z

.field public static c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lzd;->a()Z

    move-result v0

    sput-boolean v0, Lzd;->a:Z

    invoke-static {}, Lzd;->f()Z

    move-result v0

    sput-boolean v0, Lzd;->b:Z

    const/4 v0, 0x0

    sput-boolean v0, Lzd;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 1

    :try_start_0
    const-string v0, "android.app.Activity"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b()V
    .locals 2

    invoke-static {}, Lzd;->e()Z

    move-result v0

    const-string v1, "Sceneform requires Android N or later"

    invoke-static {v0, v1}, LDZ3;->f(ZLjava/lang/Object;)V

    return-void
.end method

.method public static c()V
    .locals 2

    invoke-static {}, Lzd;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lzd;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Must be called from the UI thread."

    invoke-static {v0, v1}, LDZ3;->f(ZLjava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static d()Z
    .locals 1

    sget-boolean v0, Lzd;->a:Z

    return v0
.end method

.method public static e()Z
    .locals 1

    invoke-static {}, Lzd;->g()Z

    move-result v0

    if-nez v0, :cond_1

    sget-boolean v0, Lzd;->b:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static f()Z
    .locals 1

    invoke-static {}, Lzd;->d()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static g()Z
    .locals 1

    sget-boolean v0, Lzd;->c:Z

    return v0
.end method
