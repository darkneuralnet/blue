.class public final LTX$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTX;->m(Lio/reactivex/F;LDX;Lbi3;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/disposables/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "Lio/reactivex/disposables/c;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lio/reactivex/disposables/c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LDX;

.field public final synthetic h:Lbi3;

.field public final synthetic i:Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LDX;Lbi3;Lio/reactivex/F;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDX;",
            "Lbi3;",
            "Lio/reactivex/F<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LTX$b;->g:LDX;

    iput-object p2, p0, LTX$b;->h:Lbi3;

    iput-object p3, p0, LTX$b;->i:Lio/reactivex/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/disposables/c;)V
    .locals 9

    iget-object p1, p0, LTX$b;->g:LDX;

    new-instance v8, LZo2;

    iget-object v1, p0, LTX$b;->h:Lbi3;

    iget-object v2, p0, LTX$b;->i:Lio/reactivex/F;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LZo2;-><init>(Lbi3;Lio/reactivex/F;Lio/reactivex/Observable;Lio/reactivex/p;Lio/reactivex/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x1

    invoke-interface {p1, v8, v0}, LDX;->c(LZo2;Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, LTX$b;->a(Lio/reactivex/disposables/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
