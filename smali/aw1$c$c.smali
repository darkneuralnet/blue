.class public final Law1$c$c;
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
        "SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,227:1\n62#2,5:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n*L\n123#1:228,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LRT3;

.field public final synthetic h:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LRT3$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRT3;LEX2;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRT3;",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;",
            "LEX2<",
            "LRT3$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Law1$c$c;->g:LRT3;

    iput-object p2, p0, Law1$c$c;->h:LEX2;

    iput-object p3, p0, Law1$c$c;->i:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, Law1$c$c;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Law1$c$c;->h:LEX2;

    invoke-static {p1}, Law1$c;->b(LEX2;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Law1$c$c;->i:LEX2;

    iget-object v0, p0, Law1$c$c;->g:LRT3;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LRT3;->a()LRT3$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Law1$c;->a(LEX2;LRT3$a;)V

    :cond_1
    iget-object p1, p0, Law1$c$c;->i:LEX2;

    new-instance v0, Law1$c$c$a;

    invoke-direct {v0, p1}, Law1$c$c$a;-><init>(LEX2;)V

    return-object v0
.end method
