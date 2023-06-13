.class public Lr1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Set;LSd6;Ljava/lang/String;Ljava/lang/String;)LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "LSd6<",
            "*>;>(",
            "Ljava/util/Set<",
            "LSd6<",
            "*>;>;TU;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")TU;"
        }
    .end annotation

    sget-object v0, Lfe6;->e:Lfe6;

    invoke-static {p0, p1, p2, p3, v0}, Lr1$b;->b(Ljava/util/Set;LSd6;Ljava/lang/String;Ljava/lang/String;Lfe6;)LSd6;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/util/Set;LSd6;Ljava/lang/String;Ljava/lang/String;Lfe6;)LSd6;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "LSd6<",
            "*>;>(",
            "Ljava/util/Set<",
            "LSd6<",
            "*>;>;TU;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lfe6;",
            ")TU;"
        }
    .end annotation

    sget-object v0, Lr1$a;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    sget-object p2, Lr1;->c:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    invoke-virtual {p2, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown style "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "; unit "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " can\'t be rendered with \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_0
    if-eqz p2, :cond_a

    if-eqz p3, :cond_a

    instance-of v0, p1, Lu1;

    if-eqz v0, :cond_a

    move-object v0, p1

    check-cast v0, Lu1;

    invoke-virtual {v0, p2}, Lu1;->E(Ljava/lang/String;)V

    sget-object p2, Lfe6;->c:Lfe6;

    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    sget-object p2, Lfe6;->f:Lfe6;

    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    invoke-virtual {v0, p3}, Lu1;->H(Ljava/lang/String;)V

    :cond_2
    sget-object p2, Lfe6;->d:Lfe6;

    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    sget-object p2, Lfe6;->f:Lfe6;

    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    invoke-static {}, LbB5;->k()LbB5;

    move-result-object p2

    invoke-virtual {p2, p1, p3}, LbB5;->n(LSd6;Ljava/lang/String;)V

    :cond_4
    invoke-interface {p0, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_5
    instance-of v0, p1, Lu1;

    if-eqz v0, :cond_a

    check-cast p1, Lu1;

    if-eqz p2, :cond_6

    sget-object v0, Lfe6;->e:Lfe6;

    invoke-virtual {v0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1, p2}, Lu1;->E(Ljava/lang/String;)V

    :cond_6
    if-eqz p2, :cond_8

    sget-object p2, Lfe6;->c:Lfe6;

    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    sget-object p2, Lfe6;->e:Lfe6;

    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    :cond_7
    invoke-virtual {p1, p3}, Lu1;->H(Ljava/lang/String;)V

    :cond_8
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p1

    :cond_9
    if-eqz p2, :cond_a

    instance-of v0, p1, Lu1;

    if-eqz v0, :cond_a

    check-cast p1, Lu1;

    invoke-virtual {p1, p2}, Lu1;->E(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p1

    :cond_a
    :goto_0
    sget-object p2, Lfe6;->d:Lfe6;

    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    sget-object p2, Lfe6;->f:Lfe6;

    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_c

    :cond_b
    invoke-static {}, LbB5;->k()LbB5;

    move-result-object p2

    invoke-virtual {p2, p1, p3}, LbB5;->n(LSd6;Ljava/lang/String;)V

    :cond_c
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p1
.end method
