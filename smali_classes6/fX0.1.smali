.class public final synthetic LfX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:LhX0;


# direct methods
.method public synthetic constructor <init>(LhX0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfX0;->a:LhX0;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, LfX0;->a:LhX0;

    check-cast p1, LVh;

    invoke-static {v0, p1}, LhX0;->i(LhX0;LVh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
