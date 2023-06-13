.class public final synthetic LRq9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LSg7;

.field public final synthetic b:Lcom/google/android/gms/internal/auth/zzbw;


# direct methods
.method public synthetic constructor <init>(LSg7;Lcom/google/android/gms/internal/auth/zzbw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRq9;->a:LSg7;

    iput-object p2, p0, LRq9;->b:Lcom/google/android/gms/internal/auth/zzbw;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LRq9;->a:LSg7;

    iget-object v1, p0, LRq9;->b:Lcom/google/android/gms/internal/auth/zzbw;

    check-cast p1, LHA8;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lyd9;

    new-instance v2, Lww9;

    invoke-direct {v2, v0, p2}, Lww9;-><init>(LSg7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, v2, v1}, Lyd9;->c5(Lcom/google/android/gms/common/api/internal/IStatusCallback;Lcom/google/android/gms/internal/auth/zzbw;)V

    return-void
.end method
