.class public final LVb4$h;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVb4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "h"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LVb4$h;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lfg2;",
        "b",
        "Lfg2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LVb4;Landroid/view/View;)V",
        "qualitycontrol_release"
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
        "SMAP\nQualityControlResultAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$VehicleImageViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,198:1\n18#2:199\n9#3,4:200\n*S KotlinDebug\n*F\n+ 1 QualityControlResultAdapter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapter$VehicleImageViewHolder\n*L\n70#1:199\n70#1:200,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lfg2;

.field public final synthetic c:LVb4;


# direct methods
.method public constructor <init>(LVb4;Landroid/view/View;)V
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

    iput-object p1, p0, LVb4$h;->c:LVb4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lfg2;->a(Landroid/view/View;)Lfg2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LVb4$h;->b:Lfg2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object p1, p0, LVb4$h;->c:LVb4;

    invoke-static {p1}, LVb4;->access$getAdapterData(LVb4;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, LVb4$h;->b:Lfg2;

    iget-object v1, v1, Lfg2;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    sget v0, Lrg4;->ic_thumbs_up_filled_small:I

    invoke-static {p0, v0}, Lqr6;->b(Landroidx/recyclerview/widget/RecyclerView$D;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget v0, Lrg4;->ic_thumbs_down_filled_small:I

    invoke-static {p0, v0}, Lqr6;->b(Landroidx/recyclerview/widget/RecyclerView$D;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LVb4$h;->b:Lfg2;

    iget-object v0, v0, Lfg2;->e:Landroid/widget/ImageView;

    sget-object v1, Lco/bird/android/model/constant/BirdModel;->Companion:Lco/bird/android/model/constant/BirdModel$Companion;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Lco/bird/android/model/constant/BirdModel$Companion;->fromString(Ljava/lang/String;)Lco/bird/android/model/constant/BirdModel;

    move-result-object p1

    const-string v1, "itemView.context"

    if-eqz p1, :cond_2

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2}, LPM;->a(Lco/bird/android/model/constant/BirdModel;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    sget-object p1, Lco/bird/android/model/constant/BirdModel;->B2:Lco/bird/android/model/constant/BirdModel;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2}, LPM;->a(Lco/bird/android/model/constant/BirdModel;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :cond_3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method
