.class final Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->SuccessLoaded(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
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
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $accessibleDataModel:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

.field final synthetic $accounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $businessName:Ljava/lang/String;

.field final synthetic $disconnectUrl:Ljava/lang/String;

.field final synthetic $institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field final synthetic $loading:Z

.field final synthetic $onDisconnectLinkClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDoneClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onLearnMoreAboutDataAccessClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onLinkAnotherAccountClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scrollState:LXp5;

.field final synthetic $showLinkAnotherAccount:Z


# direct methods
.method public constructor <init>(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXp5;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$scrollState:LXp5;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$businessName:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$accounts:Ljava/util/List;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$accessibleDataModel:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$disconnectUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iput-boolean p7, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$loading:Z

    iput-boolean p8, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$showLinkAnotherAccount:Z

    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$onLearnMoreAboutDataAccessClick:Lkotlin/jvm/functions/Function0;

    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$onDisconnectLinkClick:Lkotlin/jvm/functions/Function0;

    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$onLinkAnotherAccountClick:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$onDoneClick:Lkotlin/jvm/functions/Function0;

    iput p13, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$$changed:I

    iput p14, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$$changed1:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$scrollState:LXp5;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$businessName:Ljava/lang/String;

    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$accounts:Ljava/util/List;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$accessibleDataModel:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    iget-object v5, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$disconnectUrl:Ljava/lang/String;

    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-boolean v7, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$loading:Z

    iget-boolean v8, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$showLinkAnotherAccount:Z

    iget-object v9, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$onLearnMoreAboutDataAccessClick:Lkotlin/jvm/functions/Function0;

    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$onDisconnectLinkClick:Lkotlin/jvm/functions/Function0;

    iget-object v11, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$onLinkAnotherAccountClick:Lkotlin/jvm/functions/Function0;

    iget-object v12, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$onDoneClick:Lkotlin/jvm/functions/Function0;

    iget v13, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$$changed:I

    or-int/lit8 v14, v13, 0x1

    iget v15, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;->$$changed1:I

    move-object/from16 v13, p1

    invoke-static/range {v1 .. v15}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->access$SuccessLoaded(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    return-void
.end method
