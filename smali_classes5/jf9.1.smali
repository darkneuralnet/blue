.class public final Ljf9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LTe9;

.field public final b:Ljava/lang/Boolean;

.field public final c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LMe9;Lbf9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LMe9;->b(LMe9;)LTe9;

    move-result-object p1

    iput-object p1, p0, Ljf9;->a:LTe9;

    const/4 p1, 0x0

    iput-object p1, p0, Ljf9;->b:Ljava/lang/Boolean;

    iput-object p1, p0, Ljf9;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()LTe9;
    .locals 1
    .annotation build LKY7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Ljf9;->a:LTe9;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljf9;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljf9;

    iget-object v1, p0, Ljf9;->a:LTe9;

    iget-object p1, p1, Ljf9;->a:LTe9;

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

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Ljf9;->a:LTe9;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
