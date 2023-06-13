.class public final Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose$Companion;",
        "",
        "()V",
        "fromWire",
        "Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;",
        "value",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromWire(Ljava/lang/String;)Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;->UNKNOWN:Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;->valueOf(Ljava/lang/String;)Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p1, Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;->UNKNOWN:Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;

    :goto_0
    return-object p1
.end method
