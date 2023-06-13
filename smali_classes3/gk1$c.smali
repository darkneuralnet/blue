.class public final Lgk1$c;
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
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/Announcement;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/persistence/Announcement;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/Announcement;",
        "announcements",
        "Lco/bird/android/buava/Optional;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lco/bird/android/buava/Optional;"
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

    iput-object p1, p0, Lgk1$c;->g:Lgk1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lco/bird/android/buava/Optional;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;"
        }
    .end annotation

    const-string v0, "announcements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgk1$c;->g:Lgk1;

    invoke-static {v0}, Lgk1;->access$getParameters$p(Lgk1;)Lgk1$h;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lgk1;->access$eligibleAnnouncement(Lgk1;Ljava/util/List;Lgk1$h;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lgk1$c;->a(Ljava/util/List;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
