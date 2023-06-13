.class public final LQX3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQX3;-><init>(Lkotlin/reflect/KClass;)V
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
.field public final synthetic g:LQX3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LQX3<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LQX3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQX3<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LQX3$a;->g:LQX3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LMs5;
    .locals 4

    sget-object v0, LOX3$a;->a:LOX3$a;

    const/4 v1, 0x0

    new-array v1, v1, [LMs5;

    new-instance v2, LQX3$a$a;

    iget-object v3, p0, LQX3$a;->g:LQX3;

    invoke-direct {v2, v3}, LQX3$a$a;-><init>(LQX3;)V

    const-string v3, "kotlinx.serialization.Polymorphic"

    invoke-static {v3, v0, v1, v2}, LQs5;->b(Ljava/lang/String;LTs5;[LMs5;Lkotlin/jvm/functions/Function1;)LMs5;

    move-result-object v0

    iget-object v1, p0, LQX3$a;->g:LQX3;

    invoke-virtual {v1}, LQX3;->e()Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-static {v0, v1}, LMA0;->c(LMs5;Lkotlin/reflect/KClass;)LMs5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQX3$a;->b()LMs5;

    move-result-object v0

    return-object v0
.end method
