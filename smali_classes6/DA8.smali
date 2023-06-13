.class public final LDA8;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LKu6;)Lbw7;
    .locals 4

    new-instance v0, LSt7;

    invoke-direct {v0}, LSt7;-><init>()V

    invoke-virtual {p0}, LKu6;->a()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKu6$a;

    new-instance v2, Lq69;

    invoke-direct {v2}, Lq69;-><init>()V

    invoke-virtual {v1}, LKu6$a;->b()I

    move-result v3

    invoke-static {v3}, Ly69;->a(I)Ly69;

    move-result-object v3

    invoke-virtual {v2, v3}, Lq69;->b(Ly69;)Lq69;

    invoke-virtual {v1}, LKu6$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Lq69;->a(Ljava/lang/Integer;)Lq69;

    invoke-virtual {v2}, Lq69;->d()LN69;

    move-result-object v1

    invoke-virtual {v0, v1}, LSt7;->d(Ljava/lang/Object;)LSt7;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LSt7;->e()Lbw7;

    move-result-object p0

    return-object p0
.end method

.method public static b(LMd3;)LX29;
    .locals 4

    new-instance v0, Lu29;

    invoke-direct {v0}, Lu29;-><init>()V

    invoke-virtual {p0}, LNd3;->a()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x25

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected detector mode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "ObjectsLoggingUtils"

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v1, LE29;->c:LE29;

    goto :goto_0

    :cond_0
    sget-object v1, LE29;->e:LE29;

    goto :goto_0

    :cond_1
    sget-object v1, LE29;->d:LE29;

    :goto_0
    invoke-virtual {v0, v1}, Lu29;->b(LE29;)Lu29;

    invoke-virtual {p0}, LNd3;->d()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu29;->c(Ljava/lang/Boolean;)Lu29;

    invoke-virtual {p0}, LNd3;->c()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p0}, Lu29;->a(Ljava/lang/Boolean;)Lu29;

    invoke-virtual {v0}, Lu29;->e()LX29;

    move-result-object p0

    return-object p0
.end method
