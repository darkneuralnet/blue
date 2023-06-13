.class public final synthetic LIx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Landroid/media/Image;


# direct methods
.method public synthetic constructor <init>(Landroid/media/Image;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIx;->b:Landroid/media/Image;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, LIx;->b:Landroid/media/Image;

    invoke-static {v0, p1}, LPx;->n(Landroid/media/Image;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
