.class public Lpy5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldj2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v0, "nm"

    const-string v1, "c"

    const-string v2, "o"

    const-string v3, "fillEnabled"

    const-string v4, "r"

    const-string v5, "hd"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, Lpy5;->a:Ldj2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;LrD2;)Loy5;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object v4, v0

    move-object v7, v4

    move v5, v1

    move v9, v5

    move v1, v2

    :goto_0
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lpy5;->a:Ldj2$a;

    invoke-virtual {p0, v3}, Ldj2;->s(Ldj2$a;)I

    move-result v3

    if-eqz v3, :cond_5

    if-eq v3, v2, :cond_4

    const/4 v6, 0x2

    if-eq v3, v6, :cond_3

    const/4 v6, 0x3

    if-eq v3, v6, :cond_2

    const/4 v6, 0x4

    if-eq v3, v6, :cond_1

    const/4 v6, 0x5

    if-eq v3, v6, :cond_0

    invoke-virtual {p0}, Ldj2;->t()V

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ldj2;->i()Z

    move-result v9

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ldj2;->l()I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ldj2;->i()Z

    move-result v5

    goto :goto_0

    :cond_3
    invoke-static {p0, p1}, LHe;->h(Ldj2;LrD2;)Lse;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-static {p0, p1}, LHe;->c(Ldj2;LrD2;)Lpe;

    move-result-object v7

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Ldj2;->n()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_6
    if-nez v0, :cond_7

    new-instance v0, Lse;

    new-instance p0, Lfl2;

    const/16 p1, 0x64

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lfl2;-><init>(Ljava/lang/Object;)V

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lse;-><init>(Ljava/util/List;)V

    :cond_7
    move-object v8, v0

    if-ne v1, v2, :cond_8

    sget-object p0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_1

    :cond_8
    sget-object p0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    :goto_1
    move-object v6, p0

    new-instance p0, Loy5;

    move-object v3, p0

    invoke-direct/range {v3 .. v9}, Loy5;-><init>(Ljava/lang/String;ZLandroid/graphics/Path$FillType;Lpe;Lse;Z)V

    return-object p0
.end method
