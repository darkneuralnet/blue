.class public Lcom/facebook/login/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/c;->g(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Lcom/facebook/login/c;


# direct methods
.method public constructor <init>(Lcom/facebook/login/c;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/c$a;->c:Lcom/facebook/login/c;

    iput-object p2, p0, Lcom/facebook/login/c$a;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/login/c$a;->c:Lcom/facebook/login/c;

    invoke-static {v0}, Lcom/facebook/login/c;->a(Lcom/facebook/login/c;)Ln62;

    move-result-object v0

    const-string v1, "fb_mobile_login_heartbeat"

    iget-object v2, p0, Lcom/facebook/login/c$a;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Ln62;->h(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
