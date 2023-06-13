.class public Lkw6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkw6$b;
    }
.end annotation


# instance fields
.field public a:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:I

.field public c:LeZ3;

.field public d:LBy3;

.field public e:Z

.field public f:I

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkw6;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lkw6;->c:LeZ3;

    iput-object v0, p0, Lkw6;->d:LBy3;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkw6;->e:Z

    const/4 v0, -0x1

    iput v0, p0, Lkw6;->f:I

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lkw6;->y(I)V

    iput p1, p0, Lkw6;->b:I

    if-lt p1, v0, :cond_2

    const/4 v1, 0x4

    if-gt p1, v1, :cond_2

    sget-object v1, LAy3;->b:LAy3;

    sget-object v2, LAy3;->c:LAy3;

    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    iput-object v1, p0, Lkw6;->a:Ljava/util/EnumSet;

    if-le p1, v0, :cond_0

    sget-object v0, LAy3;->d:LAy3;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x3

    if-le p1, v0, :cond_1

    iget-object p1, p0, Lkw6;->a:Ljava/util/EnumSet;

    sget-object v0, LAy3;->e:LAy3;

    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid output dimension (must be 2 to 4)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static A(LyB0;LyB0;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LINESTRING ( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " )"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static B(LEB0;)Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LINESTRING"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, LEB0;->size()I

    move-result v1

    if-nez v1, :cond_0

    const-string p0, "EMPTY"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, LEB0;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    if-lez v1, :cond_1

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-interface {p0, v1}, LEB0;->n2(I)D

    move-result-wide v2

    invoke-interface {p0, v1}, LEB0;->N0(I)D

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lkw6;->t(DD)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static C([LyB0;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LINESTRING"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, p0

    if-nez v1, :cond_0

    const-string p0, "EMPTY"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    if-lez v1, :cond_1

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    aget-object v2, p0, v1

    invoke-static {v2}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static F(DLBy3;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p2, p0, p1}, LBy3;->c(D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static s(LeZ3;)LBy3;
    .locals 0

    invoke-virtual {p0}, LeZ3;->a()I

    move-result p0

    invoke-static {p0}, LBy3;->a(I)LBy3;

    move-result-object p0

    return-object p0
.end method

.method public static t(DD)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, LBy3;->b:LBy3;

    invoke-virtual {v1, p0, p1}, LBy3;->c(D)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, LBy3;->b:LBy3;

    invoke-virtual {p0, p2, p3}, LBy3;->c(D)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static u(LyB0;)Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, LyB0;->b:D

    iget-wide v2, p0, LyB0;->c:D

    invoke-static {v0, v1, v2, v3}, Lkw6;->t(DD)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static z(CI)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public D(LWB1;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v1, v0}, Lkw6;->E(LWB1;ZLjava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, LKo;->e()V

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final E(LWB1;ZLjava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lkw6;->v(LWB1;)LBy3;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lkw6;->e(LWB1;ZLjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final a(LEB0;Ljava/util/EnumSet;ILjava/io/Writer;LBy3;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEB0;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;I",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1, p3}, LEB0;->n2(I)D

    move-result-wide v1

    invoke-static {v1, v2, p5}, Lkw6;->F(DLBy3;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1, p3}, LEB0;->N0(I)D

    move-result-wide v2

    invoke-static {v2, v3, p5}, Lkw6;->F(DLBy3;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    sget-object v0, LAy3;->d:LAy3;

    invoke-virtual {p2, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p4, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-interface {p1, p3}, LEB0;->W0(I)D

    move-result-wide v2

    invoke-static {v2, v3, p5}, Lkw6;->F(DLBy3;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    sget-object v0, LAy3;->e:LAy3;

    invoke-virtual {p2, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p4, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-interface {p1, p3}, LEB0;->v3(I)D

    move-result-wide p1

    invoke-static {p1, p2, p5}, Lkw6;->F(DLBy3;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final b(LXB1;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXB1;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "GEOMETRYCOLLECTION"

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p5}, Lkw6;->n(Ljava/util/EnumSet;Ljava/io/Writer;)V

    invoke-virtual/range {p0 .. p6}, Lkw6;->c(LXB1;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final c(LXB1;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXB1;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, LXB1;->f0()I

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "EMPTY"

    invoke-virtual {p5, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const-string v0, "("

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 v0, 0x0

    move v1, p4

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v2

    if-ge v0, v2, :cond_2

    if-lez v0, :cond_1

    const-string v1, ", "

    invoke-virtual {p5, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v1, p4, 0x1

    :cond_1
    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v3

    move-object v2, p0

    move-object v4, p2

    move v5, p3

    move v6, v1

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v2 .. v8}, Lkw6;->d(LWB1;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const-string p1, ")"

    invoke-virtual {p5, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final d(LWB1;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWB1;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p3, p4, p5}, Lkw6;->w(ZILjava/io/Writer;)V

    instance-of v0, p1, LFW3;

    if-eqz v0, :cond_0

    move-object v2, p1

    check-cast v2, LFW3;

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lkw6;->o(LFW3;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, LKr2;

    if-eqz v0, :cond_1

    move-object v2, p1

    check-cast v2, LKr2;

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lkw6;->g(LKr2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, LBr2;

    if-eqz v0, :cond_2

    move-object v2, p1

    check-cast v2, LBr2;

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lkw6;->f(LBr2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, LCX3;

    if-eqz v0, :cond_3

    move-object v2, p1

    check-cast v2, LCX3;

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lkw6;->p(LCX3;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    goto/16 :goto_0

    :cond_3
    instance-of v0, p1, LVW2;

    if-eqz v0, :cond_4

    move-object v2, p1

    check-cast v2, LVW2;

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lkw6;->j(LVW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    goto :goto_0

    :cond_4
    instance-of v0, p1, LDW2;

    if-eqz v0, :cond_5

    move-object v2, p1

    check-cast v2, LDW2;

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lkw6;->h(LDW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    goto :goto_0

    :cond_5
    instance-of v0, p1, LWW2;

    if-eqz v0, :cond_6

    move-object v2, p1

    check-cast v2, LWW2;

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lkw6;->l(LWW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    goto :goto_0

    :cond_6
    instance-of v0, p1, LXB1;

    if-eqz v0, :cond_7

    move-object v2, p1

    check-cast v2, LXB1;

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lkw6;->b(LXB1;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    goto :goto_0

    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unsupported Geometry implementation:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LKo;->f(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final e(LWB1;ZLjava/io/Writer;LBy3;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lkw6$b;

    iget-object v1, p0, Lkw6;->a:Ljava/util/EnumSet;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lkw6$b;-><init>(Lkw6;Ljava/util/EnumSet;Lkw6$a;)V

    invoke-virtual {p1, v0}, LWB1;->e(LGB0;)V

    invoke-virtual {v0}, Lkw6$b;->a()Ljava/util/EnumSet;

    move-result-object v5

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    move v6, p2

    move-object v8, p3

    move-object v9, p4

    invoke-virtual/range {v3 .. v9}, Lkw6;->d(LWB1;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final f(LBr2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBr2;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "LINESTRING"

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p5}, Lkw6;->n(Ljava/util/EnumSet;Ljava/io/Writer;)V

    invoke-virtual {p1}, LBr2;->M0()LEB0;

    move-result-object v2

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v1 .. v8}, Lkw6;->r(LEB0;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final g(LKr2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKr2;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "LINEARRING"

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p5}, Lkw6;->n(Ljava/util/EnumSet;Ljava/io/Writer;)V

    invoke-virtual {p1}, LBr2;->M0()LEB0;

    move-result-object v2

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v1 .. v8}, Lkw6;->r(LEB0;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final h(LDW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDW2;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "MULTILINESTRING"

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p5}, Lkw6;->n(Ljava/util/EnumSet;Ljava/io/Writer;)V

    invoke-virtual/range {p0 .. p6}, Lkw6;->i(LDW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final i(LDW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDW2;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v8, p5

    invoke-virtual {p1}, LXB1;->f0()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "EMPTY"

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const-string v0, "("

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 v0, 0x0

    move/from16 v1, p4

    move v9, v0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v2

    if-ge v9, v2, :cond_2

    if-lez v9, :cond_1

    const-string v0, ", "

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v1, p4, 0x1

    const/4 v0, 0x1

    :cond_1
    move-object v12, p1

    move v10, v0

    move v11, v1

    invoke-virtual {p1, v9}, LXB1;->d0(I)LWB1;

    move-result-object v0

    check-cast v0, LBr2;

    invoke-virtual {v0}, LBr2;->M0()LEB0;

    move-result-object v1

    move-object v0, p0

    move-object v2, p2

    move/from16 v3, p3

    move v4, v11

    move v5, v10

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-virtual/range {v0 .. v7}, Lkw6;->r(LEB0;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V

    add-int/lit8 v9, v9, 0x1

    move v0, v10

    move v1, v11

    goto :goto_0

    :cond_2
    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final j(LVW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVW2;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "MULTIPOINT"

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p5}, Lkw6;->n(Ljava/util/EnumSet;Ljava/io/Writer;)V

    invoke-virtual/range {p0 .. p6}, Lkw6;->k(LVW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final k(LVW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVW2;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v8, p5

    invoke-virtual {p1}, LXB1;->f0()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "EMPTY"

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    move-object v10, p0

    goto :goto_2

    :cond_0
    const-string v0, "("

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 v0, 0x0

    move v9, v0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v0

    if-ge v9, v0, :cond_2

    if-lez v9, :cond_1

    const-string v0, ", "

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v0, p4, 0x1

    move-object v10, p0

    move/from16 v11, p3

    invoke-virtual {p0, v11, v9, v0, v8}, Lkw6;->x(ZIILjava/io/Writer;)V

    goto :goto_1

    :cond_1
    move-object v10, p0

    move/from16 v11, p3

    :goto_1
    move-object v12, p1

    invoke-virtual {p1, v9}, LXB1;->d0(I)LWB1;

    move-result-object v0

    check-cast v0, LFW3;

    invoke-virtual {v0}, LFW3;->L0()LEB0;

    move-result-object v1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-virtual/range {v0 .. v7}, Lkw6;->r(LEB0;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    move-object v10, p0

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public final l(LWW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWW2;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "MULTIPOLYGON"

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p5}, Lkw6;->n(Ljava/util/EnumSet;Ljava/io/Writer;)V

    invoke-virtual/range {p0 .. p6}, Lkw6;->m(LWW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final m(LWW2;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWW2;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v8, p5

    invoke-virtual {p1}, LXB1;->f0()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "EMPTY"

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const-string v0, "("

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 v0, 0x0

    move/from16 v1, p4

    move v9, v0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v2

    if-ge v9, v2, :cond_2

    if-lez v9, :cond_1

    const-string v0, ", "

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v1, p4, 0x1

    const/4 v0, 0x1

    :cond_1
    move-object v12, p1

    move v10, v0

    move v11, v1

    invoke-virtual {p1, v9}, LXB1;->d0(I)LWB1;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LCX3;

    move-object v0, p0

    move-object v2, p2

    move/from16 v3, p3

    move v4, v11

    move v5, v10

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-virtual/range {v0 .. v7}, Lkw6;->q(LCX3;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V

    add-int/lit8 v9, v9, 0x1

    move v0, v10

    move v1, v11

    goto :goto_0

    :cond_2
    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final n(Ljava/util/EnumSet;Ljava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;",
            "Ljava/io/Writer;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LAy3;->d:LAy3;

    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Z"

    invoke-virtual {p2, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    :cond_0
    sget-object v0, LAy3;->e:LAy3;

    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "M"

    invoke-virtual {p2, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    :cond_1
    return-void
.end method

.method public final o(LFW3;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFW3;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "POINT"

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p5}, Lkw6;->n(Ljava/util/EnumSet;Ljava/io/Writer;)V

    invoke-virtual {p1}, LFW3;->L0()LEB0;

    move-result-object v2

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v1 .. v8}, Lkw6;->r(LEB0;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final p(LCX3;Ljava/util/EnumSet;ZILjava/io/Writer;LBy3;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCX3;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZI",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "POLYGON"

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p5, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p5}, Lkw6;->n(Ljava/util/EnumSet;Ljava/io/Writer;)V

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v1 .. v8}, Lkw6;->q(LCX3;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V

    return-void
.end method

.method public final q(LCX3;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCX3;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZIZ",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move/from16 v8, p4

    move-object/from16 v9, p6

    invoke-virtual {p1}, LCX3;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "EMPTY"

    invoke-virtual {v9, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    move-object v10, p0

    goto :goto_1

    :cond_0
    move-object v10, p0

    move/from16 v11, p3

    if-eqz p5, :cond_1

    invoke-virtual {p0, v11, v8, v9}, Lkw6;->w(ZILjava/io/Writer;)V

    :cond_1
    const-string v0, "("

    invoke-virtual {v9, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p1}, LCX3;->L0()LKr2;

    move-result-object v0

    invoke-virtual {v0}, LBr2;->M0()LEB0;

    move-result-object v1

    const/4 v5, 0x0

    move-object v0, p0

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-virtual/range {v0 .. v7}, Lkw6;->r(LEB0;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V

    const/4 v0, 0x0

    move v12, v0

    :goto_0
    invoke-virtual {p1}, LCX3;->O0()I

    move-result v0

    if-ge v12, v0, :cond_2

    const-string v0, ", "

    invoke-virtual {v9, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    move-object v13, p1

    invoke-virtual {p1, v12}, LCX3;->M0(I)LKr2;

    move-result-object v0

    invoke-virtual {v0}, LBr2;->M0()LEB0;

    move-result-object v1

    add-int/lit8 v4, v8, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-virtual/range {v0 .. v7}, Lkw6;->r(LEB0;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_2
    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final r(LEB0;Ljava/util/EnumSet;ZIZLjava/io/Writer;LBy3;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEB0;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;ZIZ",
            "Ljava/io/Writer;",
            "LBy3;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p1}, LEB0;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "EMPTY"

    invoke-virtual {p6, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    if-eqz p5, :cond_1

    invoke-virtual {p0, p3, p4, p6}, Lkw6;->w(ZILjava/io/Writer;)V

    :cond_1
    const-string p5, "("

    invoke-virtual {p6, p5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 p5, 0x0

    :goto_0
    invoke-interface {p1}, LEB0;->size()I

    move-result v0

    if-ge p5, v0, :cond_3

    if-lez p5, :cond_2

    const-string v0, ", "

    invoke-virtual {p6, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget v0, p0, Lkw6;->f:I

    if-lez v0, :cond_2

    rem-int v0, p5, v0

    if-nez v0, :cond_2

    add-int/lit8 v0, p4, 0x1

    invoke-virtual {p0, p3, v0, p6}, Lkw6;->w(ZILjava/io/Writer;)V

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p5

    move-object v4, p6

    move-object v5, p7

    invoke-virtual/range {v0 .. v5}, Lkw6;->a(LEB0;Ljava/util/EnumSet;ILjava/io/Writer;LBy3;)V

    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_3
    const-string p1, ")"

    invoke-virtual {p6, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final v(LWB1;)LBy3;
    .locals 1

    iget-object v0, p0, Lkw6;->d:LBy3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, LWB1;->h0()LeZ3;

    move-result-object p1

    invoke-static {p1}, Lkw6;->s(LeZ3;)LBy3;

    move-result-object p1

    return-object p1
.end method

.method public final w(ZILjava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_1

    if-gtz p2, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\n"

    invoke-virtual {p3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, p2, :cond_1

    iget-object v0, p0, Lkw6;->g:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final x(ZIILjava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lkw6;->f:I

    if-lez v0, :cond_1

    rem-int/2addr p2, v0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p3, p4}, Lkw6;->w(ZILjava/io/Writer;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public y(I)V
    .locals 1

    if-lez p1, :cond_0

    const/16 v0, 0x20

    invoke-static {v0, p1}, Lkw6;->z(CI)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lkw6;->g:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Tab count must be positive"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
