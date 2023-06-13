.class public final Lpu5$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpu5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpu5$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LGf2;",
        "b",
        "LGf2;",
        "i",
        "()LGf2;",
        "viewBinding",
        "",
        "c",
        "Z",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lpu5;Landroid/view/View;)V",
        "servicecenter_release"
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
        "SMAP\nServiceProgressListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressListAdapter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressListAdapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n18#2:145\n18#2:151\n9#3,4:146\n9#3,4:152\n1#4:150\n*S KotlinDebug\n*F\n+ 1 ServiceProgressListAdapter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressListAdapter$StatusViewHolder\n*L\n125#1:145\n106#1:151\n125#1:146,4\n106#1:152,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LGf2;

.field public c:Z

.field public final synthetic d:Lpu5;


# direct methods
.method public constructor <init>(Lpu5;Landroid/view/View;)V
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

    iput-object p1, p0, Lpu5$c;->d:Lpu5;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LGf2;->a(Landroid/view/View;)LGf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lpu5$c;->b:LGf2;

    iget-object v0, p2, LGf2;->c:Landroid/widget/RadioButton;

    new-instance v1, Lqu5;

    invoke-direct {v1, p0, p1}, Lqu5;-><init>(Lpu5$c;Lpu5;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object p2, p2, LGf2;->b:Lco/bird/android/widget/EditTextBox;

    new-instance v0, Lpu5$c$a;

    invoke-direct {v0, p0, p1}, Lpu5$c$a;-><init>(Lpu5$c;Lpu5;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public static synthetic a(Lpu5$c;Lpu5;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpu5$c;->b(Lpu5$c;Lpu5;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static final b(Lpu5$c;Lpu5;Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p2

    iget-boolean v0, p0, Lpu5$c;->c:Z

    if-nez v0, :cond_2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lpu5;->access$getAdapterData(Lpu5;)LE6;

    move-result-object p2

    invoke-virtual {p2}, LE6;->h()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p0

    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG6;

    invoke-virtual {p0}, LG6;->c()Ljava/lang/Object;

    move-result-object p0

    instance-of p2, p0, Lkotlin/Pair;

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    check-cast p0, Lkotlin/Pair;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireServiceCenterStatus;

    if-eqz p3, :cond_2

    invoke-static {p1}, Lpu5;->access$getStatusSubject$p(Lpu5;)Lio/reactivex/subjects/a;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1}, Lpu5;->access$getStatusSubject$p(Lpu5;)Lio/reactivex/subjects/a;

    move-result-object p2

    invoke-virtual {p2, p0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    invoke-static {p1}, Lpu5;->access$getNotesSubject$p(Lpu5;)Lio/reactivex/subjects/a;

    move-result-object p0

    const-string p1, ""

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static final synthetic e(Lpu5$c;)Z
    .locals 0

    iget-boolean p0, p0, Lpu5$c;->c:Z

    return p0
.end method


# virtual methods
.method public bind(I)V
    .locals 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpu5$c;->c:Z

    iget-object v1, p0, Lpu5$c;->d:Lpu5;

    invoke-static {v1}, Lpu5;->access$getAdapterData(Lpu5;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lkotlin/Pair;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    check-cast p1, Lkotlin/Pair;

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    iget-object v3, p0, Lpu5$c;->d:Lpu5;

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireServiceCenterStatus;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v5, p0, Lpu5$c;->b:LGf2;

    iget-object v5, v5, LGf2;->c:Landroid/widget/RadioButton;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireServiceCenterStatus;->getDisplayName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lpu5$c;->b:LGf2;

    iget-object v5, v5, LGf2;->c:Landroid/widget/RadioButton;

    invoke-virtual {v5, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireServiceCenterStatus;->getColor()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    iget-object v6, p0, Lpu5$c;->b:LGf2;

    iget-object v6, v6, LGf2;->c:Landroid/widget/RadioButton;

    const-string v7, "viewBinding.statusName"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    iget-object v5, p0, Lpu5$c;->b:LGf2;

    iget-object v5, v5, LGf2;->b:Lco/bird/android/widget/EditTextBox;

    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-interface {v5}, Landroid/text/Editable;->clear()V

    :cond_2
    iget-object v5, p0, Lpu5$c;->b:LGf2;

    iget-object v5, v5, LGf2;->b:Lco/bird/android/widget/EditTextBox;

    const-string v6, "viewBinding.notes"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireServiceCenterStatus;->getRequireNotes()Z

    move-result v6

    if-eqz v6, :cond_3

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    const/4 v6, 0x2

    invoke-static {v5, v0, v1, v6, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireServiceCenterStatus;->getRequireNotes()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p1, :cond_5

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireServiceCenterStatus;->getSingularHintText()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Lpu5$c;->b:LGf2;

    iget-object v0, v0, LGf2;->b:Lco/bird/android/widget/EditTextBox;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :cond_4
    invoke-static {v3, p0}, Lpu5;->access$setNoteViewHolder$p(Lpu5;Lpu5$c;)V

    goto :goto_2

    :cond_5
    invoke-static {v3}, Lpu5;->access$getNoteViewHolder$p(Lpu5;)Lpu5$c;

    move-result-object p1

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v3, v2}, Lpu5;->access$setNoteViewHolder$p(Lpu5;Lpu5$c;)V

    :cond_6
    :goto_2
    iput-boolean v1, p0, Lpu5$c;->c:Z

    return-void
.end method

.method public final i()LGf2;
    .locals 1

    iget-object v0, p0, Lpu5$c;->b:LGf2;

    return-object v0
.end method
