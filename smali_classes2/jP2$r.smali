.class public final LjP2$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjP2;->l0([BLco/bird/android/model/BirdInspectionPoint;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "e",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LjP2;

.field public final synthetic h:Lco/bird/android/model/BirdInspectionPoint;


# direct methods
.method public constructor <init>(LjP2;Lco/bird/android/model/BirdInspectionPoint;)V
    .locals 0

    iput-object p1, p0, LjP2$r;->g:LjP2;

    iput-object p2, p0, LjP2$r;->h:Lco/bird/android/model/BirdInspectionPoint;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LjP2$r;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, LjP2$r;->g:LjP2;

    invoke-static {v0}, LjP2;->access$getRepairJobSubmissionList$p(LjP2;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lco/bird/api/request/RepairJobSubmission;

    iget-object v2, p0, LjP2$r;->g:LjP2;

    invoke-static {v2}, LjP2;->access$getId$p(LjP2;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string v2, "id"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    iget-object v4, p0, LjP2$r;->h:Lco/bird/android/model/BirdInspectionPoint;

    invoke-virtual {v4}, Lco/bird/android/model/BirdInspectionPoint;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v4, v3}, Lco/bird/api/request/RepairJobSubmission;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LjP2$r;->g:LjP2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LjP2;->c0(Z)V

    iget-object v0, p0, LjP2$r;->g:LjP2;

    invoke-static {v0}, LjP2;->access$getUi$p(LjP2;)LlP2;

    move-result-object v0

    sget v2, Lnl4;->repair_photo_uploading_error_message:I

    invoke-interface {v0, v2}, LaM5;->warn(I)V

    iget-object v0, p0, LjP2$r;->g:LjP2;

    invoke-static {v0}, LjP2;->access$getUi$p(LjP2;)LlP2;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v1, v2, v3}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    return-void
.end method
