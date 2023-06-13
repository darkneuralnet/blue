.class public LND1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldj2$a;

.field public static final b:Ldj2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const-string v0, "nm"

    const-string v1, "g"

    const-string v2, "o"

    const-string v3, "t"

    const-string v4, "s"

    const-string v5, "e"

    const-string v6, "r"

    const-string v7, "hd"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, LND1;->a:Ldj2$a;

    const-string v0, "p"

    const-string v1, "k"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, LND1;->b:Ldj2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ldj2;LrD2;)LLD1;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v6, v0

    move-object v4, v1

    move-object v5, v4

    move-object v7, v5

    move-object v9, v7

    move-object v10, v9

    move v13, v2

    :goto_0
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, LND1;->a:Ldj2$a;

    invoke-virtual {p0, v0}, Ldj2;->s(Ldj2$a;)I

    move-result v0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Ldj2;->t()V

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Ldj2;->i()Z

    move-result v13

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Ldj2;->l()I

    move-result v0

    if-ne v0, v2, :cond_0

    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_1

    :cond_0
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    :goto_1
    move-object v6, v0

    goto :goto_0

    :pswitch_2
    invoke-static {p0, p1}, LHe;->i(Ldj2;LrD2;)Lxe;

    move-result-object v10

    goto :goto_0

    :pswitch_3
    invoke-static {p0, p1}, LHe;->i(Ldj2;LrD2;)Lxe;

    move-result-object v9

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, Ldj2;->l()I

    move-result v0

    if-ne v0, v2, :cond_1

    sget-object v0, LRD1;->b:LRD1;

    goto :goto_2

    :cond_1
    sget-object v0, LRD1;->c:LRD1;

    :goto_2
    move-object v5, v0

    goto :goto_0

    :pswitch_5
    invoke-static {p0, p1}, LHe;->h(Ldj2;LrD2;)Lse;

    move-result-object v1

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0}, Ldj2;->c()V

    const/4 v0, -0x1

    :goto_3
    invoke-virtual {p0}, Ldj2;->g()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, LND1;->b:Ldj2$a;

    invoke-virtual {p0, v3}, Ldj2;->s(Ldj2$a;)I

    move-result v3

    if-eqz v3, :cond_3

    if-eq v3, v2, :cond_2

    invoke-virtual {p0}, Ldj2;->t()V

    invoke-virtual {p0}, Ldj2;->u()V

    goto :goto_3

    :cond_2
    invoke-static {p0, p1, v0}, LHe;->g(Ldj2;LrD2;I)Lre;

    move-result-object v7

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Ldj2;->l()I

    move-result v0

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Ldj2;->f()V

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0}, Ldj2;->n()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_5
    if-nez v1, :cond_6

    new-instance p0, Lse;

    new-instance p1, Lfl2;

    const/16 v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, v0}, Lfl2;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lse;-><init>(Ljava/util/List;)V

    move-object v8, p0

    goto :goto_4

    :cond_6
    move-object v8, v1

    :goto_4
    new-instance p0, LLD1;

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v13}, LLD1;-><init>(Ljava/lang/String;LRD1;Landroid/graphics/Path$FillType;Lre;Lse;Lxe;Lxe;Lqe;Lqe;Z)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
