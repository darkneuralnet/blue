.class public Lu26;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lx26;)Lv26;
    .locals 2

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v0

    const-class v1, LAZ8;

    invoke-virtual {v0, v1}, LyU2;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAZ8;

    invoke-virtual {v0, p0}, LAZ8;->a(Lx26;)Lv26;

    move-result-object p0

    return-object p0
.end method
