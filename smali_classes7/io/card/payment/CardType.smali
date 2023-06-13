.class public final enum Lio/card/payment/CardType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/card/payment/CardType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/card/payment/CardType;

.field public static final enum AMEX:Lio/card/payment/CardType;

.field public static final enum DINERSCLUB:Lio/card/payment/CardType;

.field public static final enum DISCOVER:Lio/card/payment/CardType;

.field public static final enum INSUFFICIENT_DIGITS:Lio/card/payment/CardType;

.field public static final enum JCB:Lio/card/payment/CardType;

.field public static final enum MAESTRO:Lio/card/payment/CardType;

.field public static final enum MASTERCARD:Lio/card/payment/CardType;

.field public static final enum UNKNOWN:Lio/card/payment/CardType;

.field public static final enum VISA:Lio/card/payment/CardType;

.field private static intervalLookup:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lio/card/payment/CardType;",
            ">;"
        }
    .end annotation
.end field

.field private static minDigits:I


# instance fields
.field public final name:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lio/card/payment/CardType;

    const-string v1, "AmEx"

    const-string v2, "AMEX"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lio/card/payment/CardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/card/payment/CardType;->AMEX:Lio/card/payment/CardType;

    new-instance v1, Lio/card/payment/CardType;

    const-string v2, "DinersClub"

    const-string v4, "DINERSCLUB"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lio/card/payment/CardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lio/card/payment/CardType;->DINERSCLUB:Lio/card/payment/CardType;

    new-instance v2, Lio/card/payment/CardType;

    const-string v4, "Discover"

    const-string v6, "DISCOVER"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lio/card/payment/CardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lio/card/payment/CardType;->DISCOVER:Lio/card/payment/CardType;

    new-instance v4, Lio/card/payment/CardType;

    const-string v6, "JCB"

    const/4 v8, 0x3

    invoke-direct {v4, v6, v8, v6}, Lio/card/payment/CardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lio/card/payment/CardType;->JCB:Lio/card/payment/CardType;

    new-instance v6, Lio/card/payment/CardType;

    const-string v9, "MasterCard"

    const-string v10, "MASTERCARD"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v9}, Lio/card/payment/CardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lio/card/payment/CardType;->MASTERCARD:Lio/card/payment/CardType;

    new-instance v9, Lio/card/payment/CardType;

    const-string v10, "Visa"

    const-string v12, "VISA"

    const/4 v13, 0x5

    invoke-direct {v9, v12, v13, v10}, Lio/card/payment/CardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lio/card/payment/CardType;->VISA:Lio/card/payment/CardType;

    new-instance v10, Lio/card/payment/CardType;

    const-string v12, "Maestro"

    const-string v14, "MAESTRO"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, Lio/card/payment/CardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lio/card/payment/CardType;->MAESTRO:Lio/card/payment/CardType;

    new-instance v12, Lio/card/payment/CardType;

    const-string v14, "Unknown"

    const-string v15, "UNKNOWN"

    const/4 v13, 0x7

    invoke-direct {v12, v15, v13, v14}, Lio/card/payment/CardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lio/card/payment/CardType;->UNKNOWN:Lio/card/payment/CardType;

    new-instance v14, Lio/card/payment/CardType;

    const-string v15, "More digits required"

    const-string v13, "INSUFFICIENT_DIGITS"

    const/16 v11, 0x8

    invoke-direct {v14, v13, v11, v15}, Lio/card/payment/CardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, Lio/card/payment/CardType;->INSUFFICIENT_DIGITS:Lio/card/payment/CardType;

    const/16 v13, 0x9

    new-array v13, v13, [Lio/card/payment/CardType;

    aput-object v0, v13, v3

    aput-object v1, v13, v5

    aput-object v2, v13, v7

    aput-object v4, v13, v8

    const/4 v3, 0x4

    aput-object v6, v13, v3

    const/4 v3, 0x5

    aput-object v9, v13, v3

    const/4 v3, 0x6

    aput-object v10, v13, v3

    const/4 v3, 0x7

    aput-object v12, v13, v3

    aput-object v14, v13, v11

    sput-object v13, Lio/card/payment/CardType;->$VALUES:[Lio/card/payment/CardType;

    sput v5, Lio/card/payment/CardType;->minDigits:I

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v5, "2221"

    const-string v7, "2720"

    invoke-static {v5, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v5

    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v5, "300"

    const-string v7, "305"

    invoke-static {v5, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v5

    invoke-virtual {v3, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v5, "309"

    const/4 v7, 0x0

    invoke-static {v5, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v5

    invoke-virtual {v3, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v5, "34"

    invoke-static {v5, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v5

    invoke-virtual {v3, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v5, "3528"

    const-string v8, "3589"

    invoke-static {v5, v8}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v4, "36"

    invoke-static {v4, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v4, "37"

    invoke-static {v4, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v3, "38"

    const-string v4, "39"

    invoke-static {v3, v4}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "4"

    invoke-static {v1, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "50"

    invoke-static {v1, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "51"

    const-string v3, "55"

    invoke-static {v1, v3}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "56"

    const-string v3, "59"

    invoke-static {v1, v3}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "6011"

    invoke-static {v1, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "61"

    invoke-static {v1, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "62"

    invoke-static {v1, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "63"

    invoke-static {v1, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "644"

    const-string v3, "649"

    invoke-static {v1, v3}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "65"

    invoke-static {v1, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "66"

    const-string v3, "69"

    invoke-static {v1, v3}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    const-string v1, "88"

    invoke-static {v1, v7}, Lio/card/payment/CardType;->getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lio/card/payment/CardType;->getIntervalLookup()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    sget v2, Lio/card/payment/CardType;->minDigits:I

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    sput v2, Lio/card/payment/CardType;->minDigits:I

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v2, :cond_0

    sget v2, Lio/card/payment/CardType;->minDigits:I

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    sput v1, Lio/card/payment/CardType;->minDigits:I

    goto :goto_0

    :cond_1
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

    iput-object p3, p0, Lio/card/payment/CardType;->name:Ljava/lang/String;

    return-void
.end method

.method public static fromCardNumber(Ljava/lang/String;)Lio/card/payment/CardType;
    .locals 5

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lio/card/payment/CardType;->UNKNOWN:Lio/card/payment/CardType;

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {}, Lio/card/payment/CardType;->getIntervalLookup()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Pair;

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {p0, v3, v4}, Lio/card/payment/CardType;->isNumberInInterval(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result p0

    const/4 v1, 0x1

    if-le p0, v1, :cond_3

    sget-object p0, Lio/card/payment/CardType;->INSUFFICIENT_DIGITS:Lio/card/payment/CardType;

    return-object p0

    :cond_3
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result p0

    if-ne p0, v1, :cond_4

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/card/payment/CardType;

    return-object p0

    :cond_4
    sget-object p0, Lio/card/payment/CardType;->UNKNOWN:Lio/card/payment/CardType;

    return-object p0
.end method

.method public static fromString(Ljava/lang/String;)Lio/card/payment/CardType;
    .locals 5

    if-nez p0, :cond_0

    sget-object p0, Lio/card/payment/CardType;->UNKNOWN:Lio/card/payment/CardType;

    return-object p0

    :cond_0
    invoke-static {}, Lio/card/payment/CardType;->values()[Lio/card/payment/CardType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    sget-object v4, Lio/card/payment/CardType;->UNKNOWN:Lio/card/payment/CardType;

    if-eq v3, v4, :cond_2

    sget-object v4, Lio/card/payment/CardType;->INSUFFICIENT_DIGITS:Lio/card/payment/CardType;

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lio/card/payment/CardType;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    return-object v3

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    sget-object p0, Lio/card/payment/CardType;->UNKNOWN:Lio/card/payment/CardType;

    return-object p0
.end method

.method private static getIntervalLookup()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lio/card/payment/CardType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/card/payment/CardType;->intervalLookup:Ljava/util/HashMap;

    return-object v0
.end method

.method private static getNewPair(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    move-object p1, p0

    :cond_0
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, p0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static isNumberInInterval(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    if-ge v3, p1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    if-le p0, p1, :cond_1

    return v2

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/card/payment/CardType;
    .locals 1

    const-class v0, Lio/card/payment/CardType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/card/payment/CardType;

    return-object p0
.end method

.method public static values()[Lio/card/payment/CardType;
    .locals 1

    sget-object v0, Lio/card/payment/CardType;->$VALUES:[Lio/card/payment/CardType;

    invoke-virtual {v0}, [Lio/card/payment/CardType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/card/payment/CardType;

    return-object v0
.end method


# virtual methods
.method public cvvLength()I
    .locals 2

    sget-object v0, Lio/card/payment/CardType$1;->$SwitchMap$io$card$payment$CardType:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, -0x1

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x4

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public getDisplayName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lio/card/payment/CardType$1;->$SwitchMap$io$card$payment$CardType:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    sget-object v0, Lio/card/payment/i18n/StringKey;->CARDTYPE_VISA:Lio/card/payment/i18n/StringKey;

    invoke-static {v0, p1}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object v0, Lio/card/payment/i18n/StringKey;->CARDTYPE_MAESTRO:Lio/card/payment/i18n/StringKey;

    invoke-static {v0, p1}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object v0, Lio/card/payment/i18n/StringKey;->CARDTYPE_MASTERCARD:Lio/card/payment/i18n/StringKey;

    invoke-static {v0, p1}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_3
    sget-object v0, Lio/card/payment/i18n/StringKey;->CARDTYPE_JCB:Lio/card/payment/i18n/StringKey;

    invoke-static {v0, p1}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    sget-object v0, Lio/card/payment/i18n/StringKey;->CARDTYPE_DISCOVER:Lio/card/payment/i18n/StringKey;

    invoke-static {v0, p1}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_5
    sget-object v0, Lio/card/payment/i18n/StringKey;->CARDTYPE_AMERICANEXPRESS:Lio/card/payment/i18n/StringKey;

    invoke-static {v0, p1}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public imageBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 3

    sget-object v0, Lio/card/payment/CardType$1;->$SwitchMap$io$card$payment$CardType:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    sget v0, Lio/card/payment/R$drawable;->cio_ic_visa:I

    goto :goto_0

    :cond_1
    sget v0, Lio/card/payment/R$drawable;->cio_ic_mastercard:I

    goto :goto_0

    :cond_2
    sget v0, Lio/card/payment/R$drawable;->cio_ic_jcb:I

    goto :goto_0

    :cond_3
    sget v0, Lio/card/payment/R$drawable;->cio_ic_discover:I

    goto :goto_0

    :cond_4
    sget v0, Lio/card/payment/R$drawable;->cio_ic_amex:I

    :goto_0
    if-eq v0, v2, :cond_5

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method public numberLength()I
    .locals 2

    sget-object v0, Lio/card/payment/CardType$1;->$SwitchMap$io$card$payment$CardType:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, -0x1

    goto :goto_0

    :pswitch_0
    sget v0, Lio/card/payment/CardType;->minDigits:I

    goto :goto_0

    :pswitch_1
    const/16 v0, 0x10

    goto :goto_0

    :pswitch_2
    const/16 v0, 0xe

    goto :goto_0

    :pswitch_3
    const/16 v0, 0xf

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/card/payment/CardType;->name:Ljava/lang/String;

    return-object v0
.end method
