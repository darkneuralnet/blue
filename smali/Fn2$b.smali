.class public final LFn2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltn2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFn2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\"\u0010\u000c\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0004\u001a\u0004\u0008\u000b\u0010\u0006\"\u0004\u0008\u0003\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "LFn2$b;",
        "Ltn2;",
        "",
        "b",
        "I",
        "getMaxCurrentLineSpan",
        "()I",
        "a",
        "(I)V",
        "maxCurrentLineSpan",
        "c",
        "getMaxLineSpan",
        "maxLineSpan",
        "<init>",
        "()V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LFn2$b;

.field public static b:I

.field public static c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFn2$b;

    invoke-direct {v0}, LFn2$b;-><init>()V

    sput-object v0, LFn2$b;->a:LFn2$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    sput p1, LFn2$b;->b:I

    return-void
.end method

.method public b(I)V
    .locals 0

    sput p1, LFn2$b;->c:I

    return-void
.end method
