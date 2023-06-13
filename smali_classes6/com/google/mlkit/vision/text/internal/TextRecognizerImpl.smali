.class public Lcom/google/mlkit/vision/text/internal/TextRecognizerImpl;
.super Lcom/google/mlkit/vision/common/internal/MobileVisionBase;
.source "SourceFile"

# interfaces
.implements Lv26;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/mlkit/vision/common/internal/MobileVisionBase<",
        "Lp06;",
        ">;",
        "Lv26;"
    }
.end annotation


# instance fields
.field public final h:Lx26;


# direct methods
.method public constructor <init>(Lz26;Ljava/util/concurrent/Executor;Lmm9;Lx26;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;-><init>(LLE2;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerImpl;->h:Lx26;

    new-instance p1, Lm49;

    invoke-direct {p1}, Lm49;-><init>()V

    invoke-interface {p4}, Lx26;->d()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, LM39;->e:LM39;

    goto :goto_0

    :cond_0
    sget-object p2, LM39;->d:LM39;

    :goto_0
    invoke-virtual {p1, p2}, Lm49;->e(LM39;)Lm49;

    new-instance p2, Lre9;

    invoke-direct {p2}, Lre9;-><init>()V

    new-instance v0, LMe9;

    invoke-direct {v0}, LMe9;-><init>()V

    invoke-interface {p4}, Lx26;->f()I

    move-result p4

    invoke-static {p4}, LXx2;->a(I)LTe9;

    move-result-object p4

    invoke-virtual {v0, p4}, LMe9;->a(LTe9;)LMe9;

    invoke-virtual {v0}, LMe9;->c()Ljf9;

    move-result-object p4

    invoke-virtual {p2, p4}, Lre9;->e(Ljf9;)Lre9;

    invoke-virtual {p2}, Lre9;->f()LFe9;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm49;->h(LFe9;)Lm49;

    const/4 p2, 0x1

    invoke-static {p1, p2}, LDm9;->e(Lm49;I)Lxk9;

    move-result-object p1

    sget-object p2, Le49;->i:Le49;

    invoke-virtual {p3, p1, p2}, Lmm9;->d(Lxk9;Le49;)V

    return-void
.end method


# virtual methods
.method public final getOptionalFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerImpl;->h:Lx26;

    invoke-static {v0}, Lm26;->a(Lx26;)[Lcom/google/android/gms/common/Feature;

    move-result-object v0

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
            "Lp06;",
            ">;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->a(Lg32;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
