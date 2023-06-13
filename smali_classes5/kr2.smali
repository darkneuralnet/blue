.class public Lkr2;
.super Lxx;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lxx<",
        "LMO1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lxx;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LMO1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lxx;-><init>(Ljava/util/List;)V

    return-void
.end method
