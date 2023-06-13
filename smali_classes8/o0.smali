.class public abstract Lo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae6;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0$c;,
        Lo0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lae6;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Comparable<",
        "Lae6;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lo0;

.field public static d:LtB0; = null

.field private static final serialVersionUID:J = 0x505b1333a640c57bL


# instance fields
.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lae6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo0$b;-><init>(Lo0$a;)V

    sput-object v0, Lo0;->c:Lo0;

    invoke-static {}, LtB0;->b()LtB0;

    move-result-object v0

    sput-object v0, Lo0;->d:LtB0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lae6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo0;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    instance-of v0, p0, Lo0$c;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lo0$c;

    invoke-virtual {v0}, Lo0$c;->l()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo0;->b:Ljava/util/List;

    return-object v0

    :cond_1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo0;->b:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic b()Lae6;
    .locals 1

    invoke-virtual {p0}, Lo0;->f()Lo0;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lae6;)Lae6;
    .locals 3

    const-string v0, "Cannot compose with converter that is null."

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    instance-of v0, p1, Lo0;

    if-eqz v0, :cond_0

    check-cast p1, Lo0;

    sget-object v0, Lo0;->d:LtB0;

    new-instance v1, Lm0;

    invoke-direct {v1}, Lm0;-><init>()V

    new-instance v2, Ln0;

    invoke-direct {v2}, Ln0;-><init>()V

    invoke-interface {v0, p0, p1, v1, v2}, LtB0;->a(Lo0;Lo0;Ljava/util/function/BiPredicate;Ljava/util/function/BinaryOperator;)Lo0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lae6;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    invoke-interface {p0}, Lae6;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    new-instance v0, Lo0$c;

    invoke-direct {v0, p0, p1}, Lo0$c;-><init>(Lae6;Lae6;)V

    return-object v0
.end method

.method public abstract e(Lo0;)Z
.end method

.method public final f()Lo0;
    .locals 1

    invoke-interface {p0}, Lae6;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lo0;->g()Lo0;

    move-result-object v0

    return-object v0
.end method

.method public abstract g()Lo0;
.end method

.method public h(Lo0;)Lo0;
    .locals 2

    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string v1, "Concrete UnitConverter \'%s\' does not implement reduce(...)."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Converter"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x9

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-interface {p0}, Lae6;->d()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "%s(IDENTITY)"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lo0;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v2

    aput-object v1, v4, v3

    const-string v0, "%s(%s)"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_0
    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "%s"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
