.class public final synthetic LsW3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:LxW3;


# direct methods
.method public synthetic constructor <init>(LxW3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsW3;->a:LxW3;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, LsW3;->a:LxW3;

    check-cast p1, LW52;

    invoke-static {v0, p1}, LxW3;->a(LxW3;LW52;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
