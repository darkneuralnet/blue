.class public final Lsi0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJG\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "Lsi0;",
        "",
        "Lpm0;",
        "checkedColor",
        "uncheckedColor",
        "checkmarkColor",
        "disabledColor",
        "disabledIndeterminateColor",
        "Lri0;",
        "a",
        "(JJJJJLEt0;II)Lri0;",
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
        "SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n83#2,3:486\n1114#3,6:489\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n*L\n234#1:486,3\n234#1:489,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lsi0;

.field public static final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsi0;

    invoke-direct {v0}, Lsi0;-><init>()V

    sput-object v0, Lsi0;->a:Lsi0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJJJJLEt0;II)Lri0;
    .locals 30

    move-object/from16 v0, p11

    const v1, 0x1bfc5e88

    invoke-interface {v0, v1}, LEt0;->F(I)V

    and-int/lit8 v2, p13, 0x1

    const/4 v3, 0x6

    if-eqz v2, :cond_0

    sget-object v2, LTM2;->a:LTM2;

    invoke-virtual {v2, v0, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->l()J

    move-result-wide v4

    move-wide/from16 v21, v4

    goto :goto_0

    :cond_0
    move-wide/from16 v21, p1

    :goto_0
    and-int/lit8 v2, p13, 0x2

    if-eqz v2, :cond_1

    sget-object v2, LTM2;->a:LTM2;

    invoke-virtual {v2, v0, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->i()J

    move-result-wide v4

    const v6, 0x3f19999a    # 0.6f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v23, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v23, p3

    :goto_1
    and-int/lit8 v2, p13, 0x4

    if-eqz v2, :cond_2

    sget-object v2, LTM2;->a:LTM2;

    invoke-virtual {v2, v0, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->n()J

    move-result-wide v4

    move-wide v7, v4

    goto :goto_2

    :cond_2
    move-wide/from16 v7, p5

    :goto_2
    and-int/lit8 v2, p13, 0x8

    if-eqz v2, :cond_3

    sget-object v2, LTM2;->a:LTM2;

    invoke-virtual {v2, v0, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->i()J

    move-result-wide v4

    sget-object v2, LWz0;->a:LWz0;

    invoke-virtual {v2, v0, v3}, LWz0;->b(LEt0;I)F

    move-result v2

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xe

    const/4 v12, 0x0

    move-wide/from16 p1, v4

    move/from16 p3, v2

    move/from16 p4, v6

    move/from16 p5, v9

    move/from16 p6, v10

    move/from16 p7, v11

    move-object/from16 p8, v12

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v25, v4

    goto :goto_3

    :cond_3
    move-wide/from16 v25, p7

    :goto_3
    and-int/lit8 v2, p13, 0x10

    if-eqz v2, :cond_4

    sget-object v2, LWz0;->a:LWz0;

    invoke-virtual {v2, v0, v3}, LWz0;->b(LEt0;I)F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v9, 0x0

    move-wide/from16 p1, v21

    move/from16 p3, v2

    move/from16 p4, v3

    move/from16 p5, v4

    move/from16 p6, v5

    move/from16 p7, v6

    move-object/from16 p8, v9

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    move-wide/from16 v27, v2

    goto :goto_4

    :cond_4
    move-wide/from16 v27, p9

    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:226)"

    move/from16 v4, p12

    invoke-static {v1, v4, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_5
    const/4 v1, 0x5

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static/range {v21 .. v22}, Lpm0;->i(J)Lpm0;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static/range {v23 .. v24}, Lpm0;->i(J)Lpm0;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static {v7, v8}, Lpm0;->i(J)Lpm0;

    move-result-object v3

    const/4 v5, 0x2

    aput-object v3, v2, v5

    const/4 v3, 0x3

    invoke-static/range {v25 .. v26}, Lpm0;->i(J)Lpm0;

    move-result-object v5

    aput-object v5, v2, v3

    invoke-static/range {v27 .. v28}, Lpm0;->i(J)Lpm0;

    move-result-object v3

    const/4 v5, 0x4

    aput-object v3, v2, v5

    const v3, -0x21de6e89

    invoke-interface {v0, v3}, LEt0;->F(I)V

    move v3, v4

    :goto_5
    if-ge v4, v1, :cond_6

    aget-object v5, v2, v4

    invoke-interface {v0, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_6
    invoke-interface/range {p11 .. p11}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v3, :cond_7

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_8

    :cond_7
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-wide/from16 p1, v7

    move/from16 p3, v1

    move/from16 p4, v2

    move/from16 p5, v3

    move/from16 p6, v4

    move/from16 p7, v5

    move-object/from16 p8, v6

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    move-wide/from16 p1, v21

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v13

    move-wide/from16 p1, v25

    invoke-static/range {p1 .. p8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v17

    new-instance v1, LCW0;

    move-object v6, v1

    const/16 v29, 0x0

    move-wide/from16 v11, v21

    move-wide/from16 v15, v25

    move-wide/from16 v19, v27

    invoke-direct/range {v6 .. v29}, LCW0;-><init>(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface/range {p11 .. p11}, LEt0;->Q()V

    check-cast v1, LCW0;

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    invoke-interface/range {p11 .. p11}, LEt0;->Q()V

    return-object v1
.end method
