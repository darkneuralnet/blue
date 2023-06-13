.class public Lwe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldj2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "x"

    const-string v1, "y"

    const-string v2, "k"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, Lwe;->a:Ldj2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;LrD2;)Lve;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ldj2;->q()Ldj2$b;

    move-result-object v1

    sget-object v2, Ldj2$b;->b:Ldj2$b;

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Ldj2;->b()V

    :goto_0
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, LnJ3;->a(Ldj2;LrD2;)LlJ3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ldj2;->d()V

    invoke-static {v0}, Lil2;->b(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    new-instance p1, Lfl2;

    invoke-static {}, LGi6;->e()F

    move-result v1

    invoke-static {p0, v1}, Lzj2;->e(Ldj2;F)Landroid/graphics/PointF;

    move-result-object p0

    invoke-direct {p1, p0}, Lfl2;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    new-instance p0, Lve;

    invoke-direct {p0, v0}, Lve;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static b(Ldj2;LrD2;)LGe;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj2;",
            "LrD2;",
            ")",
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ldj2;->c()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    move v3, v1

    move-object v1, v2

    :goto_0
    invoke-virtual {p0}, Ldj2;->q()Ldj2$b;

    move-result-object v4

    sget-object v5, Ldj2$b;->e:Ldj2$b;

    if-eq v4, v5, :cond_5

    sget-object v4, Lwe;->a:Ldj2$a;

    invoke-virtual {p0, v4}, Ldj2;->s(Ldj2$a;)I

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_2

    const/4 v6, 0x2

    if-eq v4, v6, :cond_0

    invoke-virtual {p0}, Ldj2;->t()V

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ldj2;->q()Ldj2$b;

    move-result-object v4

    sget-object v6, Ldj2$b;->g:Ldj2$b;

    if-ne v4, v6, :cond_1

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_1

    :cond_1
    invoke-static {p0, p1}, LHe;->e(Ldj2;LrD2;)Lqe;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ldj2;->q()Ldj2$b;

    move-result-object v4

    sget-object v6, Ldj2$b;->g:Ldj2$b;

    if-ne v4, v6, :cond_3

    invoke-virtual {p0}, Ldj2;->u()V

    :goto_1
    move v3, v5

    goto :goto_0

    :cond_3
    invoke-static {p0, p1}, LHe;->e(Ldj2;LrD2;)Lqe;

    move-result-object v1

    goto :goto_0

    :cond_4
    invoke-static {p0, p1}, Lwe;->a(Ldj2;LrD2;)Lve;

    move-result-object v0

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Ldj2;->f()V

    if-eqz v3, :cond_6

    const-string p0, "Lottie doesn\'t support expressions."

    invoke-virtual {p1, p0}, LrD2;->a(Ljava/lang/String;)V

    :cond_6
    if-eqz v0, :cond_7

    return-object v0

    :cond_7
    new-instance p0, LAe;

    invoke-direct {p0, v1, v2}, LAe;-><init>(Lqe;Lqe;)V

    return-object p0
.end method
