.class public final LQU3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n8\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u0003\u0010\u000fR+\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0019\u001a\u0004\u0008\r\u0010\u001a\"\u0004\u0008\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006!"
    }
    d2 = {
        "LQU3;",
        "",
        "",
        "a",
        "I",
        "c",
        "()I",
        "f",
        "(I)V",
        "mainAxisSize",
        "Lne;",
        "LA52;",
        "Ltf;",
        "b",
        "Lne;",
        "()Lne;",
        "animatedOffset",
        "J",
        "d",
        "()J",
        "g",
        "(J)V",
        "targetOffset",
        "",
        "<set-?>",
        "LEX2;",
        "()Z",
        "e",
        "(Z)V",
        "inProgress",
        "initialOffset",
        "<init>",
        "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "foundation_release"
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
        "SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,350:1\n76#2:351\n102#2,2:352\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n*L\n340#1:351\n340#1:352,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final b:Lne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne<",
            "LA52;",
            "Ltf;",
            ">;"
        }
    .end annotation
.end field

.field public c:J

.field public final d:LEX2;


# direct methods
.method public constructor <init>(JI)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, LQU3;->a:I

    new-instance p3, Lne;

    invoke-static {p1, p2}, LA52;->b(J)LA52;

    move-result-object v1

    sget-object v0, LA52;->b:LA52$a;

    invoke-static {v0}, LXj6;->d(LA52$a;)Lwb6;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, Lne;-><init>(Ljava/lang/Object;Lwb6;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, LQU3;->b:Lne;

    iput-wide p1, p0, LQU3;->c:J

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LQU3;->d:LEX2;

    return-void
.end method

.method public synthetic constructor <init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LQU3;-><init>(JI)V

    return-void
.end method


# virtual methods
.method public final a()Lne;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne<",
            "LA52;",
            "Ltf;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LQU3;->b:Lne;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, LQU3;->d:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LQU3;->a:I

    return v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, LQU3;->c:J

    return-wide v0
.end method

.method public final e(Z)V
    .locals 1

    iget-object v0, p0, LQU3;->d:LEX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, LQU3;->a:I

    return-void
.end method

.method public final g(J)V
    .locals 0

    iput-wide p1, p0, LQU3;->c:J

    return-void
.end method
