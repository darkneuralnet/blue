.class public final LpQ7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LG68;

.field public final b:LIh1;


# direct methods
.method public constructor <init>(LG68;LIh1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpQ7;->a:LG68;

    iput-object p2, p0, LpQ7;->b:LIh1;

    return-void
.end method


# virtual methods
.method public final a(Lhj1;)Lcom/google/mlkit/vision/face/internal/FaceDetectorImpl;
    .locals 4

    const-string v0, "You must provide a valid FaceDetectorOptions."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/mlkit/vision/face/internal/FaceDetectorImpl;

    iget-object v1, p0, LpQ7;->a:LG68;

    invoke-virtual {v1, p1}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAt8;

    iget-object v2, p0, LpQ7;->b:LIh1;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/mlkit/vision/face/internal/FaceDetectorImpl;-><init>(LAt8;LIh1;Lhj1;LxY7;)V

    return-object v0
.end method
