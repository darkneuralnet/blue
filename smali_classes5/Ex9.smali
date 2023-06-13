.class public final synthetic LEx9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LEg7;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LEg7;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEx9;->a:LEg7;

    iput-object p2, p0, LEx9;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LEx9;->a:LEg7;

    iget-object v1, p0, LEx9;->b:Ljava/lang/String;

    check-cast p1, Lxv9;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, LGt8;

    new-instance v2, LLf7;

    invoke-direct {v2, v0, p2}, LLf7;-><init>(LEg7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, v1, v2}, LGt8;->j5(Ljava/lang/String;LlH8;)V

    return-void
.end method
