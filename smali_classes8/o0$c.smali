.class public final Lo0$c;
.super Lo0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final g:Ljava/util/Comparator;

.field private static final serialVersionUID:J = -0x1b535e63e03924bL


# instance fields
.field public final e:Lae6;

.field public final f:Lae6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LUd6;

    invoke-direct {v0}, LUd6;-><init>()V

    sput-object v0, Lo0$c;->g:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Lae6;Lae6;)V
    .locals 0

    invoke-direct {p0}, Lo0;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iput-object p1, p0, Lo0$c;->e:Lae6;

    iput-object p2, p0, Lo0$c;->f:Lae6;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Converters cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic j(Lae6;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public D()Z
    .locals 1

    iget-object v0, p0, Lo0$c;->e:Lae6;

    invoke-interface {v0}, Lae6;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo0$c;->f:Lae6;

    invoke-interface {v0}, Lae6;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic b()Lae6;
    .locals 1

    invoke-super {p0}, Lo0;->f()Lo0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lae6;

    invoke-virtual {p0, p1}, Lo0$c;->k(Lae6;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e(Lo0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lo0$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lo0$c;

    iget-object v1, p0, Lo0$c;->e:Lae6;

    iget-object v3, p1, Lo0$c;->e:Lae6;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lo0$c;->f:Lae6;

    iget-object p1, p1, Lo0$c;->f:Lae6;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public bridge synthetic g()Lo0;
    .locals 1

    invoke-virtual {p0}, Lo0$c;->o()Lo0$c;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lo0$c;->e:Lae6;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lo0$c;->f:Lae6;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo0;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lp0;

    invoke-direct {v2}, Lp0;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v1

    const-string v2, " \u25cb "

    invoke-static {v2}, Ljava/util/stream/Collectors;->joining(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k(Lae6;)I
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of v0, p1, Lo0$c;

    if-eqz v0, :cond_1

    check-cast p1, Lo0$c;

    iget-object v0, p0, Lo0$c;->e:Lae6;

    iget-object v1, p1, Lo0$c;->e:Lae6;

    sget-object v2, Lo0$c;->g:Ljava/util/Comparator;

    invoke-static {v0, v1, v2}, Ljava/util/Objects;->compare(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result v0

    iget-object v1, p0, Lo0$c;->f:Lae6;

    iget-object p1, p1, Lo0$c;->f:Lae6;

    invoke-static {v1, p1, v2}, Ljava/util/Objects;->compare(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    add-int/2addr v0, p1

    return v0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public l()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lae6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo0$c;->e:Lae6;

    invoke-interface {v0}, Lae6;->a()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo0$c;->f:Lae6;

    invoke-interface {v1}, Lae6;->a()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v2
.end method

.method public m()Lae6;
    .locals 1

    iget-object v0, p0, Lo0$c;->e:Lae6;

    return-object v0
.end method

.method public n()Lae6;
    .locals 1

    iget-object v0, p0, Lo0$c;->f:Lae6;

    return-object v0
.end method

.method public o()Lo0$c;
    .locals 3

    new-instance v0, Lo0$c;

    iget-object v1, p0, Lo0$c;->f:Lae6;

    invoke-interface {v1}, Lae6;->b()Lae6;

    move-result-object v1

    iget-object v2, p0, Lo0$c;->e:Lae6;

    invoke-interface {v2}, Lae6;->b()Lae6;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo0$c;-><init>(Lae6;Lae6;)V

    return-object v0
.end method
