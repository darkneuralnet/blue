.class public Lb26$a;
.super LgE2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb26;->q(LgE2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LgE2<",
        "LN51;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LTD2;

.field public final synthetic e:LgE2;

.field public final synthetic f:LN51;

.field public final synthetic g:Lb26;


# direct methods
.method public constructor <init>(Lb26;LTD2;LgE2;LN51;)V
    .locals 0

    iput-object p1, p0, Lb26$a;->g:Lb26;

    iput-object p2, p0, Lb26$a;->d:LTD2;

    iput-object p3, p0, Lb26$a;->e:LgE2;

    iput-object p4, p0, Lb26$a;->f:LN51;

    invoke-direct {p0}, LgE2;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LTD2;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lb26$a;->d(LTD2;)LN51;

    move-result-object p1

    return-object p1
.end method

.method public d(LTD2;)LN51;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTD2<",
            "LN51;",
            ">;)",
            "LN51;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lb26$a;->d:LTD2;

    invoke-virtual/range {p1 .. p1}, LTD2;->f()F

    move-result v2

    invoke-virtual/range {p1 .. p1}, LTD2;->a()F

    move-result v3

    invoke-virtual/range {p1 .. p1}, LTD2;->g()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LN51;

    iget-object v4, v4, LN51;->a:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, LTD2;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LN51;

    iget-object v5, v5, LN51;->a:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, LTD2;->d()F

    move-result v6

    invoke-virtual/range {p1 .. p1}, LTD2;->c()F

    move-result v7

    invoke-virtual/range {p1 .. p1}, LTD2;->e()F

    move-result v8

    invoke-virtual/range {v1 .. v8}, LTD2;->h(FFLjava/lang/Object;Ljava/lang/Object;FFF)LTD2;

    iget-object v1, v0, Lb26$a;->e:LgE2;

    iget-object v2, v0, Lb26$a;->d:LTD2;

    invoke-virtual {v1, v2}, LgE2;->a(LTD2;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, LTD2;->c()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, LTD2;->b()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, LTD2;->g()Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, LN51;

    iget-object v2, v0, Lb26$a;->f:LN51;

    iget-object v4, v1, LN51;->b:Ljava/lang/String;

    iget v5, v1, LN51;->c:F

    iget-object v6, v1, LN51;->d:LN51$a;

    iget v7, v1, LN51;->e:I

    iget v8, v1, LN51;->f:F

    iget v9, v1, LN51;->g:F

    iget v10, v1, LN51;->h:I

    iget v11, v1, LN51;->i:I

    iget v12, v1, LN51;->j:F

    iget-boolean v13, v1, LN51;->k:Z

    iget-object v14, v1, LN51;->l:Landroid/graphics/PointF;

    iget-object v15, v1, LN51;->m:Landroid/graphics/PointF;

    invoke-virtual/range {v2 .. v15}, LN51;->a(Ljava/lang/String;Ljava/lang/String;FLN51$a;IFFIIFZLandroid/graphics/PointF;Landroid/graphics/PointF;)V

    iget-object v1, v0, Lb26$a;->f:LN51;

    return-object v1
.end method
