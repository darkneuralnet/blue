.class public abstract LQq;
.super Landroidx/recyclerview/widget/e;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQq$a;,
        LQq$b;,
        LQq$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/e;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
        "LQq$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u0000 \u00172\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0018\u000eB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0005\u001a\u00020\u0004H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0014J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016R)\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u00030\u00030\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0019"
    }
    d2 = {
        "LQq;",
        "Landroidx/recyclerview/widget/e;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LQq$b;",
        "",
        "i",
        "j",
        "Lio/reactivex/Observable;",
        "c2",
        "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;",
        "O8",
        "p",
        "Lio/reactivex/subjects/a;",
        "kotlin.jvm.PlatformType",
        "b",
        "Lkotlin/Lazy;",
        "o",
        "()Lio/reactivex/subjects/a;",
        "lifecycleEvents",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Landroid/view/View;)V",
        "c",
        "a",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final c:LQq$a;

.field public static final d:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "LQq$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LQq$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQq$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQq;->c:LQq$a;

    new-instance v0, LPq;

    invoke-direct {v0}, LPq;-><init>()V

    sput-object v0, LQq;->d:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/e;-><init>(Landroid/view/View;)V

    sget-object p1, LQq$d;->g:LQq$d;

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LQq;->b:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic m(LQq$b;)LQq$b;
    .locals 0

    invoke-static {p0}, LQq;->n(LQq$b;)LQq$b;

    move-result-object p0

    return-object p0
.end method

.method public static final n(LQq$b;)LQq$b;
    .locals 1

    const-string v0, "viewHolderEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LQq$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, LQq$b;->c:LQq$b;

    return-object p0

    :cond_0
    new-instance p0, Lcom/uber/autodispose/lifecycle/LifecycleEndedException;

    const-string v0, "Cannot use ViewHolder lifecycle after unbind."

    invoke-direct {p0, v0}, Lcom/uber/autodispose/lifecycle/LifecycleEndedException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public O8()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "LQq$b;",
            ">;"
        }
    .end annotation

    sget-object v0, LQq;->d:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    return-object v0
.end method

.method public c2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LQq$b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LQq;->o()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "lifecycleEvents.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public i()V
    .locals 2

    invoke-virtual {p0}, LQq;->o()Lio/reactivex/subjects/a;

    move-result-object v0

    sget-object v1, LQq$b;->b:LQq$b;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public j()V
    .locals 2

    invoke-virtual {p0}, LQq;->o()Lio/reactivex/subjects/a;

    move-result-object v0

    sget-object v1, LQq$b;->c:LQq$b;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public final o()Lio/reactivex/subjects/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/a<",
            "LQq$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LQq;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/subjects/a;

    return-object v0
.end method

.method public p()LQq$b;
    .locals 1

    invoke-virtual {p0}, LQq;->o()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQq$b;

    return-object v0
.end method

.method public bridge synthetic peekLifecycle()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQq;->p()LQq$b;

    move-result-object v0

    return-object v0
.end method
