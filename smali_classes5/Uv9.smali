.class public final LUv9;
.super LPv9;
.source "SourceFile"


# instance fields
.field public final b:Lkw9;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LPv9;-><init>()V

    new-instance v0, Lkw9;

    invoke-direct {v0}, Lkw9;-><init>()V

    iput-object v0, p0, LUv9;->b:Lkw9;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)LUv9;
    .locals 1

    iget-object p1, p0, LUv9;->b:Lkw9;

    const-string v0, "authToken"

    invoke-virtual {p1, v0}, Lkw9;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUv9;

    return-object p1
.end method

.method public final c(Ljava/lang/String;)LXv9;
    .locals 1

    iget-object v0, p0, LUv9;->b:Lkw9;

    invoke-virtual {v0, p1}, Lkw9;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXv9;

    return-object p1
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LUv9;->b:Lkw9;

    invoke-virtual {v0}, Lkw9;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-eq p1, p0, :cond_2

    instance-of v1, p1, LUv9;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, LUv9;

    iget-object p1, p1, LUv9;->b:Lkw9;

    iget-object v1, p0, LUv9;->b:Lkw9;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v0, v2

    :cond_2
    :goto_0
    return v0
.end method

.method public final f(Ljava/lang/String;LPv9;)V
    .locals 1

    iget-object v0, p0, LUv9;->b:Lkw9;

    invoke-virtual {v0, p1, p2}, Lkw9;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LUv9;->b:Lkw9;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
