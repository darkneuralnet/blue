.class public final Lgk1$d;
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
        "Lco/bird/android/model/persistence/Announcement;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/persistence/Announcement;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Announcement;",
        "announcement",
        "Lio/reactivex/B;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;"
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

    iput-object p1, p0, Lgk1$d;->g:Lgk1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/Announcement;
    .locals 0

    invoke-static {p0, p1}, Lgk1$d;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/Announcement;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/Announcement;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/Announcement;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Announcement;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;"
        }
    .end annotation

    const-string v0, "announcement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->isSideMenuBanner()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgk1$d;->g:Lgk1;

    invoke-static {v0}, Lgk1;->access$getUi$p(Lgk1;)Lxk1;

    move-result-object v0

    invoke-interface {v0, p1}, Lxk1;->ia(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lgk1$d;->g:Lgk1;

    invoke-static {v1}, Lgk1;->access$getUi$p(Lgk1;)Lxk1;

    move-result-object v1

    invoke-interface {v1}, Lxk1;->W4()Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lgk1$d$a;

    invoke-direct {v2, p1}, Lgk1$d$a;-><init>(Lco/bird/android/model/persistence/Announcement;)V

    new-instance p1, Ljk1;

    invoke-direct {p1, v2}, Ljk1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->l(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/Announcement;

    invoke-virtual {p0, p1}, Lgk1$d;->b(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
