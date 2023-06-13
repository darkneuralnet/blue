.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmB1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LmB1<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
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
        "com/stripe/android/financialconnections/model/FinancialConnectionsSession.$serializer",
        "LmB1;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
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

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;

.field private static final synthetic descriptor:LAW3;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;

    new-instance v1, LAW3;

    const-string v2, "com.stripe.android.financialconnections.model.FinancialConnectionsSession"

    const/16 v3, 0xb

    invoke-direct {v1, v2, v0, v3}, LAW3;-><init>(Ljava/lang/String;LmB1;I)V

    const-string v0, "client_secret"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "id"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "linked_accounts"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "accounts"

    invoke-virtual {v1, v0, v3}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "livemode"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "payment_account"

    invoke-virtual {v1, v0, v3}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "return_url"

    invoke-virtual {v1, v0, v3}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "bank_account_token"

    invoke-virtual {v1, v0, v3}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "manual_entry"

    invoke-virtual {v1, v0, v3}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "status"

    invoke-virtual {v1, v0, v3}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "status_details"

    invoke-virtual {v1, v0, v3}, LAW3;->k(Ljava/lang/String;Z)V

    sput-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->descriptor:LAW3;

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

    const/16 v0, 0xb

    new-array v0, v0, [LKj2;

    sget-object v1, LgS5;->a:LgS5;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v0, v4

    const/4 v3, 0x3

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v2

    aput-object v2, v0, v3

    const/4 v2, 0x4

    sget-object v3, LYY;->a:LYY;

    aput-object v3, v0, v2

    sget-object v2, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;

    invoke-static {v2}, Lb40;->p(LKj2;)LKj2;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v0, v3

    const/4 v2, 0x6

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v1

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    return-object v0
.end method

.method public deserialize(LGV0;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
    .locals 26

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->getDescriptor()LMs5;

    move-result-object v1

    invoke-interface {v0, v1}, LGV0;->b(LMs5;)LTt0;

    move-result-object v0

    invoke-interface {v0}, LTt0;->k()Z

    move-result v2

    const/16 v3, 0xa

    const/16 v4, 0x9

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v13}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v12}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    invoke-interface {v0, v1, v11, v13, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v0, v1, v8, v13, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v0, v1, v10}, LTt0;->E(LMs5;I)Z

    move-result v10

    sget-object v13, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;

    invoke-interface {v0, v1, v7, v13, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    sget-object v13, LgS5;->a:LgS5;

    invoke-interface {v0, v1, v6, v13, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    sget-object v13, Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;

    invoke-interface {v0, v1, v5, v13, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v13, Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;

    invoke-interface {v0, v1, v9, v13, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    sget-object v13, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;

    invoke-interface {v0, v1, v4, v13, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v13, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;

    invoke-interface {v0, v1, v3, v13, v14}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v13, 0x7ff

    move-object/from16 v16, v12

    move-object v12, v2

    move v2, v10

    move/from16 v25, v13

    move-object v13, v11

    move/from16 v11, v25

    goto/16 :goto_4

    :cond_0
    move/from16 v24, v12

    move v2, v13

    move-object v5, v14

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v10, v8

    move-object v11, v10

    move-object v12, v11

    move-object v15, v12

    move-object/from16 v16, v15

    move-object/from16 v13, v16

    move v14, v2

    :goto_0
    if-eqz v24, :cond_1

    invoke-interface {v0, v1}, LTt0;->q(LMs5;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;

    invoke-interface {v0, v1, v3, v9, v5}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit16 v14, v14, 0x400

    goto/16 :goto_3

    :pswitch_1
    sget-object v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;

    invoke-interface {v0, v1, v4, v9, v6}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    or-int/lit16 v14, v14, 0x200

    goto/16 :goto_3

    :pswitch_2
    sget-object v9, Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;

    const/16 v3, 0x8

    invoke-interface {v0, v1, v3, v9, v7}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    or-int/lit16 v14, v14, 0x100

    move v9, v3

    const/16 v3, 0xa

    goto :goto_0

    :pswitch_3
    const/16 v3, 0x8

    sget-object v9, Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;

    const/4 v3, 0x7

    invoke-interface {v0, v1, v3, v9, v10}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit16 v14, v14, 0x80

    goto :goto_2

    :pswitch_4
    const/4 v3, 0x7

    sget-object v9, LgS5;->a:LgS5;

    const/4 v3, 0x6

    invoke-interface {v0, v1, v3, v9, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    or-int/lit8 v14, v14, 0x40

    goto :goto_2

    :pswitch_5
    const/4 v3, 0x6

    sget-object v9, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v9, v11}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit8 v14, v14, 0x20

    goto :goto_2

    :pswitch_6
    const/4 v3, 0x5

    const/4 v9, 0x4

    invoke-interface {v0, v1, v9}, LTt0;->E(LMs5;I)Z

    move-result v2

    or-int/lit8 v14, v14, 0x10

    goto :goto_2

    :pswitch_7
    const/4 v9, 0x4

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4, v3, v12}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit8 v14, v14, 0x8

    goto :goto_1

    :pswitch_8
    const/4 v4, 0x3

    const/4 v9, 0x4

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    const/4 v4, 0x2

    invoke-interface {v0, v1, v4, v3, v13}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    or-int/lit8 v14, v14, 0x4

    goto :goto_1

    :pswitch_9
    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v9, 0x4

    invoke-interface {v0, v1, v3}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v14, v14, 0x2

    goto :goto_1

    :pswitch_a
    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v9, 0x4

    const/4 v15, 0x0

    invoke-interface {v0, v1, v15}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v14, v14, 0x1

    move-object/from16 v15, v17

    :goto_1
    const/16 v3, 0xa

    const/16 v4, 0x9

    goto :goto_3

    :pswitch_b
    const/4 v3, 0x1

    const/4 v9, 0x4

    const/16 v17, 0x0

    move/from16 v24, v17

    :goto_2
    const/16 v3, 0xa

    :goto_3
    const/16 v9, 0x8

    goto/16 :goto_0

    :cond_1
    move-object v3, v5

    move-object v4, v6

    move-object v9, v7

    move-object v6, v8

    move-object v5, v10

    move-object v7, v11

    move-object v8, v12

    move v11, v14

    move-object v12, v15

    :goto_4
    invoke-interface {v0, v1}, LTt0;->a(LMs5;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-object v14, v13

    check-cast v14, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-object v15, v8

    check-cast v15, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-object/from16 v17, v7

    check-cast v17, Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-object/from16 v18, v6

    check-cast v18, Ljava/lang/String;

    move-object/from16 v19, v5

    check-cast v19, Ljava/lang/String;

    move-object/from16 v20, v9

    check-cast v20, Lcom/stripe/android/financialconnections/model/ManualEntry;

    move-object/from16 v21, v4

    check-cast v21, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    move-object/from16 v22, v3

    check-cast v22, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    const/16 v23, 0x0

    move-object v10, v0

    move-object/from16 v13, v16

    move/from16 v16, v2

    invoke-direct/range {v10 .. v23}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lbt5;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
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

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->deserialize(LGV0;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->descriptor:LAW3;

    return-object v0
.end method

.method public serialize(Lrb1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->getDescriptor()LMs5;

    move-result-object v0

    invoke-interface {p1, v0}, Lrb1;->b(LMs5;)LUt0;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->write$Self(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;LUt0;LMs5;)V

    invoke-interface {p1, v0}, LUt0;->a(LMs5;)V

    return-void
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->serialize(Lrb1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

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
