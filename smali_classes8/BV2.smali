.class public LBV2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[LyB0;

.field public b:I

.field public c:I

.field public d:Lsf1;

.field public e:Ljava/lang/Object;

.field public f:I


# direct methods
.method public constructor <init>([LyB0;IILjava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LBV2;->d:Lsf1;

    iput-object p1, p0, LBV2;->a:[LyB0;

    iput p2, p0, LBV2;->b:I

    iput p3, p0, LBV2;->c:I

    iput-object p4, p0, LBV2;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(IILBV2;IIDLGV2;)V
    .locals 17

    move/from16 v9, p1

    move/from16 v10, p2

    move/from16 v11, p4

    move/from16 v12, p5

    sub-int v0, v10, v9

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sub-int v0, v12, v11

    if-ne v0, v1, :cond_0

    move-object/from16 v13, p0

    move-object/from16 v14, p3

    move-object/from16 v15, p8

    invoke-virtual {v15, v13, v9, v14, v11}, LGV2;->b(LBV2;ILBV2;I)V

    return-void

    :cond_0
    move-object/from16 v13, p0

    move-object/from16 v14, p3

    move-object/from16 v15, p8

    invoke-virtual/range {p0 .. p7}, LBV2;->g(IILBV2;IID)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    add-int v0, v9, v10

    div-int/lit8 v8, v0, 0x2

    add-int v0, v11, v12

    div-int/lit8 v6, v0, 0x2

    if-ge v9, v8, :cond_4

    if-ge v11, v6, :cond_2

    move-object/from16 v0, p0

    move/from16 v1, p1

    move v2, v8

    move-object/from16 v3, p3

    move/from16 v4, p4

    move v5, v6

    move v9, v6

    move-wide/from16 v6, p6

    move/from16 v16, v8

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, LBV2;->a(IILBV2;IIDLGV2;)V

    goto :goto_0

    :cond_2
    move v9, v6

    move/from16 v16, v8

    :goto_0
    if-ge v9, v12, :cond_3

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, v16

    move-object/from16 v3, p3

    move v4, v9

    move/from16 v5, p5

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, LBV2;->a(IILBV2;IIDLGV2;)V

    :cond_3
    move/from16 v8, v16

    goto :goto_1

    :cond_4
    move v9, v6

    :goto_1
    if-ge v8, v10, :cond_6

    if-ge v11, v9, :cond_5

    move-object/from16 v0, p0

    move v1, v8

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move v5, v9

    move-wide/from16 v6, p6

    move v11, v8

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, LBV2;->a(IILBV2;IIDLGV2;)V

    goto :goto_2

    :cond_5
    move v11, v8

    :goto_2
    if-ge v9, v12, :cond_6

    move-object/from16 v0, p0

    move v1, v11

    move/from16 v2, p2

    move-object/from16 v3, p3

    move v4, v9

    move/from16 v5, p5

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, LBV2;->a(IILBV2;IIDLGV2;)V

    :cond_6
    return-void
.end method

.method public b(LBV2;DLGV2;)V
    .locals 9

    iget v1, p0, LBV2;->b:I

    iget v2, p0, LBV2;->c:I

    iget v4, p1, LBV2;->b:I

    iget v5, p1, LBV2;->c:I

    move-object v0, p0

    move-object v3, p1

    move-wide v6, p2

    move-object v8, p4

    invoke-virtual/range {v0 .. v8}, LBV2;->a(IILBV2;IIDLGV2;)V

    return-void
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LBV2;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public d(D)Lsf1;
    .locals 3

    iget-object v0, p0, LBV2;->d:Lsf1;

    if-nez v0, :cond_0

    iget-object v0, p0, LBV2;->a:[LyB0;

    iget v1, p0, LBV2;->b:I

    aget-object v1, v0, v1

    iget v2, p0, LBV2;->c:I

    aget-object v0, v0, v2

    new-instance v2, Lsf1;

    invoke-direct {v2, v1, v0}, Lsf1;-><init>(LyB0;LyB0;)V

    iput-object v2, p0, LBV2;->d:Lsf1;

    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-lez v0, :cond_0

    invoke-virtual {v2, p1, p2}, Lsf1;->h(D)V

    :cond_0
    iget-object p1, p0, LBV2;->d:Lsf1;

    return-object p1
.end method

.method public e()I
    .locals 1

    iget v0, p0, LBV2;->f:I

    return v0
.end method

.method public f(ILAr2;)V
    .locals 2

    iget-object v0, p0, LBV2;->a:[LyB0;

    aget-object v1, v0, p1

    iput-object v1, p2, LAr2;->b:LyB0;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    iput-object p1, p2, LAr2;->c:LyB0;

    return-void
.end method

.method public final g(IILBV2;IID)Z
    .locals 8

    const-wide/16 v0, 0x0

    cmpl-double v0, p6, v0

    if-lez v0, :cond_0

    iget-object v0, p0, LBV2;->a:[LyB0;

    aget-object v2, v0, p1

    aget-object v3, v0, p2

    iget-object p1, p3, LBV2;->a:[LyB0;

    aget-object v4, p1, p4

    aget-object v5, p1, p5

    move-object v1, p0

    move-wide v6, p6

    invoke-virtual/range {v1 .. v7}, LBV2;->h(LyB0;LyB0;LyB0;LyB0;D)Z

    move-result p1

    return p1

    :cond_0
    iget-object p6, p0, LBV2;->a:[LyB0;

    aget-object p1, p6, p1

    aget-object p2, p6, p2

    iget-object p3, p3, LBV2;->a:[LyB0;

    aget-object p4, p3, p4

    aget-object p3, p3, p5

    invoke-static {p1, p2, p4, p3}, Lsf1;->J(LyB0;LyB0;LyB0;LyB0;)Z

    move-result p1

    return p1
.end method

.method public final h(LyB0;LyB0;LyB0;LyB0;D)Z
    .locals 14

    move-object v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    iget-wide v4, v2, LyB0;->b:D

    iget-wide v6, v3, LyB0;->b:D

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    iget-wide v6, v2, LyB0;->b:D

    iget-wide v8, v3, LyB0;->b:D

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    iget-wide v8, v0, LyB0;->b:D

    iget-wide v10, v1, LyB0;->b:D

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(DD)D

    move-result-wide v8

    iget-wide v10, v0, LyB0;->b:D

    iget-wide v12, v1, LyB0;->b:D

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(DD)D

    move-result-wide v10

    add-double v6, v6, p5

    cmpl-double v6, v8, v6

    const/4 v7, 0x0

    if-lez v6, :cond_0

    return v7

    :cond_0
    sub-double v4, v4, p5

    cmpg-double v4, v10, v4

    if-gez v4, :cond_1

    return v7

    :cond_1
    iget-wide v4, v2, LyB0;->c:D

    iget-wide v8, v3, LyB0;->c:D

    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    iget-wide v8, v2, LyB0;->c:D

    iget-wide v2, v3, LyB0;->c:D

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    iget-wide v8, v0, LyB0;->c:D

    iget-wide v10, v1, LyB0;->c:D

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(DD)D

    move-result-wide v8

    iget-wide v10, v0, LyB0;->c:D

    iget-wide v0, v1, LyB0;->c:D

    invoke-static {v10, v11, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    add-double v2, v2, p5

    cmpl-double v2, v8, v2

    if-lez v2, :cond_2

    return v7

    :cond_2
    sub-double v4, v4, p5

    cmpg-double v0, v0, v4

    if-gez v0, :cond_3

    return v7

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public i(I)V
    .locals 0

    iput p1, p0, LBV2;->f:I

    return-void
.end method
