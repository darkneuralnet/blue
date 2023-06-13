.class public final Llf1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llf1;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V
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
        "\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
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
.field public final synthetic g:Llf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llf1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Llf1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llf1<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llf1$a;->g:Llf1;

    iput-object p2, p0, Llf1$a;->h:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LMs5;
    .locals 2

    iget-object v0, p0, Llf1$a;->g:Llf1;

    invoke-static {v0}, Llf1;->b(Llf1;)LMs5;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Llf1$a;->g:Llf1;

    iget-object v1, p0, Llf1$a;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Llf1;->a(Llf1;Ljava/lang/String;)LMs5;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llf1$a;->b()LMs5;

    move-result-object v0

    return-object v0
.end method
