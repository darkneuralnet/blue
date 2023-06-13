.class public final synthetic LJl9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LSg7;

.field public final synthetic b:Landroid/accounts/Account;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(LSg7;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJl9;->a:LSg7;

    iput-object p2, p0, LJl9;->b:Landroid/accounts/Account;

    iput-object p3, p0, LJl9;->c:Ljava/lang/String;

    iput-object p4, p0, LJl9;->d:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, LJl9;->a:LSg7;

    iget-object v1, p0, LJl9;->b:Landroid/accounts/Account;

    iget-object v2, p0, LJl9;->c:Ljava/lang/String;

    iget-object v3, p0, LJl9;->d:Landroid/os/Bundle;

    check-cast p1, LHA8;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lyd9;

    new-instance v4, Lmv9;

    invoke-direct {v4, v0, p2}, Lmv9;-><init>(LSg7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, v4, v1, v2, v3}, Lyd9;->e5(Lw99;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
