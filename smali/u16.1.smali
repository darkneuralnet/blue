.class public final Lu16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu16$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a*\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a4\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000cH\u0000\u001a6\u0010\u001a\u001a\u00020\u0019*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0011H\u0002\u00a8\u0006\u001b"
    }
    d2 = {
        "LgV2;",
        "Lv16;",
        "scrollerPosition",
        "LrX2;",
        "interactionSource",
        "",
        "enabled",
        "d",
        "LF16;",
        "textFieldValue",
        "LEu6;",
        "visualTransformation",
        "Lkotlin/Function0;",
        "Lj26;",
        "textLayoutResultProvider",
        "c",
        "Lg01;",
        "",
        "cursorOffset",
        "LA96;",
        "transformedText",
        "Li26;",
        "textLayoutResult",
        "rtl",
        "textFieldWidth",
        "LOs4;",
        "b",
        "foundation_release"
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
        "SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,369:1\n135#2:370\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n60#1:370\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(Lg01;ILA96;Li26;ZI)LOs4;
    .locals 0

    invoke-static/range {p0 .. p5}, Lu16;->b(Lg01;ILA96;Li26;ZI)LOs4;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lg01;ILA96;Li26;ZI)LOs4;
    .locals 7

    if-eqz p3, :cond_0

    invoke-virtual {p2}, LA96;->a()LHe3;

    move-result-object p2

    invoke-interface {p2, p1}, LHe3;->originalToTransformed(I)I

    move-result p1

    invoke-virtual {p3, p1}, Li26;->d(I)LOs4;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, LOs4;->e:LOs4$a;

    invoke-virtual {p1}, LOs4$a;->a()LOs4;

    move-result-object p1

    :cond_1
    move-object v0, p1

    invoke-static {}, Lf16;->c()F

    move-result p1

    invoke-interface {p0, p1}, Lg01;->F0(F)I

    move-result p0

    if-eqz p4, :cond_2

    int-to-float p1, p5

    invoke-virtual {v0}, LOs4;->i()F

    move-result p2

    sub-float/2addr p1, p2

    int-to-float p2, p0

    sub-float/2addr p1, p2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LOs4;->i()F

    move-result p1

    :goto_0
    move v1, p1

    if-eqz p4, :cond_3

    int-to-float p0, p5

    invoke-virtual {v0}, LOs4;->i()F

    move-result p1

    sub-float/2addr p0, p1

    move v3, p0

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LOs4;->i()F

    move-result p1

    int-to-float p0, p0

    add-float/2addr p1, p0

    move v3, p1

    :goto_1
    const/4 v2, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xa

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, LOs4;->d(LOs4;FFFFILjava/lang/Object;)LOs4;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LgV2;Lv16;LF16;LEu6;Lkotlin/jvm/functions/Function0;)LgV2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lv16;",
            "LF16;",
            "LEu6;",
            "Lkotlin/jvm/functions/Function0<",
            "Lj26;",
            ">;)",
            "LgV2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollerPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textFieldValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visualTransformation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textLayoutResultProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lv16;->f()LEy3;

    move-result-object v0

    invoke-virtual {p2}, LF16;->g()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lv16;->e(J)I

    move-result v1

    invoke-virtual {p2}, LF16;->g()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lv16;->i(J)V

    invoke-virtual {p2}, LF16;->e()LDf;

    move-result-object p2

    invoke-static {p3, p2}, Lvj6;->a(LEu6;LDf;)LA96;

    move-result-object p2

    sget-object p3, Lu16$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p3, p3, v0

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    new-instance p3, LcN1;

    invoke-direct {p3, p1, v1, p2, p4}, LcN1;-><init>(Lv16;ILA96;Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p3, LJo6;

    invoke-direct {p3, p1, v1, p2, p4}, LJo6;-><init>(Lv16;ILA96;Lkotlin/jvm/functions/Function0;)V

    :goto_0
    invoke-static {p0}, LQk0;->b(LgV2;)LgV2;

    move-result-object p0

    invoke-interface {p0, p3}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LgV2;Lv16;LrX2;Z)LgV2;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollerPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LK32;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lu16$b;

    invoke-direct {v0, p1, p2, p3}, Lu16$b;-><init>(Lv16;LrX2;Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    new-instance v1, Lu16$c;

    invoke-direct {v1, p1, p3, p2}, Lu16$c;-><init>(Lv16;ZLrX2;)V

    invoke-static {p0, v0, v1}, LDt0;->a(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object p0

    return-object p0
.end method
