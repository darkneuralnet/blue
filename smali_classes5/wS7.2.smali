.class public abstract LwS7;
.super LVO7;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field public transient c:LDR7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LVO7;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract e()LfZ7;
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-eq p1, p0, :cond_3

    if-ne p1, p0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Ljava/util/Set;

    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :catch_0
    :cond_2
    :goto_0
    move v0, v2

    :cond_3
    :goto_1
    return v0
.end method

.method public final h()LDR7;
    .locals 1

    iget-object v0, p0, LwS7;->c:LDR7;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LwS7;->j()LDR7;

    move-result-object v0

    iput-object v0, p0, LwS7;->c:LDR7;

    :cond_0
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, LCX7;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LwS7;->e()LfZ7;

    move-result-object v0

    return-object v0
.end method

.method public j()LDR7;
    .locals 2

    invoke-virtual {p0}, LVO7;->toArray()[Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LDR7;->c:LtZ7;

    array-length v1, v0

    invoke-static {v0, v1}, LDR7;->j([Ljava/lang/Object;I)LDR7;

    move-result-object v0

    return-object v0
.end method
