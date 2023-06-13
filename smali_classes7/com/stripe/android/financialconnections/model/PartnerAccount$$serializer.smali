.class public final Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmB1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/PartnerAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LmB1<",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
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
        "com/stripe/android/financialconnections/model/PartnerAccount.$serializer",
        "LmB1;",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
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

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;

.field private static final synthetic descriptor:LAW3;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;

    new-instance v1, LAW3;

    const-string v2, "com.stripe.android.financialconnections.model.PartnerAccount"

    const/16 v3, 0x11

    invoke-direct {v1, v2, v0, v3}, LAW3;-><init>(Ljava/lang/String;LmB1;I)V

    const-string v0, "authorization"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "category"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "id"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "name"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "subcategory"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "supported_payment_method_types"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "balance_amount"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "currency"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "displayable_account_numbers"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "initial_balance_amount"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "institution_name"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "allow_selection"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "allow_selection_message"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "institution_url"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "linked_account_id"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "routing_number"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "status"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    sput-object v1, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->descriptor:LAW3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[LKj2;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LKj2<",
            "*>;"
        }
    .end annotation

    const/16 v0, 0x11

    new-array v0, v0, [LKj2;

    sget-object v1, LgS5;->a:LgS5;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;

    aput-object v3, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v2, 0x4

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;

    aput-object v3, v0, v2

    new-instance v2, Lro;

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    invoke-direct {v2, v3}, Lro;-><init>(LKj2;)V

    const/4 v3, 0x5

    aput-object v2, v0, v3

    sget-object v2, LF52;->a:LF52;

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    const/4 v4, 0x6

    aput-object v3, v0, v4

    const/4 v3, 0x7

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x8

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x9

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v2

    aput-object v2, v0, v3

    const/16 v2, 0xa

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    aput-object v3, v0, v2

    sget-object v2, LYY;->a:LYY;

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v0, v3

    const/16 v2, 0xc

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    aput-object v3, v0, v2

    const/16 v2, 0xd

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    aput-object v3, v0, v2

    const/16 v2, 0xe

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    aput-object v3, v0, v2

    const/16 v2, 0xf

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v1

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    return-object v0
.end method

.method public deserialize(LGV0;)Lcom/stripe/android/financialconnections/model/PartnerAccount;
    .locals 33

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->getDescriptor()LMs5;

    move-result-object v1

    invoke-interface {v0, v1}, LGV0;->b(LMs5;)LTt0;

    move-result-object v0

    invoke-interface {v0}, LTt0;->k()Z

    move-result v2

    const/16 v8, 0xa

    const/16 v9, 0x9

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x3

    const/16 v15, 0x8

    const/4 v14, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v5}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v2

    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;

    invoke-interface {v0, v1, v4, v5, v6}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v3}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v13}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v5

    sget-object v13, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;

    invoke-interface {v0, v1, v14, v13, v6}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    new-instance v14, Lro;

    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    invoke-direct {v14, v7}, Lro;-><init>(LKj2;)V

    invoke-interface {v0, v1, v12, v14, v6}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    sget-object v12, LF52;->a:LF52;

    invoke-interface {v0, v1, v11, v12, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    sget-object v14, LgS5;->a:LgS5;

    invoke-interface {v0, v1, v10, v14, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v0, v1, v15, v14, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    invoke-interface {v0, v1, v9, v12, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v0, v1, v8, v14, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    sget-object v12, LYY;->a:LYY;

    move-object/from16 v21, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v12, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v12, 0xc

    invoke-interface {v0, v1, v12, v14, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v19, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v14, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v14, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v14, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v14, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;

    move-object/from16 v16, v5

    const/16 v5, 0x10

    invoke-interface {v0, v1, v5, v14, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const v6, 0x1ffff

    move-object/from16 v26, v3

    move-object/from16 v32, v7

    move-object v14, v11

    move-object/from16 v20, v12

    move-object/from16 v27, v16

    move-object/from16 v7, v17

    move-object/from16 v3, v18

    move v11, v6

    move-object/from16 v18, v8

    move-object/from16 v17, v9

    move-object/from16 v16, v15

    move-object/from16 v8, v21

    move-object v15, v10

    move-object v10, v5

    move-object v5, v4

    move-object v4, v2

    move-object/from16 v2, v19

    goto/16 :goto_5

    :cond_0
    move v2, v5

    const/16 v5, 0x10

    move/from16 v31, v4

    move-object v3, v6

    move-object v4, v3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v22, v15

    move-object/from16 v23, v22

    move-object/from16 v28, v23

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move v6, v2

    move-object/from16 v2, v30

    :goto_0
    if-eqz v31, :cond_1

    invoke-interface {v0, v1}, LTt0;->q(LMs5;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;

    move-object/from16 v32, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v5, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const/high16 v5, 0x10000

    or-int/2addr v6, v5

    move v5, v2

    move-object/from16 v2, v32

    goto :goto_0

    :pswitch_1
    move-object/from16 v32, v2

    const/16 v2, 0x10

    sget-object v5, LgS5;->a:LgS5;

    move-object/from16 v16, v7

    move-object/from16 v2, v29

    const/16 v7, 0xf

    invoke-interface {v0, v1, v7, v5, v2}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v29

    const v2, 0x8000

    or-int/2addr v6, v2

    goto/16 :goto_1

    :pswitch_2
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v2, v29

    const/16 v7, 0xf

    sget-object v5, LgS5;->a:LgS5;

    move-object/from16 v17, v2

    move-object/from16 v7, v28

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v5, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    or-int/lit16 v6, v6, 0x4000

    move-object/from16 v7, v16

    move-object/from16 v29, v17

    goto/16 :goto_2

    :pswitch_3
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/16 v2, 0xe

    sget-object v5, LgS5;->a:LgS5;

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v5, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    or-int/lit16 v6, v6, 0x2000

    goto/16 :goto_1

    :pswitch_4
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/16 v2, 0xd

    sget-object v5, LgS5;->a:LgS5;

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v5, v9}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    or-int/lit16 v6, v6, 0x1000

    goto/16 :goto_1

    :pswitch_5
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/16 v2, 0xc

    sget-object v5, LYY;->a:LYY;

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v5, v15}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    or-int/lit16 v6, v6, 0x800

    goto/16 :goto_1

    :pswitch_6
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/16 v2, 0xb

    sget-object v5, LgS5;->a:LgS5;

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v5, v10}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit16 v6, v6, 0x400

    goto/16 :goto_1

    :pswitch_7
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/16 v2, 0xa

    sget-object v5, LF52;->a:LF52;

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, v5, v11}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit16 v6, v6, 0x200

    goto/16 :goto_1

    :pswitch_8
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/16 v2, 0x9

    sget-object v5, LgS5;->a:LgS5;

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2, v5, v12}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit16 v6, v6, 0x100

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/16 v2, 0x8

    sget-object v5, LgS5;->a:LgS5;

    const/4 v2, 0x7

    invoke-interface {v0, v1, v2, v5, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    or-int/lit16 v6, v6, 0x80

    goto :goto_1

    :pswitch_a
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/4 v2, 0x7

    sget-object v5, LF52;->a:LF52;

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2, v5, v13}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    or-int/lit8 v6, v6, 0x40

    goto :goto_1

    :pswitch_b
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/4 v2, 0x6

    new-instance v5, Lro;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    invoke-direct {v5, v2}, Lro;-><init>(LKj2;)V

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2, v5, v3}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit8 v6, v6, 0x20

    goto :goto_1

    :pswitch_c
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/4 v2, 0x5

    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2, v5, v4}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    or-int/lit8 v6, v6, 0x10

    goto :goto_1

    :pswitch_d
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/4 v2, 0x4

    const/4 v5, 0x3

    invoke-interface {v0, v1, v5}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit8 v6, v6, 0x8

    goto :goto_1

    :pswitch_e
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/4 v2, 0x2

    const/4 v5, 0x3

    invoke-interface {v0, v1, v2}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v22

    or-int/lit8 v6, v6, 0x4

    :goto_1
    move-object/from16 v7, v16

    :goto_2
    move-object/from16 v2, v32

    goto :goto_4

    :pswitch_f
    move-object/from16 v32, v2

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/4 v5, 0x3

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;

    move-object/from16 v5, v32

    move-object/from16 v32, v3

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2, v5}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v6, v6, 0x2

    goto :goto_3

    :pswitch_10
    move-object v5, v2

    move-object/from16 v32, v3

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v30

    or-int/lit8 v6, v6, 0x1

    move-object v2, v5

    :goto_3
    move-object/from16 v7, v16

    move-object/from16 v3, v32

    goto :goto_4

    :pswitch_11
    move-object v5, v2

    move-object/from16 v32, v3

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    const/4 v2, 0x0

    move/from16 v31, v2

    move-object v2, v5

    move-object/from16 v7, v16

    :goto_4
    const/16 v5, 0x10

    goto/16 :goto_0

    :cond_1
    move-object v5, v2

    move-object/from16 v32, v3

    move-object/from16 v16, v7

    move-object/from16 v7, v28

    move-object/from16 v17, v29

    move-object v3, v8

    move-object/from16 v20, v9

    move-object/from16 v18, v10

    move-object v2, v15

    move-object/from16 v10, v16

    move-object/from16 v26, v22

    move-object/from16 v27, v23

    move-object/from16 v8, v30

    move-object/from16 v16, v12

    move-object v15, v14

    move-object v14, v13

    move-object v13, v4

    move-object/from16 v4, v17

    move-object/from16 v17, v11

    move v11, v6

    :goto_5
    invoke-interface {v0, v1}, LTt0;->a(LMs5;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object v6, v0

    move-object v9, v5

    check-cast v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move-object v12, v13

    check-cast v12, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-object/from16 v13, v32

    check-cast v13, Ljava/util/List;

    check-cast v14, Ljava/lang/Integer;

    check-cast v15, Ljava/lang/String;

    check-cast v16, Ljava/lang/String;

    check-cast v17, Ljava/lang/Integer;

    check-cast v18, Ljava/lang/String;

    move-object/from16 v19, v2

    check-cast v19, Ljava/lang/Boolean;

    check-cast v20, Ljava/lang/String;

    move-object/from16 v21, v3

    check-cast v21, Ljava/lang/String;

    move-object/from16 v22, v7

    check-cast v22, Ljava/lang/String;

    move-object/from16 v23, v4

    check-cast v23, Ljava/lang/String;

    move-object/from16 v24, v10

    check-cast v24, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    const/16 v25, 0x0

    move v7, v11

    move-object/from16 v10, v26

    move-object/from16 v11, v27

    invoke-direct/range {v6 .. v25}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lbt5;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
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

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->deserialize(LGV0;)Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->descriptor:LAW3;

    return-object v0
.end method

.method public serialize(Lrb1;Lcom/stripe/android/financialconnections/model/PartnerAccount;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->getDescriptor()LMs5;

    move-result-object v0

    invoke-interface {p1, v0}, Lrb1;->b(LMs5;)LUt0;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->write$Self(Lcom/stripe/android/financialconnections/model/PartnerAccount;LUt0;LMs5;)V

    invoke-interface {p1, v0}, LUt0;->a(LMs5;)V

    return-void
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->serialize(Lrb1;Lcom/stripe/android/financialconnections/model/PartnerAccount;)V

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
