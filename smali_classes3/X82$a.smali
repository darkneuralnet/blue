.class public final LX82$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX82;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireQuickLink;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireQuickLink;",
        "kotlin.jvm.PlatformType",
        "quickLink",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireQuickLink;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LX82;


# direct methods
.method public constructor <init>(LX82;)V
    .locals 0

    iput-object p1, p0, LX82$a;->g:LX82;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireQuickLink;)V
    .locals 9

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireQuickLink;->getLinkBehavior()Lco/bird/android/model/constant/QuickLinkBehavior;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/QuickLinkBehavior;->EXTERNAL_WEB_VIEW:Lco/bird/android/model/constant/QuickLinkBehavior;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireQuickLink;->getUrl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v0, p0, LX82$a;->g:LX82;

    invoke-static {v0}, LX82;->access$getNavigator$p(LX82;)Le13;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireQuickLink;->getDisplay()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Le13$a;->goToWebView$default(Le13;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireQuickLink;

    invoke-virtual {p0, p1}, LX82$a;->a(Lco/bird/android/model/wire/WireQuickLink;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
