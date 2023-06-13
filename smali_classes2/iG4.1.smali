.class public LiG4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldj2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "tr"

    const-string v1, "hd"

    const-string v2, "nm"

    const-string v3, "c"

    const-string v4, "o"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, LiG4;->a:Ldj2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;LrD2;)LgG4;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v3, v0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move v7, v1

    :goto_0
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, LiG4;->a:Ldj2$a;

    invoke-virtual {p0, v0}, Ldj2;->s(Ldj2$a;)I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ldj2;->i()Z

    move-result v7

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, LFe;->g(Ldj2;LrD2;)LEe;

    move-result-object v6

    goto :goto_0

    :cond_2
    invoke-static {p0, p1, v1}, LHe;->f(Ldj2;LrD2;Z)Lqe;

    move-result-object v5

    goto :goto_0

    :cond_3
    invoke-static {p0, p1, v1}, LHe;->f(Ldj2;LrD2;Z)Lqe;

    move-result-object v4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Ldj2;->n()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_5
    new-instance p0, LgG4;

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, LgG4;-><init>(Ljava/lang/String;Lqe;Lqe;LEe;Z)V

    return-object p0
.end method
