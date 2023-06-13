.class public final enum LYx2;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LYx2;",
        ">;",
        "Lco/bird/android/widget/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B+\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0008\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u0007R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\n\u001a\u0004\u0008\u000e\u0010\u0007j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "LYx2;",
        "",
        "Lco/bird/android/widget/d;",
        "",
        "b",
        "I",
        "a",
        "()Ljava/lang/Integer;",
        "text",
        "c",
        "Ljava/lang/Integer;",
        "i",
        "subText",
        "d",
        "getIcon",
        "icon",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V",
        "e",
        "f",
        "filters_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum e:LYx2;

.field public static final enum f:LYx2;

.field public static final synthetic g:[LYx2;


# instance fields
.field public final b:I

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v6, LYx2;

    const-string v1, "AND"

    const/4 v2, 0x0

    sget v3, Lnl4;->and_capitalized:I

    sget v0, Lnl4;->and_filter_description:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v0, Lrg4;->ic_filter_and:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LYx2;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V

    sput-object v6, LYx2;->e:LYx2;

    new-instance v0, LYx2;

    const-string v8, "OR"

    const/4 v9, 0x1

    sget v10, Lnl4;->or_capitalized:I

    sget v1, Lnl4;->or_filter_description:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    sget v1, Lrg4;->ic_filter_or:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LYx2;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V

    sput-object v0, LYx2;->f:LYx2;

    invoke-static {}, LYx2;->f()[LYx2;

    move-result-object v0

    sput-object v0, LYx2;->g:[LYx2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LYx2;->b:I

    iput-object p4, p0, LYx2;->c:Ljava/lang/Integer;

    iput-object p5, p0, LYx2;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static final synthetic f()[LYx2;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LYx2;

    const/4 v1, 0x0

    sget-object v2, LYx2;->e:LYx2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LYx2;->f:LYx2;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LYx2;
    .locals 1

    const-class v0, LYx2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LYx2;

    return-object p0
.end method

.method public static values()[LYx2;
    .locals 1

    sget-object v0, LYx2;->g:[LYx2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYx2;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, LYx2;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->a(Lco/bird/android/widget/d;)Z

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->e(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->f(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->j(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->h(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getColor()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->b(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getIcon()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LYx2;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public h()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->d(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LYx2;->c:Ljava/lang/Integer;

    return-object v0
.end method
