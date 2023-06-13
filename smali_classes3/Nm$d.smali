.class public final LNm$d;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LNm$d;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LQf2;",
        "b",
        "LQf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LNm;Landroid/view/View;)V",
        "co.bird.android.feature.operator.bottomsheets"
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
        "SMAP\nAreaBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$TitleMessageViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,205:1\n18#2:206\n9#3,4:207\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheetAdapter.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapter$TitleMessageViewHolder\n*L\n88#1:206\n88#1:207,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LQf2;

.field public final synthetic c:LNm;


# direct methods
.method public constructor <init>(LNm;Landroid/view/View;)V
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

    iput-object p1, p0, LNm$d;->c:LNm;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LQf2;->a(Landroid/view/View;)LQf2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LNm$d;->b:LQf2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, LNm$d;->c:LNm;

    invoke-static {v0}, LNm;->access$getAreaBottomSheet$p(LNm;)Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p0, LNm$d;->c:LNm;

    invoke-static {v1}, LNm;->access$getAdapterData(LNm;)LE6;

    move-result-object v2

    invoke-virtual {v2}, LE6;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Lb56;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    check-cast p1, Lb56;

    if-eqz p1, :cond_4

    iget-object v2, p0, LNm$d;->b:LQf2;

    iget-object v2, v2, LQf2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lb56;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lb56;->e()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v4, p0, LNm$d;->b:LQf2;

    iget-object v4, v4, LQf2;->c:Landroid/widget/ImageView;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    if-nez v2, :cond_2

    iget-object v2, p0, LNm$d;->b:LQf2;

    iget-object v2, v2, LQf2;->c:Landroid/widget/ImageView;

    const-string v4, "binding.icon"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v5, v5, v4, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_2
    iget-object v2, p0, LNm$d;->b:LQf2;

    iget-object v2, v2, LQf2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lb56;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lb56;->f()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    iget-object v4, p0, LNm$d;->b:LQf2;

    iget-object v4, v4, LQf2;->d:Landroid/widget/TextView;

    const-string v5, "binding.learnMore"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ltu6;->r(Landroid/view/View;)V

    iget-object v4, p0, LNm$d;->b:LQf2;

    iget-object v4, v4, LQf2;->d:Landroid/widget/TextView;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, LNm$d$a;

    invoke-direct {v5, v1, v2, v3}, LNm$d$a;-><init>(LNm;J)V

    invoke-static {v4, v5}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_3
    iget-object v1, p0, LNm$d;->b:LQf2;

    iget-object v1, v1, LQf2;->h:Landroid/view/View;

    invoke-virtual {p1}, Lb56;->d()I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_4
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->X(Landroid/view/View;)V

    :cond_5
    return-void
.end method
