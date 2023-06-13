.class final Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V
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
        "SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\ncom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,39:1\n76#2:40\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\ncom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1\n*L\n29#1:40\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $content:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $navController:LOY2;

.field final synthetic $reducedBrandingOverride:Z


# direct methods
.method public constructor <init>(LOY2;ZLkotlin/jvm/functions/Function2;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOY2;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;->$navController:LOY2;

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;->$reducedBrandingOverride:Z

    iput-object p3, p0, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;->$content:Lkotlin/jvm/functions/Function2;

    iput p4, p0, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;->$$dirty:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

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

    const-string v2, "com.stripe.android.financialconnections.ui.FinancialConnectionsPreview.<anonymous> (CompositionLocal.kt:23)"

    const v3, -0x793d421e

    invoke-static {v3, p2, v0, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 p2, 0x3

    new-array p2, p2, [LW94;

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalNavHostController()LU94;

    move-result-object v0

    iget-object v2, p0, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;->$navController:LOY2;

    invoke-virtual {v0, v2}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, p2, v2

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalReducedBranding()LU94;

    move-result-object v0

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;->$reducedBrandingOverride:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, p2, v2

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()LU94;

    move-result-object v0

    new-instance v8, Lcom/stripe/android/uicore/image/StripeImageLoader;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {p1, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/content/Context;

    sget-object v2, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/core/Logger$Companion;->noop()Lcom/stripe/android/core/Logger;

    move-result-object v4

    const/4 v5, 0x0

    new-instance v6, Lcom/stripe/android/uicore/image/NetworkImageDecoder;

    invoke-direct {v6}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;-><init>()V

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/uicore/image/StripeImageLoader;-><init>(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;)V

    invoke-virtual {v0, v8}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    aput-object v0, p2, v1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;->$content:Lkotlin/jvm/functions/Function2;

    iget v1, p0, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;->$$dirty:I

    and-int/lit8 v1, v1, 0x70

    or-int/lit8 v1, v1, 0x8

    invoke-static {p2, v0, p1, v1}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
