.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmB1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LmB1<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
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
        "com/stripe/android/financialconnections/model/FinancialConnectionsAccountList.$serializer",
        "LmB1;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
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

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

.field private static final synthetic descriptor:LAW3;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    new-instance v1, LAW3;

    const-string v2, "com.stripe.android.financialconnections.model.FinancialConnectionsAccountList"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v0, v3}, LAW3;-><init>(Ljava/lang/String;LmB1;I)V

    const-string v0, "data"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "has_more"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "url"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "count"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "total_count"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    sput-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->descriptor:LAW3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[LKj2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LKj2<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x5

    new-array v0, v0, [LKj2;

    new-instance v1, Lro;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;

    invoke-direct {v1, v2}, Lro;-><init>(LKj2;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    sget-object v2, LYY;->a:LYY;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LgS5;->a:LgS5;

    aput-object v2, v0, v1

    sget-object v1, LF52;->a:LF52;

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const/4 v2, 0x4

    invoke-static {v1}, Lb40;->p(LKj2;)LKj2;

    move-result-object v1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public deserialize(LGV0;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->getDescriptor()LMs5;

    move-result-object v1

    invoke-interface {v0, v1}, LGV0;->b(LMs5;)LTt0;

    move-result-object v0

    invoke-interface {v0}, LTt0;->k()Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    new-instance v2, Lro;

    sget-object v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;

    invoke-direct {v2, v9}, Lro;-><init>(LKj2;)V

    invoke-interface {v0, v1, v7, v2, v8}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v6}, LTt0;->E(LMs5;I)Z

    move-result v6

    invoke-interface {v0, v1, v5}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v5

    sget-object v7, LF52;->a:LF52;

    invoke-interface {v0, v1, v3, v7, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v1, v4, v7, v8}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/16 v7, 0x1f

    move-object v9, v5

    move v8, v6

    move v6, v7

    goto/16 :goto_1

    :cond_0
    move v13, v6

    move v2, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move v8, v2

    :goto_0
    if-eqz v13, :cond_7

    invoke-interface {v0, v1}, LTt0;->q(LMs5;)I

    move-result v14

    const/4 v15, -0x1

    if-eq v14, v15, :cond_6

    if-eqz v14, :cond_5

    if-eq v14, v6, :cond_4

    if-eq v14, v5, :cond_3

    if-eq v14, v3, :cond_2

    if-ne v14, v4, :cond_1

    sget-object v14, LF52;->a:LF52;

    invoke-interface {v0, v1, v4, v14, v12}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit8 v8, v8, 0x10

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    sget-object v14, LF52;->a:LF52;

    invoke-interface {v0, v1, v3, v14, v11}, LTt0;->i(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit8 v8, v8, 0x8

    goto :goto_0

    :cond_3
    invoke-interface {v0, v1, v5}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v10

    or-int/lit8 v8, v8, 0x4

    goto :goto_0

    :cond_4
    invoke-interface {v0, v1, v6}, LTt0;->E(LMs5;I)Z

    move-result v2

    or-int/lit8 v8, v8, 0x2

    goto :goto_0

    :cond_5
    new-instance v14, Lro;

    sget-object v15, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;

    invoke-direct {v14, v15}, Lro;-><init>(LKj2;)V

    invoke-interface {v0, v1, v7, v14, v9}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    or-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_6
    move v13, v7

    goto :goto_0

    :cond_7
    move v6, v8

    move-object v3, v11

    move-object v4, v12

    move v8, v2

    move-object v2, v9

    move-object v9, v10

    :goto_1
    invoke-interface {v0, v1}, LTt0;->a(LMs5;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-object v7, v2

    check-cast v7, Ljava/util/List;

    move-object v10, v3

    check-cast v10, Ljava/lang/Integer;

    move-object v11, v4

    check-cast v11, Ljava/lang/Integer;

    const/4 v12, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v12}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;-><init>(ILjava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lbt5;)V

    return-object v0
.end method

.method public bridge synthetic deserialize(LGV0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->deserialize(LGV0;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->descriptor:LAW3;

    return-object v0
.end method

.method public serialize(Lrb1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->getDescriptor()LMs5;

    move-result-object v0

    invoke-interface {p1, v0}, Lrb1;->b(LMs5;)LUt0;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->write$Self(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;LUt0;LMs5;)V

    invoke-interface {p1, v0}, LUt0;->a(LMs5;)V

    return-void
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->serialize(Lrb1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;)V

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
