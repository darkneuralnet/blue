.class public LUQ5;
.super LWV2;
.source "SourceFile"


# instance fields
.field public a:LVQ5;

.field public b:LkO5;

.field public c:LTQ5;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LWV2;-><init>()V

    new-instance v0, LVQ5;

    invoke-direct {v0}, LVQ5;-><init>()V

    iput-object v0, p0, LUQ5;->a:LVQ5;

    iput-object v0, p0, LUQ5;->c:LTQ5;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget-object v0, p0, LUQ5;->c:LTQ5;

    invoke-interface {v0}, LTQ5;->a()F

    move-result v0

    return v0
.end method

.method public b(FFFFFF)V
    .locals 7

    iget-object v0, p0, LUQ5;->a:LVQ5;

    iput-object v0, p0, LUQ5;->c:LTQ5;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, LVQ5;->d(FFFFFF)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LUQ5;->c:LTQ5;

    invoke-interface {v0}, LTQ5;->b()Z

    move-result v0

    return v0
.end method

.method public d(FFFFFFFI)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, LUQ5;->b:LkO5;

    if-nez v1, :cond_0

    new-instance v1, LkO5;

    invoke-direct {v1}, LkO5;-><init>()V

    iput-object v1, v0, LUQ5;->b:LkO5;

    :cond_0
    iget-object v2, v0, LUQ5;->b:LkO5;

    iput-object v2, v0, LUQ5;->c:LTQ5;

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    invoke-virtual/range {v2 .. v10}, LkO5;->d(FFFFFFFI)V

    return-void
.end method

.method public getInterpolation(F)F
    .locals 1

    iget-object v0, p0, LUQ5;->c:LTQ5;

    invoke-interface {v0, p1}, LTQ5;->getInterpolation(F)F

    move-result p1

    return p1
.end method
