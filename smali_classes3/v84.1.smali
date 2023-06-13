.class public final Lv84;
.super Lw1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B3\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0008\u0008\u0001\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008\"\u0010#J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006$"
    }
    d2 = {
        "Lv84;",
        "Lw1;",
        "",
        "onAttachedToWindow",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "b",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "LTq4;",
        "c",
        "LTq4;",
        "reactiveConfig",
        "LV74;",
        "d",
        "LV74;",
        "promoManager",
        "LEa;",
        "e",
        "LEa;",
        "analyticsManager",
        "LMe2;",
        "f",
        "LMe2;",
        "binding",
        "Lu84;",
        "g",
        "Lu84;",
        "ui",
        "Lyz1;",
        "h",
        "Lyz1;",
        "presenter",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LTq4;LV74;LEa;Landroid/view/View;)V",
        "promotions_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPromotionsCenterFreeRideViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionsCenterFreeRideViewHolder.kt\nco/bird/android/feature/promotions/PromotionsCenterFreeRideViewHolder\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,59:1\n41#2:60\n*S KotlinDebug\n*F\n+ 1 PromotionsCenterFreeRideViewHolder.kt\nco/bird/android/feature/promotions/PromotionsCenterFreeRideViewHolder\n*L\n36#1:60\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:LTq4;

.field public final d:LV74;

.field public final e:LEa;

.field public final f:LMe2;

.field public final g:Lu84;

.field public final h:Lyz1;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LTq4;LV74;LEa;Landroid/view/View;)V
    .locals 9

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promoManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p5}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lv84;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p2, p0, Lv84;->c:LTq4;

    iput-object p3, p0, Lv84;->d:LV74;

    iput-object p4, p0, Lv84;->e:LEa;

    invoke-static {p5}, LMe2;->a(Landroid/view/View;)LMe2;

    move-result-object v0

    const-string v1, "bind(view)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lv84;->f:LMe2;

    new-instance v4, Lu84;

    invoke-direct {v4, p1, v0}, Lu84;-><init>(Lco/bird/android/core/mvp/BaseActivity;LMe2;)V

    iput-object v4, p0, Lv84;->g:Lu84;

    new-instance v0, Lyz1;

    invoke-static {p5}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v3

    const-string p5, "ViewScopeProvider.from(this)"

    invoke-static {v3, p5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v2 .. v8}, Lyz1;-><init>(Lcom/uber/autodispose/ScopeProvider;Lzz1;Landroid/content/Context;LTq4;LV74;LEa;)V

    iput-object v0, p0, Lv84;->h:Lyz1;

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 1

    iget-object v0, p0, Lv84;->h:Lyz1;

    invoke-virtual {v0}, Lyz1;->a()V

    return-void
.end method
