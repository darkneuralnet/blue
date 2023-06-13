.class public final Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;
.super Lki2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lki2<",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;",
        "Lki2;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "Lxi2;",
        "element",
        "LE01;",
        "selectDeserializer",
        "<init>",
        "()V",
        "payments-ui-core_release"
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

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/FormItemSpec;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-direct {p0, v0}, Lki2;-><init>(Lkotlin/reflect/KClass;)V

    return-void
.end method


# virtual methods
.method public selectDeserializer(Lxi2;)LE01;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxi2;",
            ")",
            "LE01<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lzi2;->k(Lxi2;)LSi2;

    move-result-object p1

    const-string v0, "type"

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
    if-eqz p1, :cond_15

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "au_becs_mandate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_1

    :cond_1
    sget-object p1, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_1
    const-string v0, "selector"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_1

    :cond_2
    sget-object p1, Lcom/stripe/android/ui/core/elements/DropdownSpec;->Companion:Lcom/stripe/android/ui/core/elements/DropdownSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/DropdownSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_2
    const-string v0, "country"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_1

    :cond_3
    sget-object p1, Lcom/stripe/android/ui/core/elements/CountrySpec;->Companion:Lcom/stripe/android/ui/core/elements/CountrySpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CountrySpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_3
    const-string v0, "static_text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_1

    :cond_4
    sget-object p1, Lcom/stripe/android/ui/core/elements/StaticTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/StaticTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/StaticTextSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_4
    const-string v0, "mandate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_1

    :cond_5
    sget-object p1, Lcom/stripe/android/ui/core/elements/MandateTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/MandateTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/MandateTextSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_5
    const-string v0, "klarna_country"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_1

    :cond_6
    sget-object p1, Lcom/stripe/android/ui/core/elements/KlarnaCountrySpec;->Companion:Lcom/stripe/android/ui/core/elements/KlarnaCountrySpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/KlarnaCountrySpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_6
    const-string v0, "email"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_1

    :cond_7
    sget-object p1, Lcom/stripe/android/ui/core/elements/EmailSpec;->Companion:Lcom/stripe/android/ui/core/elements/EmailSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/EmailSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_7
    const-string v0, "au_becs_account_number"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_1

    :cond_8
    sget-object p1, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->Companion:Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_8
    const-string v0, "card_details"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_1

    :cond_9
    sget-object p1, Lcom/stripe/android/ui/core/elements/CardDetailsSectionSpec;->Companion:Lcom/stripe/android/ui/core/elements/CardDetailsSectionSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_9
    const-string v0, "text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_1

    :cond_a
    sget-object p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_a
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_1

    :cond_b
    sget-object p1, Lcom/stripe/android/ui/core/elements/NameSpec;->Companion:Lcom/stripe/android/ui/core/elements/NameSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/NameSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_b
    const-string v0, "iban"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_1

    :cond_c
    sget-object p1, Lcom/stripe/android/ui/core/elements/IbanSpec;->Companion:Lcom/stripe/android/ui/core/elements/IbanSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/IbanSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_c
    const-string v0, "upi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_1

    :cond_d
    sget-object p1, Lcom/stripe/android/ui/core/elements/UpiSpec;->Companion:Lcom/stripe/android/ui/core/elements/UpiSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/UpiSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_d
    const-string v0, "sepa_mandate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_1

    :cond_e
    sget-object p1, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_e
    const-string v0, "afterpay_header"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_1

    :cond_f
    sget-object p1, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto :goto_2

    :sswitch_f
    const-string v0, "billing_address"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_1

    :cond_10
    sget-object p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->Companion:Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto :goto_2

    :sswitch_10
    const-string v0, "au_becs_bsb_number"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_1

    :cond_11
    sget-object p1, Lcom/stripe/android/ui/core/elements/BsbSpec;->Companion:Lcom/stripe/android/ui/core/elements/BsbSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/BsbSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto :goto_2

    :sswitch_11
    const-string v0, "card_billing"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto :goto_1

    :cond_12
    sget-object p1, Lcom/stripe/android/ui/core/elements/CardBillingSpec;->Companion:Lcom/stripe/android/ui/core/elements/CardBillingSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardBillingSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto :goto_2

    :sswitch_12
    const-string v0, "affirm_header"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto :goto_1

    :cond_13
    sget-object p1, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/AffirmTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AffirmTextSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto :goto_2

    :sswitch_13
    const-string v0, "klarna_header"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto :goto_1

    :cond_14
    sget-object p1, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec$Companion;->serializer()LKj2;

    move-result-object p1

    goto :goto_2

    :cond_15
    :goto_1
    sget-object p1, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->serializer()LKj2;

    move-result-object p1

    :goto_2
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x728fd679 -> :sswitch_13
        -0x70559d97 -> :sswitch_12
        -0x6231cbb4 -> :sswitch_11
        -0x3647f928 -> :sswitch_10
        -0x1ec545d0 -> :sswitch_f
        -0xb0efb20 -> :sswitch_e
        -0x8ea474 -> :sswitch_d
        0x1c52e -> :sswitch_c
        0x313706 -> :sswitch_b
        0x337a8b -> :sswitch_a
        0x36452d -> :sswitch_9
        0x1330413 -> :sswitch_8
        0x268fedc -> :sswitch_7
        0x5c24b9c -> :sswitch_6
        0x2a44efdc -> :sswitch_5
        0x31ca5808 -> :sswitch_4
        0x34c9045e -> :sswitch_3
        0x39175796 -> :sswitch_2
        0x4705f3df -> :sswitch_1
        0x4ada41e7 -> :sswitch_0
    .end sparse-switch
.end method
