.class public final LaW0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u000c\u0010\u0008\u001a\u00020\u0007*\u00020\u0000H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "Landroid/content/Intent;",
        "intent",
        "LKV0;",
        "b",
        "LcW0;",
        "result",
        "a",
        "",
        "d",
        "deeplink_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeepLinkNavigatorResolverImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkNavigatorResolverImpl.kt\nco/bird/android/lib/deeplink/DeepLinkNavigatorResolverImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,537:1\n1#2:538\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroid/content/Intent;LcW0;)Landroid/content/Intent;
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    instance-of p0, p1, LKV0;

    if-eqz p0, :cond_0

    check-cast p1, LKV0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, LKV0;->d()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    :cond_1
    return-object v0
.end method

.method public static final synthetic access$copyWithDataFrom(Landroid/content/Intent;LcW0;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0, p1}, LaW0;->a(Landroid/content/Intent;LcW0;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fallbackDeepLink(Landroid/content/Intent;)LKV0;
    .locals 0

    invoke-static {p0}, LaW0;->b(Landroid/content/Intent;)LKV0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isDeepLink(Landroid/content/Intent;)Z
    .locals 0

    invoke-static {p0}, LaW0;->d(Landroid/content/Intent;)Z

    move-result p0

    return p0
.end method

.method public static final b(Landroid/content/Intent;)LKV0;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    new-instance v1, LKV0;

    invoke-direct {v1, p0, p0, v0}, LKV0;-><init>(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V

    return-object v1
.end method

.method public static synthetic c(Landroid/content/Intent;ILjava/lang/Object;)LKV0;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LaW0;->b(Landroid/content/Intent;)LKV0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroid/content/Intent;)Z
    .locals 1

    const-string v0, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
