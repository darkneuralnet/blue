.class public final synthetic LDZ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LKl9;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LKl9;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDZ8;->a:LKl9;

    iput-object p2, p0, LDZ8;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LDZ8;->a:LKl9;

    iget-object v1, p0, LDZ8;->b:Ljava/lang/String;

    check-cast p1, Lxv9;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v2, LPh9;

    invoke-direct {v2, v0, p2}, LPh9;-><init>(LKl9;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, LGt8;

    invoke-virtual {p1, v1, v2}, LGt8;->f5(Ljava/lang/String;LHm8;)V

    return-void
.end method
