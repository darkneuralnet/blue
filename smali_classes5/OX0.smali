.class public LOX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJO1;


# static fields
.field private static final TAG:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, LOX0;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LOX0;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getInAppMessageManager()Li20;
    .locals 1

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    return-object v0
.end method

.method public static logHtmlInAppMessageClick(LwO1;Landroid/os/Bundle;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "abButtonId"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast p0, LyO1;

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, LyO1;->d0(Ljava/lang/String;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LwO1;->h0()LzT2;

    move-result-object p1

    sget-object v0, LzT2;->e:LzT2;

    if-ne p1, v0, :cond_1

    invoke-interface {p0}, LwO1;->logClick()Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static parseCustomEventNameFromQueryBundle(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static parsePropertiesFromQueryBundle(Landroid/os/Bundle;)Ls20;
    .locals 5

    new-instance v0, Ls20;

    invoke-direct {v0}, Ls20;-><init>()V

    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "name"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LjS5;->g(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v0, v2, v3}, Ls20;->a(Ljava/lang/String;Ljava/lang/Object;)Ls20;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static parseUseWebViewFromQueryBundle(LwO1;Landroid/os/Bundle;)Z
    .locals 6

    const-string v0, "abDeepLink"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    move v1, v2

    goto :goto_0

    :cond_0
    move v0, v3

    move v1, v0

    :goto_0
    const-string v4, "abExternalOpen"

    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    move v1, v2

    goto :goto_1

    :cond_1
    move p1, v3

    :goto_1
    invoke-interface {p0}, LwO1;->getOpenUriInWebView()Z

    move-result p0

    if-eqz v1, :cond_3

    if-nez v0, :cond_2

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    move p0, v2

    :cond_3
    return p0
.end method


# virtual methods
.method public onCloseAction(LwO1;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    sget-object v0, LOX0;->TAG:Ljava/lang/String;

    const-string v1, "IInAppMessageWebViewClientListener.onCloseAction called."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, p3}, LOX0;->logHtmlInAppMessageClick(LwO1;Landroid/os/Bundle;)V

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Li20;->t(Z)V

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->g()LvO1;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LvO1;->b(LwO1;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public onCustomEventAction(LwO1;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    sget-object v0, LOX0;->TAG:Ljava/lang/String;

    const-string v1, "IInAppMessageWebViewClientListener.onCustomEventAction called."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object v1

    invoke-virtual {v1}, LwZ1;->a()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_0

    const-string p1, "Can\'t perform custom event action because the activity is null."

    invoke-static {v0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->g()LvO1;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LvO1;->a(LwO1;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {p3}, LOX0;->parseCustomEventNameFromQueryBundle(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LjS5;->g(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-void

    :cond_1
    invoke-static {p3}, LOX0;->parsePropertiesFromQueryBundle(Landroid/os/Bundle;)Ls20;

    move-result-object p2

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object p3

    invoke-virtual {p3}, LwZ1;->a()Landroid/app/Activity;

    move-result-object p3

    invoke-static {p3}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;Ls20;)V

    :cond_2
    return-void
.end method

.method public onNewsfeedAction(LwO1;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    sget-object v0, LOX0;->TAG:Ljava/lang/String;

    const-string v1, "IInAppMessageWebViewClientListener.onNewsfeedAction called."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object v1

    invoke-virtual {v1}, LwZ1;->a()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_0

    const-string p1, "Can\'t perform news feed action because the cached activity is null."

    invoke-static {v0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p1, p3}, LOX0;->logHtmlInAppMessageClick(LwO1;Landroid/os/Bundle;)V

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->g()LvO1;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LvO1;->c(LwO1;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, LwO1;->K(Z)V

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object p3

    invoke-virtual {p3, p2}, Li20;->t(Z)V

    new-instance p2, Ld83;

    invoke-interface {p1}, LwO1;->getExtras()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Le70;->a(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object p1

    sget-object p3, Lcom/appboy/enums/Channel;->INAPP_MESSAGE:Lcom/appboy/enums/Channel;

    invoke-direct {p2, p1, p3}, Ld83;-><init>(Landroid/os/Bundle;Lcom/appboy/enums/Channel;)V

    invoke-static {}, Lb20;->h()LdO1;

    move-result-object p1

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object p3

    invoke-virtual {p3}, LwZ1;->a()Landroid/app/Activity;

    move-result-object p3

    invoke-interface {p1, p3, p2}, LdO1;->d(Landroid/content/Context;Ld83;)V

    :cond_1
    return-void
.end method

.method public onOtherUrlAction(LwO1;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    sget-object v0, LOX0;->TAG:Ljava/lang/String;

    const-string v1, "IInAppMessageWebViewClientListener.onOtherUrlAction called."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object v1

    invoke-virtual {v1}, LwZ1;->a()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Can\'t perform other url action because the cached activity is null. Url: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p1, p3}, LOX0;->logHtmlInAppMessageClick(LwO1;Landroid/os/Bundle;)V

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object v1

    invoke-virtual {v1}, LwZ1;->g()LvO1;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, LvO1;->onOtherUrlAction(LwO1;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p1, p3}, LOX0;->parseUseWebViewFromQueryBundle(LwO1;Landroid/os/Bundle;)Z

    move-result v1

    invoke-interface {p1}, LwO1;->getExtras()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Le70;->a(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v2, p3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    invoke-static {}, Lb20;->h()LdO1;

    move-result-object p3

    sget-object v3, Lcom/appboy/enums/Channel;->INAPP_MESSAGE:Lcom/appboy/enums/Channel;

    invoke-interface {p3, p2, v2, v1, v3}, LdO1;->b(Ljava/lang/String;Landroid/os/Bundle;ZLcom/appboy/enums/Channel;)LCf6;

    move-result-object p3

    if-nez p3, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p3}, LCf6;->f()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lc20;->e(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Not passing local uri to BrazeDeeplinkHandler. Got local uri: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " for url: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const/4 p2, 0x0

    invoke-interface {p1, p2}, LwO1;->K(Z)V

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object p1

    invoke-virtual {p1, p2}, Li20;->t(Z)V

    invoke-static {}, Lb20;->h()LdO1;

    move-result-object p1

    invoke-direct {p0}, LOX0;->getInAppMessageManager()Li20;

    move-result-object p2

    invoke-virtual {p2}, LwZ1;->a()Landroid/app/Activity;

    move-result-object p2

    invoke-interface {p1, p2, p3}, LdO1;->c(Landroid/content/Context;LCf6;)V

    return-void
.end method
