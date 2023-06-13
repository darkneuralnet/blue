.class public Lno/nordicsemi/android/support/v18/scanner/b;
.super Lno/nordicsemi/android/support/v18/scanner/a;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lno/nordicsemi/android/support/v18/scanner/b$b;
    }
.end annotation


# instance fields
.field public final b:Lno/nordicsemi/android/support/v18/scanner/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lno/nordicsemi/android/support/v18/scanner/d<",
            "Lno/nordicsemi/android/support/v18/scanner/b$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lno/nordicsemi/android/support/v18/scanner/a;-><init>()V

    new-instance v0, Lno/nordicsemi/android/support/v18/scanner/d;

    invoke-direct {v0}, Lno/nordicsemi/android/support/v18/scanner/d;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b;->b:Lno/nordicsemi/android/support/v18/scanner/d;

    return-void
.end method


# virtual methods
.method public a(Ljj5;)V
    .locals 3

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz p1, :cond_3

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/b;->b:Lno/nordicsemi/android/support/v18/scanner/d;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lno/nordicsemi/android/support/v18/scanner/b;->b:Lno/nordicsemi/android/support/v18/scanner/d;

    invoke-virtual {v2, p1}, Lno/nordicsemi/android/support/v18/scanner/d;->d(Ljj5;)Lno/nordicsemi/android/support/v18/scanner/a$a;

    move-result-object p1

    check-cast p1, Lno/nordicsemi/android/support/v18/scanner/b$b;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    iget-object v1, p1, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedScanBatchingSupported()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lno/nordicsemi/android/support/v18/scanner/b$b;->j(Lno/nordicsemi/android/support/v18/scanner/b$b;)Landroid/bluetooth/le/ScanCallback;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/bluetooth/le/BluetoothLeScanner;->flushPendingScanResults(Landroid/bluetooth/le/ScanCallback;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/a$a;->e()V

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "callback not registered!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "callback cannot be null!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Ljava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;",
            ">;",
            "Lno/nordicsemi/android/support/v18/scanner/ScanSettings;",
            "Ljj5;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    move-object v1, p0

    move-object/from16 v0, p3

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedScanBatchingSupported()Z

    move-result v5

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedFilteringSupported()Z

    move-result v12

    iget-object v13, v1, Lno/nordicsemi/android/support/v18/scanner/b;->b:Lno/nordicsemi/android/support/v18/scanner/d;

    monitor-enter v13

    :try_start_0
    iget-object v4, v1, Lno/nordicsemi/android/support/v18/scanner/b;->b:Lno/nordicsemi/android/support/v18/scanner/d;

    invoke-virtual {v4, v0}, Lno/nordicsemi/android/support/v18/scanner/d;->c(Ljj5;)Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v9, LQh6;

    invoke-direct {v9, v0}, LQh6;-><init>(Ljj5;)V

    new-instance v0, Lno/nordicsemi/android/support/v18/scanner/b$b;

    const/4 v11, 0x0

    move-object v4, v0

    move v6, v12

    move-object v7, p1

    move-object/from16 v8, p2

    move-object/from16 v10, p4

    invoke-direct/range {v4 .. v11}, Lno/nordicsemi/android/support/v18/scanner/b$b;-><init>(ZZLjava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;Lno/nordicsemi/android/support/v18/scanner/b$a;)V

    iget-object v4, v1, Lno/nordicsemi/android/support/v18/scanner/b;->b:Lno/nordicsemi/android/support/v18/scanner/d;

    invoke-virtual {v4, v0}, Lno/nordicsemi/android/support/v18/scanner/d;->a(Lno/nordicsemi/android/support/v18/scanner/a$a;)V

    monitor-exit v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    move-object/from16 v5, p2

    invoke-virtual {p0, v2, v5, v4}, Lno/nordicsemi/android/support/v18/scanner/b;->k(Landroid/bluetooth/BluetoothAdapter;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Z)Landroid/bluetooth/le/ScanSettings;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    if-eqz v12, :cond_0

    invoke-virtual/range {p2 .. p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->n()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/support/v18/scanner/b;->j(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v0}, Lno/nordicsemi/android/support/v18/scanner/b$b;->j(Lno/nordicsemi/android/support/v18/scanner/b$b;)Landroid/bluetooth/le/ScanCallback;

    move-result-object v0

    invoke-virtual {v3, v4, v2, v0}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "scanner already started with given callback"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "BT le scanner not available"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f(Ljj5;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/b;->b:Lno/nordicsemi/android/support/v18/scanner/d;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/b;->b:Lno/nordicsemi/android/support/v18/scanner/d;

    invoke-virtual {v1, p1}, Lno/nordicsemi/android/support/v18/scanner/d;->e(Ljj5;)Lno/nordicsemi/android/support/v18/scanner/a$a;

    move-result-object p1

    check-cast p1, Lno/nordicsemi/android/support/v18/scanner/b$b;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/a$a;->d()V

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lno/nordicsemi/android/support/v18/scanner/b$b;->j(Lno/nordicsemi/android/support/v18/scanner/b$b;)Landroid/bluetooth/le/ScanCallback;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public g(Landroid/bluetooth/le/ScanResult;)Lno/nordicsemi/android/support/v18/scanner/ScanResult;
    .locals 8

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v7, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-static {v0}, LBk5;->h([B)LBk5;

    move-result-object v3

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v4

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v5

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;-><init>(Landroid/bluetooth/BluetoothDevice;LBk5;IJ)V

    return-object v7
.end method

.method public h(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/bluetooth/le/ScanResult;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/le/ScanResult;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/support/v18/scanner/b;->g(Landroid/bluetooth/le/ScanResult;)Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public i(Lno/nordicsemi/android/support/v18/scanner/ScanFilter;)Landroid/bluetooth/le/ScanFilter;
    .locals 5

    new-instance v0, Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->j()Landroid/os/ParcelUuid;

    move-result-object v1

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->k()Landroid/os/ParcelUuid;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/le/ScanFilter$Builder;->setServiceUuid(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v1

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->e()I

    move-result v2

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->c()[B

    move-result-object v3

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->d()[B

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Landroid/bluetooth/le/ScanFilter$Builder;->setManufacturerData(I[B[B)Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/ScanFilter$Builder;->setDeviceAddress(Ljava/lang/String;)Landroid/bluetooth/le/ScanFilter$Builder;

    :cond_0
    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/ScanFilter$Builder;->setDeviceName(Ljava/lang/String;)Landroid/bluetooth/le/ScanFilter$Builder;

    :cond_1
    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->i()Landroid/os/ParcelUuid;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->i()Landroid/os/ParcelUuid;

    move-result-object v1

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->g()[B

    move-result-object v2

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->h()[B

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Landroid/bluetooth/le/ScanFilter$Builder;->setServiceData(Landroid/os/ParcelUuid;[B[B)Landroid/bluetooth/le/ScanFilter$Builder;

    :cond_2
    invoke-virtual {v0}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Landroid/bluetooth/le/ScanFilter;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/support/v18/scanner/b;->i(Lno/nordicsemi/android/support/v18/scanner/ScanFilter;)Landroid/bluetooth/le/ScanFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public k(Landroid/bluetooth/BluetoothAdapter;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Z)Landroid/bluetooth/le/ScanSettings;
    .locals 3

    new-instance v0, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    if-nez p3, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedScanBatchingSupported()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->l()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setReportDelay(J)Landroid/bluetooth/le/ScanSettings$Builder;

    :cond_1
    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->k()I

    move-result p1

    const/4 p3, -0x1

    if-eq p1, p3, :cond_2

    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->k()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    :goto_0
    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->a()V

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object p1

    return-object p1
.end method
