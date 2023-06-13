.class public final Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;
.super Lki2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lki2<",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;",
        "Lki2;",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "Lxi2;",
        "element",
        "LKj2;",
        "selectDeserializer",
        "",
        "getObjectValue",
        "(Lxi2;)Ljava/lang/String;",
        "objectValue",
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/model/PaymentAccount;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-direct {p0, v0}, Lki2;-><init>(Lkotlin/reflect/KClass;)V

    return-void
.end method

.method private final getObjectValue(Lxi2;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Lzi2;->k(Lxi2;)LSi2;

    move-result-object p1

    const-string v0, "object"

    invoke-virtual {p1, v0}, LSi2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxi2;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lzi2;->l(Lxi2;)LYi2;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYi2;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic selectDeserializer(Lxi2;)LE01;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->selectDeserializer(Lxi2;)LKj2;

    move-result-object p1

    return-object p1
.end method

.method public selectDeserializer(Lxi2;)LKj2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxi2;",
            ")",
            "LKj2<",
            "+",
            "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
            ">;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->getObjectValue(Lxi2;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "linked_account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "financial_connections.account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;->serializer()LKj2;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/stripe/android/financialconnections/model/BankAccount;->Companion:Lcom/stripe/android/financialconnections/model/BankAccount$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/BankAccount$Companion;->serializer()LKj2;

    move-result-object p1

    :goto_1
    return-object p1
.end method
