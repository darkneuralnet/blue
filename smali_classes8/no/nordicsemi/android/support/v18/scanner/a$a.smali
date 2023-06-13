.class public Lno/nordicsemi/android/support/v18/scanner/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lno/nordicsemi/android/support/v18/scanner/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public e:Z

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

.field public final h:Ljj5;

.field public final i:Landroid/os/Handler;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(ZZLjava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;",
            ">;",
            "Lno/nordicsemi/android/support/v18/scanner/ScanSettings;",
            "Ljj5;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->j:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->k:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->l:Ljava/util/Map;

    new-instance v0, Lno/nordicsemi/android/support/v18/scanner/a$a$a;

    invoke-direct {v0, p0}, Lno/nordicsemi/android/support/v18/scanner/a$a$a;-><init>(Lno/nordicsemi/android/support/v18/scanner/a$a;)V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->m:Ljava/lang/Runnable;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->f:Ljava/util/List;

    iput-object p4, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    iput-object p5, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    iput-object p6, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->i:Landroid/os/Handler;

    const/4 p5, 0x0

    iput-boolean p5, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->e:Z

    invoke-virtual {p4}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p4}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->m()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, p5

    :goto_0
    iput-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->d:Z

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {p4}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->n()Z

    move-result p2

    if-nez p2, :cond_2

    :cond_1
    move p2, v1

    goto :goto_1

    :cond_2
    move p2, p5

    :goto_1
    iput-boolean p2, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->b:Z

    invoke-virtual {p4}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j()J

    move-result-wide p2

    const-wide/16 v2, 0x0

    cmp-long v0, p2, v2

    if-lez v0, :cond_4

    if-eqz p1, :cond_3

    invoke-virtual {p4}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->l()Z

    move-result p1

    if-nez p1, :cond_4

    :cond_3
    move p5, v1

    :cond_4
    iput-boolean p5, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->c:Z

    if-eqz p5, :cond_5

    new-instance p1, Lno/nordicsemi/android/support/v18/scanner/a$a$b;

    invoke-direct {p1, p0, p6}, Lno/nordicsemi/android/support/v18/scanner/a$a$b;-><init>(Lno/nordicsemi/android/support/v18/scanner/a$a;Landroid/os/Handler;)V

    invoke-virtual {p6, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_5
    return-void
.end method

.method public static synthetic a(Lno/nordicsemi/android/support/v18/scanner/a$a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->a:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic b(Lno/nordicsemi/android/support/v18/scanner/a$a;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->l:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic c(Lno/nordicsemi/android/support/v18/scanner/a$a;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->e:Z

    return p0
.end method


# virtual methods
.method public d()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->e:Z

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->k:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e()V
    .locals 4

    iget-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->c:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->j:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Ljj5;->a(Ljava/util/List;)V

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->k:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    invoke-virtual {v0, p1}, Ljj5;->b(I)V

    return-void
.end method

.method public g(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V
    .locals 3

    iget-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->e:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p2}, Lno/nordicsemi/android/support/v18/scanner/a$a;->i(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->d:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->l:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->l:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    iget-object v2, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->l:Ljava/util/Map;

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    invoke-virtual {v0}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->b()I

    move-result v0

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-lez v0, :cond_1

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    invoke-virtual {v0, v1, p2}, Ljj5;->c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    :cond_1
    if-eqz p1, :cond_5

    iget-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->b()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-lez p1, :cond_5

    iget-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->i:Landroid/os/Handler;

    iget-object p2, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->m:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->i:Landroid/os/Handler;

    iget-object p2, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->m:Ljava/lang/Runnable;

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->g:Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    invoke-virtual {v0}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->e()J

    move-result-wide v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    iget-boolean v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->c:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2
    iget-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->k:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->j:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->k:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    monitor-exit v1

    return-void

    :catchall_1
    move-exception p1

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_4
    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    invoke-virtual {v0, p1, p2}, Ljj5;->c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->b:Z

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/support/v18/scanner/a$a;->i(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p1, v0

    :cond_3
    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    invoke-virtual {v0, p1}, Ljj5;->a(Ljava/util/List;)V

    return-void
.end method

.method public final i(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Z
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/a$a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;

    invoke-virtual {v1, p1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->l(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
