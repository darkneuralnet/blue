.class public final Lcs0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcs0;->A0(Ljava/util/List;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "resolution",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lcs0;


# direct methods
.method public constructor <init>(Lcs0;)V
    .locals 0

    iput-object p1, p0, Lcs0$b;->g:Lcs0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/h;
    .locals 1

    const-string v0, "resolution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ComplaintResolution;->getSubmitted()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcs0$b;->g:Lcs0;

    invoke-static {v0}, Lcs0;->access$getComplaintClient$p(Lcs0;)LXp0;

    move-result-object v0

    invoke-static {p1}, LAq0;->d(Lco/bird/android/model/persistence/ComplaintResolution;)Lco/bird/api/request/ComplaintResolutionSubmissionRequest;

    move-result-object p1

    invoke-interface {v0, p1}, LXp0;->c(Lco/bird/api/request/ComplaintResolutionSubmissionRequest;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcs0$b;->g:Lcs0;

    invoke-static {v0}, Lcs0;->access$getComplaintClient$p(Lcs0;)LXp0;

    move-result-object v0

    invoke-static {p1}, LAq0;->e(Lco/bird/android/model/persistence/ComplaintResolution;)Lco/bird/api/request/ComplaintResolutionUpdateRequest;

    move-result-object p1

    invoke-interface {v0, p1}, LXp0;->b(Lco/bird/api/request/ComplaintResolutionUpdateRequest;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/ComplaintResolution;

    invoke-virtual {p0, p1}, Lcs0$b;->a(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
