.class public LPm4;
.super Lii0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lii0<",
        "LbP1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lii0;-><init>()V

    return-void
.end method


# virtual methods
.method public h(LOM1;)Lcom/github/mikephil/charting/data/Entry;
    .locals 1

    invoke-virtual {p1}, LOM1;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lii0;->d(I)LoO1;

    move-result-object v0

    check-cast v0, LbP1;

    invoke-virtual {p1}, LOM1;->h()F

    move-result p1

    float-to-int p1, p1

    invoke-interface {v0, p1}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object p1

    return-object p1
.end method
