.class public final LHA0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u000c\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0003\u0010\u000bR+\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R.\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00158\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0016\u001a\u0004\u0008\t\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "LHA0;",
        "",
        "LZe1;",
        "a",
        "LZe1;",
        "c",
        "()LZe1;",
        "targetContentEnter",
        "Lgi1;",
        "b",
        "Lgi1;",
        "()Lgi1;",
        "initialContentExit",
        "",
        "<set-?>",
        "LEX2;",
        "d",
        "()F",
        "setTargetContentZIndex",
        "(F)V",
        "targetContentZIndex",
        "LGB5;",
        "LGB5;",
        "()LGB5;",
        "setSizeTransform$animation_release",
        "(LGB5;)V",
        "sizeTransform",
        "<init>",
        "(LZe1;Lgi1;FLGB5;)V",
        "animation_release"
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
        "SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,780:1\n76#2:781\n102#2,2:782\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n219#1:781\n219#1:782,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LZe1;

.field public final b:Lgi1;

.field public final c:LEX2;

.field public d:LGB5;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LZe1;Lgi1;FLGB5;)V
    .locals 1

    const-string v0, "targetContentEnter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialContentExit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHA0;->a:LZe1;

    iput-object p2, p0, LHA0;->b:Lgi1;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LHA0;->c:LEX2;

    iput-object p4, p0, LHA0;->d:LGB5;

    return-void
.end method

.method public synthetic constructor <init>(LZe1;Lgi1;FLGB5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    const/4 p5, 0x3

    const/4 p6, 0x0

    invoke-static {p4, p6, p5, p6}, LMe;->c(ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGB5;

    move-result-object p4

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LHA0;-><init>(LZe1;Lgi1;FLGB5;)V

    return-void
.end method


# virtual methods
.method public final a()Lgi1;
    .locals 1

    iget-object v0, p0, LHA0;->b:Lgi1;

    return-object v0
.end method

.method public final b()LGB5;
    .locals 1

    iget-object v0, p0, LHA0;->d:LGB5;

    return-object v0
.end method

.method public final c()LZe1;
    .locals 1

    iget-object v0, p0, LHA0;->a:LZe1;

    return-object v0
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, LHA0;->c:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method
