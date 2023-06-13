.class public final LUm4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ3\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "LUm4;",
        "",
        "Lpm0;",
        "selectedColor",
        "unselectedColor",
        "disabledColor",
        "LTm4;",
        "a",
        "(JJJLEt0;II)LTm4;",
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
        "SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n67#2,3:234\n66#2:237\n1114#3,6:238\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n168#1:234,3\n168#1:237\n168#1:238,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LUm4;

.field public static final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LUm4;

    invoke-direct {v0}, LUm4;-><init>()V

    sput-object v0, LUm4;->a:LUm4;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJJLEt0;II)LTm4;
    .locals 19

    move-object/from16 v0, p7

    const v1, 0x51b3583a

    invoke-interface {v0, v1}, LEt0;->F(I)V

    and-int/lit8 v2, p9, 0x1

    const/4 v3, 0x6

    if-eqz v2, :cond_0

    sget-object v2, LTM2;->a:LTM2;

    invoke-virtual {v2, v0, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->l()J

    move-result-wide v4

    move-wide v7, v4

    goto :goto_0

    :cond_0
    move-wide/from16 v7, p1

    :goto_0
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_1

    sget-object v2, LTM2;->a:LTM2;

    invoke-virtual {v2, v0, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->i()J

    move-result-wide v9

    const v11, 0x3f19999a    # 0.6f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xe

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide v9, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v9, p3

    :goto_1
    and-int/lit8 v2, p9, 0x4

    if-eqz v2, :cond_2

    sget-object v2, LTM2;->a:LTM2;

    invoke-virtual {v2, v0, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->i()J

    move-result-wide v11

    sget-object v2, LWz0;->a:LWz0;

    invoke-virtual {v2, v0, v3}, LWz0;->b(LEt0;I)F

    move-result v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/16 v18, 0x0

    invoke-static/range {v11 .. v18}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    move-wide v11, v2

    goto :goto_2

    :cond_2
    move-wide/from16 v11, p5

    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)"

    move/from16 v4, p8

    invoke-static {v1, v4, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_3
    invoke-static {v7, v8}, Lpm0;->i(J)Lpm0;

    move-result-object v1

    invoke-static {v9, v10}, Lpm0;->i(J)Lpm0;

    move-result-object v2

    invoke-static {v11, v12}, Lpm0;->i(J)Lpm0;

    move-result-object v3

    const v4, 0x607fb4c4

    invoke-interface {v0, v4}, LEt0;->F(I)V

    invoke-interface {v0, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v0, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v0, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface/range {p7 .. p7}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_5

    :cond_4
    new-instance v2, LsY0;

    const/4 v13, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v13}, LsY0;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface/range {p7 .. p7}, LEt0;->Q()V

    check-cast v2, LsY0;

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface/range {p7 .. p7}, LEt0;->Q()V

    return-object v2
.end method
