.class public final LJm2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJq6;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJm2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u001d\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0004\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0011"
    }
    d2 = {
        "Jm2$b",
        "LJq6;",
        "",
        "d",
        "()J",
        "longPressTimeoutMillis",
        "c",
        "doubleTapTimeoutMillis",
        "a",
        "doubleTapMinTimeMillis",
        "",
        "b",
        "()F",
        "touchSlop",
        "Lo61;",
        "e",
        "minimumTouchTargetSize",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    const-wide/16 v0, 0x28

    return-wide v0
.end method

.method public b()F
    .locals 1

    const/high16 v0, 0x41800000    # 16.0f

    return v0
.end method

.method public c()J
    .locals 2

    const-wide/16 v0, 0x12c

    return-wide v0
.end method

.method public d()J
    .locals 2

    const-wide/16 v0, 0x190

    return-wide v0
.end method

.method public e()J
    .locals 2

    sget-object v0, Lo61;->b:Lo61$a;

    invoke-virtual {v0}, Lo61$a;->b()J

    move-result-wide v0

    return-wide v0
.end method
