.class public abstract Lqw9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzI7;


# instance fields
.field public transient b:Ljava/util/Set;

.field public transient c:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a()Ljava/util/Map;
.end method

.method abstract b()Ljava/util/Set;
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lqw9;->c:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lqw9;->a()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lqw9;->c:Ljava/util/Map;

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LzI7;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    check-cast p1, LzI7;

    invoke-interface {p0}, LzI7;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, LzI7;->d()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lqw9;->b:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lqw9;->b()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lqw9;->b:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lqw9;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lqw9;->d()Ljava/util/Map;

    move-result-object v0

    check-cast v0, LI49;

    iget-object v0, v0, LI49;->e:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
