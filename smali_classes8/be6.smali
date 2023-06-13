.class public Lbe6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV31;
.implements Ljava/io/Serializable;


# static fields
.field public static final c:Ljava/util/logging/Logger;

.field public static final d:LV31;

.field public static final e:LV31;

.field public static final f:LV31;

.field public static final g:LV31;

.field public static final h:LV31;

.field public static final i:LV31;

.field public static final j:LV31;

.field public static final k:LV31;

.field private static final serialVersionUID:J = 0x6c5747e59927ba58L


# instance fields
.field public final b:LSd6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LSd6<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lbe6;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lbe6;->c:Ljava/util/logging/Logger;

    new-instance v0, Lbe6;

    sget-object v1, Lu1;->d:LSd6;

    invoke-direct {v0, v1}, Lbe6;-><init>(LSd6;)V

    sput-object v0, Lbe6;->d:LV31;

    new-instance v0, Lbe6;

    const/16 v1, 0x4c

    invoke-direct {v0, v1}, Lbe6;-><init>(C)V

    sput-object v0, Lbe6;->e:LV31;

    new-instance v0, Lbe6;

    const/16 v1, 0x4d

    invoke-direct {v0, v1}, Lbe6;-><init>(C)V

    sput-object v0, Lbe6;->f:LV31;

    new-instance v0, Lbe6;

    const/16 v1, 0x54

    invoke-direct {v0, v1}, Lbe6;-><init>(C)V

    sput-object v0, Lbe6;->g:LV31;

    new-instance v0, Lbe6;

    const/16 v1, 0x49

    invoke-direct {v0, v1}, Lbe6;-><init>(C)V

    sput-object v0, Lbe6;->h:LV31;

    new-instance v0, Lbe6;

    const/16 v1, 0x398

    invoke-direct {v0, v1}, Lbe6;-><init>(C)V

    sput-object v0, Lbe6;->i:LV31;

    new-instance v0, Lbe6;

    const/16 v1, 0x4e

    invoke-direct {v0, v1}, Lbe6;-><init>(C)V

    sput-object v0, Lbe6;->j:LV31;

    new-instance v0, Lbe6;

    const/16 v1, 0x4a

    invoke-direct {v0, v1}, Lbe6;-><init>(C)V

    sput-object v0, Lbe6;->k:LV31;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lu1;->d:LSd6;

    invoke-direct {p0, v0}, Lbe6;-><init>(LSd6;)V

    return-void
.end method

.method public constructor <init>(C)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LyE;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 p1, 0x5d

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lbe6;->d:LV31;

    invoke-direct {v0, p1, v1}, LyE;-><init>(Ljava/lang/String;LV31;)V

    iput-object v0, p0, Lbe6;->b:LSd6;

    return-void
.end method

.method public constructor <init>(LSd6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe6;->b:LSd6;

    return-void
.end method

.method public static b(Ljava/lang/Class;)LV31;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TQ;>;)",
            "LV31;"
        }
    .end annotation

    invoke-static {}, Lie6;->d()Lie6;

    move-result-object v0

    invoke-virtual {v0, p0}, Lr1;->a(Ljava/lang/Class;)LSd6;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v1, Lbe6;->c:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Quantity type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " unknown"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, v2, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LSd6;->F()LV31;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final a(Lbe6;)Lbe6;
    .locals 2

    new-instance v0, Lbe6;

    iget-object v1, p0, Lbe6;->b:LSd6;

    iget-object p1, p1, Lbe6;->b:LSd6;

    invoke-interface {v1, p1}, LSd6;->j(LSd6;)LSd6;

    move-result-object p1

    invoke-direct {v0, p1}, Lbe6;-><init>(LSd6;)V

    return-object v0
.end method

.method public bridge synthetic c(I)LV31;
    .locals 0

    invoke-virtual {p0, p1}, Lbe6;->h(I)Lbe6;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(I)LV31;
    .locals 0

    invoke-virtual {p0, p1}, Lbe6;->g(I)Lbe6;

    move-result-object p1

    return-object p1
.end method

.method public e()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "+",
            "LV31;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbe6;->b:LSd6;

    invoke-interface {v0}, LSd6;->l()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    new-instance v3, Lbe6;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LSd6;

    invoke-direct {v3, v4}, Lbe6;-><init>(LSd6;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lbe6;

    if-eqz v0, :cond_1

    check-cast p1, Lbe6;

    iget-object v0, p0, Lbe6;->b:LSd6;

    iget-object p1, p1, Lbe6;->b:LSd6;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public f(LV31;)LV31;
    .locals 1

    instance-of v0, p1, Lbe6;

    if-eqz v0, :cond_0

    check-cast p1, Lbe6;

    invoke-virtual {p0, p1}, Lbe6;->a(Lbe6;)Lbe6;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lbe6;->f(LV31;)LV31;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public g(I)Lbe6;
    .locals 2

    new-instance v0, Lbe6;

    iget-object v1, p0, Lbe6;->b:LSd6;

    invoke-interface {v1, p1}, LSd6;->d(I)LSd6;

    move-result-object p1

    invoke-direct {v0, p1}, Lbe6;-><init>(LSd6;)V

    return-object v0
.end method

.method public h(I)Lbe6;
    .locals 2

    new-instance v0, Lbe6;

    iget-object v1, p0, Lbe6;->b:LSd6;

    invoke-interface {v1, p1}, LSd6;->c(I)LSd6;

    move-result-object p1

    invoke-direct {v0, p1}, Lbe6;-><init>(LSd6;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lbe6;->b:LSd6;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbe6;->b:LSd6;

    invoke-interface {v0}, LSd6;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
