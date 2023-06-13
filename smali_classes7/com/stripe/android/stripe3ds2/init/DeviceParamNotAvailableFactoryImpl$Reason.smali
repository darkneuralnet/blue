.class public final enum Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Reason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;",
        "",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "toString",
        "MARKET_OR_REGION_RESTRICTION",
        "PLATFORM_VERSION",
        "PERMISSION",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

.field public static final enum MARKET_OR_REGION_RESTRICTION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

.field public static final enum PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

.field public static final enum PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->MARKET_OR_REGION_RESTRICTION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    const/4 v1, 0x0

    const-string v2, "RE01"

    const-string v3, "MARKET_OR_REGION_RESTRICTION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->MARKET_OR_REGION_RESTRICTION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    const/4 v1, 0x1

    const-string v2, "RE02"

    const-string v3, "PLATFORM_VERSION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    const/4 v1, 0x2

    const-string v2, "RE03"

    const-string v3, "PERMISSION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-static {}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->$values()[Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->$VALUES:[Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

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

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->code:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;
    .locals 1

    const-class v0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->$VALUES:[Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->code:Ljava/lang/String;

    return-object v0
.end method
