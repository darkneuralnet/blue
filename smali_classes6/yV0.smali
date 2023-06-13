.class public final LyV0;
.super LBV0;
.source "SourceFile"


# instance fields
.field public final b:C


# direct methods
.method public constructor <init>(IC)V
    .locals 0

    invoke-direct {p0, p1}, LBV0;-><init>(I)V

    iput-char p2, p0, LyV0;->b:C

    return-void
.end method


# virtual methods
.method public b()C
    .locals 1

    iget-char v0, p0, LyV0;->b:C

    return v0
.end method

.method public c()Z
    .locals 2

    iget-char v0, p0, LyV0;->b:C

    const/16 v1, 0x24

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
