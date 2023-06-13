.class public final Le80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg01;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\t\u0008\u0000\u00a2\u0006\u0004\u0008$\u0010%J\u001f\u0010\u0008\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\u0008\u0005R\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010 R\u0014\u0010#\u001a\u00020\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010 \u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006&"
    }
    d2 = {
        "Le80;",
        "Lg01;",
        "Lkotlin/Function1;",
        "LiA0;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "block",
        "LH61;",
        "d",
        "LW30;",
        "b",
        "LW30;",
        "getCacheParams$ui_release",
        "()LW30;",
        "e",
        "(LW30;)V",
        "cacheParams",
        "c",
        "LH61;",
        "()LH61;",
        "f",
        "(LH61;)V",
        "drawResult",
        "LxB5;",
        "h",
        "()J",
        "size",
        "Lpm2;",
        "getLayoutDirection",
        "()Lpm2;",
        "layoutDirection",
        "",
        "()F",
        "density",
        "R0",
        "fontScale",
        "<init>",
        "()V",
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
        "SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"
    }
.end annotation


# instance fields
.field public b:LW30;

.field public c:LH61;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LOa1;->b:LOa1;

    iput-object v0, p0, Le80;->b:LW30;

    return-void
.end method


# virtual methods
.method public R0()F
    .locals 1

    iget-object v0, p0, Le80;->b:LW30;

    invoke-interface {v0}, LW30;->b()Lg01;

    move-result-object v0

    invoke-interface {v0}, Lg01;->R0()F

    move-result v0

    return v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, Le80;->b:LW30;

    invoke-interface {v0}, LW30;->b()Lg01;

    move-result-object v0

    invoke-interface {v0}, Lg01;->b()F

    move-result v0

    return v0
.end method

.method public final c()LH61;
    .locals 1

    iget-object v0, p0, Le80;->c:LH61;

    return-object v0
.end method

.method public final d(Lkotlin/jvm/functions/Function1;)LH61;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LiA0;",
            "Lkotlin/Unit;",
            ">;)",
            "LH61;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH61;

    invoke-direct {v0, p1}, LH61;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Le80;->c:LH61;

    return-object v0
.end method

.method public final e(LW30;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le80;->b:LW30;

    return-void
.end method

.method public final f(LH61;)V
    .locals 0

    iput-object p1, p0, Le80;->c:LH61;

    return-void
.end method

.method public final getLayoutDirection()Lpm2;
    .locals 1

    iget-object v0, p0, Le80;->b:LW30;

    invoke-interface {v0}, LW30;->getLayoutDirection()Lpm2;

    move-result-object v0

    return-object v0
.end method

.method public final h()J
    .locals 2

    iget-object v0, p0, Le80;->b:LW30;

    invoke-interface {v0}, LW30;->h()J

    move-result-wide v0

    return-wide v0
.end method
