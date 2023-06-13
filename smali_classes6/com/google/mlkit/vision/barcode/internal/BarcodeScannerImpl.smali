.class public Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;
.super Lcom/google/mlkit/vision/common/internal/MobileVisionBase;
.source "SourceFile"

# interfaces
.implements LUx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/mlkit/vision/common/internal/MobileVisionBase<",
        "Ljava/util/List<",
        "LBx;",
        ">;>;",
        "LUx;"
    }
.end annotation


# static fields
.field public static final i:LXx;


# instance fields
.field public final h:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LXx$a;

    invoke-direct {v0}, LXx$a;-><init>()V

    invoke-virtual {v0}, LXx$a;->a()LXx;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->i:LXx;

    return-void
.end method

.method public constructor <init>(LXx;LBA8;Ljava/util/concurrent/Executor;Len9;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;-><init>(LLE2;Ljava/util/concurrent/Executor;)V

    invoke-static {}, LCC7;->f()Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->h:Z

    new-instance p3, LK79;

    invoke-direct {p3}, LK79;-><init>()V

    invoke-static {p1}, LCC7;->c(LXx;)LLk9;

    move-result-object p1

    invoke-virtual {p3, p1}, LK79;->i(LLk9;)LK79;

    invoke-virtual {p3}, LK79;->j()LY79;

    move-result-object p1

    new-instance p3, LW59;

    invoke-direct {p3}, LW59;-><init>()V

    if-eqz p2, :cond_0

    sget-object p2, Ly59;->e:Ly59;

    goto :goto_0

    :cond_0
    sget-object p2, Ly59;->d:Ly59;

    :goto_0
    invoke-virtual {p3, p2}, LW59;->e(Ly59;)LW59;

    invoke-virtual {p3, p1}, LW59;->g(LY79;)LW59;

    const/4 p1, 0x1

    invoke-static {p3, p1}, Lwn9;->e(LW59;I)LRl9;

    move-result-object p1

    sget-object p2, LO59;->m:LO59;

    invoke-virtual {p4, p1, p2}, Len9;->d(LRl9;LO59;)V

    return-void
.end method

.method public static bridge synthetic f()LXx;
    .locals 1

    sget-object v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->i:LXx;

    return-object v0
.end method


# virtual methods
.method public final getOptionalFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 3

    iget-boolean v0, p0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->h:Z

    if-eqz v0, :cond_0

    sget-object v0, Lmy3;->a:[Lcom/google/android/gms/common/Feature;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/common/Feature;

    const/4 v1, 0x0

    sget-object v2, Lmy3;->b:Lcom/google/android/gms/common/Feature;

    aput-object v2, v0, v1

    :goto_0
    return-object v0
.end method

.method public final h(Lg32;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg32;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "LBx;",
            ">;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->a(Lg32;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
