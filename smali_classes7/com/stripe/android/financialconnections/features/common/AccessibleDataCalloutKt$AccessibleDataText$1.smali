.class final Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataText$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt;->AccessibleDataText(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Lkotlin/jvm/functions/Function0;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
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
.field final synthetic $model:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

.field final synthetic $onLearnMoreClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $uriHandler:LDf6;


# direct methods
.method public constructor <init>(LDf6;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDf6;",
            "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataText$1;->$uriHandler:LDf6;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataText$1;->$model:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataText$1;->$onLearnMoreClick:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataText$1;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataText$1;->$uriHandler:LDf6;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataText$1;->$model:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;->getDataPolicyUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, LDf6;->openUri(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataText$1;->$onLearnMoreClick:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method
