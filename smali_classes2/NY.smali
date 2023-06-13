.class public LNY;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldj2$a;

.field public static final b:Ldj2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "ef"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, LNY;->a:Ldj2$a;

    const-string v0, "ty"

    const-string v1, "v"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, LNY;->b:Ldj2$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;LrD2;)LMY;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ldj2;->c()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, LNY;->b:Ldj2$a;

    invoke-virtual {p0, v3}, Ldj2;->s(Ldj2$a;)I

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_1

    invoke-virtual {p0}, Ldj2;->t()V

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    new-instance v0, LMY;

    invoke-static {p0, p1}, LHe;->e(Ldj2;LrD2;)Lqe;

    move-result-object v3

    invoke-direct {v0, v3}, LMY;-><init>(Lqe;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ldj2;->l()I

    move-result v2

    if-nez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Ldj2;->f()V

    return-object v0
.end method

.method public static b(Ldj2;LrD2;)LMY;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, LNY;->a:Ldj2$a;

    invoke-virtual {p0, v1}, Ldj2;->s(Ldj2$a;)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ldj2;->t()V

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ldj2;->b()V

    :cond_1
    :goto_1
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p0, p1}, LNY;->a(Ldj2;LrD2;)LMY;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ldj2;->d()V

    goto :goto_0

    :cond_3
    return-object v0
.end method
