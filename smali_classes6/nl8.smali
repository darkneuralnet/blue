.class public final Lnl8;
.super LOs8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LNp9;",
        ">",
        "LOs8<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lpu8;LEv8;LMb9;ZZ[B)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpu8<",
            "TT;>;",
            "LEv8;",
            "LMb9<",
            "Ljava/lang/String;",
            ">;ZZ)V"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, LOs8;-><init>(Lpu8;LEv8;LMb9;ZZ[B)V

    return-void
.end method
