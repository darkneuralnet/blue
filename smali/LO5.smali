.class public final LLO5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLO5$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0014\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0007"
    }
    d2 = {
        "LLO5;",
        "",
        "",
        "value",
        "b",
        "(I)I",
        "a",
        "animation-core_release"
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
.field public static final a:LLO5$a;

.field public static final b:I

.field public static final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LLO5$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LLO5$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LLO5;->a:LLO5$a;

    const/4 v0, -0x1

    invoke-static {v0}, LLO5;->b(I)I

    move-result v0

    sput v0, LLO5;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, LLO5;->b(I)I

    move-result v0

    sput v0, LLO5;->c:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LLO5;->b:I

    return v0
.end method

.method public static b(I)I
    .locals 0

    return p0
.end method
