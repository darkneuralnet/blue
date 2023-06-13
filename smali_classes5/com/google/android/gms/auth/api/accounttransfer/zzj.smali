.class Lcom/google/android/gms/auth/api/accounttransfer/zzj;
.super Lxr7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lxr7;"
    }
.end annotation


# instance fields
.field final zzb:Lcom/google/android/gms/auth/api/accounttransfer/zzk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/auth/api/accounttransfer/zzk<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/accounttransfer/zzk;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/accounttransfer/zzk<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lxr7;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/auth/api/accounttransfer/zzj;->zzb:Lcom/google/android/gms/auth/api/accounttransfer/zzk;

    return-void
.end method


# virtual methods
.method public final zzd(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/auth/api/accounttransfer/zzj;->zzb:Lcom/google/android/gms/auth/api/accounttransfer/zzk;

    iget-object v0, v0, Lcom/google/android/gms/auth/api/accounttransfer/zzk;->zzb:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget v1, Lcom/google/android/gms/auth/api/accounttransfer/AccountTransferClient;->zza:I

    new-instance v1, Lcom/google/android/gms/auth/api/accounttransfer/AccountTransferException;

    invoke-direct {v1, p1}, Lcom/google/android/gms/auth/api/accounttransfer/AccountTransferException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void
.end method
