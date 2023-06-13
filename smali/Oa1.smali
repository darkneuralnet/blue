.class public final LOa1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW30;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R#\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0016"
    }
    d2 = {
        "LOa1;",
        "LW30;",
        "LxB5;",
        "c",
        "J",
        "h",
        "()J",
        "size",
        "Lpm2;",
        "d",
        "Lpm2;",
        "getLayoutDirection",
        "()Lpm2;",
        "layoutDirection",
        "Lg01;",
        "e",
        "Lg01;",
        "b",
        "()Lg01;",
        "density",
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


# static fields
.field public static final b:LOa1;

.field public static final c:J

.field public static final d:Lpm2;

.field public static final e:Lg01;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LOa1;

    invoke-direct {v0}, LOa1;-><init>()V

    sput-object v0, LOa1;->b:LOa1;

    sget-object v0, LxB5;->b:LxB5$a;

    invoke-virtual {v0}, LxB5$a;->a()J

    move-result-wide v0

    sput-wide v0, LOa1;->c:J

    sget-object v0, Lpm2;->b:Lpm2;

    sput-object v0, LOa1;->d:Lpm2;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v0}, Li01;->a(FF)Lg01;

    move-result-object v0

    sput-object v0, LOa1;->e:Lg01;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lg01;
    .locals 1

    sget-object v0, LOa1;->e:Lg01;

    return-object v0
.end method

.method public getLayoutDirection()Lpm2;
    .locals 1

    sget-object v0, LOa1;->d:Lpm2;

    return-object v0
.end method

.method public h()J
    .locals 2

    sget-wide v0, LOa1;->c:J

    return-wide v0
.end method
