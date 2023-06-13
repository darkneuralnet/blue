.class public final synthetic LCh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;


# instance fields
.field public final synthetic a:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCh0;->a:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;

    return-void
.end method


# virtual methods
.method public final onHtmlSubmit(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LCh0;->a:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;

    invoke-static {v0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->a(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;Ljava/lang/String;)V

    return-void
.end method
