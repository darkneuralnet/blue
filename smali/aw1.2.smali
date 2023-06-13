.class public final Law1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u000c\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u001e\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000\"\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "LgV2;",
        "",
        "enabled",
        "LrX2;",
        "interactionSource",
        "b",
        "a",
        "c",
        "LJ32;",
        "LJ32;",
        "focusGroupInspectorInfo",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,227:1\n135#2:228\n135#2:229\n135#2:230\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n63#1:228\n212#1:229\n225#1:230\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LJ32;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LJ32;

    invoke-static {}, LK32;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Law1$f;

    invoke-direct {v1}, Law1$f;-><init>()V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    :goto_0
    invoke-direct {v0, v1}, LJ32;-><init>(Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Law1;->a:LJ32;

    return-void
.end method

.method public static final a(LgV2;)LgV2;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Law1;->a:LJ32;

    invoke-interface {p0, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    sget-object v0, Law1$a;->g:Law1$a;

    invoke-static {p0, v0}, Landroidx/compose/ui/focus/g;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/ui/focus/d;->a(LgV2;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LgV2;ZLrX2;)LgV2;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LK32;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Law1$b;

    invoke-direct {v0, p1, p2}, Law1$b;-><init>(ZLrX2;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    new-instance v1, Law1$c;

    invoke-direct {v1, p2, p1}, Law1$c;-><init>(LrX2;Z)V

    invoke-static {p0, v0, v1}, LDt0;->a(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LgV2;ZLrX2;)LgV2;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LK32;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Law1$d;

    invoke-direct {v0, p1, p2}, Law1$d;-><init>(ZLrX2;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    new-instance v1, Law1$e;

    invoke-direct {v1, p1, p2}, Law1$e;-><init>(ZLrX2;)V

    invoke-static {p0, v0, v1}, LDt0;->a(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object p0

    return-object p0
.end method
