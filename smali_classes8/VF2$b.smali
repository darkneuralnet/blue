.class public LVF2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVF2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:LSF2;

.field public h:Landroid/content/Context;

.field public i:Lxf1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LVF2$b;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, LVF2$b;->d:Z

    iput-boolean v0, p0, LVF2$b;->f:Z

    sget-object v0, Lxf1;->b:Lxf1;

    iput-object v0, p0, LVF2$b;->i:Lxf1;

    iput-object p1, p0, LVF2$b;->h:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(LVF2$b;)I
    .locals 0

    iget p0, p0, LVF2$b;->a:I

    return p0
.end method

.method public static synthetic b(LVF2$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LVF2$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(LVF2$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LVF2$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic d(LVF2$b;)Z
    .locals 0

    iget-boolean p0, p0, LVF2$b;->d:Z

    return p0
.end method

.method public static synthetic e(LVF2$b;)Z
    .locals 0

    iget-boolean p0, p0, LVF2$b;->f:Z

    return p0
.end method

.method public static synthetic f(LVF2$b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LVF2$b;->h:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic g(LVF2$b;)LSF2;
    .locals 0

    iget-object p0, p0, LVF2$b;->g:LSF2;

    return-object p0
.end method

.method public static synthetic h(LVF2$b;)Z
    .locals 0

    iget-boolean p0, p0, LVF2$b;->e:Z

    return p0
.end method

.method public static synthetic i(LVF2$b;)Lxf1;
    .locals 0

    iget-object p0, p0, LVF2$b;->i:Lxf1;

    return-object p0
.end method


# virtual methods
.method public j()LVF2;
    .locals 2

    new-instance v0, LVF2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LVF2;-><init>(LVF2$b;LVF2$a;)V

    return-object v0
.end method

.method public k(Z)LVF2$b;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, LVF2$b;->f:Z

    return-object p0
.end method

.method public l(Ljava/lang/String;)LVF2$b;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            max = 0x24L
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Llib/android/paypal/com/magnessdk/InvalidInputException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x24

    if-gt v0, v1, :cond_0

    iput-object p1, p0, LVF2$b;->b:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Llib/android/paypal/com/magnessdk/InvalidInputException;

    sget-object v0, LUL6;->d:LUL6;

    invoke-virtual {v0}, LUL6;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Llib/android/paypal/com/magnessdk/InvalidInputException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Lxf1;)LVF2$b;
    .locals 0
    .param p1    # Lxf1;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iput-object p1, p0, LVF2$b;->i:Lxf1;

    return-object p0
.end method

.method public n(LWF2;)LVF2$b;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p1}, LWF2;->a()I

    move-result p1

    iput p1, p0, LVF2$b;->a:I

    return-object p0
.end method
