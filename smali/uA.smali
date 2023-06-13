.class public abstract LuA;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ConfigurationT:",
        "Lcom/adyen/checkout/components/base/Configuration;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eB\u0019\u0008\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\"J\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\u0007\u001a\u00028\u0000H$\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\t\u0010\u0008R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006#"
    }
    d2 = {
        "LuA;",
        "Lcom/adyen/checkout/components/base/Configuration;",
        "ConfigurationT",
        "",
        "Lcom/adyen/checkout/core/api/Environment;",
        "builderEnvironment",
        "f",
        "b",
        "()Lcom/adyen/checkout/components/base/Configuration;",
        "a",
        "Ljava/util/Locale;",
        "Ljava/util/Locale;",
        "e",
        "()Ljava/util/Locale;",
        "setBuilderShopperLocale",
        "(Ljava/util/Locale;)V",
        "builderShopperLocale",
        "Lcom/adyen/checkout/core/api/Environment;",
        "d",
        "()Lcom/adyen/checkout/core/api/Environment;",
        "setBuilderEnvironment",
        "(Lcom/adyen/checkout/core/api/Environment;)V",
        "",
        "c",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "setBuilderClientKey",
        "(Ljava/lang/String;)V",
        "builderClientKey",
        "<init>",
        "(Ljava/util/Locale;Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V",
        "Landroid/content/Context;",
        "context",
        "clientKey",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "components-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field public a:Ljava/util/Locale;

.field public b:Lcom/adyen/checkout/core/api/Environment;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LEv2;->a(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object p1

    const-string v0, "getLocale(context)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/adyen/checkout/core/api/Environment;->c:Lcom/adyen/checkout/core/api/Environment;

    const-string v1, "TEST"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, p2}, LuA;-><init>(Ljava/util/Locale;Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V
    .locals 1

    const-string v0, "builderShopperLocale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builderEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builderClientKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuA;->a:Ljava/util/Locale;

    iput-object p2, p0, LuA;->b:Lcom/adyen/checkout/core/api/Environment;

    iput-object p3, p0, LuA;->c:Ljava/lang/String;

    sget-object p1, Lzj6;->a:Lzj6;

    invoke-virtual {p1, p3}, Lzj6;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Lcom/adyen/checkout/core/exception/CheckoutException;

    const-string p2, "Client key is not valid."

    invoke-direct {p1, p2}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Lcom/adyen/checkout/components/base/Configuration;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TConfigurationT;"
        }
    .end annotation

    sget-object v0, Lzj6;->a:Lzj6;

    iget-object v1, p0, LuA;->c:Ljava/lang/String;

    iget-object v2, p0, LuA;->b:Lcom/adyen/checkout/core/api/Environment;

    invoke-virtual {v0, v1, v2}, Lzj6;->a(Ljava/lang/String;Lcom/adyen/checkout/core/api/Environment;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LuA;->b()Lcom/adyen/checkout/components/base/Configuration;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcom/adyen/checkout/core/exception/CheckoutException;

    const-string v1, "Client key does not match the environment."

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract b()Lcom/adyen/checkout/components/base/Configuration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TConfigurationT;"
        }
    .end annotation
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LuA;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/adyen/checkout/core/api/Environment;
    .locals 1

    iget-object v0, p0, LuA;->b:Lcom/adyen/checkout/core/api/Environment;

    return-object v0
.end method

.method public final e()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, LuA;->a:Ljava/util/Locale;

    return-object v0
.end method

.method public f(Lcom/adyen/checkout/core/api/Environment;)LuA;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/adyen/checkout/core/api/Environment;",
            ")",
            "LuA<",
            "TConfigurationT;>;"
        }
    .end annotation

    const-string v0, "builderEnvironment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LuA;->b:Lcom/adyen/checkout/core/api/Environment;

    return-object p0
.end method
