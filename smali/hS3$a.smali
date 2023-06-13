.class public LhS3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LhS3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Person;)LhS3;
    .locals 2

    new-instance v0, LhS3$b;

    invoke-direct {v0}, LhS3$b;-><init>()V

    invoke-static {p0}, LeS3;->a(Landroid/app/Person;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, LhS3$b;->f(Ljava/lang/CharSequence;)LhS3$b;

    move-result-object v0

    invoke-static {p0}, LfS3;->a(Landroid/app/Person;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p0}, LfS3;->a(Landroid/app/Person;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/graphics/drawable/IconCompat;->a(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, LhS3$b;->c(Landroidx/core/graphics/drawable/IconCompat;)LhS3$b;

    move-result-object v0

    invoke-static {p0}, LgS3;->a(Landroid/app/Person;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LhS3$b;->g(Ljava/lang/String;)LhS3$b;

    move-result-object v0

    invoke-static {p0}, LTR3;->a(Landroid/app/Person;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LhS3$b;->e(Ljava/lang/String;)LhS3$b;

    move-result-object v0

    invoke-static {p0}, LUR3;->a(Landroid/app/Person;)Z

    move-result v1

    invoke-virtual {v0, v1}, LhS3$b;->b(Z)LhS3$b;

    move-result-object v0

    invoke-static {p0}, LVR3;->a(Landroid/app/Person;)Z

    move-result p0

    invoke-virtual {v0, p0}, LhS3$b;->d(Z)LhS3$b;

    move-result-object p0

    invoke-virtual {p0}, LhS3$b;->a()LhS3;

    move-result-object p0

    return-object p0
.end method

.method public static b(LhS3;)Landroid/app/Person;
    .locals 2

    invoke-static {}, LXR3;->a()V

    invoke-static {}, LWR3;->a()Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LhS3;->c()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, LSR3;->a(Landroid/app/Person$Builder;Ljava/lang/CharSequence;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LhS3;->a()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LhS3;->a()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->r()Landroid/graphics/drawable/Icon;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, LYR3;->a(Landroid/app/Person$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LhS3;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LZR3;->a(Landroid/app/Person$Builder;Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LhS3;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LaS3;->a(Landroid/app/Person$Builder;Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LhS3;->e()Z

    move-result v1

    invoke-static {v0, v1}, LbS3;->a(Landroid/app/Person$Builder;Z)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LhS3;->f()Z

    move-result p0

    invoke-static {v0, p0}, LcS3;->a(Landroid/app/Person$Builder;Z)Landroid/app/Person$Builder;

    move-result-object p0

    invoke-static {p0}, LdS3;->a(Landroid/app/Person$Builder;)Landroid/app/Person;

    move-result-object p0

    return-object p0
.end method
