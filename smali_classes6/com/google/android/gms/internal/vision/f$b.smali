.class public final Lcom/google/android/gms/internal/vision/f$b;
.super Lcom/google/android/gms/internal/vision/G$b;
.source "SourceFile"

# interfaces
.implements LHQ8;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/vision/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/vision/G$b<",
        "Lcom/google/android/gms/internal/vision/f;",
        "Lcom/google/android/gms/internal/vision/f$b;",
        ">;",
        "LHQ8;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/vision/f;->C()Lcom/google/android/gms/internal/vision/f;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/G$b;-><init>(Lcom/google/android/gms/internal/vision/G;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/vision/p;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/f$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(J)Lcom/google/android/gms/internal/vision/f$b;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->q()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    check-cast v0, Lcom/google/android/gms/internal/vision/f;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/vision/f;->E(Lcom/google/android/gms/internal/vision/f;J)V

    return-object p0
.end method

.method public final w(J)Lcom/google/android/gms/internal/vision/f$b;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->q()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    check-cast v0, Lcom/google/android/gms/internal/vision/f;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/vision/f;->w(Lcom/google/android/gms/internal/vision/f;J)V

    return-object p0
.end method

.method public final y(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/vision/f$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/vision/n;",
            ">;)",
            "Lcom/google/android/gms/internal/vision/f$b;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->q()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    check-cast v0, Lcom/google/android/gms/internal/vision/f;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/vision/f;->y(Lcom/google/android/gms/internal/vision/f;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final z(Ljava/lang/String;)Lcom/google/android/gms/internal/vision/f$b;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/G$b;->q()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/vision/G$b;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$b;->c:Lcom/google/android/gms/internal/vision/G;

    check-cast v0, Lcom/google/android/gms/internal/vision/f;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/vision/f;->z(Lcom/google/android/gms/internal/vision/f;Ljava/lang/String;)V

    return-object p0
.end method
