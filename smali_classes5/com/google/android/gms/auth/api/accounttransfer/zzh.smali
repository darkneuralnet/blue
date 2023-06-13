.class final Lcom/google/android/gms/auth/api/accounttransfer/zzh;
.super Lcom/google/android/gms/auth/api/accounttransfer/zzm;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/auth/zzbb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/accounttransfer/AccountTransferClient;ILcom/google/android/gms/internal/auth/zzbb;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/auth/api/accounttransfer/zzh;->zza:Lcom/google/android/gms/internal/auth/zzbb;

    const/16 p1, 0x649

    invoke-direct {p0, p1}, Lcom/google/android/gms/auth/api/accounttransfer/zzm;-><init>(I)V

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

    iget-object v0, p0, Lcom/google/android/gms/auth/api/accounttransfer/zzm;->zzc:LAv7;

    iget-object v1, p0, Lcom/google/android/gms/auth/api/accounttransfer/zzh;->zza:Lcom/google/android/gms/internal/auth/zzbb;

    invoke-virtual {p1, v0, v1}, Lex7;->d5(Lpw7;Lcom/google/android/gms/internal/auth/zzbb;)V

    return-void
.end method
