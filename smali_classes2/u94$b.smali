.class public final Lu94$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu94;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/CannotAccessReportResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/CannotAccessReportResponse;",
        "kotlin.jvm.PlatformType",
        "report",
        "",
        "a",
        "(Lco/bird/api/response/CannotAccessReportResponse;)V"
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
        "SMAP\nPropertyReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyReportPresenter.kt\nco/bird/android/app/feature/propertyreport/PropertyReportPresenterImpl$loadLatestCannotAccessReport$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lu94;


# direct methods
.method public constructor <init>(Lu94;)V
    .locals 0

    iput-object p1, p0, Lu94$b;->g:Lu94;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/CannotAccessReportResponse;)V
    .locals 2

    iget-object v0, p0, Lu94$b;->g:Lu94;

    invoke-static {v0}, Lu94;->access$getUi$p(Lu94;)Lz94;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/CannotAccessReportResponse;->getBirdsDiscovered()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lz94;->Pf(Ljava/lang/Integer;)V

    iget-object v0, p0, Lu94$b;->g:Lu94;

    invoke-static {v0}, Lu94;->access$getUi$p(Lu94;)Lz94;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/CannotAccessReportResponse;->getBirdsReported()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lz94;->zl(Ljava/lang/String;)V

    iget-object v0, p0, Lu94$b;->g:Lu94;

    invoke-static {v0}, Lu94;->access$getUi$p(Lu94;)Lz94;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/CannotAccessReportResponse;->getNotes()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lz94;->ld(Landroid/text/Spanned;)V

    iget-object v0, p0, Lu94$b;->g:Lu94;

    invoke-static {v0}, Lu94;->access$getCannotAccessReportIdRelay$p(Lu94;)LAG;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/CannotAccessReportResponse;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/api/response/CannotAccessReportResponse;->getPhotoUrls()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lu94$b;->g:Lu94;

    invoke-static {v0}, Lu94;->access$getUi$p(Lu94;)Lz94;

    move-result-object v0

    invoke-interface {v0, p1}, Lz94;->w6(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/CannotAccessReportResponse;

    invoke-virtual {p0, p1}, Lu94$b;->a(Lco/bird/api/response/CannotAccessReportResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
