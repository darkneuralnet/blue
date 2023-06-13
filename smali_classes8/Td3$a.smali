.class public final LTd3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTd3;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LMs5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "T",
        "LMs5;",
        "b",
        "()LMs5;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:LTd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTd3<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;LTd3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LTd3<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LTd3$a;->g:Ljava/lang/String;

    iput-object p2, p0, LTd3$a;->h:LTd3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LMs5;
    .locals 5

    iget-object v0, p0, LTd3$a;->g:Ljava/lang/String;

    sget-object v1, LRS5$d;->a:LRS5$d;

    const/4 v2, 0x0

    new-array v2, v2, [LMs5;

    new-instance v3, LTd3$a$a;

    iget-object v4, p0, LTd3$a;->h:LTd3;

    invoke-direct {v3, v4}, LTd3$a$a;-><init>(LTd3;)V

    invoke-static {v0, v1, v2, v3}, LQs5;->b(Ljava/lang/String;LTs5;[LMs5;Lkotlin/jvm/functions/Function1;)LMs5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LTd3$a;->b()LMs5;

    move-result-object v0

    return-object v0
.end method
