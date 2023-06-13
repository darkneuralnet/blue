.class public final Lh16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aK\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "enabled",
        "isError",
        "Le62;",
        "interactionSource",
        "Ld16;",
        "colors",
        "Lk61;",
        "focusedBorderThickness",
        "unfocusedBorderThickness",
        "LsP5;",
        "LeZ;",
        "b",
        "(ZZLe62;Ld16;FFLEt0;I)LsP5;",
        "material_release"
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
        "SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,855:1\n76#2:856\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n*L\n844#1:856\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(ZZLe62;Ld16;FFLEt0;I)LsP5;
    .locals 0

    invoke-static/range {p0 .. p7}, Lh16;->b(ZZLe62;Ld16;FFLEt0;I)LsP5;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZZLe62;Ld16;FFLEt0;I)LsP5;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Le62;",
            "Ld16;",
            "FF",
            "LEt0;",
            "I)",
            "LsP5<",
            "LeZ;",
            ">;"
        }
    .end annotation

    move-object v6, p6

    move/from16 v7, p7

    const v0, 0x41709f90

    invoke-interface {p6, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:835)"

    invoke-static {v0, v7, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 v0, v7, 0x6

    and-int/lit8 v0, v0, 0xe

    move-object v3, p2

    invoke-static {p2, p6, v0}, Lzv1;->a(Le62;LEt0;I)LsP5;

    move-result-object v8

    and-int/lit8 v0, v7, 0xe

    and-int/lit8 v1, v7, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, v7, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v1, v7, 0x1c00

    or-int v5, v0, v1

    move-object v0, p3

    move v1, p0

    move v2, p1

    move-object v4, p6

    invoke-interface/range {v0 .. v5}, Ld16;->d(ZZLe62;LEt0;I)LsP5;

    move-result-object v0

    invoke-static {v8}, Lh16;->c(LsP5;)Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, p4

    goto :goto_0

    :cond_1
    move v1, p5

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p0, :cond_2

    const v4, 0x6479ecc2

    invoke-interface {p6, v4}, LEt0;->F(I)V

    const/16 v4, 0x96

    const/4 v5, 0x6

    invoke-static {v4, v2, v3, v5, v3}, Lmf;->k(IILh91;ILjava/lang/Object;)Ltb6;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v7, 0x30

    const/4 v8, 0x4

    move p0, v1

    move-object p1, v4

    move-object p2, v5

    move-object p3, p6

    move p4, v7

    move p5, v8

    invoke-static/range {p0 .. p5}, LJe;->d(FLlf;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object v1

    invoke-interface {p6}, LEt0;->Q()V

    goto :goto_1

    :cond_2
    const v1, 0x6479ed24

    invoke-interface {p6, v1}, LEt0;->F(I)V

    invoke-static {p5}, Lk61;->d(F)Lk61;

    move-result-object v1

    shr-int/lit8 v4, v7, 0xf

    and-int/lit8 v4, v4, 0xe

    invoke-static {v1, p6, v4}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v1

    invoke-interface {p6}, LEt0;->Q()V

    :goto_1
    new-instance v4, LeZ;

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk61;

    invoke-virtual {v1}, Lk61;->l()F

    move-result v1

    new-instance v5, LpN5;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpm0;

    invoke-virtual {v0}, Lpm0;->w()J

    move-result-wide v7

    invoke-direct {v5, v7, v8, v3}, LpN5;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v1, v5, v3}, LeZ;-><init>(FLa30;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4, p6, v2}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v0

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p6}, LEt0;->Q()V

    return-object v0
.end method

.method public static final c(LsP5;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method
