.class public final enum Lco/bird/android/model/OnBoardingStep;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/OnBoardingStep;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/OnBoardingStep;",
        "",
        "(Ljava/lang/String;I)V",
        "NO_CONTRACTOR",
        "BASIC_INFO",
        "TAX_INFO",
        "ACCOUNT_INFO",
        "AGREEMENT",
        "TUTORIALS",
        "POWER_SUPPLIES_DEPOSIT",
        "ADDRESS_CONFIRMATION",
        "DONE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/OnBoardingStep;

.field public static final enum ACCOUNT_INFO:Lco/bird/android/model/OnBoardingStep;

.field public static final enum ADDRESS_CONFIRMATION:Lco/bird/android/model/OnBoardingStep;

.field public static final enum AGREEMENT:Lco/bird/android/model/OnBoardingStep;

.field public static final enum BASIC_INFO:Lco/bird/android/model/OnBoardingStep;

.field public static final enum DONE:Lco/bird/android/model/OnBoardingStep;

.field public static final enum NO_CONTRACTOR:Lco/bird/android/model/OnBoardingStep;

.field public static final enum POWER_SUPPLIES_DEPOSIT:Lco/bird/android/model/OnBoardingStep;

.field public static final enum TAX_INFO:Lco/bird/android/model/OnBoardingStep;

.field public static final enum TUTORIALS:Lco/bird/android/model/OnBoardingStep;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/OnBoardingStep;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Lco/bird/android/model/OnBoardingStep;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/OnBoardingStep;->NO_CONTRACTOR:Lco/bird/android/model/OnBoardingStep;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/OnBoardingStep;->BASIC_INFO:Lco/bird/android/model/OnBoardingStep;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/OnBoardingStep;->TAX_INFO:Lco/bird/android/model/OnBoardingStep;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/OnBoardingStep;->ACCOUNT_INFO:Lco/bird/android/model/OnBoardingStep;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/OnBoardingStep;->AGREEMENT:Lco/bird/android/model/OnBoardingStep;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/OnBoardingStep;->TUTORIALS:Lco/bird/android/model/OnBoardingStep;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/OnBoardingStep;->POWER_SUPPLIES_DEPOSIT:Lco/bird/android/model/OnBoardingStep;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/OnBoardingStep;->ADDRESS_CONFIRMATION:Lco/bird/android/model/OnBoardingStep;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/OnBoardingStep;->DONE:Lco/bird/android/model/OnBoardingStep;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/OnBoardingStep;

    const-string v1, "NO_CONTRACTOR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/OnBoardingStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->NO_CONTRACTOR:Lco/bird/android/model/OnBoardingStep;

    new-instance v0, Lco/bird/android/model/OnBoardingStep;

    const-string v1, "BASIC_INFO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/OnBoardingStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->BASIC_INFO:Lco/bird/android/model/OnBoardingStep;

    new-instance v0, Lco/bird/android/model/OnBoardingStep;

    const-string v1, "TAX_INFO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/OnBoardingStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->TAX_INFO:Lco/bird/android/model/OnBoardingStep;

    new-instance v0, Lco/bird/android/model/OnBoardingStep;

    const-string v1, "ACCOUNT_INFO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/OnBoardingStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->ACCOUNT_INFO:Lco/bird/android/model/OnBoardingStep;

    new-instance v0, Lco/bird/android/model/OnBoardingStep;

    const-string v1, "AGREEMENT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/OnBoardingStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->AGREEMENT:Lco/bird/android/model/OnBoardingStep;

    new-instance v0, Lco/bird/android/model/OnBoardingStep;

    const-string v1, "TUTORIALS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/OnBoardingStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->TUTORIALS:Lco/bird/android/model/OnBoardingStep;

    new-instance v0, Lco/bird/android/model/OnBoardingStep;

    const-string v1, "POWER_SUPPLIES_DEPOSIT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/OnBoardingStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->POWER_SUPPLIES_DEPOSIT:Lco/bird/android/model/OnBoardingStep;

    new-instance v0, Lco/bird/android/model/OnBoardingStep;

    const-string v1, "ADDRESS_CONFIRMATION"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/OnBoardingStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->ADDRESS_CONFIRMATION:Lco/bird/android/model/OnBoardingStep;

    new-instance v0, Lco/bird/android/model/OnBoardingStep;

    const-string v1, "DONE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/OnBoardingStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->DONE:Lco/bird/android/model/OnBoardingStep;

    invoke-static {}, Lco/bird/android/model/OnBoardingStep;->$values()[Lco/bird/android/model/OnBoardingStep;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/OnBoardingStep;->$VALUES:[Lco/bird/android/model/OnBoardingStep;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/OnBoardingStep;
    .locals 1

    const-class v0, Lco/bird/android/model/OnBoardingStep;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/OnBoardingStep;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/OnBoardingStep;
    .locals 1

    sget-object v0, Lco/bird/android/model/OnBoardingStep;->$VALUES:[Lco/bird/android/model/OnBoardingStep;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/OnBoardingStep;

    return-object v0
.end method
