.class public final Lgk1$f;
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


# instance fields
.field public final synthetic g:Lgk1;


# direct methods
.method public constructor <init>(Lgk1;)V
    .locals 0

    iput-object p1, p0, Lgk1$f;->g:Lgk1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lgk1$f;->g:Lgk1;

    invoke-static {v2}, Lgk1;->access$getAnalyticsManager$p(Lgk1;)LEa;

    move-result-object v2

    new-instance v15, Lhg;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getAnalyticsTitle()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getContext()Lco/bird/android/model/constant/AnnouncementContext;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getDisplayType()Lco/bird/android/model/constant/AnnouncementDisplayType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getContentType()Lco/bird/android/model/constant/AnnouncementContentType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    iget-object v3, v0, Lgk1$f;->g:Lgk1;

    invoke-static {v3}, Lgk1;->access$getAppPreference$p(Lgk1;)Lgl;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Announcement;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lgl;->C(Ljava/lang/String;)I

    move-result v13

    const/16 v14, 0x27

    const/4 v1, 0x0

    move-object v3, v15

    move-object v0, v15

    move-object v15, v1

    invoke-direct/range {v3 .. v15}, Lhg;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lgk1$f;->g:Lgk1;

    invoke-static {v2}, Lgk1;->access$getAnalyticsManager$p(Lgk1;)LEa;

    move-result-object v2

    new-instance v15, LZf;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getAnalyticsTitle()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getContext()Lco/bird/android/model/constant/AnnouncementContext;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getDisplayType()Lco/bird/android/model/constant/AnnouncementDisplayType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Announcement;->getContentType()Lco/bird/android/model/constant/AnnouncementContentType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    iget-object v3, v0, Lgk1$f;->g:Lgk1;

    invoke-static {v3}, Lgk1;->access$getAppPreference$p(Lgk1;)Lgl;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->getAnnouncement()Lco/bird/android/model/persistence/Announcement;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Announcement;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lgl;->C(Ljava/lang/String;)I

    move-result v13

    const/16 v14, 0x27

    const/4 v1, 0x0

    move-object v3, v15

    move-object v0, v15

    move-object v15, v1

    invoke-direct/range {v3 .. v15}, LZf;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;

    invoke-virtual {p0, p1}, Lgk1$f;->a(Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
