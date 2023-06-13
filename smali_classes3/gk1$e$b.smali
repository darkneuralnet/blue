.class public final Lgk1$e$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk1$e;->f(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/disposables/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/disposables/c;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lio/reactivex/disposables/c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lgk1;

.field public final synthetic h:Lco/bird/android/model/persistence/Announcement;


# direct methods
.method public constructor <init>(Lgk1;Lco/bird/android/model/persistence/Announcement;)V
    .locals 0

    iput-object p1, p0, Lgk1$e$b;->g:Lgk1;

    iput-object p2, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/disposables/c;)V
    .locals 14

    iget-object p1, p0, Lgk1$e$b;->g:Lgk1;

    invoke-static {p1}, Lgk1;->access$getAnalyticsManager$p(Lgk1;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/AnnouncementShown;

    iget-object v1, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Announcement;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lgk1$e$b;->g:Lgk1;

    invoke-static {v2}, Lgk1;->access$getContext$p(Lgk1;)Lco/bird/android/model/constant/AnnouncementContext;

    move-result-object v2

    iget-object v3, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getAnalyticsTitle()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getTitle()Ljava/lang/String;

    move-result-object v3

    :cond_0
    invoke-direct {v0, v1, v2, v3}, Lco/bird/android/model/analytics/AnnouncementShown;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/AnnouncementContext;Ljava/lang/String;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, Lgk1$e$b;->g:Lgk1;

    invoke-static {p1}, Lgk1;->access$getAnalyticsManager$p(Lgk1;)LEa;

    move-result-object p1

    new-instance v13, Log;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Announcement;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Announcement;->getAnalyticsTitle()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    iget-object v0, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Announcement;->getContext()Lco/bird/android/model/constant/AnnouncementContext;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Announcement;->getDisplayType()Lco/bird/android/model/constant/AnnouncementDisplayType;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    iget-object v0, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Announcement;->getContentType()Lco/bird/android/model/constant/AnnouncementContentType;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    iget-object v0, p0, Lgk1$e$b;->g:Lgk1;

    invoke-static {v0}, Lgk1;->access$getAppPreference$p(Lgk1;)Lgl;

    move-result-object v0

    iget-object v10, p0, Lgk1$e$b;->h:Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {v10}, Lco/bird/android/model/persistence/Announcement;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Lgl;->O0(Ljava/lang/String;)I

    move-result v10

    const/16 v11, 0x27

    const/4 v12, 0x0

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Log;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v13}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, Lgk1$e$b;->a(Lio/reactivex/disposables/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
