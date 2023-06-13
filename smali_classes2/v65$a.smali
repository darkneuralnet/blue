.class public final Lv65$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv65;-><init>(LVa5;Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LUa5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LUa5;",
        "b",
        "()LUa5;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lv65;


# direct methods
.method public constructor <init>(Lv65;)V
    .locals 0

    iput-object p1, p0, Lv65$a;->g:Lv65;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LUa5;
    .locals 4

    iget-object v0, p0, Lv65$a;->g:Lv65;

    invoke-static {v0}, Lv65;->access$getPresenterFactory$p(Lv65;)LVa5;

    move-result-object v0

    iget-object v1, p0, Lv65$a;->g:Lv65;

    invoke-static {v1}, Lv65;->access$getScopeProvider$p(Lv65;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    iget-object v2, p0, Lv65$a;->g:Lv65;

    invoke-static {v2}, Lv65;->access$getUi$p(Lv65;)LZa5;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, LVa5;->a(Lcom/uber/autodispose/ScopeProvider;LZa5;LDU2;)LUa5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv65$a;->b()LUa5;

    move-result-object v0

    return-object v0
.end method
