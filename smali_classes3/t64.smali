.class public final Lt64;
.super Lf86;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt64$a;,
        Lt64$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\nR\"\u0010\u0014\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R.\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0011*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r0\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u001b"
    }
    d2 = {
        "Lt64;",
        "Lf86;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "LF6;",
        "r",
        "Lio/reactivex/Observable;",
        "",
        "g",
        "",
        "",
        "D8",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "d",
        "Lio/reactivex/subjects/d;",
        "addPhotoClicksSubject",
        "e",
        "photoUrlsSubject",
        "<init>",
        "()V",
        "a",
        "b",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final d:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lf86;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lt64;->d:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<List<String>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lt64;->e:Lio/reactivex/subjects/d;

    return-void
.end method

.method public static final synthetic access$getAdapterData(Lt64;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAddPhotoClicksSubject$p(Lt64;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lt64;->d:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getPhotoUrlsSubject$p(Lt64;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lt64;->e:Lio/reactivex/subjects/d;

    return-object p0
.end method


# virtual methods
.method public final D8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lt64;->e:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "photoUrlsSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final g()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt64;->d:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "addPhotoClicksSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt64;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
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

    sget v0, LQj4;->item_section_header:I

    if-ne p2, v0, :cond_0

    new-instance p2, Lf86$f;

    invoke-direct {p2, p0, p1}, Lf86$f;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, LQj4;->item_container_order:I

    if-ne p2, v0, :cond_1

    new-instance p2, Lf86$a;

    invoke-direct {p2, p0, p1}, Lf86$a;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, LQj4;->item_container_order_details_header:I

    if-ne p2, v0, :cond_2

    new-instance p2, LUl0$a;

    invoke-direct {p2, p0, p1}, LUl0$a;-><init>(LUl0;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, LQj4;->item_image_upload:I

    if-ne p2, v0, :cond_3

    new-instance p2, Lt64$a;

    invoke-direct {p2, p0, p1}, Lt64$a;-><init>(Lt64;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    sget v0, LQj4;->item_sku_order_status:I

    if-ne p2, v0, :cond_4

    new-instance p2, Lf86$e;

    invoke-direct {p2, p0, p1}, Lf86$e;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_0

    :cond_4
    sget v0, LQj4;->item_container_order_sku_order:I

    if-ne p2, v0, :cond_5

    new-instance p2, Lt64$b;

    invoke-direct {p2, p0, p1}, Lt64$b;-><init>(Lt64;Landroid/view/View;)V

    goto :goto_0

    :cond_5
    sget v0, LQj4;->item_header_spannable_status_cta:I

    if-ne p2, v0, :cond_6

    new-instance p2, Lf86$b;

    invoke-direct {p2, p0, p1}, Lf86$b;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_0

    :cond_6
    sget v0, LQj4;->item_header_value:I

    if-ne p2, v0, :cond_7

    new-instance p2, Lf86$d;

    invoke-direct {p2, p0, p1}, Lf86$d;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_0

    :cond_7
    sget v0, LQj4;->item_transfer_order:I

    if-ne p2, v0, :cond_8

    new-instance p2, Lf86$h;

    invoke-direct {p2, p0, p1}, Lf86$h;-><init>(Lf86;Landroid/view/View;)V

    goto :goto_0

    :cond_8
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, Llf6;

    invoke-direct {v0}, Llf6;-><init>()V

    return-object v0
.end method
