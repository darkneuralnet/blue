.class public final Lfp2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfp2;-><init>(LSC0;LWS0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0003\"\u0008\u0008\u0001\u0010\u0004*\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "Key",
        "",
        "Value",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lfp2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfp2<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfp2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfp2<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lfp2$b;->g:Lfp2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfp2$b;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    iget-object v0, p0, Lfp2$b;->g:Lfp2;

    invoke-virtual {v0}, Lfp2;->g()LWS0;

    move-result-object v0

    iget-object v1, p0, Lfp2$b;->g:Lfp2;

    new-instance v2, Lfp2$b$a;

    invoke-direct {v2, v1}, Lfp2$b$a;-><init>(Lfp2;)V

    invoke-virtual {v0, v2}, LWS0;->k(LWS0$d;)V

    iget-object v0, p0, Lfp2$b;->g:Lfp2;

    invoke-virtual {v0}, Lfp2;->g()LWS0;

    move-result-object v0

    invoke-virtual {v0}, LWS0;->f()V

    return-void
.end method
