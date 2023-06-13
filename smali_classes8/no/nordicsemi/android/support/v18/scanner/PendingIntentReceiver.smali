.class public Lno/nordicsemi/android/support/v18/scanner/PendingIntentReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 25

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    if-eqz v0, :cond_7

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v2, "no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/app/PendingIntent;

    if-nez v2, :cond_1

    return-void

    :cond_1
    const-string v3, "no.nordicsemi.android.support.v18.EXTRA_FILTERS"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    const-string v4, "no.nordicsemi.android.support.v18.EXTRA_SETTINGS"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroid/bluetooth/le/ScanSettings;

    if-eqz v3, :cond_7

    if-nez v6, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_BATCHING"

    const/4 v15, 0x1

    invoke-virtual {v1, v4, v15}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v7

    const-string v4, "no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_FILTERING"

    invoke-virtual {v1, v4, v15}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v8

    const-string v4, "no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_CALLBACK_TYPES"

    invoke-virtual {v1, v4, v15}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v9

    const-string v4, "no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_TIMEOUT"

    const-wide/16 v10, 0x2710

    invoke-virtual {v1, v4, v10, v11}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v12

    const-string v4, "no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_INTERVAL"

    invoke-virtual {v1, v4, v10, v11}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v16

    const-string v4, "no.nordicsemi.android.support.v18.EXTRA_MATCH_MODE"

    invoke-virtual {v1, v4, v15}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v14

    const-string v4, "no.nordicsemi.android.support.v18.EXTRA_NUM_OF_MATCHES"

    const/4 v5, 0x3

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    invoke-static {}, Lno/nordicsemi/android/support/v18/scanner/a;->b()Lno/nordicsemi/android/support/v18/scanner/a;

    move-result-object v18

    move-object/from16 v10, v18

    check-cast v10, Lno/nordicsemi/android/support/v18/scanner/c;

    invoke-virtual {v10, v3}, Lno/nordicsemi/android/support/v18/scanner/c;->n(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v22

    move-object v5, v10

    move-object v3, v10

    move-wide v10, v12

    move-wide/from16 v12, v16

    move v15, v4

    invoke-virtual/range {v5 .. v15}, Lno/nordicsemi/android/support/v18/scanner/c;->o(Landroid/bluetooth/le/ScanSettings;ZZZJJII)Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    move-result-object v4

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v5

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedScanBatchingSupported()Z

    move-result v20

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedFilteringSupported()Z

    move-result v21

    monitor-enter v18

    :try_start_0
    invoke-virtual {v3, v2}, Lno/nordicsemi/android/support/v18/scanner/c;->p(Landroid/app/PendingIntent;)Lno/nordicsemi/android/support/v18/scanner/c$a;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_3

    :try_start_1
    new-instance v5, LcQ3;

    invoke-direct {v5, v2, v4}, LcQ3;-><init>(Landroid/app/PendingIntent;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;)V

    new-instance v6, Lno/nordicsemi/android/support/v18/scanner/c$a;

    move-object/from16 v19, v6

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    invoke-direct/range {v19 .. v24}, Lno/nordicsemi/android/support/v18/scanner/c$a;-><init>(ZZLjava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;LcQ3;)V

    invoke-virtual {v3, v2, v6}, Lno/nordicsemi/android/support/v18/scanner/c;->l(Landroid/app/PendingIntent;Lno/nordicsemi/android/support/v18/scanner/c$a;)V

    move-object v5, v6

    :cond_3
    monitor-exit v18
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v2, v5, Lno/nordicsemi/android/support/v18/scanner/c$a;->n:LcQ3;

    invoke-virtual {v2, v0}, LcQ3;->d(Landroid/content/Context;)V

    const-string v0, "android.bluetooth.le.extra.LIST_SCAN_RESULT"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v3, v0}, Lno/nordicsemi/android/support/v18/scanner/b;->h(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v4}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j()J

    move-result-wide v3

    const-wide/16 v6, 0x0

    cmp-long v3, v3, v6

    if-lez v3, :cond_4

    invoke-virtual {v5, v0}, Lno/nordicsemi/android/support/v18/scanner/a$a;->h(Ljava/util/List;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "android.bluetooth.le.extra.CALLBACK_TYPE"

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    invoke-virtual {v5, v1, v0}, Lno/nordicsemi/android/support/v18/scanner/a$a;->g(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    goto :goto_0

    :cond_5
    const-string v0, "android.bluetooth.le.extra.ERROR_CODE"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v5, v0}, Lno/nordicsemi/android/support/v18/scanner/a$a;->f(I)V

    :cond_6
    :goto_0
    iget-object v0, v5, Lno/nordicsemi/android/support/v18/scanner/c$a;->n:LcQ3;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LcQ3;->d(Landroid/content/Context;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    :try_start_2
    monitor-exit v18

    return-void

    :goto_1
    monitor-exit v18
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_7
    :goto_2
    return-void
.end method
