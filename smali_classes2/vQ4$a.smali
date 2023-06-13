.class public final LvQ4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvQ4;-><init>(Lco/bird/android/core/mvp/BaseActivity;LG5;Lcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LcD1;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LcD1;",
        "kotlin.jvm.PlatformType",
        "_map",
        "",
        "invoke",
        "(LcD1;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LvQ4;

.field public final synthetic h:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public constructor <init>(LvQ4;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    iput-object p1, p0, LvQ4$a;->g:LvQ4;

    iput-object p2, p0, LvQ4$a;->h:Lco/bird/android/core/mvp/BaseActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LcD1;

    invoke-virtual {p0, p1}, LvQ4$a;->invoke(LcD1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LcD1;)V
    .locals 3

    iget-object v0, p0, LvQ4$a;->g:LvQ4;

    const-string v1, "_map"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LvQ4;->access$setMap$p(LvQ4;LcD1;)V

    iget-object p1, p0, LvQ4$a;->h:Lco/bird/android/core/mvp/BaseActivity;

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p1, v0}, LNA0;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x0

    const-string v1, "map"

    const/4 v2, 0x1

    if-nez p1, :cond_1

    iget-object p1, p0, LvQ4$a;->g:LvQ4;

    invoke-static {p1}, LvQ4;->access$getMap$p(LvQ4;)LcD1;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v2}, LcD1;->r(Z)V

    :cond_1
    iget-object p1, p0, LvQ4$a;->g:LvQ4;

    invoke-static {p1}, LvQ4;->access$getMap$p(LvQ4;)LcD1;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, p1

    :goto_0
    invoke-virtual {v0}, LcD1;->l()Lxd6;

    move-result-object p1

    invoke-virtual {p1, v2}, Lxd6;->c(Z)V

    invoke-virtual {p1, v2}, Lxd6;->a(Z)V

    return-void
.end method
