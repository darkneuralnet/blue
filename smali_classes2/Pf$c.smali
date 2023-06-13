.class public final LPf$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPf;->onBannerShown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lkotlin/Unit;)Lio/reactivex/h;"
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
        "SMAP\nAnnouncementBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/AnnouncementBannerPresenterImpl$onBannerShown$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LPf;


# direct methods
.method public constructor <init>(LPf;)V
    .locals 0

    iput-object p1, p0, LPf$c;->g:LPf;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LPf$c;->invoke$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LPf;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, LPf$c;->e(LPf;Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic c(LPf;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, LPf$c;->f(LPf;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LPf;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LPf;->access$getActivity$p(LPf;)Landroid/app/Activity;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static final f(LPf;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LPf;->access$getCloseRelay$p(LPf;)Lma4;

    move-result-object p0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final invoke$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final d(Lkotlin/Unit;)Lio/reactivex/h;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LPf$c;->g:LPf;

    invoke-static {p1}, LPf;->access$getCurrentAnnouncement$p(LPf;)Lco/bird/android/model/persistence/Announcement;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->getButtonUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, LPf$c;->g:LPf;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-static {v1}, LPf;->access$getActivity$p(LPf;)Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    move-object v0, v2

    :cond_1
    if-eqz v0, :cond_2

    iget-object p1, p0, LPf$c;->g:LPf;

    invoke-static {p1}, LPf;->access$getDeeplinkResolver$p(LPf;)LNV0;

    move-result-object p1

    invoke-interface {p1, v0}, LNV0;->a(Landroid/content/Intent;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/p;->I(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object p1

    iget-object v1, p0, LPf$c;->g:LPf;

    new-instance v2, LQf;

    invoke-direct {v2, v1, v0}, LQf;-><init>(LPf;Landroid/content/Intent;)V

    invoke-virtual {p1, v2}, Lio/reactivex/p;->n(Lio/reactivex/functions/a;)Lio/reactivex/p;

    move-result-object p1

    new-instance v1, LPf$c$a;

    iget-object v2, p0, LPf$c;->g:LPf;

    invoke-direct {v1, v2, v0}, LPf$c$a;-><init>(LPf;Landroid/content/Intent;)V

    new-instance v0, LRf;

    invoke-direct {v0, v1}, LRf;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/p;->A(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object p1, p0, LPf$c;->g:LPf;

    new-instance v0, LSf;

    invoke-direct {v0, p1}, LSf;-><init>(LPf;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LPf$c;->d(Lkotlin/Unit;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
