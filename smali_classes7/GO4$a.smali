.class public final LGO4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGO4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LNt6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LNt6;",
        "b",
        "()LNt6;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LGO4$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LGO4$a;

    invoke-direct {v0}, LGO4$a;-><init>()V

    sput-object v0, LGO4$a;->g:LGO4$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LNt6;
    .locals 2

    new-instance v0, LNt6;

    invoke-direct {v0}, LNt6;-><init>()V

    sget-object v1, La36;->a:La36;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, LC56;->a:LC56;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, LLi;->a:LLi;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, LvZ;->a:LvZ;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, LT16;->a:LT16;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, LYl0;->a:LYl0;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, Lc13;->a:Lc13;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, LIq5;->a:LIq5;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, Lwi;->a:Lwi;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, LrY5;->a:LrY5;

    invoke-virtual {v0, v1}, LNt6;->c(LMt6;)V

    sget-object v1, LnY5;->a:LnY5;

    invoke-virtual {v0, v1}, LNt6;->d(LQq6;)V

    sget-object v1, LpY5;->a:LpY5;

    invoke-virtual {v0, v1}, LNt6;->d(LQq6;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGO4$a;->b()LNt6;

    move-result-object v0

    return-object v0
.end method
