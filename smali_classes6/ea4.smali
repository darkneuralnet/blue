.class public final synthetic Lea4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Z

.field public final synthetic d:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea4;->b:Landroid/content/Context;

    iput-boolean p2, p0, Lea4;->c:Z

    iput-object p3, p0, Lea4;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lea4;->b:Landroid/content/Context;

    iget-boolean v1, p0, Lea4;->c:Z

    iget-object v2, p0, Lea4;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lfa4;->a(Landroid/content/Context;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
