.class public final LIq0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIq0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\"\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008J\"\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008J\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0003*\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0006H\u0002JB\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\r2\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00032\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "LIq0;",
        "",
        "Lio/reactivex/F;",
        "",
        "LH6;",
        "h",
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        "complaintResolutionForm",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "submission",
        "m",
        "j",
        "formResponse",
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
        "s",
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;",
        "issueOptions",
        "actionTakenOptions",
        "",
        "required",
        "p",
        "Landroid/content/Context;",
        "a",
        "Landroid/content/Context;",
        "context",
        "Lom3;",
        "b",
        "Lom3;",
        "operatorManager",
        "<init>",
        "(Landroid/content/Context;Lom3;)V",
        "co.bird.android.feature.complaintresolution"
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
        "SMAP\nComplaintResolutionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1549#2:289\n1620#2,3:290\n1549#2:293\n1620#2,3:294\n1#3:297\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter\n*L\n41#1:289\n41#1:290,3\n206#1:293\n206#1:294,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lom3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lom3;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operatorManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIq0;->a:Landroid/content/Context;

    iput-object p2, p0, LIq0;->b:Lom3;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LIq0;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getContext$p(LIq0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LIq0;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$toAdapterSection(LIq0;Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;Lco/bird/android/model/persistence/ComplaintResolution;Ljava/util/List;Ljava/util/List;Z)Lio/reactivex/F;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LIq0;->p(Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;Lco/bird/android/model/persistence/ComplaintResolution;Ljava/util/List;Ljava/util/List;Z)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LH6;
    .locals 0

    invoke-static {p0, p1}, LIq0;->r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LH6;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LIq0;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LIq0;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LH6;LH6;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LIq0;->i(LH6;LH6;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LIq0;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LIq0;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final i(LH6;LH6;)Ljava/util/List;
    .locals 2

    const-string v0, "$introduction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$menuItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [LH6;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LH6;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LH6;

    return-object p0
.end method


# virtual methods
.method public final h()Lio/reactivex/F;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v7, LH6;

    const/4 v1, 0x1

    new-array v2, v1, [LG6;

    new-instance v3, LG6;

    new-instance v9, LIH1;

    iget-object v4, v0, LIq0;->a:Landroid/content/Context;

    sget v5, Lnl4;->tell_us_what_you_see:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, LIq0;->a:Landroid/content/Context;

    sget v6, Lnl4;->visible_issue_bird_involved:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v9, v4, v5, v1}, LIH1;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sget v10, LVi4;->item_complaint_resolution_header:I

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v3

    invoke-direct/range {v8 .. v13}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    aput-object v3, v2, v1

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lga2;->values()[Lga2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/ArraysKt;->asIterable([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lga2;

    new-instance v3, LG6;

    sget v10, LVi4;->item_category:I

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v3

    invoke-direct/range {v8 .. v13}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x6

    const/16 v19, 0x0

    new-instance v1, LH6;

    move-object v14, v1

    invoke-direct/range {v14 .. v19}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, LDq0;

    invoke-direct {v2, v7, v1}, LDq0;-><init>(LH6;LH6;)V

    invoke-static {v2}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v1

    const-string v2, "fromCallable { listOf(introduction, menuItems) }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final j(Lco/bird/android/model/persistence/ComplaintResolutionForm;Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/F;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "complaintResolutionForm"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "submission"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LH6;

    const/4 v10, 0x1

    new-array v4, v10, [LG6;

    new-instance v5, LG6;

    new-instance v12, LIH1;

    iget-object v6, v0, LIq0;->a:Landroid/content/Context;

    sget v7, Lnl4;->thank_you_resolving_complaint:I

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, LIq0;->a:Landroid/content/Context;

    sget v8, Lnl4;->help_bird_permit:I

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v12, v6, v7, v10}, LIH1;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sget v17, LVi4;->item_complaint_resolution_header:I

    const/4 v14, 0x0

    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v11, v5

    move/from16 v13, v17

    invoke-direct/range {v11 .. v16}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x0

    aput-object v5, v4, v11

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, LG6;

    new-instance v5, LNq5;

    iget-object v6, v0, LIq0;->a:Landroid/content/Context;

    sget v7, Lnl4;->additional_information:I

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "context.getString(L.string.additional_information)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v6, v11}, LNq5;-><init>(Ljava/lang/String;Z)V

    sget v20, LVi4;->item_complaint_section_header:I

    const/16 v21, 0x0

    const/16 v22, 0x4

    const/16 v23, 0x0

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-direct/range {v18 .. v23}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v5, v10, [LG6;

    new-instance v6, LG6;

    new-instance v14, LIH1;

    const/16 v19, 0x0

    iget-object v7, v0, LIq0;->a:Landroid/content/Context;

    sget v8, Lnl4;->complaint_resolution_additional_information_description_body:I

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v20

    const/16 v22, 0x5

    move-object/from16 v18, v14

    invoke-direct/range {v18 .. v23}, LIH1;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x0

    const/4 v7, 0x4

    const/16 v18, 0x0

    move-object v13, v6

    move/from16 v15, v17

    move/from16 v17, v7

    invoke-direct/range {v13 .. v18}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v6, v5, v11

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    new-instance v5, LH6;

    const/16 v21, 0x0

    const/16 v22, 0x4

    move-object/from16 v18, v5

    move-object/from16 v20, v4

    invoke-direct/range {v18 .. v23}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2, v1}, LIq0;->s(Lco/bird/android/model/persistence/ComplaintResolution;Lco/bird/android/model/persistence/ComplaintResolutionForm;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v4

    new-instance v6, LIq0$b;

    invoke-direct {v6, v0, v2, v1}, LIq0$b;-><init>(LIq0;Lco/bird/android/model/persistence/ComplaintResolution;Lco/bird/android/model/persistence/ComplaintResolutionForm;)V

    new-instance v1, LGq0;

    invoke-direct {v1, v6}, LGq0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, LIq0$c;

    invoke-direct {v2, v3, v5}, LIq0$c;-><init>(LH6;LH6;)V

    new-instance v3, LHq0;

    invoke-direct {v3, v2}, LHq0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v1

    const-string v2, "fun convertNonRequiredFo\u2026ons\n        }\n      }\n  }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final m(Lco/bird/android/model/persistence/ComplaintResolutionForm;Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "complaintResolutionForm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submission"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH6;

    const/4 v1, 0x1

    new-array v1, v1, [LG6;

    new-instance v8, LG6;

    const/4 v3, 0x0

    sget v4, LVi4;->item_information:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    aput-object v8, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p2, p1}, LIq0;->s(Lco/bird/android/model/persistence/ComplaintResolution;Lco/bird/android/model/persistence/ComplaintResolutionForm;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, LIq0$d;

    invoke-direct {v2, p0, p2, p1}, LIq0$d;-><init>(LIq0;Lco/bird/android/model/persistence/ComplaintResolution;Lco/bird/android/model/persistence/ComplaintResolutionForm;)V

    new-instance p1, LEq0;

    invoke-direct {p1, v2}, LEq0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    new-instance v1, LIq0$e;

    invoke-direct {v1, p2, v0}, LIq0$e;-><init>(Lco/bird/android/model/persistence/ComplaintResolution;LH6;)V

    new-instance p2, LFq0;

    invoke-direct {p2, v1}, LFq0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "fun convertRequiredForm(\u2026ons\n        }\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final p(Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;Lco/bird/android/model/persistence/ComplaintResolution;Ljava/util/List;Ljava/util/List;Z)Lio/reactivex/F;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;",
            ">;Z)",
            "Lio/reactivex/F<",
            "LH6;",
            ">;"
        }
    .end annotation

    move-object v0, p0

    move/from16 v1, p5

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;->getField()Lco/bird/android/model/constant/ComplaintResolutionField;

    move-result-object v2

    sget-object v3, LIq0$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x0

    const-string v4, "just(\n        AdapterSec\u2026      )\n        )\n      )"

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_0
    new-instance v1, LH6;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    const-string v2, "just(\n        AdapterSec\u2026(mutableListOf())\n      )"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_1
    new-instance v2, LG6;

    new-instance v8, LNq5;

    iget-object v3, v0, LIq0;->a:Landroid/content/Context;

    sget v7, Lnl4;->additional_notes:I

    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v7, "context.getString(L.string.additional_notes)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v3, v1}, LNq5;-><init>(Ljava/lang/String;Z)V

    sget v9, LVi4;->item_complaint_section_header:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v1, v6, [LG6;

    new-instance v3, LG6;

    const/4 v7, 0x0

    sget v8, LVi4;->item_additional_notes:I

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v3

    invoke-direct/range {v6 .. v11}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v3, v1, v5

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v1, LH6;

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v5, v1

    move-object v7, v2

    invoke-direct/range {v5 .. v10}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_2
    if-eqz p2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/persistence/ComplaintResolution;->getVehicleIdsInvolved()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v4, v0, LIq0;->b:Lom3;

    invoke-interface {v4, v2}, Lom3;->v(Ljava/util/List;)Lio/reactivex/k;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v4, LIq0$g;->g:LIq0$g;

    new-instance v5, LBq0;

    invoke-direct {v5, v4}, LBq0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v5}, Lio/reactivex/k;->q0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/k;->T(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v3

    :cond_0
    if-nez v3, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v3

    const-string v2, "just(emptyList())"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    new-instance v2, LIq0$f;

    invoke-direct {v2, p0, v1}, LIq0$f;-><init>(LIq0;Z)V

    new-instance v1, LCq0;

    invoke-direct {v1, v2}, LCq0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v1

    const-string v2, "private fun ComplaintAct\u2026stOf())\n      )\n    }\n  }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_3
    new-instance v2, LG6;

    new-instance v8, LNq5;

    iget-object v3, v0, LIq0;->a:Landroid/content/Context;

    sget v7, Lnl4;->action_taken:I

    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v7, "context.getString(L.string.action_taken)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v3, v1}, LNq5;-><init>(Ljava/lang/String;Z)V

    sget v9, LVi4;->item_complaint_section_header:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v1, v6, [LG6;

    new-instance v3, LG6;

    sget v8, LVi4;->item_action_taken:I

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v3

    move-object/from16 v7, p4

    invoke-direct/range {v6 .. v11}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v3, v1, v5

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v1, LH6;

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v5, v1

    move-object v7, v2

    invoke-direct/range {v5 .. v10}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_4
    new-instance v2, LG6;

    new-instance v6, LNq5;

    iget-object v3, v0, LIq0;->a:Landroid/content/Context;

    sget v4, Lnl4;->issues_check_all_that_apply:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "context.getString(L.stri\u2026ues_check_all_that_apply)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v3, v1}, LNq5;-><init>(Ljava/lang/String;Z)V

    sget v7, LVi4;->item_complaint_section_header:I

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;

    new-instance v11, LG6;

    if-eqz p2, :cond_2

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/persistence/ComplaintResolution;->getIssues()Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    :cond_3
    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    sget v7, LVi4;->item_issue:I

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v6

    new-instance v1, LH6;

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v5, v1

    move-object v7, v2

    invoke-direct/range {v5 .. v10}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    const-string v2, "just(\n        AdapterSec\u2026eList()\n        )\n      )"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_5
    new-instance v2, LH6;

    new-array v6, v6, [LG6;

    new-instance v13, LG6;

    new-instance v8, LAY5;

    iget-object v7, v0, LIq0;->a:Landroid/content/Context;

    sget v9, Lnl4;->after:I

    invoke-virtual {v7, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v9, "context.getString(L.string.after)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;->getField()Lco/bird/android/model/constant/ComplaintResolutionField;

    move-result-object v9

    if-eqz p2, :cond_5

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/persistence/ComplaintResolution;->getAfterPhotoUrl()Ljava/lang/String;

    move-result-object v3

    :cond_5
    invoke-direct {v8, v7, v1, v9, v3}, LAY5;-><init>(Ljava/lang/String;ZLco/bird/android/model/constant/ComplaintResolutionField;Ljava/lang/String;)V

    sget v9, LVi4;->item_take_photo:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v13

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v13, v6, v5

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_6
    new-instance v2, LH6;

    new-array v6, v6, [LG6;

    new-instance v13, LG6;

    new-instance v8, LAY5;

    iget-object v7, v0, LIq0;->a:Landroid/content/Context;

    sget v9, Lnl4;->before:I

    invoke-virtual {v7, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v9, "context.getString(L.string.before)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;->getField()Lco/bird/android/model/constant/ComplaintResolutionField;

    move-result-object v9

    if-eqz p2, :cond_6

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/persistence/ComplaintResolution;->getBeforePhotoUrl()Ljava/lang/String;

    move-result-object v3

    :cond_6
    invoke-direct {v8, v7, v1, v9, v3}, LAY5;-><init>(Ljava/lang/String;ZLco/bird/android/model/constant/ComplaintResolutionField;Ljava/lang/String;)V

    sget v9, LVi4;->item_take_photo:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v13

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v13, v6, v5

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Lco/bird/android/model/persistence/ComplaintResolution;Lco/bird/android/model/persistence/ComplaintResolutionForm;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ComplaintResolution;->getSituation()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lga2;->d:Lga2;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getActionTakenRequiredFields()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getNoActionTakenRequiredFields()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method
