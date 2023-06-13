.class public final Lco/bird/android/widget/MultiSelectFilterView;
.super Landroidx/cardview/widget/CardView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\r\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u00104\u001a\u000203\u00a2\u0006\u0004\u00085\u00106B\u0019\u0008\u0016\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u00085\u00107B!\u0008\u0016\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u00109\u001a\u000208\u00a2\u0006\u0004\u00085\u0010:J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R)\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0019*\u0004\u0018\u00010\u00140\u00140\u00188FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00148F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R(\u0010*\u001a\u0004\u0018\u00010$2\u0008\u0010%\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R0\u00102\u001a\u0008\u0012\u0004\u0012\u00020,0+2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0+8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101\u00a8\u0006;"
    }
    d2 = {
        "Lco/bird/android/widget/MultiSelectFilterView;",
        "Landroidx/cardview/widget/CardView;",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "t",
        "Landroid/widget/CompoundButton;",
        "checkBox",
        "",
        "isChecked",
        "u",
        "Landroid/widget/TextView;",
        "k",
        "Landroid/widget/TextView;",
        "headerText",
        "Landroid/widget/LinearLayout;",
        "l",
        "Landroid/widget/LinearLayout;",
        "optionsContainer",
        "La94;",
        "Lco/bird/android/model/persistence/OperatorOptionFilter;",
        "m",
        "La94;",
        "filtersRelay",
        "LZ84;",
        "kotlin.jvm.PlatformType",
        "n",
        "Lkotlin/Lazy;",
        "getFiltersPropertyObservable",
        "()LZ84;",
        "filtersPropertyObservable",
        "filter",
        "r",
        "()Lco/bird/android/model/persistence/OperatorOptionFilter;",
        "setFilter",
        "(Lco/bird/android/model/persistence/OperatorOptionFilter;)V",
        "",
        "value",
        "getTitle",
        "()Ljava/lang/CharSequence;",
        "setTitle",
        "(Ljava/lang/CharSequence;)V",
        "title",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
        "list",
        "s",
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
        "SMAP\nMultiSelectFilterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiSelectFilterView.kt\nco/bird/android/widget/MultiSelectFilterView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1855#2,2:112\n1549#2:114\n1620#2,3:115\n*S KotlinDebug\n*F\n+ 1 MultiSelectFilterView.kt\nco/bird/android/widget/MultiSelectFilterView\n*L\n74#1:112,2\n99#1:114\n99#1:115,3\n*E\n"
    }
.end annotation


# instance fields
.field public final k:Landroid/widget/TextView;

.field public final l:Landroid/widget/LinearLayout;

.field public final m:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/model/persistence/OperatorOptionFilter;",
            ">;"
        }
    .end annotation
