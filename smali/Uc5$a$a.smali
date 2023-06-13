.class public final LUc5$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUc5$a;->a(LzO2;Ljava/util/List;J)LyO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LOU3$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LOU3$a;",
        "",
        "a",
        "(LOU3$a;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LWc5;

.field public final synthetic h:LVc5;

.field public final synthetic i:LzO2;


# direct methods
.method public constructor <init>(LWc5;LVc5;LzO2;)V
    .locals 0

    iput-object p1, p0, LUc5$a$a;->g:LWc5;

    iput-object p2, p0, LUc5$a$a;->h:LVc5;

    iput-object p3, p0, LUc5$a$a;->i:LzO2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 4

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUc5$a$a;->g:LWc5;

    iget-object v1, p0, LUc5$a$a;->h:LVc5;

    iget-object v2, p0, LUc5$a$a;->i:LzO2;

    invoke-interface {v2}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v1, v3, v2}, LWc5;->f(LOU3$a;LVc5;ILpm2;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, LUc5$a$a;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
