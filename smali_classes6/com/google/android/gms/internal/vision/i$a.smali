.class public final Lcom/google/android/gms/internal/vision/i$a;
.super Lcom/google/android/gms/internal/vision/G$b;
.source "SourceFile"

# interfaces
.implements LHQ8;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/vision/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/vision/G$b<",
        "Lcom/google/android/gms/internal/vision/i;",
        "Lcom/google/android/gms/internal/vision/i$a;",
        ">;",
        "LHQ8;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/vision/i;->A()Lcom/google/android/gms/internal/vision/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/G$b;-><init>(Lcom/google/android/gms/internal/vision/G;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/vision/p;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/i$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(Lcom/google/android/gms/internal/vision/j;)Lcom/google/android/gms/internal/vision/i$a;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->q()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    check-cast v0, Lcom/google/android/gms/internal/vision/i;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/vision/i;->v(Lcom/google/android/gms/internal/vision/i;Lcom/google/android/gms/internal/vision/j;)V

    return-object p0
.end method

.method public final y(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/vision/i$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/vision/f;",
            ">;)",
            "Lcom/google/android/gms/internal/vision/i$a;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->q()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    check-cast v0, Lcom/google/android/gms/internal/vision/i;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/vision/i;->w(Lcom/google/android/gms/internal/vision/i;Ljava/lang/Iterable;)V

    return-object p0
.end method
