.class public final Lqq5;
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
        "_search",
        "LEP1$a;",
        "(LEP1$a;)LtY1;",
        "Search",
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
        "SMAP\nSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Search.kt\nandroidx/compose/material/icons/filled/SearchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,57:1\n122#2:58\n116#2,3:59\n119#2,3:63\n132#2,18:66\n152#2:103\n175#3:62\n694#4,2:84\n706#4,2:86\n708#4,11:92\n53#5,4:88\n*S KotlinDebug\n*F\n+ 1 Search.kt\nandroidx/compose/material/icons/filled/SearchKt\n*L\n29#1:58\n29#1:59,3\n29#1:63,3\n30#1:66,18\n30#1:103\n29#1:62\n30#1:84,2\n30#1:86,2\n30#1:92,11\n30#1:88,4\n*E\n"
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

    sget-object v0, Lqq5;->a:LtY1;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const-string v2, "Filled.Search"

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

    const/high16 v0, 0x41780000    # 15.5f

    const/high16 v8, 0x41600000    # 14.0f

    invoke-virtual {v7, v0, v8}, LeJ3;->j(FF)LeJ3;

    const v0, -0x40b5c28f    # -0.79f

    invoke-virtual {v7, v0}, LeJ3;->g(F)LeJ3;

    const v0, -0x4170a3d7    # -0.28f

    const v1, -0x4175c28f    # -0.27f

    invoke-virtual {v7, v0, v1}, LeJ3;->i(FF)LeJ3;

    const v1, 0x41768f5c    # 15.41f

    const v2, 0x414970a4    # 12.59f

    const/high16 v3, 0x41800000    # 16.0f

    const v4, 0x4131c28f    # 11.11f

    const/high16 v5, 0x41800000    # 16.0f

    const/high16 v6, 0x41180000    # 9.5f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, LeJ3;->c(FFFFFF)LeJ3;

    const/high16 v1, 0x41800000    # 16.0f

    const v2, 0x40bd1eb8    # 5.91f

    const v3, 0x415170a4    # 13.09f

    const/high16 v4, 0x40400000    # 3.0f

    const/high16 v5, 0x41180000    # 9.5f

    const/high16 v6, 0x40400000    # 3.0f

    invoke-virtual/range {v0 .. v6}, LeJ3;->c(FFFFFF)LeJ3;

    const/high16 v0, 0x40400000    # 3.0f

    const v1, 0x40bd1eb8    # 5.91f

    const/high16 v9, 0x41180000    # 9.5f

    invoke-virtual {v7, v0, v1, v0, v9}, LeJ3;->k(FFFF)LeJ3;

    const/high16 v0, 0x41800000    # 16.0f

    invoke-virtual {v7, v1, v0, v9, v0}, LeJ3;->k(FFFF)LeJ3;

    const v1, 0x3fce147b    # 1.61f

    const/4 v2, 0x0

    const v3, 0x4045c28f    # 3.09f

    const v4, -0x40e8f5c3    # -0.59f

    const v5, 0x40875c29    # 4.23f

    const v6, -0x40370a3d    # -1.57f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, LeJ3;->d(FFFFFF)LeJ3;

    const v0, 0x3e8a3d71    # 0.27f

    const v1, 0x3e8f5c29    # 0.28f

    invoke-virtual {v7, v0, v1}, LeJ3;->i(FF)LeJ3;

    const v0, 0x3f4a3d71    # 0.79f

    invoke-virtual {v7, v0}, LeJ3;->m(F)LeJ3;

    const v0, 0x409fae14    # 4.99f

    const/high16 v10, 0x40a00000    # 5.0f

    invoke-virtual {v7, v10, v0}, LeJ3;->i(FF)LeJ3;

    const v0, 0x41a3eb85    # 20.49f

    const/high16 v1, 0x41980000    # 19.0f

    invoke-virtual {v7, v0, v1}, LeJ3;->h(FF)LeJ3;

    const v0, -0x3f6051ec    # -4.99f

    const/high16 v1, -0x3f600000    # -5.0f

    invoke-virtual {v7, v0, v1}, LeJ3;->i(FF)LeJ3;

    invoke-virtual {v7}, LeJ3;->b()LeJ3;

    invoke-virtual {v7, v9, v8}, LeJ3;->j(FF)LeJ3;

    const v1, 0x40e051ec    # 7.01f

    const/high16 v2, 0x41600000    # 14.0f

    const/high16 v3, 0x40a00000    # 5.0f

    const v4, 0x413fd70a    # 11.99f

    const/high16 v5, 0x40a00000    # 5.0f

    const/high16 v6, 0x41180000    # 9.5f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, LeJ3;->c(FFFFFF)LeJ3;

    const v0, 0x40e051ec    # 7.01f

    invoke-virtual {v7, v0, v10, v9, v10}, LeJ3;->k(FFFF)LeJ3;

    invoke-virtual {v7, v8, v0, v8, v9}, LeJ3;->k(FFFF)LeJ3;

    const v0, 0x413fd70a    # 11.99f

    invoke-virtual {v7, v0, v8, v9, v8}, LeJ3;->k(FFFF)LeJ3;

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

    sput-object v0, Lqq5;->a:LtY1;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method
