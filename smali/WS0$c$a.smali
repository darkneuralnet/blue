.class public final LWS0$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWS0$c;->c(LSC0;)Lkotlin/jvm/functions/Function0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LfE3<",
        "TKey;TValue;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000\"\u0008\u0008\u0002\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0003\u0010\u0002*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Key",
        "Value",
        "LfE3;",
        "b",
        "()LfE3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:LSC0;

.field public final synthetic h:LWS0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWS0$c<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LSC0;LWS0$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSC0;",
            "LWS0$c<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    iput-object p1, p0, LWS0$c$a;->g:LSC0;

    iput-object p2, p0, LWS0$c$a;->h:LWS0$c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LfE3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LfE3<",
            "TKey;TValue;>;"
        }
    .end annotation

    new-instance v0, Lfp2;

    iget-object v1, p0, LWS0$c$a;->g:LSC0;

    iget-object v2, p0, LWS0$c$a;->h:LWS0$c;

    invoke-virtual {v2}, LWS0$c;->d()LWS0;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lfp2;-><init>(LSC0;LWS0;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWS0$c$a;->b()LfE3;

    move-result-object v0

    return-object v0
.end method
