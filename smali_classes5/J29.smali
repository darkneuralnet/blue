.class public final LJ29;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp29;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(Lf29;Lz29;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lf29;->c(Lf29;)Lp29;

    move-result-object p2

    iput-object p2, p0, LJ29;->a:Lp29;

    invoke-static {p1}, Lf29;->e(Lf29;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LJ29;->b:Ljava/lang/Integer;

    const/4 p1, 0x0

    iput-object p1, p0, LJ29;->c:Ljava/lang/Integer;

    iput-object p1, p0, LJ29;->d:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a()Lp29;
    .locals 1
    .annotation build LD18;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LJ29;->a:Lp29;

    return-object v0
.end method

.method public final b()Ljava/lang/Integer;
    .locals 1
    .annotation build LD18;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LJ29;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LJ29;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LJ29;

    iget-object v1, p0, LJ29;->a:Lp29;

    iget-object v3, p1, LJ29;->a:Lp29;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LJ29;->b:Ljava/lang/Integer;

    iget-object p1, p1, LJ29;->b:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    invoke-static {p1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LJ29;->a:Lp29;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LJ29;->b:Ljava/lang/Integer;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
