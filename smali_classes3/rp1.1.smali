.class public final Lrp1;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrp1$a;,
        Lrp1$b;,
        Lrp1$c;,
        Lrp1$d;,
        Lrp1$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001:\u0005\u001c\u001d\u000b\u000f\u0012B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u0010\u0012\u000c\u0012\n \n*\u0004\u0018\u00010\t0\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\"\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n \n*\u0004\u0018\u00010\u000e0\u000e0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000cR!\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00118FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R!\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00118FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0013\u001a\u0004\u0008\u0018\u0010\u0015\u00a8\u0006\u001e"
    }
    d2 = {
        "Lrp1;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "Lma4;",
        "",
        "kotlin.jvm.PlatformType",
        "c",
        "Lma4;",
        "mutableReportClicks",
        "",
        "d",
        "mutableInfoClicks",
        "Lio/reactivex/Observable;",
        "e",
        "Lkotlin/Lazy;",
        "v",
        "()Lio/reactivex/Observable;",
        "periodClicks",
        "f",
        "getInfoClicks",
        "infoClicks",
        "<init>",
        "()V",
        "a",
        "b",
        "co.bird.android.feature.fleet-status"
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
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lkotlin/Lazy;

.field public final f:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LyS0;-><init>()V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lrp1;->c:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lrp1;->d:Lma4;

    new-instance v0, Lrp1$g;

    invoke-direct {v0, p0}, Lrp1$g;-><init>(Lrp1;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lrp1;->e:Lkotlin/Lazy;

    new-instance v0, Lrp1$f;

    invoke-direct {v0, p0}, Lrp1$f;-><init>(Lrp1;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lrp1;->f:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getAdapterData(Lrp1;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMutableInfoClicks$p(Lrp1;)Lma4;
    .locals 0

    iget-object p0, p0, Lrp1;->d:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getMutableReportClicks$p(Lrp1;)Lma4;
    .locals 0

    iget-object p0, p0, Lrp1;->c:Lma4;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lrp1;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    sget v0, Laj4;->header_scoreboard:I

    if-ne p2, v0, :cond_0

    new-instance p2, Lrp1$c;

    invoke-direct {p2, p0, p1}, Lrp1$c;-><init>(Lrp1;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, Laj4;->header_panel:I

    if-ne p2, v0, :cond_1

    new-instance p2, Lrp1$e;

    invoke-direct {p2, p0, p1}, Lrp1$e;-><init>(Lrp1;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, Laj4;->item_report_period:I

    if-ne p2, v0, :cond_2

    new-instance p2, Lrp1$b;

    invoke-direct {p2, p0, p1}, Lrp1$b;-><init>(Lrp1;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, Laj4;->item_target_scoreboard:I

    if-ne p2, v0, :cond_3

    new-instance p2, Lrp1$d;

    invoke-direct {p2, p0, p1}, Lrp1$d;-><init>(Lrp1;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    sget v0, Laj4;->item_report_panel:I

    if-ne p2, v0, :cond_4

    new-instance p2, Lrp1$a;

    invoke-direct {p2, p0, p1}, Lrp1$a;-><init>(Lrp1;Landroid/view/View;)V

    goto :goto_0

    :cond_4
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public final v()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrp1;->e:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-periodClicks>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method
