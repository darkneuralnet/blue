.class public final LDU2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
        "LRE;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008*\u0010+J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R!\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u001b*\u0004\u0018\u00010\u00020\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0017\u0010\'\u001a\u00020\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006,"
    }
    d2 = {
        "LDU2;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "",
        "o",
        "k",
        "Landroid/content/DialogInterface$OnDismissListener;",
        "listener",
        "j",
        "Lio/reactivex/Observable;",
        "c2",
        "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;",
        "O8",
        "n",
        "b",
        "Lkotlin/Lazy;",
        "m",
        "()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "scopeProvider",
        "Ltu0;",
        "c",
        "Ltu0;",
        "dismissListener",
        "d",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "parentScopeProvider",
        "Lio/reactivex/subjects/a;",
        "kotlin.jvm.PlatformType",
        "e",
        "Lio/reactivex/subjects/a;",
        "dialogLifecycleEvents",
        "f",
        "Lio/reactivex/Observable;",
        "mergedLifecycleEvents",
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "g",
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "l",
        "()Lcom/afollestad/materialdialogs/MaterialDialog;",
        "dialog",
        "LIU2;",
        "builder",
        "<init>",
        "(LIU2;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nModal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modal.kt\nco/bird/android/app/dialog/Modal\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lkotlin/Lazy;

.field public final c:Ltu0;

.field public final d:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lcom/afollestad/materialdialogs/MaterialDialog;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LIU2;)V
    .locals 4

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LDU2$c;

    invoke-direct {v0, p0}, LDU2$c;-><init>(LDU2;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, LDU2;->b:Lkotlin/Lazy;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v0

    const-string v1, "create<BasicScopeEvent>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LDU2;->e:Lio/reactivex/subjects/a;

    invoke-virtual {p1}, LIU2;->i()Lcom/afollestad/materialdialogs/MaterialDialog;

    move-result-object v1

    iput-object v1, p0, LDU2;->g:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {p1}, LIU2;->h()Ltu0;

    move-result-object v2

    iput-object v2, p0, LDU2;->c:Ltu0;

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    new-instance v1, LBU2;

    invoke-direct {v1, p0}, LBU2;-><init>(LDU2;)V

    invoke-virtual {p0, v1}, LDU2;->j(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {p1}, LIU2;->j()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    iput-object v1, p0, LDU2;->d:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-virtual {p1}, LIU2;->j()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-interface {v1}, Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;->c2()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, LDU2$a;->g:LDU2$a;

    new-instance v3, LCU2;

    invoke-direct {v3, v2}, LCU2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->mergeWith(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "dialogLifecycleEvents\n  \u2026  .distinctUntilChanged()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LDU2;->f:Lio/reactivex/Observable;

    invoke-virtual {p1}, LIU2;->g()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, LDU2$b;

    invoke-direct {v0, p0}, LDU2$b;-><init>(LDU2;)V

    invoke-static {p1, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(LDU2;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, LDU2;->e(LDU2;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LDU2;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final e(LDU2;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LDU2;->e:Lio/reactivex/subjects/a;

    sget-object p1, LRE;->e:LRE;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public O8()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "LRE;",
            ">;"
        }
    .end annotation

    sget-object v0, LRE;->b:LRE$a;

    invoke-virtual {v0}, LRE$a;->a()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    move-result-object v0

    return-object v0
.end method

.method public c2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LRE;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LDU2;->f:Lio/reactivex/Observable;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "mergedLifecycleEvents.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final j(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDU2;->c:Ltu0;

    invoke-virtual {v0, p1}, Ltu0;->a(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, LDU2;->g:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/MaterialDialog;->dismiss()V

    return-void
.end method

.method public final l()Lcom/afollestad/materialdialogs/MaterialDialog;
    .locals 1

    iget-object v0, p0, LDU2;->g:Lcom/afollestad/materialdialogs/MaterialDialog;

    return-object v0
.end method

.method public final m()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LDU2;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    return-object v0
.end method

.method public n()LRE;
    .locals 2

    iget-object v0, p0, LDU2;->d:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-interface {v0}, Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;->peekLifecycle()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LRE;->e:LRE;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LDU2;->e:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LRE;

    :goto_0
    return-object v1
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, LDU2;->g:Lcom/afollestad/materialdialogs/MaterialDialog;

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/MaterialDialog;->show()V

    iget-object v0, p0, LDU2;->e:Lio/reactivex/subjects/a;

    sget-object v1, LRE;->d:LRE;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic peekLifecycle()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDU2;->n()LRE;

    move-result-object v0

    return-object v0
.end method
