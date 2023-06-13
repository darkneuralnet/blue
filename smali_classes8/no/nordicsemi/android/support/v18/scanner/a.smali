.class public abstract Lno/nordicsemi/android/support/v18/scanner/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lno/nordicsemi/android/support/v18/scanner/a$a;
    }
.end annotation


# static fields
.field public static a:Lno/nordicsemi/android/support/v18/scanner/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized b()Lno/nordicsemi/android/support/v18/scanner/a;
    .locals 3

    const-class v0, Lno/nordicsemi/android/support/v18/scanner/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lno/nordicsemi/android/support/v18/scanner/a;->a:Lno/nordicsemi/android/support/v18/scanner/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_1

    new-instance v1, Lno/nordicsemi/android/support/v18/scanner/c;

    invoke-direct {v1}, Lno/nordicsemi/android/support/v18/scanner/c;-><init>()V

    sput-object v1, Lno/nordicsemi/android/support/v18/scanner/a;->a:Lno/nordicsemi/android/support/v18/scanner/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :cond_1
    :try_start_2
    new-instance v1, LqX;

    invoke-direct {v1}, LqX;-><init>()V

    sput-object v1, Lno/nordicsemi/android/support/v18/scanner/a;->a:Lno/nordicsemi/android/support/v18/scanner/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public abstract a(Ljj5;)V
.end method

.method public final c(Ljava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanFilter;",
            ">;",
            "Lno/nordicsemi/android/support/v18/scanner/ScanSettings;",
            "Ljj5;",
            ")V"
        }
    .end annotation

    if-eqz p3, :cond_2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Lno/nordicsemi/android/support/v18/scanner/ScanSettings$b;

    invoke-direct {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings$b;-><init>()V

    invoke-virtual {p2}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings$b;->a()Lno/nordicsemi/android/support/v18/scanner/ScanSettings;

    move-result-object p2

    :goto_1
    invoke-virtual {p0, p1, p2, p3, v0}, Lno/nordicsemi/android/support/v18/scanner/a;->d(Ljava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "callback is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract d(Ljava/util/List;Lno/nordicsemi/android/support/v18/scanner/ScanSettings;Ljj5;Landroid/os/Handler;)V
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
.end method

.method public final e(Ljj5;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/support/v18/scanner/a;->f(Ljj5;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "callback is null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract f(Ljj5;)V
.end method
