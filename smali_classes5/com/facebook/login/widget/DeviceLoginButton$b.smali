.class public Lcom/facebook/login/widget/DeviceLoginButton$b;
.super Lcom/facebook/login/widget/LoginButton$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/widget/DeviceLoginButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic c:Lcom/facebook/login/widget/DeviceLoginButton;


# direct methods
.method public constructor <init>(Lcom/facebook/login/widget/DeviceLoginButton;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/widget/DeviceLoginButton$b;->c:Lcom/facebook/login/widget/DeviceLoginButton;

    invoke-direct {p0, p1}, Lcom/facebook/login/widget/LoginButton$e;-><init>(Lcom/facebook/login/widget/LoginButton;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/login/widget/DeviceLoginButton;Lcom/facebook/login/widget/DeviceLoginButton$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/login/widget/DeviceLoginButton$b;-><init>(Lcom/facebook/login/widget/DeviceLoginButton;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/login/d;
    .locals 3

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/login/a;->x()Lcom/facebook/login/a;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/login/widget/DeviceLoginButton$b;->c:Lcom/facebook/login/widget/DeviceLoginButton;

    invoke-virtual {v2}, Lcom/facebook/login/widget/LoginButton;->F()LrW0;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/login/d;->o(LrW0;)Lcom/facebook/login/d;

    sget-object v2, Lay2;->n:Lay2;

    invoke-virtual {v0, v2}, Lcom/facebook/login/d;->q(Lay2;)Lcom/facebook/login/d;

    iget-object v2, p0, Lcom/facebook/login/widget/DeviceLoginButton$b;->c:Lcom/facebook/login/widget/DeviceLoginButton;

    invoke-virtual {v2}, Lcom/facebook/login/widget/DeviceLoginButton;->O()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/login/a;->y(Landroid/net/Uri;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v1
.end method
