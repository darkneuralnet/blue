.class public final LZ21$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ21;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\u0008\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003J)\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0008\"\u0004\u0008\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ.\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\u0008\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "LZ21$a;",
        "",
        "T",
        "LWX;",
        "currentOpMode",
        "LMt2;",
        "b",
        "value",
        "LAT5;",
        "c",
        "(LWX;Ljava/lang/Object;)LAT5;",
        "",
        "errorCode",
        "",
        "throwable",
        "Lvg1;",
        "a",
        "<init>",
        "()V",
        "interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic a:LZ21$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ21$a;

    invoke-direct {v0}, LZ21$a;-><init>()V

    sput-object v0, LZ21$a;->a:LZ21$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic createError$default(LZ21$a;LWX;ILjava/lang/Throwable;ILjava/lang/Object;)Lvg1;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LZ21$a;->a(LWX;ILjava/lang/Throwable;)Lvg1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LWX;ILjava/lang/Throwable;)Lvg1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LWX;",
            "I",
            "Ljava/lang/Throwable;",
            ")",
            "Lvg1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "currentOpMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvg1;

    invoke-direct {v0, p1, p2, p3}, Lvg1;-><init>(LWX;ILjava/lang/Throwable;)V

    return-object v0
.end method

.method public final b(LWX;)LMt2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LWX;",
            ")",
            "LMt2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "currentOpMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMt2;

    invoke-direct {v0, p1}, LMt2;-><init>(LWX;)V

    return-object v0
.end method

.method public final c(LWX;Ljava/lang/Object;)LAT5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LWX;",
            "TT;)",
            "LAT5<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "currentOpMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LAT5;

    invoke-direct {v0, p1, p2}, LAT5;-><init>(LWX;Ljava/lang/Object;)V

    return-object v0
.end method
