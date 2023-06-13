.class public final synthetic LOh9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LSg7;

.field public final synthetic b:Landroid/accounts/Account;


# direct methods
.method public synthetic constructor <init>(LSg7;Landroid/accounts/Account;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOh9;->a:LSg7;

    iput-object p2, p0, LOh9;->b:Landroid/accounts/Account;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LOh9;->a:LSg7;

    iget-object v1, p0, LOh9;->b:Landroid/accounts/Account;

    check-cast p1, LHA8;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lyd9;

    new-instance v2, LGf7;

    invoke-direct {v2, v0, p2}, LGf7;-><init>(LSg7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, v2, v1}, Lyd9;->f5(LMN8;Landroid/accounts/Account;)V

    return-void
.end method
