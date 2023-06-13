.class public final LyC4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LyC4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "LyC4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "e",
        "Lco/bird/android/widget/EditTextBox;",
        "b",
        "Lco/bird/android/widget/EditTextBox;",
        "comments",
        "",
        "c",
        "Z",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LyC4;Landroid/view/View;)V",
        "repair_release"
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
        "SMAP\nRepairSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$CommentsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n18#2:130\n18#2:136\n9#3,4:131\n9#3,4:137\n1#4:135\n*S KotlinDebug\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$CommentsViewHolder\n*L\n115#1:130\n122#1:136\n115#1:131,4\n122#1:137,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/EditTextBox;

.field public c:Z

.field public final synthetic d:LyC4;


# direct methods
.method public constructor <init>(LyC4;Landroid/view/View;)V
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

    iput-object p1, p0, LyC4$a;->d:LyC4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Lco/bird/android/widget/EditTextBox;

    iput-object p2, p0, LyC4$a;->b:Lco/bird/android/widget/EditTextBox;

    invoke-static {p1}, LyC4;->access$getCommentsViewHolders$p(LyC4;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, LyC4$a$a;

    invoke-direct {v0, p0, p1}, LyC4$a$a;-><init>(LyC4$a;LyC4;)V

    invoke-static {p2, v0}, LMs2;->x(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(LyC4$a;)Z
    .locals 0

    iget-boolean p0, p0, LyC4$a;->c:Z

    return p0
.end method

.method public static final synthetic b(LyC4$a;)Lco/bird/android/widget/EditTextBox;
    .locals 0

    iget-object p0, p0, LyC4$a;->b:Lco/bird/android/widget/EditTextBox;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LyC4$a;->c:Z

    iget-object v0, p0, LyC4$a;->d:LyC4;

    invoke-static {v0}, LyC4;->access$getAdapterData(LyC4;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/RepairType;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/RepairType;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/RepairType;->getNotes()Ljava/lang/String;

    move-result-object v1

    :cond_1
    iget-object p1, p0, LyC4$a;->b:Lco/bird/android/widget/EditTextBox;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, LyC4$a;->e()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LyC4$a;->c:Z

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, LyC4$a;->d:LyC4;

    invoke-virtual {v0}, LyC4;->v()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LyC4$a;->b:Lco/bird/android/widget/EditTextBox;

    iget-object v1, p0, LyC4$a;->d:LyC4;

    invoke-static {v1}, LyC4;->access$getAdapterData(LyC4;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG6;

    invoke-virtual {v1}, LG6;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lco/bird/android/model/RepairType;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lco/bird/android/model/RepairType;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/RepairType;->getRequireNotes()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/RepairType;->getNotes()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v1, v3

    :goto_2
    if-eqz v1, :cond_3

    move v2, v3

    :cond_3
    invoke-virtual {v0, v2}, Lco/bird/android/widget/EditTextBox;->setError(Z)V

    :cond_4
    return-void
.end method
