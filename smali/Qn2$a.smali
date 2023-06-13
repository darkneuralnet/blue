.class public final LQn2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQn2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0007\u001a\u0004\u0008\u000c\u0010\tR+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0005\u00a8\u0006\u001d"
    }
    d2 = {
        "LQn2$a;",
        "",
        "Lkotlin/Function0;",
        "",
        "c",
        "()Lkotlin/jvm/functions/Function2;",
        "a",
        "Ljava/lang/Object;",
        "e",
        "()Ljava/lang/Object;",
        "key",
        "b",
        "g",
        "type",
        "",
        "<set-?>",
        "LEX2;",
        "f",
        "()I",
        "h",
        "(I)V",
        "lastKnownIndex",
        "d",
        "Lkotlin/jvm/functions/Function2;",
        "_content",
        "content",
        "initialIndex",
        "<init>",
        "(LQn2;ILjava/lang/Object;Ljava/lang/Object;)V",
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
        "SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n76#2:113\n102#2,2:114\n1#3:116\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n*L\n83#1:113\n83#1:114,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:LEX2;

.field public d:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic e:LQn2;


# direct methods
.method public constructor <init>(LQn2;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LQn2$a;->e:LQn2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LQn2$a;->a:Ljava/lang/Object;

    iput-object p4, p0, LQn2$a;->b:Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, LQn2$a;->c:LEX2;

    return-void
.end method

.method public static final synthetic a(LQn2$a;I)V
    .locals 0

    invoke-virtual {p0, p1}, LQn2$a;->h(I)V

    return-void
.end method

.method public static final synthetic b(LQn2$a;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    iput-object p1, p0, LQn2$a;->d:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final c()Lkotlin/jvm/functions/Function2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, LQn2$a$a;

    iget-object v1, p0, LQn2$a;->e:LQn2;

    invoke-direct {v0, v1, p0}, LQn2$a$a;-><init>(LQn2;LQn2$a;)V

    const v1, 0x53af4291

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LQn2$a;->d:Lkotlin/jvm/functions/Function2;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LQn2$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    iput-object v0, p0, LQn2$a;->d:Lkotlin/jvm/functions/Function2;

    :cond_0
    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQn2$a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, LQn2$a;->c:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQn2$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(I)V
    .locals 1

    iget-object v0, p0, LQn2$a;->c:LEX2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
