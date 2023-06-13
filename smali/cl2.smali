.class public final Lcl2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcl2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000cB\u0014\u0008\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcl2;",
        "",
        "",
        "o",
        "(I)Ljava/lang/String;",
        "",
        "n",
        "(I)I",
        "other",
        "",
        "l",
        "(ILjava/lang/Object;)Z",
        "a",
        "I",
        "value",
        "k",
        "b",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# static fields
.field public static final b:Lcl2$a;

.field public static final c:I

.field public static final d:I

.field public static final e:I

.field public static final f:I

.field public static final g:I

.field public static final h:I

.field public static final i:I

.field public static final j:I

.field public static final k:I


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcl2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcl2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcl2;->b:Lcl2$a;

    const/4 v0, 0x1

    invoke-static {v0}, Lcl2;->k(I)I

    move-result v0

    sput v0, Lcl2;->c:I

    const/4 v0, 0x2

    invoke-static {v0}, Lcl2;->k(I)I

    move-result v0

    sput v0, Lcl2;->d:I

    const/4 v0, 0x3

    invoke-static {v0}, Lcl2;->k(I)I

    move-result v0

    sput v0, Lcl2;->e:I

    const/4 v0, 0x4

    invoke-static {v0}, Lcl2;->k(I)I

    move-result v0

    sput v0, Lcl2;->f:I

    const/4 v0, 0x5

    invoke-static {v0}, Lcl2;->k(I)I

    move-result v0

    sput v0, Lcl2;->g:I

    const/4 v0, 0x6

    invoke-static {v0}, Lcl2;->k(I)I

    move-result v0

    sput v0, Lcl2;->h:I

    const/4 v0, 0x7

    invoke-static {v0}, Lcl2;->k(I)I

    move-result v0

    sput v0, Lcl2;->i:I

    const/16 v0, 0x8

    invoke-static {v0}, Lcl2;->k(I)I

    move-result v0

    sput v0, Lcl2;->j:I

    const/16 v0, 0x9

    invoke-static {v0}, Lcl2;->k(I)I

    move-result v0

    sput v0, Lcl2;->k:I

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcl2;->a:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lcl2;->d:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, Lcl2;->k:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Lcl2;->h:I

    return v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, Lcl2;->e:I

    return v0
.end method

.method public static final synthetic e()I
    .locals 1

    sget v0, Lcl2;->j:I

    return v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, Lcl2;->i:I

    return v0
.end method

.method public static final synthetic g()I
    .locals 1

    sget v0, Lcl2;->f:I

    return v0
.end method

.method public static final synthetic h()I
    .locals 1

    sget v0, Lcl2;->c:I

    return v0
.end method

.method public static final synthetic i()I
    .locals 1

    sget v0, Lcl2;->g:I

    return v0
.end method

.method public static final synthetic j(I)Lcl2;
    .locals 1

    new-instance v0, Lcl2;

    invoke-direct {v0, p0}, Lcl2;-><init>(I)V

    return-object v0
.end method

.method public static k(I)I
    .locals 0

    return p0
.end method

.method public static l(ILjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcl2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcl2;

    invoke-virtual {p1}, Lcl2;->p()I

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final m(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static n(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static o(I)Ljava/lang/String;
    .locals 1

    sget v0, Lcl2;->c:I

    invoke-static {p0, v0}, Lcl2;->m(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Text"

    goto :goto_0

    :cond_0
    sget v0, Lcl2;->d:I

    invoke-static {p0, v0}, Lcl2;->m(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Ascii"

    goto :goto_0

    :cond_1
    sget v0, Lcl2;->e:I

    invoke-static {p0, v0}, Lcl2;->m(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "Number"

    goto :goto_0

    :cond_2
    sget v0, Lcl2;->f:I

    invoke-static {p0, v0}, Lcl2;->m(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "Phone"

    goto :goto_0

    :cond_3
    sget v0, Lcl2;->g:I

    invoke-static {p0, v0}, Lcl2;->m(II)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p0, "Uri"

    goto :goto_0

    :cond_4
    sget v0, Lcl2;->h:I

    invoke-static {p0, v0}, Lcl2;->m(II)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p0, "Email"

    goto :goto_0

    :cond_5
    sget v0, Lcl2;->i:I

    invoke-static {p0, v0}, Lcl2;->m(II)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string p0, "Password"

    goto :goto_0

    :cond_6
    sget v0, Lcl2;->j:I

    invoke-static {p0, v0}, Lcl2;->m(II)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string p0, "NumberPassword"

    goto :goto_0

    :cond_7
    sget v0, Lcl2;->k:I

    invoke-static {p0, v0}, Lcl2;->m(II)Z

    move-result p0

    if-eqz p0, :cond_8

    const-string p0, "Decimal"

    goto :goto_0

    :cond_8
    const-string p0, "Invalid"

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Lcl2;->a:I

    invoke-static {v0, p1}, Lcl2;->l(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcl2;->a:I

    invoke-static {v0}, Lcl2;->n(I)I

    move-result v0

    return v0
.end method

.method public final synthetic p()I
    .locals 1

    iget v0, p0, Lcl2;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcl2;->a:I

    invoke-static {v0}, Lcl2;->o(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
