.class public LcX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LrO1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LMO1;Llr2;)F
    .locals 4

    invoke-interface {p2}, Lki0;->h()F

    move-result v0

    invoke-interface {p2}, Lki0;->g()F

    move-result v1

    invoke-interface {p2}, Llr2;->k()Lkr2;

    move-result-object p2

    invoke-interface {p1}, LoO1;->U()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    invoke-interface {p1}, LoO1;->Y()F

    move-result v2

    cmpg-float v2, v2, v3

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lii0;->n()F

    move-result v2

    cmpl-float v2, v2, v3

    if-lez v2, :cond_1

    move v0, v3

    :cond_1
    invoke-virtual {p2}, Lii0;->p()F

    move-result p2

    cmpg-float p2, p2, v3

    if-gez p2, :cond_2

    move v1, v3

    :cond_2
    invoke-interface {p1}, LoO1;->Y()F

    move-result p1

    cmpl-float p1, p1, v3

    if-ltz p1, :cond_3

    move v3, v1

    goto :goto_0

    :cond_3
    move v3, v0

    :goto_0
    return v3
.end method
