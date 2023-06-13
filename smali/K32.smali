.class public final LK32;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u001a-\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0002\u0008\u00042\u0006\u0010\u0006\u001a\u00020\u0000H\u0001\"(\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0002\u0008\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\n\"\"\u0010\u0012\u001a\u00020\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "LgV2;",
        "Lkotlin/Function1;",
        "LS42;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "inspectorInfo",
        "wrapped",
        "b",
        "a",
        "Lkotlin/jvm/functions/Function1;",
        "()Lkotlin/jvm/functions/Function1;",
        "NoInspectorInfo",
        "",
        "Z",
        "c",
        "()Z",
        "setDebugInspectorInfoEnabled",
        "(Z)V",
        "isDebugInspectorInfoEnabled",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LS42;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public static b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, LK32$a;->g:LK32$a;

    sput-object v0, LK32;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final a()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "LS42;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, LK32;->a:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final b(LgV2;Lkotlin/jvm/functions/Function1;LgV2;)LgV2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LS42;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            ")",
            "LgV2;"
        }
    .end annotation

    .annotation build Lkotlin/PublishedApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inspectorInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wrapped"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJ32;

    invoke-direct {v0, p1}, LJ32;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    invoke-interface {p0, p2}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    invoke-virtual {v0}, LJ32;->a()LJ32$a;

    move-result-object p1

    invoke-interface {p0, p1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Z
    .locals 1

    sget-boolean v0, LK32;->b:Z

    return v0
.end method
