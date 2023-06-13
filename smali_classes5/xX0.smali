.class public LxX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxO1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "LxX0;",
        "LxO1;",
        "LwO1;",
        "inAppMessage",
        "Landroid/view/animation/Animation;",
        "a",
        "b",
        "",
        "J",
        "shortAnimationDurationMs",
        "<init>",
        "()V",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x10e0000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, LxX0;->a:J

    return-void
.end method


# virtual methods
.method public a(LwO1;)Landroid/view/animation/Animation;
    .locals 6

    const-string v0, "inAppMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LBZ1;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    check-cast p1, LBZ1;

    invoke-virtual {p1}, LBZ1;->x0()LeE5;

    move-result-object p1

    sget-object v0, LeE5;->b:LeE5;

    const/4 v3, 0x0

    if-ne p1, v0, :cond_0

    const/high16 p1, -0x40800000    # -1.0f

    iget-wide v0, p0, LxX0;->a:J

    invoke-static {p1, v2, v0, v1, v3}, Lqf;->a(FFJZ)Landroid/view/animation/Animation;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-wide v4, p0, LxX0;->a:J

    invoke-static {v1, v2, v4, v5, v3}, Lqf;->a(FFJZ)Landroid/view/animation/Animation;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Landroid/view/animation/AlphaAnimation;

    invoke-direct {p1, v2, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    iget-wide v0, p0, LxX0;->a:J

    const/4 v2, 0x1

    invoke-static {p1, v0, v1, v2}, Lqf;->b(Landroid/view/animation/Animation;JZ)Landroid/view/animation/Animation;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public b(LwO1;)Landroid/view/animation/Animation;
    .locals 6

    const-string v0, "inAppMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LBZ1;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    check-cast p1, LBZ1;

    invoke-virtual {p1}, LBZ1;->x0()LeE5;

    move-result-object p1

    sget-object v0, LeE5;->b:LeE5;

    if-ne p1, v0, :cond_0

    const/high16 p1, -0x40800000    # -1.0f

    iget-wide v0, p0, LxX0;->a:J

    invoke-static {v3, p1, v0, v1, v2}, Lqf;->a(FFJZ)Landroid/view/animation/Animation;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-wide v4, p0, LxX0;->a:J

    invoke-static {v3, v1, v4, v5, v2}, Lqf;->a(FFJZ)Landroid/view/animation/Animation;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Landroid/view/animation/AlphaAnimation;

    invoke-direct {p1, v1, v3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    iget-wide v0, p0, LxX0;->a:J

    invoke-static {p1, v0, v1, v2}, Lqf;->b(Landroid/view/animation/Animation;JZ)Landroid/view/animation/Animation;

    move-result-object p1

    :goto_0
    return-object p1
.end method
