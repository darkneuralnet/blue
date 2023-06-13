.class public final LDz1$d$c;
.super LDz1$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDz1$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002R\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006#"
    }
    d2 = {
        "LDz1$d$c;",
        "LDz1$d;",
        "LDz1$c;",
        "header",
        "",
        "q",
        "Lcom/google/android/material/tabs/TabLayout$g;",
        "tab",
        "",
        "selected",
        "u",
        "LAG;",
        "",
        "e",
        "LAG;",
        "selectedTabRelay",
        "Lhc2;",
        "f",
        "Lhc2;",
        "binding",
        "g",
        "Lkotlin/Lazy;",
        "r",
        "()I",
        "selectedTabColor",
        "h",
        "t",
        "unselectedTabColor",
        "i",
        "Z",
        "shouldUpdateSelectedTabRelay",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Landroid/view/View;LAG;)V",
        "frequent-flyer_release"
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
        "SMAP\nFrequentFlyerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerAdapter.kt\nco/bird/android/feature/frequentFlyer/adapter/FrequentFlyerAdapter$ViewHolder$HeaderViewHolder\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n237#2:235\n1864#3,3:236\n*S KotlinDebug\n*F\n+ 1 FrequentFlyerAdapter.kt\nco/bird/android/feature/frequentFlyer/adapter/FrequentFlyerAdapter$ViewHolder$HeaderViewHolder\n*L\n158#1:235\n179#1:236,3\n*E\n"
    }
.end annotation


# instance fields
.field public final e:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lhc2;

.field public final g:Lkotlin/Lazy;

.field public final h:Lkotlin/Lazy;

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/view/View;LAG;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LAG<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedTabRelay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LDz1$d;-><init>(Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, LDz1$d$c;->e:LAG;

    invoke-static {p1}, Lhc2;->a(Landroid/view/View;)Lhc2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDz1$d$c;->f:Lhc2;

    new-instance p2, LDz1$d$c$b;

    invoke-direct {p2, p0}, LDz1$d$c$b;-><init>(LDz1$d$c;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, LDz1$d$c;->g:Lkotlin/Lazy;

    new-instance p2, LDz1$d$c$c;

    invoke-direct {p2, p0}, LDz1$d$c$c;-><init>(LDz1$d$c;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, LDz1$d$c;->h:Lkotlin/Lazy;

    const/4 p2, 0x1

    iput-boolean p2, p0, LDz1$d$c;->i:Z

    iget-object p1, p1, Lhc2;->d:Lcom/google/android/material/tabs/TabLayout;

    new-instance p2, LDz1$d$c$a;

    invoke-direct {p2, p0}, LDz1$d$c$a;-><init>(LDz1$d$c;)V

    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout;->h(Lcom/google/android/material/tabs/TabLayout$d;)V

    return-void
.end method

.method public static final synthetic access$getSelectedTabRelay$p(LDz1$d$c;)LAG;
    .locals 0

    iget-object p0, p0, LDz1$d$c;->e:LAG;

    return-object p0
.end method

.method public static final synthetic access$getShouldUpdateSelectedTabRelay$p(LDz1$d$c;)Z
    .locals 0

    iget-boolean p0, p0, LDz1$d$c;->i:Z

    return p0
.end method

.method public static final synthetic access$setTabColorSelected(LDz1$d$c;Lcom/google/android/material/tabs/TabLayout$g;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LDz1$d$c;->u(Lcom/google/android/material/tabs/TabLayout$g;Z)V

    return-void
.end method


# virtual methods
.method public final q(LDz1$c;)V
    .locals 8

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LDz1$c;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, LDz1$d$c;->f:Lhc2;

    iget-object v1, v1, Lhc2;->b:Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;

    invoke-virtual {v1, v0}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView;->G(I)Lio/reactivex/c;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_0
    iget-object v0, p0, LDz1$d$c;->f:Lhc2;

    iget-object v0, v0, Lhc2;->c:Landroid/widget/TextView;

    const-string v1, "binding.mainMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LDz1$c;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v3, v2, v4}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    iput-boolean v3, p0, LDz1$d$c;->i:Z

    :goto_0
    iget-object v0, p0, LDz1$d$c;->f:Lhc2;

    iget-object v0, v0, Lhc2;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->E()I

    move-result v0

    invoke-virtual {p1}, LDz1$c;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, LDz1$d$c;->f:Lhc2;

    iget-object v0, v0, Lhc2;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->E()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->R(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LDz1$c;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, LDz1$d$c;->f:Lhc2;

    iget-object v1, v1, Lhc2;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->E()I

    move-result v1

    sub-int/2addr v0, v1

    move v1, v3

    :goto_1
    if-ge v1, v0, :cond_2

    iget-object v5, p0, LDz1$d$c;->f:Lhc2;

    iget-object v5, v5, Lhc2;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v5}, Lcom/google/android/material/tabs/TabLayout;->L()Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object v5

    const-string v6, "binding.tabs.newTab()"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "itemView.context"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v7, Ldj4;->view_tab_frequent_flyer:I

    invoke-static {v6, v7, v4}, LfB0;->t(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/material/tabs/TabLayout$g;->o(Landroid/view/View;)Lcom/google/android/material/tabs/TabLayout$g;

    iget-object v6, p0, LDz1$d$c;->f:Lhc2;

    iget-object v6, v6, Lhc2;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v6, v5}, Lcom/google/android/material/tabs/TabLayout;->i(Lcom/google/android/material/tabs/TabLayout$g;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iput-boolean v2, p0, LDz1$d$c;->i:Z

    invoke-virtual {p1}, LDz1$c;->e()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v0, v3

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-gez v0, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v1, Ljava/lang/String;

    iget-object v5, p0, LDz1$d$c;->f:Lhc2;

    iget-object v5, v5, Lhc2;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v5, v0}, Lcom/google/android/material/tabs/TabLayout;->D(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_5

    :cond_4
    const-string v5, "binding.tabs.getTabAt(in\u2026 ?: return@forEachIndexed"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout$g;->e()Landroid/view/View;

    move-result-object v5

    instance-of v6, v5, Landroid/widget/TextView;

    if-eqz v6, :cond_5

    check-cast v5, Landroid/widget/TextView;

    goto :goto_3

    :cond_5
    move-object v5, v4

    :goto_3
    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_4
    invoke-virtual {p0, v0, v3}, LDz1$d$c;->u(Lcom/google/android/material/tabs/TabLayout$g;Z)V

    :goto_5
    move v0, v2

    goto :goto_2

    :cond_7
    iget-object p1, p0, LDz1$d$c;->f:Lhc2;

    iget-object p1, p1, Lhc2;->d:Lcom/google/android/material/tabs/TabLayout;

    iget-object v0, p0, LDz1$d$c;->e:LAG;

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_8
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->D(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->l()V

    :cond_9
    return-void
.end method

.method public final r()I
    .locals 1

    iget-object v0, p0, LDz1$d$c;->g:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final t()I
    .locals 1

    iget-object v0, p0, LDz1$d$c;->h:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final u(Lcom/google/android/material/tabs/TabLayout$g;Z)V
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, LDz1$d$c;->r()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LDz1$d$c;->t()I

    move-result p2

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->e()Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/widget/TextView;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    return-void
.end method
