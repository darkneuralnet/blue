.class public interface abstract LhY4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LhY4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0008\u0010\n\u001a\u00020\u0004H&J\u0014\u0010\r\u001a\u00020\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH&J\u0014\u0010\u000e\u001a\u00020\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH&J\u0014\u0010\u000f\u001a\u00020\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH&J\"\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&J\u0008\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH&R\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001d8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "LhY4;",
        "",
        "Landroid/content/Intent;",
        "intent",
        "",
        "a",
        "onDestroy",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "onResume",
        "onPause",
        "Lco/bird/android/model/wire/WireRide;",
        "rideOverride",
        "g",
        "b",
        "j",
        "",
        "requestCode",
        "resultCode",
        "data",
        "onActivityResult",
        "",
        "onBackPressed",
        "Landroid/view/Menu;",
        "menu",
        "d",
        "Landroid/view/MenuItem;",
        "item",
        "c",
        "LZ84;",
        "e",
        "()LZ84;",
        "requirementBannerShown",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Landroid/content/Intent;)V
.end method

.method public abstract b(Lco/bird/android/model/wire/WireRide;)V
.end method

.method public abstract c(Landroid/view/MenuItem;)Z
.end method

.method public abstract d(Landroid/view/Menu;)V
.end method

.method public abstract e()LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g(Lco/bird/android/model/wire/WireRide;)V
.end method

.method public abstract j(Lco/bird/android/model/wire/WireRide;)V
.end method

.method public abstract onActivityResult(IILandroid/content/Intent;)V
.end method

.method public abstract onBackPressed()Z
.end method

.method public abstract onDestroy()V
.end method

.method public abstract onPause()V
.end method

.method public abstract onResume(Lcom/uber/autodispose/ScopeProvider;)V
.end method
