.class public final Lpu5;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpu5$a;,
        Lpu5$b;,
        Lpu5$c;,
        Lpu5$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001:\u0004\'(\u0018\u001cB\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016J\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000eJ\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000eJ\u0006\u0010\u0015\u001a\u00020\nR\"\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00130\u00130\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00110\u00110\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001dR\u001c\u0010$\u001a\u0008\u0018\u00010!R\u00020\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006)"
    }
    d2 = {
        "Lpu5;",
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
        "LF6;",
        "r",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/wire/WireServiceCenterStatus;",
        "w",
        "",
        "z",
        "Lco/bird/android/model/wire/WireBird;",
        "x",
        "v",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lio/reactivex/subjects/d;",
        "viewDetailSubject",
        "Lio/reactivex/subjects/a;",
        "d",
        "Lio/reactivex/subjects/a;",
        "statusSubject",
        "e",
        "notesSubject",
        "Lpu5$c;",
        "f",
        "Lpu5$c;",
        "noteViewHolder",
        "<init>",
        "()V",
        "a",
        "b",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/model/wire/WireServiceCenterStatus;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lpu5$c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LyS0;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<WireBird>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpu5;->c:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v0

    const-string v1, "create<WireServiceCenterStatus>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpu5;->d:Lio/reactivex/subjects/a;

    const-string v0, ""

    invoke-static {v0}, Lio/reactivex/subjects/a;->g(Ljava/lang/Object;)Lio/reactivex/subjects/a;

    move-result-object v0

    const-string v1, "createDefault<String>(\"\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpu5;->e:Lio/reactivex/subjects/a;

    return-void
.end method

.method public static final synthetic access$getAdapterData(Lpu5;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getNoteViewHolder$p(Lpu5;)Lpu5$c;
    .locals 0

    iget-object p0, p0, Lpu5;->f:Lpu5$c;

    return-object p0
.end method

.method public static final synthetic access$getNotesSubject$p(Lpu5;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lpu5;->e:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getStatusSubject$p(Lpu5;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lpu5;->d:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getViewDetailSubject$p(Lpu5;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lpu5;->c:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$setNoteViewHolder$p(Lpu5;Lpu5$c;)V
    .locals 0

    iput-object p1, p0, Lpu5;->f:Lpu5$c;

    return-void
.end method


# virtual methods
.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LJA4;

    invoke-direct {v0}, LJA4;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lpu5;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    sget v0, LNj4;->item_vehicle_summary:I

    if-ne p2, v0, :cond_0

    new-instance p2, Lpu5$d;

    invoke-direct {p2, p0, p1}, Lpu5$d;-><init>(Lpu5;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, Lmk4;->item_button_secondary:I

    if-ne p2, v0, :cond_1

    new-instance p2, Lpu5$a;

    invoke-direct {p2, p0, p1}, Lpu5$a;-><init>(Lpu5;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, Lmk4;->view_list_header:I

    if-ne p2, v0, :cond_2

    new-instance p2, Lpu5$b;

    invoke-direct {p2, p0, p1}, Lpu5$b;-><init>(Lpu5;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, LNj4;->item_service_center_status:I

    if-ne p2, v0, :cond_3

    new-instance p2, Lpu5$c;

    invoke-direct {p2, p0, p1}, Lpu5$c;-><init>(Lpu5;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, Ltu5;

    invoke-direct {v0}, Ltu5;-><init>()V

    return-object v0
.end method

.method public final v()V
    .locals 2

    iget-object v0, p0, Lpu5;->f:Lpu5$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lpu5$c;->i()LGf2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, LGf2;->b:Lco/bird/android/widget/EditTextBox;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/EditTextBox;->setError(Z)V

    :goto_1
    return-void
.end method

.method public final w()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireServiceCenterStatus;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpu5;->d:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "statusSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final x()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpu5;->c:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "viewDetailSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final z()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpu5;->e:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "notesSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
