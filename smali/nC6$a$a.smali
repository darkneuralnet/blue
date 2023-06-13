.class public final LnC6$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LnC6$a;->c(LEt0;I)LnC6;
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
        "SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,767:1\n62#2,5:768\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n615#1:768,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LnC6;

.field public final synthetic h:Landroid/view/View;


# direct methods
.method public constructor <init>(LnC6;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LnC6$a$a;->g:LnC6;

    iput-object p2, p0, LnC6$a$a;->h:Landroid/view/View;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LnC6$a$a;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 2

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LnC6$a$a;->g:LnC6;

    iget-object v0, p0, LnC6$a$a;->h:Landroid/view/View;

    invoke-virtual {p1, v0}, LnC6;->g(Landroid/view/View;)V

    iget-object p1, p0, LnC6$a$a;->g:LnC6;

    iget-object v0, p0, LnC6$a$a;->h:Landroid/view/View;

    new-instance v1, LnC6$a$a$a;

    invoke-direct {v1, p1, v0}, LnC6$a$a$a;-><init>(LnC6;Landroid/view/View;)V

    return-object v1
.end method
