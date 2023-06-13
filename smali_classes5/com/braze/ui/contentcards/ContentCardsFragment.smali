.class public Lcom/braze/ui/contentcards/ContentCardsFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/braze/ui/contentcards/ContentCardsFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0016\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001fB\u0007\u00a2\u0006\u0004\u0008c\u0010dJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\t\u001a\u00020\u0008J\u0010\u0010\n\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0008J&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0008\u0010\u0013\u001a\u00020\u0006H\u0016J\u0008\u0010\u0014\u001a\u00020\u0006H\u0016J\u0008\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0018\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0008\u0010\u0019\u001a\u00020\u0006H\u0004J\u0008\u0010\u001a\u001a\u00020\u0006H\u0004J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0004J\u001b\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0006H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!J\u0014\u0010$\u001a\u00020\u00062\n\u0010#\u001a\u0006\u0012\u0002\u0008\u00030\"H\u0004R$\u0010&\u001a\u0004\u0018\u00010%8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R.\u0010.\u001a\u0004\u0018\u00010,2\u0008\u0010-\u001a\u0004\u0018\u00010,8\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00106R\"\u00108\u001a\u0002078\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR*\u0010F\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010E8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010I\"\u0004\u0008J\u0010KR*\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010E8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008M\u0010G\u001a\u0004\u0008N\u0010I\"\u0004\u0008O\u0010KR\u001a\u0010P\u001a\u00020\u00038\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010SR$\u0010T\u001a\u0004\u0018\u00010\u00038\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008T\u0010Q\u001a\u0004\u0008U\u0010S\"\u0004\u0008V\u0010WR\u001a\u0010X\u001a\u00020\u00088\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[R$\u0010\\\u001a\u0004\u0018\u00010\u00088\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010Y\u001a\u0004\u0008]\u0010[\"\u0004\u0008^\u0010_R\u0018\u0010b\u001a\u0006\u0012\u0002\u0008\u00030\"8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008`\u0010a\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006g"
    }
    d2 = {
        "Lcom/braze/ui/contentcards/ContentCardsFragment;",
        "Landroidx/fragment/app/Fragment;",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;",
        "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;",
        "getContentCardUpdateHandler",
        "value",
        "",
        "setContentCardUpdateHandler",
        "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;",
        "getContentCardsViewBindingHandler",
        "setContentCardsViewBindingHandler",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "onRefresh",
        "onResume",
        "onPause",
        "outState",
        "onSaveInstanceState",
        "onViewStateRestored",
        "initializeRecyclerView",
        "attachSwipeHelperCallback",
        "LfA0;",
        "event",
        "handleContentCardsUpdatedEvent",
        "contentCardsUpdate",
        "(LfA0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "networkUnavailable",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "newAdapter",
        "swapRecyclerViewAdapter",
        "Lzh2;",
        "networkUnavailableJob",
        "Lzh2;",
        "getNetworkUnavailableJob",
        "()Lzh2;",
        "setNetworkUnavailableJob",
        "(Lzh2;)V",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "<set-?>",
        "contentCardsRecyclerView",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "getContentCardsRecyclerView",
        "()Landroidx/recyclerview/widget/RecyclerView;",
        "setContentCardsRecyclerView",
        "(Landroidx/recyclerview/widget/RecyclerView;)V",
        "LaA0;",
        "cardAdapter",
        "LaA0;",
        "LQa1;",
        "defaultEmptyContentCardsAdapter",
        "LQa1;",
        "getDefaultEmptyContentCardsAdapter",
        "()LQa1;",
        "setDefaultEmptyContentCardsAdapter",
        "(LQa1;)V",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;",
        "contentCardsSwipeLayout",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;",
        "getContentCardsSwipeLayout",
        "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;",
        "setContentCardsSwipeLayout",
        "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V",
        "Lcom/appboy/events/IEventSubscriber;",
        "contentCardsUpdatedSubscriber",
        "Lcom/appboy/events/IEventSubscriber;",
        "getContentCardsUpdatedSubscriber",
        "()Lcom/appboy/events/IEventSubscriber;",
        "setContentCardsUpdatedSubscriber",
        "(Lcom/appboy/events/IEventSubscriber;)V",
        "Leq5;",
        "sdkDataWipeEventSubscriber",
        "getSdkDataWipeEventSubscriber",
        "setSdkDataWipeEventSubscriber",
        "defaultContentCardUpdateHandler",
        "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;",
        "getDefaultContentCardUpdateHandler",
        "()Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;",
        "customContentCardUpdateHandler",
        "getCustomContentCardUpdateHandler",
        "setCustomContentCardUpdateHandler",
        "(Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;)V",
        "defaultContentCardsViewBindingHandler",
        "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;",
        "getDefaultContentCardsViewBindingHandler",
        "()Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;",
        "customContentCardsViewBindingHandler",
        "getCustomContentCardsViewBindingHandler",
        "setCustomContentCardsViewBindingHandler",
        "(Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V",
        "getEmptyCardsAdapter",
        "()Landroidx/recyclerview/widget/RecyclerView$h;",
        "emptyCardsAdapter",
        "<init>",
        "()V",
        "Companion",
        "a",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/braze/ui/contentcards/ContentCardsFragment$a;


# instance fields
.field public cardAdapter:LaA0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field private contentCardsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private contentCardsSwipeLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field private contentCardsUpdatedSubscriber:Lcom/appboy/events/IEventSubscriber;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appboy/events/IEventSubscriber<",
            "LfA0;",
            ">;"
        }
    .end annotation
