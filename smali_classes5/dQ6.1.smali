.class public final LdQ6;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# static fields
.field public static final a:LdQ6;

.field public static final b:LaQ6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LdQ6;

    invoke-direct {v0}, LdQ6;-><init>()V

    sput-object v0, LdQ6;->a:LdQ6;

    new-instance v0, LaQ6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LaQ6;-><init>(LYP6;)V

    sput-object v0, LdQ6;->b:LaQ6;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()LdQ6;
    .locals 1

    sget-object v0, LdQ6;->a:LdQ6;

    return-object v0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    sget-object v0, LdQ6;->b:LaQ6;

    return-object v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
