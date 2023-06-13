.class public final Ltq8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzaw;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic d:Lcs8;


# direct methods
.method public constructor <init>(Lcs8;Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, Ltq8;->d:Lcs8;

    iput-object p2, p0, Ltq8;->b:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-object p3, p0, Ltq8;->c:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ltq8;->d:Lcs8;

    iget-object v1, p0, Ltq8;->b:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v2, p0, Ltq8;->c:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0, v1, v2}, Lcs8;->e5(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)Lcom/google/android/gms/measurement/internal/zzaw;

    move-result-object v0

    iget-object v1, p0, Ltq8;->d:Lcs8;

    iget-object v2, p0, Ltq8;->c:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v1, v0, v2}, Lcs8;->g5(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V

    return-void
.end method
