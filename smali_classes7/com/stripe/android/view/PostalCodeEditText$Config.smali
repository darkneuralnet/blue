.class public final enum Lcom/stripe/android/view/PostalCodeEditText$Config;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/PostalCodeEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Config"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/view/PostalCodeEditText$Config;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/stripe/android/view/PostalCodeEditText$Config;",
        "",
        "(Ljava/lang/String;I)V",
        "Global",
        "US",
        "payments-core_release"
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/view/PostalCodeEditText$Config;

.field public static final enum Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

.field public static final enum US:Lcom/stripe/android/view/PostalCodeEditText$Config;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/view/PostalCodeEditText$Config;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/stripe/android/view/PostalCodeEditText$Config;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/view/PostalCodeEditText$Config;->Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/view/PostalCodeEditText$Config;->US:Lcom/stripe/android/view/PostalCodeEditText$Config;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/view/PostalCodeEditText$Config;

    const-string v1, "Global"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/PostalCodeEditText$Config;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/view/PostalCodeEditText$Config;->Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

    new-instance v0, Lcom/stripe/android/view/PostalCodeEditText$Config;

    const-string v1, "US"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/view/PostalCodeEditText$Config;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/view/PostalCodeEditText$Config;->US:Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-static {}, Lcom/stripe/android/view/PostalCodeEditText$Config;->$values()[Lcom/stripe/android/view/PostalCodeEditText$Config;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/view/PostalCodeEditText$Config;->$VALUES:[Lcom/stripe/android/view/PostalCodeEditText$Config;

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

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/view/PostalCodeEditText$Config;
    .locals 1

    const-class v0, Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/view/PostalCodeEditText$Config;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/view/PostalCodeEditText$Config;
    .locals 1

    sget-object v0, Lcom/stripe/android/view/PostalCodeEditText$Config;->$VALUES:[Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/view/PostalCodeEditText$Config;

    return-object v0
.end method
