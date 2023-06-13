.class public final LYM7;
.super LyF7;
.source "SourceFile"


# instance fields
.field public final synthetic a:LpN7;


# direct methods
.method public constructor <init>(LpN7;)V
    .locals 0

    iput-object p1, p0, LYM7;->a:LpN7;

    invoke-direct {p0}, LyF7;-><init>()V

    return-void
.end method


# virtual methods
.method public final A0(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, LYM7;->a:LpN7;

    new-instance v1, LkO7;

    invoke-direct {v1, p1}, LkO7;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void

    :cond_0
    iget-object p1, p0, LYM7;->a:LpN7;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0xbbe

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    new-instance v1, LkO7;

    invoke-direct {v1, v0}, LkO7;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
