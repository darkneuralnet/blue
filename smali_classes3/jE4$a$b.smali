.class public final LjE4$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjE4$a;-><init>(LjE4;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/NonRepair;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/NonRepair;",
        "nonRepair",
        "",
        "a",
        "(Lco/bird/android/model/NonRepair;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRepairV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$IssueViewHolder$3\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n1#4:134\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$IssueViewHolder$3\n*L\n69#1:129\n69#1:130,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LjE4$a;

.field public final synthetic h:LjE4;


# direct methods
.method public constructor <init>(LjE4$a;LjE4;)V
    .locals 0

    iput-object p1, p0, LjE4$a$b;->g:LjE4$a;

    iput-object p2, p0, LjE4$a$b;->h:LjE4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/NonRepair;)V
    .locals 2

    const-string v0, "nonRepair"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LjE4$a$b;->g:LjE4$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, LjE4$a$b;->h:LjE4;

    invoke-static {v1}, LjE4;->access$getAdapterData(LjE4;)LE6;

    move-result-object v1

    invoke-virtual {v1, v0}, LE6;->e(I)LG6;

    move-result-object v0

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LDA4;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast v0, LDA4;

    if-eqz v0, :cond_1

    iget-object v1, p0, LjE4$a$b;->h:LjE4;

    invoke-virtual {v0}, LDA4;->a()Lco/bird/android/model/RepairIssue;

    move-result-object v0

    invoke-static {v1}, LjE4;->access$getNonRepairSelectsSubject$p(LjE4;)Lio/reactivex/subjects/d;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/RepairIssue;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/NonRepair;

    invoke-virtual {p0, p1}, LjE4$a$b;->a(Lco/bird/android/model/NonRepair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
