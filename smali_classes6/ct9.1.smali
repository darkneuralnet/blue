.class public final Lct9;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LG29;)LKr9;
    .locals 2

    invoke-static {}, LZs9;->a()Ljava/time/Instant;

    move-result-object p0

    invoke-static {p0}, Lat9;->a(Ljava/time/Instant;)J

    move-result-wide v0

    invoke-static {p0}, Lbt9;->a(Ljava/time/Instant;)I

    move-result p0

    invoke-static {v0, v1, p0}, Lgt9;->d(JI)LKr9;

    move-result-object p0

    return-object p0
.end method
