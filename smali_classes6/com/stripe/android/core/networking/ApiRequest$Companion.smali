.class public final Lcom/stripe/android/core/networking/ApiRequest$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/ApiRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006\"\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/ApiRequest$Companion;",
        "",
        "()V",
        "API_HOST",
        "",
        "getAPI_HOST",
        "()Ljava/lang/String;",
        "apiTestHost",
        "getApiTestHost",
        "setApiTestHost",
        "(Ljava/lang/String;)V",
        "stripe-core_release"
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

    invoke-direct {p0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAPI_HOST()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getApiTestHost()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "https://api.stripe.com"

    :cond_0
    return-object v0
.end method

.method public final getApiTestHost()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/stripe/android/core/networking/ApiRequest;->access$getApiTestHost$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final setApiTestHost(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/stripe/android/core/networking/ApiRequest;->access$setApiTestHost$cp(Ljava/lang/String;)V

    return-void
.end method
