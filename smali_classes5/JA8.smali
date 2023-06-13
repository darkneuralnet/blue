.class public final LJA8;
.super LIm8;
.source "SourceFile"


# instance fields
.field public final synthetic a:LHt8;


# direct methods
.method public constructor <init>(LHt8;)V
    .locals 0

    iput-object p1, p0, LJA8;->a:LHt8;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LIm8;-><init>(LVe8;)V

    return-void
.end method


# virtual methods
.method public final m0(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, LJA8;->a:LHt8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
