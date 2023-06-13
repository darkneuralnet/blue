.class public final LGx1;
.super LMP2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LMP2<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public b:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LMP2;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroidx/lifecycle/LiveData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LGx1;->b:Landroidx/lifecycle/LiveData;

    if-eqz v0, :cond_0

    invoke-super {p0, v0}, LMP2;->c(Landroidx/lifecycle/LiveData;)V

    :cond_0
    iput-object p1, p0, LGx1;->b:Landroidx/lifecycle/LiveData;

    new-instance v0, LFx1;

    invoke-direct {v0, p0}, LFx1;-><init>(LGx1;)V

    invoke-super {p0, p1, v0}, LMP2;->b(Landroidx/lifecycle/LiveData;Lfe3;)V

    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LGx1;->b:Landroidx/lifecycle/LiveData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method
