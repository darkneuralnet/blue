.class final Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI(ZLcom/stripe/android/uicore/elements/OTPElement;LgV2;Lcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/ui/focus/h;LEt0;II)V
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
        "SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,257:1\n154#2:258\n67#3,3:259\n66#3:262\n36#3:269\n1057#4,6:263\n1057#4,6:270\n76#5:276\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1\n*L\n135#1:258\n136#1:259,3\n136#1:262\n156#1:269\n136#1:263,6\n156#1:270,6\n133#1:276\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

.field final synthetic $element:Lcom/stripe/android/uicore/elements/OTPElement;

.field final synthetic $enabled:Z

.field final synthetic $focusManager:LBv1;

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/h;

.field final synthetic $focusedElementIndex$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $index:I

.field final synthetic $isSelected:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/OTPElement;ILEX2;ZLandroidx/compose/ui/focus/h;LBv1;ZLcom/stripe/android/uicore/elements/OTPElementColors;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/OTPElement;",
            "I",
            "LEX2<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Landroidx/compose/ui/focus/h;",
            "LBv1;",
            "Z",
            "Lcom/stripe/android/uicore/elements/OTPElementColors;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    iput p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusedElementIndex$delegate:LEX2;

    iput-boolean p4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$isSelected:Z

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusRequester:Landroidx/compose/ui/focus/h;

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusManager:LBv1;

    iput-boolean p7, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$enabled:Z

    iput-object p8, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    iput p9, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$$dirty:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$0(LsP5;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke$lambda$0(LsP5;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$0(LsP5;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 11

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.uicore.elements.OTPElementUI.<anonymous>.<anonymous>.<anonymous> (OTPElementUI.kt:131)"

    const v2, -0x1886f5a

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/OTPController;->getFieldValues$stripe_ui_core_release()Ljava/util/List;

    move-result-object p2

    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, LEu1;

    const-string v1, ""

    const/4 v2, 0x0

    const/16 v4, 0x38

    const/4 v5, 0x2

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object p2

    sget-object v0, LgV2;->b0:LgV2$a;

    const/16 v1, 0x38

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v0, v1}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusedElementIndex$delegate:LEX2;

    iget v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-boolean v3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$isSelected:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget v4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    iget-boolean v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$isSelected:Z

    iget-object v6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusedElementIndex$delegate:LEX2;

    const v7, 0x607fb4c4

    invoke-interface {p1, v7}, LEt0;->F(I)V

    invoke-interface {p1, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_4

    :cond_3
    new-instance v2, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;

    invoke-direct {v2, v4, v5, v6}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;-><init>(IZLEX2;)V

    invoke-interface {p1, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Landroidx/compose/ui/focus/b;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2;

    iget v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusManager:LBv1;

    iget-object v4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-direct {v1, v2, v3, v4, p2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2;-><init>(ILBv1;Lcom/stripe/android/uicore/elements/OTPElement;LsP5;)V

    invoke-static {v0, v1}, Lqk2;->b(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    const v3, 0x44faf204

    invoke-interface {p1, v3}, LEt0;->F(I)V

    invoke-interface {p1, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_5

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_6

    :cond_5
    new-instance v3, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$3$1;

    invoke-direct {v3, v2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$3$1;-><init>(I)V

    invoke-interface {p1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v4, v3, v1, v2}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusRequester:Landroidx/compose/ui/focus/h;

    invoke-static {v0, v1}, Landroidx/compose/ui/focus/i;->a(LgV2;Landroidx/compose/ui/focus/h;)LgV2;

    move-result-object v0

    :cond_7
    move-object v6, v0

    invoke-static {p2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke$lambda$0(LsP5;)Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$isSelected:Z

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    iget v4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    iget-object v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusManager:LBv1;

    iget-boolean v7, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$enabled:Z

    iget-object v8, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    iget p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$$dirty:I

    shl-int/lit8 v0, p2, 0x12

    const/high16 v9, 0x380000

    and-int/2addr v0, v9

    const v9, 0x8200

    or-int/2addr v0, v9

    shl-int/lit8 p2, p2, 0xc

    const/high16 v9, 0x1c00000

    and-int/2addr p2, v9

    or-int v10, v0, p2

    move-object v9, p1

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->access$OTPInputBox(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    :goto_1
    return-void
.end method
