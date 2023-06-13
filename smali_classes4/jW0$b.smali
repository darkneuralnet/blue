.class public final LjW0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjW0;->b(Landroid/content/Intent;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/H<",
        "LcW0;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/H;",
        "LcW0;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/H;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeeplinkManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeeplinkManagerImpl.kt\nco/bird/android/manager/deeplink/DeeplinkManagerImpl$parseBrazeLink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Landroid/content/Intent;

.field public final synthetic h:LjW0;

.field public final synthetic i:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/content/Intent;LjW0;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, LjW0$b;->g:Landroid/content/Intent;

    iput-object p2, p0, LjW0$b;->h:LjW0;

    iput-object p3, p0, LjW0$b;->i:Landroid/net/Uri;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, LjW0$b;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "LcW0;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LjW0$b;->g:Landroid/content/Intent;

    const-string v1, "uri"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LjW0$b;->g:Landroid/content/Intent;

    const-string v2, "source"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Appboy"

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "Braze"

    invoke-static {v1, v2, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    if-eqz v0, :cond_2

    new-instance v1, LKV0;

    iget-object v2, p0, LjW0$b;->h:LjW0;

    iget-object v3, p0, LjW0$b;->i:Landroid/net/Uri;

    invoke-static {v2, v3, v0}, LjW0;->access$mergeQueryParams(LjW0;Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    iget-object v3, p0, LjW0$b;->i:Landroid/net/Uri;

    invoke-direct {v1, v2, v3, v0}, LKV0;-><init>(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V

    invoke-interface {p1, v1}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "No Braze Link detected"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
