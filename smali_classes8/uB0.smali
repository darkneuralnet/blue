.class public LuB0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ln7;ZILjava/lang/StringBuilder;)I
    .locals 2

    const/4 v0, 0x0

    if-gez p2, :cond_0

    const/16 p2, 0x28

    invoke-virtual {p3, v0, p2}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object p2

    invoke-virtual {p0}, Ln7;->k()Ljava/lang/Number;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, p0, v1}, Lsd3;->b(Ljava/lang/Number;Ljava/lang/Number;)I

    move-result v1

    if-gez v1, :cond_1

    const-string p1, "-"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2, p0}, Lsd3;->j(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p0

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    const-string p1, "+"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_0
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return v0
.end method

.method public static b(Lii1;ILjava/lang/StringBuilder;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x4

    if-ge p1, v1, :cond_0

    const/16 p1, 0x28

    invoke-virtual {p2, v0, p1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lii1;->k()D

    move-result-wide v2

    const-wide v4, 0x4005bf0a8b145769L    # Math.E

    cmpl-double p0, v2, v4

    if-nez p0, :cond_1

    const/16 p0, 0x65

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    double-to-int p0, v2

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    const/16 p0, 0x5e

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0, p1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    return v1
.end method

.method public static c(Llx2;Ljava/lang/StringBuilder;)I
    .locals 4

    invoke-virtual {p0}, Llx2;->k()D

    move-result-wide v0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, 0x4005bf0a8b145769L    # Math.E

    cmpl-double v2, v0, v2

    if-nez v2, :cond_0

    const-string v0, "ln"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v2, "log"

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    cmpl-double v2, v0, v2

    if-eqz v2, :cond_1

    double-to-int v0, v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    const-string v0, "("

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p0, 0x4

    return p0
.end method

.method public static d(Lae6;ZILjava/lang/StringBuilder;LxX5;)I
    .locals 2

    instance-of v0, p0, Ln7;

    if-eqz v0, :cond_0

    check-cast p0, Ln7;

    invoke-static {p0, p1, p2, p3}, LuB0;->a(Ln7;ZILjava/lang/StringBuilder;)I

    move-result p0

    return p0

    :cond_0
    instance-of v0, p0, Llx2;

    if-eqz v0, :cond_1

    check-cast p0, Llx2;

    invoke-static {p0, p3}, LuB0;->c(Llx2;Ljava/lang/StringBuilder;)I

    move-result p0

    return p0

    :cond_1
    instance-of v0, p0, Lii1;

    if-eqz v0, :cond_2

    check-cast p0, Lii1;

    invoke-static {p0, p2, p3}, LuB0;->b(Lii1;ILjava/lang/StringBuilder;)I

    move-result p0

    return p0

    :cond_2
    instance-of v0, p0, LlX2;

    if-eqz v0, :cond_3

    instance-of v0, p0, LUY3;

    if-nez v0, :cond_3

    check-cast p0, LlX2;

    invoke-static {p0, p1, p2, p3}, LuB0;->h(LlX2;ZILjava/lang/StringBuilder;)I

    move-result p0

    return p0

    :cond_3
    instance-of v0, p0, LUY3;

    const v1, 0x7fffffff

    if-eqz v0, :cond_5

    invoke-virtual {p4, p0}, LxX5;->b(Lae6;)LWZ3;

    move-result-object v0

    if-eqz v0, :cond_4

    if-ne p2, v1, :cond_4

    invoke-static {p3, p4, v0}, LuB0;->g(Ljava/lang/StringBuilder;LxX5;LWZ3;)I

    move-result p0

    return p0

    :cond_4
    check-cast p0, LUY3;

    invoke-static {p0, p1, p2, p3}, LuB0;->i(LUY3;ZILjava/lang/StringBuilder;)I

    move-result p0

    return p0

    :cond_5
    instance-of p1, p0, Lo0$c;

    const/4 v0, 0x1

    if-eqz p1, :cond_9

    check-cast p0, Lo0$c;

    invoke-virtual {p0}, Lo0$c;->m()Lae6;

    move-result-object p1

    sget-object v1, Lo0;->c:Lo0;

    if-ne p1, v1, :cond_6

    invoke-virtual {p0}, Lo0$c;->n()Lae6;

    move-result-object p0

    invoke-static {p0, v0, p2, p3, p4}, LuB0;->d(Lae6;ZILjava/lang/StringBuilder;LxX5;)I

    move-result p0

    return p0

    :cond_6
    invoke-virtual {p0}, Lo0$c;->m()Lae6;

    move-result-object p1

    instance-of p1, p1, Ljava/util/Formattable;

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lo0$c;->m()Lae6;

    move-result-object p0

    check-cast p0, Ljava/util/Formattable;

    invoke-static {p0, p2, p3}, LuB0;->f(Ljava/util/Formattable;ILjava/lang/StringBuilder;)I

    move-result p0

    return p0

    :cond_7
    invoke-virtual {p0}, Lo0$c;->n()Lae6;

    move-result-object p1

    instance-of p1, p1, Ljava/util/Formattable;

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lo0$c;->n()Lae6;

    move-result-object p0

    check-cast p0, Ljava/util/Formattable;

    invoke-static {p0, p2, p3}, LuB0;->f(Ljava/util/Formattable;ILjava/lang/StringBuilder;)I

    move-result p0

    return p0

    :cond_8
    invoke-virtual {p0}, Lo0$c;->m()Lae6;

    move-result-object p0

    invoke-static {p0, v0, p2, p3, p4}, LuB0;->d(Lae6;ZILjava/lang/StringBuilder;LxX5;)I

    move-result p0

    return p0

    :cond_9
    if-eqz p0, :cond_a

    const/4 p1, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p1, v0, p0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    return v1

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unable to format, no UnitConverter given"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lae6;ZILjava/lang/StringBuilder;LxX5;)I
    .locals 3

    invoke-virtual {p4, p0}, LxX5;->b(Lae6;)LWZ3;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const v2, 0x7fffffff

    if-ne p2, v2, :cond_0

    invoke-virtual {p4, v0}, LxX5;->c(LWZ3;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, v1, p0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    return v2

    :cond_0
    instance-of p4, p0, Ln7;

    const/16 v0, 0x29

    const/16 v2, 0x28

    if-eqz p4, :cond_4

    if-gez p2, :cond_1

    invoke-virtual {p3, v1, v2}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object p2

    check-cast p0, Ln7;

    invoke-virtual {p0}, Ln7;->k()Ljava/lang/Number;

    move-result-object p0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p2, p0, p4}, Lsd3;->b(Ljava/lang/Number;Ljava/lang/Number;)I

    move-result p4

    if-gez p4, :cond_2

    const-string p1, "-"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2, p0}, Lsd3;->j(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p0

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_3

    const-string p1, "+"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_0
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return v1

    :cond_4
    instance-of p4, p0, LlX2;

    if-eqz p4, :cond_8

    const/4 p4, 0x2

    if-ge p2, p4, :cond_5

    invoke-virtual {p3, v1, v2}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    if-eqz p1, :cond_6

    const/16 p1, 0xb7

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_6
    check-cast p0, LlX2;

    invoke-interface {p0}, LlX2;->Y2()Ljava/lang/Number;

    move-result-object p0

    instance-of p1, p0, Lqn4;

    if-eqz p1, :cond_7

    check-cast p0, Lqn4;

    const/16 p1, 0x2f

    invoke-virtual {p0, p1}, Lqn4;->s(C)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_7
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    return p4

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "("

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, v1, p0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p0, 0x4

    return p0
.end method

.method public static f(Ljava/util/Formattable;ILjava/lang/StringBuilder;)I
    .locals 4

    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0}, Ljava/util/Formatter;-><init>()V

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const-string p0, "%s"

    invoke-virtual {v0, p0, v2}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, v3, v1, p0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/Formatter;->close()V

    return p1
.end method

.method public static g(Ljava/lang/StringBuilder;LxX5;LWZ3;)I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p1, p2}, LxX5;->c(LWZ3;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    const p0, 0x7fffffff

    return p0
.end method

.method public static h(LlX2;ZILjava/lang/StringBuilder;)I
    .locals 3

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    const/4 p2, 0x0

    const/16 v1, 0x28

    invoke-virtual {p3, p2, v1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-interface {p0}, LlX2;->Y2()Ljava/lang/Number;

    move-result-object p0

    instance-of p2, p0, Lqn4;

    const/16 v1, 0xb7

    if-eqz p2, :cond_4

    check-cast p0, Lqn4;

    const/16 p2, 0x2f

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lqn4;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lqn4;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lqn4;->q()Lqn4;

    move-result-object p1

    invoke-virtual {p1}, Lqn4;->g()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lqn4;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Lqn4;->s(C)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p2}, Lqn4;->s(C)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return v0
.end method

.method public static i(LUY3;ZILjava/lang/StringBuilder;)I
    .locals 2

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    const/4 p2, 0x0

    const/16 v1, 0x28

    invoke-virtual {p3, p2, v1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, LUY3;->d()Z

    move-result p2

    if-nez p2, :cond_2

    if-eqz p1, :cond_1

    const/16 p1, 0xb7

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0}, LUY3;->m()I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "^"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LUY3;->n()I

    move-result p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_2
    return v0
.end method
