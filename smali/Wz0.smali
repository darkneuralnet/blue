.class public final LWz0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u000e\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028G\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u000b\u001a\u00020\u00028G\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0011\u0010\r\u001a\u00020\u00028G\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "LWz0;",
        "",
        "",
        "highContrastAlpha",
        "lowContrastAlpha",
        "a",
        "(FFLEt0;I)F",
        "c",
        "(LEt0;I)F",
        "high",
        "d",
        "medium",
        "b",
        "disabled",
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
        "SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,132:1\n76#2:133\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n77#1:133\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LWz0;

.field public static final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LWz0;

    invoke-direct {v0}, LWz0;-><init>()V

    sput-object v0, LWz0;->a:LWz0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFLEt0;I)F
    .locals 4

    const v0, -0x5b18edc7

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:70)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LgA0;->a()LU94;

    move-result-object p4

    invoke-interface {p3, p4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lpm0;

    invoke-virtual {p4}, Lpm0;->w()J

    move-result-wide v0

    sget-object p4, LTM2;->a:LTM2;

    const/4 v2, 0x6

    invoke-virtual {p4, p3, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object p4

    invoke-virtual {p4}, LMm0;->o()Z

    move-result p4

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    if-eqz p4, :cond_1

    invoke-static {v0, v1}, Lvm0;->f(J)F

    move-result p4

    float-to-double v0, p4

    cmpl-double p4, v0, v2

    if-lez p4, :cond_2

    goto :goto_0

    :cond_1
    invoke-static {v0, v1}, Lvm0;->f(J)F

    move-result p4

    float-to-double v0, p4

    cmpg-double p4, v0, v2

    if-gez p4, :cond_2

    goto :goto_0

    :cond_2
    move p1, p2

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p3}, LEt0;->Q()V

    return p1
.end method

.method public final b(LEt0;I)F
    .locals 3
    .annotation build Lkotlin/jvm/JvmName;
        name = "getDisabled"
    .end annotation

    const v0, 0x2506827f

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:56)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/lit8 p2, p2, 0x36

    const v0, 0x3ec28f5c    # 0.38f

    invoke-virtual {p0, v0, v0, p1, p2}, LWz0;->a(FFLEt0;I)F

    move-result p2

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return p2
.end method

.method public final c(LEt0;I)F
    .locals 3
    .annotation build Lkotlin/jvm/JvmName;
        name = "getHigh"
    .end annotation

    const v0, 0x258041bf

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:34)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/lit8 p2, p2, 0x36

    const/high16 v0, 0x3f800000    # 1.0f

    const v1, 0x3f5eb852    # 0.87f

    invoke-virtual {p0, v0, v1, p1, p2}, LWz0;->a(FFLEt0;I)F

    move-result p2

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return p2
.end method

.method public final d(LEt0;I)F
    .locals 3
    .annotation build Lkotlin/jvm/JvmName;
        name = "getMedium"
    .end annotation

    const v0, 0x7727281f

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:45)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/lit8 p2, p2, 0x36

    const v0, 0x3f3d70a4    # 0.74f

    const v1, 0x3f19999a    # 0.6f

    invoke-virtual {p0, v0, v1, p1, p2}, LWz0;->a(FFLEt0;I)F

    move-result p2

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return p2
.end method
