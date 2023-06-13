.class public abstract LzA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw01;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lw01;
    .locals 0

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    return-object p0
.end method

.method public b(Ljava/lang/Object;)Lw01;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, "null"

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LzA;->j(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Character;

    if-eqz v0, :cond_2

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, LzA;->d(C)V

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {p0, p1}, LzA;->i(C)V

    invoke-virtual {p0, v0}, LzA;->d(C)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ljava/lang/Short;

    const/16 v1, 0x3c

    if-eqz v0, :cond_3

    invoke-virtual {p0, v1}, LzA;->d(C)V

    invoke-virtual {p0, p1}, LzA;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    const-string p1, "s>"

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_4

    invoke-virtual {p0, v1}, LzA;->d(C)V

    invoke-virtual {p0, p1}, LzA;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    const-string p1, "L>"

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_5

    invoke-virtual {p0, v1}, LzA;->d(C)V

    invoke-virtual {p0, p1}, LzA;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    const-string p1, "F>"

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Loo;

    invoke-direct {v0, p1}, Loo;-><init>(Ljava/lang/Object;)V

    const-string p1, "["

    const-string v1, ", "

    const-string v2, "]"

    invoke-virtual {p0, p1, v1, v2, v0}, LzA;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Lw01;

    goto :goto_0

    :cond_6
    invoke-virtual {p0, v1}, LzA;->d(C)V

    invoke-virtual {p0, p1}, LzA;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    const/16 p1, 0x3e

    invoke-virtual {p0, p1}, LzA;->d(C)V

    :goto_0
    return-object p0
.end method

.method public c(LXr5;)Lw01;
    .locals 0

    invoke-interface {p1, p0}, LXr5;->a(Lw01;)V

    return-object p0
.end method

.method public abstract d(C)V
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, LzA;->d(C)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Lw01;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Iterator<",
            "+",
            "LXr5;",
            ">;)",
            "Lw01;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, LzA;->e(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXr5;

    invoke-virtual {p0, p1}, LzA;->c(LXr5;)Lw01;

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p3}, LzA;->e(Ljava/lang/String;)V

    return-object p0
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Lw01;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Iterator<",
            "TT;>;)",
            "Lw01;"
        }
    .end annotation

    new-instance v0, LZr5;

    invoke-direct {v0, p4}, LZr5;-><init>(Ljava/util/Iterator;)V

    invoke-virtual {p0, p1, p2, p3, v0}, LzA;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Lw01;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final i(C)V
    .locals 1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_3

    const/16 v0, 0xa

    if-eq p1, v0, :cond_2

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x22

    if-eq p1, v0, :cond_0

    invoke-virtual {p0, p1}, LzA;->d(C)V

    goto :goto_0

    :cond_0
    const-string p1, "\\\""

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "\\r"

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string p1, "\\n"

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string p1, "\\t"

    invoke-virtual {p0, p1}, LzA;->e(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, LzA;->d(C)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {p0, v2}, LzA;->i(C)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LzA;->d(C)V

    return-void
.end method
