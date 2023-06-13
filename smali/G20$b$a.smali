.class public final LG20$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG20$b;->a(LgV2;LEt0;I)LgV2;
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
        "SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,154:1\n728#2,2:155\n62#3,5:157\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2$1\n*L\n113#1:155,2\n114#1:157,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LE20;

.field public final synthetic h:LH20;


# direct methods
.method public constructor <init>(LE20;LH20;)V
    .locals 0

    iput-object p1, p0, LG20$b$a;->g:LE20;

    iput-object p2, p0, LG20$b$a;->h:LH20;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LG20$b$a;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 2

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LG20$b$a;->g:LE20;

    check-cast p1, LF20;

    invoke-virtual {p1}, LF20;->c()LLX2;

    move-result-object p1

    iget-object v0, p0, LG20$b$a;->h:LH20;

    invoke-virtual {p1, v0}, LLX2;->b(Ljava/lang/Object;)Z

    iget-object p1, p0, LG20$b$a;->g:LE20;

    iget-object v0, p0, LG20$b$a;->h:LH20;

    new-instance v1, LG20$b$a$a;

    invoke-direct {v1, p1, v0}, LG20$b$a$a;-><init>(LE20;LH20;)V

    return-object v1
.end method
