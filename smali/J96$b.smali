.class public final LJ96$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ96;->b(LF96;Lwb6;Ljava/lang/String;LEt0;II)LF96$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lm51;",
        "Ll51;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1155:1\n62#2,5:1156\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n755#1:1156,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LF96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LF96$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "TS;>.a<TT;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LF96;LF96$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96<",
            "TS;>;",
            "LF96<",
            "TS;>.a<TT;TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, LJ96$b;->g:LF96;

    iput-object p2, p0, LJ96$b;->h:LF96$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LJ96$b;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 2

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LJ96$b;->g:LF96;

    iget-object v0, p0, LJ96$b;->h:LF96$a;

    new-instance v1, LJ96$b$a;

    invoke-direct {v1, p1, v0}, LJ96$b$a;-><init>(LF96;LF96$a;)V

    return-object v1
.end method
