.class public final Lcs0$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcs0;->A()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lio/reactivex/h;"
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

    iput-object p1, p0, Lcs0$a;->g:Lcs0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcs0;Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lcs0$a;->c(Lcs0;Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcs0;Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcs0;->access$getComplaintResolutionFormDao$p(Lcs0;)LOq0;

    move-result-object p0

    invoke-static {p1}, LAq0;->c(Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lco/bird/android/model/persistence/ComplaintResolutionForm;

    move-result-object p1

    invoke-virtual {p0, p1}, LOq0;->c(Lco/bird/android/model/persistence/ComplaintResolutionForm;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lio/reactivex/h;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcs0$a;->g:Lcs0;

    invoke-static {v0}, Lcs0;->access$getComplaintResolutionFormDao$p(Lcs0;)LOq0;

    move-result-object v0

    invoke-virtual {v0}, LOq0;->a()Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lcs0$a;->g:Lcs0;

    new-instance v2, Lbs0;

    invoke-direct {v2, v1, p1}, Lbs0;-><init>(Lcs0;Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)V

    invoke-static {v2}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;

    invoke-virtual {p0, p1}, Lcs0$a;->b(Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
