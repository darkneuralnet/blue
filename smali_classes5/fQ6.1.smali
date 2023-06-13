.class public final LfQ6;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>(LfQ6;)V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    if-eqz p1, :cond_0

    iget v0, p1, LfQ6;->a:I

    iput v0, p0, LfQ6;->a:I

    iget p1, p1, LfQ6;->b:I

    iput p1, p0, LfQ6;->b:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    iget v0, p0, LfQ6;->a:I

    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, LgQ6;

    invoke-direct {v0, p0}, LgQ6;-><init>(LfQ6;)V

    return-object v0
.end method
