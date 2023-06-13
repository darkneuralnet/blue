.class public final LHA$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHA;->nj(Lco/bird/android/model/constant/AnnouncementContext;Lco/bird/android/model/persistence/Announcement;Ljava/lang/String;)Lio/reactivex/Observable;
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
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;",
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
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Unit;)Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/persistence/Announcement;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/Announcement;)V
    .locals 0

    iput-object p1, p0, LHA$e;->g:Lco/bird/android/model/persistence/Announcement;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Unit;)Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;

    iget-object v0, p0, LHA$e;->g:Lco/bird/android/model/persistence/Announcement;

    invoke-direct {p1, v0}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;-><init>(Lco/bird/android/model/persistence/Announcement;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LHA$e;->a(Lkotlin/Unit;)Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;

    move-result-object p1

    return-object p1
.end method
