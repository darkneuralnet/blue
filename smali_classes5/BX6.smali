.class public final synthetic LBX6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LWX6;


# direct methods
.method public synthetic constructor <init>(LWX6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBX6;->a:LWX6;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LBX6;->a:LWX6;

    check-cast p1, LZX6;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1, p2}, LWX6;->i(LZX6;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
