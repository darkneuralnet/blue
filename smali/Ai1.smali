.class public final LAi1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u00f1\u0001\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "LAi1;",
        "",
        "Lpm0;",
        "textColor",
        "disabledTextColor",
        "backgroundColor",
        "cursorColor",
        "errorCursorColor",
        "focusedBorderColor",
        "unfocusedBorderColor",
        "disabledBorderColor",
        "errorBorderColor",
        "leadingIconColor",
        "disabledLeadingIconColor",
        "errorLeadingIconColor",
        "trailingIconColor",
        "focusedTrailingIconColor",
        "disabledTrailingIconColor",
        "errorTrailingIconColor",
        "focusedLabelColor",
        "unfocusedLabelColor",
        "disabledLabelColor",
        "errorLabelColor",
        "placeholderColor",
        "disabledPlaceholderColor",
        "Ld16;",
        "a",
        "(JJJJJJJJJJJJJJJJJJJJJJLEt0;IIII)Ld16;",
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
        "SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,731:1\n76#2:732\n76#2:733\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n*L\n353#1:732\n456#1:733\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LAi1;

.field public static final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LAi1;

    invoke-direct {v0}, LAi1;-><init>()V

    sput-object v0, LAi1;->a:LAi1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJJJJJJJJJJJJJJJJJJJJJLEt0;IIII)Ld16;
    .locals 53

    move-object/from16 v0, p45

    move/from16 v1, p49

    const v2, 0x454c7f1e

    invoke-interface {v0, v2}, LEt0;->F(I)V

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    invoke-static {}, LgA0;->a()LU94;

    move-result-object v3

    invoke-interface {v0, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm0;

    invoke-virtual {v3}, Lpm0;->w()J

    move-result-wide v4

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v3

    invoke-interface {v0, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide/from16 v3, p1

    :goto_0
    and-int/lit8 v5, v1, 0x2

    const/4 v13, 0x6

    if-eqz v5, :cond_1

    sget-object v5, LWz0;->a:LWz0;

    invoke-virtual {v5, v0, v13}, LWz0;->b(LEt0;I)F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xe

    const/4 v12, 0x0

    move-wide v5, v3

    invoke-static/range {v5 .. v12}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide v8, v5

    goto :goto_1

    :cond_1
    move-wide/from16 v8, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    sget-object v5, Lpm0;->b:Lpm0$a;

    invoke-virtual {v5}, Lpm0$a;->f()J

    move-result-wide v5

    move-wide/from16 v36, v5

    goto :goto_2

    :cond_2
    move-wide/from16 v36, p5

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->j()J

    move-result-wide v5

    move-wide v10, v5

    goto :goto_3

    :cond_3
    move-wide/from16 v10, p7

    :goto_3
    and-int/lit8 v5, v1, 0x10

    if-eqz v5, :cond_4

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->d()J

    move-result-wide v5

    move-wide v14, v5

    goto :goto_4

    :cond_4
    move-wide/from16 v14, p9

    :goto_4
    and-int/lit8 v5, v1, 0x20

    if-eqz v5, :cond_5

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->j()J

    move-result-wide v5

    sget-object v7, LWz0;->a:LWz0;

    invoke-virtual {v7, v0, v13}, LWz0;->c(LEt0;I)F

    move-result v7

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0xe

    const/16 v19, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v7

    move/from16 p4, v12

    move/from16 p5, v16

    move/from16 p6, v17

    move/from16 p7, v18

    move-object/from16 p8, v19

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v16, v5

    goto :goto_5

    :cond_5
    move-wide/from16 v16, p11

    :goto_5
    and-int/lit8 v5, v1, 0x40

    if-eqz v5, :cond_6

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->i()J

    move-result-wide v5

    sget-object v7, LWz0;->a:LWz0;

    invoke-virtual {v7, v0, v13}, LWz0;->b(LEt0;I)F

    move-result v7

    const/4 v12, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v21, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v7

    move/from16 p4, v12

    move/from16 p5, v18

    move/from16 p6, v19

    move/from16 p7, v20

    move-object/from16 p8, v21

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v18, v5

    goto :goto_6

    :cond_6
    move-wide/from16 v18, p13

    :goto_6
    and-int/lit16 v5, v1, 0x80

    if-eqz v5, :cond_7

    sget-object v5, LWz0;->a:LWz0;

    invoke-virtual {v5, v0, v13}, LWz0;->b(LEt0;I)F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/16 v20, 0xe

    const/16 v21, 0x0

    move-wide/from16 p1, v18

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v7

    move/from16 p6, v12

    move/from16 p7, v20

    move-object/from16 p8, v21

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v20, v5

    goto :goto_7

    :cond_7
    move-wide/from16 v20, p15

    :goto_7
    and-int/lit16 v5, v1, 0x100

    if-eqz v5, :cond_8

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->d()J

    move-result-wide v5

    move-wide/from16 v22, v5

    goto :goto_8

    :cond_8
    move-wide/from16 v22, p17

    :goto_8
    and-int/lit16 v5, v1, 0x200

    if-eqz v5, :cond_9

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->i()J

    move-result-wide v5

    const v7, 0x3f0a3d71    # 0.54f

    const/4 v12, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0xe

    const/16 v27, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v7

    move/from16 p4, v12

    move/from16 p5, v24

    move/from16 p6, v25

    move/from16 p7, v26

    move-object/from16 p8, v27

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v24, v5

    goto :goto_9

    :cond_9
    move-wide/from16 v24, p19

    :goto_9
    and-int/lit16 v5, v1, 0x400

    if-eqz v5, :cond_a

    sget-object v5, LWz0;->a:LWz0;

    invoke-virtual {v5, v0, v13}, LWz0;->b(LEt0;I)F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/16 v26, 0xe

    const/16 v27, 0x0

    move-wide/from16 p1, v24

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v7

    move/from16 p6, v12

    move/from16 p7, v26

    move-object/from16 p8, v27

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v26, v5

    goto :goto_a

    :cond_a
    move-wide/from16 v26, p21

    :goto_a
    and-int/lit16 v5, v1, 0x800

    if-eqz v5, :cond_b

    move-wide/from16 v28, v24

    goto :goto_b

    :cond_b
    move-wide/from16 v28, p23

    :goto_b
    and-int/lit16 v5, v1, 0x1000

    if-eqz v5, :cond_c

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->i()J

    move-result-wide v5

    const v7, 0x3f0a3d71    # 0.54f

    const/4 v12, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0xe

    const/16 v33, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v7

    move/from16 p4, v12

    move/from16 p5, v30

    move/from16 p6, v31

    move/from16 p7, v32

    move-object/from16 p8, v33

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v30, v5

    goto :goto_c

    :cond_c
    move-wide/from16 v30, p25

    :goto_c
    and-int/lit16 v5, v1, 0x2000

    if-eqz v5, :cond_d

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->j()J

    move-result-wide v5

    sget-object v7, LWz0;->a:LWz0;

    invoke-virtual {v7, v0, v13}, LWz0;->c(LEt0;I)F

    move-result v7

    const/4 v12, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0xe

    const/16 v35, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v7

    move/from16 p4, v12

    move/from16 p5, v32

    move/from16 p6, v33

    move/from16 p7, v34

    move-object/from16 p8, v35

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v32, v5

    goto :goto_d

    :cond_d
    move-wide/from16 v32, p27

    :goto_d
    and-int/lit16 v5, v1, 0x4000

    if-eqz v5, :cond_e

    sget-object v5, LWz0;->a:LWz0;

    invoke-virtual {v5, v0, v13}, LWz0;->b(LEt0;I)F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/16 v34, 0xe

    const/16 v35, 0x0

    move-wide/from16 p1, v30

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v7

    move/from16 p6, v12

    move/from16 p7, v34

    move-object/from16 p8, v35

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v34, v5

    goto :goto_e

    :cond_e
    move-wide/from16 v34, p29

    :goto_e
    const v5, 0x8000

    and-int/2addr v5, v1

    if-eqz v5, :cond_f

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->d()J

    move-result-wide v5

    move-wide/from16 v38, v5

    goto :goto_f

    :cond_f
    move-wide/from16 v38, p31

    :goto_f
    const/high16 v5, 0x10000

    and-int/2addr v5, v1

    if-eqz v5, :cond_10

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->j()J

    move-result-wide v5

    sget-object v7, LWz0;->a:LWz0;

    invoke-virtual {v7, v0, v13}, LWz0;->c(LEt0;I)F

    move-result v7

    const/4 v12, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0xe

    const/16 v43, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v7

    move/from16 p4, v12

    move/from16 p5, v40

    move/from16 p6, v41

    move/from16 p7, v42

    move-object/from16 p8, v43

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v40, v5

    goto :goto_10

    :cond_10
    move-wide/from16 v40, p33

    :goto_10
    const/high16 v5, 0x20000

    and-int/2addr v5, v1

    if-eqz v5, :cond_11

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->i()J

    move-result-wide v5

    sget-object v7, LWz0;->a:LWz0;

    invoke-virtual {v7, v0, v13}, LWz0;->d(LEt0;I)F

    move-result v7

    const/4 v12, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0xe

    const/16 v45, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v7

    move/from16 p4, v12

    move/from16 p5, v42

    move/from16 p6, v43

    move/from16 p7, v44

    move-object/from16 p8, v45

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v42, v5

    goto :goto_11

    :cond_11
    move-wide/from16 v42, p35

    :goto_11
    const/high16 v5, 0x40000

    and-int/2addr v5, v1

    if-eqz v5, :cond_12

    sget-object v5, LWz0;->a:LWz0;

    invoke-virtual {v5, v0, v13}, LWz0;->b(LEt0;I)F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/16 v44, 0xe

    const/16 v45, 0x0

    move-wide/from16 p1, v42

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v7

    move/from16 p6, v12

    move/from16 p7, v44

    move-object/from16 p8, v45

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v44, v5

    goto :goto_12

    :cond_12
    move-wide/from16 v44, p37

    :goto_12
    const/high16 v5, 0x80000

    and-int/2addr v5, v1

    if-eqz v5, :cond_13

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->d()J

    move-result-wide v5

    move-wide/from16 v46, v5

    goto :goto_13

    :cond_13
    move-wide/from16 v46, p39

    :goto_13
    const/high16 v5, 0x100000

    and-int/2addr v5, v1

    if-eqz v5, :cond_14

    sget-object v5, LTM2;->a:LTM2;

    invoke-virtual {v5, v0, v13}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->i()J

    move-result-wide v5

    sget-object v7, LWz0;->a:LWz0;

    invoke-virtual {v7, v0, v13}, LWz0;->d(LEt0;I)F

    move-result v7

    const/4 v12, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0xe

    const/16 v51, 0x0

    move-wide/from16 p1, v5

    move/from16 p3, v7

    move/from16 p4, v12

    move/from16 p5, v48

    move/from16 p6, v49

    move/from16 p7, v50

    move-object/from16 p8, v51

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v48, v5

    goto :goto_14

    :cond_14
    move-wide/from16 v48, p41

    :goto_14
    const/high16 v5, 0x200000

    and-int/2addr v1, v5

    if-eqz v1, :cond_15

    sget-object v1, LWz0;->a:LWz0;

    invoke-virtual {v1, v0, v13}, LWz0;->b(LEt0;I)F

    move-result v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v12, 0xe

    const/4 v13, 0x0

    move-wide/from16 p1, v48

    move/from16 p3, v1

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v12

    move-object/from16 p8, v13

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v51, v5

    goto :goto_15

    :cond_15
    move-wide/from16 v51, p43

    :goto_15
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_16

    const-string v1, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:454)"

    move/from16 v5, p46

    move/from16 v6, p47

    invoke-static {v2, v5, v6, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_16
    new-instance v1, LPY0;

    move-object v5, v1

    const/16 v50, 0x0

    move-wide v6, v3

    move-wide v12, v14

    move-wide/from16 v14, v16

    move-wide/from16 v16, v18

    move-wide/from16 v18, v22

    move-wide/from16 v22, v24

    move-wide/from16 v24, v26

    move-wide/from16 v26, v28

    move-wide/from16 v28, v30

    move-wide/from16 v30, v32

    move-wide/from16 v32, v34

    move-wide/from16 v34, v38

    move-wide/from16 v38, v40

    move-wide/from16 v40, v42

    move-wide/from16 v42, v44

    move-wide/from16 v44, v46

    move-wide/from16 v46, v48

    move-wide/from16 v48, v51

    invoke-direct/range {v5 .. v50}, LPY0;-><init>(JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-static {}, LQt0;->Y()V

    :cond_17
    invoke-interface/range {p45 .. p45}, LEt0;->Q()V

    return-object v1
.end method
