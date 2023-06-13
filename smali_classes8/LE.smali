.class public LLE;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKA1;


# instance fields
.field public a:[J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([B)V
    .locals 0

    invoke-static {p1}, LMA1;->d([B)[J

    move-result-object p1

    iput-object p1, p0, LLE;->a:[J

    return-void
.end method

.method public b(J[B)V
    .locals 6

    invoke-static {}, LMA1;->l()[J

    move-result-object v0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-lez v3, :cond_2

    const/4 v3, 0x2

    new-array v3, v3, [J

    iget-object v4, p0, LLE;->a:[J

    invoke-static {v4, v3}, LMA1;->f([J[J)V

    :cond_0
    const-wide/16 v4, 0x1

    and-long/2addr v4, p1

    cmp-long v4, v4, v1

    if-eqz v4, :cond_1

    invoke-static {v0, v3}, LMA1;->j([J[J)V

    :cond_1
    invoke-static {v3, v3}, LMA1;->m([J[J)V

    const/4 v4, 0x1

    ushr-long/2addr p1, v4

    cmp-long v4, p1, v1

    if-gtz v4, :cond_0

    :cond_2
    invoke-static {v0, p3}, LMA1;->b([J[B)V

    return-void
.end method
