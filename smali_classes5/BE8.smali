.class public final LBE8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LSD8;

.field public final b:LuD8;

.field public final c:LdE8;

.field public final d:LGD8;

.field public final e:Ljava/lang/Boolean;

.field public final f:Ljava/lang/Float;


# direct methods
.method public synthetic constructor <init>(LiD8;LoE8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LiD8;->i(LiD8;)LSD8;

    move-result-object p2

    iput-object p2, p0, LBE8;->a:LSD8;

    invoke-static {p1}, LiD8;->g(LiD8;)LuD8;

    move-result-object p2

    iput-object p2, p0, LBE8;->b:LuD8;

    invoke-static {p1}, LiD8;->j(LiD8;)LdE8;

    move-result-object p2

    iput-object p2, p0, LBE8;->c:LdE8;

    invoke-static {p1}, LiD8;->h(LiD8;)LGD8;

    move-result-object p2

    iput-object p2, p0, LBE8;->d:LGD8;

    invoke-static {p1}, LiD8;->l(LiD8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LBE8;->e:Ljava/lang/Boolean;

    invoke-static {p1}, LiD8;->m(LiD8;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, LBE8;->f:Ljava/lang/Float;

    return-void
.end method


# virtual methods
.method public final a()LuD8;
    .locals 1
    .annotation build LHR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LBE8;->b:LuD8;

    return-object v0
.end method

.method public final b()LGD8;
    .locals 1
    .annotation build LHR7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LBE8;->d:LGD8;

    return-object v0
.end method

.method public final c()LSD8;
    .locals 1
    .annotation build LHR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LBE8;->a:LSD8;

    return-object v0
.end method

.method public final d()LdE8;
    .locals 1
    .annotation build LHR7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LBE8;->c:LdE8;

    return-object v0
.end method

.method public final e()Ljava/lang/Boolean;
    .locals 1
    .annotation build LHR7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LBE8;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LBE8;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LBE8;

    iget-object v1, p0, LBE8;->a:LSD8;

    iget-object v3, p1, LBE8;->a:LSD8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LBE8;->b:LuD8;

    iget-object v3, p1, LBE8;->b:LuD8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LBE8;->c:LdE8;

    iget-object v3, p1, LBE8;->c:LdE8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LBE8;->d:LGD8;

    iget-object v3, p1, LBE8;->d:LGD8;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LBE8;->e:Ljava/lang/Boolean;

    iget-object v3, p1, LBE8;->e:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LBE8;->f:Ljava/lang/Float;

    iget-object p1, p1, LBE8;->f:Ljava/lang/Float;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final f()Ljava/lang/Float;
    .locals 1
    .annotation build LHR7;
        zza = 0x6
    .end annotation

    iget-object v0, p0, LBE8;->f:Ljava/lang/Float;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LBE8;->a:LSD8;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LBE8;->b:LuD8;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, LBE8;->c:LdE8;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, LBE8;->d:LGD8;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, LBE8;->e:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, LBE8;->f:Ljava/lang/Float;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
