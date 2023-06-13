.class public final LqY5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0010\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J3\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nR \u0010\u000f\u001a\u00020\u00048\u0006\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR \u0010\u0012\u001a\u00020\u00048\u0006\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u0011\u0010\u000eR \u0010\u0015\u001a\u00020\u00048\u0006\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000c\u001a\u0004\u0008\u0014\u0010\u000e\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0018"
    }
    d2 = {
        "LqY5;",
        "",
        "LgV2;",
        "modifier",
        "Lk61;",
        "thickness",
        "Lpm0;",
        "color",
        "",
        "a",
        "(LgV2;FJLEt0;II)V",
        "b",
        "F",
        "getDividerThickness-D9Ej5fM",
        "()F",
        "DividerThickness",
        "c",
        "getIndicatorHeight-D9Ej5fM",
        "IndicatorHeight",
        "d",
        "getScrollableTabRowPadding-D9Ej5fM",
        "ScrollableTabRowPadding",
        "<init>",
        "()V",
        "material_release"
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
        "SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,517:1\n76#2:518\n76#2:519\n135#3:520\n154#4:521\n154#4:522\n154#4:523\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n367#1:518\n384#1:519\n404#1:520\n431#1:521\n436#1:522\n441#1:523\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LqY5;

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LqY5;

    invoke-direct {v0}, LqY5;-><init>()V

    sput-object v0, LqY5;->a:LqY5;

    const/4 v0, 0x1

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LqY5;->b:F

    const/4 v0, 0x2

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LqY5;->c:F

    const/16 v0, 0x34

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, LqY5;->d:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LgV2;FJLEt0;II)V
    .locals 18

    move/from16 v6, p6

    const v0, 0x364bc30f

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0xe

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-interface {v1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p1

    move v4, v6

    :goto_1
    and-int/lit8 v5, v6, 0x70

    if-nez v5, :cond_5

    and-int/lit8 v5, p7, 0x2

    if-nez v5, :cond_3

    move/from16 v5, p2

    invoke-interface {v1, v5}, LEt0;->p(F)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    move/from16 v5, p2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_3

    :cond_5
    move/from16 v5, p2

    :goto_3
    and-int/lit16 v7, v6, 0x380

    if-nez v7, :cond_8

    and-int/lit8 v7, p7, 0x4

    if-nez v7, :cond_6

    move-wide/from16 v7, p3

    invoke-interface {v1, v7, v8}, LEt0;->s(J)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-wide/from16 v7, p3

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    goto :goto_5

    :cond_8
    move-wide/from16 v7, p3

    :goto_5
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v4, v4, 0xc00

    move-object/from16 v15, p0

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v6, 0x1c00

    move-object/from16 v15, p0

    if-nez v9, :cond_b

    invoke-interface {v1, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v4, v9

    :cond_b
    :goto_7
    and-int/lit16 v9, v4, 0x16db

    const/16 v10, 0x492

    if-ne v9, v10, :cond_d

    invoke-interface {v1}, LEt0;->b()Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v1}, LEt0;->k()V

    move-object v2, v3

    move v3, v5

    move-wide v4, v7

    goto/16 :goto_d

    :cond_d
    :goto_8
    invoke-interface {v1}, LEt0;->J()V

    and-int/lit8 v9, v6, 0x1

    if-eqz v9, :cond_11

    invoke-interface {v1}, LEt0;->l()Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_9

    :cond_e
    invoke-interface {v1}, LEt0;->k()V

    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_f

    and-int/lit8 v4, v4, -0x71

    :cond_f
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_10

    and-int/lit16 v4, v4, -0x381

    :cond_10
    move-object v2, v3

    move v3, v5

    goto :goto_c

    :cond_11
    :goto_9
    if-eqz v2, :cond_12

    sget-object v2, LgV2;->b0:LgV2$a;

    goto :goto_a

    :cond_12
    move-object v2, v3

    :goto_a
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_13

    sget v3, LqY5;->b:F

    and-int/lit8 v4, v4, -0x71

    goto :goto_b

    :cond_13
    move v3, v5

    :goto_b
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_14

    invoke-static {}, LgA0;->a()LU94;

    move-result-object v5

    invoke-interface {v1, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm0;

    invoke-virtual {v5}, Lpm0;->w()J

    move-result-wide v7

    const v9, 0x3df5c28f    # 0.12f

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xe

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    and-int/lit16 v4, v4, -0x381

    :cond_14
    :goto_c
    move-wide/from16 v16, v7

    move v7, v4

    move-wide/from16 v4, v16

    invoke-interface {v1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v8

    if-eqz v8, :cond_15

    const/4 v8, -0x1

    const-string v9, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:363)"

    invoke-static {v0, v7, v8, v9}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_15
    const/4 v11, 0x0

    and-int/lit8 v0, v7, 0xe

    shr-int/lit8 v8, v7, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v0, v8

    shl-int/lit8 v7, v7, 0x3

    and-int/lit16 v7, v7, 0x380

    or-int v13, v0, v7

    const/16 v14, 0x8

    move-object v7, v2

    move-wide v8, v4

    move v10, v3

    move-object v12, v1

    invoke-static/range {v7 .. v14}, LL51;->a(LgV2;JFFLEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LQt0;->Y()V

    :cond_16
    :goto_d
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_17

    goto :goto_e

    :cond_17
    new-instance v9, LqY5$a;

    move-object v0, v9

    move-object/from16 v1, p0

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LqY5$a;-><init>(LqY5;LgV2;FJII)V

    invoke-interface {v8, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_e
    return-void
.end method
