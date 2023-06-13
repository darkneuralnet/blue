.class final Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/menu/MenuKt;->DropdownMenuContent(LKX2;LEX2;ILgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
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


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $content:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lyo2;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $initialFirstVisibleItemIndex:I

.field final synthetic $modifier:LgV2;


# direct methods
.method public constructor <init>(IILgV2;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "LgV2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lyo2;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->$initialFirstVisibleItemIndex:I

    iput p2, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->$$dirty:I

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->$modifier:LgV2;

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->$content:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.ui.core.elements.menu.DropdownMenuContent.<anonymous> (Menu.kt:139)"

    const v5, 0x4ed996ef

    invoke-static {v5, v1, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget v1, v0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->$initialFirstVisibleItemIndex:I

    iget v2, v0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->$$dirty:I

    shr-int/lit8 v2, v2, 0x6

    and-int/lit8 v2, v2, 0xe

    const/4 v4, 0x0

    move-object/from16 v14, p1

    invoke-static {v1, v4, v14, v2, v3}, LDo2;->a(IILEt0;II)LCo2;

    move-result-object v6

    iget-object v1, v0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->$modifier:LgV2;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/menu/MenuKt;->getDropdownMenuVerticalPadding()F

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v5, v2, v3, v4}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    iget-object v13, v0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->$content:Lkotlin/jvm/functions/Function1;

    iget v1, v0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$2;->$$dirty:I

    shl-int/lit8 v1, v1, 0xc

    const/high16 v2, 0xe000000

    and-int v15, v1, v2

    const/16 v16, 0xfc

    invoke-static/range {v5 .. v16}, Lgn2;->a(LgV2;LCo2;LPD3;ZLlo$l;LK9$b;Lcu1;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
