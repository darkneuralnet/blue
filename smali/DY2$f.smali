.class public final LDY2$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDY2;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LSY2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LSY2;",
        "b",
        "()LSY2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LDY2;


# direct methods
.method public constructor <init>(LDY2;)V
    .locals 0

    iput-object p1, p0, LDY2$f;->g:LDY2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LSY2;
    .locals 3

    iget-object v0, p0, LDY2$f;->g:LDY2;

    invoke-static {v0}, LDY2;->g(LDY2;)LSY2;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LSY2;

    iget-object v1, p0, LDY2$f;->g:LDY2;

    invoke-virtual {v1}, LDY2;->x()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, LDY2$f;->g:LDY2;

    invoke-static {v2}, LDY2;->k(LDY2;)Li13;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LSY2;-><init>(Landroid/content/Context;Li13;)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDY2$f;->b()LSY2;

    move-result-object v0

    return-object v0
.end method
