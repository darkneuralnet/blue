.class public final LqI1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\"\u0010#J\u0014\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\u0008\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u000c\u001a\u00020\u0005J\u0012\u0010\u000f\u001a\u00020\u00052\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010 \u00a8\u0006$"
    }
    d2 = {
        "LqI1;",
        "",
        "",
        "LH6;",
        "sections",
        "",
        "b",
        "c",
        "g",
        "i",
        "j",
        "m",
        "f",
        "",
        "message",
        "k",
        "l",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "e",
        "Lco/bird/android/model/wire/WireDisplayValue;",
        "lastTrack",
        "h",
        "Lio/reactivex/Observable;",
        "a",
        "",
        "issueCount",
        "d",
        "LJ3;",
        "LJ3;",
        "healthCheckBinding",
        "Lbm6;",
        "Lbm6;",
        "issuesAdapter",
        "<init>",
        "(LJ3;)V",
        "health-check_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LJ3;

.field public final b:Lbm6;


# direct methods
.method public constructor <init>(LJ3;)V
    .locals 2

    const-string v0, "healthCheckBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqI1;->a:LJ3;

    new-instance v0, Lbm6;

    invoke-direct {v0}, Lbm6;-><init>()V

    iput-object v0, p0, LqI1;->b:Lbm6;

    iget-object v1, p1, LJ3;->o:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, LJ3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    new-instance p1, Lka2;

    invoke-direct {p1}, Lka2;-><init>()V

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    return-void
.end method

.method public static synthetic showScanRetry$default(LqI1;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LqI1;->k(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->f:Landroid/widget/Button;

    const-string v1, "healthCheckBinding.footerButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LqI1;->b:Lbm6;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    iget-object p1, p0, LqI1;->b:Lbm6;

    invoke-virtual {p1}, LMy;->getItemCount()I

    move-result p1

    invoke-virtual {p0, p1}, LqI1;->d(I)V

    return-void
.end method

.method public final c()V
    .locals 2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, LqI1;->b(Ljava/util/List;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->o:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "healthCheckBinding.issueRecyclerView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->q:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.noIssuesFoundLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    return-void
.end method

.method public final d(I)V
    .locals 6

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->m:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, LqI1;->a:LJ3;

    iget-object v1, v1, LJ3;->m:Landroid/widget/TextView;

    sget v2, LXk4;->health_check_issues_found_label:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, p1, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final e(Lco/bird/android/model/wire/WireBird;)V
    .locals 4

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->u:Landroid/widget/ImageView;

    sget-object v1, Lco/bird/android/model/constant/BirdModel;->Companion:Lco/bird/android/model/constant/BirdModel$Companion;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lco/bird/android/model/constant/BirdModel$Companion;->fromString(Ljava/lang/String;)Lco/bird/android/model/constant/BirdModel;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, LqI1;->a:LJ3;

    invoke-virtual {v1}, LJ3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "healthCheckBinding.root.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, LPM;->a(Lco/bird/android/model/constant/BirdModel;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->f:Landroid/widget/Button;

    sget v1, Lnl4;->common_contact_support:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->g:Landroid/widget/TextView;

    sget v1, Lnl4;->health_check_contact_support_description:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->i:Landroidx/constraintlayout/widget/Group;

    const-string v1, "healthCheckBinding.footerGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->f:Landroid/widget/Button;

    const-string v1, "healthCheckBinding.footerButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public final g()V
    .locals 4

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->n:Landroid/widget/ImageView;

    const-string v1, "healthCheckBinding.issueFoundIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->o:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "healthCheckBinding.issueRecyclerView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v1, "healthCheckBinding.progress"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->r:Landroid/widget/ImageView;

    const-string v3, "healthCheckBinding.noIssuesIcon"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->b:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.actionDescription"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->q:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.noIssuesFoundLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->p:Landroid/widget/Space;

    const-string v1, "healthCheckBinding.issueSpace"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    return-void
.end method

.method public final h(Lco/bird/android/model/wire/WireDisplayValue;)V
    .locals 6

    const-string v0, "lastTrack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireDisplayValue;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireDisplayValue;->getDescription()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireDisplayValue;->getTextColor()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int p1, v4

    invoke-direct {v3, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    iget-object p1, p0, LqI1;->a:LJ3;

    invoke-virtual {p1}, LJ3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v4, "healthCheckBinding.root.context"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, LDf4;->black:I

    invoke-static {p1, v4}, LfB0;->f(Landroid/content/Context;I)I

    move-result p1

    invoke-direct {v3, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x22

    invoke-virtual {v2, v3, p1, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object p1, p0, LqI1;->a:LJ3;

    iget-object p1, p1, LJ3;->c:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LqI1;->a:LJ3;

    iget-object p1, p1, LJ3;->c:Landroid/widget/TextView;

    const-string v0, "healthCheckBinding.actionStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->i:Landroidx/constraintlayout/widget/Group;

    const-string v1, "healthCheckBinding.footerGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->r:Landroid/widget/ImageView;

    const-string v1, "healthCheckBinding.noIssuesIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->n:Landroid/widget/ImageView;

    const-string v1, "healthCheckBinding.issueFoundIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v3, "healthCheckBinding.progress"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->b:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.actionDescription"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->o:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "healthCheckBinding.issueRecyclerView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->p:Landroid/widget/Space;

    const-string v1, "healthCheckBinding.issueSpace"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->q:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.noIssuesFoundLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public final j()V
    .locals 4

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->i:Landroidx/constraintlayout/widget/Group;

    const-string v1, "healthCheckBinding.footerGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    invoke-virtual {v0}, Lcom/google/android/material/progressindicator/BaseProgressIndicator;->u()V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->n:Landroid/widget/ImageView;

    const-string v1, "healthCheckBinding.issueFoundIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->r:Landroid/widget/ImageView;

    const-string v3, "healthCheckBinding.noIssuesIcon"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->b:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.actionDescription"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->c:Landroid/widget/TextView;

    sget v1, Lnl4;->health_check_scan_in_progress_status:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->c:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.actionStatus"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->q:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.noIssuesFoundLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->o:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "healthCheckBinding.issueRecyclerView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->p:Landroid/widget/Space;

    const-string v1, "healthCheckBinding.issueSpace"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public final k(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->c:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.actionStatus"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->m:Landroid/widget/TextView;

    const-string v3, "healthCheckBinding.issueCount"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->n:Landroid/widget/ImageView;

    const-string v3, "healthCheckBinding.issueFoundIcon"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v3, "healthCheckBinding.progress"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->r:Landroid/widget/ImageView;

    const-string v3, "healthCheckBinding.noIssuesIcon"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->q:Landroid/widget/TextView;

    const-string v2, "healthCheckBinding.noIssuesFoundLabel"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->f:Landroid/widget/Button;

    sget v2, Lnl4;->health_check_bluetooth_error_button:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->i:Landroidx/constraintlayout/widget/Group;

    const-string v2, "healthCheckBinding.footerGroup"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->f:Landroid/widget/Button;

    const-string v2, "healthCheckBinding.footerButton"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    if-nez v1, :cond_2

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LqI1;->a:LJ3;

    iget-object p1, p1, LJ3;->g:Landroid/widget/TextView;

    sget v0, Lnl4;->health_check_bluetooth_error_description:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->f:Landroid/widget/Button;

    sget v1, Lnl4;->health_check_soft_reset_action_button:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->g:Landroid/widget/TextView;

    sget v1, Lnl4;->health_check_soft_reset_action_description:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->i:Landroidx/constraintlayout/widget/Group;

    const-string v1, "healthCheckBinding.footerGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->f:Landroid/widget/Button;

    const-string v1, "healthCheckBinding.footerButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public final m()V
    .locals 4

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->i:Landroidx/constraintlayout/widget/Group;

    const-string v1, "healthCheckBinding.footerGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    invoke-virtual {v0}, Lcom/google/android/material/progressindicator/BaseProgressIndicator;->u()V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->b:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.actionDescription"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->n:Landroid/widget/ImageView;

    const-string v1, "healthCheckBinding.issueFoundIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x4

    invoke-static {v0, v2, v1}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->r:Landroid/widget/ImageView;

    const-string v3, "healthCheckBinding.noIssuesIcon"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2, v1}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->c:Landroid/widget/TextView;

    sget v1, Lnl4;->health_check_soft_reset_in_progress_status:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->b:Landroid/widget/TextView;

    sget v1, Lnl4;->health_check_time_remaining_description:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->q:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.noIssuesFoundLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->m:Landroid/widget/TextView;

    const-string v1, "healthCheckBinding.issueCount"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LqI1;->a:LJ3;

    iget-object v0, v0, LJ3;->p:Landroid/widget/Space;

    const-string v1, "healthCheckBinding.issueSpace"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method
