.class public abstract LQG7;
.super Ljava/util/AbstractMap;
.source "SourceFile"


# instance fields
.field public transient b:Ljava/util/Set;

.field public transient c:Ljava/util/Set;

.field public transient d:Ljava/util/Collection;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Set;
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LQG7;->b:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LQG7;->a()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LQG7;->b:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LQG7;->c:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, LjF7;

    invoke-direct {v0, p0}, LjF7;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LQG7;->c:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LQG7;->d:Ljava/util/Collection;

    if-nez v0, :cond_0

    new-instance v0, LZF7;

    invoke-direct {v0, p0}, LZF7;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LQG7;->d:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method
