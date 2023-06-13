.class public abstract LOq;
.super LMy;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOq$a;,
        LOq$b;,
        LOq$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LMy<",
        "Lh0;",
        ">;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
        "LOq$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008&\u0018\u0000 \u001c2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u001d\u001eB\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u0010\u0010\r\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u000e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0010H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016R)\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00040\u00040\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001f"
    }
    d2 = {
        "LOq;",
        "LMy;",
        "Lh0;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LOq$a;",
        "holder",
        "",
        "position",
        "",
        "y",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "onAttachedToRecyclerView",
        "onDetachedFromRecyclerView",
        "Lio/reactivex/Observable;",
        "c2",
        "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;",
        "O8",
        "A",
        "Lio/reactivex/subjects/a;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lkotlin/Lazy;",
        "x",
        "()Lio/reactivex/subjects/a;",
        "lifecycleEvents",
        "<init>",
        "()V",
        "d",
        "a",
        "b",
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
.field public static final d:LOq$b;

.field public static final e:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "LOq$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final c:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LOq$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LOq$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LOq;->d:LOq$b;

    new-instance v0, LNq;

    invoke-direct {v0}, LNq;-><init>()V

    sput-object v0, LOq;->e:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LMy;-><init>()V

    sget-object v0, LOq$d;->g:LOq$d;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, LOq;->c:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic v(LOq$a;)LOq$a;
    .locals 0

    invoke-static {p0}, LOq;->w(LOq$a;)LOq$a;

    move-result-object p0

    return-object p0
.end method

.method public static final w(LOq$a;)LOq$a;
    .locals 1

    const-string v0, "viewHolderEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LOq$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, LOq$a;->c:LOq$a;

    return-object p0

    :cond_0
    new-instance p0, Lcom/uber/autodispose/lifecycle/LifecycleEndedException;

    const-string v0, "Cannot use Adapter lifecycle after unbind."

    invoke-direct {p0, v0}, Lcom/uber/autodispose/lifecycle/LifecycleEndedException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public A()LOq$a;
    .locals 1

    invoke-virtual {p0}, LOq;->x()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOq$a;

    return-object v0
.end method

.method public O8()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "LOq$a;",
            ">;"
        }
    .end annotation

    sget-object v0, LOq;->e:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    return-object v0
.end method

.method public c2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LOq$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LOq;->x()Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "lifecycleEvents.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p0}, LOq;->x()Lio/reactivex/subjects/a;

    move-result-object p1

    sget-object v0, LOq$a;->b:LOq$a;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lh0;

    invoke-virtual {p0, p1, p2}, LOq;->y(Lh0;I)V

    return-void
.end method

.method public onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p0}, LOq;->x()Lio/reactivex/subjects/a;

    move-result-object p1

    sget-object v0, LOq$a;->c:LOq$a;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic peekLifecycle()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOq;->A()LOq$a;

    move-result-object v0

    return-object v0
.end method

.method public final x()Lio/reactivex/subjects/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/a<",
            "LOq$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LOq;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/subjects/a;

    return-object v0
.end method

.method public y(Lh0;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lh0;->bind(I)V

    return-void
.end method
