.class final Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->DropDown(Lcom/stripe/android/uicore/elements/DropdownFieldController;ZLgV2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPm0;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
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
        "SMAP\nDropdownFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropdownFieldUI.kt\ncom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1864#2,3:245\n*S KotlinDebug\n*F\n+ 1 DropdownFieldUI.kt\ncom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5\n*L\n175#1:245,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $controller:Lcom/stripe/android/uicore/elements/DropdownFieldController;

.field final synthetic $currentTextColor:J

.field final synthetic $expanded$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedIndex$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;JLsP5;Lcom/stripe/android/uicore/elements/DropdownFieldController;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J",
            "LsP5<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$items:Ljava/util/List;

    iput-wide p2, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$currentTextColor:J

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$selectedIndex$delegate:LsP5;

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$controller:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$expanded$delegate:LEX2;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPm0;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p3

    const-string v2, "$this$DropdownMenu"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x51

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.DropDown.<anonymous>.<anonymous> (DropdownFieldUI.kt:173)"

    const v4, -0x6395a31f

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$items:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-wide v10, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$currentTextColor:J

    iget-object v12, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$selectedIndex$delegate:LsP5;

    iget-object v13, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$controller:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    iget-object v14, v0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->$expanded$delegate:LEX2;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v15, 0x0

    move v2, v15

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v16, v2, 0x1

    if-gez v2, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v3, Ljava/lang/String;

    invoke-static {v12}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->access$DropDown$lambda$1(LsP5;)I

    move-result v4

    if-ne v2, v4, :cond_4

    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    move v4, v15

    :goto_2
    new-instance v6, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;

    invoke-direct {v6, v13, v2, v14}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;-><init>(Lcom/stripe/android/uicore/elements/DropdownFieldController;ILEX2;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v3

    move v3, v4

    move-wide v4, v10

    move-object/from16 v7, p2

    invoke-static/range {v2 .. v9}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->DropdownMenuItem-cf5BqRc(Ljava/lang/String;ZJLkotlin/jvm/functions/Function0;LEt0;II)V

    move/from16 v2, v16

    goto :goto_1

    :cond_5
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_3
    return-void
.end method
