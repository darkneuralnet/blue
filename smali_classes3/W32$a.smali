.class public final LW32$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW32;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "LW32$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/widget/standardcomponents/InspectionV3CardView;",
        "b",
        "Lco/bird/android/widget/standardcomponents/InspectionV3CardView;",
        "inspectionCard",
        "Lm42;",
        "c",
        "Lm42;",
        "adapter",
        "",
        "d",
        "Z",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LW32;Landroid/view/View;)V",
        "workorders_release"
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
        "SMAP\nInspectionV3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,180:1\n18#2:181\n9#3,4:182\n*S KotlinDebug\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$CategoryViewHolder\n*L\n149#1:181\n149#1:182,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

.field public final c:Lm42;

.field public d:Z

.field public final synthetic e:LW32;


# direct methods
.method public constructor <init>(LW32;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LW32$a;->e:LW32;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    iput-object p2, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    new-instance v0, Lm42;

    invoke-direct {v0}, Lm42;-><init>()V

    iput-object v0, p0, LW32$a;->c:Lm42;

    new-instance v1, LW32$a$a;

    invoke-direct {v1, p0, p1}, LW32$a$a;-><init>(LW32$a;LW32;)V

    invoke-virtual {p2, v1}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->C(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, LW32$a$b;

    invoke-direct {v1, p0, p1}, LW32$a$b;-><init>(LW32$a;LW32;)V

    invoke-virtual {p2, v1}, Lco/bird/android/widget/standardcomponents/InspectionV3CardView;->E(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v0}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->setAdapter(LMy;)V

    new-instance v1, LW32$a$c;

    invoke-direct {v1, p1, p0}, LW32$a$c;-><init>(LW32;LW32$a;)V

    invoke-virtual {v0, v1}, Lm42;->v(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, LW32$a$d;

    invoke-static {p1}, LW32;->access$getWarningDisplaysSubject$p(LW32;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-direct {v1, p1}, LW32$a$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lm42;->w(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2}, Lco/bird/android/widget/standardcomponents/InspectionCard;->s()Landroid/widget/ImageView;

    move-result-object p1

    const/4 p2, 0x4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "itemView.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p2

    invoke-static {p1, p2}, LCY1;->a(Landroid/widget/ImageView;F)V

    return-void
.end method

.method public static final synthetic a(LW32$a;)Z
    .locals 0

    iget-boolean p0, p0, LW32$a;->d:Z

    return p0
.end method

.method public static final synthetic b(LW32$a;)Lco/bird/android/widget/standardcomponents/InspectionV3CardView;
    .locals 0

    iget-object p0, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, LW32$a;->e:LW32;

    invoke-static {v0}, LW32;->access$getAdapterData(LW32;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LQ32;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LQ32;

    if-eqz p1, :cond_7

    const/4 v0, 0x1

    iput-boolean v0, p0, LW32$a;->d:Z

    iget-object v2, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, LQ32;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/InspectionCard;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, LQ32;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/InspectionCard;->setDescription(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, LQ32;->i()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->setAccepted(Ljava/lang/Boolean;)V

    iget-object v2, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, LQ32;->e()Z

    move-result v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/InspectionV3CardView;->setExpanded(Z)V

    iget-object v2, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, LQ32;->g()Z

    move-result v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/InspectionV3CardView;->setMutable(Z)V

    iget-object v2, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, LQ32;->h()Lco/bird/android/model/InspectionNotice;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    invoke-virtual {v2, v0}, Lco/bird/android/widget/standardcomponents/InspectionV3CardView;->setCampaignVisible(Z)V

    iget-object v0, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, LQ32;->h()Lco/bird/android/model/InspectionNotice;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/InspectionNotice;->getDisplay()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    invoke-virtual {v0, v2}, Lco/bird/android/widget/standardcomponents/InspectionV3CardView;->setCampaignTitle(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, LQ32;->h()Lco/bird/android/model/InspectionNotice;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lco/bird/android/model/InspectionNotice;->getBannerColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireThemedColors;->getLightMode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_3

    :cond_3
    move-object v2, v1

    :goto_3
    invoke-virtual {v0, v2}, Lco/bird/android/widget/standardcomponents/InspectionV3CardView;->setCampaignColor(Ljava/lang/Integer;)V

    invoke-virtual {p1}, LQ32;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/bumptech/glide/a;->t(Landroid/content/Context;)LUI4;

    move-result-object v2

    invoke-virtual {v2, v0}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object v0

    iget-object v2, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {v2}, Lco/bird/android/widget/standardcomponents/InspectionCard;->s()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v0, v2}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    move-result-object v0

    goto :goto_4

    :cond_4
    move-object v0, v1

    :goto_4
    if-nez v0, :cond_5

    iget-object v0, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {v0}, Lco/bird/android/widget/standardcomponents/InspectionCard;->s()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5
    invoke-virtual {p1}, LQ32;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, LQ32;->j()LH6;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->B(Ljava/util/List;)V

    goto :goto_5

    :cond_6
    iget-object p1, p0, LW32$a;->b:Lco/bird/android/widget/standardcomponents/InspectionV3CardView;

    invoke-virtual {p1}, Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;->u()V

    :goto_5
    iput-boolean v4, p0, LW32$a;->d:Z

    :cond_7
    return-void
.end method
