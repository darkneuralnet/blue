.class public LCi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCi$f;,
        LCi$c;,
        LCi$d;,
        LCi$e;
    }
.end annotation


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:LX46;

.field public c:LX46;

.field public d:LX46;

.field public e:LX46;

.field public f:LX46;

.field public g:LX46;

.field public h:LX46;

.field public final i:LIi;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LCi;->j:I

    const/4 v0, -0x1

    iput v0, p0, LCi;->k:I

    iput-object p1, p0, LCi;->a:Landroid/widget/TextView;

    new-instance v0, LIi;

    invoke-direct {v0, p1}, LIi;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LCi;->i:LIi;

    return-void
.end method

.method public static d(Landroid/content/Context;Loi;I)LX46;
    .locals 0

    invoke-virtual {p1, p0, p2}, Loi;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, LX46;

    invoke-direct {p1}, LX46;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, LX46;->d:Z

    iput-object p0, p1, LX46;->a:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public A(IF)V
    .locals 1

    sget-boolean v0, LYt6;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LCi;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, LCi;->B(IF)V

    :cond_0
    return-void
.end method

.method public final B(IF)V
    .locals 1

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0, p1, p2}, LIi;->t(IF)V

    return-void
.end method

.method public final C(Landroid/content/Context;LZ46;)V
    .locals 10

    sget v0, Ljm4;->TextAppearance_android_textStyle:I

    iget v1, p0, LCi;->j:I

    invoke-virtual {p2, v0, v1}, LZ46;->k(II)I

    move-result v0

    iput v0, p0, LCi;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/16 v4, 0x1c

    if-lt v0, v4, :cond_0

    sget v5, Ljm4;->TextAppearance_android_textFontWeight:I

    invoke-virtual {p2, v5, v2}, LZ46;->k(II)I

    move-result v5

    iput v5, p0, LCi;->k:I

    if-eq v5, v2, :cond_0

    iget v5, p0, LCi;->j:I

    and-int/2addr v5, v1

    or-int/2addr v5, v3

    iput v5, p0, LCi;->j:I

    :cond_0
    sget v5, Ljm4;->TextAppearance_android_fontFamily:I

    invoke-virtual {p2, v5}, LZ46;->s(I)Z

    move-result v6

    const/4 v7, 0x1

    if-nez v6, :cond_6

    sget v6, Ljm4;->TextAppearance_fontFamily:I

    invoke-virtual {p2, v6}, LZ46;->s(I)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    sget p1, Ljm4;->TextAppearance_android_typeface:I

    invoke-virtual {p2, p1}, LZ46;->s(I)Z

    move-result v0

    if-eqz v0, :cond_5

    iput-boolean v3, p0, LCi;->m:Z

    invoke-virtual {p2, p1, v7}, LZ46;->k(II)I

    move-result p1

    if-eq p1, v7, :cond_4

    if-eq p1, v1, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_0
    return-void

    :cond_6
    :goto_1
    const/4 v6, 0x0

    iput-object v6, p0, LCi;->l:Landroid/graphics/Typeface;

    sget v6, Ljm4;->TextAppearance_fontFamily:I

    invoke-virtual {p2, v6}, LZ46;->s(I)Z

    move-result v8

    if-eqz v8, :cond_7

    move v5, v6

    :cond_7
    iget v6, p0, LCi;->k:I

    iget v8, p0, LCi;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, LCi;->a:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, LCi$a;

    invoke-direct {v9, p0, v6, v8, p1}, LCi$a;-><init>(LCi;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, LCi;->j:I

    invoke-virtual {p2, v5, p1, v9}, LZ46;->j(IILuM4$e;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v4, :cond_9

    iget v0, p0, LCi;->k:I

    if-eq v0, v2, :cond_9

    invoke-static {p1, v3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, LCi;->k:I

    iget v6, p0, LCi;->j:I

    and-int/2addr v6, v1

    if-eqz v6, :cond_8

    move v6, v7

    goto :goto_2

    :cond_8
    move v6, v3

    :goto_2
    invoke-static {p1, v0, v6}, LCi$f;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    goto :goto_3

    :cond_9
    iput-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    :cond_a
    :goto_3
    iget-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v7

    goto :goto_4

    :cond_b
    move p1, v3

    :goto_4
    iput-boolean p1, p0, LCi;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {p2, v5}, LZ46;->o(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v4, :cond_e

    iget p2, p0, LCi;->k:I

    if-eq p2, v2, :cond_e

    invoke-static {p1, v3}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, LCi;->k:I

    iget v0, p0, LCi;->j:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    move v3, v7

    :cond_d
    invoke-static {p1, p2, v3}, LCi$f;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    goto :goto_5

    :cond_e
    iget p2, p0, LCi;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    :cond_f
    :goto_5
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;LX46;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, LCi;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Loi;->i(Landroid/graphics/drawable/Drawable;LX46;[I)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 5

    iget-object v0, p0, LCi;->b:LX46;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, LCi;->c:LX46;

    if-nez v0, :cond_0

    iget-object v0, p0, LCi;->d:LX46;

    if-nez v0, :cond_0

    iget-object v0, p0, LCi;->e:LX46;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, LCi;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v3, v0, v2

    iget-object v4, p0, LCi;->b:LX46;

    invoke-virtual {p0, v3, v4}, LCi;->a(Landroid/graphics/drawable/Drawable;LX46;)V

    const/4 v3, 0x1

    aget-object v3, v0, v3

    iget-object v4, p0, LCi;->c:LX46;

    invoke-virtual {p0, v3, v4}, LCi;->a(Landroid/graphics/drawable/Drawable;LX46;)V

    aget-object v3, v0, v1

    iget-object v4, p0, LCi;->d:LX46;

    invoke-virtual {p0, v3, v4}, LCi;->a(Landroid/graphics/drawable/Drawable;LX46;)V

    const/4 v3, 0x3

    aget-object v0, v0, v3

    iget-object v3, p0, LCi;->e:LX46;

    invoke-virtual {p0, v0, v3}, LCi;->a(Landroid/graphics/drawable/Drawable;LX46;)V

    :cond_1
    iget-object v0, p0, LCi;->f:LX46;

    if-nez v0, :cond_2

    iget-object v0, p0, LCi;->g:LX46;

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, LCi;->a:Landroid/widget/TextView;

    invoke-static {v0}, LCi$c;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, LCi;->f:LX46;

    invoke-virtual {p0, v2, v3}, LCi;->a(Landroid/graphics/drawable/Drawable;LX46;)V

    aget-object v0, v0, v1

    iget-object v1, p0, LCi;->g:LX46;

    invoke-virtual {p0, v0, v1}, LCi;->a(Landroid/graphics/drawable/Drawable;LX46;)V

    :cond_3
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0}, LIi;->a()V

    return-void
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0}, LIi;->f()I

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0}, LIi;->g()I

    move-result v0

    return v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0}, LIi;->h()I

    move-result v0

    return v0
.end method

.method public h()[I
    .locals 1

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0}, LIi;->i()[I

    move-result-object v0

    return-object v0
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0}, LIi;->j()I

    move-result v0

    return v0
.end method

.method public j()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LCi;->h:LX46;

    if-eqz v0, :cond_0

    iget-object v0, v0, LX46;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public k()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, LCi;->h:LX46;

    if-eqz v0, :cond_0

    iget-object v0, v0, LX46;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0}, LIi;->n()Z

    move-result v0

    return v0
