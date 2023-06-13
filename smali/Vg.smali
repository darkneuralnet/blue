.class public final LVg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J=\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\u000bH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\tH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\t*\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "LVg;",
        "",
        "",
        "width",
        "height",
        "LNW1;",
        "bitmapConfig",
        "",
        "hasAlpha",
        "LBm0;",
        "colorSpace",
        "Landroid/graphics/Bitmap;",
        "c",
        "(IIIZLBm0;)Landroid/graphics/Bitmap;",
        "a",
        "(Landroid/graphics/Bitmap;)LBm0;",
        "Landroid/graphics/ColorSpace;",
        "d",
        "(LBm0;)Landroid/graphics/ColorSpace;",
        "b",
        "(Landroid/graphics/ColorSpace;)LBm0;",
        "<init>",
        "()V",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LVg;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LVg;

    invoke-direct {v0}, LVg;-><init>()V

    sput-object v0, LVg;->a:LVg;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/graphics/Bitmap;)LBm0;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LLg;->a(Landroid/graphics/Bitmap;)Landroid/graphics/ColorSpace;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, LVg;->b(Landroid/graphics/ColorSpace;)LBm0;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->w()LSO4;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final b(Landroid/graphics/ColorSpace;)LBm0;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LMg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->w()LSO4;

    move-result-object p0

    goto/16 :goto_0

    :cond_0
    invoke-static {}, LUg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->e()LSO4;

    move-result-object p0

    goto/16 :goto_0

    :cond_1
    invoke-static {}, LDg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->f()LSO4;

    move-result-object p0

    goto/16 :goto_0

    :cond_2
    invoke-static {}, LEg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->g()LSO4;

    move-result-object p0

    goto/16 :goto_0

    :cond_3
    invoke-static {}, LFg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->h()LSO4;

    move-result-object p0

    goto/16 :goto_0

    :cond_4
    invoke-static {}, LGg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->i()LSO4;

    move-result-object p0

    goto/16 :goto_0

    :cond_5
    invoke-static {}, LHg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->j()LBm0;

    move-result-object p0

    goto/16 :goto_0

    :cond_6
    invoke-static {}, LIg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->k()LBm0;

    move-result-object p0

    goto/16 :goto_0

    :cond_7
    invoke-static {}, LJg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->m()LSO4;

    move-result-object p0

    goto/16 :goto_0

    :cond_8
    invoke-static {}, LKg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->n()LSO4;

    move-result-object p0

    goto/16 :goto_0

    :cond_9
    invoke-static {}, LNg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->o()LSO4;

    move-result-object p0

    goto/16 :goto_0

    :cond_a
    invoke-static {}, LOg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->p()LSO4;

    move-result-object p0

    goto :goto_0

    :cond_b
    invoke-static {}, LPg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->q()LSO4;

    move-result-object p0

    goto :goto_0

    :cond_c
    invoke-static {}, LQg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->r()LSO4;

    move-result-object p0

    goto :goto_0

    :cond_d
    invoke-static {}, LRg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->u()LSO4;

    move-result-object p0

    goto :goto_0

    :cond_e
    invoke-static {}, LSg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    invoke-static {v0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->v()LSO4;

    move-result-object p0

    goto :goto_0

    :cond_f
    sget-object p0, LFm0;->a:LFm0;

    invoke-virtual {p0}, LFm0;->w()LSO4;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final c(IIIZLBm0;)Landroid/graphics/Bitmap;
    .locals 7
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "colorSpace"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {p2}, LQc;->d(I)Landroid/graphics/Bitmap$Config;

    move-result-object v4

    invoke-static {p4}, LVg;->d(LBm0;)Landroid/graphics/ColorSpace;

    move-result-object v6

    move v2, p0

    move v3, p1

    move v5, p3

    invoke-static/range {v1 .. v6}, LCg;->a(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string p1, "createBitmap(\n          \u2026orkColorSpace()\n        )"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final d(LBm0;)Landroid/graphics/ColorSpace;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LFm0;->a:LFm0;

    invoke-virtual {v0}, LFm0;->w()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, LMg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v0}, LFm0;->e()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, LUg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v0}, LFm0;->f()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LDg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto/16 :goto_0

    :cond_2
    invoke-virtual {v0}, LFm0;->g()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LEg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto/16 :goto_0

    :cond_3
    invoke-virtual {v0}, LFm0;->h()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LFg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, LFm0;->i()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LGg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v0}, LFm0;->j()LBm0;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LHg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v0}, LFm0;->k()LBm0;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LIg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v0}, LFm0;->m()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LJg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v0}, LFm0;->n()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LKg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto :goto_0

    :cond_9
    invoke-virtual {v0}, LFm0;->o()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LNg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto :goto_0

    :cond_a
    invoke-virtual {v0}, LFm0;->p()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LOg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto :goto_0

    :cond_b
    invoke-virtual {v0}, LFm0;->q()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LPg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto :goto_0

    :cond_c
    invoke-virtual {v0}, LFm0;->r()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, LQg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto :goto_0

    :cond_d
    invoke-virtual {v0}, LFm0;->u()LSO4;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, LRg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto :goto_0

    :cond_e
    invoke-virtual {v0}, LFm0;->v()LSO4;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    invoke-static {}, LSg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    goto :goto_0

    :cond_f
    invoke-static {}, LMg;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object p0

    :goto_0
    invoke-static {p0}, LTg;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p0

    const-string v0, "get(frameworkNamedSpace)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
