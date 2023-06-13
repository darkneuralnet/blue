.class public final synthetic LLn1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:LNn1;

.field public final synthetic b:Lcom/google/android/gms/tasks/Task;

.field public final synthetic c:Lcom/google/android/gms/tasks/Task;


# direct methods
.method public synthetic constructor <init>(LNn1;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLn1;->a:LNn1;

    iput-object p2, p0, LLn1;->b:Lcom/google/android/gms/tasks/Task;

    iput-object p3, p0, LLn1;->c:Lcom/google/android/gms/tasks/Task;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LLn1;->a:LNn1;

    iget-object v1, p0, LLn1;->b:Lcom/google/android/gms/tasks/Task;

    iget-object v2, p0, LLn1;->c:Lcom/google/android/gms/tasks/Task;

    invoke-static {v0, v1, v2, p1}, LNn1;->c(LNn1;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
