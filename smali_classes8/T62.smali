.class public LT62;
.super LV62;
.source "SourceFile"


# instance fields
.field public c:LV62;

.field public d:LV62;


# direct methods
.method public constructor <init>(LV62;LV62;)V
    .locals 0

    invoke-direct {p0}, LV62;-><init>()V

    iput-object p1, p0, LT62;->c:LV62;

    iput-object p2, p0, LT62;->d:LV62;

    invoke-virtual {p0, p1, p2}, LT62;->c(LV62;LV62;)V

    return-void
.end method


# virtual methods
.method public b(DDLhg2;)V
    .locals 8

    invoke-virtual {p0, p1, p2, p3, p4}, LV62;->a(DD)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LT62;->c:LV62;

    if-eqz v1, :cond_1

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LV62;->b(DDLhg2;)V

    :cond_1
    iget-object v2, p0, LT62;->d:LV62;

    if-eqz v2, :cond_2

    move-wide v3, p1

    move-wide v5, p3

    move-object v7, p5

    invoke-virtual/range {v2 .. v7}, LV62;->b(DDLhg2;)V

    :cond_2
    return-void
.end method

.method public final c(LV62;LV62;)V
    .locals 4

    iget-wide v0, p1, LV62;->a:D

    iget-wide v2, p2, LV62;->a:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, LV62;->a:D

    iget-wide v0, p1, LV62;->b:D

    iget-wide p1, p2, LV62;->b:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    iput-wide p1, p0, LV62;->b:D

    return-void
.end method
