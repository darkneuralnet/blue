.class public final synthetic LHx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:LPx;

.field public final synthetic b:Lg32;

.field public final synthetic c:Landroid/media/Image;


# direct methods
.method public synthetic constructor <init>(LPx;Lg32;Landroid/media/Image;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHx;->a:LPx;

    iput-object p2, p0, LHx;->b:Lg32;

    iput-object p3, p0, LHx;->c:Landroid/media/Image;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LHx;->a:LPx;

    iget-object v1, p0, LHx;->b:Lg32;

    iget-object v2, p0, LHx;->c:Landroid/media/Image;

    invoke-static {v0, v1, v2, p1}, LPx;->e(LPx;Lg32;Landroid/media/Image;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
