.class public final Lio5$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio5$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lzf2;",
        "b",
        "Lzf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lio5;Landroid/view/View;)V",
        "co.bird.android.feature.transfer-order"
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
        "SMAP\nScrapOrderOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewAdapter.kt\nco/bird/android/feature/transferorder/scrap/overview/adapters/ScrapOrderOverviewAdapter$DetailsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n18#2:84\n9#3,4:85\n1864#4,3:89\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewAdapter.kt\nco/bird/android/feature/transferorder/scrap/overview/adapters/ScrapOrderOverviewAdapter$DetailsViewHolder\n*L\n60#1:84\n60#1:85,4\n62#1:89,3\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lzf2;

.field public final synthetic c:Lio5;


# direct methods
.method public constructor <init>(Lio5;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio5$a;->c:Lio5;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lzf2;->a(Landroid/view/View;)Lzf2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio5$a;->b:Lzf2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 12

    iget-object v0, p0, Lio5$a;->c:Lio5;

    invoke-static {v0}, Lio5;->access$getAdapterData(Lio5;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/ScrapOrderView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/ScrapOrderView;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lio5$a;->c:Lio5;

    iget-object v2, p0, Lio5$a;->b:Lzf2;

    invoke-virtual {v2}, Lzf2;->b()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ScrapOrderView;->getDetails()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    check-cast v5, Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;

    iget-object v4, p0, Lio5$a;->b:Lzf2;

    invoke-virtual {v4}, Lzf2;->b()Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-static {v4}, Lyf2;->c(Landroid/view/LayoutInflater;)Lyf2;

    move-result-object v4

    iget-object v7, v4, Lyf2;->b:Landroid/widget/TextView;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;->getDetail()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v7, v4, Lyf2;->b:Landroid/widget/TextView;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;->getColor()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_2

    :cond_2
    iget-object v5, p0, Lio5$a;->b:Lzf2;

    invoke-virtual {v5}, Lzf2;->b()Landroid/widget/LinearLayout;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v8, LDf4;->primaryText:I

    invoke-static {v5, v8}, LNA0;->c(Landroid/content/Context;I)I

    move-result v5

    :goto_2
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v5, v4, Lyf2;->c:Landroid/widget/TextView;

    const-string v7, "this.view"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ScrapOrderView;->getDetails()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    int-to-double v8, v8

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v8, v8

    if-ne v6, v8, :cond_3

    const/4 v8, 0x1

    goto :goto_3

    :cond_3
    move v8, v3

    :goto_3
    const/4 v9, 0x2

    invoke-static {v5, v8, v3, v9, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v5, v4, Lyf2;->c:Landroid/widget/TextView;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lio5$a$a;

    invoke-direct {v7, v0, p1}, Lio5$a$a;-><init>(Lio5;Lco/bird/android/model/persistence/ScrapOrderView;)V

    invoke-static {v5, v7}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    const-string v5, "inflate(LayoutInflater.f\u2026          }\n            }"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, Lio5$a;->b:Lzf2;

    invoke-virtual {v5}, Lzf2;->b()Landroid/widget/LinearLayout;

    move-result-object v5

    invoke-virtual {v4}, Lyf2;->b()Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move v4, v6

    goto/16 :goto_1

    :cond_4
    return-void
.end method
