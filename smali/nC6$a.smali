.class public final LnC6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LnC6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\"\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002J\"\u0010\u0011\u001a\u00020\u00102\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "LnC6$a;",
        "",
        "LnC6;",
        "c",
        "(LEt0;I)LnC6;",
        "Landroid/view/View;",
        "view",
        "d",
        "LDB6;",
        "windowInsets",
        "",
        "type",
        "",
        "name",
        "Lke;",
        "e",
        "LKj6;",
        "f",
        "",
        "testInsets",
        "Z",
        "Ljava/util/WeakHashMap;",
        "viewMap",
        "Ljava/util/WeakHashMap;",
        "<init>",
        "()V",
        "foundation-layout_release"
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
        "SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n76#2:768\n361#3,7:769\n1#4:776\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n610#1:768\n628#1:769,7\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LnC6$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LnC6$a;LDB6;ILjava/lang/String;)Lke;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LnC6$a;->e(LDB6;ILjava/lang/String;)Lke;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LnC6$a;LDB6;ILjava/lang/String;)LKj6;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LnC6$a;->f(LDB6;ILjava/lang/String;)LKj6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(LEt0;I)LnC6;
    .locals 3

    const v0, -0x5173c916

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:608)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0, p2}, LnC6$a;->d(Landroid/view/View;)LnC6;

    move-result-object v0

    new-instance v1, LnC6$a$a;

    invoke-direct {v1, v0, p2}, LnC6$a$a;-><init>(LnC6;Landroid/view/View;)V

    const/16 p2, 0x8

    invoke-static {v0, v1, p1, p2}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-object v0
.end method

.method public final d(Landroid/view/View;)LnC6;
    .locals 4

    invoke-static {}, LnC6;->a()Ljava/util/WeakHashMap;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, LnC6;->a()Ljava/util/WeakHashMap;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, LnC6;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1, v3}, LnC6;-><init>(LDB6;Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v2, LnC6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final e(LDB6;ILjava/lang/String;)Lke;
    .locals 1

    new-instance v0, Lke;

    invoke-direct {v0, p2, p3}, Lke;-><init>(ILjava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1, p2}, Lke;->h(LDB6;I)V

    :cond_0
    return-object v0
.end method

.method public final f(LDB6;ILjava/lang/String;)LKj6;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, LDB6;->g(I)LD32;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, LD32;->e:LD32;

    :cond_1
    const-string p2, "windowInsets?.getInsetsI\u2026e) ?: AndroidXInsets.NONE"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, LrC6;->a(LD32;Ljava/lang/String;)LKj6;

    move-result-object p1

    return-object p1
.end method
