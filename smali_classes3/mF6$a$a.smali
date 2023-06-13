.class public final LmF6$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/standardcomponents/CheckableItemView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmF6$a;-><init>(LmF6;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "mF6$a$a",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView;",
        "view",
        "",
        "isChecked",
        "",
        "a",
        "workorders_release"
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
        "SMAP\nWorkOrderIssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssueAdapter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssueAdapter$IssueTypeViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,62:1\n18#2:63\n9#3,4:64\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssueAdapter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssueAdapter$IssueTypeViewHolder$1\n*L\n45#1:63\n45#1:64,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LmF6$a;

.field public final synthetic b:LmF6;


# direct methods
.method public constructor <init>(LmF6$a;LmF6;)V
    .locals 0

    iput-object p1, p0, LmF6$a$a;->a:LmF6$a;

    iput-object p2, p0, LmF6$a$a;->b:LmF6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/widget/standardcomponents/CheckableItemView;Z)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LmF6$a$a;->a:LmF6$a;

    invoke-static {p1}, LmF6$a;->a(LmF6$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LmF6$a$a;->b:LmF6;

    invoke-static {p1}, LmF6;->access$getAdapterData(LmF6;)LE6;

    move-result-object p1

    invoke-virtual {p1}, LE6;->h()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LmF6$a$a;->a:LmF6$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LFa2;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LFa2;

    if-eqz p1, :cond_2

    iget-object v0, p0, LmF6$a$a;->b:LmF6;

    invoke-static {v0}, LmF6;->access$getIssueCheckSubject$p(LmF6;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {p1}, LFa2;->f()Lco/bird/android/model/IssueType;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
