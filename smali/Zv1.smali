.class public final LZv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c2\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u0003B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001c\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "LZv1;",
        "Ljava/util/Comparator;",
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "Lkotlin/Comparator;",
        "focusTarget1",
        "focusTarget2",
        "",
        "a",
        "LJm2;",
        "layoutNode",
        "LLX2;",
        "b",
        "<init>",
        "()V",
        "ui_release"
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
        "SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,273:1\n48#2:274\n523#2:275\n523#2:276\n1182#3:277\n1161#3,2:278\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n252#1:274\n256#1:275\n257#1:276\n264#1:277\n264#1:278,2\n*E\n"
    }
.end annotation


# static fields
.field public static final b:LZv1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LZv1;

    invoke-direct {v0}, LZv1;-><init>()V

    sput-object v0, LZv1;->b:LZv1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)I
    .locals 4

    const-string v0, "Required value was null."

    if-eqz p1, :cond_c

    if-eqz p2, :cond_b

    invoke-static {p1}, Landroidx/compose/ui/focus/k;->g(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_8

    invoke-static {p2}, Landroidx/compose/ui/focus/k;->g(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, LgV2$c;->J()LH83;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LH83;->r1()LJm2;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_7

    invoke-virtual {p2}, LgV2$c;->J()LH83;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, LH83;->r1()LJm2;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_6

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0, p1}, LZv1;->b(LJm2;)LLX2;

    move-result-object p1

    invoke-virtual {p0, v1}, LZv1;->b(LJm2;)LLX2;

    move-result-object p2

    invoke-virtual {p1}, LLX2;->u()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {p2}, LLX2;->u()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ltz v0, :cond_5

    :goto_1
    invoke-virtual {p1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v1

    aget-object v1, v1, v2

    invoke-virtual {p2}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v2

    check-cast p1, LJm2;

    invoke-virtual {p1}, LJm2;->q0()I

    move-result p1

    invoke-virtual {p2}, LLX2;->s()[Ljava/lang/Object;

    move-result-object p2

    aget-object p2, p2, v2

    check-cast p2, LJm2;

    invoke-virtual {p2}, LJm2;->q0()I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result p1

    return p1

    :cond_4
    if-eq v2, v0, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find a common ancestor between the two FocusModifiers."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    invoke-static {p1}, Landroidx/compose/ui/focus/k;->g(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, -0x1

    return p1

    :cond_9
    invoke-static {p2}, Landroidx/compose/ui/focus/k;->g(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z

    move-result p1

    if-eqz p1, :cond_a

    return v3

    :cond_a
    return v2

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(LJm2;)LLX2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJm2;",
            ")",
            "LLX2<",
            "LJm2;",
            ">;"
        }
    .end annotation

    new-instance v0, LLX2;

    const/16 v1, 0x10

    new-array v1, v1, [LJm2;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LLX2;-><init>([Ljava/lang/Object;I)V

    :goto_0
    if-eqz p1, :cond_0

    invoke-virtual {v0, v2, p1}, LLX2;->a(ILjava/lang/Object;)V

    invoke-virtual {p1}, LJm2;->p0()LJm2;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    check-cast p2, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-virtual {p0, p1, p2}, LZv1;->a(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)I

    move-result p1

    return p1
.end method
