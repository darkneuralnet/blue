.class public Lfj1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lhj1;)Lgj1;
    .locals 2

    const-string v0, "You must provide a valid FaceDetectorOptions."

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v0

    const-class v1, LpQ7;

    invoke-virtual {v0, v1}, LyU2;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpQ7;

    invoke-virtual {v0, p0}, LpQ7;->a(Lhj1;)Lcom/google/mlkit/vision/face/internal/FaceDetectorImpl;

    move-result-object p0

    return-object p0
.end method
