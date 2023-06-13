.class public final LsY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTm4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0003\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J(\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\u000b\u001a\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\u0008\u0010\r\u001a\u00020\u000cH\u0016R\u001d\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000e\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0016"
    }
    d2 = {
        "LsY0;",
        "LTm4;",
        "",
        "enabled",
        "selected",
        "LsP5;",
        "Lpm0;",
        "a",
        "(ZZLEt0;I)LsP5;",
        "",
        "other",
        "equals",
        "",
        "hashCode",
        "J",
        "selectedColor",
        "b",
        "unselectedColor",
        "c",
        "disabledColor",
        "<init>",
        "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LsY0;->a:J

    iput-wide p3, p0, LsY0;->b:J

    iput-wide p5, p0, LsY0;->c:J

    return-void
.end method

.method public synthetic constructor <init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LsY0;-><init>(JJJ)V

    return-void
.end method


# virtual methods
.method public a(ZZLEt0;I)LsP5;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "LEt0;",
            "I)",
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation

    const v0, 0x4a1d1c8a    # 2574114.5f

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    if-nez p1, :cond_1

    iget-wide v0, p0, LsY0;->c:J

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    iget-wide v0, p0, LsY0;->b:J

    goto :goto_0

    :cond_2
    iget-wide v0, p0, LsY0;->a:J

    goto :goto_0

    :goto_1
    const/4 p2, 0x0

    if-eqz p1, :cond_3

    const p1, -0x3ec07083

    invoke-interface {p3, p1}, LEt0;->F(I)V

    const/16 p1, 0x64

    const/4 p4, 0x6

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, p4, v0}, Lmf;->k(IILh91;ILjava/lang/Object;)Ltb6;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v7, 0x30

    const/4 v8, 0x4

    move-object v6, p3

    invoke-static/range {v2 .. v8}, LoB5;->a(JLlf;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object p1

    invoke-interface {p3}, LEt0;->Q()V

    goto :goto_2

    :cond_3
    const p1, -0x3ec0701a

    invoke-interface {p3, p1}, LEt0;->F(I)V

    invoke-static {v2, v3}, Lpm0;->i(J)Lpm0;

    move-result-object p1

    invoke-static {p1, p3, p2}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p1

    invoke-interface {p3}, LEt0;->Q()V

    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p3}, LEt0;->Q()V

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    const-class v2, LsY0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LsY0;

    iget-wide v2, p0, LsY0;->a:J

    iget-wide v4, p1, LsY0;->a:J

    invoke-static {v2, v3, v4, v5}, Lpm0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LsY0;->b:J

    iget-wide v4, p1, LsY0;->b:J

    invoke-static {v2, v3, v4, v5}, Lpm0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LsY0;->c:J

    iget-wide v4, p1, LsY0;->c:J

    invoke-static {v2, v3, v4, v5}, Lpm0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LsY0;->a:J

    invoke-static {v0, v1}, Lpm0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LsY0;->b:J

    invoke-static {v1, v2}, Lpm0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LsY0;->c:J

    invoke-static {v1, v2}, Lpm0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
