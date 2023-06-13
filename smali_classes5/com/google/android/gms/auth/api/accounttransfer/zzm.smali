.class abstract Lcom/google/android/gms/auth/api/accounttransfer/zzm;
.super Lcom/google/android/gms/auth/api/accounttransfer/zzk;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/auth/api/accounttransfer/zzk<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final zzc:LAv7;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/auth/api/accounttransfer/zzk;-><init>(ILcom/google/android/gms/auth/api/accounttransfer/zzb;)V

    new-instance p1, Lcom/google/android/gms/auth/api/accounttransfer/zzl;

    invoke-direct {p1, p0}, Lcom/google/android/gms/auth/api/accounttransfer/zzl;-><init>(Lcom/google/android/gms/auth/api/accounttransfer/zzm;)V

    iput-object p1, p0, Lcom/google/android/gms/auth/api/accounttransfer/zzm;->zzc:LAv7;

    return-void
.end method
