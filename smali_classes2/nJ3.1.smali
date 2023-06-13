.class public LnJ3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;LrD2;)LlJ3;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ldj2;->q()Ldj2$b;

    move-result-object v0

    sget-object v1, Ldj2$b;->d:Ldj2$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v5, v0

    invoke-static {}, LGi6;->e()F

    move-result v3

    sget-object v4, LuJ3;->a:LuJ3;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lhl2;->c(Ldj2;LrD2;FLLj6;ZZ)Lfl2;

    move-result-object p0

    new-instance v0, LlJ3;

    invoke-direct {v0, p1, p0}, LlJ3;-><init>(LrD2;Lfl2;)V

    return-object v0
.end method
