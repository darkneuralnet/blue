.class public abstract Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Copy;,
        Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;,
        Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$LearnMore;,
        Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Primary;,
        Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Share;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u0007\u0008\t\n\u000bB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0005\u000c\r\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;",
        "",
        "announcement",
        "Lco/bird/android/model/persistence/Announcement;",
        "(Lco/bird/android/model/persistence/Announcement;)V",
        "getAnnouncement",
        "()Lco/bird/android/model/persistence/Announcement;",
        "Copy",
        "Dismiss",
        "LearnMore",
        "Primary",
        "Share",
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Copy;",
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;",
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$LearnMore;",
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Primary;",
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Share;",
        "model-persistence_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final announcement:Lco/bird/android/model/persistence/Announcement;


# direct methods
.method private constructor <init>(Lco/bird/android/model/persistence/Announcement;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->announcement:Lco/bird/android/model/persistence/Announcement;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/persistence/Announcement;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;-><init>(Lco/bird/android/model/persistence/Announcement;)V

    return-void
.end method


# virtual methods
.method public getAnnouncement()Lco/bird/android/model/persistence/Announcement;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;->announcement:Lco/bird/android/model/persistence/Announcement;

    return-object v0
.end method
