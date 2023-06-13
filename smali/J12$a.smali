.class public final LJ12$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsP5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ12;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Lvf;",
        ">",
        "Ljava/lang/Object;",
        "LsP5<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0086\u0004\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0004BC\u0008\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010%\u001a\u00020!\u00a2\u0006\u0004\u0008@\u0010AJ-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0014\u001a\u0004\u0008\u0019\u0010\u0016\"\u0004\u0008\u001a\u0010\u0018R#\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\"\u001a\u0004\u0008#\u0010$R+\u0010+\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00008V@PX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010\u0016\"\u0004\u0008*\u0010\u0018R0\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00078\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/RB\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001008\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R\"\u0010<\u001a\u0002078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u00108\u001a\u0004\u0008\'\u00109\"\u0004\u0008:\u0010;R\u0016\u0010=\u001a\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u00108R\u0016\u0010?\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010>\u00a8\u0006B"
    }
    d2 = {
        "LJ12$a;",
        "T",
        "Lvf;",
        "V",
        "LsP5;",
        "initialValue",
        "targetValue",
        "Llf;",
        "animationSpec",
        "",
        "l",
        "(Ljava/lang/Object;Ljava/lang/Object;Llf;)V",
        "",
        "playTimeNanos",
        "h",
        "(J)V",
        "k",
        "()V",
        "i",
        "b",
        "Ljava/lang/Object;",
        "c",
        "()Ljava/lang/Object;",
        "setInitialValue$animation_core_release",
        "(Ljava/lang/Object;)V",
        "e",
        "setTargetValue$animation_core_release",
        "Lwb6;",
        "d",
        "Lwb6;",
        "getTypeConverter",
        "()Lwb6;",
        "typeConverter",
        "",
        "Ljava/lang/String;",
        "getLabel",
        "()Ljava/lang/String;",
        "label",
        "<set-?>",
        "f",
        "LEX2;",
        "getValue",
        "j",
        "value",
        "g",
        "Llf;",
        "getAnimationSpec",
        "()Llf;",
        "LQY5;",
        "LQY5;",
        "getAnimation",
        "()LQY5;",
        "setAnimation$animation_core_release",
        "(LQY5;)V",
        "animation",
        "",
        "Z",
        "()Z",
        "setFinished$animation_core_release",
        "(Z)V",
        "isFinished",
        "startOnTheNextFrame",
        "J",
        "playTimeNanosOffset",
        "<init>",
        "(LJ12;Ljava/lang/Object;Ljava/lang/Object;Lwb6;Llf;Ljava/lang/String;)V",
        "animation-core_release"
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
        "SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n76#2:365\n102#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"
    }
.end annotation


# instance fields
.field public b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final d:Lwb6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb6<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/String;

.field public final f:LEX2;

.field public g:Llf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llf<",
            "TT;>;"
        }
    .end annotation
.end field

.field public h:LQY5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LQY5<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field public i:Z

.field public j:Z

.field public k:J

.field public final synthetic l:LJ12;


# direct methods
.method public constructor <init>(LJ12;Ljava/lang/Object;Ljava/lang/Object;Lwb6;Llf;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;",
            "Lwb6<",
            "TT;TV;>;",
            "Llf<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "typeConverter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animationSpec"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LJ12$a;->l:LJ12;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LJ12$a;->b:Ljava/lang/Object;

    iput-object p3, p0, LJ12$a;->c:Ljava/lang/Object;

    iput-object p4, p0, LJ12$a;->d:Lwb6;

    iput-object p6, p0, LJ12$a;->e:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p3, 0x2

    invoke-static {p2, p1, p3, p1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LJ12$a;->f:LEX2;

    iput-object p5, p0, LJ12$a;->g:Llf;

    new-instance p1, LQY5;

    iget-object v1, p0, LJ12$a;->g:Llf;

    iget-object v3, p0, LJ12$a;->b:Ljava/lang/Object;

    iget-object v4, p0, LJ12$a;->c:Ljava/lang/Object;

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p1

    move-object v2, p4

    invoke-direct/range {v0 .. v7}, LQY5;-><init>(Llf;Lwb6;Ljava/lang/Object;Ljava/lang/Object;Lvf;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LJ12$a;->h:LQY5;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LJ12$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LJ12$a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, LJ12$a;->i:Z

    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LJ12$a;->f:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final h(J)V
    .locals 2

    iget-object v0, p0, LJ12$a;->l:LJ12;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LJ12;->d(LJ12;Z)V

    iget-boolean v0, p0, LJ12$a;->j:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, LJ12$a;->j:Z

    iput-wide p1, p0, LJ12$a;->k:J

    :cond_0
    iget-wide v0, p0, LJ12$a;->k:J

    sub-long/2addr p1, v0

    iget-object v0, p0, LJ12$a;->h:LQY5;

    invoke-virtual {v0, p1, p2}, LQY5;->e(J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LJ12$a;->j(Ljava/lang/Object;)V

    iget-object v0, p0, LJ12$a;->h:LQY5;

    invoke-interface {v0, p1, p2}, Lef;->b(J)Z

    move-result p1

    iput-boolean p1, p0, LJ12$a;->i:Z

    return-void
.end method

.method public final i()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LJ12$a;->j:Z

    return-void
.end method

.method public j(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LJ12$a;->f:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, LJ12$a;->h:LQY5;

    invoke-virtual {v0}, LQY5;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LJ12$a;->j(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LJ12$a;->j:Z

    return-void
.end method

.method public final l(Ljava/lang/Object;Ljava/lang/Object;Llf;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;",
            "Llf<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "animationSpec"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LJ12$a;->b:Ljava/lang/Object;

    iput-object p2, p0, LJ12$a;->c:Ljava/lang/Object;

    iput-object p3, p0, LJ12$a;->g:Llf;

    new-instance v0, LQY5;

    iget-object v3, p0, LJ12$a;->d:Lwb6;

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v8}, LQY5;-><init>(Llf;Lwb6;Ljava/lang/Object;Ljava/lang/Object;Lvf;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LJ12$a;->h:LQY5;

    iget-object p1, p0, LJ12$a;->l:LJ12;

    const/4 p2, 0x1

    invoke-static {p1, p2}, LJ12;->d(LJ12;Z)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LJ12$a;->i:Z

    iput-boolean p2, p0, LJ12$a;->j:Z

    return-void
.end method
