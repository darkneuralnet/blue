.class public final Lcom/google/android/filament/utils/Mat2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/utils/Mat2$WhenMappings;,
        Lcom/google/android/filament/utils/Mat2$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0003B\u0019\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0011\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0086\u0002J\u0019\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\u0002J\u0011\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\u0002J\u0019\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\u0002J\t\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0000H\u0086\u0002J\u0019\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\u0002J!\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0011\u0010!\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0011\u0010\"\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0005H\u0086\u0002J!\u0010#\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0006\u0010%\u001a\u00020&J\u0008\u0010\'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020\u0000H\u0086\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\t\"\u0004\u0008\r\u0010\u000b\u00a8\u0006+"
    }
    d2 = {
        "Lcom/google/android/filament/utils/Mat2;",
        "",
        "m",
        "(Lcom/google/android/filament/utils/Mat2;)V",
        "x",
        "Lcom/google/android/filament/utils/Float2;",
        "y",
        "(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V",
        "getX",
        "()Lcom/google/android/filament/utils/Float2;",
        "setX",
        "(Lcom/google/android/filament/utils/Float2;)V",
        "getY",
        "setY",
        "component1",
        "component2",
        "copy",
        "dec",
        "div",
        "v",
        "",
        "equals",
        "",
        "other",
        "get",
        "column",
        "Lcom/google/android/filament/utils/MatrixColumn;",
        "row",
        "",
        "hashCode",
        "inc",
        "invoke",
        "",
        "minus",
        "plus",
        "set",
        "times",
        "toFloatArray",
        "",
        "toString",
        "",
        "unaryMinus",
        "Companion",
        "filament-utils-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat2\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float2\n*L\n1#1,682:1\n61#2,3:683\n123#2:686\n124#2:687\n125#2:688\n126#2:689\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat2\n*L\n66#1:683,3\n76#1:686\n77#1:687\n78#1:688\n79#1:689\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/google/android/filament/utils/Mat2$Companion;


# instance fields
.field private x:Lcom/google/android/filament/utils/Float2;

.field private y:Lcom/google/android/filament/utils/Float2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/filament/utils/Mat2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/filament/utils/Mat2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/google/android/filament/utils/Mat2;->Companion:Lcom/google/android/filament/utils/Mat2$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V
    .locals 1

    const-string v0, "x"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "y"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    iput-object p2, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x2

    if-eqz p4, :cond_0

    new-instance p1, Lcom/google/android/filament/utils/Float2;

    invoke-direct {p1, v2, v1, v3, v0}, Lcom/google/android/filament/utils/Float2;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/2addr p3, v3

    if-eqz p3, :cond_1

    new-instance p2, Lcom/google/android/filament/utils/Float2;

    const/4 p3, 0x1

    invoke-direct {p2, v1, v2, p3, v0}, Lcom/google/android/filament/utils/Float2;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Mat2;)V
    .locals 4

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v0, v1, v1, v2, v3}, Lcom/google/android/filament/utils/Float2;->copy$default(Lcom/google/android/filament/utils/Float2;FFILjava/lang/Object;)Lcom/google/android/filament/utils/Float2;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-static {p1, v1, v1, v2, v3}, Lcom/google/android/filament/utils/Float2;->copy$default(Lcom/google/android/filament/utils/Float2;FFILjava/lang/Object;)Lcom/google/android/filament/utils/Float2;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/google/android/filament/utils/Mat2;Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;ILjava/lang/Object;)Lcom/google/android/filament/utils/Mat2;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/filament/utils/Mat2;->copy(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Mat2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/google/android/filament/utils/Float2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    return-object v0
.end method

.method public final component2()Lcom/google/android/filament/utils/Float2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    return-object v0
.end method

.method public final copy(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Mat2;
    .locals 1

    const-string v0, "x"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "y"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Mat2;

    invoke-direct {v0, p1, p2}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-object v0
.end method

.method public final dec()Lcom/google/android/filament/utils/Mat2;
    .locals 4

    new-instance v0, Lcom/google/android/filament/utils/Mat2;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->dec()Lcom/google/android/filament/utils/Float2;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->dec()Lcom/google/android/filament/utils/Float2;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-object v0
.end method

.method public final div(F)Lcom/google/android/filament/utils/Mat2;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Mat2;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    new-instance v2, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    div-float/2addr v3, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    div-float/2addr v1, p1

    invoke-direct {v2, v3, v1}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    new-instance v3, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v4

    div-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    div-float/2addr v1, p1

    invoke-direct {v3, v4, v1}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    invoke-direct {v0, v2, v3}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/filament/utils/Mat2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/filament/utils/Mat2;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    iget-object v3, p1, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    iget-object p1, p1, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final get(II)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Mat2;->get(I)Lcom/google/android/filament/utils/Float2;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/filament/utils/Float2;->get(I)F

    move-result p1

    return p1
.end method

.method public final get(Lcom/google/android/filament/utils/MatrixColumn;I)F
    .locals 1

    const-string v0, "column"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Mat2;->get(Lcom/google/android/filament/utils/MatrixColumn;)Lcom/google/android/filament/utils/Float2;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/filament/utils/Float2;->get(I)F

    move-result p1

    return p1
.end method

.method public final get(I)Lcom/google/android/filament/utils/Float2;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "column must be in 0..1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    :goto_0
    return-object p1
.end method

.method public final get(Lcom/google/android/filament/utils/MatrixColumn;)Lcom/google/android/filament/utils/Float2;
    .locals 1

    const-string v0, "column"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/filament/utils/Mat2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "column must be X or Y"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    :goto_0
    return-object p1
.end method

.method public final getX()Lcom/google/android/filament/utils/Float2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    return-object v0
.end method

.method public final getY()Lcom/google/android/filament/utils/Float2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final inc()Lcom/google/android/filament/utils/Mat2;
    .locals 4

    new-instance v0, Lcom/google/android/filament/utils/Mat2;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->inc()Lcom/google/android/filament/utils/Float2;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->inc()Lcom/google/android/filament/utils/Float2;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-object v0
.end method

.method public final invoke(II)F
    .locals 0

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Mat2;->get(I)Lcom/google/android/filament/utils/Float2;

    move-result-object p2

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Lcom/google/android/filament/utils/Float2;->get(I)F

    move-result p1

    return p1
.end method

.method public final invoke(IIF)V
    .locals 0

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p2, p1, p3}, Lcom/google/android/filament/utils/Mat2;->set(IIF)V

    return-void
.end method

.method public final minus(F)Lcom/google/android/filament/utils/Mat2;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Mat2;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    new-instance v2, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    sub-float/2addr v3, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-direct {v2, v3, v1}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    new-instance v3, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v4

    sub-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-direct {v3, v4, v1}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    invoke-direct {v0, v2, v3}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-object v0
.end method

.method public final plus(F)Lcom/google/android/filament/utils/Mat2;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Mat2;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    new-instance v2, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    add-float/2addr v3, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    add-float/2addr v1, p1

    invoke-direct {v2, v3, v1}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    new-instance v3, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v4

    add-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    add-float/2addr v1, p1

    invoke-direct {v3, v4, v1}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    invoke-direct {v0, v2, v3}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-object v0
.end method

.method public final set(IIF)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Mat2;->get(I)Lcom/google/android/filament/utils/Float2;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/google/android/filament/utils/Float2;->set(IF)V

    return-void
.end method

.method public final set(ILcom/google/android/filament/utils/Float2;)V
    .locals 1

    const-string v0, "v"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Mat2;->get(I)Lcom/google/android/filament/utils/Float2;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/filament/utils/Float2;->setX(F)V

    invoke-virtual {p2}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/android/filament/utils/Float2;->setY(F)V

    return-void
.end method

.method public final setX(Lcom/google/android/filament/utils/Float2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    return-void
.end method

.method public final setY(Lcom/google/android/filament/utils/Float2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    return-void
.end method

.method public final times(Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Float2;
    .locals 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v2

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    mul-float/2addr v3, p1

    add-float/2addr v2, v3

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    return-object v0
.end method

.method public final times(F)Lcom/google/android/filament/utils/Mat2;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Mat2;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    new-instance v2, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    mul-float/2addr v3, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-direct {v2, v3, v1}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    new-instance v3, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v4

    mul-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-direct {v3, v4, v1}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    invoke-direct {v0, v2, v3}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-object v0
.end method

.method public final times(Lcom/google/android/filament/utils/Mat2;)Lcom/google/android/filament/utils/Mat2;
    .locals 6

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Mat2;

    new-instance v1, Lcom/google/android/filament/utils/Float2;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v2

    iget-object v3, p1, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    iget-object v4, p1, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v3

    iget-object v4, p1, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v4

    mul-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-direct {v1, v2, v3}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    new-instance v2, Lcom/google/android/filament/utils/Float2;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    iget-object v4, p1, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v4

    mul-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v5

    mul-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v5

    iget-object p1, p1, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    mul-float/2addr v5, p1

    add-float/2addr v4, v5

    invoke-direct {v2, v3, v4}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-object v0
.end method

.method public final toFloatArray()[F
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [F

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n            |"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, "|\n            |"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "|\n            "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final unaryMinus()Lcom/google/android/filament/utils/Mat2;
    .locals 3

    new-instance v0, Lcom/google/android/filament/utils/Mat2;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat2;->x:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->unaryMinus()Lcom/google/android/filament/utils/Float2;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat2;->y:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->unaryMinus()Lcom/google/android/filament/utils/Float2;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/utils/Mat2;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;)V

    return-object v0
.end method
