.class public final LE27;
.super Lx07;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lj37;


# direct methods
.method public constructor <init>(Lj37;)V
    .locals 0

    iput-object p1, p0, LE27;->a:Lj37;

    invoke-direct {p0}, Lx07;-><init>()V

    return-void
.end method


# virtual methods
.method public final p3(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 2

    iget-object v0, p0, LE27;->a:Lj37;

    new-instance v1, LB17;

    invoke-direct {v1, p1, p2}, LB17;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method public final zbc(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    iget-object v0, p0, LE27;->a:Lj37;

    new-instance v1, LB17;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LB17;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
