.class public LO51;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLj6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LLj6<",
        "LN51;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:LO51;

.field public static final b:Ldj2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, LO51;

    invoke-direct {v0}, LO51;-><init>()V

    sput-object v0, LO51;->a:LO51;

    const-string v1, "t"

    const-string v2, "f"

    const-string v3, "s"

    const-string v4, "j"

    const-string v5, "tr"

    const-string v6, "lh"

    const-string v7, "ls"

    const-string v8, "fc"

    const-string v9, "sc"

    const-string v10, "sw"

    const-string v11, "of"

    const-string v12, "ps"

    const-string v13, "sz"

    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldj2$a;->a([Ljava/lang/String;)Ldj2$a;

    move-result-object v0

    sput-object v0, LO51;->b:Ldj2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ldj2;F)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LO51;->b(Ldj2;F)LN51;

    move-result-object p1

    return-object p1
.end method

.method public b(Ldj2;F)LN51;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LN51$a;->d:LN51$a;

    invoke-virtual/range {p1 .. p1}, Ldj2;->c()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v9, v0

    move-object v6, v1

    move-object v7, v6

    move-object/from16 v17, v7

    move-object/from16 v18, v17

    move v8, v2

    move v11, v8

    move v12, v11

    move v15, v12

    move v10, v3

    move v13, v10

    move v14, v13

    move/from16 v16, v4

    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ldj2;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LO51;->b:Ldj2$a;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ldj2;->s(Ldj2$a;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-virtual/range {p1 .. p1}, Ldj2;->t()V

    invoke-virtual/range {p1 .. p1}, Ldj2;->u()V

    goto :goto_0

    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Ldj2;->b()V

    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual/range {p1 .. p1}, Ldj2;->k()D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, p2

    invoke-virtual/range {p1 .. p1}, Ldj2;->k()D

    move-result-wide v3

    double-to-float v3, v3

    mul-float v3, v3, p2

    invoke-direct {v0, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual/range {p1 .. p1}, Ldj2;->d()V

    move-object/from16 v18, v0

    goto :goto_0

    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Ldj2;->b()V

    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual/range {p1 .. p1}, Ldj2;->k()D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, p2

    invoke-virtual/range {p1 .. p1}, Ldj2;->k()D

    move-result-wide v3

    double-to-float v3, v3

    mul-float v3, v3, p2

    invoke-direct {v0, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual/range {p1 .. p1}, Ldj2;->d()V

    move-object/from16 v17, v0

    goto :goto_0

    :pswitch_2
    invoke-virtual/range {p1 .. p1}, Ldj2;->i()Z

    move-result v16

    goto :goto_0

    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Ldj2;->k()D

    move-result-wide v2

    double-to-float v15, v2

    goto :goto_0

    :pswitch_4
    invoke-static/range {p1 .. p1}, Lzj2;->d(Ldj2;)I

    move-result v14

    goto :goto_0

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lzj2;->d(Ldj2;)I

    move-result v13

    goto :goto_0

    :pswitch_6
    invoke-virtual/range {p1 .. p1}, Ldj2;->k()D

    move-result-wide v2

    double-to-float v12, v2

    goto :goto_0

    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Ldj2;->k()D

    move-result-wide v2

    double-to-float v11, v2

    goto :goto_0

    :pswitch_8
    invoke-virtual/range {p1 .. p1}, Ldj2;->l()I

    move-result v10

    goto :goto_0

    :pswitch_9
    invoke-virtual/range {p1 .. p1}, Ldj2;->l()I

    move-result v0

    sget-object v9, LN51$a;->d:LN51$a;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-gt v0, v2, :cond_0

    if-gez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static {}, LN51$a;->values()[LN51$a;

    move-result-object v2

    aget-object v9, v2, v0

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual/range {p1 .. p1}, Ldj2;->k()D

    move-result-wide v2

    double-to-float v8, v2

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual/range {p1 .. p1}, Ldj2;->n()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual/range {p1 .. p1}, Ldj2;->n()Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_0

    :cond_2
    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Ldj2;->f()V

    new-instance v0, LN51;

    move-object v5, v0

    invoke-direct/range {v5 .. v18}, LN51;-><init>(Ljava/lang/String;Ljava/lang/String;FLN51$a;IFFIIFZLandroid/graphics/PointF;Landroid/graphics/PointF;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
