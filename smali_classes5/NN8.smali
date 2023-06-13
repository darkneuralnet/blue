.class public final synthetic LNN8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LKl9;


# direct methods
.method public synthetic constructor <init>(LKl9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNN8;->a:LKl9;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LNN8;->a:LKl9;

    check-cast p1, Lxv9;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v1, Lzd9;

    invoke-direct {v1, v0, p2}, Lzd9;-><init>(LKl9;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, LGt8;

    invoke-virtual {p1, v1}, LGt8;->e5(LN68;)V

    return-void
.end method
