.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmB1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LmB1<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
    message = "This synthesized declaration should not be used directly"
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = ""
        imports = {}
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "com/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest.$serializer",
        "LmB1;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "",
        "LKj2;",
        "childSerializers",
        "()[LKj2;",
        "LGV0;",
        "decoder",
        "deserialize",
        "Lrb1;",
        "encoder",
        "value",
        "",
        "serialize",
        "LMs5;",
        "getDescriptor",
        "()LMs5;",
        "descriptor",
        "<init>",
        "()V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;

.field private static final synthetic descriptor:LAW3;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;

    new-instance v1, LAW3;

    const-string v2, "com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest"

    const/16 v3, 0x2a

    invoke-direct {v1, v2, v0, v3}, LAW3;-><init>(Ljava/lang/String;LmB1;I)V

    const-string v0, "allow_manual_entry"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "consent_required"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "custom_manual_entry_handling"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "disable_link_more_accounts"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "id"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "instant_verification_disabled"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "institution_search_disabled"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "livemode"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "manual_entry_uses_microdeposits"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "mobile_handoff_enabled"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "next_pane"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "manual_entry_mode"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "permissions"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "product"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "single_account"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "use_single_sort_search"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "account_disconnection_method"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "accountholder_customer_email_address"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "accountholder_is_link_consumer"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "accountholder_phone_number"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "accountholder_token"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "active_auth_session"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "active_institution"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "assignment_event_id"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "business_name"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "cancel_url"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "connect_platform_name"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "connected_account_name"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "experiment_assignments"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "features"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "hosted_auth_url"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "initial_institution"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "is_end_user_facing"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "is_link_with_stripe"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "is_networking_user_flow"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "is_stripe_direct"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "link_account_session_cancellation_behavior"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "modal_customization"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "payment_method_type"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "step_up_authentication_required"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "success_url"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "skip_success_pane"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    sput-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->descriptor:LAW3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[LKj2;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LKj2<",
            "*>;"
        }
    .end annotation

    const/16 v0, 0x2a

    new-array v0, v0, [LKj2;

    sget-object v1, LYY;->a:LYY;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v2, LgS5;->a:LgS5;

    const/4 v3, 0x4

    aput-object v2, v0, v3

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const/4 v3, 0x7

    aput-object v1, v0, v3

    const/16 v3, 0x8

    aput-object v1, v0, v3

    const/16 v3, 0x9

    aput-object v1, v0, v3

    const/16 v3, 0xa

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;

    aput-object v4, v0, v3

    const/16 v3, 0xb

    sget-object v4, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    aput-object v4, v0, v3

    new-instance v3, Lro;

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;

    invoke-direct {v3, v4}, Lro;-><init>(LKj2;)V

    const/16 v4, 0xc

    aput-object v3, v0, v4

    const/16 v3, 0xd

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;

    aput-object v4, v0, v3

    const/16 v3, 0xe

    aput-object v1, v0, v3

    const/16 v3, 0xf

    aput-object v1, v0, v3

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;

    invoke-static {v3}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    const/16 v4, 0x10

    aput-object v3, v0, v4

    const/16 v3, 0x11

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x12

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x13

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x14

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;

    invoke-static {v3}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    const/16 v4, 0x15

    aput-object v3, v0, v4

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;

    invoke-static {v3}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    const/16 v5, 0x16

    aput-object v4, v0, v5

    const/16 v4, 0x17

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v5

    aput-object v5, v0, v4

    const/16 v4, 0x18

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v5

    aput-object v5, v0, v4

    const/16 v4, 0x19

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v5

    aput-object v5, v0, v4

    const/16 v4, 0x1a

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v5

    aput-object v5, v0, v4

    const/16 v4, 0x1b

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v5

    aput-object v5, v0, v4

    new-instance v4, LQr2;

    invoke-direct {v4, v2, v2}, LQr2;-><init>(LKj2;LKj2;)V

    invoke-static {v4}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    const/16 v5, 0x1c

    aput-object v4, v0, v5

    new-instance v4, LQr2;

    invoke-direct {v4, v2, v1}, LQr2;-><init>(LKj2;LKj2;)V

    invoke-static {v4}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    const/16 v5, 0x1d

    aput-object v4, v0, v5

    const/16 v4, 0x1e

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v5

    aput-object v5, v0, v4

    const/16 v4, 0x1f

    invoke-static {v3}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    aput-object v3, v0, v4

    const/16 v3, 0x20

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x21

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x22

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x23

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;

    invoke-static {v3}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    const/16 v4, 0x24

    aput-object v3, v0, v4

    new-instance v3, LQr2;

    invoke-direct {v3, v2, v1}, LQr2;-><init>(LKj2;LKj2;)V

    invoke-static {v3}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    const/16 v4, 0x25

    aput-object v3, v0, v4

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    invoke-static {v3}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    const/16 v4, 0x26

    aput-object v3, v0, v4

    const/16 v3, 0x27

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x28

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v2

    aput-object v2, v0, v3

    const/16 v2, 0x29

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public deserialize(LGV0;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
    .locals 76

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->getDescriptor()LMs5;

    move-result-object v1

    invoke-interface {v0, v1}, LGV0;->b(LMs5;)LTt0;

    move-result-object v0

    invoke-interface {v0}, LTt0;->k()Z

    move-result v2

    const/16 v10, 0xb

    const/16 v11, 0xa

    const/16 v12, 0x9

    const/4 v13, 0x7

    const/4 v14, 0x6

    const/4 v15, 0x5

    const/4 v3, 0x3

    const/16 v5, 0x8

    const/4 v4, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v8}, LTt0;->E(LMs5;I)Z

    move-result v2

    invoke-interface {v0, v1, v7}, LTt0;->E(LMs5;I)Z

    move-result v7

    invoke-interface {v0, v1, v6}, LTt0;->E(LMs5;I)Z

    move-result v6

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v3

    invoke-interface {v0, v1, v4}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v15}, LTt0;->E(LMs5;I)Z

    move-result v8

    invoke-interface {v0, v1, v14}, LTt0;->E(LMs5;I)Z

    move-result v14

    invoke-interface {v0, v1, v13}, LTt0;->E(LMs5;I)Z

    move-result v13

    invoke-interface {v0, v1, v5}, LTt0;->E(LMs5;I)Z

    move-result v5

    invoke-interface {v0, v1, v12}, LTt0;->E(LMs5;I)Z

    move-result v12

    sget-object v15, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;

    invoke-interface {v0, v1, v11, v15, v9}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    sget-object v15, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    invoke-interface {v0, v1, v10, v15, v9}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    new-instance v15, Lro;

    move/from16 v24, v2

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;

    invoke-direct {v15, v2}, Lro;-><init>(LKj2;)V

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v9}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v15, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;

    move-object/from16 v23, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v15, v9}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v15, 0xe

    invoke-interface {v0, v1, v15}, LTt0;->E(LMs5;I)Z

    move-result v15

    const/16 v9, 0xf

    invoke-interface {v0, v1, v9}, LTt0;->E(LMs5;I)Z

    move-result v9

    move-object/from16 v20, v2

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;

    move/from16 v21, v3

    move/from16 v19, v8

    const/16 v3, 0x10

    const/4 v8, 0x0

    invoke-interface {v0, v1, v3, v2, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LgS5;->a:LgS5;

    move-object/from16 v22, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v3, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    sget-object v2, LYY;->a:LYY;

    move-object/from16 v25, v4

    const/16 v4, 0x12

    invoke-interface {v0, v1, v4, v2, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v16, v4

    const/16 v4, 0x13

    invoke-interface {v0, v1, v4, v3, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 p1, v4

    const/16 v4, 0x14

    invoke-interface {v0, v1, v4, v3, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v26, v4

    const/16 v4, 0x15

    move/from16 v27, v5

    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;

    invoke-interface {v0, v1, v4, v5, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;

    move-object/from16 v28, v4

    const/16 v4, 0x16

    invoke-interface {v0, v1, v4, v5, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v29, v4

    const/16 v4, 0x17

    invoke-interface {v0, v1, v4, v3, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v30, v4

    const/16 v4, 0x18

    invoke-interface {v0, v1, v4, v3, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v31, v4

    const/16 v4, 0x19

    invoke-interface {v0, v1, v4, v3, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v32, v4

    const/16 v4, 0x1a

    invoke-interface {v0, v1, v4, v3, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v33, v4

    const/16 v4, 0x1b

    invoke-interface {v0, v1, v4, v3, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    new-instance v8, LQr2;

    invoke-direct {v8, v3, v3}, LQr2;-><init>(LKj2;LKj2;)V

    move-object/from16 v35, v4

    const/16 v4, 0x1c

    move/from16 v36, v7

    const/4 v7, 0x0

    invoke-interface {v0, v1, v4, v8, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    new-instance v8, LQr2;

    invoke-direct {v8, v3, v2}, LQr2;-><init>(LKj2;LKj2;)V

    move-object/from16 v34, v4

    const/16 v4, 0x1d

    invoke-interface {v0, v1, v4, v8, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/16 v8, 0x1e

    invoke-interface {v0, v1, v8, v3, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v37, v4

    const/16 v4, 0x1f

    invoke-interface {v0, v1, v4, v5, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/16 v5, 0x20

    invoke-interface {v0, v1, v5, v2, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v4

    const/16 v4, 0x21

    invoke-interface {v0, v1, v4, v2, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v38, v4

    const/16 v4, 0x22

    invoke-interface {v0, v1, v4, v2, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v39, v4

    const/16 v4, 0x23

    invoke-interface {v0, v1, v4, v2, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v40, v4

    const/16 v4, 0x24

    move-object/from16 v41, v5

    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;

    invoke-interface {v0, v1, v4, v5, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    new-instance v5, LQr2;

    invoke-direct {v5, v3, v2}, LQr2;-><init>(LKj2;LKj2;)V

    move-object/from16 v42, v4

    const/16 v4, 0x25

    invoke-interface {v0, v1, v4, v5, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/16 v5, 0x26

    move-object/from16 v43, v4

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    invoke-interface {v0, v1, v5, v4, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/16 v5, 0x27

    invoke-interface {v0, v1, v5, v2, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v44, v4

    const/16 v4, 0x28

    invoke-interface {v0, v1, v4, v3, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x29

    invoke-interface {v0, v1, v4, v2, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v4, 0x3ff

    const/4 v7, -0x1

    move/from16 v62, v6

    move-object/from16 v61, v8

    move/from16 v73, v9

    move/from16 v71, v12

    move/from16 v68, v13

    move/from16 v66, v14

    move/from16 v72, v15

    move/from16 v65, v19

    move/from16 v63, v21

    move-object/from16 v52, v22

    move/from16 v9, v24

    move-object/from16 v64, v25

    move-object/from16 v51, v26

    move/from16 v70, v27

    move-object/from16 v53, v28

    move-object/from16 v54, v29

    move-object/from16 v55, v30

    move-object/from16 v56, v31

    move-object/from16 v57, v32

    move-object/from16 v58, v33

    move-object/from16 v60, v34

    move-object/from16 v59, v35

    move/from16 v24, v36

    move-object/from16 v8, v40

    move-object/from16 v67, v43

    move-object/from16 v69, v44

    move-object v13, v2

    move v14, v4

    move-object v15, v5

    move v12, v7

    move-object/from16 v40, v10

    move-object/from16 v19, v11

    move-object/from16 v4, v16

    move-object/from16 v2, v23

    move-object/from16 v5, v37

    move-object/from16 v10, v38

    move-object/from16 v7, v39

    move-object/from16 v11, v42

    move-object/from16 v16, p1

    move-object/from16 v23, v20

    goto/16 :goto_d

    :cond_0
    move v2, v7

    move-object v7, v9

    move/from16 v66, v2

    move-object v3, v7

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v9, v6

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v30, v15

    move-object/from16 v44, v30

    move-object/from16 v45, v44

    move-object/from16 v46, v45

    move-object/from16 v47, v46

    move-object/from16 v48, v47

    move-object/from16 v49, v48

    move-object/from16 v50, v49

    move-object/from16 v51, v50

    move-object/from16 v52, v51

    move-object/from16 v53, v52

    move-object/from16 v54, v53

    move-object/from16 v55, v54

    move-object/from16 v56, v55

    move-object/from16 v57, v56

    move-object/from16 v58, v57

    move-object/from16 v59, v58

    move-object/from16 v60, v59

    move-object/from16 v61, v60

    move v2, v8

    move/from16 v25, v2

    move/from16 v26, v25

    move/from16 v28, v26

    move/from16 v29, v28

    move/from16 v35, v29

    move/from16 v42, v35

    move/from16 v43, v42

    move/from16 v62, v43

    move/from16 v63, v62

    move/from16 v64, v63

    move/from16 v65, v64

    :goto_0
    if-eqz v66, :cond_1

    move-object/from16 v67, v5

    invoke-interface {v0, v1}, LTt0;->q(LMs5;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v5, 0x29

    move/from16 v68, v2

    sget-object v2, LYY;->a:LYY;

    invoke-interface {v0, v1, v5, v2, v13}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v8, v8, 0x200

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v13, v2

    goto :goto_1

    :pswitch_1
    move/from16 v68, v2

    const/16 v2, 0x28

    sget-object v5, LgS5;->a:LgS5;

    invoke-interface {v0, v1, v2, v5, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v8, v8, 0x100

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v14, v2

    goto :goto_1

    :pswitch_2
    move/from16 v68, v2

    const/16 v2, 0x27

    sget-object v5, LYY;->a:LYY;

    invoke-interface {v0, v1, v2, v5, v15}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v8, v8, 0x80

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v15, v2

    :goto_1
    move-object/from16 v69, v4

    goto/16 :goto_2

    :pswitch_3
    move/from16 v68, v2

    const/16 v2, 0x26

    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    invoke-interface {v0, v1, v2, v5, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v8, v8, 0x40

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v69, v2

    goto/16 :goto_2

    :pswitch_4
    move/from16 v68, v2

    new-instance v2, LQr2;

    sget-object v5, LgS5;->a:LgS5;

    move-object/from16 v69, v4

    sget-object v4, LYY;->a:LYY;

    invoke-direct {v2, v5, v4}, LQr2;-><init>(LKj2;LKj2;)V

    const/16 v4, 0x25

    invoke-interface {v0, v1, v4, v2, v3}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v8, v8, 0x20

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v16, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v22, v52

    move-object/from16 v5, v67

    const/4 v3, 0x0

    const/16 v4, 0xa

    move-object/from16 v67, v2

    move-object/from16 v52, v48

    move/from16 v2, v68

    goto/16 :goto_c

    :pswitch_5
    move/from16 v68, v2

    move-object/from16 v69, v4

    const/16 v2, 0x24

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;

    invoke-interface {v0, v1, v2, v4, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v8, v8, 0x10

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v6, v2

    goto :goto_2

    :pswitch_6
    move/from16 v68, v2

    move-object/from16 v69, v4

    const/16 v2, 0x23

    sget-object v4, LYY;->a:LYY;

    invoke-interface {v0, v1, v2, v4, v9}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v8, v8, 0x8

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v9, v2

    goto :goto_2

    :pswitch_7
    move/from16 v68, v2

    move-object/from16 v69, v4

    const/16 v2, 0x22

    sget-object v4, LYY;->a:LYY;

    invoke-interface {v0, v1, v2, v4, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v8, v8, 0x4

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v7, v2

    goto :goto_2

    :pswitch_8
    move/from16 v68, v2

    move-object/from16 v69, v4

    const/16 v2, 0x21

    sget-object v4, LYY;->a:LYY;

    invoke-interface {v0, v1, v2, v4, v10}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v8, v8, 0x2

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v10, v2

    goto :goto_2

    :pswitch_9
    move/from16 v68, v2

    move-object/from16 v69, v4

    sget-object v2, LYY;->a:LYY;

    const/16 v4, 0x20

    invoke-interface {v0, v1, v4, v2, v11}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v8, v8, 0x1

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v11, v2

    :goto_2
    move-object/from16 v16, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v22, v52

    move-object/from16 v5, v67

    move/from16 v2, v68

    goto :goto_3

    :pswitch_a
    move/from16 v68, v2

    move-object/from16 v69, v4

    const/16 v4, 0x20

    const/16 v2, 0x1f

    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;

    invoke-interface {v0, v1, v2, v5, v12}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, -0x80000000

    or-int v5, v68, v5

    sget-object v12, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v12, v2

    move v2, v5

    move-object/from16 v16, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v22, v52

    move-object/from16 v5, v67

    :goto_3
    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x0

    goto/16 :goto_c

    :pswitch_b
    move/from16 v68, v2

    move-object/from16 v69, v4

    const/16 v4, 0x20

    const/16 v2, 0x1e

    sget-object v5, LgS5;->a:LgS5;

    move-object/from16 v4, v67

    invoke-interface {v0, v1, v2, v5, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v4, 0x40000000    # 2.0f

    or-int v4, v68, v4

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v5, v2

    move-object/from16 v67, v3

    move v2, v4

    goto :goto_4

    :pswitch_c
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v67

    new-instance v2, LQr2;

    sget-object v5, LgS5;->a:LgS5;

    move-object/from16 v67, v3

    sget-object v3, LYY;->a:LYY;

    invoke-direct {v2, v5, v3}, LQr2;-><init>(LKj2;LKj2;)V

    const/16 v3, 0x1d

    move-object/from16 v5, v61

    invoke-interface {v0, v1, v3, v2, v5}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x20000000

    or-int v3, v68, v3

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v61, v2

    move v2, v3

    move-object v5, v4

    :goto_4
    move-object/from16 v16, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v22, v52

    const/4 v3, 0x0

    const/16 v4, 0xa

    move-object/from16 v52, v48

    goto/16 :goto_c

    :pswitch_d
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v5, v61

    move-object/from16 v4, v67

    move-object/from16 v67, v3

    new-instance v2, LQr2;

    sget-object v3, LgS5;->a:LgS5;

    invoke-direct {v2, v3, v3}, LQr2;-><init>(LKj2;LKj2;)V

    const/16 v3, 0x1c

    move-object/from16 v61, v4

    move-object/from16 v4, v60

    invoke-interface {v0, v1, v3, v2, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x10000000

    or-int v3, v68, v3

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v60, v2

    goto/16 :goto_5

    :pswitch_e
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v60

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    const/16 v2, 0x1b

    sget-object v3, LgS5;->a:LgS5;

    move-object/from16 v4, v59

    invoke-interface {v0, v1, v2, v3, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x8000000

    or-int v3, v68, v3

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v59, v2

    goto/16 :goto_5

    :pswitch_f
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v59

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    const/16 v2, 0x1a

    sget-object v3, LgS5;->a:LgS5;

    move-object/from16 v4, v58

    invoke-interface {v0, v1, v2, v3, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x4000000

    or-int v3, v68, v3

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v58, v2

    goto/16 :goto_5

    :pswitch_10
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v58

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    const/16 v2, 0x19

    sget-object v3, LgS5;->a:LgS5;

    move-object/from16 v4, v57

    invoke-interface {v0, v1, v2, v3, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x2000000

    or-int v3, v68, v3

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v57, v2

    goto/16 :goto_5

    :pswitch_11
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v57

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    const/16 v2, 0x18

    sget-object v3, LgS5;->a:LgS5;

    move-object/from16 v4, v56

    invoke-interface {v0, v1, v2, v3, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x1000000

    or-int v3, v68, v3

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v56, v2

    goto :goto_5

    :pswitch_12
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v56

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    const/16 v2, 0x17

    sget-object v3, LgS5;->a:LgS5;

    move-object/from16 v4, v55

    invoke-interface {v0, v1, v2, v3, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x800000

    or-int v3, v68, v3

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v55, v2

    goto :goto_5

    :pswitch_13
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v55

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    const/16 v2, 0x16

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;

    move-object/from16 v4, v54

    invoke-interface {v0, v1, v2, v3, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x400000

    or-int v3, v68, v3

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v54, v2

    goto :goto_5

    :pswitch_14
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v54

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    const/16 v2, 0x15

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;

    move-object/from16 v4, v53

    invoke-interface {v0, v1, v2, v3, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x200000

    or-int v3, v68, v3

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v53, v2

    :goto_5
    move v2, v3

    move-object/from16 v16, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v22, v52

    const/4 v3, 0x0

    const/16 v4, 0xa

    move-object/from16 v52, v48

    goto/16 :goto_9

    :pswitch_15
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v53

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    const/16 v2, 0x14

    sget-object v3, LgS5;->a:LgS5;

    move-object/from16 v4, v52

    invoke-interface {v0, v1, v2, v3, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x100000

    or-int v3, v68, v3

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v22, v2

    move v2, v3

    move-object/from16 v16, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v52, v48

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    const/4 v3, 0x0

    const/16 v4, 0xa

    goto/16 :goto_9

    :pswitch_16
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    sget-object v2, LgS5;->a:LgS5;

    move-object/from16 v3, v51

    move-object/from16 v51, v4

    const/16 v4, 0x13

    invoke-interface {v0, v1, v4, v2, v3}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x80000

    or-int v3, v68, v3

    sget-object v52, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v16, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v52, v48

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v22, v51

    const/16 v4, 0xa

    move-object/from16 v51, v2

    move v2, v3

    goto/16 :goto_8

    :pswitch_17
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0x13

    move-object/from16 v67, v3

    move-object/from16 v3, v51

    move-object/from16 v51, v52

    sget-object v2, LYY;->a:LYY;

    move-object/from16 v16, v3

    move-object/from16 v4, v50

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v2, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v4, 0x40000

    or-int v4, v68, v4

    sget-object v50, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v18, v2

    move v2, v4

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v52, v48

    move-object/from16 v19, v49

    goto/16 :goto_7

    :pswitch_18
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    const/16 v3, 0x12

    sget-object v2, LgS5;->a:LgS5;

    move-object/from16 v18, v4

    move-object/from16 v3, v49

    const/16 v4, 0x11

    invoke-interface {v0, v1, v4, v2, v3}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x20000

    or-int v3, v68, v3

    sget-object v49, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v19, v2

    move v2, v3

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v52, v48

    goto/16 :goto_7

    :pswitch_19
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0x11

    move-object/from16 v67, v3

    move-object/from16 v3, v49

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;

    move-object/from16 v19, v3

    move-object/from16 v4, v48

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v2, v4}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v4, 0x10000

    or-int v4, v68, v4

    sget-object v48, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v52, v2

    move v2, v4

    goto :goto_6

    :pswitch_1a
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v48

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v2, 0xf

    move-object/from16 v67, v3

    const/16 v3, 0x10

    invoke-interface {v0, v1, v2}, LTt0;->E(LMs5;I)Z

    move-result v35

    const v20, 0x8000

    or-int v20, v68, v20

    sget-object v48, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v52, v4

    move/from16 v2, v20

    goto :goto_6

    :pswitch_1b
    move/from16 v68, v2

    move-object/from16 v69, v4

    move-object/from16 v4, v48

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v2, 0xe

    move-object/from16 v67, v3

    const/16 v3, 0x10

    invoke-interface {v0, v1, v2}, LTt0;->E(LMs5;I)Z

    move-result v65

    move/from16 v2, v68

    or-int/lit16 v2, v2, 0x4000

    sget-object v20, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v52, v4

    :goto_6
    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    goto/16 :goto_7

    :pswitch_1c
    move-object/from16 v69, v4

    move-object/from16 v4, v48

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    move-object/from16 v67, v3

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;

    move-object/from16 v52, v4

    move-object/from16 v22, v6

    move-object/from16 v4, v47

    const/16 v6, 0xd

    invoke-interface {v0, v1, v6, v3, v4}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v2, v2, 0x2000

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v23, v3

    move-object/from16 v6, v22

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    goto/16 :goto_7

    :pswitch_1d
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v4, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v6, 0xd

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    new-instance v3, Lro;

    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;

    invoke-direct {v3, v6}, Lro;-><init>(LKj2;)V

    move-object/from16 v23, v4

    move-object/from16 v6, v46

    const/16 v4, 0xc

    invoke-interface {v0, v1, v4, v3, v6}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v2, v2, 0x1000

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v41, v3

    move-object/from16 v6, v22

    move-object/from16 v40, v45

    goto :goto_7

    :pswitch_1e
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xc

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    sget-object v3, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    move-object/from16 v41, v6

    move-object/from16 v4, v45

    const/16 v6, 0xb

    invoke-interface {v0, v1, v6, v3, v4}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v2, v2, 0x800

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v40, v3

    move-object/from16 v6, v22

    :goto_7
    move-object/from16 v22, v51

    const/4 v3, 0x0

    const/16 v4, 0xa

    move-object/from16 v51, v16

    move-object/from16 v16, v44

    goto :goto_9

    :pswitch_1f
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v4, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v6, 0xb

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;

    move-object/from16 v40, v4

    move-object/from16 v6, v44

    const/16 v4, 0xa

    invoke-interface {v0, v1, v4, v3, v6}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v2, v2, 0x400

    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v6, v22

    move-object/from16 v22, v51

    move-object/from16 v51, v16

    move-object/from16 v16, v3

    :goto_8
    const/4 v3, 0x0

    :goto_9
    move-object/from16 v74, v61

    move-object/from16 v61, v5

    move-object/from16 v5, v74

    goto/16 :goto_c

    :pswitch_20
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/16 v3, 0x9

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v62

    or-int/lit16 v2, v2, 0x200

    sget-object v39, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :pswitch_21
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/16 v3, 0x8

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v25

    or-int/lit16 v2, v2, 0x100

    sget-object v38, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :pswitch_22
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x7

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v63

    or-int/lit16 v2, v2, 0x80

    sget-object v37, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :pswitch_23
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x6

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v64

    or-int/lit8 v2, v2, 0x40

    sget-object v36, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :pswitch_24
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v29

    or-int/lit8 v2, v2, 0x20

    sget-object v34, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :pswitch_25
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v30

    or-int/lit8 v2, v2, 0x10

    sget-object v33, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_a

    :pswitch_26
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v32

    or-int/lit8 v2, v2, 0x8

    sget-object v43, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move/from16 v43, v32

    goto :goto_a

    :pswitch_27
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v26

    or-int/lit8 v2, v2, 0x4

    sget-object v31, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_a

    :pswitch_28
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v28

    or-int/lit8 v2, v2, 0x2

    sget-object v27, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_a
    const/4 v3, 0x0

    goto :goto_b

    :pswitch_29
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, LTt0;->E(LMs5;I)Z

    move-result v24

    or-int/lit8 v2, v2, 0x1

    sget-object v32, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move/from16 v42, v24

    goto :goto_b

    :pswitch_2a
    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v5, v61

    move-object/from16 v61, v67

    const/16 v4, 0xa

    move-object/from16 v67, v3

    move-object/from16 v52, v48

    const/4 v3, 0x0

    sget-object v24, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move/from16 v66, v3

    :goto_b
    move-object/from16 v74, v61

    move-object/from16 v61, v5

    move-object/from16 v5, v74

    move-object/from16 v75, v16

    move-object/from16 v16, v6

    move-object/from16 v6, v22

    move-object/from16 v22, v51

    move-object/from16 v51, v75

    :goto_c
    move-object/from16 v44, v16

    move-object/from16 v50, v18

    move-object/from16 v49, v19

    move-object/from16 v47, v23

    move-object/from16 v45, v40

    move-object/from16 v46, v41

    move-object/from16 v48, v52

    move-object/from16 v3, v67

    move-object/from16 v4, v69

    move-object/from16 v52, v22

    goto/16 :goto_0

    :cond_1
    move-object/from16 v67, v3

    move-object/from16 v69, v4

    move-object/from16 v22, v6

    move-object/from16 v6, v44

    move-object/from16 v40, v45

    move-object/from16 v41, v46

    move-object/from16 v23, v47

    move-object/from16 v19, v49

    move-object/from16 v18, v50

    move-object/from16 v16, v51

    move-object/from16 v51, v52

    move-object/from16 v52, v48

    move-object/from16 v74, v61

    move-object/from16 v61, v5

    move-object/from16 v5, v74

    move-object/from16 v17, v12

    move-object v3, v14

    move-object/from16 v4, v18

    move-object/from16 v18, v19

    move/from16 v70, v25

    move/from16 v24, v28

    move/from16 v73, v35

    move/from16 v71, v62

    move/from16 v68, v63

    move/from16 v66, v64

    move/from16 v72, v65

    move v12, v2

    move-object/from16 v19, v6

    move v14, v8

    move-object v8, v9

    move/from16 v62, v26

    move/from16 v65, v29

    move-object/from16 v64, v30

    move-object/from16 v2, v41

    move/from16 v9, v42

    move/from16 v63, v43

    move-object/from16 v41, v11

    move-object/from16 v11, v22

    :goto_d
    invoke-interface {v0, v1}, LTt0;->a(LMs5;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-object v6, v0

    check-cast v19, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-object/from16 v20, v40

    check-cast v20, Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    move-object/from16 v21, v2

    check-cast v21, Ljava/util/List;

    move-object/from16 v22, v23

    check-cast v22, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    move-object/from16 v25, v52

    check-cast v25, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    move-object/from16 v26, v18

    check-cast v26, Ljava/lang/String;

    move-object/from16 v27, v4

    check-cast v27, Ljava/lang/Boolean;

    move-object/from16 v28, v16

    check-cast v28, Ljava/lang/String;

    move-object/from16 v29, v51

    check-cast v29, Ljava/lang/String;

    move-object/from16 v30, v53

    check-cast v30, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-object/from16 v31, v54

    check-cast v31, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object/from16 v32, v55

    check-cast v32, Ljava/lang/String;

    move-object/from16 v33, v56

    check-cast v33, Ljava/lang/String;

    move-object/from16 v34, v57

    check-cast v34, Ljava/lang/String;

    move-object/from16 v35, v58

    check-cast v35, Ljava/lang/String;

    move-object/from16 v36, v59

    check-cast v36, Ljava/lang/String;

    move-object/from16 v37, v60

    check-cast v37, Ljava/util/Map;

    move-object/from16 v38, v5

    check-cast v38, Ljava/util/Map;

    move-object/from16 v39, v61

    check-cast v39, Ljava/lang/String;

    move-object/from16 v40, v17

    check-cast v40, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    check-cast v41, Ljava/lang/Boolean;

    move-object/from16 v42, v10

    check-cast v42, Ljava/lang/Boolean;

    move-object/from16 v43, v7

    check-cast v43, Ljava/lang/Boolean;

    move-object/from16 v44, v8

    check-cast v44, Ljava/lang/Boolean;

    move-object/from16 v45, v11

    check-cast v45, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    move-object/from16 v46, v67

    check-cast v46, Ljava/util/Map;

    move-object/from16 v47, v69

    check-cast v47, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    move-object/from16 v48, v15

    check-cast v48, Ljava/lang/Boolean;

    move-object/from16 v49, v3

    check-cast v49, Ljava/lang/String;

    move-object/from16 v50, v13

    check-cast v50, Ljava/lang/Boolean;

    const/16 v51, 0x0

    move v7, v12

    move v8, v14

    move/from16 v10, v24

    move/from16 v11, v62

    move/from16 v12, v63

    move-object/from16 v13, v64

    move/from16 v14, v65

    move/from16 v15, v66

    move/from16 v16, v68

    move/from16 v17, v70

    move/from16 v18, v71

    move/from16 v23, v72

    move/from16 v24, v73

    invoke-direct/range {v6 .. v51}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;-><init>(IIZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lbt5;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic deserialize(LGV0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->deserialize(LGV0;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->descriptor:LAW3;

    return-object v0
.end method

.method public serialize(Lrb1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->getDescriptor()LMs5;

    move-result-object v0

    invoke-interface {p1, v0}, Lrb1;->b(LMs5;)LUt0;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->write$Self(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;LUt0;LMs5;)V

    invoke-interface {p1, v0}, LUt0;->a(LMs5;)V

    return-void
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->serialize(Lrb1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    return-void
.end method

.method public typeParametersSerializers()[LKj2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LKj2<",
            "*>;"
        }
    .end annotation

    invoke-static {p0}, LmB1$a;->a(LmB1;)[LKj2;

    move-result-object v0

    return-object v0
.end method
