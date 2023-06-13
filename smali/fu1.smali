.class public final Lfu1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfu1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lfu1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\n\n\u0002\u0008\u0004\u0008\u0081@\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0014\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0012\u0012\u0006\u0010\t\u001a\u00020\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0088\u0001\t\u0092\u0001\u00020\u0008\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "Lfu1;",
        "",
        "",
        "c",
        "(S)F",
        "value",
        "a",
        "(F)S",
        "",
        "halfValue",
        "b",
        "(S)S",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# static fields
.field public static final b:Lfu1$a;

.field public static final c:S

.field public static final d:S

.field public static final e:S

.field public static final f:S

.field public static final g:S

.field public static final h:S

.field public static final i:S

.field public static final j:S

.field public static final k:S

.field public static final l:S

.field public static final m:S

.field public static final n:S

.field public static final o:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfu1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfu1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfu1;->b:Lfu1$a;

    const/16 v0, 0x1400

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->c:S

    const/16 v0, -0x401

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->d:S

    const/16 v0, 0x7bff

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->e:S

    const/16 v0, 0x400

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->f:S

    const/4 v0, 0x1

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->g:S

    const/16 v0, 0x7e00

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->h:S

    const/16 v0, -0x400

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->i:S

    const/16 v0, -0x8000

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->j:S

    const/16 v0, 0x7c00

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->k:S

    const/4 v0, 0x0

    invoke-static {v0}, Lfu1;->b(S)S

    move-result v0

    sput-short v0, Lfu1;->l:S

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lfu1;->a(F)S

    move-result v0

    sput-short v0, Lfu1;->m:S

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {v0}, Lfu1;->a(F)S

    move-result v0

    sput-short v0, Lfu1;->n:S

    sget-object v0, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    sput v0, Lfu1;->o:F

    return-void
.end method

.method public static a(F)S
    .locals 1

    sget-object v0, Lfu1;->b:Lfu1$a;

    invoke-static {v0, p0}, Lfu1$a;->a(Lfu1$a;F)S

    move-result p0

    invoke-static {p0}, Lfu1;->b(S)S

    move-result p0

    return p0
.end method

.method public static b(S)S
    .locals 0

    return p0
.end method

.method public static final c(S)F
    .locals 4

    const v0, 0xffff

    and-int/2addr p0, v0

    const v0, 0x8000

    and-int/2addr v0, p0

    ushr-int/lit8 v1, p0, 0xa

    const/16 v2, 0x1f

    and-int/2addr v1, v2

    and-int/lit16 p0, p0, 0x3ff

    if-nez v1, :cond_2

    if-eqz p0, :cond_1

    sget-object v1, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    const/high16 v1, 0x3f000000    # 0.5f

    add-int/2addr p0, v1

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    sget v1, Lfu1;->o:F

    sub-float/2addr p0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    neg-float p0, p0

    :goto_0
    return p0

    :cond_1
    const/4 p0, 0x0

    move v1, p0

    goto :goto_2

    :cond_2
    shl-int/lit8 p0, p0, 0xd

    if-ne v1, v2, :cond_3

    const/16 v1, 0xff

    if-eqz p0, :cond_4

    const/high16 v2, 0x400000

    or-int/2addr p0, v2

    goto :goto_1

    :cond_3
    add-int/lit8 v1, v1, -0xf

    add-int/lit8 v1, v1, 0x7f

    :cond_4
    :goto_1
    move v3, v1

    move v1, p0

    move p0, v3

    :goto_2
    shl-int/lit8 v0, v0, 0x10

    shl-int/lit8 p0, p0, 0x17

    or-int/2addr p0, v0

    or-int/2addr p0, v1

    sget-object v0, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method
