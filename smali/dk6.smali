.class public final Ldk6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000\"\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\t8\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u000f8\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u000b\u001a\u0004\u0008\u0010\u0010\r\"\u001a\u0010\u0014\u001a\u00020\u00128\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u0013\u0010\r\"\u001a\u0010\u0019\u001a\u00020\u00158\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u00020\u001a8\u0006\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u000b\u001a\u0004\u0008\n\u0010\r\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "",
        "pathStr",
        "",
        "LpJ3;",
        "a",
        "Ljava/util/List;",
        "e",
        "()Ljava/util/List;",
        "EmptyPath",
        "LLS5;",
        "b",
        "I",
        "c",
        "()I",
        "DefaultStrokeLineCap",
        "LNS5;",
        "d",
        "DefaultStrokeLineJoin",
        "LLW;",
        "getDefaultTintBlendMode",
        "DefaultTintBlendMode",
        "Lpm0;",
        "J",
        "getDefaultTintColor",
        "()J",
        "DefaultTintColor",
        "LjJ3;",
        "f",
        "DefaultFillType",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LpJ3;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:J

.field public static final f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, Ldk6;->a:Ljava/util/List;

    sget-object v0, LLS5;->b:LLS5$a;

    invoke-virtual {v0}, LLS5$a;->a()I

    move-result v0

    sput v0, Ldk6;->b:I

    sget-object v0, LNS5;->b:LNS5$a;

    invoke-virtual {v0}, LNS5$a;->b()I

    move-result v0

    sput v0, Ldk6;->c:I

    sget-object v0, LLW;->b:LLW$a;

    invoke-virtual {v0}, LLW$a;->z()I

    move-result v0

    sput v0, Ldk6;->d:I

    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->f()J

    move-result-wide v0

    sput-wide v0, Ldk6;->e:J

    sget-object v0, LjJ3;->b:LjJ3$a;

    invoke-virtual {v0}, LjJ3$a;->b()I

    move-result v0

    sput v0, Ldk6;->f:I

    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "LpJ3;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Ldk6;->a:Ljava/util/List;

    goto :goto_0

    :cond_0
    new-instance v0, LsJ3;

    invoke-direct {v0}, LsJ3;-><init>()V

    invoke-virtual {v0, p0}, LsJ3;->p(Ljava/lang/String;)LsJ3;

    move-result-object p0

    invoke-virtual {p0}, LsJ3;->C()Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final b()I
    .locals 1

    sget v0, Ldk6;->f:I

    return v0
.end method

.method public static final c()I
    .locals 1

    sget v0, Ldk6;->b:I

    return v0
.end method

.method public static final d()I
    .locals 1

    sget v0, Ldk6;->c:I

    return v0
.end method

.method public static final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LpJ3;",
            ">;"
        }
    .end annotation

    sget-object v0, Ldk6;->a:Ljava/util/List;

    return-object v0
.end method
