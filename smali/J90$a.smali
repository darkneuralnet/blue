.class public LJ90$a;
.super LMP2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

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

.field public final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, LMP2;-><init>()V

    iput-object p1, p0, LJ90$a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Landroidx/lifecycle/LiveData;Lfe3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/LiveData<",
            "TS;>;",
            "Lfe3<",
            "-TS;>;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public d(Landroidx/lifecycle/LiveData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LJ90$a;->b:Landroidx/lifecycle/LiveData;

    if-eqz v0, :cond_0

    invoke-super {p0, v0}, LMP2;->c(Landroidx/lifecycle/LiveData;)V

    :cond_0
    iput-object p1, p0, LJ90$a;->b:Landroidx/lifecycle/LiveData;

    new-instance v0, LI90;

    invoke-direct {v0, p0}, LI90;-><init>(LJ90$a;)V

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

    iget-object v0, p0, LJ90$a;->b:Landroidx/lifecycle/LiveData;

    if-nez v0, :cond_0

    iget-object v0, p0, LJ90$a;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method
