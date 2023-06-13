.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$invoke$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1;->invoke(Lyo2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "LLn2;",
        "Ljava/lang/Integer;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "LLn2;",
        "",
        "it",
        "",
        "invoke",
        "(LLn2;ILEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,423:1\n295#2:424\n296#2:432\n36#3:425\n1057#4,6:426\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1\n*L\n295#1:425\n295#1:426,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty$inlined:I

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onInstitutionSelected$inlined:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$invoke$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$invoke$$inlined$items$default$4;->$onInstitutionSelected$inlined:Lkotlin/jvm/functions/Function2;

    iput p3, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$invoke$$inlined$items$default$4;->$$dirty$inlined:I

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLn2;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LEt0;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$invoke$$inlined$items$default$4;->invoke(LLn2;ILEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LLn2;ILEt0;I)V
    .locals 4

    const-string v0, "$this$items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x70

    const/16 v0, 0x20

    const/16 v1, 0x10

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, LEt0;->r(I)Z

    move-result p4

    if-eqz p4, :cond_2

    move p4, v0

    goto :goto_2

    :cond_2
    move p4, v1

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x2db

    const/16 v2, 0x92

    if-ne p4, v2, :cond_5

    invoke-interface {p3}, LEt0;->b()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LEt0;->k()V

    goto/16 :goto_7

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v2, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)"

    const v3, -0x25b7f321

    invoke-static {v3, p1, p4, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$invoke$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    and-int/lit8 p1, p1, 0xe

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const p4, -0x62b662bc

    invoke-interface {p3, p4}, LEt0;->F(I)V

    and-int/lit8 p4, p1, 0x70

    if-nez p4, :cond_8

    invoke-interface {p3, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_7

    goto :goto_4

    :cond_7
    move v0, v1

    :goto_4
    or-int/2addr p1, v0

    :cond_8
    and-int/lit16 p4, p1, 0x2d1

    const/16 v0, 0x90

    if-ne p4, v0, :cond_a

    invoke-interface {p3}, LEt0;->b()Z

    move-result p4

    if-nez p4, :cond_9

    goto :goto_5

    :cond_9
    invoke-interface {p3}, LEt0;->k()V

    goto :goto_6

    :cond_a
    :goto_5
    const p4, 0x44faf204

    invoke-interface {p3, p4}, LEt0;->F(I)V

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$invoke$$inlined$items$default$4;->$onInstitutionSelected$inlined:Lkotlin/jvm/functions/Function2;

    invoke-interface {p3, p4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p4

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_b

    sget-object p4, LEt0;->a:LEt0$a;

    invoke-virtual {p4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v0, p4, :cond_c

    :cond_b
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$4$1$1;

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$invoke$$inlined$items$default$4;->$onInstitutionSelected$inlined:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, p4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$4$1$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p3, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_c
    invoke-interface {p3}, LEt0;->Q()V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    and-int/lit8 p1, p1, 0x70

    invoke-static {v0, p2, p3, p1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->access$InstitutionResultTile(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;LEt0;I)V

    :goto_6
    invoke-interface {p3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-static {}, LQt0;->Y()V

    :cond_d
    :goto_7
    return-void
.end method
