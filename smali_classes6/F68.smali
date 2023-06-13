.class public final LF68;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LLe8;

.field public final b:LIh1;


# direct methods
.method public constructor <init>(LLe8;LIh1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF68;->a:LLe8;

    iput-object p2, p0, LF68;->b:LIh1;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;
    .locals 1

    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;->f()LXx;

    move-result-object v0

    invoke-virtual {p0, v0}, LF68;->b(LXx;)Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;

    move-result-object v0

    return-object v0
.end method

.method public final b(LXx;)Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;
    .locals 4

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;

    iget-object v1, p0, LF68;->a:LLe8;

    invoke-virtual {v1, p1}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBA8;

    iget-object v2, p0, LF68;->b:LIh1;

    invoke-virtual {p1}, LXx;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v2, v3}, LIh1;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {}, LCC7;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Llo9;->b(Ljava/lang/String;)Len9;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/google/mlkit/vision/barcode/internal/BarcodeScannerImpl;-><init>(LXx;LBA8;Ljava/util/concurrent/Executor;Len9;)V

    return-object v0
.end method
