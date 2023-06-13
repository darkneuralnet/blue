.class public final enum Lco/bird/android/model/contractor/ContractorDataFieldFormat;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/contractor/ContractorDataFieldFormat;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lco/bird/android/model/contractor/ContractorDataFieldFormat;",
        "",
        "(Ljava/lang/String;I)V",
        "STRING",
        "NUMBER",
        "BOOLEAN",
        "DATETIME",
        "URL",
        "MULTI_SELECT",
        "DROP_DOWN",
        "ZENDESK_ARTICLE",
        "COMPOSITE",
        "AGREEMENT",
        "model_release"
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/contractor/ContractorDataFieldFormat;

.field public static final enum AGREEMENT:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "agreement"
    .end annotation

    .annotation runtime Lft5;
        value = "agreement"
    .end annotation
.end field

.field public static final enum BOOLEAN:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "boolean"
    .end annotation

    .annotation runtime Lft5;
        value = "boolean"
    .end annotation
.end field

.field public static final enum COMPOSITE:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "composite"
    .end annotation

    .annotation runtime Lft5;
        value = "composite"
    .end annotation
.end field

.field public static final enum DATETIME:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "datetime"
    .end annotation

    .annotation runtime Lft5;
        value = "datetime"
    .end annotation
.end field

.field public static final enum DROP_DOWN:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "drop_down"
    .end annotation

    .annotation runtime Lft5;
        value = "drop_down"
    .end annotation
.end field

.field public static final enum MULTI_SELECT:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "multi_select"
    .end annotation

    .annotation runtime Lft5;
        value = "multi_select"
    .end annotation
.end field

.field public static final enum NUMBER:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "number"
    .end annotation

    .annotation runtime Lft5;
        value = "number"
    .end annotation
.end field

.field public static final enum STRING:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "string"
    .end annotation

    .annotation runtime Lft5;
        value = "string"
    .end annotation
.end field

.field public static final enum URL:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "url"
    .end annotation

    .annotation runtime Lft5;
        value = "url"
    .end annotation
.end field

.field public static final enum ZENDESK_ARTICLE:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "zendesk_article"
    .end annotation

    .annotation runtime Lft5;
        value = "zendesk_article"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->STRING:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->NUMBER:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->BOOLEAN:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->DATETIME:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->URL:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->MULTI_SELECT:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->DROP_DOWN:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->ZENDESK_ARTICLE:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->COMPOSITE:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->AGREEMENT:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "STRING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->STRING:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "NUMBER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->NUMBER:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->BOOLEAN:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "DATETIME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->DATETIME:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "URL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->URL:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "MULTI_SELECT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->MULTI_SELECT:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "DROP_DOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->DROP_DOWN:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "ZENDESK_ARTICLE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->ZENDESK_ARTICLE:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "COMPOSITE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->COMPOSITE:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    const-string v1, "AGREEMENT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->AGREEMENT:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    invoke-static {}, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->$values()[Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->$VALUES:[Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .locals 1

    const-class v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .locals 1

    sget-object v0, Lco/bird/android/model/contractor/ContractorDataFieldFormat;->$VALUES:[Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    return-object v0
.end method
