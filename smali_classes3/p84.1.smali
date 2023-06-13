.class public final Lp84;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp84$a;,
        Lp84$b;,
        Lp84$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001:\u0003!\"\u000bB\u0011\u0008\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR!\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R!\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0011\u001a\u0004\u0008\u0016\u0010\u0013R\"\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u0019*\u0004\u0018\u00010\u000f0\u000f0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0019*\u0004\u0018\u00010\u000f0\u000f0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001b\u00a8\u0006#"
    }
    d2 = {
        "Lp84;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "layoutId",
        "Lw1;",
        "onCreateViewHolder",
        "LF6;",
        "r",
        "Lw84;",
        "c",
        "Lw84;",
        "freeRideViewHolderFactory",
        "Lio/reactivex/Observable;",
        "",
        "d",
        "Lkotlin/Lazy;",
        "v",
        "()Lio/reactivex/Observable;",
        "activateClicks",
        "e",
        "w",
        "addCodeEvents",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "f",
        "Lma4;",
        "mutableActivateClicks",
        "g",
        "mutableAddCodeEvents",
        "<init>",
        "(Lw84;)V",
        "a",
        "b",
        "promotions_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final c:Lw84;

.field public final d:Lkotlin/Lazy;

.field public final e:Lkotlin/Lazy;

.field public final f:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lw84;)V
    .locals 1

    const-string v0, "freeRideViewHolderFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LyS0;-><init>()V

    iput-object p1, p0, Lp84;->c:Lw84;

    new-instance p1, Lp84$d;

    invoke-direct {p1, p0}, Lp84$d;-><init>(Lp84;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lp84;->d:Lkotlin/Lazy;

    new-instance p1, Lp84$e;

    invoke-direct {p1, p0}, Lp84$e;-><init>(Lp84;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lp84;->e:Lkotlin/Lazy;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    const-string v0, "create<String>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lp84;->f:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lp84;->g:Lma4;

    return-void
.end method

.method public static final synthetic access$getAdapterData(Lp84;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMutableActivateClicks$p(Lp84;)Lma4;
    .locals 0

    iget-object p0, p0, Lp84;->f:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getMutableAddCodeEvents$p(Lp84;)Lma4;
    .locals 0

    iget-object p0, p0, Lp84;->g:Lma4;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lp84;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    sget v0, LCj4;->item_promo_center_header:I

    if-ne p2, v0, :cond_0

    new-instance p2, Lp84$c;

    invoke-direct {p2, p0, p1}, Lp84$c;-><init>(Lp84;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, LCj4;->item_promo_center_coupon:I

    if-ne p2, v0, :cond_1

    new-instance p2, Lp84$b;

    invoke-direct {p2, p0, p1}, Lp84$b;-><init>(Lp84;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, LCj4;->item_promo_center_add_code:I

    if-ne p2, v0, :cond_2

    new-instance p2, Lp84$a;

    invoke-direct {p2, p0, p1}, Lp84$a;-><init>(Lp84;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, LCj4;->item_promo_center_free_ride:I

    if-ne p2, v0, :cond_3

    iget-object p2, p0, Lp84;->c:Lw84;

    invoke-interface {p2, p1}, Lw84;->a(Landroid/view/View;)Lv84;

    move-result-object p2

    goto :goto_0

    :cond_3
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, Lp84$f;

    invoke-direct {v0}, Lp84$f;-><init>()V

    return-object v0
.end method

.method public final v()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lp84;->d:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-activateClicks>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final w()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lp84;->e:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-addCodeEvents>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method
