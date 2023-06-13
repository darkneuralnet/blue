.class public final Lyk7;
.super Lpm7;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ltl7;


# direct methods
.method public constructor <init>(Ltl7;)V
    .locals 0

    iput-object p1, p0, Lyk7;->a:Ltl7;

    invoke-direct {p0}, Lpm7;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzc(Z)V
    .locals 2

    iget-object v0, p0, Lyk7;->a:Ltl7;

    new-instance v1, LXo7;

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    goto :goto_0

    :cond_0
    invoke-static {}, LNp7;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    :goto_0
    invoke-direct {v1, p1}, LXo7;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
