.class public final Lgk1$i$b$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk1$i$b;->c(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RideUpdateState;",
        "Lco/bird/android/model/persistence/Announcement;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/RideUpdateState;",
        "it",
        "Lco/bird/android/model/persistence/Announcement;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/RideUpdateState;)Lco/bird/android/model/persistence/Announcement;"
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

    iput-object p1, p0, Lgk1$i$b$b;->g:Lco/bird/android/model/persistence/Announcement;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/RideUpdateState;)Lco/bird/android/model/persistence/Announcement;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lgk1$i$b$b;->g:Lco/bird/android/model/persistence/Announcement;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RideUpdateState;

    invoke-virtual {p0, p1}, Lgk1$i$b$b;->a(Lco/bird/android/model/RideUpdateState;)Lco/bird/android/model/persistence/Announcement;

    move-result-object p1

    return-object p1
.end method
