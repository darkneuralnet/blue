.class public final LVv1;
.super LgV2$c;
.source "SourceFile"

# interfaces
.implements LUv1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0005\u001a\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "LVv1;",
        "LUv1;",
        "LgV2$c;",
        "",
        "R",
        "S",
        "Landroidx/compose/ui/focus/h;",
        "l",
        "Landroidx/compose/ui/focus/h;",
        "e0",
        "()Landroidx/compose/ui/focus/h;",
        "f0",
        "(Landroidx/compose/ui/focus/h;)V",
        "focusRequester",
        "<init>",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,84:1\n728#2,2:85\n735#2,2:87\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n*L\n76#1:85,2\n80#1:87,2\n*E\n"
    }
.end annotation


# instance fields
.field public l:Landroidx/compose/ui/focus/h;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/h;)V
    .locals 1

    const-string v0, "focusRequester"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LgV2$c;-><init>()V

    iput-object p1, p0, LVv1;->l:Landroidx/compose/ui/focus/h;

    return-void
.end method


# virtual methods
.method public R()V
    .locals 1

    invoke-super {p0}, LgV2$c;->R()V

    iget-object v0, p0, LVv1;->l:Landroidx/compose/ui/focus/h;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/h;->d()LLX2;

    move-result-object v0

    invoke-virtual {v0, p0}, LLX2;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public S()V
    .locals 1

    iget-object v0, p0, LVv1;->l:Landroidx/compose/ui/focus/h;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/h;->d()LLX2;

    move-result-object v0

    invoke-virtual {v0, p0}, LLX2;->A(Ljava/lang/Object;)Z

    invoke-super {p0}, LgV2$c;->S()V

    return-void
.end method

.method public final e0()Landroidx/compose/ui/focus/h;
    .locals 1

    iget-object v0, p0, LVv1;->l:Landroidx/compose/ui/focus/h;

    return-object v0
.end method

.method public final f0(Landroidx/compose/ui/focus/h;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LVv1;->l:Landroidx/compose/ui/focus/h;

    return-void
.end method
