.class public final Lcom/stripe/android/uicore/image/DrawablePainterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00008BX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroid/graphics/drawable/Drawable;",
        "drawable",
        "LnE3;",
        "rememberDrawablePainter",
        "(Landroid/graphics/drawable/Drawable;LEt0;I)LnE3;",
        "Landroid/os/Handler;",
        "MAIN_HANDLER$delegate",
        "Lkotlin/Lazy;",
        "getMAIN_HANDLER",
        "()Landroid/os/Handler;",
        "MAIN_HANDLER",
        "LxB5;",
        "getIntrinsicSize",
        "(Landroid/graphics/drawable/Drawable;)J",
        "intrinsicSize",
        "stripe-ui-core_release"
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
        "SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/stripe/android/uicore/image/DrawablePainterKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,168:1\n1057#2,6:169\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/stripe/android/uicore/image/DrawablePainterKt\n*L\n144#1:169,6\n*E\n"
    }
.end annotation


# static fields
.field private static final MAIN_HANDLER$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/uicore/image/DrawablePainterKt$MAIN_HANDLER$2;->INSTANCE:Lcom/stripe/android/uicore/image/DrawablePainterKt$MAIN_HANDLER$2;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/image/DrawablePainterKt;->MAIN_HANDLER$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getIntrinsicSize(Landroid/graphics/drawable/Drawable;)J
    .locals 2

    invoke-static {p0}, Lcom/stripe/android/uicore/image/DrawablePainterKt;->getIntrinsicSize(Landroid/graphics/drawable/Drawable;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$getMAIN_HANDLER()Landroid/os/Handler;
    .locals 1

    invoke-static {}, Lcom/stripe/android/uicore/image/DrawablePainterKt;->getMAIN_HANDLER()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method private static final getIntrinsicSize(Landroid/graphics/drawable/Drawable;)J
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p0

    int-to-float p0, p0

    invoke-static {v0, p0}, LCB5;->a(FF)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object p0, LxB5;->b:LxB5$a;

    invoke-virtual {p0}, LxB5$a;->a()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private static final getMAIN_HANDLER()Landroid/os/Handler;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/image/DrawablePainterKt;->MAIN_HANDLER$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method

.method public static final rememberDrawablePainter(Landroid/graphics/drawable/Drawable;LEt0;I)LnE3;
    .locals 8

    const v0, 0x3eae1745

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.image.rememberDrawablePainter (DrawablePainter.kt:143)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_1

    sget-object p2, LEt0;->a:LEt0$a;

    invoke-virtual {p2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_5

    :cond_1
    if-nez p0, :cond_2

    sget-object p0, Lcom/stripe/android/uicore/image/EmptyPainter;->INSTANCE:Lcom/stripe/android/uicore/image/EmptyPainter;

    move-object v0, p0

    goto :goto_1

    :cond_2
    instance-of p2, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz p2, :cond_3

    new-instance p2, LcU;

    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    const-string v0, "drawable.bitmap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LQc;->c(Landroid/graphics/Bitmap;)LMW1;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, LcU;-><init>(LMW1;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    instance-of p2, p0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz p2, :cond_4

    new-instance p2, Lxm0;

    check-cast p0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p0

    invoke-static {p0}, Lvm0;->b(I)J

    move-result-wide v0

    const/4 p0, 0x0

    invoke-direct {p2, v0, v1, p0}, Lxm0;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_4
    new-instance p2, Lcom/stripe/android/uicore/image/DrawablePainter;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    const-string v0, "drawable.mutate()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p0}, Lcom/stripe/android/uicore/image/DrawablePainter;-><init>(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    move-object v0, p2

    :goto_1
    invoke-interface {p1, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, LnE3;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p1}, LEt0;->Q()V

    return-object v0
.end method
