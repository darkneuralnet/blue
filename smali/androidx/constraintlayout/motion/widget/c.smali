.class public Landroidx/constraintlayout/motion/widget/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/motion/widget/c$b;
    }
.end annotation


# static fields
.field public static w:Ljava/lang/String; = "ViewTransition"


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:I

.field public e:I

.field public f:Lnk2;

.field public g:Landroidx/constraintlayout/widget/b$a;

.field public h:I

.field public i:I

.field public j:I

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Ljava/lang/String;

.field public n:I

.field public o:Landroid/content/Context;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->b:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/c;->c:Z

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->d:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->h:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->i:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->l:I

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/c;->m:Ljava/lang/String;

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->n:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->p:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->q:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->r:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->s:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->t:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->u:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/c;->v:I

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/c;->o:Landroid/content/Context;

    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_8

    const-string v4, "ViewTransition"

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-eq v2, v6, :cond_1

    if-eq v2, v5, :cond_0

    goto/16 :goto_3

    :cond_0
    :try_start_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    return-void

    :cond_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/4 v8, 0x4

    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v4, "CustomAttribute"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :sswitch_1
    const-string v4, "CustomMethod"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v8

    goto :goto_2

    :sswitch_2
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v1

    goto :goto_2

    :sswitch_3
    const-string v4, "KeyFrameSet"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v3

    goto :goto_2

    :sswitch_4
    const-string v4, "ConstraintOverride"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    :goto_1
    move v4, v0

    :goto_2
    if-eqz v4, :cond_6

    if-eq v4, v3, :cond_5

    if-eq v4, v6, :cond_4

    if-eq v4, v5, :cond_3

    if-eq v4, v8, :cond_3

    sget-object v3, Landroidx/constraintlayout/motion/widget/c;->w:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LFU0;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " unknown tag "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v2, Landroidx/constraintlayout/motion/widget/c;->w:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ".xml:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_3
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/c;->g:Landroidx/constraintlayout/widget/b$a;

    iget-object v2, v2, Landroidx/constraintlayout/widget/b$a;->g:Ljava/util/HashMap;

    invoke-static {p1, p2, v2}, Landroidx/constraintlayout/widget/a;->i(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Ljava/util/HashMap;)V

    goto :goto_3

    :cond_4
    invoke-static {p1, p2}, Landroidx/constraintlayout/widget/b;->m(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Landroidx/constraintlayout/widget/b$a;

    move-result-object v2

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/c;->g:Landroidx/constraintlayout/widget/b$a;

    goto :goto_3

    :cond_5
    new-instance v2, Lnk2;

    invoke-direct {v2, p1, p2}, Lnk2;-><init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/c;->f:Lnk2;

    goto :goto_3

    :cond_6
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/motion/widget/c;->l(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    :cond_7
    :goto_3
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_4

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_8
    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x74f4db17 -> :sswitch_4
        -0x49df9cec -> :sswitch_3
        0x3b205fa -> :sswitch_2
        0x15d883d2 -> :sswitch_1
        0x6acd460b -> :sswitch_0
    .end sparse-switch
.end method

.method public static synthetic a(Landroidx/constraintlayout/motion/widget/c;[Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/c;->j([Landroid/view/View;)V

    return-void
.end method

.method private synthetic j([Landroid/view/View;)V
    .locals 8

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->p:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    array-length v0, p1

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_0

    aget-object v4, p1, v3

    iget v5, p0, Landroidx/constraintlayout/motion/widget/c;->p:I

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->q:I

    if-eq v0, v2, :cond_1

    array-length v0, p1

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    iget v3, p0, Landroidx/constraintlayout/motion/widget/c;->q:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public b(Landroidx/constraintlayout/motion/widget/d;Landroidx/constraintlayout/motion/widget/MotionLayout;Landroid/view/View;)V
    .locals 9

    new-instance v6, LOV2;

    invoke-direct {v6, p3}, LOV2;-><init>(Landroid/view/View;)V

    invoke-virtual {v6, p3}, LOV2;->B(Landroid/view/View;)V

    iget-object p3, p0, Landroidx/constraintlayout/motion/widget/c;->f:Lnk2;

    invoke-virtual {p3, v6}, Lnk2;->a(LOV2;)V

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v2

    iget p3, p0, Landroidx/constraintlayout/motion/widget/c;->h:I

    int-to-float v3, p3

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, LOV2;->I(IIFJ)V

    new-instance v0, Landroidx/constraintlayout/motion/widget/c$b;

    iget v3, p0, Landroidx/constraintlayout/motion/widget/c;->h:I

    iget v4, p0, Landroidx/constraintlayout/motion/widget/c;->i:I

    iget v5, p0, Landroidx/constraintlayout/motion/widget/c;->b:I

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/c;->f(Landroid/content/Context;)Landroid/view/animation/Interpolator;

    move-result-object p2

    iget v7, p0, Landroidx/constraintlayout/motion/widget/c;->p:I

    iget v8, p0, Landroidx/constraintlayout/motion/widget/c;->q:I

    move-object v1, p1

    move-object v2, v6

    move-object v6, p2

    invoke-direct/range {v0 .. v8}, Landroidx/constraintlayout/motion/widget/c$b;-><init>(Landroidx/constraintlayout/motion/widget/d;LOV2;IIILandroid/view/animation/Interpolator;II)V

    return-void
.end method

.method public varargs c(Landroidx/constraintlayout/motion/widget/d;Landroidx/constraintlayout/motion/widget/MotionLayout;ILandroidx/constraintlayout/widget/b;[Landroid/view/View;)V
    .locals 7

    iget-boolean v0, p0, Landroidx/constraintlayout/motion/widget/c;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->e:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    aget-object p3, p5, v2

    invoke-virtual {p0, p1, p2, p3}, Landroidx/constraintlayout/motion/widget/c;->b(Landroidx/constraintlayout/motion/widget/d;Landroidx/constraintlayout/motion/widget/MotionLayout;Landroid/view/View;)V

    return-void

    :cond_1
    const/4 p1, 0x1

    if-ne v0, p1, :cond_5

    invoke-virtual {p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->R()[I

    move-result-object p1

    move v0, v2

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_5

    aget v1, p1, v0

    if-ne v1, p3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q(I)Landroidx/constraintlayout/widget/b;

    move-result-object v1

    array-length v3, p5

    move v4, v2

    :goto_1
    if-ge v4, v3, :cond_4

    aget-object v5, p5, v4

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v1, v5}, Landroidx/constraintlayout/widget/b;->x(I)Landroidx/constraintlayout/widget/b$a;

    move-result-object v5

    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/c;->g:Landroidx/constraintlayout/widget/b$a;

    if-eqz v6, :cond_3

    invoke-virtual {v6, v5}, Landroidx/constraintlayout/widget/b$a;->d(Landroidx/constraintlayout/widget/b$a;)V

    iget-object v5, v5, Landroidx/constraintlayout/widget/b$a;->g:Ljava/util/HashMap;

    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/c;->g:Landroidx/constraintlayout/widget/b$a;

    iget-object v6, v6, Landroidx/constraintlayout/widget/b$a;->g:Ljava/util/HashMap;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    new-instance p1, Landroidx/constraintlayout/widget/b;

    invoke-direct {p1}, Landroidx/constraintlayout/widget/b;-><init>()V

    invoke-virtual {p1, p4}, Landroidx/constraintlayout/widget/b;->q(Landroidx/constraintlayout/widget/b;)V

    array-length v0, p5

    move v1, v2

    :goto_3
    if-ge v1, v0, :cond_7

    aget-object v3, p5, v1

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {p1, v3}, Landroidx/constraintlayout/widget/b;->x(I)Landroidx/constraintlayout/widget/b$a;

    move-result-object v3

    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/c;->g:Landroidx/constraintlayout/widget/b$a;

    if-eqz v4, :cond_6

    invoke-virtual {v4, v3}, Landroidx/constraintlayout/widget/b$a;->d(Landroidx/constraintlayout/widget/b$a;)V

    iget-object v3, v3, Landroidx/constraintlayout/widget/b$a;->g:Ljava/util/HashMap;

    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/c;->g:Landroidx/constraintlayout/widget/b$a;

    iget-object v4, v4, Landroidx/constraintlayout/widget/b$a;->g:Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {p2, p3, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0(ILandroidx/constraintlayout/widget/b;)V

    sget p1, Lzh4;->view_transition:I

    invoke-virtual {p2, p1, p4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0(ILandroidx/constraintlayout/widget/b;)V

    const/4 p4, -0x1

    invoke-virtual {p2, p1, p4, p4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(III)V

    new-instance v0, Landroidx/constraintlayout/motion/widget/a$b;

    iget-object v1, p2, Landroidx/constraintlayout/motion/widget/MotionLayout;->b:Landroidx/constraintlayout/motion/widget/a;

    invoke-direct {v0, p4, v1, p1, p3}, Landroidx/constraintlayout/motion/widget/a$b;-><init>(ILandroidx/constraintlayout/motion/widget/a;II)V

    array-length p1, p5

    :goto_4
    if-ge v2, p1, :cond_8

    aget-object p3, p5, v2

    invoke-virtual {p0, v0, p3}, Landroidx/constraintlayout/motion/widget/c;->n(Landroidx/constraintlayout/motion/widget/a$b;Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_8
    invoke-virtual {p2, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0(Landroidx/constraintlayout/motion/widget/a$b;)V

    new-instance p1, LOt6;

    invoke-direct {p1, p0, p5}, LOt6;-><init>(Landroidx/constraintlayout/motion/widget/c;[Landroid/view/View;)V

    invoke-virtual {p2, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->o0(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(Landroid/view/View;)Z
    .locals 5

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->r:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_1
    iget v4, p0, Landroidx/constraintlayout/motion/widget/c;->s:I

    if-ne v4, v3, :cond_2

    :goto_2
    move p1, v2

    goto :goto_3

    :cond_2
    invoke-virtual {p1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    move p1, v1

    :goto_3
    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    move v1, v2

    :cond_4
    return v1
.end method

.method public e()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->a:I

    return v0
.end method

.method public f(Landroid/content/Context;)Landroid/view/animation/Interpolator;
    .locals 2

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->l:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_7

    const/4 p1, -0x1

    if-eq v0, p1, :cond_6

    if-eqz v0, :cond_5

    const/4 p1, 0x1

    if-eq v0, p1, :cond_4

    const/4 p1, 0x2

    if-eq v0, p1, :cond_3

    const/4 p1, 0x4

    if-eq v0, p1, :cond_2

    const/4 p1, 0x5

    if-eq v0, p1, :cond_1

    const/4 p1, 0x6

    if-eq v0, p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Landroid/view/animation/AnticipateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AnticipateInterpolator;-><init>()V

    return-object p1

    :cond_1
    new-instance p1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {p1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    return-object p1

    :cond_2
    new-instance p1, Landroid/view/animation/BounceInterpolator;

    invoke-direct {p1}, Landroid/view/animation/BounceInterpolator;-><init>()V

    return-object p1

    :cond_3
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    return-object p1

    :cond_4
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    return-object p1

    :cond_5
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    return-object p1

    :cond_6
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/c;->m:Ljava/lang/String;

    invoke-static {p1}, Lg91;->c(Ljava/lang/String;)Lg91;

    move-result-object p1

    new-instance v0, Landroidx/constraintlayout/motion/widget/c$a;

    invoke-direct {v0, p0, p1}, Landroidx/constraintlayout/motion/widget/c$a;-><init>(Landroidx/constraintlayout/motion/widget/c;Lg91;)V

    return-object v0

    :cond_7
    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->n:I

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p1

    return-object p1
.end method

.method public g()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->t:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->u:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->b:I

    return v0
.end method

.method public k(Landroid/view/View;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget v1, p0, Landroidx/constraintlayout/motion/widget/c;->j:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/c;->k:Ljava/lang/String;

    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/c;->d(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->j:I

    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    return v3

    :cond_3
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/c;->k:Ljava/lang/String;

    if-nez v1, :cond_4

    return v0

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->c0:Ljava/lang/String;

    if-eqz p1, :cond_5

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/c;->k:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v3

    :cond_5
    return v0
.end method

.method public final l(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 7

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    sget-object v0, Lcm4;->ViewTransition:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_14

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v1

    sget v2, Lcm4;->ViewTransition_android_id:I

    if-ne v1, v2, :cond_0

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->a:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->a:I

    goto/16 :goto_1

    :cond_0
    sget v2, Lcm4;->ViewTransition_motionTarget:I

    const/4 v3, 0x3

    const/4 v4, -0x1

    if-ne v1, v2, :cond_3

    sget-boolean v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y0:Z

    if-eqz v2, :cond_1

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->j:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/motion/widget/c;->j:I

    if-ne v2, v4, :cond_13

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Landroidx/constraintlayout/motion/widget/c;->k:Ljava/lang/String;

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v2

    iget v2, v2, Landroid/util/TypedValue;->type:I

    if-ne v2, v3, :cond_2

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Landroidx/constraintlayout/motion/widget/c;->k:Ljava/lang/String;

    goto/16 :goto_1

    :cond_2
    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->j:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->j:I

    goto/16 :goto_1

    :cond_3
    sget v2, Lcm4;->ViewTransition_onStateTransition:I

    if-ne v1, v2, :cond_4

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->b:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->b:I

    goto/16 :goto_1

    :cond_4
    sget v2, Lcm4;->ViewTransition_transitionDisable:I

    if-ne v1, v2, :cond_5

    iget-boolean v2, p0, Landroidx/constraintlayout/motion/widget/c;->c:Z

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/c;->c:Z

    goto/16 :goto_1

    :cond_5
    sget v2, Lcm4;->ViewTransition_pathMotionArc:I

    if-ne v1, v2, :cond_6

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->d:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->d:I

    goto/16 :goto_1

    :cond_6
    sget v2, Lcm4;->ViewTransition_duration:I

    if-ne v1, v2, :cond_7

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->h:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->h:I

    goto/16 :goto_1

    :cond_7
    sget v2, Lcm4;->ViewTransition_upDuration:I

    if-ne v1, v2, :cond_8

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->i:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->i:I

    goto/16 :goto_1

    :cond_8
    sget v2, Lcm4;->ViewTransition_viewTransitionMode:I

    if-ne v1, v2, :cond_9

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->e:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->e:I

    goto/16 :goto_1

    :cond_9
    sget v2, Lcm4;->ViewTransition_motionInterpolator:I

    if-ne v1, v2, :cond_d

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v2

    iget v2, v2, Landroid/util/TypedValue;->type:I

    const/4 v5, -0x2

    const/4 v6, 0x1

    if-ne v2, v6, :cond_a

    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->n:I

    if-eq v1, v4, :cond_13

    iput v5, p0, Landroidx/constraintlayout/motion/widget/c;->l:I

    goto/16 :goto_1

    :cond_a
    if-ne v2, v3, :cond_c

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/c;->m:Ljava/lang/String;

    if-eqz v2, :cond_b

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_b

    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->n:I

    iput v5, p0, Landroidx/constraintlayout/motion/widget/c;->l:I

    goto :goto_1

    :cond_b
    iput v4, p0, Landroidx/constraintlayout/motion/widget/c;->l:I

    goto :goto_1

    :cond_c
    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->l:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->l:I

    goto :goto_1

    :cond_d
    sget v2, Lcm4;->ViewTransition_setsTag:I

    if-ne v1, v2, :cond_e

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->p:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->p:I

    goto :goto_1

    :cond_e
    sget v2, Lcm4;->ViewTransition_clearsTag:I

    if-ne v1, v2, :cond_f

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->q:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->q:I

    goto :goto_1

    :cond_f
    sget v2, Lcm4;->ViewTransition_ifTagSet:I

    if-ne v1, v2, :cond_10

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->r:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->r:I

    goto :goto_1

    :cond_10
    sget v2, Lcm4;->ViewTransition_ifTagNotSet:I

    if-ne v1, v2, :cond_11

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->s:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->s:I

    goto :goto_1

    :cond_11
    sget v2, Lcm4;->ViewTransition_SharedValueId:I

    if-ne v1, v2, :cond_12

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->u:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->u:I

    goto :goto_1

    :cond_12
    sget v2, Lcm4;->ViewTransition_SharedValue:I

    if-ne v1, v2, :cond_13

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->t:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/motion/widget/c;->t:I

    :cond_13
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_14
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public m(I)Z
    .locals 4

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    if-nez p1, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    if-ne p1, v2, :cond_2

    move v1, v2

    :cond_2
    return v1

    :cond_3
    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    if-nez p1, :cond_4

    move v1, v2

    :cond_4
    return v1
.end method

.method public final n(Landroidx/constraintlayout/motion/widget/a$b;Landroid/view/View;)V
    .locals 4

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->h:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p1, v0}, Landroidx/constraintlayout/motion/widget/a$b;->E(I)V

    :cond_0
    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->d:I

    invoke-virtual {p1, v0}, Landroidx/constraintlayout/motion/widget/a$b;->H(I)V

    iget v0, p0, Landroidx/constraintlayout/motion/widget/c;->l:I

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/c;->m:Ljava/lang/String;

    iget v3, p0, Landroidx/constraintlayout/motion/widget/c;->n:I

    invoke-virtual {p1, v0, v2, v3}, Landroidx/constraintlayout/motion/widget/a$b;->F(ILjava/lang/String;I)V

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/c;->f:Lnk2;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lnk2;->d(I)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Lnk2;

    invoke-direct {v1}, Lnk2;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXj2;

    invoke-virtual {v2}, LXj2;->b()LXj2;

    move-result-object v2

    invoke-virtual {v2, p2}, LXj2;->i(I)LXj2;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnk2;->c(LXj2;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v1}, Landroidx/constraintlayout/motion/widget/a$b;->t(Lnk2;)V

    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ViewTransition("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/c;->o:Landroid/content/Context;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/c;->a:I

    invoke-static {v1, v2}, LFU0;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
