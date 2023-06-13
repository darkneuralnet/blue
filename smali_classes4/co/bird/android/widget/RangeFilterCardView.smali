.class public final Lco/bird/android/widget/RangeFilterCardView;
.super Landroidx/cardview/widget/CardView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010+\u001a\u00020*\u00a2\u0006\u0004\u0008,\u0010-B\u0019\u0008\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008,\u0010.B!\u0008\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\u0008,\u00101J\u0008\u0010\u0003\u001a\u00020\u0002H\u0014J\u0008\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0008\u0010\t\u001a\u00020\u0008H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R)\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u000f0\u000f0\u00168FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R0\u0010)\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\"8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(\u00a8\u00062"
    }
    d2 = {
        "Lco/bird/android/widget/RangeFilterCardView;",
        "Landroidx/cardview/widget/CardView;",
        "",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "Landroid/util/AttributeSet;",
        "attrs",
        "v",
        "Lio/reactivex/disposables/c;",
        "w",
        "Lco/bird/android/widget/RangeFilterView;",
        "k",
        "Lco/bird/android/widget/RangeFilterView;",
        "rangeFilterView",
        "La94;",
        "Lco/bird/android/model/persistence/OperatorOptionFilter;",
        "l",
        "La94;",
        "filtersRelay",
        "m",
        "Lio/reactivex/disposables/c;",
        "rangeChangeDisposable",
        "LZ84;",
        "kotlin.jvm.PlatformType",
        "n",
        "Lkotlin/Lazy;",
        "getFiltersPropertyObservable",
        "()LZ84;",
        "filtersPropertyObservable",
        "filter",
        "t",
        "()Lco/bird/android/model/persistence/OperatorOptionFilter;",
        "setFilter",
        "(Lco/bird/android/model/persistence/OperatorOptionFilter;)V",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
        "list",
        "u",
        "()Ljava/util/List;",
        "setOptions",
        "(Ljava/util/List;)V",
        "options",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "widget_release"
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
        "SMAP\nRangeFilterCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RangeFilterCardView.kt\nco/bird/android/widget/RangeFilterCardView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,89:1\n350#2,7:90\n378#2,7:98\n1#3:97\n52#4,2:105\n*S KotlinDebug\n*F\n+ 1 RangeFilterCardView.kt\nco/bird/android/widget/RangeFilterCardView\n*L\n52#1:90,7\n53#1:98,7\n74#1:105,2\n*E\n"
    }
.end annotation


# instance fields
.field public final k:Lco/bird/android/widget/RangeFilterView;

.field public final l:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/model/persistence/OperatorOptionFilter;",
            ">;"
        }
    .end annotation
.end field

.field public m:Lio/reactivex/disposables/c;

