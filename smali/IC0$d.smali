.class public final LIC0$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIC0;->a(LF16;Lkotlin/jvm/functions/Function1;LgV2;LG26;LEu6;Lkotlin/jvm/functions/Function1;LrX2;La30;ZIILGY1;LZk2;ZZLkotlin/jvm/functions/Function3;LEt0;III)V
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
        "SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1087:1\n62#2,5:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n528#1:1088,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LU16;

.field public final synthetic h:LC16;

.field public final synthetic i:LF16;

.field public final synthetic j:LGY1;


# direct methods
.method public constructor <init>(LU16;LC16;LF16;LGY1;)V
    .locals 0

    iput-object p1, p0, LIC0$d;->g:LU16;

    iput-object p2, p0, LIC0$d;->h:LC16;

    iput-object p3, p0, LIC0$d;->i:LF16;

    iput-object p4, p0, LIC0$d;->j:LGY1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LIC0$d;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 7

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LIC0$d;->g:LU16;

    if-eqz p1, :cond_0

    iget-object p1, p0, LIC0$d;->h:LC16;

    invoke-virtual {p1}, LC16;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LIC0$d;->h:LC16;

    sget-object v0, Li16;->a:Li16$a;

    iget-object v1, p0, LIC0$d;->g:LU16;

    iget-object v2, p0, LIC0$d;->i:LF16;

    invoke-virtual {p1}, LC16;->k()LP91;

    move-result-object v3

    iget-object v4, p0, LIC0$d;->j:LGY1;

    iget-object v5, p0, LIC0$d;->h:LC16;

    invoke-virtual {v5}, LC16;->j()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    iget-object v6, p0, LIC0$d;->h:LC16;

    invoke-virtual {v6}, LC16;->i()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Li16$a;->h(LU16;LF16;LP91;LGY1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La26;

    move-result-object v0

    invoke-virtual {p1, v0}, LC16;->w(La26;)V

    :cond_0
    new-instance p1, LIC0$d$a;

    invoke-direct {p1}, LIC0$d$a;-><init>()V

    return-object p1
.end method
