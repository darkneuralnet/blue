.class final Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt;
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
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "(LEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 25

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.partnerauth.ComposableSingletons$PartnerAuthScreenKt.lambda-2.<anonymous> (PartnerAuthScreen.kt:453)"

    const v4, 0x6456d261

    invoke-static {v4, v0, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    new-instance v0, LwT5;

    new-instance v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v4, 0x1

    const-string v5, "id"

    const/4 v6, 0x0

    const-string v7, "name"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v11, "url"

    move-object v3, v1

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    sget-object v15, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    sget-object v14, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v3, Lcom/stripe/android/financialconnections/domain/Display;

    new-instance v4, Lcom/stripe/android/financialconnections/domain/Text;

    new-instance v6, Lcom/stripe/android/financialconnections/domain/Body;

    const/4 v5, 0x5

    new-array v5, v5, [Lcom/stripe/android/financialconnections/domain/Entry;

    new-instance v7, Lcom/stripe/android/financialconnections/domain/Entry$Text;

    const-string v8, "Some very large text will most likely go here!Some very large text will most likely go here!"

    invoke-direct {v7, v8}, Lcom/stripe/android/financialconnections/domain/Entry$Text;-><init>(Ljava/lang/String;)V

    const/4 v13, 0x0

    aput-object v7, v5, v13

    new-instance v7, Lcom/stripe/android/financialconnections/domain/Entry$Image;

    new-instance v8, Lcom/stripe/android/financialconnections/model/Image;

    const-string v9, "https://b.stripecdn.com/connections-statics-srv/assets/PrepaneAsset--account_numbers-capitalone-2x.gif"

    invoke-direct {v8, v9}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    invoke-direct {v7, v8}, Lcom/stripe/android/financialconnections/domain/Entry$Image;-><init>(Lcom/stripe/android/financialconnections/model/Image;)V

    const/4 v8, 0x1

    aput-object v7, v5, v8

    new-instance v7, Lcom/stripe/android/financialconnections/domain/Entry$Text;

    const-string v8, "Some very large text will most likely go here!"

    invoke-direct {v7, v8}, Lcom/stripe/android/financialconnections/domain/Entry$Text;-><init>(Ljava/lang/String;)V

    aput-object v7, v5, v2

    new-instance v2, Lcom/stripe/android/financialconnections/domain/Entry$Text;

    invoke-direct {v2, v8}, Lcom/stripe/android/financialconnections/domain/Entry$Text;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x3

    aput-object v2, v5, v7

    new-instance v2, Lcom/stripe/android/financialconnections/domain/Entry$Text;

    invoke-direct {v2, v8}, Lcom/stripe/android/financialconnections/domain/Entry$Text;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x4

    aput-object v2, v5, v7

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v6, v2}, Lcom/stripe/android/financialconnections/domain/Body;-><init>(Ljava/util/List;)V

    new-instance v7, Lcom/stripe/android/financialconnections/domain/Cta;

    const-string v2, "Continue!"

    const/4 v12, 0x0

    invoke-direct {v7, v12, v2}, Lcom/stripe/android/financialconnections/domain/Cta;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    new-instance v8, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v8, v9}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    new-instance v5, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v5, v9}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    const-string v9, "Stripe works with partners like MX to reliably offer access to thousands of financial institutions. Learn more"

    invoke-direct {v2, v5, v9}, Lcom/stripe/android/financialconnections/domain/PartnerNotice;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    new-instance v11, Lcom/stripe/android/financialconnections/domain/OauthPrepane;

    const-string v16, "Sign in with Sample bank"

    const/16 v17, 0x10

    const/16 v18, 0x0

    move-object v5, v11

    move-object v9, v2

    move-object v2, v11

    move-object/from16 v11, v16

    move/from16 v12, v17

    move-object/from16 p2, v0

    move v0, v13

    move-object/from16 v13, v18

    invoke-direct/range {v5 .. v13}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;-><init>(Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v2}, Lcom/stripe/android/financialconnections/domain/Text;-><init>(Lcom/stripe/android/financialconnections/domain/OauthPrepane;)V

    invoke-direct {v3, v4}, Lcom/stripe/android/financialconnections/domain/Display;-><init>(Lcom/stripe/android/financialconnections/domain/Text;)V

    new-instance v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    const-string v13, "1234"

    const/16 v16, 0x0

    sget-object v21, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0xe8

    const/16 v24, 0x0

    move-object v12, v2

    move-object/from16 v17, v21

    move-object/from16 v22, v3

    invoke-direct/range {v12 .. v24}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;

    invoke-direct {v3, v0, v1, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;-><init>(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    move-object/from16 v0, p2

    invoke-direct {v0, v3}, LwT5;-><init>(Ljava/lang/Object;)V

    sget-object v1, LMd6;->e:LMd6;

    new-instance v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;-><init>(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;Ldp;)V

    sget-object v4, LHU2;->b:LHU2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x6

    move-object/from16 v7, p1

    invoke-static/range {v4 .. v9}, LFU2;->n(LHU2;Llf;Lkotlin/jvm/functions/Function1;LEt0;II)LGU2;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$1;

    sget-object v5, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$2;

    sget-object v6, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$3;

    sget-object v7, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$4;

    sget-object v8, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$5;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$5;

    sget-object v9, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$6;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$6;

    sget-object v10, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$7;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt$lambda-2$1$7;

    const v12, 0x6db6d88

    move-object/from16 v11, p1

    invoke-static/range {v2 .. v12}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->access$PartnerAuthScreenContent(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
