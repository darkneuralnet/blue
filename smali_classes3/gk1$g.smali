.class public final Lgk1$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk1;-><init>(Lqg;LTq4;LEa;Lgl;LYR4;LpU4;LTk0;Lxk1;Lcom/uber/autodispose/ScopeProvider;Le13;LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;)V"
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
        "SMAP\nFeatureAnnouncementModalPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureAnnouncementModalPresenter.kt\nco/bird/android/lib/announcement/FeatureAnnouncementModalPresenter$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lgk1;


# direct methods
.method public constructor <init>(Lgk1;)V
    .locals 0

    iput-object p1, p0, Lgk1$g;->g:Lgk1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;)V
    .locals 7

    instance-of v0, p1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Primary;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->getButtonUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lgk1$g;->g:Lgk1;

    invoke-static {v0}, Lgk1;->access$getNavigator$p(Lgk1;)Le13;

    move-result-object v0

    invoke-interface {v0, p1}, Le13;->m2(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lgk1$g;->g:Lgk1;

    invoke-static {p1}, Lgk1;->access$getUi$p(Lgk1;)Lxk1;

    move-result-object p1

    invoke-interface {p1}, Lxk1;->l9()V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lgk1$g;->g:Lgk1;

    invoke-static {p1}, Lgk1;->access$getUi$p(Lgk1;)Lxk1;

    move-result-object p1

    invoke-interface {p1}, Lxk1;->l9()V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Share;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->getShareContent()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Lgk1$g;->g:Lgk1;

    invoke-static {v0}, Lgk1;->access$getNavigator$p(Lgk1;)Le13;

    move-result-object v0

    invoke-interface {v0, p1}, Le13;->Q3(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Copy;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lgk1$g;->g:Lgk1;

    invoke-static {v0}, Lgk1;->access$getClipboardManager$p(Lgk1;)LTk0;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Copy;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Copy;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->getShareContent()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, LTk0;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$LearnMore;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->getLearnMoreUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object p1, p0, Lgk1$g;->g:Lgk1;

    invoke-static {p1}, Lgk1;->access$getNavigator$p(Lgk1;)Le13;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Le13$a;->goToWebView$default(Le13;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;

    invoke-virtual {p0, p1}, Lgk1$g;->a(Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
