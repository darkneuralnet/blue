.class public final Lsb5$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsb5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:LPM2;

.field public b:Z


# direct methods
.method public constructor <init>(LPM2;)V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    iput-object p1, p0, Lsb5$b;->a:LPM2;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lsb5$b;->b:Z

    return-void
.end method

.method public constructor <init>(Lsb5$b;)V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    iget-object v0, p1, Lsb5$b;->a:LPM2;

    invoke-virtual {v0}, LPM2;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, LPM2;

    iput-object v0, p0, Lsb5$b;->a:LPM2;

    iget-boolean p1, p1, Lsb5$b;->b:Z

    iput-boolean p1, p0, Lsb5$b;->b:Z

    return-void
.end method


# virtual methods
.method public a()Lsb5;
    .locals 3

    new-instance v0, Lsb5;

    new-instance v1, Lsb5$b;

    invoke-direct {v1, p0}, Lsb5$b;-><init>(Lsb5$b;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsb5;-><init>(Lsb5$b;Lsb5$a;)V

    return-object v0
.end method

.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p0}, Lsb5$b;->a()Lsb5;

    move-result-object v0

    return-object v0
.end method
