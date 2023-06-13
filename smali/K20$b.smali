.class public final LK20$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK20;->a(Lnm2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LOs4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LOs4;",
        "b",
        "()LOs4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderModifier$bringChildIntoView$parentRect$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LK20;

.field public final synthetic h:Lnm2;

.field public final synthetic i:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "LOs4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LK20;Lnm2;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LK20;",
            "Lnm2;",
            "Lkotlin/jvm/functions/Function0<",
            "LOs4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LK20$b;->g:LK20;

    iput-object p2, p0, LK20$b;->h:Lnm2;

    iput-object p3, p0, LK20$b;->i:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LOs4;
    .locals 3

    iget-object v0, p0, LK20$b;->g:LK20;

    iget-object v1, p0, LK20$b;->h:Lnm2;

    iget-object v2, p0, LK20$b;->i:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, LK20;->h(LK20;Lnm2;Lkotlin/jvm/functions/Function0;)LOs4;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LK20$b;->g:LK20;

    invoke-virtual {v1}, LK20;->k()LI20;

    move-result-object v1

    invoke-interface {v1, v0}, LI20;->a(LOs4;)LOs4;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK20$b;->b()LOs4;

    move-result-object v0

    return-object v0
.end method
