.class public final LKz4$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKz4$a;-><init>(LKz4;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRepairIssueSupertypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapter$SupertypeViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n18#2:107\n9#3,4:108\n1#4:112\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesAdapter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapter$SupertypeViewHolder$2\n*L\n79#1:107\n79#1:108,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LKz4;

.field public final synthetic h:LKz4$a;


# direct methods
.method public constructor <init>(LKz4;LKz4$a;)V
    .locals 0

    iput-object p1, p0, LKz4$a$b;->g:LKz4;

    iput-object p2, p0, LKz4$a$b;->h:LKz4$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LKz4$a$b;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LKz4$a$b;->g:LKz4;

    invoke-static {p1}, LKz4;->access$getAdapterData(LKz4;)LE6;

    move-result-object p1

    iget-object v0, p0, LKz4$a$b;->h:LKz4$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LEa2;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LEa2;

    if-eqz p1, :cond_1

    iget-object v0, p0, LKz4$a$b;->g:LKz4;

    invoke-virtual {p1}, LEa2;->a()Lco/bird/android/model/Issue;

    move-result-object p1

    invoke-static {v0}, LKz4;->access$getSupertypesSubject$p(LKz4;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method