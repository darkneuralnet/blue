.class public final LGP;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGP$a;,
        LGP$b;,
        LGP$c;,
        LGP$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0011\u0018B\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cR\"\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\r0\r0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0019"
    }
    d2 = {
        "LGP;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "onAttachedToRecyclerView",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "z7",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lma4;",
        "footerClicksRelay",
        "<init>",
        "()V",
        "a",
        "b",
        "d",
        "bird-plus_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final c:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LyS0;-><init>()V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<BirdPlusView>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LGP;->c:Lma4;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LGP;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFooterClicksRelay$p(LGP;)Lma4;
    .locals 0

    iget-object p0, p0, LGP;->c:Lma4;

    return-object p0
.end method


# virtual methods
.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LIP;

    invoke-direct {v0}, LIP;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LGP;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    sget v0, Lqk4;->item_bird_plus_details_header:I

    if-ne p2, v0, :cond_0

    new-instance p2, LGP$b;

    invoke-direct {p2, p0, p1}, LGP$b;-><init>(LGP;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, Lqk4;->item_bird_plus_details_perk_header:I

    if-ne p2, v0, :cond_1

    new-instance p2, LGP$c;

    invoke-direct {p2, p0, p1}, LGP$c;-><init>(LGP;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, Lqk4;->item_bird_plus_details_perk:I

    if-ne p2, v0, :cond_2

    new-instance p2, LGP$d;

    invoke-direct {p2, p0, p1}, LGP$d;-><init>(LGP;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, Lqk4;->item_bird_plus_details_footer:I

    if-ne p2, v0, :cond_3

    new-instance p2, LGP$a;

    invoke-direct {p2, p0, p1}, LGP$a;-><init>(LGP;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public final z7()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LGP;->c:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "footerClicksRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
