.class final Lcom/uber/autodispose/android/DetachEventCompletable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/uber/autodispose/android/DetachEventCompletable$Listener;
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/uber/autodispose/android/DetachEventCompletable;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public g(Lio/reactivex/f;)V
    .locals 2

    new-instance v0, Lcom/uber/autodispose/android/DetachEventCompletable$Listener;

    iget-object v1, p0, Lcom/uber/autodispose/android/DetachEventCompletable;->b:Landroid/view/View;

    invoke-direct {v0, v1, p1}, Lcom/uber/autodispose/android/DetachEventCompletable$Listener;-><init>(Landroid/view/View;Lio/reactivex/f;)V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-static {}, Lcom/uber/autodispose/android/internal/AutoDisposeAndroidUtil;->b()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Views can only be bound to on the main thread!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/uber/autodispose/android/DetachEventCompletable;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/uber/autodispose/android/DetachEventCompletable;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_3

    new-instance v0, Lcom/uber/autodispose/OutsideScopeException;

    const-string v1, "View is not attached!"

    invoke-direct {v0, v1}, Lcom/uber/autodispose/OutsideScopeException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/uber/autodispose/android/DetachEventCompletable;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {v0}, Lio/reactivex/android/a;->e()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/uber/autodispose/android/DetachEventCompletable;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_4
    return-void
.end method
