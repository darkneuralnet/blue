.class public final LZe4;
.super LOq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZe4$a;,
        LZe4$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\t\u0008\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016R%\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R%\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u000e*\u0004\u0018\u00010\u00140\u00140\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0010\u001a\u0004\u0008\u0016\u0010\u0012R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "LZe4;",
        "LOq;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "onAttachedToRecyclerView",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lh0;",
        "U",
        "Lma4;",
        "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;",
        "kotlin.jvm.PlatformType",
        "f",
        "Lma4;",
        "H",
        "()Lma4;",
        "checkBoxChanges",
        "",
        "g",
        "J",
        "quizAnsweredCorrectly",
        "K",
        "()Ljava/lang/Boolean;",
        "wrongOrRight",
        "<init>",
        "()V",
        "a",
        "b",
        "co.bird.android.feature.configurabletutorial"
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
        "SMAP\nQuizAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,156:1\n1855#2,2:157\n180#3:159\n180#3:160\n*S KotlinDebug\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter\n*L\n36#1:157,2\n67#1:159\n74#1:160\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LOq;-><init>()V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<TutorialQuizAnswer>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LZe4;->f:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Boolean>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LZe4;->g:Lma4;

    return-void
.end method

.method public static synthetic B(LZe4;)V
    .locals 0

    invoke-static {p0}, LZe4;->P(LZe4;)V

    return-void
.end method

.method public static synthetic C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LZe4;->S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic D(LZe4;)V
    .locals 0

    invoke-static {p0}, LZe4;->Q(LZe4;)V

    return-void
.end method

.method public static synthetic E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LZe4;->M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LZe4;->R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final P(LZe4;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkBoxChanges stream terminated for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final Q(LZe4;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkBoxChanges stream disposed for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LZe4;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getWrongOrRight(LZe4;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0}, LZe4;->K()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final H()Lma4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lma4<",
            "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LZe4;->f:Lma4;

    return-object v0
.end method

.method public final J()Lma4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lma4<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LZe4;->g:Lma4;

    return-object v0
.end method

.method public final K()Ljava/lang/Boolean;
    .locals 6

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LG6;

    invoke-virtual {v3}, LG6;->c()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    if-eqz v5, :cond_1

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    :cond_1
    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->getSelected()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->getCorrect()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v0, p0, LZe4;->g:Lma4;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    return-object v1

    :cond_3
    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->getCorrect()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->getSelected()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    if-ne v1, v2, :cond_5

    iget-object v0, p0, LZe4;->g:Lma4;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v4}, Lma4;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    iget-object v0, p0, LZe4;->g:Lma4;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    :goto_1
    return-object v4
.end method

.method public U(Landroid/view/ViewGroup;I)Lh0;
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, LWi4;->item_checkbox:I

    if-ne p2, v0, :cond_0

    new-instance p2, LZe4$a;

    invoke-direct {p2, p0, p1}, LZe4$a;-><init>(LZe4;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, LWi4;->item_quiz_note:I

    if-ne p2, v0, :cond_1

    new-instance p2, LZe4$b;

    invoke-direct {p2, p0, p1}, LZe4$b;-><init>(LZe4;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lh0;

    invoke-direct {p2, p1}, Lh0;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LOq;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p1, p0, LZe4;->g:Lma4;

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "quizAnsweredCorrectly\n  \u2026dSchedulers.mainThread())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    sget-object v1, LZe4$c;->g:LZe4$c;

    new-instance v2, LUe4;

    invoke-direct {v2, v1}, LUe4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object p1, p0, LZe4;->f:Lma4;

    new-instance v1, LVe4;

    invoke-direct {v1, p0}, LVe4;-><init>(LZe4;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->doOnTerminate(Lio/reactivex/functions/a;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v1, LWe4;

    invoke-direct {v1, p0}, LWe4;-><init>(LZe4;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->doOnDispose(Lio/reactivex/functions/a;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v1, "checkBoxChanges\n      .d\u2026dSchedulers.mainThread())"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, LZe4$d;

    invoke-direct {v0, p0}, LZe4$d;-><init>(LZe4;)V

    new-instance v1, LXe4;

    invoke-direct {v1, v0}, LXe4;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, LZe4$e;

    invoke-direct {v0, p0}, LZe4$e;-><init>(LZe4;)V

    new-instance v2, LYe4;

    invoke-direct {v2, v0}, LYe4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LZe4;->U(Landroid/view/ViewGroup;I)Lh0;

    move-result-object p1

    return-object p1
.end method
