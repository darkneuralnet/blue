.class public final LTF1$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTF1;-><init>(LUF1;Lcom/uber/autodispose/ScopeProvider;LDQ3;Le13;Liy6;LXF1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LFQ3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LFQ3;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LFQ3;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LTF1;


# direct methods
.method public constructor <init>(LTF1;)V
    .locals 0

    iput-object p1, p0, LTF1$c;->g:LTF1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LFQ3;)V
    .locals 1

    invoke-virtual {p1}, LFQ3;->a()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LTF1$c;->g:LTF1;

    invoke-static {p1}, LTF1;->access$getUi$p(LTF1;)LUF1;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LUF1;->o8(Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LFQ3;

    invoke-virtual {p0, p1}, LTF1$c;->a(LFQ3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
