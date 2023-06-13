.class public abstract LqA;
.super LoA;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LqA$a;,
        LqA$b;,
        LqA$c;,
        LqA$d;,
        LqA$e;,
        LqA$f;,
        LqA$g;,
        LqA$h;,
        LqA$i;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008&\u0018\u00002\u00020\u0001:\t\u0014\u0015\u0016\u0017\r\u0018\u0019\u001a\u001bB\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008R(\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\t0\t0\u000b8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "LqA;",
        "LoA;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/CommandCenterButton;",
        "C",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "e",
        "Lio/reactivex/subjects/d;",
        "D",
        "()Lio/reactivex/subjects/d;",
        "buttonSubject",
        "<init>",
        "()V",
        "a",
        "b",
        "c",
        "d",
        "f",
        "g",
        "h",
        "i",
        "co.bird.android.commandcenter"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final e:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/model/CommandCenterButton;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LoA;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<CommandCenterButton>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LqA;->e:Lio/reactivex/subjects/d;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LqA;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final C()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/CommandCenterButton;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LqA;->e:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "buttonSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final D()Lio/reactivex/subjects/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/model/CommandCenterButton;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LqA;->e:Lio/reactivex/subjects/d;

    return-object v0
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LqA;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    move-result-object v0

    sget v1, Lnj4;->item_vehicle_summary:I

    if-ne p2, v1, :cond_0

    new-instance p1, LqA$g;

    invoke-direct {p1, p0, v0}, LqA$g;-><init>(LqA;Landroid/view/View;)V

    goto/16 :goto_0

    :cond_0
    sget v1, Lmk4;->item_button:I

    if-ne p2, v1, :cond_1

    new-instance p1, LqA$a;

    invoke-direct {p1, p0, v0}, LqA$a;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v1, Lmk4;->item_button_secondary:I

    if-ne p2, v1, :cond_2

    new-instance p1, LqA$a;

    invoke-direct {p1, p0, v0}, LqA$a;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v1, Lyj4;->item_work_order_header:I

    if-ne p2, v1, :cond_3

    new-instance p1, LqA$h;

    invoke-direct {p1, p0, v0}, LqA$h;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    sget v1, Lyj4;->item_work_order_issue_header:I

    if-ne p2, v1, :cond_4

    new-instance p1, LqA$i;

    invoke-direct {p1, p0, v0}, LqA$i;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_4
    sget v1, Lyj4;->item_command_center_notice:I

    if-ne p2, v1, :cond_5

    new-instance p1, LqA$e;

    invoke-direct {p1, p0, v0}, LqA$e;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_5
    sget v1, Lyj4;->item_command_center_header:I

    if-ne p2, v1, :cond_6

    new-instance p1, LUl0$a;

    invoke-direct {p1, p0, v0}, LUl0$a;-><init>(LUl0;Landroid/view/View;)V

    goto :goto_0

    :cond_6
    sget v1, Lyj4;->item_command_center_diagnostic:I

    if-ne p2, v1, :cond_7

    new-instance p1, LqA$c;

    invoke-direct {p1, p0, v0}, LqA$c;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_7
    sget v1, Lyj4;->item_command_center_details:I

    if-ne p2, v1, :cond_8

    new-instance p1, LqA$b;

    invoke-direct {p1, p0, v0}, LqA$b;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_8
    sget v1, Lyj4;->item_command_center_repair_log:I

    if-ne p2, v1, :cond_9

    new-instance p1, LqA$f;

    invoke-direct {p1, p0, v0}, LqA$f;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_9
    sget v1, Lyj4;->item_command_center_empty_state:I

    if-ne p2, v1, :cond_a

    new-instance p1, LqA$d;

    invoke-direct {p1, p0, v0}, LqA$d;-><init>(LqA;Landroid/view/View;)V

    goto :goto_0

    :cond_a
    invoke-super {p0, p1, p2}, LoA;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    :goto_0
    return-object p1
.end method
