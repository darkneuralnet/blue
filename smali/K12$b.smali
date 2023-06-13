.class public final LK12$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK12;->d(LJ12;Ljava/lang/Object;Ljava/lang/Object;Lwb6;LI12;Ljava/lang/String;LEt0;II)LsP5;
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
        "SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,364:1\n62#2,5:365\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n*L\n283#1:365,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LJ12;

.field public final synthetic h:LJ12$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJ12$a<",
            "TT;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LJ12;LJ12$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJ12;",
            "LJ12$a<",
            "TT;TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, LK12$b;->g:LJ12;

    iput-object p2, p0, LK12$b;->h:LJ12$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LK12$b;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 2

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LK12$b;->g:LJ12;

    iget-object v0, p0, LK12$b;->h:LJ12$a;

    invoke-virtual {p1, v0}, LJ12;->f(LJ12$a;)V

    iget-object p1, p0, LK12$b;->g:LJ12;

    iget-object v0, p0, LK12$b;->h:LJ12$a;

    new-instance v1, LK12$b$a;

    invoke-direct {v1, p1, v0}, LK12$b$a;-><init>(LJ12;LJ12$a;)V

    return-object v1
.end method
