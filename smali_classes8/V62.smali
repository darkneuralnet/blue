.class public abstract LV62;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV62$a;
    }
.end annotation


# instance fields
.field public a:D

.field public b:D


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    iput-wide v0, p0, LV62;->a:D

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    iput-wide v0, p0, LV62;->b:D

    return-void
.end method


# virtual methods
.method public a(DD)Z
    .locals 2

    iget-wide v0, p0, LV62;->a:D

    cmpl-double p3, v0, p3

    if-gtz p3, :cond_1

    iget-wide p3, p0, LV62;->b:D

    cmpg-double p1, p3, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract b(DDLhg2;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    new-instance v0, LyB0;

    iget-wide v1, p0, LV62;->a:D

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, LyB0;-><init>(DD)V

    new-instance v1, LyB0;

    iget-wide v5, p0, LV62;->b:D

    invoke-direct {v1, v5, v6, v3, v4}, LyB0;-><init>(DD)V

    invoke-static {v0, v1}, Lkw6;->A(LyB0;LyB0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
