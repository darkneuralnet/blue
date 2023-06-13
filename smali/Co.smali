.class public final LCo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0001\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "LtY1;",
        "a",
        "LtY1;",
        "_arrowBack",
        "LEP1$a;",
        "(LEP1$a;)LtY1;",
        "ArrowBack",
        "material-icons-core_release"
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
        "SMAP\nArrowBack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrowBack.kt\nandroidx/compose/material/icons/filled/ArrowBackKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,48:1\n122#2:49\n116#2,3:50\n119#2,3:54\n132#2,18:57\n152#2:94\n175#3:53\n694#4,2:75\n706#4,2:77\n708#4,11:83\n53#5,4:79\n*S KotlinDebug\n*F\n+ 1 ArrowBack.kt\nandroidx/compose/material/icons/filled/ArrowBackKt\n*L\n29#1:49\n29#1:50,3\n29#1:54,3\n30#1:57,18\n30#1:94\n29#1:53\n30#1:75,2\n30#1:77,2\n30#1:83,11\n30#1:79,4\n*E\n"
    }
.end annotation


# static fields
.field public static a:LtY1;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a(LEP1$a;)LtY1;
    .locals 30

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LCo;->a:LtY1;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const-string v2, "Filled.ArrowBack"

    new-instance v1, LtY1$a;

    move-object v13, v1

    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {v0}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0}, Lk61;->g(F)F

    move-result v4

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xe0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v12}, LtY1$a;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v18, 0x3f800000    # 1.0f

    const/high16 v20, 0x3f800000    # 1.0f

    invoke-static {}, Ldk6;->b()I

    move-result v15

    new-instance v0, LpN5;

    move-object/from16 v17, v0

    sget-object v1, Lpm0;->b:Lpm0$a;

    invoke-virtual {v1}, Lpm0$a;->a()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LpN5;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x0

    const/high16 v21, 0x3f800000    # 1.0f

    sget-object v0, LLS5;->b:LLS5$a;

    invoke-virtual {v0}, LLS5$a;->a()I

    move-result v22

    sget-object v0, LNS5;->b:LNS5$a;

    invoke-virtual {v0}, LNS5$a;->a()I

    move-result v23

    const/high16 v24, 0x3f800000    # 1.0f

    const-string v16, ""

    new-instance v0, LeJ3;

    invoke-direct {v0}, LeJ3;-><init>()V

    const/high16 v1, 0x41300000    # 11.0f

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {v0, v2, v1}, LeJ3;->j(FF)LeJ3;

    const v1, 0x40fa8f5c    # 7.83f

    invoke-virtual {v0, v1}, LeJ3;->f(F)LeJ3;

    const v3, 0x40b2e148    # 5.59f

    const v4, -0x3f4d1eb8    # -5.59f

    invoke-virtual {v0, v3, v4}, LeJ3;->i(FF)LeJ3;

    const/high16 v3, 0x41400000    # 12.0f

    const/high16 v4, 0x40800000    # 4.0f

    invoke-virtual {v0, v3, v4}, LeJ3;->h(FF)LeJ3;

    const/high16 v3, -0x3f000000    # -8.0f

    const/high16 v4, 0x41000000    # 8.0f

    invoke-virtual {v0, v3, v4}, LeJ3;->i(FF)LeJ3;

    invoke-virtual {v0, v4, v4}, LeJ3;->i(FF)LeJ3;

    const v3, 0x3fb47ae1    # 1.41f

    const v4, -0x404b851f    # -1.41f

    invoke-virtual {v0, v3, v4}, LeJ3;->i(FF)LeJ3;

    const/high16 v3, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v3}, LeJ3;->h(FF)LeJ3;

    invoke-virtual {v0, v2}, LeJ3;->f(F)LeJ3;

    const/high16 v1, -0x40000000    # -2.0f

    invoke-virtual {v0, v1}, LeJ3;->m(F)LeJ3;

    invoke-virtual {v0}, LeJ3;->b()LeJ3;

    invoke-virtual {v0}, LeJ3;->e()Ljava/util/List;

    move-result-object v14

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x3800

    const/16 v29, 0x0

    invoke-static/range {v13 .. v29}, LtY1$a;->d(LtY1$a;Ljava/util/List;ILjava/lang/String;La30;FLa30;FFIIFFFFILjava/lang/Object;)LtY1$a;

    move-result-object v0

    invoke-virtual {v0}, LtY1$a;->f()LtY1;

    move-result-object v0

    sput-object v0, LCo;->a:LtY1;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method
