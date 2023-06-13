.class public final LIC0$h;
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
        "LI61;",
        "Lkotlin/Unit;",
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
        "SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1087:1\n245#2:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n*L\n372#1:1088\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LC16;

.field public final synthetic h:LF16;

.field public final synthetic i:LHe3;


# direct methods
.method public constructor <init>(LC16;LF16;LHe3;)V
    .locals 0

    iput-object p1, p0, LIC0$h;->g:LC16;

    iput-object p2, p0, LIC0$h;->h:LF16;

    iput-object p3, p0, LIC0$h;->i:LHe3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI61;

    invoke-virtual {p0, p1}, LIC0$h;->invoke(LI61;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LI61;)V
    .locals 7

    const-string v0, "$this$drawBehind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIC0$h;->g:LC16;

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v3, p0, LIC0$h;->h:LF16;

    iget-object v4, p0, LIC0$h;->i:LHe3;

    iget-object v1, p0, LIC0$h;->g:LC16;

    invoke-interface {p1}, LI61;->d0()LC61;

    move-result-object p1

    invoke-interface {p1}, LC61;->a()Lme0;

    move-result-object v2

    sget-object p1, Li16;->a:Li16$a;

    invoke-virtual {v0}, Lj26;->i()Li26;

    move-result-object v5

    invoke-virtual {v1}, LC16;->m()LkE3;

    move-result-object v6

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Li16$a;->b(Lme0;LF16;LHe3;Li26;LkE3;)V

    :cond_0
    return-void
.end method
