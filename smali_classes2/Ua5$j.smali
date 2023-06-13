.class public final LUa5$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUa5;-><init>(LTq4;LEa;Landroid/content/Context;Lfa5;LxG;LsG;Lcom/uber/autodispose/ScopeProvider;LZa5;LDU2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroid/view/View;",
        "LZa5;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "LUa5$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Landroid/view/View;",
        "view",
        "LZa5;",
        "parentUi",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "LUa5$b;",
        "a",
        "(Landroid/view/View;LZa5;Lcom/uber/autodispose/ScopeProvider;)LUa5$b;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LUa5;


# direct methods
.method public constructor <init>(LUa5;)V
    .locals 0

    iput-object p1, p0, LUa5$j;->g:LUa5;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;LZa5;Lcom/uber/autodispose/ScopeProvider;)LUa5$b;
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentUi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUa5$j;->g:LUa5;

    invoke-static {v0}, LUa5;->access$getBeginnerModeBottomViewPresenterImplFactory$p(LUa5;)LsG;

    move-result-object v0

    check-cast p1, Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;

    invoke-interface {v0, p2, p1, p3}, LsG;->a(LZa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;Lcom/uber/autodispose/ScopeProvider;)LpG;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    check-cast p2, LZa5;

    check-cast p3, Lcom/uber/autodispose/ScopeProvider;

    invoke-virtual {p0, p1, p2, p3}, LUa5$j;->a(Landroid/view/View;LZa5;Lcom/uber/autodispose/ScopeProvider;)LUa5$b;

    move-result-object p1

    return-object p1
.end method
