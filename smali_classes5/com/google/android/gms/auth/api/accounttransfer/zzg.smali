.class final Lcom/google/android/gms/auth/api/accounttransfer/zzg;
.super Lcom/google/android/gms/auth/api/accounttransfer/zzk;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/auth/api/accounttransfer/zzk<",
        "Lcom/google/android/gms/auth/api/accounttransfer/DeviceMetaData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/auth/zzaq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/accounttransfer/AccountTransferClient;ILcom/google/android/gms/internal/auth/zzaq;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/auth/api/accounttransfer/zzg;->zza:Lcom/google/android/gms/internal/auth/zzaq;

    const/16 p1, 0x648

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/auth/api/accounttransfer/zzk;-><init>(ILcom/google/android/gms/auth/api/accounttransfer/zzb;)V

    return-void
.end method


# virtual methods
.method public final zza(Lex7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/auth/api/accounttransfer/zzf;

    invoke-direct {v0, p0, p0}, Lcom/google/android/gms/auth/api/accounttransfer/zzf;-><init>(Lcom/google/android/gms/auth/api/accounttransfer/zzg;Lcom/google/android/gms/auth/api/accounttransfer/zzk;)V

    iget-object v1, p0, Lcom/google/android/gms/auth/api/accounttransfer/zzg;->zza:Lcom/google/android/gms/internal/auth/zzaq;

    invoke-virtual {p1, v0, v1}, Lex7;->c5(Lpw7;Lcom/google/android/gms/internal/auth/zzaq;)V

    return-void
.end method
