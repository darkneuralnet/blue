.class public final synthetic LKH1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Ljava/time/Instant;)J
    .locals 2

    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v0

    return-wide v0
.end method
