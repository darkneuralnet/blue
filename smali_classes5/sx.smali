.class public Lsx;
.super Lxx;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lxx<",
        "LXN1;",
        ">;"
    }
.end annotation


# instance fields
.field public j:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lxx;-><init>()V

    const v0, 0x3f59999a    # 0.85f

    iput v0, p0, Lsx;->j:F

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LXN1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lxx;-><init>(Ljava/util/List;)V

    const p1, 0x3f59999a    # 0.85f

    iput p1, p0, Lsx;->j:F

    return-void
.end method


# virtual methods
.method public s()F
    .locals 1

    iget v0, p0, Lsx;->j:F

    return v0
.end method

.method public t(F)V
    .locals 0

    iput p1, p0, Lsx;->j:F

    return-void
.end method
