.class public abstract Lzx;
.super LTS0;
.source "SourceFile"

# interfaces
.implements LYN1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">",
        "LTS0<",
        "TT;>;",
        "LYN1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public x:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LTS0;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/16 p1, 0xbb

    const/16 p2, 0x73

    const/16 v0, 0xff

    invoke-static {v0, p1, p2}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    iput p1, p0, Lzx;->x:I

    return-void
.end method


# virtual methods
.method public K0()I
    .locals 1

    iget v0, p0, Lzx;->x:I

    return v0
.end method
