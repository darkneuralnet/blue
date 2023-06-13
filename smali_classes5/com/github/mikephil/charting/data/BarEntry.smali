.class public Lcom/github/mikephil/charting/data/BarEntry;
.super Lcom/github/mikephil/charting/data/Entry;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field public f:[F

.field public g:[Lfn4;

.field public h:F

.field public i:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    return-void
.end method


# virtual methods
.method public c()F
    .locals 1

    invoke-super {p0}, LAA;->c()F

    move-result v0

    return v0
.end method

.method public h()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/data/BarEntry;->h:F

    return v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/data/BarEntry;->i:F

    return v0
.end method

.method public j()[Lfn4;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/data/BarEntry;->g:[Lfn4;

    return-object v0
.end method

.method public k()[F
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/data/BarEntry;->f:[F

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/data/BarEntry;->f:[F

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
