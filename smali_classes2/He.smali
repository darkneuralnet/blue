.class public LHe;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;FLrD2;LLj6;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldj2;",
            "F",
            "LrD2;",
            "LLj6<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lfl2<",
            "TT;>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p2, p1, p3, v0}, Lil2;->a(Ldj2;LrD2;FLLj6;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ldj2;LrD2;LLj6;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldj2;",
            "LrD2;",
            "LLj6<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lfl2<",
            "TT;>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, p2, v1}, Lil2;->a(Ldj2;LrD2;FLLj6;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ldj2;LrD2;)Lpe;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lpe;

    sget-object v1, Lym0;->a:Lym0;

    invoke-static {p0, p1, v1}, LHe;->b(Ldj2;LrD2;LLj6;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lpe;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static d(Ldj2;LrD2;)LBe;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, LBe;

    invoke-static {}, LGi6;->e()F

    move-result v1

    sget-object v2, LO51;->a:LO51;

    invoke-static {p0, v1, p1, v2}, LHe;->a(Ldj2;FLrD2;LLj6;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, LBe;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static e(Ldj2;LrD2;)Lqe;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, LHe;->f(Ldj2;LrD2;Z)Lqe;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ldj2;LrD2;Z)Lqe;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lqe;

    if-eqz p2, :cond_0

    invoke-static {}, LGi6;->e()F

    move-result p2

    goto :goto_0

    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_0
    sget-object v1, Lqu1;->a:Lqu1;

    invoke-static {p0, p2, p1, v1}, LHe;->a(Ldj2;FLrD2;LLj6;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lqe;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static g(Ldj2;LrD2;I)Lre;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lre;

    new-instance v1, LKD1;

    invoke-direct {v1, p2}, LKD1;-><init>(I)V

    invoke-static {p0, p1, v1}, LHe;->b(Ldj2;LrD2;LLj6;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lre;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static h(Ldj2;LrD2;)Lse;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lse;

    sget-object v1, LO52;->a:LO52;

    invoke-static {p0, p1, v1}, LHe;->b(Ldj2;LrD2;LLj6;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lse;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static i(Ldj2;LrD2;)Lxe;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lxe;

    invoke-static {}, LGi6;->e()F

    move-result v1

    sget-object v2, LJW3;->a:LJW3;

    const/4 v3, 0x1

    invoke-static {p0, p1, v1, v2, v3}, Lil2;->a(Ldj2;LrD2;FLLj6;Z)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lxe;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static j(Ldj2;LrD2;)Lye;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lye;

    sget-object v1, Lej5;->a:Lej5;

    invoke-static {p0, p1, v1}, LHe;->b(Ldj2;LrD2;LLj6;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lye;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static k(Ldj2;LrD2;)Lze;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lze;

    invoke-static {}, LGi6;->e()F

    move-result v1

    sget-object v2, Lny5;->a:Lny5;

    invoke-static {p0, v1, p1, v2}, LHe;->a(Ldj2;FLrD2;LLj6;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lze;-><init>(Ljava/util/List;)V

    return-object v0
.end method
