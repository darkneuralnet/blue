.class public final LOU3$a$a;
.super LOU3$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOU3$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R$\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0014@RX\u0094\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR$\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u000c8\u0014@RX\u0094\u000e\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "LOU3$a$a;",
        "LOU3$a;",
        "LSC2;",
        "scope",
        "",
        "F",
        "Lpm2;",
        "<set-?>",
        "parentLayoutDirection",
        "Lpm2;",
        "k",
        "()Lpm2;",
        "",
        "parentWidth",
        "I",
        "l",
        "()I",
        "Lnm2;",
        "_coordinates",
        "Lnm2;",
        "LOm2;",
        "layoutDelegate",
        "LOm2;",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LOU3$a;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LOU3$a$a;-><init>()V

    return-void
.end method

.method public static final synthetic C(LOU3$a$a;LSC2;)Z
    .locals 0

    invoke-virtual {p0, p1}, LOU3$a$a;->F(LSC2;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic D(LOU3$a$a;)Lpm2;
    .locals 0

    invoke-virtual {p0}, LOU3$a$a;->k()Lpm2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(LOU3$a$a;)I
    .locals 0

    invoke-virtual {p0}, LOU3$a$a;->l()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final F(LSC2;)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-static {v1}, LOU3$a;->j(Lnm2;)V

    invoke-static {v1}, LOU3$a;->g(LOm2;)V

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, LSC2;->w1()Z

    move-result v2

    invoke-virtual {p1}, LSC2;->t1()LSC2;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LSC2;->w1()Z

    move-result v3

    if-ne v3, v4, :cond_1

    move v0, v4

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p1, v4}, LSC2;->z1(Z)V

    :cond_2
    invoke-virtual {p1}, LSC2;->r1()LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->X()LOm2;

    move-result-object v0

    invoke-static {v0}, LOU3$a;->g(LOm2;)V

    invoke-virtual {p1}, LSC2;->w1()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, LSC2;->x1()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, LSC2;->p1()Lnm2;

    move-result-object p1

    invoke-static {p1}, LOU3$a;->j(Lnm2;)V

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {v1}, LOU3$a;->j(Lnm2;)V

    :goto_1
    move v0, v2

    :goto_2
    return v0
.end method

.method public k()Lpm2;
    .locals 1

    invoke-static {}, LOU3$a;->c()Lpm2;

    move-result-object v0

    return-object v0
.end method

.method public l()I
    .locals 1

    invoke-static {}, LOU3$a;->e()I

    move-result v0

    return v0
.end method
