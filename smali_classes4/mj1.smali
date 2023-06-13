.class public final Lmj1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llj1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u0011\u001a\u00020\u000c\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\t\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lmj1;",
        "Llj1;",
        "",
        "event",
        "Landroid/os/Bundle;",
        "parameters",
        "",
        "logEvent",
        "Landroid/content/Context;",
        "a",
        "Landroid/content/Context;",
        "context",
        "LTq4;",
        "b",
        "LTq4;",
        "getReactiveConfig",
        "()LTq4;",
        "reactiveConfig",
        "LOh;",
        "c",
        "LOh;",
        "getAppBuildConfig",
        "()LOh;",
        "appBuildConfig",
        "LXi;",
        "d",
        "LXi;",
        "()LXi;",
        "eventLogger",
        "<init>",
        "(Landroid/content/Context;LTq4;LOh;)V",
        "facebook_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LTq4;

.field public final c:LOh;

.field public final d:LXi;


# direct methods
.method public constructor <init>(Landroid/content/Context;LTq4;LOh;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appBuildConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmj1;->a:Landroid/content/Context;

    iput-object p2, p0, Lmj1;->b:LTq4;

    iput-object p3, p0, Lmj1;->c:LOh;

    invoke-virtual {p2}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getThirdPartyConfig()Lco/bird/android/model/wire/configs/ThirdPartyConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ThirdPartyConfig;->getFacebook()Lco/bird/android/model/wire/configs/FacebookConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/FacebookConfig;->getEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-static {p1}, Lcom/facebook/a;->G(Z)V

    invoke-static {}, Lcom/facebook/a;->c()V

    invoke-virtual {p2}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getThirdPartyConfig()Lco/bird/android/model/wire/configs/ThirdPartyConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ThirdPartyConfig;->getFacebook()Lco/bird/android/model/wire/configs/FacebookConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/FacebookConfig;->getAdvertiserIdCollectionEnabled()Z

    move-result p1

    invoke-static {p1}, Lcom/facebook/a;->F(Z)V

    invoke-interface {p3}, LOh;->k()Z

    move-result p1

    invoke-static {p1}, Lcom/facebook/a;->H(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()LXi;
    .locals 1

    iget-object v0, p0, Lmj1;->d:LXi;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/a;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lmj1;->a:Landroid/content/Context;

    invoke-static {v0}, LXi;->h(Landroid/content/Context;)LXi;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lmj1;->d:LXi;

    :goto_0
    return-object v0
.end method

.method public logEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmj1;->a()LXi;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LXi;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method
