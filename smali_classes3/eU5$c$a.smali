.class public final LeU5$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LeU5$c;-><init>(LeU5;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHJ6;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LHJ6;",
        "",
        "a",
        "(LHJ6;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LeU5$c;

.field public final synthetic h:LeU5;


# direct methods
.method public constructor <init>(LeU5$c;LeU5;)V
    .locals 0

    iput-object p1, p0, LeU5$c$a;->g:LeU5$c;

    iput-object p2, p0, LeU5$c$a;->h:LeU5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHJ6;)V
    .locals 3

    const-string v0, "$this$textChangedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LeU5$c$a$a;

    iget-object v1, p0, LeU5$c$a;->g:LeU5$c;

    iget-object v2, p0, LeU5$c$a;->h:LeU5;

    invoke-direct {v0, v1, v2}, LeU5$c$a$a;-><init>(LeU5$c;LeU5;)V

    invoke-virtual {p1, v0}, LHJ6;->b(Lkotlin/jvm/functions/Function4;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHJ6;

    invoke-virtual {p0, p1}, LeU5$c$a;->a(LHJ6;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method