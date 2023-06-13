.class public final synthetic LEx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Landroidx/camera/core/i;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEx;->b:Landroidx/camera/core/i;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, LEx;->b:Landroidx/camera/core/i;

    invoke-static {v0, p1}, LPx;->p(Landroidx/camera/core/i;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
