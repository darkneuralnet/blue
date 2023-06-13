.class public final Law1$c$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Law1$c;->e(LgV2;LEt0;I)LgV2;
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
        "SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,227:1\n62#2,5:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$2\n*L\n104#1:228,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LZC0;

.field public final synthetic i:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lxv1;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:LrX2;


# direct methods
.method public constructor <init>(ZLZC0;LEX2;LrX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LZC0;",
            "LEX2<",
            "Lxv1;",
            ">;",
            "LrX2;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Law1$c$b;->g:Z

    iput-object p2, p0, Law1$c$b;->h:LZC0;

    iput-object p3, p0, Law1$c$b;->i:LEX2;

    iput-object p4, p0, Law1$c$b;->j:LrX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, Law1$c$b;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 6

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Law1$c$b;->g:Z

    if-nez p1, :cond_0

    iget-object v0, p0, Law1$c$b;->h:LZC0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Law1$c$b$a;

    iget-object p1, p0, Law1$c$b;->i:LEX2;

    iget-object v4, p0, Law1$c$b;->j:LrX2;

    const/4 v5, 0x0

    invoke-direct {v3, p1, v4, v5}, Law1$c$b$a;-><init>(LEX2;LrX2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_0
    new-instance p1, Law1$c$b$b;

    invoke-direct {p1}, Law1$c$b$b;-><init>()V

    return-object p1
.end method
