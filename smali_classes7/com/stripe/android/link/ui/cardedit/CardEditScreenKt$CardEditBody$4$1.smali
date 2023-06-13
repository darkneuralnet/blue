.class final Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->invoke(LPm0;LEt0;I)V
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCardEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,193:1\n154#2:194\n*S KotlinDebug\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1\n*L\n140#1:194\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $$dirty$1:I

.field final synthetic $formContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $isDefault:Z

.field final synthetic $isProcessing:Z

.field final synthetic $onSetAsDefaultClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $setAsDefaultChecked:Z

.field final synthetic $this_ScrollableTopLevelColumn:LPm0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;LPm0;IIZZZLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LPm0;",
            "IIZZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$formContent:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$this_ScrollableTopLevelColumn:LPm0;

    iput p3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$$dirty:I

    iput p4, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$$dirty$1:I

    iput-boolean p5, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$setAsDefaultChecked:Z

    iput-boolean p6, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$isDefault:Z

    iput-boolean p7, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$isProcessing:Z

    iput-object p8, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$onSetAsDefaultClick:Lkotlin/jvm/functions/Function1;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 7

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.cardedit.CardEditBody.<anonymous>.<anonymous> (CardEditScreen.kt:136)"

    const v2, -0x1c35d105

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$formContent:Lkotlin/jvm/functions/Function3;

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$this_ScrollableTopLevelColumn:LPm0;

    iget v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$$dirty:I

    and-int/lit8 v1, v1, 0xe

    iget v2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$$dirty$1:I

    shr-int/lit8 v2, v2, 0x15

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, LgV2;->b0:LgV2$a;

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {p2, v0}, LBB5;->o(LgV2;F)LgV2;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LDN5;->a(LgV2;LEt0;I)V

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$setAsDefaultChecked:Z

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$isDefault:Z

    iget-boolean v3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$isProcessing:Z

    iget-object v4, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$onSetAsDefaultClick:Lkotlin/jvm/functions/Function1;

    iget p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;->$$dirty$1:I

    shr-int/lit8 v5, p2, 0x6

    and-int/lit8 v5, v5, 0xe

    and-int/lit8 v6, p2, 0x70

    or-int/2addr v5, v6

    shl-int/lit8 v6, p2, 0x6

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v5, v6

    shr-int/2addr p2, v0

    and-int/lit16 p2, p2, 0x1c00

    or-int v6, v5, p2

    move-object v5, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->access$DefaultPaymentMethodCheckbox(ZZZLkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
