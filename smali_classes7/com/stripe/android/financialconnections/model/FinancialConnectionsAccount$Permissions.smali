.class public final enum Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
    with = Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Permissions"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Companion;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0087\u0001\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
        "",
        "value",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "BALANCES",
        "OWNERSHIP",
        "PAYMENT_METHOD",
        "TRANSACTIONS",
        "ACCOUNT_NUMBERS",
        "UNKNOWN",
        "Companion",
        "Serializer",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "LKj2<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final enum ACCOUNT_NUMBERS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;
    .annotation runtime LVs5;
        value = "account_numbers"
    .end annotation
.end field

.field public static final enum BALANCES:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;
    .annotation runtime LVs5;
        value = "balances"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Companion;

.field public static final enum OWNERSHIP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;
    .annotation runtime LVs5;
        value = "ownership"
    .end annotation
.end field

.field public static final enum PAYMENT_METHOD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;
    .annotation runtime LVs5;
        value = "payment_method"
    .end annotation
.end field

.field public static final enum TRANSACTIONS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;
    .annotation runtime LVs5;
        value = "transactions"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->BALANCES:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->OWNERSHIP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->PAYMENT_METHOD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->TRANSACTIONS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->ACCOUNT_NUMBERS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v1, 0x0

    const-string v2, "balances"

    const-string v3, "BALANCES"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->BALANCES:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v1, 0x1

    const-string v2, "ownership"

    const-string v3, "OWNERSHIP"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->OWNERSHIP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v1, 0x2

    const-string v2, "payment_method"

    const-string v3, "PAYMENT_METHOD"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->PAYMENT_METHOD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v1, 0x3

    const-string v2, "transactions"

    const-string v3, "TRANSACTIONS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->TRANSACTIONS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v1, 0x4

    const-string v2, "account_numbers"

    const-string v3, "ACCOUNT_NUMBERS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->ACCOUNT_NUMBERS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v1, 0x5

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->$values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Companion;

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Companion$$cachedSerializer$delegate$1;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->value:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->value:Ljava/lang/String;

    return-object v0
.end method