.class final Lcom/uber/autodispose/android/DetachEventCompletable$Listener;
.super Lio/reactivex/android/a;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/uber/autodispose/android/DetachEventCompletable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Listener"
.end annotation


# instance fields
.field public final c:Landroid/view/View;

.field public final d:Lio/reactivex/f;


# direct methods
.method public constructor <init>(Landroid/view/View;Lio/reactivex/f;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/android/a;-><init>()V

    iput-object p1, p0, Lcom/uber/autodispose/android/DetachEventCompletable$Listener;->c:Landroid/view/View;

    iput-object p2, p0, Lcom/uber/autodispose/android/DetachEventCompletable$Listener;->d:Lio/reactivex/f;

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/uber/autodispose/android/DetachEventCompletable$Listener;->c:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/android/a;->e()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/uber/autodispose/android/DetachEventCompletable$Listener;->d:Lio/reactivex/f;

    invoke-interface {p1}, Lio/reactivex/f;->onComplete()V

    :cond_0
    return-void
.end method
