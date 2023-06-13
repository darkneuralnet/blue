.class public final LAZ8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LX49;

.field public final b:LIh1;


# direct methods
.method public constructor <init>(LX49;LIh1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAZ8;->a:LX49;

    iput-object p2, p0, LAZ8;->b:LIh1;

    return-void
.end method


# virtual methods
.method public final a(Lx26;)Lv26;
    .locals 4

    new-instance v0, Lcom/google/mlkit/vision/text/internal/TextRecognizerImpl;

    iget-object v1, p0, LAZ8;->a:LX49;

    invoke-virtual {v1, p1}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz26;

    iget-object v2, p0, LAZ8;->b:LIh1;

    invoke-interface {p1}, Lx26;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v2, v3}, LIh1;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {p1}, Lx26;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lzn9;->b(Ljava/lang/String;)Lmm9;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/mlkit/vision/text/internal/TextRecognizerImpl;-><init>(Lz26;Ljava/util/concurrent/Executor;Lmm9;Lx26;)V

    return-object v0
.end method
