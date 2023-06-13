.class public final Lcom/stripe/android/Stripe$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/Stripe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0008\u0010\u0002R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u000b\u0010\u0002\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR&\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0012\u0010\u0002\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/Stripe$Companion;",
        "",
        "()V",
        "API_VERSION",
        "",
        "VERSION",
        "getVERSION$annotations",
        "VERSION_NAME",
        "getVERSION_NAME$annotations",
        "advancedFraudSignalsEnabled",
        "",
        "getAdvancedFraudSignalsEnabled$annotations",
        "getAdvancedFraudSignalsEnabled",
        "()Z",
        "setAdvancedFraudSignalsEnabled",
        "(Z)V",
        "appInfo",
        "Lcom/stripe/android/core/AppInfo;",
        "getAppInfo$annotations",
        "getAppInfo",
        "()Lcom/stripe/android/core/AppInfo;",
        "setAppInfo",
        "(Lcom/stripe/android/core/AppInfo;)V",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/Stripe$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getAdvancedFraudSignalsEnabled$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method

.method public static synthetic getAppInfo$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method

.method public static synthetic getVERSION$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use StripeSdkVersion.VERSION instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "StripeSdkVersion.VERSION"
            imports = {
                "com.stripe.android.core.version.StripeSdkVersion"
            }
        .end subannotation
    .end annotation

    return-void
.end method

.method public static synthetic getVERSION_NAME$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use StripeSdkVersion.VERSION_NAME instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "StripeSdkVersion.VERSION_NAME"
            imports = {
                "com.stripe.android.core.version.StripeSdkVersion"
            }
        .end subannotation
    .end annotation

    return-void
.end method


# virtual methods
.method public final getAdvancedFraudSignalsEnabled()Z
    .locals 1

    invoke-static {}, Lcom/stripe/android/Stripe;->access$getAdvancedFraudSignalsEnabled$cp()Z

    move-result v0

    return v0
.end method

.method public final getAppInfo()Lcom/stripe/android/core/AppInfo;
    .locals 1

    invoke-static {}, Lcom/stripe/android/Stripe;->access$getAppInfo$cp()Lcom/stripe/android/core/AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public final setAdvancedFraudSignalsEnabled(Z)V
    .locals 0

    invoke-static {p1}, Lcom/stripe/android/Stripe;->access$setAdvancedFraudSignalsEnabled$cp(Z)V

    return-void
.end method

.method public final setAppInfo(Lcom/stripe/android/core/AppInfo;)V
    .locals 0

    invoke-static {p1}, Lcom/stripe/android/Stripe;->access$setAppInfo$cp(Lcom/stripe/android/core/AppInfo;)V

    return-void
.end method
