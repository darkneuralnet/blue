.class public LDe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldj2$a;

.field public static final b:Ldj2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "a"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, LDe;->a:Ldj2$a;

    const-string v0, "sw"

    const-string v1, "t"

    const-string v2, "fc"

    const-string v3, "sc"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, LDe;->b:Ldj2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;LrD2;)LCe;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ldj2;->c()V

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, LDe;->a:Ldj2$a;

    invoke-virtual {p0, v2}, Ldj2;->s(Ldj2$a;)I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ldj2;->t()V

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LDe;->b(Ldj2;LrD2;)LCe;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ldj2;->f()V

    if-nez v1, :cond_2

    new-instance p0, LCe;

    invoke-direct {p0, v0, v0, v0, v0}, LCe;-><init>(Lpe;Lpe;Lqe;Lqe;)V

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static b(Ldj2;LrD2;)LCe;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ldj2;->c()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    :goto_0
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, LDe;->b:Ldj2$a;

    invoke-virtual {p0, v4}, Ldj2;->s(Ldj2$a;)I

    move-result v4

    if-eqz v4, :cond_3

    const/4 v5, 0x1

    if-eq v4, v5, :cond_2

    const/4 v5, 0x2

    if-eq v4, v5, :cond_1

    const/4 v5, 0x3

    if-eq v4, v5, :cond_0

    invoke-virtual {p0}, Ldj2;->t()V

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LHe;->e(Ldj2;LrD2;)Lqe;

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, LHe;->e(Ldj2;LrD2;)Lqe;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-static {p0, p1}, LHe;->c(Ldj2;LrD2;)Lpe;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-static {p0, p1}, LHe;->c(Ldj2;LrD2;)Lpe;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Ldj2;->f()V

    new-instance p0, LCe;

    invoke-direct {p0, v0, v1, v2, v3}, LCe;-><init>(Lpe;Lpe;Lqe;Lqe;)V

    return-object p0
.end method
