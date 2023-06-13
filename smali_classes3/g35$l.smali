.class public final Lg35$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg35;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/util/List<",
        "+",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;>;>;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072V\u0010\u0006\u001aR\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00040\u00030\u0001 \u0005*(\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00040\u00030\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "LHM4;",
        "",
        "",
        "",
        "",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lg35;

.field public final synthetic h:F


# direct methods
.method public constructor <init>(Lg35;F)V
    .locals 0

    iput-object p1, p0, Lg35$l;->g:Lg35;

    iput p2, p0, Lg35$l;->h:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;>;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, LHM4;->f()Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    iget-object v2, p0, Lg35$l;->g:Lg35;

    invoke-static {v2, v0}, Lg35;->access$mapToRideFeedbackCategoryTags(Lg35;Ljava/util/Map;)Lco/bird/android/model/RideFeedbackCategoryTags;

    move-result-object v0

    invoke-interface {p1, v0}, Li35;->Hb(Lco/bird/android/model/RideFeedbackCategoryTags;)V

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1, v1}, Lg35;->access$setFeedbackTagsSet$p(Lg35;Z)V

    :cond_0
    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Li35;->Jj(Z)V

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    invoke-interface {p1, v0}, Li35;->Ib(Z)V

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getEnableIssueCategoryButtons$p(Lg35;)Z

    move-result p1

    const/high16 v2, 0x40a00000    # 5.0f

    if-nez p1, :cond_2

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getEnableIssueCategoryTabs$p(Lg35;)Z

    move-result p1

    if-nez p1, :cond_2

    iget p1, p0, Lg35$l;->h:F

    cmpg-float p1, p1, v2

    if-gez p1, :cond_1

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    invoke-interface {p1, v1}, Li35;->mg(Z)V

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    invoke-interface {p1, v1}, Li35;->q6(Z)V

    :cond_1
    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    invoke-interface {p1, v1}, Li35;->wj(Z)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getEnableIssueCategoryButtons$p(Lg35;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget p1, p0, Lg35$l;->h:F

    cmpg-float p1, p1, v2

    if-gez p1, :cond_4

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    invoke-interface {p1, v1}, Li35;->Ib(Z)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getEnableIssueCategoryTabs$p(Lg35;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget p1, p0, Lg35$l;->h:F

    cmpg-float p1, p1, v2

    if-gez p1, :cond_4

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    invoke-interface {p1, v1}, Li35;->Jj(Z)V

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    invoke-interface {p1, v1}, Li35;->J9(Z)V

    iget-object p1, p0, Lg35$l;->g:Lg35;

    invoke-static {p1}, Lg35;->access$getUi$p(Lg35;)Li35;

    move-result-object p1

    invoke-interface {p1, v0}, Li35;->Gl(Z)V

    :cond_4
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lg35$l;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
