.class public final Lob8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV39;

.field public final b:Ljava/lang/Boolean;

.field public final c:Ljava/lang/Boolean;

.field public final d:Lo19;

.field public final e:Ljf9;


# direct methods
.method public synthetic constructor <init>(LYa8;Lmb8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYa8;->e(LYa8;)LV39;

    move-result-object p2

    iput-object p2, p0, Lob8;->a:LV39;

    const/4 p2, 0x0

    iput-object p2, p0, Lob8;->b:Ljava/lang/Boolean;

    invoke-static {p1}, LYa8;->g(LYa8;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lob8;->c:Ljava/lang/Boolean;

    iput-object p2, p0, Lob8;->d:Lo19;

    invoke-static {p1}, LYa8;->f(LYa8;)Ljf9;

    move-result-object p1

    iput-object p1, p0, Lob8;->e:Ljf9;

    return-void
.end method


# virtual methods
.method public final a()LV39;
    .locals 1
    .annotation build LKY7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lob8;->a:LV39;

    return-object v0
.end method

.method public final b()Ljf9;
    .locals 1
    .annotation build LKY7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lob8;->e:Ljf9;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build LKY7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lob8;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lob8;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lob8;

    iget-object v1, p0, Lob8;->a:LV39;

    iget-object v3, p1, Lob8;->a:LV39;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lob8;->c:Ljava/lang/Boolean;

    iget-object v4, p1, Lob8;->c:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1, v1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lob8;->e:Ljf9;

    iget-object p1, p1, Lob8;->e:Ljf9;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lob8;->a:LV39;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v3, p0, Lob8;->c:Ljava/lang/Boolean;

    aput-object v3, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lob8;->e:Ljf9;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
