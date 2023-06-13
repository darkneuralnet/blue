.class public abstract LLt6;
.super Li46;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLt6$e;,
        LLt6$b;,
        LLt6$m;,
        LLt6$l;,
        LLt6$k;,
        LLt6$j;,
        LLt6$i;,
        LLt6$d;,
        LLt6$h;,
        LLt6$g;,
        LLt6$f;,
        LLt6$a;,
        LLt6$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li46;-><init>()V

    return-void
.end method

.method public static g(Ljava/lang/String;Landroid/util/SparseArray;)LLt6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/util/SparseArray<",
            "Landroidx/constraintlayout/widget/a;",
            ">;)",
            "LLt6;"
        }
    .end annotation

    new-instance v0, LLt6$b;

    invoke-direct {v0, p0, p1}, LLt6$b;-><init>(Ljava/lang/String;Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public static h(Ljava/lang/String;J)LLt6;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "alpha"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0xb

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "transitionPathRotate"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v1, 0xa

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "elevation"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v1, 0x9

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "rotation"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v1, 0x8

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "scaleY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_5
    const-string v0, "scaleX"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_6
    const-string v0, "progress"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_7
    const-string v0, "translationZ"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_8
    const-string v0, "translationY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_9
    const-string v0, "translationX"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_a
    const-string v0, "rotationY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_b
    const-string v0, "rotationX"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    new-instance p0, LLt6$a;

    invoke-direct {p0}, LLt6$a;-><init>()V

    goto :goto_1

    :pswitch_1
    new-instance p0, LLt6$d;

    invoke-direct {p0}, LLt6$d;-><init>()V

    goto :goto_1

    :pswitch_2
    new-instance p0, LLt6$c;

    invoke-direct {p0}, LLt6$c;-><init>()V

    goto :goto_1

    :pswitch_3
    new-instance p0, LLt6$f;

    invoke-direct {p0}, LLt6$f;-><init>()V

    goto :goto_1

    :pswitch_4
    new-instance p0, LLt6$j;

    invoke-direct {p0}, LLt6$j;-><init>()V

    goto :goto_1

    :pswitch_5
    new-instance p0, LLt6$i;

    invoke-direct {p0}, LLt6$i;-><init>()V

    goto :goto_1

    :pswitch_6
    new-instance p0, LLt6$e;

    invoke-direct {p0}, LLt6$e;-><init>()V

    goto :goto_1

    :pswitch_7
    new-instance p0, LLt6$m;

    invoke-direct {p0}, LLt6$m;-><init>()V

    goto :goto_1

    :pswitch_8
    new-instance p0, LLt6$l;

    invoke-direct {p0}, LLt6$l;-><init>()V

    goto :goto_1

    :pswitch_9
    new-instance p0, LLt6$k;

    invoke-direct {p0}, LLt6$k;-><init>()V

    goto :goto_1

    :pswitch_a
    new-instance p0, LLt6$h;

    invoke-direct {p0}, LLt6$h;-><init>()V

    goto :goto_1

    :pswitch_b
    new-instance p0, LLt6$g;

    invoke-direct {p0}, LLt6$g;-><init>()V

    :goto_1
    invoke-virtual {p0, p1, p2}, Li46;->c(J)V

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x4a771f66 -> :sswitch_b
        -0x4a771f65 -> :sswitch_a
        -0x490b9c39 -> :sswitch_9
        -0x490b9c38 -> :sswitch_8
        -0x490b9c37 -> :sswitch_7
        -0x3bab3dd3 -> :sswitch_6
        -0x3621dfb2 -> :sswitch_5
        -0x3621dfb1 -> :sswitch_4
        -0x266f082 -> :sswitch_3
        -0x42d1a3 -> :sswitch_2
        0x2382115 -> :sswitch_1
        0x589b15e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public f(FJLandroid/view/View;Ldk2;)F
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    iget-object v5, v0, Li46;->a:LiF0;

    move/from16 v6, p1

    float-to-double v6, v6

    iget-object v8, v0, Li46;->g:[F

    invoke-virtual {v5, v6, v7, v8}, LiF0;->e(D[F)V

    iget-object v5, v0, Li46;->g:[F

    const/4 v6, 0x1

    aget v7, v5, v6

    const/4 v8, 0x0

    cmpl-float v9, v7, v8

    const/4 v10, 0x2

    const/4 v11, 0x0

    if-nez v9, :cond_0

    iput-boolean v11, v0, Li46;->h:Z

    aget v1, v5, v10

    return v1

    :cond_0
    iget v5, v0, Li46;->j:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, v0, Li46;->f:Ljava/lang/String;

    invoke-virtual {v4, v3, v5, v11}, Ldk2;->a(Ljava/lang/Object;Ljava/lang/String;I)F

    move-result v5

    iput v5, v0, Li46;->j:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_1

    iput v8, v0, Li46;->j:F

    :cond_1
    iget-wide v12, v0, Li46;->i:J

    sub-long v12, v1, v12

    iget v5, v0, Li46;->j:F

    float-to-double v14, v5

    long-to-double v12, v12

    const-wide v16, 0x3e112e0be826d695L    # 1.0E-9

    mul-double v12, v12, v16

    float-to-double v6, v7

    mul-double/2addr v12, v6

    add-double/2addr v14, v12

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    rem-double/2addr v14, v5

    double-to-float v5, v14

    iput v5, v0, Li46;->j:F

    iget-object v6, v0, Li46;->f:Ljava/lang/String;

    invoke-virtual {v4, v3, v6, v11, v5}, Ldk2;->b(Ljava/lang/Object;Ljava/lang/String;IF)V

    iput-wide v1, v0, Li46;->i:J

    iget-object v1, v0, Li46;->g:[F

    aget v1, v1, v11

    iget v2, v0, Li46;->j:F

    invoke-virtual {v0, v2}, Li46;->a(F)F

    move-result v2

    iget-object v3, v0, Li46;->g:[F

    aget v3, v3, v10

    mul-float/2addr v2, v1

    add-float/2addr v2, v3

    cmpl-float v1, v1, v8

    if-nez v1, :cond_3

    if-eqz v9, :cond_2

    goto :goto_0

    :cond_2
    move v6, v11

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v6, 0x1

    :goto_1
    iput-boolean v6, v0, Li46;->h:Z

    return v2
.end method

.method public abstract i(Landroid/view/View;FJLdk2;)Z
.end method
