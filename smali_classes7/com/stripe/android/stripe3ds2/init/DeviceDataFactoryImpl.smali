.class public final Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u001d\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;",
        "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;",
        "context",
        "Landroid/content/Context;",
        "hardwareIdSupplier",
        "Lcom/stripe/android/stripe3ds2/utils/Supplier;",
        "Lcom/stripe/android/stripe3ds2/init/HardwareId;",
        "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/Supplier;)V",
        "displayMetrics",
        "Landroid/util/DisplayMetrics;",
        "create",
        "",
        "",
        "",
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
.field private final displayMetrics:Landroid/util/DisplayMetrics;

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
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/Supplier;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/stripe3ds2/utils/Supplier<",
            "Lcom/stripe/android/stripe3ds2/init/HardwareId;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hardwareIdSupplier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->hardwareIdSupplier:Lcom/stripe/android/stripe3ds2/utils/Supplier;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const-string p2, "context.resources.displayMetrics"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->displayMetrics:Landroid/util/DisplayMetrics;

    return-void
.end method


# virtual methods
.method public create()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->hardwareIdSupplier:Lcom/stripe/android/stripe3ds2/utils/Supplier;

    invoke-interface {v0}, Lcom/stripe/android/stripe3ds2/utils/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/HardwareId;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/init/HardwareId;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    new-array v1, v1, [Lkotlin/Pair;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PLATFORM:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Android"

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v1, v5

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x3

    aput-object v2, v1, v6

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LOCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v6, v4, [Ljava/util/Locale;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    aput-object v7, v6, v3

    invoke-static {v6}, Lvv2;->a([Ljava/util/Locale;)Lvv2;

    move-result-object v6

    invoke-virtual {v6}, Lvv2;->i()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x4

    aput-object v2, v1, v6

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/TimeZone;->getDisplayName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x5

    aput-object v2, v1, v6

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SCREEN_RESOLUTION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    new-array v7, v5, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v3

    iget-object v8, p0, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v4

    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const-string v7, "%sx%s"

    invoke-static {v6, v7, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "format(locale, format, *args)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v5, 0x6

    aput-object v2, v1, v5

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    move v3, v4

    :cond_0
    if-eqz v3, :cond_1

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_HARDWARE_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :goto_0
    invoke-static {v1, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
