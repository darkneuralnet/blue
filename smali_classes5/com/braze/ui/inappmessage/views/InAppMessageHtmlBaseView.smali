.class public abstract Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements LEO1;


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mInAppMessageWebViewClient:LEZ1;

.field private mIsFinished:Z

.field protected mMessageWebView:Landroid/webkit/WebView;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mIsFinished:Z

    return-void
.end method

.method public static synthetic access$000()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LDZ1;->a()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public finishWebViewDisplay()V
    .locals 2

    sget-object v0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->TAG:Ljava/lang/String;

    const-string v1, "Finishing WebView display"

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mIsFinished:Z

    iget-object v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    const-string v1, "about:blank"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    iget-object v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    :cond_0
    return-void
.end method

.method public getMessageClickableView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getMessageWebView()Landroid/webkit/WebView;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mIsFinished:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->TAG:Ljava/lang/String;

    const-string v2, "Cannot return the WebView for an already finished message"

    invoke-static {v0, v2}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->getWebViewViewId()I

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->TAG:Ljava/lang/String;

    const-string v2, "Cannot find WebView. getWebViewViewId() returned 0."

    invoke-static {v0, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    iget-object v2, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    iput-object v2, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    if-nez v2, :cond_3

    sget-object v2, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "findViewById for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " returned null. Returning null for WebView."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_3
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    iget-object v4, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    const/4 v5, 0x2

    invoke-virtual {v4, v5, v1}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    :try_start_0
    const-string v1, "FORCE_DARK"

    invoke-static {v1}, LqA6;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LWt6;->g(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0, v5}, LcA6;->b(Landroid/webkit/WebSettings;I)V

    :cond_4
    const-string v1, "FORCE_DARK_STRATEGY"

    invoke-static {v1}, LqA6;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, v2}, LcA6;->c(Landroid/webkit/WebSettings;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->TAG:Ljava/lang/String;

    const-string v2, "Failed to set dark mode WebView settings"

    invoke-static {v1, v2, v0}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    new-instance v1, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$a;

    invoke-direct {v1, p0}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$a;-><init>(Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    iget-object v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mMessageWebView:Landroid/webkit/WebView;

    return-object v0
.end method

.method public abstract getWebViewViewId()I
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LDZ1;->a()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public setHtmlPageFinishedListener(LpP1;)V
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mInAppMessageWebViewClient:LEZ1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LEZ1;->e(LpP1;)V

    :cond_0
    return-void
.end method

.method public setInAppMessageWebViewClient(LEZ1;)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->getMessageWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iput-object p1, p0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->mInAppMessageWebViewClient:LEZ1;

    return-void
.end method

.method public setWebViewContent(Ljava/lang/String;)V
    .locals 6

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->getMessageWebView()Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "file:///"

    const-string v3, "text/html"

    const-string v4, "utf-8"

    const/4 v5, 0x0

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setWebViewContent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->getMessageWebView()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "text/html"

    const-string v4, "utf-8"

    const/4 v5, 0x0

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
