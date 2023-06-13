.class public Lch5;
.super Lj1;
.source "SourceFile"

# interfaces
.implements LNN5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lch5$d;
    }
.end annotation


# static fields
.field public static f:Ljava/util/Comparator; = null

.field public static g:Ljava/util/Comparator; = null

.field public static h:Lj1$a; = null

.field private static final serialVersionUID:J = 0x39920f7d5f261e4L


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lch5$a;

    invoke-direct {v0}, Lch5$a;-><init>()V

    sput-object v0, Lch5;->f:Ljava/util/Comparator;

    new-instance v0, Lch5$b;

    invoke-direct {v0}, Lch5$b;-><init>()V

    sput-object v0, Lch5;->g:Ljava/util/Comparator;

    new-instance v0, Lch5$c;

    invoke-direct {v0}, Lch5$c;-><init>()V

    sput-object v0, Lch5;->h:Lj1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lch5;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lj1;-><init>(I)V

    return-void
.end method

.method public static synthetic p(Lsf1;)D
    .locals 2

    invoke-static {p0}, Lch5;->s(Lsf1;)D

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic q(Lsf1;)D
    .locals 2

    invoke-static {p0}, Lch5;->t(Lsf1;)D

    move-result-wide v0

    return-wide v0
.end method

.method public static r(DD)D
    .locals 0

    add-double/2addr p0, p2

    const-wide/high16 p2, 0x4000000000000000L    # 2.0

    div-double/2addr p0, p2

    return-wide p0
.end method

.method public static s(Lsf1;)D
    .locals 4

    invoke-virtual {p0}, Lsf1;->p()D

    move-result-wide v0

    invoke-virtual {p0}, Lsf1;->n()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lch5;->r(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public static t(Lsf1;)D
    .locals 4

    invoke-virtual {p0}, Lsf1;->q()D

    move-result-wide v0

    invoke-virtual {p0}, Lsf1;->o()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lch5;->r(DD)D

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a(Lsf1;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p1}, Lsf1;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, Lj1;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lsf1;)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1}, Lj1;->n(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public f(I)LZ0;
    .locals 1

    new-instance v0, Lch5$d;

    invoke-direct {v0, p1}, Lch5$d;-><init>(I)V

    return-object v0
.end method

.method public g(Ljava/util/List;I)Ljava/util/List;
    .locals 4

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LKo;->c(Z)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0}, Lj1;->j()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget-object p1, Lch5;->f:Ljava/util/Comparator;

    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int p1, v2

    invoke-virtual {p0, v1, p1}, Lch5;->w(Ljava/util/List;I)[Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lch5;->v([Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Lch5;->g:Ljava/util/Comparator;

    return-object v0
.end method

.method public i()Lj1$a;
    .locals 1

    sget-object v0, Lch5;->h:Lj1$a;

    return-object v0
.end method

.method public u(Ljava/util/List;I)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1, p2}, Lj1;->g(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final v([Ljava/util/List;I)Ljava/util/List;
    .locals 3

    array-length v0, p1

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, LKo;->c(Z)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {p0, v2, p2}, Lch5;->u(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public w(Ljava/util/List;I)[Ljava/util/List;
    .locals 7

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    new-array v1, p2, [Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, p2, :cond_1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    aput-object v4, v1, v3

    move v4, v2

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    if-ge v4, v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls00;

    aget-object v6, v1, v3

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method
