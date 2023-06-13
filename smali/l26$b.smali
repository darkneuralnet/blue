.class public final Ll26$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll26;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll26$b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0081@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0014\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0088\u0001\u0005\u0092\u0001\u00020\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0008"
    }
    d2 = {
        "Ll26$b;",
        "",
        "",
        "f",
        "(I)I",
        "value",
        "d",
        "a",
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
.field public static final a:Ll26$b$a;

.field public static final b:I

.field public static final c:I

.field public static final d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll26$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll26$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll26$b;->a:Ll26$b$a;

    const/4 v0, 0x1

    invoke-static {v0}, Ll26$b;->d(I)I

    move-result v0

    sput v0, Ll26$b;->b:I

    const/4 v0, 0x2

    invoke-static {v0}, Ll26$b;->d(I)I

    move-result v0

    sput v0, Ll26$b;->c:I

    const/4 v0, 0x3

    invoke-static {v0}, Ll26$b;->d(I)I

    move-result v0

    sput v0, Ll26$b;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Ll26$b;->c:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, Ll26$b;->b:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Ll26$b;->d:I

    return v0
.end method

.method public static d(I)I
    .locals 0

    return p0
.end method

.method public static final e(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static f(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method
