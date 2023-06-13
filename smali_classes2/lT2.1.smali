.class public LlT2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldj2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "mm"

    const-string v1, "hd"

    const-string v2, "nm"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, LlT2;->a:Ldj2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;)LjT2;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v1

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, LlT2;->a:Ldj2$a;

    invoke-virtual {p0, v3}, Ldj2;->s(Ldj2$a;)I

    move-result v3

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    invoke-virtual {p0}, Ldj2;->t()V

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ldj2;->i()Z

    move-result v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ldj2;->l()I

    move-result v1

    invoke-static {v1}, LjT2$a;->b(I)LjT2$a;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ldj2;->n()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-instance p0, LjT2;

    invoke-direct {p0, v0, v1, v2}, LjT2;-><init>(Ljava/lang/String;LjT2$a;Z)V

    return-object p0
.end method
