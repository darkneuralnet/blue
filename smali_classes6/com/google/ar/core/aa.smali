.class final Lcom/google/ar/core/aa;
.super Lcom/google/ar/core/dependencies/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic b:Lcom/google/ar/core/ac;


# direct methods
.method public constructor <init>(Lcom/google/ar/core/ac;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iput-object p2, p0, Lcom/google/ar/core/aa;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Lcom/google/ar/core/dependencies/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method public final c(Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/ar/core/aa;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "error.code"

    const/16 v1, -0x64

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "install.status"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    iget-object p1, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iget-object p1, p1, Lcom/google/ar/core/ac;->b:Lcom/google/ar/core/s;

    sget-object v0, Lcom/google/ar/core/t;->c:Lcom/google/ar/core/t;

    invoke-virtual {p1, v0}, Lcom/google/ar/core/s;->a(Lcom/google/ar/core/t;)V

    return-void

    :cond_1
    if-eqz v0, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "requestInstall = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", launching fullscreen."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ARCore-InstallService"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iget-object v0, p1, Lcom/google/ar/core/ac;->c:Lcom/google/ar/core/u;

    iget-object v1, p1, Lcom/google/ar/core/ac;->a:Landroid/app/Activity;

    iget-object p1, p1, Lcom/google/ar/core/ac;->b:Lcom/google/ar/core/s;

    invoke-static {v0, v1, p1}, Lcom/google/ar/core/u;->i(Lcom/google/ar/core/u;Landroid/app/Activity;Lcom/google/ar/core/s;)V

    return-void

    :cond_2
    const-string v0, "resolution.intent"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iget-object v1, v0, Lcom/google/ar/core/ac;->c:Lcom/google/ar/core/u;

    iget-object v2, v0, Lcom/google/ar/core/ac;->a:Landroid/app/Activity;

    iget-object v0, v0, Lcom/google/ar/core/ac;->b:Lcom/google/ar/core/s;

    invoke-static {v1, v2, p1, v0}, Lcom/google/ar/core/u;->j(Lcom/google/ar/core/u;Landroid/app/Activity;Landroid/os/Bundle;Lcom/google/ar/core/s;)V

    return-void

    :cond_3
    const/16 p1, 0xa

    if-eq v1, p1, :cond_4

    packed-switch v1, :pswitch_data_0

    iget-object p1, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iget-object p1, p1, Lcom/google/ar/core/ac;->b:Lcom/google/ar/core/s;

    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected install status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/ar/core/s;->b(Ljava/lang/Exception;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iget-object p1, p1, Lcom/google/ar/core/ac;->b:Lcom/google/ar/core/s;

    sget-object v0, Lcom/google/ar/core/t;->b:Lcom/google/ar/core/t;

    invoke-virtual {p1, v0}, Lcom/google/ar/core/s;->a(Lcom/google/ar/core/t;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iget-object p1, p1, Lcom/google/ar/core/ac;->b:Lcom/google/ar/core/s;

    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    const-string v1, "Unexpected FAILED install status without error."

    invoke-direct {v0, v1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/ar/core/s;->b(Ljava/lang/Exception;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iget-object p1, p1, Lcom/google/ar/core/ac;->b:Lcom/google/ar/core/s;

    sget-object v0, Lcom/google/ar/core/t;->c:Lcom/google/ar/core/t;

    invoke-virtual {p1, v0}, Lcom/google/ar/core/s;->a(Lcom/google/ar/core/t;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iget-object p1, p1, Lcom/google/ar/core/ac;->b:Lcom/google/ar/core/s;

    sget-object v0, Lcom/google/ar/core/t;->a:Lcom/google/ar/core/t;

    invoke-virtual {p1, v0}, Lcom/google/ar/core/s;->a(Lcom/google/ar/core/t;)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/google/ar/core/aa;->b:Lcom/google/ar/core/ac;

    iget-object p1, p1, Lcom/google/ar/core/ac;->b:Lcom/google/ar/core/s;

    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    const-string v1, "Unexpected REQUIRES_UI_INTENT install status without an intent."

    invoke-direct {v0, v1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/ar/core/s;->b(Ljava/lang/Exception;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
