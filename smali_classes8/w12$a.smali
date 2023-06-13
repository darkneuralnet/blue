.class public Lw12$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw12;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Z

.field public final b:LxN5;


# direct methods
.method public constructor <init>(LWB1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LxN5;

    invoke-direct {v0}, LxN5;-><init>()V

    iput-object v0, p0, Lw12$a;->b:LxN5;

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lw12$a;->a:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lw12$a;->a:Z

    invoke-virtual {p0, p1}, Lw12$a;->b(LWB1;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final a([LyB0;)V
    .locals 8

    const/4 v0, 0x1

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    new-instance v7, LAr2;

    add-int/lit8 v1, v0, -0x1

    aget-object v1, p1, v1

    aget-object v2, p1, v0

    invoke-direct {v7, v1, v2}, LAr2;-><init>(LyB0;LyB0;)V

    iget-object v1, v7, LAr2;->b:LyB0;

    iget-wide v1, v1, LyB0;->c:D

    iget-object v3, v7, LAr2;->c:LyB0;

    iget-wide v3, v3, LyB0;->c:D

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    iget-object v1, v7, LAr2;->b:LyB0;

    iget-wide v1, v1, LyB0;->c:D

    iget-object v5, v7, LAr2;->c:LyB0;

    iget-wide v5, v5, LyB0;->c:D

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v5

    iget-object v2, p0, Lw12$a;->b:LxN5;

    invoke-virtual/range {v2 .. v7}, LxN5;->e(DDLjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(LWB1;)V
    .locals 1

    invoke-static {p1}, LDr2;->b(LWB1;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBr2;

    invoke-virtual {v0}, LBr2;->Y()[LyB0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lw12$a;->a([LyB0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(DDLhg2;)V
    .locals 7

    iget-boolean v0, p0, Lw12$a;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lw12$a;->b:LxN5;

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LxN5;->f(DDLhg2;)V

    return-void
.end method
