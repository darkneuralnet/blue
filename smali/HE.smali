.class public final LHE;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHE$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\t\u0008\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u000c\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0015"
    }
    d2 = {
        "LHE;",
        "",
        "",
        "g",
        "(F)Ljava/lang/String;",
        "",
        "f",
        "(F)I",
        "other",
        "",
        "d",
        "(FLjava/lang/Object;)Z",
        "",
        "a",
        "F",
        "getMultiplier",
        "()F",
        "multiplier",
        "c",
        "(F)F",
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
.field public static final b:LHE$a;

.field public static final c:F

.field public static final d:F

.field public static final e:F


# instance fields
.field public final a:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHE$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LHE$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LHE;->b:LHE$a;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, LHE;->c(F)F

    move-result v0

    sput v0, LHE;->c:F

    const/high16 v0, -0x41000000    # -0.5f

    invoke-static {v0}, LHE;->c(F)F

    move-result v0

    sput v0, LHE;->d:F

    const/4 v0, 0x0

    invoke-static {v0}, LHE;->c(F)F

    move-result v0

    sput v0, LHE;->e:F

    return-void
.end method

.method public synthetic constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LHE;->a:F

    return-void
.end method

.method public static final synthetic a()F
    .locals 1

    sget v0, LHE;->e:F

    return v0
.end method

.method public static final synthetic b(F)LHE;
    .locals 1

    new-instance v0, LHE;

    invoke-direct {v0, p0}, LHE;-><init>(F)V

    return-object v0
.end method

.method public static c(F)F
    .locals 0

    return p0
.end method

.method public static d(FLjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LHE;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LHE;

    invoke-virtual {p1}, LHE;->h()F

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final e(FF)Z
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static f(F)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    move-result p0

    return p0
.end method

.method public static g(F)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BaselineShift(multiplier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LHE;->a:F

    invoke-static {v0, p1}, LHE;->d(FLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic h()F
    .locals 1

    iget v0, p0, LHE;->a:F

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LHE;->a:F

    invoke-static {v0}, LHE;->f(F)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, LHE;->a:F

    invoke-static {v0}, LHE;->g(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
