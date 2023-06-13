.class public LcQ3;
.super Ljj5;
.source "SourceFile"


# instance fields
.field public final a:Landroid/app/PendingIntent;

.field public b:Landroid/content/Context;

.field public c:Landroid/content/Context;

.field public d:J

.field public final e:J


# direct methods
.method public constructor <init>(Landroid/app/PendingIntent;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;)V
    .locals 0

    invoke-direct {p0}, Ljj5;-><init>()V

    iput-object p1, p0, LcQ3;->a:Landroid/app/PendingIntent;

    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j()J

    move-result-wide p1

    iput-wide p1, p0, LcQ3;->e:J

    return-void
.end method

.method public constructor <init>(Landroid/app/PendingIntent;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Landroid/app/Service;)V
    .locals 0

    invoke-direct {p0}, Ljj5;-><init>()V

    iput-object p1, p0, LcQ3;->a:Landroid/app/PendingIntent;

    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j()J

    move-result-wide p1

    iput-wide p1, p0, LcQ3;->e:J

    iput-object p3, p0, LcQ3;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LcQ3;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LcQ3;->c:Landroid/content/Context;

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, LcQ3;->d:J

    iget-wide v5, p0, LcQ3;->e:J

    sub-long v5, v1, v5

    const-wide/16 v7, 0x5

    add-long/2addr v5, v7

    cmp-long v3, v3, v5

    if-lez v3, :cond_2

    return-void

    :cond_2
    iput-wide v1, p0, LcQ3;->d:J

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "android.bluetooth.le.extra.CALLBACK_TYPE"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "android.bluetooth.le.extra.LIST_SCAN_RESULT"

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    const-class p1, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    iget-object p1, p0, LcQ3;->a:Landroid/app/PendingIntent;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Landroid/app/PendingIntent;->send(Landroid/content/Context;ILandroid/content/Intent;)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public b(I)V
    .locals 3

    iget-object v0, p0, LcQ3;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LcQ3;->c:Landroid/content/Context;

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "android.bluetooth.le.extra.ERROR_CODE"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p1, p0, LcQ3;->a:Landroid/app/PendingIntent;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Landroid/app/PendingIntent;->send(Landroid/content/Context;ILandroid/content/Intent;)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V
    .locals 3

    iget-object v0, p0, LcQ3;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LcQ3;->c:Landroid/content/Context;

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "android.bluetooth.le.extra.CALLBACK_TYPE"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "android.bluetooth.le.extra.LIST_SCAN_RESULT"

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v2, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    iget-object p1, p0, LcQ3;->a:Landroid/app/PendingIntent;

    const/4 p2, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/app/PendingIntent;->send(Landroid/content/Context;ILandroid/content/Intent;)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LcQ3;->b:Landroid/content/Context;

    return-void
.end method
