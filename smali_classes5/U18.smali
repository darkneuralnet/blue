.class public final LU18;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LZN8;

.field public final b:Ljava/lang/Boolean;

.field public final c:LRK8;

.field public final d:LWJ8;

.field public final e:Ljava/lang/Integer;

.field public final f:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lt18;LG18;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lt18;->h(Lt18;)LZN8;

    move-result-object p2

    iput-object p2, p0, LU18;->a:LZN8;

    invoke-static {p1}, Lt18;->i(Lt18;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LU18;->b:Ljava/lang/Boolean;

    const/4 p2, 0x0

    iput-object p2, p0, LU18;->c:LRK8;

    invoke-static {p1}, Lt18;->g(Lt18;)LWJ8;

    move-result-object p2

    iput-object p2, p0, LU18;->d:LWJ8;

    invoke-static {p1}, Lt18;->j(Lt18;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, LU18;->e:Ljava/lang/Integer;

    invoke-static {p1}, Lt18;->k(Lt18;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LU18;->f:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()LWJ8;
    .locals 1
    .annotation build LmW7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LU18;->d:LWJ8;

    return-object v0
.end method

.method public final b()LZN8;
    .locals 1
    .annotation build LmW7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LU18;->a:LZN8;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build LmW7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LU18;->b:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1
    .annotation build LmW7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LU18;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1
    .annotation build LmW7;
        zza = 0x6
    .end annotation

    iget-object v0, p0, LU18;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LU18;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LU18;

    iget-object v1, p0, LU18;->a:LZN8;

    iget-object v3, p1, LU18;->a:LZN8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LU18;->b:Ljava/lang/Boolean;

    iget-object v3, p1, LU18;->b:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LU18;->d:LWJ8;

    iget-object v3, p1, LU18;->d:LWJ8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LU18;->e:Ljava/lang/Integer;

    iget-object v3, p1, LU18;->e:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LU18;->f:Ljava/lang/Integer;

    iget-object p1, p1, LU18;->f:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LU18;->a:LZN8;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LU18;->b:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, LU18;->d:LWJ8;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, LU18;->e:Ljava/lang/Integer;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, LU18;->f:Ljava/lang/Integer;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
