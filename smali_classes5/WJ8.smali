.class public final LWJ8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LnJ8;

.field public final b:LPI8;

.field public final c:LzJ8;

.field public final d:LbJ8;

.field public final e:Ljava/lang/Boolean;

.field public final f:Ljava/lang/Float;


# direct methods
.method public synthetic constructor <init>(LDI8;LKJ8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LDI8;->i(LDI8;)LnJ8;

    move-result-object p2

    iput-object p2, p0, LWJ8;->a:LnJ8;

    invoke-static {p1}, LDI8;->g(LDI8;)LPI8;

    move-result-object p2

    iput-object p2, p0, LWJ8;->b:LPI8;

    invoke-static {p1}, LDI8;->j(LDI8;)LzJ8;

    move-result-object p2

    iput-object p2, p0, LWJ8;->c:LzJ8;

    invoke-static {p1}, LDI8;->h(LDI8;)LbJ8;

    move-result-object p2

    iput-object p2, p0, LWJ8;->d:LbJ8;

    invoke-static {p1}, LDI8;->l(LDI8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LWJ8;->e:Ljava/lang/Boolean;

    invoke-static {p1}, LDI8;->m(LDI8;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, LWJ8;->f:Ljava/lang/Float;

    return-void
.end method


# virtual methods
.method public final a()LPI8;
    .locals 1
    .annotation build LmW7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LWJ8;->b:LPI8;

    return-object v0
.end method

.method public final b()LbJ8;
    .locals 1
    .annotation build LmW7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LWJ8;->d:LbJ8;

    return-object v0
.end method

.method public final c()LnJ8;
    .locals 1
    .annotation build LmW7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LWJ8;->a:LnJ8;

    return-object v0
.end method

.method public final d()LzJ8;
    .locals 1
    .annotation build LmW7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LWJ8;->c:LzJ8;

    return-object v0
.end method

.method public final e()Ljava/lang/Boolean;
    .locals 1
    .annotation build LmW7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LWJ8;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LWJ8;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LWJ8;

    iget-object v1, p0, LWJ8;->a:LnJ8;

    iget-object v3, p1, LWJ8;->a:LnJ8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LWJ8;->b:LPI8;

    iget-object v3, p1, LWJ8;->b:LPI8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LWJ8;->c:LzJ8;

    iget-object v3, p1, LWJ8;->c:LzJ8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LWJ8;->d:LbJ8;

    iget-object v3, p1, LWJ8;->d:LbJ8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LWJ8;->e:Ljava/lang/Boolean;

    iget-object v3, p1, LWJ8;->e:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LWJ8;->f:Ljava/lang/Float;

    iget-object p1, p1, LWJ8;->f:Ljava/lang/Float;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final f()Ljava/lang/Float;
    .locals 1
    .annotation build LmW7;
        zza = 0x6
    .end annotation

    iget-object v0, p0, LWJ8;->f:Ljava/lang/Float;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LWJ8;->a:LnJ8;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LWJ8;->b:LPI8;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, LWJ8;->c:LzJ8;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, LWJ8;->d:LbJ8;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, LWJ8;->e:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, LWJ8;->f:Ljava/lang/Float;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
