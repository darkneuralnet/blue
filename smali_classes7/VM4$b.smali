.class public final LVM4$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVM4;-><init>(Landroid/content/Context;LbS5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LZM4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LZM4;",
        "b",
        "()LZM4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:LVM4;

.field public final synthetic h:LbS5;


# direct methods
.method public constructor <init>(LVM4;LbS5;)V
    .locals 0

    iput-object p1, p0, LVM4$b;->g:LVM4;

    iput-object p2, p0, LVM4$b;->h:LbS5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LZM4;
    .locals 4

    iget-object v0, p0, LVM4$b;->g:LVM4;

    invoke-static {v0}, LVM4;->a(LVM4;)Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, LZM4;

    const-string v2, "baseResources"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LVM4$b;->h:LbS5;

    iget-object v3, p0, LVM4$b;->g:LVM4;

    invoke-direct {v1, v0, v2, v3}, LZM4;-><init>(Landroid/content/res/Resources;LbS5;Landroid/content/Context;)V

    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LVM4$b;->b()LZM4;

    move-result-object v0

    return-object v0
.end method