.end field

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

    sget v1, Lmk4;->view_multi_select_filter:I

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

    sget v1, Lzi4;->headerText:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(R.id.headerText)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lco/bird/android/widget/MultiSelectFilterView;->k:Landroid/widget/TextView;

    sget v1, Lzi4;->options:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(R.id.options)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v0, Lco/bird/android/widget/MultiSelectFilterView;->l:Landroid/widget/LinearLayout;

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

    iput-object v0, v1, Lco/bird/android/widget/MultiSelectFilterView;->m:La94;

    new-instance v0, Lco/bird/android/widget/MultiSelectFilterView$a;

    invoke-direct {v0, v1}, Lco/bird/android/widget/MultiSelectFilterView$a;-><init>(Lco/bird/android/widget/MultiSelectFilterView;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, v1, Lco/bird/android/widget/MultiSelectFilterView;->n:Lkotlin/Lazy;

    invoke-virtual {v1, v3}, Lco/bird/android/widget/MultiSelectFilterView;->t(Landroid/util/AttributeSet;)V

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

    sget v2, Lmk4;->view_multi_select_filter:I

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

    sget v2, Lzi4;->headerText:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "findViewById(R.id.headerText)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v0, Lco/bird/android/widget/MultiSelectFilterView;->k:Landroid/widget/TextView;

    sget v2, Lzi4;->options:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "findViewById(R.id.options)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, v0, Lco/bird/android/widget/MultiSelectFilterView;->l:Landroid/widget/LinearLayout;

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

    iput-object v2, v0, Lco/bird/android/widget/MultiSelectFilterView;->m:La94;

    new-instance v2, Lco/bird/android/widget/MultiSelectFilterView$a;

    invoke-direct {v2, v0}, Lco/bird/android/widget/MultiSelectFilterView$a;-><init>(Lco/bird/android/widget/MultiSelectFilterView;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/widget/MultiSelectFilterView;->n:Lkotlin/Lazy;

    invoke-virtual {v0, v1}, Lco/bird/android/widget/MultiSelectFilterView;->t(Landroid/util/AttributeSet;)V

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

    sget v2, Lmk4;->view_multi_select_filter:I

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

    sget v2, Lzi4;->headerText:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "findViewById(R.id.headerText)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v0, Lco/bird/android/widget/MultiSelectFilterView;->k:Landroid/widget/TextView;

    sget v2, Lzi4;->options:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "findViewById(R.id.options)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, v0, Lco/bird/android/widget/MultiSelectFilterView;->l:Landroid/widget/LinearLayout;

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

    iput-object v2, v0, Lco/bird/android/widget/MultiSelectFilterView;->m:La94;

    new-instance v2, Lco/bird/android/widget/MultiSelectFilterView$a;

    invoke-direct {v2, v0}, Lco/bird/android/widget/MultiSelectFilterView$a;-><init>(Lco/bird/android/widget/MultiSelectFilterView;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/widget/MultiSelectFilterView;->n:Lkotlin/Lazy;

    invoke-virtual {v0, v1}, Lco/bird/android/widget/MultiSelectFilterView;->t(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getFiltersRelay$p(Lco/bird/android/widget/MultiSelectFilterView;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/MultiSelectFilterView;->m:La94;

    return-object p0
.end method

.method public static final synthetic access$onFilterUiUpdated(Lco/bird/android/widget/MultiSelectFilterView;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/MultiSelectFilterView;->u(Landroid/widget/CompoundButton;Z)V

    return-void
.end method


# virtual methods
.method public final r()Lco/bird/android/model/persistence/OperatorOptionFilter;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/widget/MultiSelectFilterView;->k:Landroid/widget/TextView;

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

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/MultiSelectFilterView;->s()Ljava/util/List;

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

.method public final s()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/widget/MultiSelectFilterView;->l:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lgr6;->b(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    move-result-object v0

    sget-object v1, Lco/bird/android/widget/MultiSelectFilterView$b;->g:Lco/bird/android/widget/MultiSelectFilterView$b;

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final setFilter(Lco/bird/android/model/persistence/OperatorOptionFilter;)V
    .locals 1

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/MultiSelectFilterView;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/MultiSelectFilterView;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/MultiSelectFilterView;->setOptions(Ljava/util/List;)V

    return-void
.end method

.method public final setOptions(Ljava/util/List;)V
    .locals 4
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

    iget-object v0, p0, Lco/bird/android/widget/MultiSelectFilterView;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lmk4;->item_multi_select_filter_checkbox:I

    iget-object v3, p0, Lco/bird/android/widget/MultiSelectFilterView;->l:Landroid/widget/LinearLayout;

    invoke-static {v1, v2, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object v1, p0, Lco/bird/android/widget/MultiSelectFilterView;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, Lgr6;->a(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.widget.CheckBox"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    new-instance v0, Lco/bird/android/widget/MultiSelectFilterView$c;

    invoke-direct {v0, p0}, Lco/bird/android/widget/MultiSelectFilterView$c;-><init>(Lco/bird/android/widget/MultiSelectFilterView;)V

    invoke-static {v1, v0}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/MultiSelectFilterView;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final t(Landroid/util/AttributeSet;)V
    .locals 0

    return-void
.end method

.method public final u(Landroid/widget/CompoundButton;Z)V
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x37

    const/4 v12, 0x0

    move/from16 v8, p2

    invoke-static/range {v4 .. v12}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->copy$default(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;ZLco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v3

    :cond_1
    move-object/from16 v1, p1

    invoke-virtual {v1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    if-eqz v3, :cond_4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/MultiSelectFilterView;->r()Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/MultiSelectFilterView;->r()Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    move-object v2, v3

    :cond_2
    invoke-interface {v10, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7df

    const/16 v17, 0x0

    invoke-static/range {v4 .. v17}, Lco/bird/android/model/persistence/OperatorOptionFilter;->copy$default(Lco/bird/android/model/persistence/OperatorOptionFilter;Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILjava/lang/Object;)Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/MultiSelectFilterView;->setFilter(Lco/bird/android/model/persistence/OperatorOptionFilter;)V

    :cond_4
    iget-object v1, v0, Lco/bird/android/widget/MultiSelectFilterView;->m:La94;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/MultiSelectFilterView;->r()Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-result-object v2

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method
