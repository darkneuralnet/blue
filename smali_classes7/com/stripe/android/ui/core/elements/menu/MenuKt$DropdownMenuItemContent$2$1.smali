.class final Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/menu/MenuKt;->DropdownMenuItemContent(Lkotlin/jvm/functions/Function0;LgV2;ZLPD3;LrX2;Lkotlin/jvm/functions/Function3;LEt0;II)V
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

.field final synthetic $$dirty$1:I

.field final synthetic $content:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LZc5;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $this_Row:LZc5;


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function3;LZc5;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LZc5;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LZc5;",
            "II)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$enabled:Z

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$content:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$this_Row:LZc5;

    iput p4, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$$dirty:I

    iput p5, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$$dirty$1:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 6

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.ui.core.elements.menu.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:182)"

    const v2, -0x632d2502

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-boolean p2, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$enabled:Z

    if-eqz p2, :cond_3

    const p2, -0x6ceb98cc

    invoke-interface {p1, p2}, LEt0;->F(I)V

    sget-object p2, LWz0;->a:LWz0;

    sget v0, LWz0;->b:I

    invoke-virtual {p2, p1, v0}, LWz0;->c(LEt0;I)F

    move-result p2

    goto :goto_1

    :cond_3
    const p2, -0x6ceb98b5

    invoke-interface {p1, p2}, LEt0;->F(I)V

    sget-object p2, LWz0;->a:LWz0;

    sget v0, LWz0;->b:I

    invoke-virtual {p2, p1, v0}, LWz0;->b(LEt0;I)F

    move-result p2

    :goto_1
    invoke-interface {p1}, LEt0;->Q()V

    const/4 v0, 0x1

    new-array v1, v0, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v2, p2}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, v1, v2

    new-instance p2, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1$1;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$content:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$this_Row:LZc5;

    iget v4, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$$dirty:I

    iget v5, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1;->$$dirty$1:I

    invoke-direct {p2, v2, v3, v4, v5}, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuItemContent$2$1$1;-><init>(Lkotlin/jvm/functions/Function3;LZc5;II)V

    const v2, 0x78b19e3e

    invoke-static {p1, v2, v0, p2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object p2

    const/16 v0, 0x38

    invoke-static {v1, p2, p1, v0}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_2
    return-void
.end method
