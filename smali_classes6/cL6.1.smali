.class public final LcL6;
.super LjP6;
.source "SourceFile"


# instance fields
.field public final a:LhK6;

.field public final b:Landroid/content/Context;

.field public final c:LHK6;


# direct methods
.method public constructor <init>(Landroid/content/Context;LHK6;)V
    .locals 2

    invoke-direct {p0}, LjP6;-><init>()V

    new-instance v0, LhK6;

    const-string v1, "AssetPackExtractionService"

    invoke-direct {v0, v1}, LhK6;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LcL6;->a:LhK6;

    iput-object p1, p0, LcL6;->b:Landroid/content/Context;

    iput-object p2, p0, LcL6;->c:LHK6;

    return-void
.end method


# virtual methods
.method public final A4(Landroid/os/Bundle;LBP6;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LcL6;->a:LhK6;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateServiceState AIDL call"

    invoke-virtual {v0, v2, v1}, LhK6;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LcL6;->b:Landroid/content/Context;

    invoke-static {v0}, LyL6;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LcL6;->b:Landroid/content/Context;

    invoke-static {v0}, LyL6;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LcL6;->B1(Landroid/os/Bundle;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p2, p1, v0}, LBP6;->k1(Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void

    :cond_1
    :goto_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p2, p1}, LBP6;->B1(Landroid/os/Bundle;)V

    return-void
.end method

.method public final declared-synchronized B1(Landroid/os/Bundle;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, LcL6;->b:Landroid/content/Context;

    const-class v2, Lcom/google/android/play/core/assetpacks/ExtractionForegroundService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "action_type"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "action_type"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const-string v1, "notification_channel_name"

    const-string v2, "notification_channel_name"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "notification_title"

    const-string v2, "notification_title"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "notification_subtext"

    const-string v2, "notification_subtext"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "notification_timeout"

    const-string v2, "notification_timeout"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string v1, "notification_on_click_intent"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    instance-of v2, v1, Landroid/app/PendingIntent;

    if-eqz v2, :cond_0

    const-string v2, "notification_on_click_intent"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_0
    const-string v1, "notification_color"

    const-string v2, "notification_color"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    const/4 p1, 0x0

    :try_start_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_2

    iget-object v1, p0, LcL6;->b:Landroid/content/Context;

    invoke-static {v1, v0}, LPA0;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v1, p0, LcL6;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    :try_start_2
    iget-object v1, p0, LcL6;->a:LhK6;

    const-string v2, "Failed starting installation service."

    new-array v3, p1, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, LhK6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    iget-object v0, p0, LcL6;->a:LhK6;

    const-string v1, "Failed starting installation service."

    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final L4(LBP6;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LcL6;->a:LhK6;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearAssetPackStorage AIDL call"

    invoke-virtual {v0, v2, v1}, LhK6;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LcL6;->b:Landroid/content/Context;

    invoke-static {v0}, LyL6;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LcL6;->b:Landroid/content/Context;

    invoke-static {v0}, LyL6;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LcL6;->c:LHK6;

    invoke-virtual {v0}, LHK6;->K()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p1, v0}, LBP6;->p1(Landroid/os/Bundle;)V

    return-void

    :cond_1
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p1, v0}, LBP6;->B1(Landroid/os/Bundle;)V

    return-void
.end method
