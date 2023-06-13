.class public final LPC0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\" \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\n\u0012\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0010"
    }
    d2 = {
        "Lk61;",
        "size",
        "LOC0;",
        "c",
        "(F)LOC0;",
        "",
        "a",
        "",
        "percent",
        "b",
        "LOC0;",
        "d",
        "()LOC0;",
        "getZeroCornerSize$annotations",
        "()V",
        "ZeroCornerSize",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LOC0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LPC0$a;

    invoke-direct {v0}, LPC0$a;-><init>()V

    sput-object v0, LPC0;->a:LOC0;

    return-void
.end method

.method public static final a(F)LOC0;
    .locals 1

    new-instance v0, LPa4;

    invoke-direct {v0, p0}, LPa4;-><init>(F)V

    return-object v0
.end method

.method public static final b(I)LOC0;
    .locals 1

    new-instance v0, LjQ3;

    int-to-float p0, p0

    invoke-direct {v0, p0}, LjQ3;-><init>(F)V

    return-object v0
.end method

.method public static final c(F)LOC0;
    .locals 2

    new-instance v0, Ll61;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll61;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final d()LOC0;
    .locals 1

    sget-object v0, LPC0;->a:LOC0;

    return-object v0
.end method
