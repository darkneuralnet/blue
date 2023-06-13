.class public final LD33$h;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD33;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "h"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "LD33$h;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LCd2;",
        "b",
        "LCd2;",
        "binding",
        "LM33;",
        "c",
        "LM33;",
        "adapter",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "d",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "layoutManager",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LD33;Landroid/view/View;)V",
        "nest-flight-sheet_release"
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
        "SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$ImagesViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$ImagesViewHolder\n*L\n261#1:464\n261#1:465,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LCd2;

.field public final c:LM33;

.field public final d:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public final synthetic e:LD33;


# direct methods
.method public constructor <init>(LD33;Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD33$h;->e:LD33;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LCd2;->a(Landroid/view/View;)LCd2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD33$h;->b:LCd2;

    new-instance p2, LM33;

    invoke-direct {p2}, LM33;-><init>()V

    iput-object p2, p0, LD33$h;->c:LM33;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    iput-object v0, p0, LD33$h;->d:Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v1, p1, LCd2;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object v0, p1, LCd2;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p2, p1, LCd2;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    new-instance p2, Landroidx/recyclerview/widget/r;

    invoke-direct {p2}, Landroidx/recyclerview/widget/r;-><init>()V

    iget-object v0, p1, LCd2;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/v;->b(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p2, p1, LCd2;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LD33$h$a;

    invoke-direct {v0, p0}, LD33$h$a;-><init>(LD33$h;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$t;)V

    iget-object p2, p1, LCd2;->b:Landroid/widget/ImageView;

    const-string v0, "binding.leftArrow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD33$h$b;

    invoke-direct {v0, p0}, LD33$h$b;-><init>(LD33$h;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p1, LCd2;->d:Landroid/widget/ImageView;

    const-string p2, "binding.rightArrow"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LD33$h$c;

    invoke-direct {p2, p0}, LD33$h$c;-><init>(LD33$h;)V

    invoke-static {p1, p2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(LD33$h;)LCd2;
    .locals 0

    iget-object p0, p0, LD33$h;->b:LCd2;

    return-object p0
.end method

.method public static final synthetic b(LD33$h;)Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 0

    iget-object p0, p0, LD33$h;->d:Landroidx/recyclerview/widget/LinearLayoutManager;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LD33$h;->e:LD33;

    invoke-static {v0}, LD33;->access$getAdapterData(LD33;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/NestImages;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/NestImages;

    if-eqz p1, :cond_2

    iget-object v0, p0, LD33$h;->c:LM33;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestImages;->getImageUrls()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LM33;->o(Ljava/util/List;)V

    iget-object v0, p0, LD33$h;->b:LCd2;

    iget-object v0, v0, LCd2;->d:Landroid/widget/ImageView;

    const-string v1, "binding.rightArrow"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestImages;->getImageUrls()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    const/4 p1, 0x4

    invoke-static {v0, v1, p1}, Ltu6;->s(Landroid/view/View;ZI)V

    :cond_2
    return-void
.end method
