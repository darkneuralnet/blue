.class final Lcom/google/ar/core/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/google/ar/core/h;

.field final synthetic c:Lcom/google/ar/core/u;


# direct methods
.method public constructor <init>(Lcom/google/ar/core/u;Landroid/content/Context;Lcom/google/ar/core/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/core/x;->c:Lcom/google/ar/core/u;

    iput-object p2, p0, Lcom/google/ar/core/x;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/ar/core/x;->b:Lcom/google/ar/core/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/google/ar/core/x;->c:Lcom/google/ar/core/u;

    invoke-static {v0}, Lcom/google/ar/core/u;->f(Lcom/google/ar/core/u;)Lcom/google/ar/core/dependencies/h;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ar/core/x;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-static {}, Lcom/google/ar/core/u;->k()Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, Lcom/google/ar/core/w;

    invoke-direct {v3, p0}, Lcom/google/ar/core/w;-><init>(Lcom/google/ar/core/x;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/google/ar/core/dependencies/h;->d(Ljava/lang/String;Landroid/os/Bundle;Lcom/google/ar/core/dependencies/j;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "ARCore-InstallService"

    const-string v2, "requestInfo threw"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lcom/google/ar/core/x;->b:Lcom/google/ar/core/h;

    sget-object v1, Lcom/google/ar/core/ArCoreApk$Availability;->UNKNOWN_ERROR:Lcom/google/ar/core/ArCoreApk$Availability;

    invoke-interface {v0, v1}, Lcom/google/ar/core/h;->a(Lcom/google/ar/core/ArCoreApk$Availability;)V

    return-void
.end method
