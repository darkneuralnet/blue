.class public final Lvv2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvv2$b;,
        Lvv2$a;
    }
.end annotation


# static fields
.field public static final b:Lvv2;


# instance fields
.field public final a:Lxv2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Locale;

    invoke-static {v0}, Lvv2;->a([Ljava/util/Locale;)Lvv2;

    move-result-object v0

    sput-object v0, Lvv2;->b:Lvv2;

    return-void
.end method

.method public constructor <init>(Lxv2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvv2;->a:Lxv2;

    return-void
.end method

.method public static varargs a([Ljava/util/Locale;)Lvv2;
    .locals 0

    invoke-static {p0}, Lvv2$b;->a([Ljava/util/Locale;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, Lvv2;->j(Landroid/os/LocaleList;)Lvv2;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Lvv2;
    .locals 4

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, ","

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    new-array v1, v0, [Ljava/util/Locale;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, Lvv2$a;->a(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lvv2;->a([Ljava/util/Locale;)Lvv2;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    invoke-static {}, Lvv2;->f()Lvv2;

    move-result-object p0

    return-object p0
.end method

.method public static d()Lvv2;
    .locals 1

    invoke-static {}, Lvv2$b;->b()Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, Lvv2;->j(Landroid/os/LocaleList;)Lvv2;

    move-result-object v0

    return-object v0
.end method

.method public static e()Lvv2;
    .locals 1

    invoke-static {}, Lvv2$b;->c()Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, Lvv2;->j(Landroid/os/LocaleList;)Lvv2;

    move-result-object v0

    return-object v0
.end method

.method public static f()Lvv2;
    .locals 1

    sget-object v0, Lvv2;->b:Lvv2;

    return-object v0
.end method

.method public static j(Landroid/os/LocaleList;)Lvv2;
    .locals 2

    new-instance v0, Lvv2;

    new-instance v1, Lyv2;

    invoke-direct {v1, p0}, Lyv2;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lvv2;-><init>(Lxv2;)V

    return-object v0
.end method


# virtual methods
.method public c(I)Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lvv2;->a:Lxv2;

    invoke-interface {v0, p1}, Lxv2;->get(I)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lvv2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvv2;->a:Lxv2;

    check-cast p1, Lvv2;

    iget-object p1, p1, Lvv2;->a:Lxv2;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lvv2;->a:Lxv2;

    invoke-interface {v0}, Lxv2;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lvv2;->a:Lxv2;

    invoke-interface {v0}, Lxv2;->size()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lvv2;->a:Lxv2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvv2;->a:Lxv2;

    invoke-interface {v0}, Lxv2;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvv2;->a:Lxv2;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
