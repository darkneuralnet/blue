.class public final LuX3$b;
.super LpX3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LuX3;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u000b\u001a\u00020\u0008H\u0016J\u0008\u0010\u000c\u001a\u00020\u0008H\u0002J\u0010\u0010\r\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "uX3$b",
        "LpX3;",
        "LYW3;",
        "pointerEvent",
        "LaX3;",
        "pass",
        "LG52;",
        "bounds",
        "",
        "e1",
        "(LYW3;LaX3;J)V",
        "d1",
        "i1",
        "h1",
        "LuX3$a;",
        "c",
        "LuX3$a;",
        "state",
        "",
        "c1",
        "()Z",
        "shareWithSiblings",
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
        "SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n86#2,2:360\n33#2,6:362\n88#2:368\n101#2,2:369\n33#2,6:371\n103#2:377\n33#2,6:378\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:351,2\n223#1:353,6\n223#1:359\n238#1:360,2\n238#1:362,6\n238#1:368\n280#1:369,2\n280#1:371,6\n280#1:377\n314#1:378,6\n*E\n"
    }
.end annotation


# instance fields
.field public c:LuX3$a;

.field public final synthetic d:LuX3;


# direct methods
.method public constructor <init>(LuX3;)V
    .locals 0

    iput-object p1, p0, LuX3$b;->d:LuX3;

    invoke-direct {p0}, LpX3;-><init>()V

    sget-object p1, LuX3$a;->b:LuX3$a;

    iput-object p1, p0, LuX3$b;->c:LuX3$a;

    return-void
.end method

.method public static final synthetic g1(LuX3$b;LuX3$a;)V
    .locals 0

    iput-object p1, p0, LuX3$b;->c:LuX3$a;

    return-void
.end method


# virtual methods
.method public c1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d1()V
    .locals 4

    iget-object v0, p0, LuX3$b;->c:LuX3$a;

    sget-object v1, LuX3$a;->c:LuX3$a;

    if-ne v0, v1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    new-instance v2, LuX3$b$c;

    iget-object v3, p0, LuX3$b;->d:LuX3;

    invoke-direct {v2, v3}, LuX3$b$c;-><init>(LuX3;)V

    invoke-static {v0, v1, v2}, LwX3;->a(JLkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, LuX3$b;->i1()V

    :cond_0
    return-void
.end method

.method public e1(LYW3;LaX3;J)V
    .locals 5

    const-string p3, "pointerEvent"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "pass"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYW3;->c()Ljava/util/List;

    move-result-object p3

    iget-object p4, p0, LuX3$b;->d:LuX3;

    invoke-virtual {p4}, LuX3;->a()Z

    move-result p4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p4, :cond_5

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    move v2, v0

    :goto_0
    if-ge v2, p4, :cond_3

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LjX3;

    invoke-static {v3}, LZW3;->b(LjX3;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {v3}, LZW3;->d(LjX3;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    move v3, v0

    goto :goto_2

    :cond_1
    :goto_1
    move v3, v1

    :goto_2
    if-eqz v3, :cond_2

    move p4, v1

    goto :goto_3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    move p4, v0

    :goto_3
    if-eqz p4, :cond_4

    goto :goto_4

    :cond_4
    move p4, v0

    goto :goto_5

    :cond_5
    :goto_4
    move p4, v1

    :goto_5
    iget-object v2, p0, LuX3$b;->c:LuX3$a;

    sget-object v3, LuX3$a;->d:LuX3$a;

    if-eq v2, v3, :cond_7

    sget-object v2, LaX3;->b:LaX3;

    if-ne p2, v2, :cond_6

    if-eqz p4, :cond_6

    invoke-virtual {p0, p1}, LuX3$b;->h1(LYW3;)V

    :cond_6
    sget-object v2, LaX3;->d:LaX3;

    if-ne p2, v2, :cond_7

    if-nez p4, :cond_7

    invoke-virtual {p0, p1}, LuX3$b;->h1(LYW3;)V

    :cond_7
    sget-object p1, LaX3;->d:LaX3;

    if-ne p2, p1, :cond_a

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    move p2, v0

    :goto_6
    if-ge p2, p1, :cond_9

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LjX3;

    invoke-static {p4}, LZW3;->d(LjX3;)Z

    move-result p4

    if-nez p4, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    :cond_9
    move v0, v1

    :goto_7
    if-eqz v0, :cond_a

    invoke-virtual {p0}, LuX3$b;->i1()V

    :cond_a
    return-void
.end method

.method public final h1(LYW3;)V
    .locals 7

    invoke-virtual {p1}, LYW3;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LjX3;

    invoke-virtual {v5}, LjX3;->n()Z

    move-result v5

    if-eqz v5, :cond_0

    move v1, v4

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_1
    const-string v3, "layoutCoordinates not set"

    if-eqz v1, :cond_4

    iget-object v0, p0, LuX3$b;->c:LuX3$a;

    sget-object v1, LuX3$a;->c:LuX3$a;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, LpX3;->b1()Lnm2;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v1, LCe3;->b:LCe3$a;

    invoke-virtual {v1}, LCe3$a;->c()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lnm2;->y(J)J

    move-result-wide v0

    new-instance v2, LuX3$b$a;

    iget-object v3, p0, LuX3$b;->d:LuX3;

    invoke-direct {v2, v3}, LuX3$b$a;-><init>(LuX3;)V

    invoke-static {p1, v0, v1, v2}, LwX3;->b(LYW3;JLkotlin/jvm/functions/Function1;)V

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_2
    sget-object p1, LuX3$a;->d:LuX3$a;

    iput-object p1, p0, LuX3$b;->c:LuX3$a;

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, LpX3;->b1()Lnm2;

    move-result-object v1

    if-eqz v1, :cond_8

    sget-object v3, LCe3;->b:LCe3$a;

    invoke-virtual {v3}, LCe3$a;->c()J

    move-result-wide v5

    invoke-interface {v1, v5, v6}, Lnm2;->y(J)J

    move-result-wide v5

    new-instance v1, LuX3$b$b;

    iget-object v3, p0, LuX3$b;->d:LuX3;

    invoke-direct {v1, p0, v3}, LuX3$b$b;-><init>(LuX3$b;LuX3;)V

    invoke-static {p1, v5, v6, v1}, LwX3;->c(LYW3;JLkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, LuX3$b;->c:LuX3$a;

    sget-object v3, LuX3$a;->c:LuX3$a;

    if-ne v1, v3, :cond_7

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_3
    if-ge v2, v1, :cond_5

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LjX3;

    invoke-virtual {v3}, LjX3;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, LYW3;->d()Lt62;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    iget-object v0, p0, LuX3$b;->d:LuX3;

    invoke-virtual {v0}, LuX3;->a()Z

    move-result v0

    xor-int/2addr v0, v4

    invoke-virtual {p1, v0}, Lt62;->e(Z)V

    :cond_7
    :goto_4
    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i1()V
    .locals 2

    sget-object v0, LuX3$a;->b:LuX3$a;

    iput-object v0, p0, LuX3$b;->c:LuX3$a;

    iget-object v0, p0, LuX3$b;->d:LuX3;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LuX3;->g(Z)V

    return-void
.end method
