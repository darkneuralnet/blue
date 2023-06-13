.class public final Lza0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LwX1;)Lxa0;
    .locals 1

    instance-of v0, p0, Lya0;

    if-eqz v0, :cond_0

    check-cast p0, Lya0;

    invoke-virtual {p0}, Lya0;->d()Lxa0;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
