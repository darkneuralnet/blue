.class public final LSy4$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/standardcomponents/CheckableItemView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSy4$b;-><init>(LSy4;Landroid/view/View;)V
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
        "Sy4$b$a",
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
        "SMAP\nRepairIssueSubtypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$StatusViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n1#4:120\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$StatusViewHolder$1\n*L\n96#1:115\n96#1:116,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LSy4$b;

.field public final synthetic b:LSy4;


# direct methods
.method public constructor <init>(LSy4$b;LSy4;)V
    .locals 0

    iput-object p1, p0, LSy4$b$a;->a:LSy4$b;

    iput-object p2, p0, LSy4$b$a;->b:LSy4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/widget/standardcomponents/CheckableItemView;Z)V
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "view"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, LSy4$b$a;->a:LSy4$b;

    invoke-static {v1}, LSy4$b;->a(LSy4$b;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v0, LSy4$b$a;->a:LSy4$b;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, v0, LSy4$b$a;->b:LSy4;

    invoke-static {v1}, LSy4;->access$getAdapterData(LSy4;)LE6;

    move-result-object v1

    iget-object v2, v0, LSy4$b$a;->a:LSy4$b;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result v2

    invoke-virtual {v1, v2}, LE6;->e(I)LG6;

    move-result-object v1

    invoke-virtual {v1}, LG6;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lya2;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lya2;

    if-eqz v1, :cond_3

    iget-object v2, v0, LSy4$b$a;->b:LSy4;

    invoke-virtual {v1}, Lya2;->e()Lco/bird/android/model/Issue;

    move-result-object v3

    invoke-virtual {v1}, Lya2;->f()Lco/bird/android/model/IssueStatus;

    move-result-object v9

    invoke-virtual {v1}, Lya2;->g()Lco/bird/android/model/IssueStatus;

    move-result-object v22

    invoke-virtual {v1}, Lya2;->h()Lco/bird/android/model/constant/IssueStatusReason;

    move-result-object v1

    if-eqz p2, :cond_2

    invoke-static {v2}, LSy4;->access$getIssueSubject$p(LSy4;)Lio/reactivex/subjects/d;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0x3ffdf

    const/16 v24, 0x0

    invoke-static/range {v3 .. v24}, Lco/bird/android/model/Issue;->copy$default(Lco/bird/android/model/Issue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireServiceCenterCampaign;Lco/bird/android/model/constant/IssueStatusReason;ILjava/lang/Object;)Lco/bird/android/model/Issue;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {v2}, LSy4;->access$getIssueSubject$p(LSy4;)Lio/reactivex/subjects/d;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v23, 0x3ffdf

    const/16 v24, 0x0

    move-object/from16 v9, v22

    move-object/from16 v22, v1

    invoke-static/range {v3 .. v24}, Lco/bird/android/model/Issue;->copy$default(Lco/bird/android/model/Issue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireServiceCenterCampaign;Lco/bird/android/model/constant/IssueStatusReason;ILjava/lang/Object;)Lco/bird/android/model/Issue;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method
