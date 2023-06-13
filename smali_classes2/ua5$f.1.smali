.class public final Lua5$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lua5;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ll56;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u00062B\u0010\u0005\u001a>\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "Ll56;",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
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
.field public final synthetic g:Lua5;


# direct methods
.method public constructor <init>(Lua5;)V
    .locals 0

    iput-object p1, p0, Lua5$f;->g:Lua5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lua5$f;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "Ll56;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "shouldShowToggle"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll56;

    iget-object v0, p0, Lua5$f;->g:Lua5;

    invoke-static {v0}, Lua5;->access$getUi$p(Lua5;)Lya5;

    move-result-object v0

    invoke-virtual {p1}, Ll56;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lya5;->N9(Ljava/lang/String;)V

    iget-object v0, p0, Lua5$f;->g:Lua5;

    invoke-static {v0}, Lua5;->access$getUi$p(Lua5;)Lya5;

    move-result-object v0

    invoke-virtual {p1}, Ll56;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lya5;->kf(Ljava/lang/String;)V

    iget-object p1, p0, Lua5$f;->g:Lua5;

    invoke-static {p1}, Lua5;->access$getUi$p(Lua5;)Lya5;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lya5;->Fi(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lua5$f;->g:Lua5;

    invoke-static {p1}, Lua5;->access$getUi$p(Lua5;)Lya5;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lya5;->Fi(Z)V

    :goto_0
    return-void
.end method
