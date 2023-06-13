.class public final synthetic Lgf7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lcom/google/mlkit/vision/common/internal/MobileVisionBase;

.field public final synthetic c:Lg32;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/vision/common/internal/MobileVisionBase;Lg32;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgf7;->b:Lcom/google/mlkit/vision/common/internal/MobileVisionBase;

    iput-object p2, p0, Lgf7;->c:Lg32;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lgf7;->b:Lcom/google/mlkit/vision/common/internal/MobileVisionBase;

    iget-object v1, p0, Lgf7;->c:Lg32;

    invoke-virtual {v0, v1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->b(Lg32;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
