.class public Ltf1;
.super LTz5;
.source "SourceFile"


# instance fields
.field public b:Lsf1;

.field public c:Z


# direct methods
.method public constructor <init>(Lsf1;)V
    .locals 1

    invoke-direct {p0}, LTz5;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltf1;->c:Z

    iput-object p1, p0, Ltf1;->b:Lsf1;

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ltf1;->c:Z

    return v0
.end method

.method public c(LWB1;)V
    .locals 6

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p1

    iget-object v0, p0, Ltf1;->b:Lsf1;

    invoke-virtual {v0, p1}, Lsf1;->K(Lsf1;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ltf1;->b:Lsf1;

    invoke-virtual {v0, p1}, Lsf1;->b(Lsf1;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Ltf1;->c:Z

    return-void

    :cond_1
    invoke-virtual {p1}, Lsf1;->p()D

    move-result-wide v2

    iget-object v0, p0, Ltf1;->b:Lsf1;

    invoke-virtual {v0}, Lsf1;->p()D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-ltz v0, :cond_2

    invoke-virtual {p1}, Lsf1;->n()D

    move-result-wide v2

    iget-object v0, p0, Ltf1;->b:Lsf1;

    invoke-virtual {v0}, Lsf1;->n()D

    move-result-wide v4

    cmpg-double v0, v2, v4

    if-gtz v0, :cond_2

    iput-boolean v1, p0, Ltf1;->c:Z

    return-void

    :cond_2
    invoke-virtual {p1}, Lsf1;->q()D

    move-result-wide v2

    iget-object v0, p0, Ltf1;->b:Lsf1;

    invoke-virtual {v0}, Lsf1;->q()D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-ltz v0, :cond_3

    invoke-virtual {p1}, Lsf1;->o()D

    move-result-wide v2

    iget-object p1, p0, Ltf1;->b:Lsf1;

    invoke-virtual {p1}, Lsf1;->o()D

    move-result-wide v4

    cmpg-double p1, v2, v4

    if-gtz p1, :cond_3

    iput-boolean v1, p0, Ltf1;->c:Z

    :cond_3
    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Ltf1;->c:Z

    return v0
.end method
