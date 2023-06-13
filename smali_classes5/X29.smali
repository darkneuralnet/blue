.class public final LX29;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE29;

.field public final b:Ljava/lang/Boolean;

.field public final c:Ljava/lang/Boolean;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/Float;

.field public final f:LIX8;


# direct methods
.method public synthetic constructor <init>(Lu29;LN29;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lu29;->d(Lu29;)LE29;

    move-result-object p2

    iput-object p2, p0, LX29;->a:LE29;

    invoke-static {p1}, Lu29;->g(Lu29;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LX29;->b:Ljava/lang/Boolean;

    invoke-static {p1}, Lu29;->f(Lu29;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LX29;->c:Ljava/lang/Boolean;

    const/4 p1, 0x0

    iput-object p1, p0, LX29;->d:Ljava/lang/Integer;

    iput-object p1, p0, LX29;->e:Ljava/lang/Float;

    iput-object p1, p0, LX29;->f:LIX8;

    return-void
.end method


# virtual methods
.method public final a()LE29;
    .locals 1
    .annotation build LfR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LX29;->a:LE29;

    return-object v0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1
    .annotation build LfR7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LX29;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build LfR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LX29;->b:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LX29;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LX29;

    iget-object v1, p0, LX29;->a:LE29;

    iget-object v3, p1, LX29;->a:LE29;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LX29;->b:Ljava/lang/Boolean;

    iget-object v3, p1, LX29;->b:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LX29;->c:Ljava/lang/Boolean;

    iget-object p1, p1, LX29;->c:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    invoke-static {p1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

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

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LX29;->a:LE29;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LX29;->b:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, LX29;->c:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x4

    aput-object v2, v0, v1

    const/4 v1, 0x5

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
