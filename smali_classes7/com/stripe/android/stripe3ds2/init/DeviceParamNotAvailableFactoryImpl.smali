.class public final Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0008\u0010\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005B\u001d\u0008\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0008J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0011\u0010\r\u001a\u0004\u0008\u0012\u0010\u000fR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0014\u0010\r\u001a\u0004\u0008\u0015\u0010\u000f\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;",
        "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;",
        "hardwareIdSupplier",
        "Lcom/stripe/android/stripe3ds2/utils/Supplier;",
        "Lcom/stripe/android/stripe3ds2/init/HardwareId;",
        "(Lcom/stripe/android/stripe3ds2/utils/Supplier;)V",
        "apiVersion",
        "",
        "(ILcom/stripe/android/stripe3ds2/utils/Supplier;)V",
        "marketOrRegionRestrictionParams",
        "",
        "",
        "getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations",
        "()V",
        "getMarketOrRegionRestrictionParams$3ds2sdk_release",
        "()Ljava/util/Map;",
        "permissionParams",
        "getPermissionParams$3ds2sdk_release$annotations",
        "getPermissionParams$3ds2sdk_release",
        "platformVersionParams",
        "getPlatformVersionParams$3ds2sdk_release$annotations",
        "getPlatformVersionParams$3ds2sdk_release",
        "create",
        "Reason",
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


# instance fields
.field private final apiVersion:I

.field private final hardwareIdSupplier:Lcom/stripe/android/stripe3ds2/utils/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/stripe3ds2/utils/Supplier<",
            "Lcom/stripe/android/stripe3ds2/init/HardwareId;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/stripe/android/stripe3ds2/utils/Supplier;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/stripe/android/stripe3ds2/utils/Supplier<",
            "Lcom/stripe/android/stripe3ds2/init/HardwareId;",
            ">;)V"
        }
    .end annotation

    const-string v0, "hardwareIdSupplier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->hardwareIdSupplier:Lcom/stripe/android/stripe3ds2/utils/Supplier;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/utils/Supplier;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/stripe3ds2/utils/Supplier<",
            "Lcom/stripe/android/stripe3ds2/init/HardwareId;",
            ">;)V"
        }
    .end annotation

    const-string v0, "hardwareIdSupplier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;-><init>(ILcom/stripe/android/stripe3ds2/utils/Supplier;)V

    return-void
.end method

.method public static synthetic getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPermissionParams$3ds2sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPlatformVersionParams$3ds2sdk_release$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public create()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->getMarketOrRegionRestrictionParams$3ds2sdk_release()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->getPlatformVersionParams$3ds2sdk_release()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->getPermissionParams$3ds2sdk_release()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getMarketOrRegionRestrictionParams$3ds2sdk_release()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x8

    new-array v1, v1, [Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PLATFORM:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v4, v1, v2

    const/4 v2, 0x2

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v4, v1, v2

    const/4 v2, 0x3

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v4, v1, v2

    const/4 v2, 0x4

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LOCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v4, v1, v2

    const/4 v2, 0x5

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v4, v1, v2

    const/4 v2, 0x6

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_HARDWARE_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v4, v1, v2

    const/4 v2, 0x7

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SCREEN_RESOLUTION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v4, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->values()[Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    move-result-object v2

    array-length v4, v2

    :goto_0
    if-ge v3, v4, :cond_1

    aget-object v5, v2, v3

    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v5}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->MARKET_OR_REGION_RESTRICTION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v6}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final getPermissionParams$3ds2sdk_release()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_MAC:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_BSSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_SSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_NETWORK_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_P2P_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_TDLS_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LATITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LONGITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->hardwareIdSupplier:Lcom/stripe/android/stripe3ds2/utils/Supplier;

    invoke-interface {v1}, Lcom/stripe/android/stripe3ds2/utils/Supplier;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/stripe3ds2/init/HardwareId;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/HardwareId;->isPresent()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_HARDWARE_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_ADDRESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_BONDED_DEVICE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_IS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_DEVICE_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SUBSCRIBER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IMEI_SV:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_GROUP_IDENTIFIER_L1:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_SERIAL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_VOICE_MAIL_ALPHA_TAG:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_VOICE_MAIL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_TTY_MODE_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_WORLD_PHONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SERIAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_INSTALL_NON_MARKET_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final getPlatformVersionParams$3ds2sdk_release()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_0

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IMEI_SV:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SERIAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_INSTALL_NON_MARKET_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_1

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_PHONE_COUNT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_TTY_MODE_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_WORLD_PHONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_PREVIEW_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_SECURITY_PATCH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_VIBRATE_WHEN_RINGING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    if-le v1, v2, :cond_2

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_SYS_PROP_SETTING_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x16

    if-ge v1, v2, :cond_3

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_VOICE_CAPABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v0
.end method
