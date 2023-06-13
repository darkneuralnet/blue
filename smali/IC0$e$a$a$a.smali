.class public final LIC0$e$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIC0$e$a$a;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1087:1\n480#2,4:1088\n485#2:1097\n122#3,5:1092\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n*L\n598#1:1088,4\n598#1:1097\n598#1:1092,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LC16;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Li26;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:LF16;

.field public final synthetic d:LHe3;

.field public final synthetic e:Lg01;

.field public final synthetic f:I


# direct methods
.method public constructor <init>(LC16;Lkotlin/jvm/functions/Function1;LF16;LHe3;Lg01;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC16;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Li26;",
            "Lkotlin/Unit;",
            ">;",
            "LF16;",
            "LHe3;",
            "Lg01;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, LIC0$e$a$a$a;->a:LC16;

    iput-object p2, p0, LIC0$e$a$a$a;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, LIC0$e$a$a$a;->c:LF16;

    iput-object p4, p0, LIC0$e$a$a$a;->d:LHe3;

    iput-object p5, p0, LIC0$e$a$a$a;->e:Lg01;

    iput p6, p0, LIC0$e$a$a$a;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LzO2;Ljava/util/List;J)LyO2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LzO2;",
            "Ljava/util/List<",
            "+",
            "LvO2;",
            ">;J)",
            "LyO2;"
        }
    .end annotation

    const-string v0, "$this$measure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LsM5;->e:LsM5$a;

    iget-object v0, p0, LIC0$e$a$a$a;->a:LC16;

    invoke-virtual {p2}, LsM5$a;->a()LsM5;

    move-result-object p2

    :try_start_0
    invoke-virtual {p2}, LsM5;->k()LsM5;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj26;->i()Li26;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    :try_start_2
    invoke-virtual {p2, v1}, LsM5;->r(LsM5;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {p2}, LsM5;->d()V

    sget-object v2, Li16;->a:Li16$a;

    iget-object p2, p0, LIC0$e$a$a$a;->a:LC16;

    invoke-virtual {p2}, LC16;->r()LT06;

    move-result-object v3

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v6

    move-wide v4, p3

    move-object v7, v0

    invoke-virtual/range {v2 .. v7}, Li16$a;->c(LT06;JLpm2;Li26;)Lkotlin/Triple;

    move-result-object p2

    invoke-virtual {p2}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p2}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p2}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li26;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LIC0$e$a$a$a;->a:LC16;

    new-instance v1, Lj26;

    invoke-direct {v1, p2}, Lj26;-><init>(Li26;)V

    invoke-virtual {v0, v1}, LC16;->y(Lj26;)V

    iget-object v0, p0, LIC0$e$a$a$a;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LIC0$e$a$a$a;->a:LC16;

    iget-object v1, p0, LIC0$e$a$a$a;->c:LF16;

    iget-object v2, p0, LIC0$e$a$a$a;->d:LHe3;

    invoke-static {v0, v1, v2}, LIC0;->g(LC16;LF16;LHe3;)V

    :cond_1
    iget-object v0, p0, LIC0$e$a$a$a;->a:LC16;

    iget-object v1, p0, LIC0$e$a$a$a;->e:Lg01;

    iget v2, p0, LIC0$e$a$a$a;->f:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_2

    invoke-virtual {p2, v4}, Li26;->l(I)F

    move-result v2

    invoke-static {v2}, LV06;->a(F)I

    move-result v2

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    invoke-interface {v1, v2}, Lg01;->w(I)F

    move-result v1

    invoke-virtual {v0, v1}, LC16;->z(F)V

    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/Pair;

    invoke-static {}, LN9;->a()LYM1;

    move-result-object v1

    invoke-virtual {p2}, Li26;->g()F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {}, LN9;->b()LYM1;

    move-result-object v1

    invoke-virtual {p2}, Li26;->j()F

    move-result p2

    invoke-static {p2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    aput-object p2, v0, v3

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    sget-object v0, LIC0$e$a$a$a$a;->g:LIC0$e$a$a$a$a;

    invoke-interface {p1, p3, p4, p2, v0}, LzO2;->O0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)LyO2;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-virtual {p2, v1}, LsM5;->r(LsM5;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {p2}, LsM5;->d()V

    throw p1
.end method

.method public b(LZ62;Ljava/util/List;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ62;",
            "Ljava/util/List<",
            "+",
            "LX62;",
            ">;I)I"
        }
    .end annotation

    const-string p3, "<this>"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "measurables"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LIC0$e$a$a$a;->a:LC16;

    invoke-virtual {p2}, LC16;->r()LT06;

    move-result-object p2

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object p1

    invoke-virtual {p2, p1}, LT06;->o(Lpm2;)V

    iget-object p1, p0, LIC0$e$a$a$a;->a:LC16;

    invoke-virtual {p1}, LC16;->r()LT06;

    move-result-object p1

    invoke-virtual {p1}, LT06;->c()I

    move-result p1

    return p1
.end method
