.class public final LMw$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMw;->a(Lkotlin/jvm/functions/Function3;LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V
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
        "SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n223#2,2:188\n223#2,2:190\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n*L\n79#1:188,2\n85#1:190,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LMw$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LMw$a;

    invoke-direct {v0}, LMw$a;-><init>()V

    sput-object v0, LMw$a;->a:LMw$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LzO2;Ljava/util/List;J)LyO2;
    .locals 14
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

    move-object v0, p1

    move-object/from16 v1, p2

    const-string v2, "$this$Layout"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "measurables"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "Collection contains no element matching the predicate."

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LvO2;

    invoke-static {v3}, Landroidx/compose/ui/layout/a;->a(LvO2;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "badge"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xb

    const/4 v13, 0x0

    move-wide/from16 v6, p3

    invoke-static/range {v6 .. v13}, Lkz0;->e(JIIIIILjava/lang/Object;)J

    move-result-wide v5

    invoke-interface {v3, v5, v6}, LvO2;->P0(J)LOU3;

    move-result-object v2

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LvO2;

    invoke-static {v3}, Landroidx/compose/ui/layout/a;->a(LvO2;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "anchor"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-wide/from16 v5, p3

    invoke-interface {v3, v5, v6}, LvO2;->P0(J)LOU3;

    move-result-object v1

    invoke-static {}, LN9;->a()LYM1;

    move-result-object v3

    invoke-interface {v1, v3}, LAO2;->v(LL9;)I

    move-result v3

    invoke-static {}, LN9;->b()LYM1;

    move-result-object v4

    invoke-interface {v1, v4}, LAO2;->v(LL9;)I

    move-result v4

    invoke-virtual {v1}, LOU3;->i1()I

    move-result v5

    invoke-virtual {v1}, LOU3;->d1()I

    move-result v6

    const/4 v7, 0x2

    new-array v7, v7, [Lkotlin/Pair;

    invoke-static {}, LN9;->a()LYM1;

    move-result-object v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v8, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v8, 0x0

    aput-object v3, v7, v8

    invoke-static {}, LN9;->b()LYM1;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v7, v4

    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    new-instance v4, LMw$a$a;

    invoke-direct {v4, v2, p1, v1}, LMw$a$a;-><init>(LOU3;LzO2;LOU3;)V

    invoke-interface {p1, v5, v6, v3, v4}, LzO2;->O0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)LyO2;

    move-result-object v0

    return-object v0

    :cond_0
    move-wide/from16 v5, p3

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-wide/from16 v5, p3

    goto/16 :goto_0

    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
