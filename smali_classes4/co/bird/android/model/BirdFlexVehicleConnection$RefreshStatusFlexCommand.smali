.class public final Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/BirdFlexVehicleConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RefreshStatusFlexCommand"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;",
        "Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;",
        "token",
        "",
        "constructor-impl",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "command",
        "getCommand-impl",
        "getToken",
        "()Ljava/lang/String;",
        "equals",
        "",
        "other",
        "",
        "equals-impl",
        "(Ljava/lang/String;Ljava/lang/Object;)Z",
        "hashCode",
        "",
        "hashCode-impl",
        "(Ljava/lang/String;)I",
        "toString",
        "toString-impl",
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

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# instance fields
.field private final token:Ljava/lang/String;


# direct methods
.method private synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->token:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic box-impl(Ljava/lang/String;)Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;
    .locals 1

    new-instance v0, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;

    invoke-direct {v0, p0}, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static constructor-impl(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "token"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static equals-impl(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;

    invoke-virtual {p1}, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->unbox-impl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static getCommand-impl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AT+OKALC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ",0001$\r\n"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getPayload-impl(Ljava/lang/String;)[B
    .locals 0

    invoke-static {p0}, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->box-impl(Ljava/lang/String;)Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->getPayload()[B

    move-result-object p0

    return-object p0
.end method

.method public static hashCode-impl(Ljava/lang/String;)I
    .locals 0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    return p0
.end method

.method public static toString-impl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RefreshStatusFlexCommand(token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->token:Ljava/lang/String;

    invoke-static {v0, p1}, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->equals-impl(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getCommand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->token:Ljava/lang/String;

    invoke-static {v0}, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->getCommand-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPayload()[B
    .locals 1

    invoke-static {p0}, Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand$DefaultImpls;->getPayload(Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;)[B

    move-result-object v0

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->token:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->token:Ljava/lang/String;

    invoke-static {v0}, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->hashCode-impl(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->token:Ljava/lang/String;

    invoke-static {v0}, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;->token:Ljava/lang/String;

    return-object v0
.end method