.end field

.field private customContentCardUpdateHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

.field private customContentCardsViewBindingHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

.field private final defaultContentCardUpdateHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

.field private final defaultContentCardsViewBindingHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

.field private defaultEmptyContentCardsAdapter:LQa1;

.field private networkUnavailableJob:Lzh2;

.field private sdkDataWipeEventSubscriber:Lcom/appboy/events/IEventSubscriber;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appboy/events/IEventSubscriber<",
            "Leq5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/braze/ui/contentcards/ContentCardsFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/braze/ui/contentcards/ContentCardsFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/braze/ui/contentcards/ContentCardsFragment;->Companion:Lcom/braze/ui/contentcards/ContentCardsFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, LQa1;

    invoke-direct {v0}, LQa1;-><init>()V

    iput-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->defaultEmptyContentCardsAdapter:LQa1;

    new-instance v0, Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;

    invoke-direct {v0}, Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;-><init>()V

    iput-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->defaultContentCardUpdateHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

    new-instance v0, Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;

    invoke-direct {v0}, Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;-><init>()V

    iput-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->defaultContentCardsViewBindingHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

    return-void
.end method

.method public static synthetic N6(Lcom/braze/ui/contentcards/ContentCardsFragment;LfA0;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->onResume$lambda-0(Lcom/braze/ui/contentcards/ContentCardsFragment;LfA0;)V

    return-void
.end method

.method public static synthetic a5(Lcom/braze/ui/contentcards/ContentCardsFragment;Leq5;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->onResume$lambda-1(Lcom/braze/ui/contentcards/ContentCardsFragment;Leq5;)V

    return-void
.end method

.method private static final onResume$lambda-0(Lcom/braze/ui/contentcards/ContentCardsFragment;LfA0;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->handleContentCardsUpdatedEvent(LfA0;)V

    return-void
.end method

.method private static final onResume$lambda-1(Lcom/braze/ui/contentcards/ContentCardsFragment;Leq5;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LfA0;->e:LfA0$a;

    invoke-virtual {p1}, LfA0$a;->a()LfA0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->handleContentCardsUpdatedEvent(LfA0;)V

    return-void
.end method


# virtual methods
.method public final attachSwipeHelperCallback()V
    .locals 3

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->cardAdapter:LaA0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/recyclerview/widget/l;

    new-instance v2, LPA5;

    invoke-direct {v2, v0}, LPA5;-><init>(LRf2;)V

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/l;-><init>(Landroidx/recyclerview/widget/l$e;)V

    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getContentCardsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/RecyclerView;)V

    :goto_0
    return-void
.end method

.method public final contentCardsUpdate(LfA0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LfA0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->f:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/braze/ui/contentcards/ContentCardsFragment$b;

    invoke-direct {v5, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment$b;-><init>(LfA0;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, p2

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getContentCardUpdateHandler()Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;->m3(LfA0;)Ljava/util/List;

    move-result-object v8

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->cardAdapter:LaA0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v8}, LaA0;->F(Ljava/util/List;)V

    :goto_0
    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getNetworkUnavailableJob()Lzh2;

    move-result-object v0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0, v10, v9, v10}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :goto_1
    invoke-virtual {p0, v10}, Lcom/braze/ui/contentcards/ContentCardsFragment;->setNetworkUnavailableJob(Lzh2;)V

    invoke-virtual {p1}, LfA0;->c()Z

    move-result v0

    const/4 v11, 0x0

    if-eqz v0, :cond_4

    const-wide/16 v0, 0x3c

    invoke-virtual {p1, v0, v1}, LfA0;->d(J)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object v2, Lk20$a;->d:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lcom/braze/ui/contentcards/ContentCardsFragment$c;->g:Lcom/braze/ui/contentcards/ContentCardsFragment$c;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, p2

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object p1

    invoke-virtual {p1, v11}, Lcom/appboy/Appboy;->requestContentCardsRefresh(Z)V

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getContentCardsSwipeLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v9}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    :goto_2
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lcom/braze/ui/contentcards/ContentCardsFragment$d;->g:Lcom/braze/ui/contentcards/ContentCardsFragment$d;

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v0, p2

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getNetworkUnavailableJob()Lzh2;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {p1, v10, v9, v10}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :goto_3
    sget-object p1, LZ10;->b:LZ10;

    const-wide/16 v0, 0x1388

    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v0

    new-instance v1, Lcom/braze/ui/contentcards/ContentCardsFragment$e;

    invoke-direct {v1, p0, v10}, Lcom/braze/ui/contentcards/ContentCardsFragment$e;-><init>(Lcom/braze/ui/contentcards/ContentCardsFragment;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p1, p2, v0, v1}, LZ10;->a(Ljava/lang/Number;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Lzh2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->setNetworkUnavailableJob(Lzh2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_4
    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v9

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->cardAdapter:LaA0;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p0, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->swapRecyclerViewAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getEmptyCardsAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->swapRecyclerViewAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    :goto_4
    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getContentCardsSwipeLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {p1, v11}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final getContentCardUpdateHandler()Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->customContentCardUpdateHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->defaultContentCardUpdateHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

    :cond_0
    return-object v0
.end method

.method public final getContentCardsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final getContentCardsSwipeLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsSwipeLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-object v0
.end method

.method public final getContentCardsViewBindingHandler()Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->customContentCardsViewBindingHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->defaultContentCardsViewBindingHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

    :cond_0
    return-object v0
.end method

.method public final getEmptyCardsAdapter()Landroidx/recyclerview/widget/RecyclerView$h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->defaultEmptyContentCardsAdapter:LQa1;

    return-object v0
.end method

.method public final getNetworkUnavailableJob()Lzh2;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->networkUnavailableJob:Lzh2;

    return-object v0
.end method

.method public final handleContentCardsUpdatedEvent(LfA0;)V
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LZ10;->b:LZ10;

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, Lcom/braze/ui/contentcards/ContentCardsFragment$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/braze/ui/contentcards/ContentCardsFragment$f;-><init>(Lcom/braze/ui/contentcards/ContentCardsFragment;LfA0;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final initializeRecyclerView()V
    .locals 6

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    new-instance v1, LaA0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "requireContext()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getContentCardsViewBindingHandler()Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

    move-result-object v5

    invoke-direct {v1, v2, v0, v4, v5}, LaA0;-><init>(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V

    iput-object v1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->cardAdapter:LaA0;

    iget-object v2, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    :goto_0
    iget-object v1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    :goto_1
    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->attachSwipeHelperCallback()V

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$m;

    move-result-object v0

    :goto_2
    instance-of v1, v0, Landroidx/recyclerview/widget/u;

    if-eqz v1, :cond_3

    check-cast v0, Landroidx/recyclerview/widget/u;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/u;->setSupportsChangeAnimations(Z)V

    :cond_3
    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance v1, LcA0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, LcA0;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :goto_3
    return-void
.end method

.method public final networkUnavailable(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->f:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lcom/braze/ui/contentcards/ContentCardsFragment$g;->g:Lcom/braze/ui/contentcards/ContentCardsFragment$g;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget v0, Lcom/appboy/ui/R$string;->com_appboy_feed_connection_error_title:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getEmptyCardsAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->swapRecyclerViewAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->getContentCardsSwipeLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget p3, Lcom/appboy/ui/R$layout;->com_braze_content_cards:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget p2, Lcom/appboy/ui/R$id;->com_braze_content_cards_recycler:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    sget p2, Lcom/appboy/ui/R$id;->appboy_content_cards_swipe_container:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iput-object p2, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsSwipeLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    :goto_0
    iget-object p2, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsSwipeLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p3, 0x4

    new-array p3, p3, [I

    sget v1, Lcom/appboy/ui/R$color;->com_braze_content_cards_swipe_refresh_color_1:I

    aput v1, p3, v0

    const/4 v0, 0x1

    sget v1, Lcom/appboy/ui/R$color;->com_braze_content_cards_swipe_refresh_color_2:I

    aput v1, p3, v0

    const/4 v0, 0x2

    sget v1, Lcom/appboy/ui/R$color;->com_braze_content_cards_swipe_refresh_color_3:I

    aput v1, p3, v0

    const/4 v0, 0x3

    sget v1, Lcom/appboy/ui/R$color;->com_braze_content_cards_swipe_refresh_color_4:I

    aput v1, p3, v0

    invoke-virtual {p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V

    :goto_1
    return-object p1
.end method

.method public onPause()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    iget-object v1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsUpdatedSubscriber:Lcom/appboy/events/IEventSubscriber;

    const-class v2, LfA0;

    invoke-virtual {v0, v1, v2}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    iget-object v1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->sdkDataWipeEventSubscriber:Lcom/appboy/events/IEventSubscriber;

    const-class v2, Leq5;

    invoke-virtual {v0, v1, v2}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->networkUnavailableJob:Lzh2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :goto_0
    iput-object v1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->networkUnavailableJob:Lzh2;

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->cardAdapter:LaA0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LaA0;->x()V

    :goto_1
    return-void
.end method

.method public onRefresh()V
    .locals 8

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/appboy/Appboy;->requestContentCardsRefresh(Z)V

    sget-object v2, LZ10;->b:LZ10;

    const-wide/16 v0, 0x9c4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    new-instance v5, Lcom/braze/ui/contentcards/ContentCardsFragment$h;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lcom/braze/ui/contentcards/ContentCardsFragment$h;-><init>(Lcom/braze/ui/contentcards/ContentCardsFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LZ10;->b(LZ10;Ljava/lang/Number;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    iget-object v1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsUpdatedSubscriber:Lcom/appboy/events/IEventSubscriber;

    const-class v2, LfA0;

    invoke-virtual {v0, v1, v2}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsUpdatedSubscriber:Lcom/appboy/events/IEventSubscriber;

    if-nez v0, :cond_0

    new-instance v0, LdA0;

    invoke-direct {v0, p0}, LdA0;-><init>(Lcom/braze/ui/contentcards/ContentCardsFragment;)V

    iput-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsUpdatedSubscriber:Lcom/appboy/events/IEventSubscriber;

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    iget-object v1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsUpdatedSubscriber:Lcom/appboy/events/IEventSubscriber;

    invoke-virtual {v0, v1}, Lcom/appboy/Appboy;->subscribeToContentCardsUpdates(Lcom/appboy/events/IEventSubscriber;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/appboy/Appboy;->requestContentCardsRefresh(Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    iget-object v1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->sdkDataWipeEventSubscriber:Lcom/appboy/events/IEventSubscriber;

    const-class v2, Leq5;

    invoke-virtual {v0, v1, v2}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->sdkDataWipeEventSubscriber:Lcom/appboy/events/IEventSubscriber;

    if-nez v0, :cond_1

    new-instance v0, LeA0;

    invoke-direct {v0, p0}, LeA0;-><init>(Lcom/braze/ui/contentcards/ContentCardsFragment;)V

    iput-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->sdkDataWipeEventSubscriber:Lcom/appboy/events/IEventSubscriber;

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    iget-object v1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->sdkDataWipeEventSubscriber:Lcom/appboy/events/IEventSubscriber;

    invoke-virtual {v0, v1, v2}, Lcom/appboy/Appboy;->addSingleSynchronousSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY"

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$p;->u1()Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :goto_0
    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->cardAdapter:LaA0;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, LaA0;->t()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v0, "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :goto_1
    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->customContentCardsViewBindingHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :goto_2
    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->customContentCardUpdateHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    const-string v1, "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :goto_3
    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onViewStateRestored(Landroid/os/Bundle;)V

    if-eqz p1, :cond_4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v1, "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY"

    const/16 v2, 0x21

    if-lt v0, v2, :cond_0

    const-class v3, Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

    invoke-static {p1, v1, v3}, LR10;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p0, v1}, Lcom/braze/ui/contentcards/ContentCardsFragment;->setContentCardUpdateHandler(Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;)V

    :cond_1
    const-string v1, "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY"

    if-lt v0, v2, :cond_2

    const-class v0, Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

    invoke-static {p1, v1, v0}, LR10;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->setContentCardsViewBindingHandler(Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V

    :cond_3
    sget-object v1, LZ10;->b:LZ10;

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, Lcom/braze/ui/contentcards/ContentCardsFragment$i;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/braze/ui/contentcards/ContentCardsFragment$i;-><init>(Landroid/os/Bundle;Lcom/braze/ui/contentcards/ContentCardsFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_4
    invoke-virtual {p0}, Lcom/braze/ui/contentcards/ContentCardsFragment;->initializeRecyclerView()V

    return-void
.end method

.method public final setContentCardUpdateHandler(Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->customContentCardUpdateHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;

    return-void
.end method

.method public final setContentCardsViewBindingHandler(Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->customContentCardsViewBindingHandler:Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;

    return-void
.end method

.method public final setNetworkUnavailableJob(Lzh2;)V
    .locals 0

    iput-object p1, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->networkUnavailableJob:Lzh2;

    return-void
.end method

.method public final swapRecyclerViewAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "newAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braze/ui/contentcards/ContentCardsFragment;->contentCardsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v1

    if-eq v1, p1, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    :cond_0
    return-void
.end method
