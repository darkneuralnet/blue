.class public final Lo65$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo65;-><init>(LaT3;Lcom/uber/autodispose/ScopeProvider;Lt65;Le13;Lco/bird/android/model/wire/WirePhysicalLock;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LZS3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LZS3;",
        "b",
        "()LZS3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lo65;


# direct methods
.method public constructor <init>(Lo65;)V
    .locals 0

    iput-object p1, p0, Lo65$b;->g:Lo65;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LZS3;
    .locals 3

    iget-object v0, p0, Lo65$b;->g:Lo65;

    invoke-static {v0}, Lo65;->access$getPresenterFactory$p(Lo65;)LaT3;

    move-result-object v0

    iget-object v1, p0, Lo65$b;->g:Lo65;

    invoke-static {v1}, Lo65;->access$getScopeProvider$p(Lo65;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    iget-object v2, p0, Lo65$b;->g:Lo65;

    invoke-static {v2}, Lo65;->access$getUi$p(Lo65;)Lt65;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LaT3;->a(Lcom/uber/autodispose/ScopeProvider;LdT3;)LZS3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo65$b;->b()LZS3;

    move-result-object v0

    return-object v0
.end method
