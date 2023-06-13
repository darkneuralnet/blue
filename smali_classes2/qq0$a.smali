.class public final Lqq0$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqq0;->a(Lco/bird/api/request/ComplaintSchemaType;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/ComplaintSchemaResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/ComplaintSchemaResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/api/response/ComplaintSchemaResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lqq0;


# direct methods
.method public constructor <init>(Lqq0;)V
    .locals 0

    iput-object p1, p0, Lqq0$a;->g:Lqq0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/ComplaintSchemaResponse;)V
    .locals 3

    iget-object v0, p0, Lqq0$a;->g:Lqq0;

    invoke-virtual {p1}, Lco/bird/api/response/ComplaintSchemaResponse;->getDamaged()Ljava/util/List;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type java.util.ArrayList<co.bird.android.model.ComplaintSection>{ kotlin.collections.TypeAliasesKt.ArrayList<co.bird.android.model.ComplaintSection> }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lqq0;->access$setDamaged$p(Lqq0;Ljava/util/ArrayList;)V

    iget-object v0, p0, Lqq0$a;->g:Lqq0;

    invoke-virtual {p1}, Lco/bird/api/response/ComplaintSchemaResponse;->getBadParking()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lqq0;->access$setBadParking$p(Lqq0;Ljava/util/ArrayList;)V

    iget-object v0, p0, Lqq0$a;->g:Lqq0;

    invoke-virtual {p1}, Lco/bird/api/response/ComplaintSchemaResponse;->getBadRiding()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lqq0;->access$setBadRiding$p(Lqq0;Ljava/util/ArrayList;)V

    iget-object p1, p0, Lqq0$a;->g:Lqq0;

    invoke-static {p1}, Lqq0;->access$getUi$p(Lqq0;)Lgs0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lgs0;->k(Z)V

    iget-object p1, p0, Lqq0$a;->g:Lqq0;

    invoke-static {p1}, Lqq0;->access$getUi$p(Lqq0;)Lgs0;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lgs0;->x8(Z)V

    iget-object p1, p0, Lqq0$a;->g:Lqq0;

    invoke-static {p1}, Lqq0;->access$getUi$p(Lqq0;)Lgs0;

    move-result-object p1

    iget-object v0, p0, Lqq0$a;->g:Lqq0;

    invoke-static {v0}, Lqq0;->access$getReactiveConfig$p(Lqq0;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getEnableReportBadRiding()Z

    move-result v0

    invoke-interface {p1, v0}, Lgs0;->aj(Z)V

    iget-object p1, p0, Lqq0$a;->g:Lqq0;

    invoke-static {p1}, Lqq0;->access$getUi$p(Lqq0;)Lgs0;

    move-result-object p1

    iget-object v0, p0, Lqq0$a;->g:Lqq0;

    invoke-virtual {v0}, Lqq0;->q()Z

    move-result v0

    invoke-interface {p1, v0}, Lgs0;->Yh(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/ComplaintSchemaResponse;

    invoke-virtual {p0, p1}, Lqq0$a;->a(Lco/bird/api/response/ComplaintSchemaResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
