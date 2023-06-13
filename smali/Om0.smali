.class public final LOm0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\" \u0010\u000c\u001a\u00020\u00048\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0007\u0012\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Llo$l;",
        "verticalArrangement",
        "LK9$b;",
        "horizontalAlignment",
        "LxO2;",
        "a",
        "(Llo$l;LK9$b;LEt0;I)LxO2;",
        "LxO2;",
        "getDefaultColumnMeasurePolicy",
        "()LxO2;",
        "getDefaultColumnMeasurePolicy$annotations",
        "()V",
        "DefaultColumnMeasurePolicy",
        "foundation-layout_release"
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
        "SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,250:1\n75#2:251\n76#2,11:253\n89#2:280\n76#3:252\n460#4,16:264\n50#4:281\n49#4:282\n1057#5,6:283\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n79#1:251\n79#1:253,11\n79#1:280\n79#1:252\n79#1:264,16\n105#1:281\n105#1:282\n105#1:283,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LxO2;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    sget-object v0, LRm2;->c:LRm2;

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    invoke-interface {v1}, Llo$l;->a()F

    move-result v1

    sget-object v2, LQE0;->a:LQE0$b;

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->j()LK9$b;

    move-result-object v3

    invoke-virtual {v2, v3}, LQE0$b;->a(LK9$b;)LQE0;

    move-result-object v2

    sget-object v3, LDB5;->b:LDB5;

    sget-object v4, LOm0$a;->g:LOm0$a;

    invoke-static {v0, v4, v1, v3, v2}, LUc5;->r(LRm2;Lkotlin/jvm/functions/Function5;FLDB5;LQE0;)LxO2;

    move-result-object v0

    sput-object v0, LOm0;->a:LxO2;

    return-void
.end method

.method public static final a(Llo$l;LK9$b;LEt0;I)LxO2;
    .locals 3
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    const-string v0, "verticalArrangement"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "horizontalAlignment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x40f63170

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:98)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p3, Llo;->a:Llo;

    invoke-virtual {p3}, Llo;->g()Llo$l;

    move-result-object p3

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p3, LK9;->a:LK9$a;

    invoke-virtual {p3}, LK9$a;->j()LK9$b;

    move-result-object p3

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p0, LOm0;->a:LxO2;

    goto :goto_0

    :cond_1
    const p3, 0x1e7b2b64

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_2

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_3

    :cond_2
    sget-object p3, LRm2;->c:LRm2;

    invoke-interface {p0}, Llo$l;->a()F

    move-result v0

    sget-object v1, LQE0;->a:LQE0$b;

    invoke-virtual {v1, p1}, LQE0$b;->a(LK9$b;)LQE0;

    move-result-object p1

    sget-object v1, LDB5;->b:LDB5;

    new-instance v2, LOm0$b;

    invoke-direct {v2, p0}, LOm0$b;-><init>(Llo$l;)V

    invoke-static {p3, v2, v0, v1, p1}, LUc5;->r(LRm2;Lkotlin/jvm/functions/Function5;FLDB5;LQE0;)LxO2;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    move-object p0, v0

    check-cast p0, LxO2;

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    return-object p0
.end method
