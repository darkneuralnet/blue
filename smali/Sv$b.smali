.class public final LSv$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V
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
        "SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,110:1\n62#2,5:111\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n105#1:111,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Landroidx/activity/OnBackPressedDispatcher;

.field public final synthetic h:LLifecycleOwner;

.field public final synthetic i:LSv$d;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;LLifecycleOwner;LSv$d;)V
    .locals 0

    iput-object p1, p0, LSv$b;->g:Landroidx/activity/OnBackPressedDispatcher;

    iput-object p2, p0, LSv$b;->h:LLifecycleOwner;

    iput-object p3, p0, LSv$b;->i:LSv$d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LSv$b;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 2

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LSv$b;->g:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v0, p0, LSv$b;->h:LLifecycleOwner;

    iget-object v1, p0, LSv$b;->i:LSv$d;

    invoke-virtual {p1, v0, v1}, Landroidx/activity/OnBackPressedDispatcher;->b(LLifecycleOwner;LVe3;)V

    iget-object p1, p0, LSv$b;->i:LSv$d;

    new-instance v0, LSv$b$a;

    invoke-direct {v0, p1}, LSv$b$a;-><init>(LSv$d;)V

    return-object v0
.end method
