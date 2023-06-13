.class public LVB1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVB1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:LyB0;

.field public b:LyB0;

.field public c:D

.field public d:D


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LyB0;
    .locals 10

    iget-object v0, p0, LVB1$a;->b:LyB0;

    if-nez v0, :cond_0

    new-instance v0, LyB0;

    iget-object v1, p0, LVB1$a;->a:LyB0;

    iget-wide v2, v1, LyB0;->b:D

    iget-wide v4, p0, LVB1$a;->c:D

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    add-double/2addr v2, v4

    iget-wide v4, v1, LyB0;->c:D

    iget-wide v8, p0, LVB1$a;->d:D

    div-double/2addr v8, v6

    add-double/2addr v4, v8

    invoke-direct {v0, v2, v3, v4, v5}, LyB0;-><init>(DD)V

    iput-object v0, p0, LVB1$a;->b:LyB0;

    :cond_0
    iget-object v0, p0, LVB1$a;->b:LyB0;

    return-object v0
.end method

.method public b()Lsf1;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, LVB1$a;->a:LyB0;

    if-eqz v1, :cond_0

    new-instance v11, Lsf1;

    iget-wide v3, v1, LyB0;->b:D

    iget-wide v5, v0, LVB1$a;->c:D

    add-double/2addr v5, v3

    iget-wide v7, v1, LyB0;->c:D

    iget-wide v1, v0, LVB1$a;->d:D

    add-double v9, v7, v1

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, Lsf1;-><init>(DDDD)V

    return-object v11

    :cond_0
    iget-object v1, v0, LVB1$a;->b:LyB0;

    if-eqz v1, :cond_1

    new-instance v11, Lsf1;

    iget-wide v2, v1, LyB0;->b:D

    iget-wide v4, v0, LVB1$a;->c:D

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double v8, v4, v6

    sub-double v8, v2, v8

    div-double/2addr v4, v6

    add-double v12, v2, v4

    iget-wide v1, v1, LyB0;->c:D

    iget-wide v3, v0, LVB1$a;->d:D

    div-double v14, v3, v6

    sub-double v14, v1, v14

    div-double/2addr v3, v6

    add-double v16, v1, v3

    move-object v2, v11

    move-wide v3, v8

    move-wide v5, v12

    move-wide v7, v14

    move-wide/from16 v9, v16

    invoke-direct/range {v2 .. v10}, Lsf1;-><init>(DDDD)V

    return-object v11

    :cond_1
    new-instance v1, Lsf1;

    const-wide/16 v19, 0x0

    iget-wide v2, v0, LVB1$a;->c:D

    const-wide/16 v23, 0x0

    iget-wide v4, v0, LVB1$a;->d:D

    move-object/from16 v18, v1

    move-wide/from16 v21, v2

    move-wide/from16 v25, v4

    invoke-direct/range {v18 .. v26}, Lsf1;-><init>(DDDD)V

    return-object v1
.end method

.method public c(LyB0;)V
    .locals 0

    iput-object p1, p0, LVB1$a;->b:LyB0;

    return-void
.end method

.method public d(D)V
    .locals 0

    iput-wide p1, p0, LVB1$a;->d:D

    return-void
.end method

.method public e(D)V
    .locals 0

    iput-wide p1, p0, LVB1$a;->c:D

    return-void
.end method