.field public final n:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lmk4;->view_range_filter_card:I

    const/4 v3, 0x1

    invoke-static {v2, v1, v0, v3}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LXf4;->activity_vertical_margin:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v2, v1}, Landroidx/cardview/widget/CardView;->setPadding(IIII)V

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, LDf4;->white:I

    invoke-static {v2, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v1, Lzi4;->rangeFilterView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(R.id.rangeFilterView)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lco/bird/android/widget/RangeFilterView;

    iput-object v1, v0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    sget-object v1, La94;->h:La94$a;

    new-instance v15, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x7fe

    const/16 v16, 0x0

    move-object v2, v15

    move-object v0, v15

    move-object/from16 v15, v16

    invoke-direct/range {v2 .. v15}, Lco/bird/android/model/persistence/OperatorOptionFilter;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lco/bird/android/widget/RangeFilterCardView;->l:La94;

    new-instance v0, Lco/bird/android/widget/RangeFilterCardView$a;

    invoke-direct {v0, v1}, Lco/bird/android/widget/RangeFilterCardView$a;-><init>(Lco/bird/android/widget/RangeFilterCardView;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, v1, Lco/bird/android/widget/RangeFilterCardView;->n:Lkotlin/Lazy;

    invoke-virtual {v1, v3}, Lco/bird/android/widget/RangeFilterCardView;->v(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "context"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "attrs"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p2}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lmk4;->view_range_filter_card:I

    const/4 v4, 0x1

    invoke-static {v3, v2, v0, v4}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LXf4;->activity_vertical_margin:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v3, v2}, Landroidx/cardview/widget/CardView;->setPadding(IIII)V

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, LDf4;->white:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v2, Lzi4;->rangeFilterView:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "findViewById(R.id.rangeFilterView)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lco/bird/android/widget/RangeFilterView;

    iput-object v2, v0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    sget-object v2, La94;->h:La94$a;

    new-instance v15, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x7fe

    const/16 v17, 0x0

    move-object v3, v15

    move-object/from16 v18, v15

    move/from16 v15, v16

    move-object/from16 v16, v17

    invoke-direct/range {v3 .. v16}, Lco/bird/android/model/persistence/OperatorOptionFilter;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    move-object/from16 v5, v18

    invoke-static {v2, v5, v3, v4, v3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/widget/RangeFilterCardView;->l:La94;

    new-instance v2, Lco/bird/android/widget/RangeFilterCardView$a;

    invoke-direct {v2, v0}, Lco/bird/android/widget/RangeFilterCardView$a;-><init>(Lco/bird/android/widget/RangeFilterCardView;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/widget/RangeFilterCardView;->n:Lkotlin/Lazy;

    invoke-virtual {v0, v1}, Lco/bird/android/widget/RangeFilterCardView;->v(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "context"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "attrs"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p3}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lmk4;->view_range_filter_card:I

    const/4 v4, 0x1

    invoke-static {v3, v2, v0, v4}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LXf4;->activity_vertical_margin:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v3, v2}, Landroidx/cardview/widget/CardView;->setPadding(IIII)V

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, LDf4;->white:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v2, Lzi4;->rangeFilterView:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "findViewById(R.id.rangeFilterView)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lco/bird/android/widget/RangeFilterView;

    iput-object v2, v0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    sget-object v2, La94;->h:La94$a;

    new-instance v15, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x7fe

    const/16 v17, 0x0

    move-object v3, v15

    move-object/from16 v18, v15

    move/from16 v15, v16

    move-object/from16 v16, v17

    invoke-direct/range {v3 .. v16}, Lco/bird/android/model/persistence/OperatorOptionFilter;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    move-object/from16 v5, v18

    invoke-static {v2, v5, v3, v4, v3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/widget/RangeFilterCardView;->l:La94;

    new-instance v2, Lco/bird/android/widget/RangeFilterCardView$a;

    invoke-direct {v2, v0}, Lco/bird/android/widget/RangeFilterCardView$a;-><init>(Lco/bird/android/widget/RangeFilterCardView;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/widget/RangeFilterCardView;->n:Lkotlin/Lazy;

    invoke-virtual {v0, v1}, Lco/bird/android/widget/RangeFilterCardView;->v(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getFiltersRelay$p(Lco/bird/android/widget/RangeFilterCardView;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/RangeFilterCardView;->l:La94;

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/RangeFilterCardView;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/RangeFilterCardView;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Lco/bird/android/widget/RangeFilterCardView;->w()Lio/reactivex/disposables/c;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/widget/RangeFilterCardView;->m:Lio/reactivex/disposables/c;

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lco/bird/android/widget/RangeFilterCardView;->m:Lio/reactivex/disposables/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    :cond_0
    return-void
.end method

.method public final setFilter(Lco/bird/android/model/persistence/OperatorOptionFilter;)V
    .locals 2

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/RangeFilterView;->setTitle(Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeFilterCardView;->setOptions(Ljava/util/List;)V

    return-void
.end method

.method public final setOptions(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v4, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    const/4 v5, 0x0

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, v5

    :goto_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_4

    :cond_4
    move v0, v1

    :goto_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/ListIterator;->nextIndex()I

    move-result v2

    goto :goto_5

    :cond_6
    move v2, v4

    :goto_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    if-eq v6, v4, :cond_7

    if-eq v6, v0, :cond_7

    move v1, v3

    :cond_7
    if-eqz v1, :cond_8

    move-object v5, v2

    :cond_8
    if-eqz v5, :cond_9

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_6

    :cond_9
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v1

    :goto_6
    iget-object v2, p0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/RangeFilterView;->setMinLabel(Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/RangeFilterView;->setMaxLabel(Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v2, p1}, Lco/bird/android/widget/RangeFilterView;->setNumSteps(I)V

    iget-object p1, p0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-virtual {p1, v0, v1}, Lco/bird/android/widget/RangeFilterView;->setSelectedIndices(II)V

    return-void
.end method

.method public final t()Lco/bird/android/model/persistence/OperatorOptionFilter;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type co.bird.android.model.persistence.OperatorOptionFilter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/RangeFilterCardView;->u()Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x7df

    const/16 v16, 0x0

    invoke-static/range {v3 .. v16}, Lco/bird/android/model/persistence/OperatorOptionFilter;->copy$default(Lco/bird/android/model/persistence/OperatorOptionFilter;Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILjava/lang/Object;)Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-result-object v1

    return-object v1
.end method

.method public final u()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type co.bird.android.model.persistence.OperatorOptionFilter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final v(Landroid/util/AttributeSet;)V
    .locals 0

    return-void
.end method

.method public final w()Lio/reactivex/disposables/c;
    .locals 4

    sget-object v0, Lee3;->a:Lee3;

    iget-object v0, p0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-virtual {v0}, Lco/bird/android/widget/RangeFilterView;->e()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/widget/RangeFilterCardView;->k:Lco/bird/android/widget/RangeFilterView;

    invoke-virtual {v1}, Lco/bird/android/widget/RangeFilterView;->d()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/widget/RangeFilterCardView$b;->a:Lco/bird/android/widget/RangeFilterCardView$b;

    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/widget/RangeFilterCardView$c;

    invoke-direct {v1, p0}, Lco/bird/android/widget/RangeFilterCardView$c;-><init>(Lco/bird/android/widget/RangeFilterCardView;)V

    new-instance v2, Lgn4;

    invoke-direct {v2, v1}, Lgn4;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/widget/RangeFilterCardView$d;->g:Lco/bird/android/widget/RangeFilterCardView$d;

    new-instance v3, Lhn4;

    invoke-direct {v3, v1}, Lhn4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object v0

    const-string v1, "private fun listenForRan\u2026)\n      }, {\n      })\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
