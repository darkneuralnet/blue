.class public Lcom/google/mlkit/vision/face/internal/FaceDetectorImpl;
.super Lcom/google/mlkit/vision/common/internal/MobileVisionBase;
.source "SourceFile"

# interfaces
.implements Lgj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/mlkit/vision/common/internal/MobileVisionBase<",
        "Ljava/util/List<",
        "Ldj1;",
        ">;>;",
        "Lgj1;"
    }
.end annotation


# static fields
.field public static final h:Lhj1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhj1$a;

    invoke-direct {v0}, Lhj1$a;-><init>()V

    invoke-virtual {v0}, Lhj1$a;->a()Lhj1;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/vision/face/internal/FaceDetectorImpl;->h:Lhj1;

    return-void
.end method

.method public synthetic constructor <init>(LAt8;LIh1;Lhj1;LxY7;)V
    .locals 0

    invoke-virtual {p3}, Lhj1;->f()Ljava/util/concurrent/Executor;

    move-result-object p4

    invoke-virtual {p2, p4}, LIh1;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-static {}, LhH8;->b()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, LK69;->b(Ljava/lang/String;)Ly49;

    move-result-object p4

    invoke-direct {p0, p1, p2}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;-><init>(LLE2;Ljava/util/concurrent/Executor;)V

    new-instance p1, LxO8;

    invoke-direct {p1}, LxO8;-><init>()V

    invoke-static {}, LhH8;->d()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, LgN8;->e:LgN8;

    goto :goto_0

    :cond_0
    sget-object p2, LgN8;->d:LgN8;

    :goto_0
    invoke-virtual {p1, p2}, LxO8;->e(LgN8;)LxO8;

    new-instance p2, LWQ8;

    invoke-direct {p2}, LWQ8;-><init>()V

    invoke-static {p3}, LhH8;->a(Lhj1;)LWJ8;

    move-result-object p3

    invoke-virtual {p2, p3}, LWQ8;->e(LWJ8;)LWQ8;

    invoke-virtual {p2}, LWQ8;->i()LqR8;

    move-result-object p2

    invoke-virtual {p1, p2}, LxO8;->g(LqR8;)LxO8;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lz59;->e(LxO8;I)Lz59;

    move-result-object p1

    sget-object p2, LlO8;->e:LlO8;

    invoke-virtual {p4, p1, p2}, Ly49;->g(Lz59;LlO8;)V

    return-void
.end method


# virtual methods
.method public final h(Lg32;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg32;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Ldj1;",
            ">;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->a(Lg32;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
