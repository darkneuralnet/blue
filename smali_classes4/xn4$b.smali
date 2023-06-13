.class public final Lxn4$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxn4;-><init>(LUI4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LZ84<",
        "Ljava/util/Set<",
        "+TK;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0008\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\u0001\"\u0004\u0008\u0000\u0010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "K",
        "LZ84;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()LZ84;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lxn4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxn4<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxn4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxn4<",
            "TK;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lxn4$b;->g:Lxn4;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LZ84;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/Set<",
            "TK;>;>;"
        }
    .end annotation

    sget-object v0, LZ84;->d:LZ84$a;

    iget-object v1, p0, Lxn4$b;->g:Lxn4;

    invoke-static {v1}, Lxn4;->access$getMutableLoadedIds$p(Lxn4;)La94;

    move-result-object v1

    invoke-virtual {v0, v1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxn4$b;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method
