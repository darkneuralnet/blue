.class public LDM5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFP5;
.implements LCM5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDM5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LFP5;",
        "LCM5<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0010\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011B\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0008\u0010\r\u001a\u00020\u000cH\u0016R \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015R*\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008V@VX\u0096\u000e\u00a2\u0006\u0012\u0012\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "LDM5;",
        "T",
        "LFP5;",
        "LCM5;",
        "LHP5;",
        "value",
        "",
        "c",
        "previous",
        "current",
        "applied",
        "e",
        "",
        "toString",
        "LEM5;",
        "b",
        "LEM5;",
        "a",
        "()LEM5;",
        "policy",
        "LDM5$a;",
        "LDM5$a;",
        "next",
        "getValue",
        "()Ljava/lang/Object;",
        "setValue",
        "(Ljava/lang/Object;)V",
        "getValue$annotations",
        "()V",
        "h",
        "()LHP5;",
        "firstStateRecord",
        "<init>",
        "(Ljava/lang/Object;LEM5;)V",
        "runtime_release"
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
        "SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,298:1\n2180#2:299\n2101#2,2:300\n1686#2:302\n2103#2,5:304\n2180#2:309\n2180#2:310\n70#3:303\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n131#1:299\n133#1:300,2\n133#1:302\n133#1:304,5\n174#1:309\n210#1:310\n133#1:303\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LEM5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEM5<",
            "TT;>;"
        }
    .end annotation
.end field

.field public c:LDM5$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LDM5$a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;LEM5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LEM5<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "policy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LDM5;->b:LEM5;

    new-instance p2, LDM5$a;

    invoke-direct {p2, p1}, LDM5$a;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LDM5;->c:LDM5$a;

    return-void
.end method


# virtual methods
.method public a()LEM5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEM5<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LDM5;->b:LEM5;

    return-object v0
.end method

.method public c(LHP5;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LDM5$a;

    iput-object p1, p0, LDM5;->c:LDM5$a;

    return-void
.end method

.method public e(LHP5;LHP5;LHP5;)LHP5;
    .locals 4

    const-string v0, "previous"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applied"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LDM5$a;

    move-object v0, p2

    check-cast v0, LDM5$a;

    check-cast p3, LDM5$a;

    invoke-virtual {p0}, LDM5;->a()LEM5;

    move-result-object v1

    invoke-virtual {v0}, LDM5$a;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p3}, LDM5$a;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LEM5;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LDM5;->a()LEM5;

    move-result-object p2

    invoke-virtual {p1}, LDM5$a;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, LDM5$a;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3}, LDM5$a;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, p1, v0, v1}, LEM5;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p3}, LDM5$a;->b()LHP5;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p3, p2

    check-cast p3, LDM5$a;

    invoke-virtual {p3, p1}, LDM5$a;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LDM5;->c:LDM5$a;

    invoke-static {v0, p0}, LxM5;->S(LHP5;LFP5;)LHP5;

    move-result-object v0

    check-cast v0, LDM5$a;

    invoke-virtual {v0}, LDM5$a;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public h()LHP5;
    .locals 1

    iget-object v0, p0, LDM5;->c:LDM5$a;

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LDM5;->c:LDM5$a;

    invoke-static {v0}, LxM5;->B(LHP5;)LHP5;

    move-result-object v0

    check-cast v0, LDM5$a;

    invoke-virtual {p0}, LDM5;->a()LEM5;

    move-result-object v1

    invoke-virtual {v0}, LDM5$a;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2, p1}, LEM5;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LDM5;->c:LDM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    sget-object v3, LsM5;->e:LsM5$a;

    invoke-virtual {v3}, LsM5$a;->b()LsM5;

    move-result-object v3

    invoke-static {v1, p0, v3, v0}, LxM5;->O(LHP5;LFP5;LsM5;LHP5;)LHP5;

    move-result-object v0

    check-cast v0, LDM5$a;

    invoke-virtual {v0, p1}, LDM5$a;->h(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    invoke-static {v3, p0}, LxM5;->M(LsM5;LFP5;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LDM5;->c:LDM5$a;

    invoke-static {v0}, LxM5;->B(LHP5;)LHP5;

    move-result-object v0

    check-cast v0, LDM5$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MutableState(value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LDM5$a;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
