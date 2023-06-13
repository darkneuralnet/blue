.class public Lno/nordicsemi/android/support/v18/scanner/b$b$a;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lno/nordicsemi/android/support/v18/scanner/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:J

.field public final synthetic b:Lno/nordicsemi/android/support/v18/scanner/b$b;


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/support/v18/scanner/b$b;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method

.method public static synthetic a(Lno/nordicsemi/android/support/v18/scanner/b$b$a;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->d(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lno/nordicsemi/android/support/v18/scanner/b$b$a;Landroid/bluetooth/le/ScanResult;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->f(Landroid/bluetooth/le/ScanResult;I)V

    return-void
.end method

.method public static synthetic c(Lno/nordicsemi/android/support/v18/scanner/b$b$a;I)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->e(I)V

    return-void
.end method

.method private synthetic d(Ljava/util/List;)V
    .locals 8

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->a:J

    iget-object v4, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    iget-object v4, v4, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    invoke-virtual {v4}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j()J

    move-result-wide v4

    sub-long v4, v0, v4

    const-wide/16 v6, 0x5

    add-long/2addr v4, v6

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    return-void

    :cond_0
    iput-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->a:J

    invoke-static {}, Lno/nordicsemi/android/support/v18/scanner/a;->b()Lno/nordicsemi/android/support/v18/scanner/a;

    move-result-object v0

    check-cast v0, Lno/nordicsemi/android/support/v18/scanner/b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/support/v18/scanner/b;->h(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/support/v18/scanner/a$a;->h(Ljava/util/List;)V

    return-void
.end method

.method private synthetic e(I)V
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    iget-object v0, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    invoke-virtual {v0}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    iget-object v0, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    invoke-virtual {v0}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    iget-object p1, p1, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->a()V

    invoke-static {}, Lno/nordicsemi/android/support/v18/scanner/a;->b()Lno/nordicsemi/android/support/v18/scanner/a;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    iget-object v0, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    invoke-virtual {p1, v0}, Lno/nordicsemi/android/support/v18/scanner/a;->e(Ljj5;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    iget-object v1, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->f:Ljava/util/List;

    iget-object v2, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    iget-object v3, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    iget-object v0, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->i:Landroid/os/Handler;

    invoke-virtual {p1, v1, v2, v3, v0}, Lno/nordicsemi/android/support/v18/scanner/a;->d(Ljava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/support/v18/scanner/a$a;->f(I)V

    return-void
.end method

.method private synthetic f(Landroid/bluetooth/le/ScanResult;I)V
    .locals 1

    invoke-static {}, Lno/nordicsemi/android/support/v18/scanner/a;->b()Lno/nordicsemi/android/support/v18/scanner/a;

    move-result-object v0

    check-cast v0, Lno/nordicsemi/android/support/v18/scanner/b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/support/v18/scanner/b;->g(Landroid/bluetooth/le/ScanResult;)Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    move-result-object p1

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    invoke-virtual {v0, p2, p1}, Lno/nordicsemi/android/support/v18/scanner/a$a;->g(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    return-void
.end method


# virtual methods
.method public onBatchScanResults(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/bluetooth/le/ScanResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    iget-object v0, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->i:Landroid/os/Handler;

    new-instance v1, LnX;

    invoke-direct {v1, p0, p1}, LnX;-><init>(Lno/nordicsemi/android/support/v18/scanner/b$b$a;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onScanFailed(I)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    iget-object v0, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->i:Landroid/os/Handler;

    new-instance v1, LoX;

    invoke-direct {v1, p0, p1}, LoX;-><init>(Lno/nordicsemi/android/support/v18/scanner/b$b$a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b$b$a;->b:Lno/nordicsemi/android/support/v18/scanner/b$b;

    iget-object v0, v0, Lno/nordicsemi/android/support/v18/scanner/a$a;->i:Landroid/os/Handler;

    new-instance v1, LpX;

    invoke-direct {v1, p0, p2, p1}, LpX;-><init>(Lno/nordicsemi/android/support/v18/scanner/b$b$a;Landroid/bluetooth/le/ScanResult;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
