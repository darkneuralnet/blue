.class public final Lee0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lee0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007B\u0011\u0008\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lee0;",
        "",
        "Lio/reactivex/F;",
        "",
        "LH6;",
        "b",
        "Landroid/content/Context;",
        "a",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
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
        "SMAP\nCantRepairConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CantRepairConverter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/adapters/CantRepairConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1549#2:67\n1620#2,3:68\n1#3:71\n*S KotlinDebug\n*F\n+ 1 CantRepairConverter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/adapters/CantRepairConverter\n*L\n29#1:67\n29#1:68,3\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Lee0$a;

.field public static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/IssueStatus;",
            "Lco/bird/android/model/constant/IssueStatusReason;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lee0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lee0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lee0;->b:Lee0$a;

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    sget-object v2, Lco/bird/android/model/IssueStatus;->CANT_REPAIR:Lco/bird/android/model/IssueStatus;

    sget-object v3, Lco/bird/android/model/constant/IssueStatusReason;->PROCESS_OR_KNOWLEDGE:Lco/bird/android/model/constant/IssueStatusReason;

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v0, v4

    sget-object v3, Lco/bird/android/model/constant/IssueStatusReason;->TOOLS_AND_PARTS:Lco/bird/android/model/constant/IssueStatusReason;

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    sget-object v2, Lco/bird/android/model/IssueStatus;->OPEN:Lco/bird/android/model/IssueStatus;

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lee0;->c:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lee0;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lee0;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lee0;->c(Lee0;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lee0;)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lee0;->c:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

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

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Pair;

    invoke-virtual {v3}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/IssueStatus;

    invoke-virtual {v3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/constant/IssueStatusReason;

    sget-object v5, Lco/bird/android/model/IssueStatus;->CANT_REPAIR:Lco/bird/android/model/IssueStatus;

    if-ne v4, v5, :cond_0

    sget-object v6, Lco/bird/android/model/constant/IssueStatusReason;->PROCESS_OR_KNOWLEDGE:Lco/bird/android/model/constant/IssueStatusReason;

    if-ne v3, v6, :cond_0

    sget v5, Lrg4;->ic_question_circle:I

    sget v6, Lnl4;->repair_cant_repair_reason_process_knowledge:I

    goto :goto_1

    :cond_0
    if-ne v4, v5, :cond_1

    sget-object v5, Lco/bird/android/model/constant/IssueStatusReason;->TOOLS_AND_PARTS:Lco/bird/android/model/constant/IssueStatusReason;

    if-ne v3, v5, :cond_1

    sget v5, Lrg4;->ic_handlebars:I

    sget v6, Lnl4;->repair_cant_repair_reason_spare_parts:I

    goto :goto_1

    :cond_1
    sget-object v5, Lco/bird/android/model/IssueStatus;->OPEN:Lco/bird/android/model/IssueStatus;

    if-ne v4, v5, :cond_2

    sget v5, Lrg4;->ic_wrench:I

    sget v6, Lnl4;->repair_cant_repair_reason_repair:I

    goto :goto_1

    :cond_2
    sget v5, Lrg4;->ic_wrench:I

    sget v6, Lnl4;->repair_cant_repair_reason_repair:I

    :goto_1
    iget-object v7, v0, Lee0;->a:Landroid/content/Context;

    invoke-static {v7, v5}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v7, v0, Lee0;->a:Landroid/content/Context;

    invoke-virtual {v7, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lua2;

    const-string v7, "getString(descriptionRes)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v4, v3, v6, v5}, Lua2;-><init>(Lco/bird/android/model/IssueStatus;Lco/bird/android/model/constant/IssueStatusReason;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    new-instance v3, LG6;

    sget v9, LEj4;->item_cant_repair_option:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v3

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v14

    new-instance v0, LH6;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x6

    const/16 v18, 0x0

    move-object v13, v0

    invoke-direct/range {v13 .. v18}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final b()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lde0;

    invoke-direct {v0, p0}, Lde0;-><init>(Lee0;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "fromCallable {\n      STA\u2026erSection(items)) }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
