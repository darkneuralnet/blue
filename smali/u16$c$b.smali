.class public final Lu16$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laq5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu16$c;->a(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
        "SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n76#2:370\n76#2:371\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n*L\n85#1:370\n88#1:371\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Laq5;

.field public final b:LsP5;

.field public final c:LsP5;


# direct methods
.method public constructor <init>(Laq5;Lv16;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu16$c$b;->a:Laq5;

    new-instance p1, Lu16$c$b$b;

    invoke-direct {p1, p2}, Lu16$c$b$b;-><init>(Lv16;)V

    invoke-static {p1}, LGM5;->c(Lkotlin/jvm/functions/Function0;)LsP5;

    move-result-object p1

    iput-object p1, p0, Lu16$c$b;->b:LsP5;

    new-instance p1, Lu16$c$b$a;

    invoke-direct {p1, p2}, Lu16$c$b$a;-><init>(Lv16;)V

    invoke-static {p1}, LGM5;->c(Lkotlin/jvm/functions/Function0;)LsP5;

    move-result-object p1

    iput-object p1, p0, Lu16$c$b;->c:LsP5;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lu16$c$b;->b:LsP5;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public b(F)F
    .locals 1

    iget-object v0, p0, Lu16$c$b;->a:Laq5;

    invoke-interface {v0, p1}, Laq5;->b(F)F

    move-result p1

    return p1
.end method

.method public c(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOX2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LWp5;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lu16$c$b;->a:Laq5;

    invoke-interface {v0, p1, p2, p3}, Laq5;->c(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lu16$c$b;->a:Laq5;

    invoke-interface {v0}, Laq5;->e()Z

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lu16$c$b;->c:LsP5;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
