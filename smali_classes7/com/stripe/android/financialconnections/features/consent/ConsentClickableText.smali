.class public final enum Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;",
        "",
        "value",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "DATA",
        "LEGAL_DETAILS",
        "MANUAL_ENTRY",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

.field public static final enum DATA:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

.field public static final enum LEGAL_DETAILS:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

.field public static final enum MANUAL_ENTRY:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->DATA:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->LEGAL_DETAILS:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->MANUAL_ENTRY:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    const/4 v1, 0x0

    const-string v2, "stripe://data-access-notice"

    const-string v3, "DATA"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->DATA:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    const/4 v1, 0x1

    const-string v2, "stripe://legal-details-notice"

    const-string v3, "LEGAL_DETAILS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->LEGAL_DETAILS:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    const/4 v1, 0x2

    const-string v2, "stripe://manual-entry"

    const-string v3, "MANUAL_ENTRY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->MANUAL_ENTRY:Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    invoke-static {}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->$values()[Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->$VALUES:[Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

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

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->value:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->$VALUES:[Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->value:Ljava/lang/String;

    return-object v0
.end method
