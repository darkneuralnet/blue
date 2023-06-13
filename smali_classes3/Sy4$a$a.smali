.class public final LSy4$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/standardcomponents/CheckableItemView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSy4$a;-><init>(LSy4;Landroid/view/View;)V
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
        "Sy4$a$a",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView;",
        "view",
        "",
        "isChecked",
        "",
        "a",
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
        "SMAP\nRepairIssueSubtypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$RepairTypeViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n1#4:120\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$RepairTypeViewHolder$1\n*L\n74#1:115\n74#1:116,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LSy4$a;

.field public final synthetic b:LSy4;


# direct methods
.method public constructor <init>(LSy4$a;LSy4;)V
    .locals 0

    iput-object p1, p0, LSy4$a$a;->a:LSy4$a;

    iput-object p2, p0, LSy4$a$a;->b:LSy4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/widget/standardcomponents/CheckableItemView;Z)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LSy4$a$a;->a:LSy4$a;

    invoke-static {p1}, LSy4$a;->a(LSy4$a;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LSy4$a$a;->a:LSy4$a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, LSy4$a$a;->b:LSy4;

    invoke-static {p1}, LSy4;->access$getAdapterData(LSy4;)LE6;

    move-result-object p1

    iget-object v0, p0, LSy4$a$a;->a:LSy4$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LTD4;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LTD4;

    if-eqz p1, :cond_2

    iget-object v0, p0, LSy4$a$a;->b:LSy4;

    invoke-virtual {p1}, LTD4;->e()Lco/bird/android/model/RepairType;

    move-result-object p1

    invoke-static {v0}, LSy4;->access$getRepairCheckSubject$p(LSy4;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method
