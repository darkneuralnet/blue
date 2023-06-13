.class public final LLV2;
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
        "_moreVert",
        "LEP1$a;",
        "(LEP1$a;)LtY1;",
        "MoreVert",
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
        "SMAP\nMoreVert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoreVert.kt\nandroidx/compose/material/icons/filled/MoreVertKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,55:1\n122#2:56\n116#2,3:57\n119#2,3:61\n132#2,18:64\n152#2:101\n175#3:60\n694#4,2:82\n706#4,2:84\n708#4,11:90\n53#5,4:86\n*S KotlinDebug\n*F\n+ 1 MoreVert.kt\nandroidx/compose/material/icons/filled/MoreVertKt\n*L\n29#1:56\n29#1:57,3\n29#1:61,3\n30#1:64,18\n30#1:101\n29#1:60\n30#1:82,2\n30#1:84,2\n30#1:90,11\n30#1:86,4\n*E\n"
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

    sget-object v0, LLV2;->a:LtY1;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const-string v2, "Filled.MoreVert"

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

    new-instance v7, LeJ3;

    invoke-direct {v7}, LeJ3;-><init>()V

    const/high16 v0, 0x41000000    # 8.0f

    const/high16 v8, 0x41400000    # 12.0f

    invoke-virtual {v7, v8, v0}, LeJ3;->j(FF)LeJ3;

    const v1, 0x3f8ccccd    # 1.1f

    const/4 v2, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    const v4, -0x4099999a    # -0.9f

    const/high16 v5, 0x40000000    # 2.0f

    const/high16 v6, -0x40000000    # -2.0f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, LeJ3;->d(FFFFFF)LeJ3;

    const v9, -0x4099999a    # -0.9f

    const/high16 v10, -0x40000000    # -2.0f

    invoke-virtual {v7, v9, v10, v10, v10}, LeJ3;->l(FFFF)LeJ3;

    const v11, 0x3f666666    # 0.9f

    const/high16 v12, 0x40000000    # 2.0f

    invoke-virtual {v7, v10, v11, v10, v12}, LeJ3;->l(FFFF)LeJ3;

    invoke-virtual {v7, v11, v12, v12, v12}, LeJ3;->l(FFFF)LeJ3;

    invoke-virtual {v7}, LeJ3;->b()LeJ3;

    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v7, v8, v0}, LeJ3;->j(FF)LeJ3;

    const v1, -0x40733333    # -1.1f

    const/high16 v3, -0x40000000    # -2.0f

    const v4, 0x3f666666    # 0.9f

    const/high16 v5, -0x40000000    # -2.0f

    const/high16 v6, 0x40000000    # 2.0f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, LeJ3;->d(FFFFFF)LeJ3;

    invoke-virtual {v7, v11, v12, v12, v12}, LeJ3;->l(FFFF)LeJ3;

    invoke-virtual {v7, v12, v9, v12, v10}, LeJ3;->l(FFFF)LeJ3;

    invoke-virtual {v7, v9, v10, v10, v10}, LeJ3;->l(FFFF)LeJ3;

    invoke-virtual {v7}, LeJ3;->b()LeJ3;

    const/high16 v0, 0x41800000    # 16.0f

    invoke-virtual {v7, v8, v0}, LeJ3;->j(FF)LeJ3;

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, LeJ3;->d(FFFFFF)LeJ3;

    invoke-virtual {v7, v11, v12, v12, v12}, LeJ3;->l(FFFF)LeJ3;

    invoke-virtual {v7, v12, v9, v12, v10}, LeJ3;->l(FFFF)LeJ3;

    invoke-virtual {v7, v9, v10, v10, v10}, LeJ3;->l(FFFF)LeJ3;

    invoke-virtual {v7}, LeJ3;->b()LeJ3;

    invoke-virtual {v7}, LeJ3;->e()Ljava/util/List;

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

    sput-object v0, LLV2;->a:LtY1;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method
