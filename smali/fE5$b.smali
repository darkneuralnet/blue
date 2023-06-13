.class public final LfE5$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfE5;->f(LzO2;LvO2;J)LyO2;
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
.field public final synthetic g:LfE5;

.field public final synthetic h:LOU3;

.field public final synthetic i:J


# direct methods
.method public constructor <init>(LfE5;LOU3;J)V
    .locals 0

    iput-object p1, p0, LfE5$b;->g:LfE5;

    iput-object p2, p0, LfE5$b;->h:LOU3;

    iput-wide p3, p0, LfE5$b;->i:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 9

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LfE5$b;->g:LfE5;

    invoke-virtual {v0}, LfE5;->a()LF96$a;

    move-result-object v0

    iget-object v1, p0, LfE5$b;->g:LfE5;

    invoke-virtual {v1}, LfE5;->h()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, LfE5$b$a;

    iget-object v3, p0, LfE5$b;->g:LfE5;

    iget-wide v4, p0, LfE5$b;->i:J

    invoke-direct {v2, v3, v4, v5}, LfE5$b$a;-><init>(LfE5;J)V

    invoke-virtual {v0, v1, v2}, LF96$a;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LsP5;

    move-result-object v0

    iget-object v2, p0, LfE5$b;->h:LOU3;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA52;

    invoke-virtual {v0}, LA52;->n()J

    move-result-wide v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, LOU3$a;->B(LOU3$a;LOU3;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, LfE5$b;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
