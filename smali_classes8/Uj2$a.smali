.class public LUj2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTj2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUj2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:D

.field public b:LSj2;

.field public c:D

.field public d:LyB0;


# direct methods
.method public constructor <init>(LyB0;D)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LUj2$a;->b:LSj2;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LUj2$a;->c:D

    iput-object p1, p0, LUj2$a;->d:LyB0;

    iput-wide p2, p0, LUj2$a;->a:D

    return-void
.end method


# virtual methods
.method public a(LSj2;)V
    .locals 8

    iget-object v0, p0, LUj2$a;->d:LyB0;

    invoke-virtual {p1}, LSj2;->a()LyB0;

    move-result-object v1

    invoke-virtual {v0, v1}, LyB0;->f(LyB0;)D

    move-result-wide v0

    iget-wide v2, p0, LUj2$a;->a:D

    cmpg-double v2, v0, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gtz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-nez v2, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, LUj2$a;->b:LSj2;

    if-eqz v2, :cond_2

    iget-wide v5, p0, LUj2$a;->c:D

    cmpg-double v7, v0, v5

    if-ltz v7, :cond_2

    if-eqz v2, :cond_3

    cmpl-double v2, v0, v5

    if-nez v2, :cond_3

    invoke-virtual {p1}, LSj2;->a()LyB0;

    move-result-object v2

    iget-object v5, p0, LUj2$a;->b:LSj2;

    invoke-virtual {v5}, LSj2;->a()LyB0;

    move-result-object v5

    invoke-virtual {v2, v5}, LyB0;->d(LyB0;)I

    move-result v2

    if-ge v2, v4, :cond_3

    :cond_2
    move v3, v4

    :cond_3
    if-eqz v3, :cond_4

    iput-object p1, p0, LUj2$a;->b:LSj2;

    iput-wide v0, p0, LUj2$a;->c:D

    :cond_4
    return-void
.end method

.method public b()LSj2;
    .locals 1

    iget-object v0, p0, LUj2$a;->b:LSj2;

    return-object v0
.end method

.method public c()Lsf1;
    .locals 3

    new-instance v0, Lsf1;

    iget-object v1, p0, LUj2$a;->d:LyB0;

    invoke-direct {v0, v1}, Lsf1;-><init>(LyB0;)V

    iget-wide v1, p0, LUj2$a;->a:D

    invoke-virtual {v0, v1, v2}, Lsf1;->h(D)V

    return-object v0
.end method
