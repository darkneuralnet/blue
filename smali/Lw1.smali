.class public LLw1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLw1$c;,
        LLw1$a;,
        LLw1$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/os/CancellationSignal;[LLw1$b;)Landroid/graphics/Typeface;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, LJb6;->b(Landroid/content/Context;Landroid/os/CancellationSignal;[LLw1$b;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/os/CancellationSignal;Lzw1;)LLw1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    invoke-static {p0, p2, p1}, Lyw1;->e(Landroid/content/Context;Lzw1;Landroid/os/CancellationSignal;)LLw1$a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Lzw1;IZILandroid/os/Handler;LLw1$c;)Landroid/graphics/Typeface;
    .locals 1

    new-instance v0, LP80;

    invoke-direct {v0, p6, p5}, LP80;-><init>(LLw1$c;Landroid/os/Handler;)V

    if-eqz p3, :cond_0

    invoke-static {p0, p1, v0, p2, p4}, LCw1;->e(Landroid/content/Context;Lzw1;LP80;II)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p3, 0x0

    invoke-static {p0, p1, p2, p3, v0}, LCw1;->d(Landroid/content/Context;Lzw1;ILjava/util/concurrent/Executor;LP80;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method
