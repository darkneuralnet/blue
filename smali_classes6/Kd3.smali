.class public LKd3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LNd3;)LLd3;
    .locals 1

    const-string v0, "options cannot be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/mlkit/vision/common/internal/a;->b()Lcom/google/mlkit/vision/common/internal/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/mlkit/vision/common/internal/a;->a(Lcom/google/mlkit/vision/common/internal/a$b;)Lcom/google/mlkit/vision/common/internal/a$c;

    move-result-object p0

    check-cast p0, LLd3;

    return-object p0
.end method
