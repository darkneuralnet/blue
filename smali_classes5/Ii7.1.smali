.class public final LIi7;
.super Lpm7;
.source "SourceFile"


# instance fields
.field public final synthetic a:LBj7;


# direct methods
.method public constructor <init>(LBj7;)V
    .locals 0

    iput-object p1, p0, LIi7;->a:LBj7;

    invoke-direct {p0}, Lpm7;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Landroid/accounts/Account;)V
    .locals 3

    iget-object v0, p0, LIi7;->a:LBj7;

    new-instance v1, Ljn7;

    if-eqz p1, :cond_0

    sget-object v2, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    goto :goto_0

    :cond_0
    invoke-static {}, LNp7;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v2

    :goto_0
    invoke-direct {v1, v2, p1}, Ljn7;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/accounts/Account;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