.end method

.method public m(Landroid/util/AttributeSet;I)V
    .locals 19
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p2

    iget-object v0, v7, LCi;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {}, Loi;->b()Loi;

    move-result-object v11

    sget-object v2, Ljm4;->AppCompatTextHelper:[I

    const/4 v12, 0x0

    invoke-static {v10, v8, v2, v9, v12}, LZ46;->v(Landroid/content/Context;Landroid/util/AttributeSet;[III)LZ46;

    move-result-object v13

    iget-object v0, v7, LCi;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v13}, LZ46;->r()Landroid/content/res/TypedArray;

    move-result-object v4

    const/4 v6, 0x0

    move-object/from16 v3, p1

    move/from16 v5, p2

    invoke-static/range {v0 .. v6}, Lbq6;->t0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget v0, Ljm4;->AppCompatTextHelper_android_textAppearance:I

    const/4 v14, -0x1

    invoke-virtual {v13, v0, v14}, LZ46;->n(II)I

    move-result v0

    sget v1, Ljm4;->AppCompatTextHelper_android_drawableLeft:I

    invoke-virtual {v13, v1}, LZ46;->s(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v13, v1, v12}, LZ46;->n(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LCi;->d(Landroid/content/Context;Loi;I)LX46;

    move-result-object v1

    iput-object v1, v7, LCi;->b:LX46;

    :cond_0
    sget v1, Ljm4;->AppCompatTextHelper_android_drawableTop:I

    invoke-virtual {v13, v1}, LZ46;->s(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v13, v1, v12}, LZ46;->n(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LCi;->d(Landroid/content/Context;Loi;I)LX46;

    move-result-object v1

    iput-object v1, v7, LCi;->c:LX46;

    :cond_1
    sget v1, Ljm4;->AppCompatTextHelper_android_drawableRight:I

    invoke-virtual {v13, v1}, LZ46;->s(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v13, v1, v12}, LZ46;->n(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LCi;->d(Landroid/content/Context;Loi;I)LX46;

    move-result-object v1

    iput-object v1, v7, LCi;->d:LX46;

    :cond_2
    sget v1, Ljm4;->AppCompatTextHelper_android_drawableBottom:I

    invoke-virtual {v13, v1}, LZ46;->s(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v13, v1, v12}, LZ46;->n(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LCi;->d(Landroid/content/Context;Loi;I)LX46;

    move-result-object v1

    iput-object v1, v7, LCi;->e:LX46;

    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    sget v2, Ljm4;->AppCompatTextHelper_android_drawableStart:I

    invoke-virtual {v13, v2}, LZ46;->s(I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v13, v2, v12}, LZ46;->n(II)I

    move-result v2

    invoke-static {v10, v11, v2}, LCi;->d(Landroid/content/Context;Loi;I)LX46;

    move-result-object v2

    iput-object v2, v7, LCi;->f:LX46;

    :cond_4
    sget v2, Ljm4;->AppCompatTextHelper_android_drawableEnd:I

    invoke-virtual {v13, v2}, LZ46;->s(I)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v13, v2, v12}, LZ46;->n(II)I

    move-result v2

    invoke-static {v10, v11, v2}, LCi;->d(Landroid/content/Context;Loi;I)LX46;

    move-result-object v2

    iput-object v2, v7, LCi;->g:LX46;

    :cond_5
    invoke-virtual {v13}, LZ46;->w()V

    iget-object v2, v7, LCi;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v2

    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    const/16 v3, 0x1a

    if-eq v0, v14, :cond_9

    sget-object v5, Ljm4;->TextAppearance:[I

    invoke-static {v10, v0, v5}, LZ46;->t(Landroid/content/Context;I[I)LZ46;

    move-result-object v0

    if-nez v2, :cond_6

    sget v5, Ljm4;->TextAppearance_textAllCaps:I

    invoke-virtual {v0, v5}, LZ46;->s(I)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v0, v5, v12}, LZ46;->a(IZ)Z

    move-result v5

    const/4 v6, 0x1

    goto :goto_0

    :cond_6
    move v5, v12

    move v6, v5

    :goto_0
    invoke-virtual {v7, v10, v0}, LCi;->C(Landroid/content/Context;LZ46;)V

    sget v15, Ljm4;->TextAppearance_textLocale:I

    invoke-virtual {v0, v15}, LZ46;->s(I)Z

    move-result v16

    if-eqz v16, :cond_7

    invoke-virtual {v0, v15}, LZ46;->o(I)Ljava/lang/String;

    move-result-object v15

    goto :goto_1

    :cond_7
    const/4 v15, 0x0

    :goto_1
    if-lt v1, v3, :cond_8

    sget v4, Ljm4;->TextAppearance_fontVariationSettings:I

    invoke-virtual {v0, v4}, LZ46;->s(I)Z

    move-result v17

    if-eqz v17, :cond_8

    invoke-virtual {v0, v4}, LZ46;->o(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_8
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v0}, LZ46;->w()V

    goto :goto_3

    :cond_9
    move v5, v12

    move v6, v5

    const/4 v4, 0x0

    const/4 v15, 0x0

    :goto_3
    sget-object v0, Ljm4;->TextAppearance:[I

    invoke-static {v10, v8, v0, v9, v12}, LZ46;->v(Landroid/content/Context;Landroid/util/AttributeSet;[III)LZ46;

    move-result-object v0

    if-nez v2, :cond_a

    sget v13, Ljm4;->TextAppearance_textAllCaps:I

    invoke-virtual {v0, v13}, LZ46;->s(I)Z

    move-result v18

    if-eqz v18, :cond_a

    invoke-virtual {v0, v13, v12}, LZ46;->a(IZ)Z

    move-result v5

    const/16 v16, 0x1

    goto :goto_4

    :cond_a
    move/from16 v16, v6

    :goto_4
    sget v6, Ljm4;->TextAppearance_textLocale:I

    invoke-virtual {v0, v6}, LZ46;->s(I)Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-virtual {v0, v6}, LZ46;->o(I)Ljava/lang/String;

    move-result-object v15

    :cond_b
    if-lt v1, v3, :cond_c

    sget v3, Ljm4;->TextAppearance_fontVariationSettings:I

    invoke-virtual {v0, v3}, LZ46;->s(I)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v0, v3}, LZ46;->o(I)Ljava/lang/String;

    move-result-object v4

    :cond_c
    const/16 v3, 0x1c

    if-lt v1, v3, :cond_d

    sget v1, Ljm4;->TextAppearance_android_textSize:I

    invoke-virtual {v0, v1}, LZ46;->s(I)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v0, v1, v14}, LZ46;->f(II)I

    move-result v1

    if-nez v1, :cond_d

    iget-object v1, v7, LCi;->a:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v1, v12, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_d
    invoke-virtual {v7, v10, v0}, LCi;->C(Landroid/content/Context;LZ46;)V

    invoke-virtual {v0}, LZ46;->w()V

    if-nez v2, :cond_e

    if-eqz v16, :cond_e

    invoke-virtual {v7, v5}, LCi;->s(Z)V

    :cond_e
    iget-object v0, v7, LCi;->l:Landroid/graphics/Typeface;

    if-eqz v0, :cond_10

    iget v1, v7, LCi;->k:I

    if-ne v1, v14, :cond_f

    iget-object v1, v7, LCi;->a:Landroid/widget/TextView;

    iget v2, v7, LCi;->j:I

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_5

    :cond_f
    iget-object v1, v7, LCi;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_10
    :goto_5
    if-eqz v4, :cond_11

    iget-object v0, v7, LCi;->a:Landroid/widget/TextView;

    invoke-static {v0, v4}, LCi$e;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_11
    if-eqz v15, :cond_12

    iget-object v0, v7, LCi;->a:Landroid/widget/TextView;

    invoke-static {v15}, LCi$d;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v0, v1}, LCi$d;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    :cond_12
    iget-object v0, v7, LCi;->i:LIi;

    invoke-virtual {v0, v8, v9}, LIi;->o(Landroid/util/AttributeSet;I)V

    sget-boolean v0, LYt6;->b:Z

    if-eqz v0, :cond_14

    iget-object v0, v7, LCi;->i:LIi;

    invoke-virtual {v0}, LIi;->j()I

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, v7, LCi;->i:LIi;

    invoke-virtual {v0}, LIi;->i()[I

    move-result-object v0

    array-length v1, v0

    if-lez v1, :cond_14

    iget-object v1, v7, LCi;->a:Landroid/widget/TextView;

    invoke-static {v1}, LCi$e;->a(Landroid/widget/TextView;)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_13

    iget-object v0, v7, LCi;->a:Landroid/widget/TextView;

    iget-object v1, v7, LCi;->i:LIi;

    invoke-virtual {v1}, LIi;->g()I

    move-result v1

    iget-object v2, v7, LCi;->i:LIi;

    invoke-virtual {v2}, LIi;->f()I

    move-result v2

    iget-object v3, v7, LCi;->i:LIi;

    invoke-virtual {v3}, LIi;->h()I

    move-result v3

    invoke-static {v0, v1, v2, v3, v12}, LCi$e;->b(Landroid/widget/TextView;IIII)V

    goto :goto_6

    :cond_13
    iget-object v1, v7, LCi;->a:Landroid/widget/TextView;

    invoke-static {v1, v0, v12}, LCi$e;->c(Landroid/widget/TextView;[II)V

    :cond_14
    :goto_6
    sget-object v0, Ljm4;->AppCompatTextView:[I

    invoke-static {v10, v8, v0}, LZ46;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)LZ46;

    move-result-object v8

    sget v0, Ljm4;->AppCompatTextView_drawableLeftCompat:I

    invoke-virtual {v8, v0, v14}, LZ46;->n(II)I

    move-result v0

    if-eq v0, v14, :cond_15

    invoke-virtual {v11, v10, v0}, Loi;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v1, v0

    goto :goto_7

    :cond_15
    const/4 v1, 0x0

    :goto_7
    sget v0, Ljm4;->AppCompatTextView_drawableTopCompat:I

    invoke-virtual {v8, v0, v14}, LZ46;->n(II)I

    move-result v0

    if-eq v0, v14, :cond_16

    invoke-virtual {v11, v10, v0}, Loi;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v2, v0

    goto :goto_8

    :cond_16
    const/4 v2, 0x0

    :goto_8
    sget v0, Ljm4;->AppCompatTextView_drawableRightCompat:I

    invoke-virtual {v8, v0, v14}, LZ46;->n(II)I

    move-result v0

    if-eq v0, v14, :cond_17

    invoke-virtual {v11, v10, v0}, Loi;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v3, v0

    goto :goto_9

    :cond_17
    const/4 v3, 0x0

    :goto_9
    sget v0, Ljm4;->AppCompatTextView_drawableBottomCompat:I

    invoke-virtual {v8, v0, v14}, LZ46;->n(II)I

    move-result v0

    if-eq v0, v14, :cond_18

    invoke-virtual {v11, v10, v0}, Loi;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v4, v0

    goto :goto_a

    :cond_18
    const/4 v4, 0x0

    :goto_a
    sget v0, Ljm4;->AppCompatTextView_drawableStartCompat:I

    invoke-virtual {v8, v0, v14}, LZ46;->n(II)I

    move-result v0

    if-eq v0, v14, :cond_19

    invoke-virtual {v11, v10, v0}, Loi;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    goto :goto_b

    :cond_19
    const/4 v5, 0x0

    :goto_b
    sget v0, Ljm4;->AppCompatTextView_drawableEndCompat:I

    invoke-virtual {v8, v0, v14}, LZ46;->n(II)I

    move-result v0

    if-eq v0, v14, :cond_1a

    invoke-virtual {v11, v10, v0}, Loi;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v6, v0

    goto :goto_c

    :cond_1a
    const/4 v6, 0x0

    :goto_c
    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, LCi;->y(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    sget v0, Ljm4;->AppCompatTextView_drawableTint:I

    invoke-virtual {v8, v0}, LZ46;->s(I)Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-virtual {v8, v0}, LZ46;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iget-object v1, v7, LCi;->a:Landroid/widget/TextView;

    invoke-static {v1, v0}, LQ26;->h(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_1b
    sget v0, Ljm4;->AppCompatTextView_drawableTintMode:I

    invoke-virtual {v8, v0}, LZ46;->s(I)Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-virtual {v8, v0, v14}, LZ46;->k(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ld71;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iget-object v1, v7, LCi;->a:Landroid/widget/TextView;

    invoke-static {v1, v0}, LQ26;->i(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    :cond_1c
    sget v0, Ljm4;->AppCompatTextView_firstBaselineToTopHeight:I

    invoke-virtual {v8, v0, v14}, LZ46;->f(II)I

    move-result v0

    sget v1, Ljm4;->AppCompatTextView_lastBaselineToBottomHeight:I

    invoke-virtual {v8, v1, v14}, LZ46;->f(II)I

    move-result v1

    sget v2, Ljm4;->AppCompatTextView_lineHeight:I

    invoke-virtual {v8, v2, v14}, LZ46;->f(II)I

    move-result v2

    invoke-virtual {v8}, LZ46;->w()V

    if-eq v0, v14, :cond_1d

    iget-object v3, v7, LCi;->a:Landroid/widget/TextView;

    invoke-static {v3, v0}, LQ26;->k(Landroid/widget/TextView;I)V

    :cond_1d
    if-eq v1, v14, :cond_1e

    iget-object v0, v7, LCi;->a:Landroid/widget/TextView;

    invoke-static {v0, v1}, LQ26;->l(Landroid/widget/TextView;I)V

    :cond_1e
    if-eq v2, v14, :cond_1f

    iget-object v0, v7, LCi;->a:Landroid/widget/TextView;

    invoke-static {v0, v2}, LQ26;->m(Landroid/widget/TextView;I)V

    :cond_1f
    return-void
.end method

.method public n(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;",
            "Landroid/graphics/Typeface;",
            ")V"
        }
    .end annotation

    iget-boolean v0, p0, LCi;->m:Z

    if-eqz v0, :cond_1

    iput-object p2, p0, LCi;->l:Landroid/graphics/Typeface;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lbq6;->Y(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LCi;->j:I

    new-instance v1, LCi$b;

    invoke-direct {v1, p0, p1, p2, v0}, LCi$b;-><init>(LCi;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget v0, p0, LCi;->j:I

    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public o(ZIIII)V
    .locals 0

    sget-boolean p1, LYt6;->b:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, LCi;->c()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 0

    invoke-virtual {p0}, LCi;->b()V

    return-void
.end method

.method public q(Landroid/content/Context;I)V
    .locals 4

    sget-object v0, Ljm4;->TextAppearance:[I

    invoke-static {p1, p2, v0}, LZ46;->t(Landroid/content/Context;I[I)LZ46;

    move-result-object p2

    sget v0, Ljm4;->TextAppearance_textAllCaps:I

    invoke-virtual {p2, v0}, LZ46;->s(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0, v2}, LZ46;->a(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, LCi;->s(Z)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget v1, Ljm4;->TextAppearance_android_textSize:I

    invoke-virtual {p2, v1}, LZ46;->s(I)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, -0x1

    invoke-virtual {p2, v1, v3}, LZ46;->f(II)I

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LCi;->a:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, p2}, LCi;->C(Landroid/content/Context;LZ46;)V

    const/16 p1, 0x1a

    if-lt v0, p1, :cond_2

    sget p1, Ljm4;->TextAppearance_fontVariationSettings:I

    invoke-virtual {p2, p1}, LZ46;->s(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2, p1}, LZ46;->o(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, LCi;->a:Landroid/widget/TextView;

    invoke-static {v0, p1}, LCi$e;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_2
    invoke-virtual {p2}, LZ46;->w()V

    iget-object p1, p0, LCi;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget-object p2, p0, LCi;->a:Landroid/widget/TextView;

    iget v0, p0, LCi;->j:I

    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public r(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p3, p1}, LX91;->f(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public s(Z)V
    .locals 1

    iget-object v0, p0, LCi;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void
.end method

.method public t(IIII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0, p1, p2, p3, p4}, LIi;->p(IIII)V

    return-void
.end method

.method public u([II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0, p1, p2}, LIi;->q([II)V

    return-void
.end method

.method public v(I)V
    .locals 1

    iget-object v0, p0, LCi;->i:LIi;

    invoke-virtual {v0, p1}, LIi;->r(I)V

    return-void
.end method

.method public w(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LCi;->h:LX46;

    if-nez v0, :cond_0

    new-instance v0, LX46;

    invoke-direct {v0}, LX46;-><init>()V

    iput-object v0, p0, LCi;->h:LX46;

    :cond_0
    iget-object v0, p0, LCi;->h:LX46;

    iput-object p1, v0, LX46;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, LX46;->d:Z

    invoke-virtual {p0}, LCi;->z()V

    return-void
.end method

.method public x(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, LCi;->h:LX46;

    if-nez v0, :cond_0

    new-instance v0, LX46;

    invoke-direct {v0}, LX46;-><init>()V

    iput-object v0, p0, LCi;->h:LX46;

    :cond_0
    iget-object v0, p0, LCi;->h:LX46;

    iput-object p1, v0, LX46;->b:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, LX46;->c:Z

    invoke-virtual {p0}, LCi;->z()V

    return-void
.end method

.method public final y(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-nez p5, :cond_a

    if-eqz p6, :cond_0

    goto :goto_7

    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    if-eqz p4, :cond_f

    :cond_1
    iget-object p5, p0, LCi;->a:Landroid/widget/TextView;

    invoke-static {p5}, LCi$c;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    aget-object p6, p5, v2

    if-nez p6, :cond_7

    aget-object v4, p5, v3

    if-eqz v4, :cond_2

    goto :goto_4

    :cond_2
    iget-object p5, p0, LCi;->a:Landroid/widget/TextView;

    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    iget-object p6, p0, LCi;->a:Landroid/widget/TextView;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    aget-object p1, p5, v2

    :goto_0
    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    aget-object p2, p5, v1

    :goto_1
    if-eqz p3, :cond_5

    goto :goto_2

    :cond_5
    aget-object p3, p5, v3

    :goto_2
    if-eqz p4, :cond_6

    goto :goto_3

    :cond_6
    aget-object p4, p5, v0

    :goto_3
    invoke-virtual {p6, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_c

    :cond_7
    :goto_4
    iget-object p1, p0, LCi;->a:Landroid/widget/TextView;

    if-eqz p2, :cond_8

    goto :goto_5

    :cond_8
    aget-object p2, p5, v1

    :goto_5
    aget-object p3, p5, v3

    if-eqz p4, :cond_9

    goto :goto_6

    :cond_9
    aget-object p4, p5, v0

    :goto_6
    invoke-static {p1, p6, p2, p3, p4}, LCi$c;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_a
    :goto_7
    iget-object p1, p0, LCi;->a:Landroid/widget/TextView;

    invoke-static {p1}, LCi$c;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object p3, p0, LCi;->a:Landroid/widget/TextView;

    if-eqz p5, :cond_b

    goto :goto_8

    :cond_b
    aget-object p5, p1, v2

    :goto_8
    if-eqz p2, :cond_c

    goto :goto_9

    :cond_c
    aget-object p2, p1, v1

    :goto_9
    if-eqz p6, :cond_d

    goto :goto_a

    :cond_d
    aget-object p6, p1, v3

    :goto_a
    if-eqz p4, :cond_e

    goto :goto_b

    :cond_e
    aget-object p4, p1, v0

    :goto_b
    invoke-static {p3, p5, p2, p6, p4}, LCi$c;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_f
    :goto_c
    return-void
.end method

.method public final z()V
    .locals 1

    iget-object v0, p0, LCi;->h:LX46;

    iput-object v0, p0, LCi;->b:LX46;

    iput-object v0, p0, LCi;->c:LX46;

    iput-object v0, p0, LCi;->d:LX46;

    iput-object v0, p0, LCi;->e:LX46;

    iput-object v0, p0, LCi;->f:LX46;

    iput-object v0, p0, LCi;->g:LX46;

    return-void
.end method
