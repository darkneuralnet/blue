.class public abstract LZ31;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LZ31;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LuO5;

    invoke-direct {v0}, LuO5;-><init>()V

    sput-object v0, LZ31;->a:LZ31;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LZ31;
    .locals 1

    sget-object v0, LZ31;->a:LZ31;

    return-object v0
.end method


# virtual methods
.method public b(LV31;)Lo0;
    .locals 4

    invoke-interface {p1}, LV31;->e()Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lo0;->c:Lo0;

    return-object p1

    :cond_0
    sget-object v0, Lo0;->c:Lo0;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV31;

    invoke-virtual {p0, v2}, LZ31;->b(LV31;)Lo0;

    move-result-object v2

    invoke-interface {v2}, Lae6;->D()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gez v1, :cond_2

    neg-int v1, v1

    invoke-virtual {v2}, Lo0;->f()Lo0;

    move-result-object v2

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v2}, Lo0;->c(Lae6;)Lae6;

    move-result-object v0

    check-cast v0, Lo0;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Non-linear dimensional transform"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v0
.end method

.method public c(LV31;)LV31;
    .locals 3

    invoke-interface {p1}, LV31;->e()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lbe6;->d:LV31;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV31;

    invoke-virtual {p0, v2}, LZ31;->c(LV31;)LV31;

    move-result-object v2

    invoke-interface {p1, v2}, LV31;->f(LV31;)LV31;

    move-result-object p1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p1, v1}, LV31;->d(I)LV31;

    move-result-object p1

    goto :goto_0

    :cond_1
    return-object p1
.end method
