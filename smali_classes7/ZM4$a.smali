.class public final LZM4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZM4;-><init>(Landroid/content/res/Resources;LbS5;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LyM4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LyM4;",
        "b",
        "()LyM4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:LZM4;

.field public final synthetic i:LbS5;


# direct methods
.method public constructor <init>(Landroid/content/Context;LZM4;LbS5;)V
    .locals 0

    iput-object p1, p0, LZM4$a;->g:Landroid/content/Context;

    iput-object p2, p0, LZM4$a;->h:LZM4;

    iput-object p3, p0, LZM4$a;->i:LbS5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LyM4;
    .locals 4

    new-instance v0, LyM4;

    iget-object v1, p0, LZM4$a;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context.applicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LZM4$a;->h:LZM4;

    invoke-static {v2}, LZM4;->a(LZM4;)Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, p0, LZM4$a;->i:LbS5;

    invoke-direct {v0, v1, v2, v3}, LyM4;-><init>(Landroid/content/Context;Landroid/content/res/Resources;LbS5;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZM4$a;->b()LyM4;

    move-result-object v0

    return-object v0
.end method
